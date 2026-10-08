package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes4.dex */
class go0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f32407b = Logger.getLogger(go0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ep0 f32408c = ep0.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final go0 f32409d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ep0 f32410a;

    static {
        go0 go0Var;
        ClassLoader classLoader = go0.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e15) {
            f32407b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e15);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e16) {
                f32407b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e16);
                go0Var = new go0(f32408c);
            }
        }
        go0Var = new fo0(f32408c);
        f32409d = go0Var;
    }

    go0(ep0 ep0Var) {
        this.f32410a = (ep0) zj.p.r(ep0Var, "platform");
    }

    public static go0 d() {
        return f32409d;
    }

    public String a(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strC = c(sSLSocket);
            if (strC != null) {
                this.f32410a.d(sSLSocket);
                return strC;
            }
            String strValueOf = String.valueOf(list);
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 44);
            sb5.append("TLS ALPN negotiation failed with protocols: ");
            sb5.append(strValueOf);
            throw new RuntimeException(sb5.toString());
        } catch (Throwable th4) {
            this.f32410a.d(sSLSocket);
            throw th4;
        }
    }

    protected void b(SSLSocket sSLSocket, String str, List list) {
        this.f32410a.a(sSLSocket, str, list);
    }

    public String c(SSLSocket sSLSocket) {
        return this.f32410a.b(sSLSocket);
    }
}
