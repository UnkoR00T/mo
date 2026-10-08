package com.google.android.libraries.places.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
final class fo0 extends go0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final yo0 f32319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final yo0 f32320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final yo0 f32321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final yo0 f32322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final yo0 f32323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final yo0 f32324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Method f32325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Method f32326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Method f32327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Method f32328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Method f32329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Method f32330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Constructor f32331q;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        f32319e = new yo0(null, "setUseSessionTickets", cls);
        f32320f = new yo0(null, "setHostname", String.class);
        f32321g = new yo0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        f32322h = new yo0(null, "setAlpnProtocols", byte[].class);
        f32323i = new yo0(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        f32324j = new yo0(null, "setNpnProtocols", byte[].class);
        try {
            try {
                try {
                    method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                    try {
                        method5 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                        try {
                            method6 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                            try {
                                Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                                method8 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                                try {
                                    method7 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                                } catch (ClassNotFoundException e15) {
                                    classNotFoundException = e15;
                                    method = method5;
                                    method3 = method6;
                                    method4 = method8;
                                    go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                                    method5 = method;
                                    method6 = method3;
                                    method7 = null;
                                    method8 = method4;
                                } catch (NoSuchMethodException e16) {
                                    noSuchMethodException = e16;
                                    method = method5;
                                    method3 = method6;
                                    method4 = method8;
                                    go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                                    method5 = method;
                                    method6 = method3;
                                    method7 = null;
                                    method8 = method4;
                                }
                            } catch (ClassNotFoundException e17) {
                                classNotFoundException = e17;
                                method4 = null;
                                method = method5;
                                method3 = method6;
                            } catch (NoSuchMethodException e18) {
                                noSuchMethodException = e18;
                                method4 = null;
                                method = method5;
                                method3 = method6;
                            }
                        } catch (ClassNotFoundException e19) {
                            classNotFoundException = e19;
                            method3 = null;
                            method4 = null;
                            method = method5;
                        } catch (NoSuchMethodException e25) {
                            noSuchMethodException = e25;
                            method3 = null;
                            method4 = null;
                            method = method5;
                        }
                    } catch (ClassNotFoundException e26) {
                        classNotFoundException = e26;
                        method = null;
                        method3 = null;
                        method4 = method3;
                        go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = method;
                        method6 = method3;
                        method7 = null;
                        method8 = method4;
                        f32327m = method2;
                        f32328n = method5;
                        f32329o = method6;
                        f32325k = method8;
                        f32326l = method7;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f32330p = method9;
                        f32331q = constructor;
                    } catch (NoSuchMethodException e27) {
                        noSuchMethodException = e27;
                        method = null;
                        method3 = null;
                        method4 = method3;
                        go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = method;
                        method6 = method3;
                        method7 = null;
                        method8 = method4;
                        f32327m = method2;
                        f32328n = method5;
                        f32329o = method6;
                        f32325k = method8;
                        f32326l = method7;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f32330p = method9;
                        f32331q = constructor;
                    }
                } catch (ClassNotFoundException e28) {
                    classNotFoundException = e28;
                    method = null;
                    method2 = null;
                    method3 = null;
                } catch (NoSuchMethodException e29) {
                    noSuchMethodException = e29;
                    method = null;
                    method2 = null;
                    method3 = null;
                }
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e35) {
                e = e35;
                go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e36) {
                e = e36;
                go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e37) {
            e = e37;
            method9 = null;
        } catch (NoSuchMethodException e38) {
            e = e38;
            method9 = null;
        }
        f32327m = method2;
        f32328n = method5;
        f32329o = method6;
        f32325k = method8;
        f32326l = method7;
        f32330p = method9;
        f32331q = constructor;
    }

    fo0(ep0 ep0Var) {
        super(ep0Var);
    }

    @Override // com.google.android.libraries.places.internal.go0
    public final String a(SSLSocket sSLSocket, String str, List list) {
        String strC = c(sSLSocket);
        return strC == null ? super.a(sSLSocket, str, list) : strC;
    }

    @Override // com.google.android.libraries.places.internal.go0
    protected final void b(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fp0) it.next()).toString());
        }
        boolean z15 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            zj.p.l(ze0.b(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = f32325k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f32319e.b(sSLSocket, Boolean.TRUE);
                            } else {
                                f32326l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f32330p;
                            if (method3 == null || (constructor = f32331q) == null || dk.b.g(dk.a.a(str).b())) {
                                f32320f.b(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e15) {
                    throw new RuntimeException(e15);
                }
            } catch (IllegalAccessException e16) {
                throw new RuntimeException(e16);
            } catch (InstantiationException e17) {
                throw new RuntimeException(e17);
            }
        }
        Method method4 = f32329o;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f32327m.invoke(sSLParameters, strArr);
                z15 = true;
            } catch (InvocationTargetException e18) {
                if (!(e18.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e18;
                }
                go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z15 && (method = f32328n) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {ep0.g(list)};
        ep0 ep0Var = this.f32410a;
        if (ep0Var.c() == 1) {
            f32322h.c(sSLSocket, objArr);
        }
        if (ep0Var.c() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f32324j.c(sSLSocket, objArr);
    }

    @Override // com.google.android.libraries.places.internal.go0
    public final String c(SSLSocket sSLSocket) {
        Method method = f32329o;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e15) {
                throw new RuntimeException(e15);
            } catch (InvocationTargetException e16) {
                if (!(e16.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e16);
                }
                go0.f32407b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.f32410a.c() == 1) {
            try {
                byte[] bArr = (byte[]) f32321g.c(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, hp0.f32507b);
                }
            } catch (Exception e17) {
                go0.f32407b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e17);
            }
        }
        if (this.f32410a.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) f32323i.c(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, hp0.f32507b);
                }
            } catch (Exception e18) {
                go0.f32407b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e18);
            }
        }
        return null;
    }
}
