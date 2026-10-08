package org.conscrypt;

import java.security.AlgorithmConstraints;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class SSLParametersImpl implements Cloneable {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static volatile SSLParametersImpl defaultParameters;
    private static volatile X509KeyManager defaultX509KeyManager;
    private static volatile X509TrustManager defaultX509TrustManager;
    private AlgorithmConstraints algorithmConstraints;
    ApplicationProtocolSelectorAdapter applicationProtocolSelector;
    byte[] applicationProtocols;
    boolean channelIdEnabled;
    private final ClientSessionContext clientSessionContext;
    private boolean client_mode;
    private boolean ctVerificationEnabled;
    private boolean enable_session_creation;
    String[] enabledCipherSuites;
    String[] enabledProtocols;
    private String endpointIdentificationAlgorithm;
    boolean isEnabledProtocolsFiltered;
    String[] namedGroups;
    private boolean need_client_auth;
    byte[] ocspResponse;
    private final PSKKeyManager pskKeyManager;
    byte[] sctExtension;
    private final ServerSessionContext serverSessionContext;
    private Collection<SNIMatcher> sniMatchers;
    private final Spake2PlusKeyManager spake2PlusKeyManager;
    private final Spake2PlusTrustManager spake2PlusTrustManager;
    private boolean useCipherSuitesOrder;
    boolean useSessionTickets;
    private Boolean useSni;
    private boolean want_client_auth;
    private final X509KeyManager x509KeyManager;
    private final X509TrustManager x509TrustManager;

    interface AliasChooser {
        String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr);

        String chooseServerAlias(X509KeyManager x509KeyManager, String str);
    }

    interface PSKCallbacks {
        String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str);

        String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager);

        SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2);
    }

    SSLParametersImpl(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom, ClientSessionContext clientSessionContext, ServerSessionContext serverSessionContext, String[] strArr) throws Throwable {
        this.client_mode = true;
        this.need_client_auth = false;
        this.want_client_auth = false;
        this.enable_session_creation = true;
        this.applicationProtocols = EmptyArray.BYTE;
        this.serverSessionContext = serverSessionContext;
        this.clientSessionContext = clientSessionContext;
        if (keyManagerArr == null) {
            this.x509KeyManager = getDefaultX509KeyManager();
            this.pskKeyManager = null;
            this.spake2PlusKeyManager = null;
        } else {
            X509KeyManager x509KeyManagerFindFirstX509KeyManager = findFirstX509KeyManager(keyManagerArr);
            this.x509KeyManager = x509KeyManagerFindFirstX509KeyManager;
            PSKKeyManager pSKKeyManagerFindFirstPSKKeyManager = findFirstPSKKeyManager(keyManagerArr);
            this.pskKeyManager = pSKKeyManagerFindFirstPSKKeyManager;
            Spake2PlusKeyManager spake2PlusKeyManagerFindFirstSpake2PlusKeyManager = findFirstSpake2PlusKeyManager(keyManagerArr);
            this.spake2PlusKeyManager = spake2PlusKeyManagerFindFirstSpake2PlusKeyManager;
            if (spake2PlusKeyManagerFindFirstSpake2PlusKeyManager != null) {
                if (x509KeyManagerFindFirstX509KeyManager != null || pSKKeyManagerFindFirstPSKKeyManager != null) {
                    throw new KeyManagementException("Spake2PlusManagers should not be set with X509KeyManager, x509TrustManager or PSKKeyManager");
                }
                setUseClientMode(spake2PlusKeyManagerFindFirstSpake2PlusKeyManager.isClient());
            }
        }
        if (trustManagerArr == null) {
            this.x509TrustManager = getDefaultX509TrustManager();
            this.spake2PlusTrustManager = null;
        } else {
            X509TrustManager x509TrustManagerFindFirstX509TrustManager = findFirstX509TrustManager(trustManagerArr);
            this.x509TrustManager = x509TrustManagerFindFirstX509TrustManager;
            Spake2PlusTrustManager spake2PlusTrustManagerFindFirstSpake2PlusTrustManager = findFirstSpake2PlusTrustManager(trustManagerArr);
            this.spake2PlusTrustManager = spake2PlusTrustManagerFindFirstSpake2PlusTrustManager;
            if (spake2PlusTrustManagerFindFirstSpake2PlusTrustManager != null && x509TrustManagerFindFirstX509TrustManager != null) {
                throw new KeyManagementException("Spake2PlusTrustManager should not be set with X509TrustManager");
            }
        }
        if ((this.spake2PlusTrustManager != null) != (this.spake2PlusKeyManager != null)) {
            throw new KeyManagementException("Spake2PlusTrustManager and Spake2PlusKeyManager should be set together");
        }
        if (isSpake()) {
            this.enabledProtocols = new String[]{"TLSv1.3"};
        } else if (strArr == null) {
            this.enabledProtocols = (String[]) NativeCrypto.getDefaultProtocols().clone();
        } else {
            String[] strArrFilterFromProtocols = filterFromProtocols(strArr, Arrays.asList(!Platform.isTlsV1Filtered() ? new String[0] : new String[]{"SSLv3", "TLSv1", "TLSv1.1"}));
            this.isEnabledProtocolsFiltered = strArr.length != strArrFilterFromProtocols.length;
            this.enabledProtocols = (String[]) NativeCrypto.checkEnabledProtocols(strArrFilterFromProtocols).clone();
        }
        this.enabledCipherSuites = getDefaultCipherSuites((this.x509KeyManager == null && this.x509TrustManager == null) ? false : true, this.pskKeyManager != null, isSpake());
        if (isSpake()) {
            initSpake();
        }
    }

    private static X509KeyManager createDefaultX509KeyManager() throws KeyManagementException {
        try {
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(null, null);
            KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
            X509KeyManager x509KeyManagerFindFirstX509KeyManager = findFirstX509KeyManager(keyManagers);
            if (x509KeyManagerFindFirstX509KeyManager != null) {
                return x509KeyManagerFindFirstX509KeyManager;
            }
            throw new KeyManagementException("No X509KeyManager among default KeyManagers: " + Arrays.toString(keyManagers));
        } catch (KeyStoreException e15) {
            throw new KeyManagementException(e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new KeyManagementException(e16);
        } catch (UnrecoverableKeyException e17) {
            throw new KeyManagementException(e17);
        }
    }

    private static X509TrustManager createDefaultX509TrustManager() throws KeyManagementException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            X509TrustManager x509TrustManagerFindFirstX509TrustManager = findFirstX509TrustManager(trustManagers);
            if (x509TrustManagerFindFirstX509TrustManager != null) {
                return x509TrustManagerFindFirstX509TrustManager;
            }
            throw new KeyManagementException("No X509TrustManager in among default TrustManagers: " + Arrays.toString(trustManagers));
        } catch (KeyStoreException e15) {
            throw new KeyManagementException(e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new KeyManagementException(e16);
        }
    }

    private static String[] filterFromCipherSuites(String[] strArr, Set<String> set) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (!set.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    private static String[] filterFromProtocols(String[] strArr, List<String> list) {
        if (strArr.length == 1 && list.contains(strArr[0])) {
            return EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!list.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    private static PSKKeyManager findFirstPSKKeyManager(KeyManager[] keyManagerArr) {
        int length = keyManagerArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            KeyManager keyManager = keyManagerArr[i15];
            if (keyManager instanceof PSKKeyManager) {
                return (PSKKeyManager) keyManager;
            }
            if (keyManager != null) {
                try {
                    return DuckTypedPSKKeyManager.getInstance(keyManager);
                } catch (NoSuchMethodException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    private static Spake2PlusKeyManager findFirstSpake2PlusKeyManager(KeyManager[] keyManagerArr) {
        for (KeyManager keyManager : keyManagerArr) {
            if (keyManager instanceof Spake2PlusKeyManager) {
                return (Spake2PlusKeyManager) keyManager;
            }
        }
        return null;
    }

    private static Spake2PlusTrustManager findFirstSpake2PlusTrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof Spake2PlusTrustManager) {
                return (Spake2PlusTrustManager) trustManager;
            }
        }
        return null;
    }

    private static X509KeyManager findFirstX509KeyManager(KeyManager[] keyManagerArr) {
        for (KeyManager keyManager : keyManagerArr) {
            if (keyManager instanceof X509KeyManager) {
                return (X509KeyManager) keyManager;
            }
        }
        return null;
    }

    private static X509TrustManager findFirstX509TrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    static SSLParametersImpl getDefault() {
        SSLParametersImpl sSLParametersImpl = defaultParameters;
        if (sSLParametersImpl == null) {
            SSLParametersImpl sSLParametersImpl2 = new SSLParametersImpl(null, null, null, new ClientSessionContext(), new ServerSessionContext(), null);
            defaultParameters = sSLParametersImpl2;
            sSLParametersImpl = sSLParametersImpl2;
        }
        return (SSLParametersImpl) sSLParametersImpl.clone();
    }

    private static String[] getDefaultCipherSuites(boolean z15, boolean z16, boolean z17) {
        if (z15) {
            return z16 ? SSLUtils.concat(NativeCrypto.DEFAULT_PSK_CIPHER_SUITES, NativeCrypto.DEFAULT_X509_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"}) : SSLUtils.concat(NativeCrypto.DEFAULT_X509_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"});
        }
        return z16 ? SSLUtils.concat(NativeCrypto.DEFAULT_PSK_CIPHER_SUITES, new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"}) : new String[]{"TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};
    }

    private static X509KeyManager getDefaultX509KeyManager() throws KeyManagementException {
        X509KeyManager x509KeyManager = defaultX509KeyManager;
        if (x509KeyManager != null) {
            return x509KeyManager;
        }
        X509KeyManager x509KeyManagerCreateDefaultX509KeyManager = createDefaultX509KeyManager();
        defaultX509KeyManager = x509KeyManagerCreateDefaultX509KeyManager;
        return x509KeyManagerCreateDefaultX509KeyManager;
    }

    static X509TrustManager getDefaultX509TrustManager() throws KeyManagementException {
        X509TrustManager x509TrustManager = defaultX509TrustManager;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        X509TrustManager x509TrustManagerCreateDefaultX509TrustManager = createDefaultX509TrustManager();
        defaultX509TrustManager = x509TrustManagerCreateDefaultX509TrustManager;
        return x509TrustManagerCreateDefaultX509TrustManager;
    }

    private boolean isSniEnabledByDefault() {
        try {
            String property = System.getProperty("jsse.enableSNIExtension", "true");
            if ("true".equalsIgnoreCase(property)) {
                return true;
            }
            if ("false".equalsIgnoreCase(property)) {
                return false;
            }
            throw new RuntimeException("Can only set \"jsse.enableSNIExtension\" to \"true\" or \"false\"");
        } catch (SecurityException unused) {
            return true;
        }
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    SSLParametersImpl cloneWithSpake() {
        return new SSLParametersImpl(this.clientSessionContext, this.serverSessionContext, null, null, null, this.spake2PlusTrustManager, this.spake2PlusKeyManager, this);
    }

    SSLParametersImpl cloneWithTrustManager(X509TrustManager x509TrustManager) {
        return new SSLParametersImpl(this.clientSessionContext, this.serverSessionContext, this.x509KeyManager, this.pskKeyManager, x509TrustManager, null, null, this);
    }

    AlgorithmConstraints getAlgorithmConstraints() {
        return this.algorithmConstraints;
    }

    ApplicationProtocolSelectorAdapter getApplicationProtocolSelector() {
        return this.applicationProtocolSelector;
    }

    String[] getApplicationProtocols() {
        return SSLUtils.decodeProtocols(this.applicationProtocols);
    }

    ClientSessionContext getClientSessionContext() {
        return this.clientSessionContext;
    }

    boolean getEnableSessionCreation() {
        return this.enable_session_creation;
    }

    String[] getEnabledCipherSuites() {
        return Arrays.asList(this.enabledProtocols).contains("TLSv1.3") ? SSLUtils.concat(NativeCrypto.SUPPORTED_TLS_1_3_CIPHER_SUITES, this.enabledCipherSuites) : (String[]) this.enabledCipherSuites.clone();
    }

    String[] getEnabledProtocols() {
        return (String[]) this.enabledProtocols.clone();
    }

    String getEndpointIdentificationAlgorithm() {
        return this.endpointIdentificationAlgorithm;
    }

    String[] getNamedGroups() {
        String[] strArr = this.namedGroups;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    boolean getNeedClientAuth() {
        return this.need_client_auth;
    }

    byte[] getOCSPResponse() {
        return this.ocspResponse;
    }

    PSKKeyManager getPSKKeyManager() {
        return this.pskKeyManager;
    }

    Collection<SNIMatcher> getSNIMatchers() {
        if (this.sniMatchers == null) {
            return null;
        }
        return new ArrayList(this.sniMatchers);
    }

    ServerSessionContext getServerSessionContext() {
        return this.serverSessionContext;
    }

    AbstractSessionContext getSessionContext() {
        return this.client_mode ? this.clientSessionContext : this.serverSessionContext;
    }

    Spake2PlusKeyManager getSpake2PlusKeyManager() {
        return this.spake2PlusKeyManager;
    }

    boolean getUseCipherSuitesOrder() {
        return this.useCipherSuitesOrder;
    }

    boolean getUseClientMode() {
        return this.client_mode;
    }

    boolean getUseSni() {
        Boolean bool = this.useSni;
        return bool != null ? bool.booleanValue() : isSniEnabledByDefault();
    }

    boolean getWantClientAuth() {
        return this.want_client_auth;
    }

    X509KeyManager getX509KeyManager() {
        return this.x509KeyManager;
    }

    X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    void initSpake() throws Throwable {
        try {
            getSessionContext().initSpake(this);
        } catch (Exception e15) {
            throw new KeyManagementException("Spake initialization failed " + e15.getMessage());
        }
    }

    boolean isCTVerificationEnabled(String str) {
        if (str == null) {
            return false;
        }
        if (this.ctVerificationEnabled) {
            return true;
        }
        return Platform.isCTVerificationRequired(str);
    }

    boolean isSpake() {
        return this.spake2PlusKeyManager != null;
    }

    void setAlgorithmConstraints(AlgorithmConstraints algorithmConstraints) {
        this.algorithmConstraints = algorithmConstraints;
    }

    void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.applicationProtocolSelector = applicationProtocolSelectorAdapter;
    }

    void setApplicationProtocols(String[] strArr) {
        this.applicationProtocols = SSLUtils.encodeProtocols(strArr);
    }

    void setCTVerificationEnabled(boolean z15) {
        this.ctVerificationEnabled = z15;
    }

    void setEnableSessionCreation(boolean z15) {
        this.enable_session_creation = z15;
    }

    void setEnabledCipherSuites(String[] strArr) {
        this.enabledCipherSuites = NativeCrypto.checkEnabledCipherSuites(filterFromCipherSuites(strArr, NativeCrypto.SUPPORTED_TLS_1_3_CIPHER_SUITES_SET));
    }

    void setEnabledProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        if (isSpake()) {
            return;
        }
        String[] strArrFilterFromProtocols = filterFromProtocols(strArr, Arrays.asList(!Platform.isTlsV1Filtered() ? new String[0] : new String[]{"SSLv3", "TLSv1", "TLSv1.1"}));
        this.isEnabledProtocolsFiltered = strArr.length != strArrFilterFromProtocols.length;
        this.enabledProtocols = (String[]) NativeCrypto.checkEnabledProtocols(strArrFilterFromProtocols).clone();
    }

    void setEndpointIdentificationAlgorithm(String str) {
        this.endpointIdentificationAlgorithm = str;
    }

    void setNamedGroups(String[] strArr) {
        if (strArr == null) {
            this.namedGroups = null;
        } else {
            this.namedGroups = (String[]) strArr.clone();
        }
    }

    void setNeedClientAuth(boolean z15) {
        this.need_client_auth = z15;
        this.want_client_auth = false;
    }

    void setOCSPResponse(byte[] bArr) {
        this.ocspResponse = bArr;
    }

    void setSCTExtension(byte[] bArr) {
        this.sctExtension = bArr;
    }

    void setSNIMatchers(Collection<SNIMatcher> collection) {
        this.sniMatchers = collection != null ? new ArrayList(collection) : null;
    }

    void setUseCipherSuitesOrder(boolean z15) {
        this.useCipherSuitesOrder = z15;
    }

    void setUseClientMode(boolean z15) {
        this.client_mode = z15;
    }

    void setUseSessionTickets(boolean z15) {
        this.useSessionTickets = z15;
    }

    void setUseSni(boolean z15) {
        this.useSni = Boolean.valueOf(z15);
    }

    void setWantClientAuth(boolean z15) {
        this.want_client_auth = z15;
        this.need_client_auth = false;
    }

    private SSLParametersImpl(ClientSessionContext clientSessionContext, ServerSessionContext serverSessionContext, X509KeyManager x509KeyManager, PSKKeyManager pSKKeyManager, X509TrustManager x509TrustManager, Spake2PlusTrustManager spake2PlusTrustManager, Spake2PlusKeyManager spake2PlusKeyManager, SSLParametersImpl sSLParametersImpl) {
        this.client_mode = true;
        this.need_client_auth = false;
        this.want_client_auth = false;
        this.enable_session_creation = true;
        this.applicationProtocols = EmptyArray.BYTE;
        this.clientSessionContext = clientSessionContext;
        this.serverSessionContext = serverSessionContext;
        this.x509KeyManager = x509KeyManager;
        this.pskKeyManager = pSKKeyManager;
        this.x509TrustManager = x509TrustManager;
        this.spake2PlusKeyManager = spake2PlusKeyManager;
        this.spake2PlusTrustManager = spake2PlusTrustManager;
        String[] strArr = sSLParametersImpl.enabledProtocols;
        this.enabledProtocols = strArr == null ? null : (String[]) strArr.clone();
        this.isEnabledProtocolsFiltered = sSLParametersImpl.isEnabledProtocolsFiltered;
        String[] strArr2 = sSLParametersImpl.enabledCipherSuites;
        this.enabledCipherSuites = strArr2 == null ? null : (String[]) strArr2.clone();
        this.client_mode = sSLParametersImpl.client_mode;
        this.need_client_auth = sSLParametersImpl.need_client_auth;
        this.want_client_auth = sSLParametersImpl.want_client_auth;
        this.enable_session_creation = sSLParametersImpl.enable_session_creation;
        this.endpointIdentificationAlgorithm = sSLParametersImpl.endpointIdentificationAlgorithm;
        this.useCipherSuitesOrder = sSLParametersImpl.useCipherSuitesOrder;
        this.ctVerificationEnabled = sSLParametersImpl.ctVerificationEnabled;
        byte[] bArr = sSLParametersImpl.sctExtension;
        this.sctExtension = bArr == null ? null : (byte[]) bArr.clone();
        byte[] bArr2 = sSLParametersImpl.ocspResponse;
        this.ocspResponse = bArr2 == null ? null : (byte[]) bArr2.clone();
        byte[] bArr3 = sSLParametersImpl.applicationProtocols;
        this.applicationProtocols = bArr3 == null ? null : (byte[]) bArr3.clone();
        this.applicationProtocolSelector = sSLParametersImpl.applicationProtocolSelector;
        this.useSessionTickets = sSLParametersImpl.useSessionTickets;
        this.useSni = sSLParametersImpl.useSni;
        this.channelIdEnabled = sSLParametersImpl.channelIdEnabled;
        String[] strArr3 = sSLParametersImpl.namedGroups;
        this.namedGroups = strArr3 != null ? (String[]) strArr3.clone() : null;
    }
}
