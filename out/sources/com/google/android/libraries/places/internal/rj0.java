package com.google.android.libraries.places.internal;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class rj0 implements d90 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33516e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.w f33517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f33513b = Logger.getLogger(rj0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final pj0 f33515d = new pj0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zj.w f33514c = new qj0();

    public rj0() {
        zj.w wVar = f33514c;
        pj0 pj0Var = f33515d;
        this.f33517a = (zj.w) zj.p.q(wVar);
    }

    private final c90 c(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.f33517a.get();
            if (proxySelector == null) {
                f33513b.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                f33513b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationA = pj0.a(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            x50 x50VarE = y50.e();
            x50VarE.b(inetSocketAddress);
            x50VarE.a(inetSocketAddress2);
            if (passwordAuthenticationA == null) {
                return x50VarE.e();
            }
            x50VarE.c(passwordAuthenticationA.getUserName());
            x50VarE.d(passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null);
            return x50VarE.e();
        } catch (URISyntaxException e15) {
            f33513b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e15);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.d90
    public final c90 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
