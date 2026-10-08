package org.conscrypt;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Binder;
import android.os.Build;
import android.os.SystemClock;
import android.system.Os;
import dalvik.system.BlockGuard;
import dalvik.system.CloseGuard;
import io.sentry.android.core.c2;
import io.sentry.q7;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketImpl;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.ct.CertificateTransparency;
import org.conscrypt.metrics.CertificateTransparencyVerificationReason;
import org.conscrypt.metrics.NoopStatsLog;
import org.conscrypt.metrics.Source;
import org.conscrypt.metrics.StatsLog;
import org.conscrypt.metrics.StatsLogImpl;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DiscouragedPrivateApi"})
public final class Platform {
    private static boolean DEPRECATED_TLS_V1 = true;
    private static boolean ENABLED_TLS_V1 = false;
    private static boolean FILTERED_TLS_V1 = true;
    private static final String TAG = "Conscrypt";
    private static Method m_getCurveName;

    static {
        NativeCrypto.setTlsV1DeprecationStatus(true, false);
        try {
            Method declaredMethod = ECParameterSpec.class.getDeclaredMethod("getCurveName", null);
            m_getCurveName = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    private Platform() {
    }

    public static void blockGuardOnNetwork() {
        BlockGuard.getThreadPolicy().onNetwork();
    }

    @SuppressLint({"NewApi"})
    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) throws CertificateException {
        if (checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) || checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    @SuppressLint({"NewApi"})
    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, AbstractConscryptSocket abstractConscryptSocket) throws CertificateException {
        if (checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, Socket.class, abstractConscryptSocket) || checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, abstractConscryptSocket.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    private static boolean checkTrusted(String str, X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str2, Class<?> cls, Object obj) throws CertificateException {
        try {
            x509TrustManager.getClass().getMethod(str, X509Certificate[].class, String.class, cls).invoke(x509TrustManager, x509CertificateArr, str2, obj);
            return true;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return false;
        } catch (InvocationTargetException e15) {
            if (e15.getCause() instanceof CertificateException) {
                throw ((CertificateException) e15.getCause());
            }
            throw new RuntimeException(e15.getCause());
        }
    }

    public static void closeGuardClose(Object obj) {
        ((CloseGuard) obj).close();
    }

    public static CloseGuard closeGuardGet() {
        return CloseGuard.get();
    }

    public static void closeGuardOpen(Object obj, String str) {
        ((CloseGuard) obj).open(str);
    }

    public static void closeGuardWarnIfOpen(Object obj) {
        ((CloseGuard) obj).warnIfOpen();
    }

    static ConscryptEngineSocket createEngineSocket(SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(sSLParametersImpl);
    }

    public static GCMParameters fromGCMParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
            return null;
        }
        try {
            return new GCMParameters(((Integer) cls.getMethod("getTLen", null).invoke(algorithmParameterSpec, null)).intValue(), (byte[]) cls.getMethod("getIV", null).invoke(algorithmParameterSpec, null));
        } catch (IllegalAccessException e15) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e15);
        } catch (NoSuchMethodException e16) {
            throw new RuntimeException("GCMParameterSpec lacks expected methods", e16);
        } catch (InvocationTargetException e17) {
            throw new RuntimeException("Could not fetch GCM parameters", e17.getTargetException());
        }
    }

    static AlgorithmParameterSpec fromGCMParameters(AlgorithmParameters algorithmParameters) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return algorithmParameters.getParameterSpec(cls);
            } catch (InvalidParameterSpecException unused2) {
            }
        }
        return null;
    }

    private static Class<?> getClass(String... strArr) {
        for (int i15 = 0; i15 < strArr.length; i15++) {
            try {
                return Class.forName(strArr[i15]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getCurveName(ECParameterSpec eCParameterSpec) {
        Method method = m_getCurveName;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(eCParameterSpec, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static KeyStore getDefaultCertKeyStore() throws KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
        try {
            keyStore.load(null, null);
            return keyStore;
        } catch (IOException e15) {
            throw new KeyStoreException(e15);
        } catch (NoSuchAlgorithmException e16) {
            throw new KeyStoreException(e16);
        } catch (CertificateException e17) {
            throw new KeyStoreException(e17);
        }
    }

    public static ConscryptHostnameVerifier getDefaultHostnameVerifier() {
        return OkHostnameVerifier.strictInstance();
    }

    public static String getDefaultProviderName() {
        return TAG;
    }

    public static String getEndpointIdentificationAlgorithm(SSLParameters sSLParameters) {
        return null;
    }

    public static FileDescriptor getFileDescriptor(Socket socket) {
        try {
            Field declaredField = Socket.class.getDeclaredField("impl");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(socket);
            Field declaredField2 = SocketImpl.class.getDeclaredField("fd");
            declaredField2.setAccessible(true);
            return (FileDescriptor) declaredField2.get(obj);
        } catch (Exception e15) {
            throw new RuntimeException("Can't get FileDescriptor from socket", e15);
        }
    }

    public static FileDescriptor getFileDescriptorFromSSLSocket(AbstractConscryptSocket abstractConscryptSocket) {
        return getFileDescriptor(abstractConscryptSocket);
    }

    public static String getHostStringFromInetSocketAddress(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getDeclaredMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15);
        } catch (Exception unused) {
            return null;
        }
    }

    static long getMillisSinceBoot() {
        return SystemClock.elapsedRealtime();
    }

    public static String getOriginalHostNameFromInetAddress(InetAddress inetAddress) {
        if (Build.VERSION.SDK_INT > 27) {
            try {
                Method declaredMethod = InetAddress.class.getDeclaredMethod("holder", null);
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Class.forName("java.net.InetAddress$InetAddressHolder").getDeclaredMethod("getOriginalHostName", null);
                declaredMethod2.setAccessible(true);
                String str = (String) declaredMethod2.invoke(declaredMethod.invoke(inetAddress, null), null);
                return str == null ? inetAddress.getHostAddress() : str;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e15) {
                throw new RuntimeException("Failed to get originalHostName", e15);
            }
        }
        return inetAddress.getHostAddress();
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }

    private static void getSSLParametersFromImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) throws IllegalAccessException, InvocationTargetException {
        sSLParameters.getClass().getMethod("setEndpointIdentificationAlgorithm", String.class).invoke(sSLParameters, sSLParametersImpl.getEndpointIdentificationAlgorithm());
        sSLParameters.getClass().getMethod("setUseCipherSuitesOrder", Boolean.TYPE).invoke(sSLParameters, Boolean.valueOf(sSLParametersImpl.getUseCipherSuitesOrder()));
        try {
            sSLParameters.getClass().getMethod("setNamedGroups", String[].class).invoke(sSLParameters, sSLParametersImpl.getNamedGroups());
        } catch (IllegalArgumentException | NoSuchMethodException unused) {
        }
    }

    @TargetApi(24)
    private static String getSniHostnameFromParams(SSLParameters sSLParameters) {
        List<SNIServerName> list = (List) sSLParameters.getClass().getMethod("getServerNames", null).invoke(sSLParameters, null);
        if (list != null) {
            for (SNIServerName sNIServerName : list) {
                if (sNIServerName.getType() == 0) {
                    return ((SNIHostName) sNIServerName).getAsciiName();
                }
            }
        }
        return null;
    }

    public static StatsLog getStatsLog() {
        return Build.VERSION.SDK_INT >= 30 ? StatsLogImpl.getInstance() : NoopStatsLog.getInstance();
    }

    public static Source getStatsSource() {
        return Source.SOURCE_GMS;
    }

    @TargetApi(30)
    public static int[] getUids() {
        return new int[]{Os.getuid(), Binder.getCallingUid()};
    }

    public static boolean isCTVerificationRequired(String str) {
        boolean z15 = false;
        if (str == null) {
            return false;
        }
        String property = Security.getProperty("conscrypt.ct.enable");
        if (property != null && Boolean.parseBoolean(property)) {
            List<String> listAsList = Arrays.asList(str.split("\\."));
            Collections.reverse(listAsList);
            String str2 = "conscrypt.ct.enforce";
            for (String str3 : listAsList) {
                String property2 = Security.getProperty(str2 + q7.DEFAULT_PROPAGATION_TARGETS);
                if (property2 != null) {
                    z15 = Boolean.parseBoolean(property2);
                }
                str2 = str2 + "." + str3;
            }
            String property3 = Security.getProperty(str2);
            if (property3 != null) {
                return Boolean.parseBoolean(property3);
            }
        }
        return z15;
    }

    public static boolean isJavaxCertificateSupported() {
        return true;
    }

    public static boolean isPakeSupported() {
        return false;
    }

    public static boolean isSdkGreater(int i15) {
        return Build.VERSION.SDK_INT > i15;
    }

    public static synchronized boolean isTlsV1Deprecated() {
        return DEPRECATED_TLS_V1;
    }

    public static synchronized boolean isTlsV1Filtered() {
        return FILTERED_TLS_V1;
    }

    public static synchronized boolean isTlsV1Supported() {
        return ENABLED_TLS_V1;
    }

    private static void logStackTraceSnippet(String str, Throwable th4) {
        c2.g(TAG, str);
        StackTraceElement[] stackTrace = th4.getStackTrace();
        for (int i15 = 0; i15 < 2 && i15 < stackTrace.length; i15++) {
            c2.g(TAG, "\tat " + stackTrace[i15].toString());
        }
    }

    static CertBlocklist newDefaultBlocklist() {
        return null;
    }

    static ConscryptCertStore newDefaultCertStore() {
        return null;
    }

    static CertificateTransparency newDefaultCertificateTransparency() {
        return null;
    }

    public static String oidToAlgorithmName(String str) {
        try {
            try {
                Method declaredMethod = Class.forName("org.apache.harmony.security.utils.AlgNameMapper").getDeclaredMethod("map2AlgName", String.class);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, str);
            } catch (InvocationTargetException e15) {
                Throwable cause = e15.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(e15);
            } catch (Exception unused) {
                return str;
            }
        } catch (InvocationTargetException e16) {
            Throwable cause2 = e16.getCause();
            if (cause2 instanceof RuntimeException) {
                throw ((RuntimeException) cause2);
            }
            if (cause2 instanceof Error) {
                throw ((Error) cause2);
            }
            throw new RuntimeException(e16);
        } catch (Exception unused2) {
            Class<?> cls = Class.forName("sun.security.x509.AlgorithmId");
            Method declaredMethod2 = cls.getDeclaredMethod("get", String.class);
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls.getDeclaredMethod("getName", null);
            declaredMethod3.setAccessible(true);
            return (String) declaredMethod3.invoke(declaredMethod2.invoke(null, str), null);
        }
    }

    static boolean provideTrustManagerByDefault() {
        return false;
    }

    public static CertificateTransparencyVerificationReason reasonCTVerificationRequired(String str) {
        return CertificateTransparencyVerificationReason.UNKNOWN;
    }

    static boolean serverNamePermitted(SSLParametersImpl sSLParametersImpl, String str) {
        return serverNamePermittedInternal(sSLParametersImpl, str);
    }

    @TargetApi(24)
    private static boolean serverNamePermittedInternal(SSLParametersImpl sSLParametersImpl, String str) {
        Collection<SNIMatcher> sNIMatchers = sSLParametersImpl.getSNIMatchers();
        if (sNIMatchers == null || sNIMatchers.isEmpty()) {
            return true;
        }
        Iterator<SNIMatcher> it = sNIMatchers.iterator();
        while (it.hasNext()) {
            if (it.next().matches(new SNIHostName(str))) {
                return true;
            }
        }
        return false;
    }

    public static void setCurveName(ECParameterSpec eCParameterSpec, String str) {
        try {
            eCParameterSpec.getClass().getDeclaredMethod("setCurveName", String.class).invoke(eCParameterSpec, str);
        } catch (Exception unused) {
        }
    }

    public static void setEndpointIdentificationAlgorithm(SSLParameters sSLParameters, String str) {
    }

    @TargetApi(24)
    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) throws IllegalAccessException, InvocationTargetException {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(abstractConscryptSocket.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(abstractConscryptSocket.getHostname())));
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }

    private static void setSSLParametersOnImpl(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl) {
        sSLParametersImpl.setEndpointIdentificationAlgorithm((String) sSLParameters.getClass().getMethod("getEndpointIdentificationAlgorithm", null).invoke(sSLParameters, null));
        sSLParametersImpl.setUseCipherSuitesOrder(((Boolean) sSLParameters.getClass().getMethod("getUseCipherSuitesOrder", null).invoke(sSLParameters, null)).booleanValue());
        try {
            sSLParametersImpl.setNamedGroups((String[]) sSLParameters.getClass().getMethod("getNamedGroups", null).invoke(sSLParameters, null));
        } catch (IllegalArgumentException | NoSuchMethodException unused) {
        }
    }

    public static void setSocketWriteTimeout(Socket socket, long j15) {
        try {
            FileDescriptor fileDescriptor = getFileDescriptor(socket);
            if (fileDescriptor == null || !fileDescriptor.valid()) {
                throw new SocketException("Socket closed");
            }
            Class<?> cls = getClass("android.system.StructTimeval", "libcore.io.StructTimeval");
            if (cls == null) {
                c2.g(TAG, "StructTimeval == null; not setting socket write timeout");
                return;
            }
            Method declaredMethod = cls.getDeclaredMethod("fromMillis", Long.TYPE);
            if (declaredMethod == null) {
                c2.g(TAG, "fromMillis == null; not setting socket write timeout");
                return;
            }
            Object objInvoke = declaredMethod.invoke(null, Long.valueOf(j15));
            Field field = Class.forName("libcore.io.Libcore").getField("os");
            if (field == null) {
                c2.g(TAG, "os == null; not setting socket write timeout");
                return;
            }
            Object obj = field.get(null);
            if (obj == null) {
                c2.g(TAG, "instance_os == null; not setting socket write timeout");
                return;
            }
            Class<?> cls2 = getClass("android.system.OsConstants", "libcore.io.OsConstants");
            if (cls2 == null) {
                c2.g(TAG, "OsConstants == null; not setting socket write timeout");
                return;
            }
            Field field2 = cls2.getField("SOL_SOCKET");
            if (field2 == null) {
                c2.g(TAG, "SOL_SOCKET == null; not setting socket write timeout");
                return;
            }
            Field field3 = cls2.getField("SO_SNDTIMEO");
            if (field3 == null) {
                c2.g(TAG, "SO_SNDTIMEO == null; not setting socket write timeout");
                return;
            }
            Class<?> cls3 = obj.getClass();
            Class cls4 = Integer.TYPE;
            Method method = cls3.getMethod("setsockoptTimeval", FileDescriptor.class, cls4, cls4, cls);
            if (method == null) {
                c2.g(TAG, "setsockoptTimeval == null; not setting socket write timeout");
            } else {
                method.invoke(obj, fileDescriptor, field2.get(null), field3.get(null), objInvoke);
            }
        } catch (Exception e15) {
            logStackTraceSnippet("Could not set socket write timeout: " + e15, e15);
            for (Throwable cause = e15.getCause(); cause != null; cause = cause.getCause()) {
                logStackTraceSnippet("Caused by: " + cause, cause);
            }
        }
    }

    public static synchronized void setup(boolean z15, boolean z16) {
        DEPRECATED_TLS_V1 = z15;
        ENABLED_TLS_V1 = z16;
        FILTERED_TLS_V1 = !z16;
        NativeCrypto.setTlsV1DeprecationStatus(z15, z16);
    }

    static boolean supportsConscryptCertStore() {
        return false;
    }

    static boolean supportsX509ExtendedTrustManager() {
        return true;
    }

    public static AlgorithmParameterSpec toGCMParameterSpec(int i15, byte[] bArr) {
        Class<?> cls;
        try {
            cls = Class.forName("javax.crypto.spec.GCMParameterSpec");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AlgorithmParameterSpec) cls.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(i15), bArr);
            } catch (IllegalAccessException e15) {
                e = e15;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (IllegalArgumentException e16) {
                e = e16;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (InstantiationException e17) {
                e = e17;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (NoSuchMethodException e18) {
                e = e18;
                logStackTraceSnippet("Can't find GCMParameterSpec class", e);
                return null;
            } catch (InvocationTargetException e19) {
                logStackTraceSnippet("Can't find GCMParameterSpec class", e19.getCause());
            }
        }
        return null;
    }

    static SSLEngine unwrapEngine(SSLEngine sSLEngine) {
        return sSLEngine;
    }

    static SSLEngine wrapEngine(ConscryptEngine conscryptEngine) {
        return conscryptEngine;
    }

    public static SSLSession wrapSSLSession(ExternalSession externalSession) {
        return new Java8ExtendedSSLSession(externalSession);
    }

    public static SSLSocketFactory wrapSocketFactoryIfNeeded(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        return openSSLSocketFactoryImpl;
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i15, SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(str, i15, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i15, SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(str, i15, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(inetAddress, i15, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i15, SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(inetAddress, i15, sSLParametersImpl);
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            setParametersSniHostname(sSLParameters, sSLParametersImpl, abstractConscryptSocket);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, AbstractConscryptSocket abstractConscryptSocket) {
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            String sniHostnameFromParams = getSniHostnameFromParams(sSLParameters);
            if (sniHostnameFromParams != null) {
                abstractConscryptSocket.setHostname(sniHostnameFromParams);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }

    static ConscryptEngineSocket createEngineSocket(String str, int i15, InetAddress inetAddress, int i16, SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(str, i15, inetAddress, i16, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(String str, int i15, InetAddress inetAddress, int i16, SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(str, i15, inetAddress, i16, sSLParametersImpl);
    }

    @SuppressLint({"NewApi"})
    public static void checkClientTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) throws CertificateException {
        if (checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) || checkTrusted("checkClientTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    @SuppressLint({"NewApi"})
    public static void checkServerTrusted(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, ConscryptEngine conscryptEngine) throws CertificateException {
        if (checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, SSLEngine.class, conscryptEngine) || checkTrusted("checkServerTrusted", x509TrustManager, x509CertificateArr, str, String.class, conscryptEngine.getHandshakeSession().getPeerHost())) {
            return;
        }
        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    static ConscryptEngineSocket createEngineSocket(InetAddress inetAddress, int i15, InetAddress inetAddress2, int i16, SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(inetAddress, i15, inetAddress2, i16, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(InetAddress inetAddress, int i15, InetAddress inetAddress2, int i16, SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(inetAddress, i15, inetAddress2, i16, sSLParametersImpl);
    }

    static ConscryptEngineSocket createEngineSocket(Socket socket, String str, int i15, boolean z15, SSLParametersImpl sSLParametersImpl) {
        return new Java8EngineSocket(socket, str, i15, z15, sSLParametersImpl);
    }

    static ConscryptFileDescriptorSocket createFileDescriptorSocket(Socket socket, String str, int i15, boolean z15, SSLParametersImpl sSLParametersImpl) {
        return new Java8FileDescriptorSocket(socket, str, i15, z15, sSLParametersImpl);
    }

    public static void getSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            getSSLParametersFromImpl(sSLParameters, sSLParametersImpl);
            setParametersSniHostname(sSLParameters, sSLParametersImpl, conscryptEngine);
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }

    @TargetApi(24)
    private static void setParametersSniHostname(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) throws IllegalAccessException, InvocationTargetException {
        if (sSLParametersImpl.getUseSni() && AddressUtils.isValidSniHostname(conscryptEngine.getHostname())) {
            sSLParameters.getClass().getMethod("setServerNames", List.class).invoke(sSLParameters, Collections.singletonList(new SNIHostName(conscryptEngine.getHostname())));
        }
    }

    public static void setSSLParameters(SSLParameters sSLParameters, SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            setSSLParametersOnImpl(sSLParameters, sSLParametersImpl);
            String sniHostnameFromParams = getSniHostnameFromParams(sSLParameters);
            if (sniHostnameFromParams != null) {
                conscryptEngine.setHostname(sniHostnameFromParams);
            }
        } catch (IllegalAccessException | NoSuchMethodException unused) {
        } catch (InvocationTargetException e15) {
            throw new RuntimeException(e15.getCause());
        }
    }
}
