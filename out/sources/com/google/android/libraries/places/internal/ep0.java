package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
public class ep0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f32234b = Logger.getLogger(ep0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f32235c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ep0 f32236d = h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f32237a;

    public ep0(Provider provider) {
        this.f32237a = provider;
    }

    public static ep0 e() {
        return f32236d;
    }

    public static byte[] g(List list) {
        nr0 nr0Var = new nr0();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            fp0 fp0Var = (fp0) list.get(i15);
            if (fp0Var != fp0.HTTP_1_0) {
                nr0Var.b(fp0Var.toString().length());
                nr0Var.C0(fp0Var.toString());
            }
        }
        return nr0Var.y3(nr0Var.K());
    }

    private static ep0 h() throws NoSuchMethodException {
        Provider provider;
        Provider provider2;
        Method method;
        Method method2;
        Method method3;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= length) {
                provider = null;
                break;
            }
            Provider provider3 = providers[i15];
            String[] strArr = f32235c;
            int length2 = strArr.length;
            for (int i16 = 0; i16 < 5; i16++) {
                String str = strArr[i16];
                if (str.equals(provider3.getClass().getName())) {
                    f32234b.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i15++;
        }
        if (provider != null) {
            yo0 yo0Var = new yo0(null, "setUseSessionTickets", Boolean.TYPE);
            yo0 yo0Var2 = new yo0(null, "setHostname", String.class);
            yo0 yo0Var3 = new yo0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            yo0 yo0Var4 = new yo0(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = method;
                    method3 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = method;
                    method3 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            int i17 = 1;
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    ep0.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e15) {
                    f32234b.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e15);
                    try {
                        ep0.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i17 = 2;
                    } catch (ClassNotFoundException e16) {
                        f32234b.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e16);
                        i17 = 3;
                    }
                }
            }
            return new zo0(yo0Var, yo0Var2, method2, method3, yo0Var3, yo0Var4, provider, i17);
        }
        try {
            Provider provider4 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new ap0(provider4, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null), null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    provider2 = provider4;
                    return new ep0(provider2);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused4) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                StringBuilder sb5 = new StringBuilder(36);
                sb5.append("org.eclipse.jetty.alpn.ALPN");
                sb5.append("$Provider");
                Class<?> cls3 = Class.forName(sb5.toString());
                StringBuilder sb6 = new StringBuilder(42);
                sb6.append("org.eclipse.jetty.alpn.ALPN");
                sb6.append("$ClientProvider");
                Class<?> cls4 = Class.forName(sb6.toString());
                StringBuilder sb7 = new StringBuilder(42);
                sb7.append("org.eclipse.jetty.alpn.ALPN");
                sb7.append("$ServerProvider");
                try {
                    return new bp0(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), cls4, Class.forName(sb7.toString()), provider4);
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    provider2 = provider4;
                    return new ep0(provider2);
                }
            }
        } catch (NoSuchAlgorithmException e17) {
            throw new RuntimeException(e17);
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public final Provider f() {
        return this.f32237a;
    }
}
