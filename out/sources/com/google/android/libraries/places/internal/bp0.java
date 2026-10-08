package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
final class bp0 extends ep0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f31812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f31813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Method f31814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f31815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f31816i;

    public bp0(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f31812e = method;
        this.f31813f = method2;
        this.f31814g = method3;
        this.f31815h = cls;
        this.f31816i = cls2;
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final void a(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            fp0 fp0Var = (fp0) list.get(i15);
            if (fp0Var != fp0.HTTP_1_0) {
                arrayList.add(fp0Var.toString());
            }
        }
        try {
            this.f31812e.invoke(null, sSLSocket, Proxy.newProxyInstance(ep0.class.getClassLoader(), new Class[]{this.f31815h, this.f31816i}, new cp0(arrayList)));
        } catch (IllegalAccessException e15) {
            throw new AssertionError(e15);
        } catch (InvocationTargetException e16) {
            throw new AssertionError(e16);
        }
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final String b(SSLSocket sSLSocket) {
        try {
            cp0 cp0Var = (cp0) Proxy.getInvocationHandler(this.f31813f.invoke(null, sSLSocket));
            if (!cp0Var.a() && cp0Var.b() == null) {
                ep0.f32234b.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (cp0Var.a()) {
                return null;
            }
            return cp0Var.b();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final int c() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.ep0
    public final void d(SSLSocket sSLSocket) {
        try {
            this.f31814g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e15) {
            ep0.f32234b.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e15);
        }
    }
}
