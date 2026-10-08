package org.conscrypt;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Properties;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.io.IoUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class Conscrypt {
    private static final Version VERSION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f149621a = 0;

    public static class ProviderBuilder {
        private String defaultTlsProtocol;
        private boolean deprecatedTlsV1;
        private boolean enabledTlsV1;
        private String name;
        private boolean provideTrustManager;

        public Provider build() {
            return new OpenSSLProvider(this.name, this.provideTrustManager, this.defaultTlsProtocol, this.deprecatedTlsV1, this.enabledTlsV1);
        }

        public ProviderBuilder defaultTlsProtocol(String str) {
            this.defaultTlsProtocol = str;
            return this;
        }

        public ProviderBuilder isTlsV1Deprecated(boolean z15) {
            this.deprecatedTlsV1 = z15;
            return this;
        }

        public ProviderBuilder isTlsV1Enabled(boolean z15) {
            this.enabledTlsV1 = z15;
            return this;
        }

        @Deprecated
        public ProviderBuilder provideTrustManager() {
            return provideTrustManager(true);
        }

        public ProviderBuilder setName(String str) {
            this.name = str;
            return this;
        }

        private ProviderBuilder() {
            this.name = Platform.getDefaultProviderName();
            this.provideTrustManager = Platform.provideTrustManagerByDefault();
            this.defaultTlsProtocol = "TLSv1.3";
            this.deprecatedTlsV1 = Platform.isTlsV1Deprecated();
            this.enabledTlsV1 = Platform.isTlsV1Supported();
        }

        public ProviderBuilder provideTrustManager(boolean z15) {
            this.provideTrustManager = z15;
            return this;
        }
    }

    public static class Version {
        private final int major;
        private final int minor;
        private final int patch;

        public int major() {
            return this.major;
        }

        public int minor() {
            return this.minor;
        }

        public int patch() {
            return this.patch;
        }

        private Version(int i15, int i16, int i17) {
            this.major = i15;
            this.minor = i16;
            this.patch = i17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i15;
        int i16;
        InputStream resourceAsStream;
        int i17;
        int i18 = -1;
        InputStream inputStream = null;
        Object[] objArr = 0;
        try {
            resourceAsStream = Conscrypt.class.getResourceAsStream("conscrypt.properties");
            if (resourceAsStream != null) {
                try {
                    try {
                        Properties properties = new Properties();
                        properties.load(resourceAsStream);
                        i15 = Integer.parseInt(properties.getProperty("org.conscrypt.version.major", "-1"));
                        try {
                            i16 = Integer.parseInt(properties.getProperty("org.conscrypt.version.minor", "-1"));
                            try {
                                i17 = Integer.parseInt(properties.getProperty("org.conscrypt.version.patch", "-1"));
                                i18 = i15;
                            } catch (IOException unused) {
                                IoUtils.closeQuietly(resourceAsStream);
                                i17 = -1;
                                i18 = i15;
                            }
                        } catch (IOException unused2) {
                            i16 = -1;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = resourceAsStream;
                        IoUtils.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                    i15 = -1;
                    i16 = -1;
                }
            } else {
                i17 = -1;
                i16 = -1;
            }
            IoUtils.closeQuietly(resourceAsStream);
        } catch (IOException unused4) {
            i15 = -1;
            i16 = -1;
            resourceAsStream = null;
        } catch (Throwable th5) {
            th = th5;
        }
        if (i18 < 0 || i16 < 0 || i17 < 0) {
            VERSION = null;
        } else {
            VERSION = new Version(i18, i16, i17);
        }
    }

    private Conscrypt() {
    }

    public static void checkAvailability() {
        NativeCrypto.checkAvailability();
    }

    public static byte[] exportKeyingMaterial(SSLSocket sSLSocket, String str, byte[] bArr, int i15) {
        return toConscrypt(sSLSocket).exportKeyingMaterial(str, bArr, i15);
    }

    public static String getApplicationProtocol(SSLSocket sSLSocket) {
        if (isConscrypt(sSLSocket)) {
            return toConscrypt(sSLSocket).getApplicationProtocol();
        }
        if (sSLSocket.getClass().getName().contains("conscrypt")) {
            return invokeConscryptMethod(sSLSocket, "getApplicationProtocol");
        }
        throw new IllegalArgumentException("Not a conscrypt socket: " + sSLSocket.getClass().getName());
    }

    public static String[] getApplicationProtocols(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getChannelId();
    }

    public static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier(TrustManager trustManager) {
        return TrustManagerImpl.getDefaultHostnameVerifier();
    }

    public static X509TrustManager getDefaultX509TrustManager() {
        checkAvailability();
        return SSLParametersImpl.getDefaultX509TrustManager();
    }

    public static String getHostname(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostname();
    }

    public static String getHostnameOrIP(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getHostnameOrIP();
    }

    public static ConscryptHostnameVerifier getHostnameVerifier(TrustManager trustManager) {
        return toConscrypt(trustManager).getHostnameVerifier();
    }

    public static byte[] getTlsUnique(SSLSocket sSLSocket) {
        return toConscrypt(sSLSocket).getTlsUnique();
    }

    private static String invokeConscryptMethod(Object obj, String str) {
        try {
            return (String) obj.getClass().getMethod(str, null).invoke(obj, null);
        } catch (InvocationTargetException e15) {
            Throwable cause = e15.getCause();
            if ((cause instanceof SSLException) || (cause instanceof IOException)) {
                throw new IllegalArgumentException("Reflected method '" + str + "' threw a checked exception.", cause);
            }
            if (cause instanceof IllegalStateException) {
                throw ((IllegalStateException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Reflected method '" + str + "' threw an unexpected exception", cause);
        } catch (Exception e16) {
            throw new IllegalArgumentException("Failed reflection fallback for method '" + str + "' on class '" + obj.getClass().getName() + ", message: " + e16.getMessage(), e16);
        }
    }

    public static boolean isAvailable() {
        try {
            checkAvailability();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isBoringSslFIPSBuild() {
        try {
            return NativeCrypto.usesBoringSsl_FIPS_mode();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isConscrypt(Provider provider) {
        return provider instanceof OpenSSLProvider;
    }

    public static int maxEncryptedPacketLength() {
        return 16709;
    }

    public static int maxSealOverhead(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).maxSealOverhead();
    }

    public static SSLContextSpi newPreferredSSLContextSpi() {
        checkAvailability();
        return OpenSSLContextImpl.getPreferred();
    }

    public static Provider newProvider() {
        checkAvailability();
        return new OpenSSLProvider();
    }

    public static ProviderBuilder newProviderBuilder() {
        return new ProviderBuilder();
    }

    public static void setApplicationProtocolSelector(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLSocket).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLSocket sSLSocket, String[] strArr) {
        toConscrypt(sSLSocket).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLEngine sSLEngine, BufferAllocator bufferAllocator) {
        toConscrypt(sSLEngine).setBufferAllocator(bufferAllocator);
    }

    public static void setChannelIdEnabled(SSLSocket sSLSocket, boolean z15) {
        toConscrypt(sSLSocket).setChannelIdEnabled(z15);
    }

    public static void setChannelIdPrivateKey(SSLSocket sSLSocket, PrivateKey privateKey) {
        toConscrypt(sSLSocket).setChannelIdPrivateKey(privateKey);
    }

    public static void setClientSessionCache(SSLContext sSLContext, SSLClientSessionCache sSLClientSessionCache) {
        SSLSessionContext clientSessionContext = sSLContext.getClientSessionContext();
        if (clientSessionContext instanceof ClientSessionContext) {
            ((ClientSessionContext) clientSessionContext).setPersistentCache(sSLClientSessionCache);
            return;
        }
        throw new IllegalArgumentException("Not a conscrypt client context: " + clientSessionContext.getClass().getName());
    }

    public static void setDefaultBufferAllocator(BufferAllocator bufferAllocator) {
        ConscryptEngine.setDefaultBufferAllocator(bufferAllocator);
    }

    public static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        TrustManagerImpl.setDefaultHostnameVerifier(conscryptHostnameVerifier);
    }

    public static void setHandshakeListener(SSLEngine sSLEngine, HandshakeListener handshakeListener) {
        toConscrypt(sSLEngine).setHandshakeListener(handshakeListener);
    }

    public static void setHostname(SSLSocket sSLSocket, String str) {
        toConscrypt(sSLSocket).setHostname(str);
    }

    public static void setHostnameVerifier(TrustManager trustManager, ConscryptHostnameVerifier conscryptHostnameVerifier) {
        toConscrypt(trustManager).setHostnameVerifier(conscryptHostnameVerifier);
    }

    public static void setNamedGroups(SSLSocketFactory sSLSocketFactory, String[] strArr) {
        toConscrypt(sSLSocketFactory).setNamedGroups(strArr);
    }

    public static void setServerSessionCache(SSLContext sSLContext, SSLServerSessionCache sSLServerSessionCache) {
        SSLSessionContext serverSessionContext = sSLContext.getServerSessionContext();
        if (serverSessionContext instanceof ServerSessionContext) {
            ((ServerSessionContext) serverSessionContext).setPersistentCache(sSLServerSessionCache);
            return;
        }
        throw new IllegalArgumentException("Not a conscrypt client context: " + serverSessionContext.getClass().getName());
    }

    public static void setUseEngineSocket(SSLSocketFactory sSLSocketFactory, boolean z15) {
        toConscrypt(sSLSocketFactory).setUseEngineSocket(z15);
    }

    public static void setUseEngineSocketByDefault(boolean z15) {
        OpenSSLSocketFactoryImpl.setUseEngineSocketByDefault(z15);
        OpenSSLServerSocketFactoryImpl.setUseEngineSocketByDefault(z15);
    }

    public static void setUseSessionTickets(SSLSocket sSLSocket, boolean z15) {
        toConscrypt(sSLSocket).setUseSessionTickets(z15);
    }

    private static OpenSSLSocketFactoryImpl toConscrypt(SSLSocketFactory sSLSocketFactory) {
        if (isConscrypt(sSLSocketFactory)) {
            return (OpenSSLSocketFactoryImpl) sSLSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt socket factory: " + sSLSocketFactory.getClass().getName());
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, byteBufferArr2);
    }

    public static Version version() {
        return VERSION;
    }

    public static ConscryptHostnameVerifier wrapHostnameVerifier(final HostnameVerifier hostnameVerifier) {
        return new ConscryptHostnameVerifier() { // from class: org.conscrypt.Conscrypt.1
            @Override // org.conscrypt.ConscryptHostnameVerifier
            public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
                return hostnameVerifier.verify(str, sSLSession);
            }
        };
    }

    public static byte[] exportKeyingMaterial(SSLEngine sSLEngine, String str, byte[] bArr, int i15) {
        return toConscrypt(sSLEngine).exportKeyingMaterial(str, bArr, i15);
    }

    public static String[] getApplicationProtocols(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getApplicationProtocols();
    }

    public static byte[] getChannelId(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getChannelId();
    }

    public static String getHostname(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getHostname();
    }

    public static byte[] getTlsUnique(SSLEngine sSLEngine) {
        return toConscrypt(sSLEngine).getTlsUnique();
    }

    public static boolean isConscrypt(SSLContext sSLContext) {
        return sSLContext.getProvider() instanceof OpenSSLProvider;
    }

    public static void setApplicationProtocolSelector(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
        toConscrypt(sSLEngine).setApplicationProtocolSelector(applicationProtocolSelector);
    }

    public static void setApplicationProtocols(SSLEngine sSLEngine, String[] strArr) {
        toConscrypt(sSLEngine).setApplicationProtocols(strArr);
    }

    public static void setBufferAllocator(SSLSocket sSLSocket, BufferAllocator bufferAllocator) {
        AbstractConscryptSocket conscrypt = toConscrypt(sSLSocket);
        if (conscrypt instanceof ConscryptEngineSocket) {
            ((ConscryptEngineSocket) conscrypt).setBufferAllocator(bufferAllocator);
        }
    }

    public static void setChannelIdEnabled(SSLEngine sSLEngine, boolean z15) {
        toConscrypt(sSLEngine).setChannelIdEnabled(z15);
    }

    public static void setChannelIdPrivateKey(SSLEngine sSLEngine, PrivateKey privateKey) {
        toConscrypt(sSLEngine).setChannelIdPrivateKey(privateKey);
    }

    public static void setHostname(SSLEngine sSLEngine, String str) {
        toConscrypt(sSLEngine).setHostname(str);
    }

    public static void setNamedGroups(SSLSocket sSLSocket, String[] strArr) {
        toConscrypt(sSLSocket).setNamedGroups(strArr);
    }

    public static void setUseEngineSocket(SSLServerSocketFactory sSLServerSocketFactory, boolean z15) {
        toConscrypt(sSLServerSocketFactory).setUseEngineSocket(z15);
    }

    public static void setUseSessionTickets(SSLEngine sSLEngine, boolean z15) {
        toConscrypt(sSLEngine).setUseSessionTickets(z15);
    }

    public static SSLEngineResult unwrap(SSLEngine sSLEngine, ByteBuffer[] byteBufferArr, int i15, int i16, ByteBuffer[] byteBufferArr2, int i17, int i18) {
        return toConscrypt(sSLEngine).unwrap(byteBufferArr, i15, i16, byteBufferArr2, i17, i18);
    }

    public static boolean isConscrypt(SSLSocketFactory sSLSocketFactory) {
        return sSLSocketFactory instanceof OpenSSLSocketFactoryImpl;
    }

    @Deprecated
    public static Provider newProvider(String str) {
        checkAvailability();
        return newProviderBuilder().setName(str).build();
    }

    public static boolean isConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        return sSLServerSocketFactory instanceof OpenSSLServerSocketFactoryImpl;
    }

    public static boolean isConscrypt(SSLSocket sSLSocket) {
        return sSLSocket instanceof AbstractConscryptSocket;
    }

    private static OpenSSLServerSocketFactoryImpl toConscrypt(SSLServerSocketFactory sSLServerSocketFactory) {
        if (isConscrypt(sSLServerSocketFactory)) {
            return (OpenSSLServerSocketFactoryImpl) sSLServerSocketFactory;
        }
        throw new IllegalArgumentException("Not a conscrypt server socket factory: " + sSLServerSocketFactory.getClass().getName());
    }

    public static boolean isConscrypt(SSLEngine sSLEngine) {
        return sSLEngine instanceof AbstractConscryptEngine;
    }

    public static String getApplicationProtocol(SSLEngine sSLEngine) {
        if (isConscrypt(sSLEngine)) {
            return toConscrypt(sSLEngine).getApplicationProtocol();
        }
        if (sSLEngine.getClass().getName().contains("conscrypt")) {
            return invokeConscryptMethod(sSLEngine, "getApplicationProtocol");
        }
        throw new IllegalArgumentException("Not a conscrypt engine: " + sSLEngine.getClass().getName());
    }

    public static boolean isConscrypt(TrustManager trustManager) {
        return trustManager instanceof TrustManagerImpl;
    }

    private static AbstractConscryptSocket toConscrypt(SSLSocket sSLSocket) {
        if (isConscrypt(sSLSocket)) {
            return (AbstractConscryptSocket) sSLSocket;
        }
        throw new IllegalArgumentException("Not a conscrypt socket: " + sSLSocket.getClass().getName());
    }

    private static AbstractConscryptEngine toConscrypt(SSLEngine sSLEngine) {
        if (isConscrypt(sSLEngine)) {
            return (AbstractConscryptEngine) sSLEngine;
        }
        throw new IllegalArgumentException("Not a conscrypt engine: " + sSLEngine.getClass().getName());
    }

    private static TrustManagerImpl toConscrypt(TrustManager trustManager) {
        if (isConscrypt(trustManager)) {
            return (TrustManagerImpl) trustManager;
        }
        throw new IllegalArgumentException("Not a Conscrypt trust manager: " + trustManager.getClass().getName());
    }
}
