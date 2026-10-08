package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class y50 extends c90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SocketAddress f34342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f34343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f34344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f34346e;

    /* synthetic */ y50(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, Map map, String str, String str2, byte[] bArr) {
        zj.p.r(socketAddress, "proxyAddress");
        zj.p.r(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            zj.p.B(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f34342a = socketAddress;
        this.f34343b = inetSocketAddress;
        this.f34344c = map;
        this.f34345d = str;
        this.f34346e = str2;
    }

    public static x50 e() {
        return new x50(null);
    }

    public final String a() {
        return this.f34346e;
    }

    public final String b() {
        return this.f34345d;
    }

    public final SocketAddress c() {
        return this.f34342a;
    }

    public final InetSocketAddress d() {
        return this.f34343b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y50)) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return zj.l.a(this.f34342a, y50Var.f34342a) && zj.l.a(this.f34343b, y50Var.f34343b) && zj.l.a(this.f34344c, y50Var.f34344c) && zj.l.a(this.f34345d, y50Var.f34345d) && zj.l.a(this.f34346e, y50Var.f34346e);
    }

    public final int hashCode() {
        return zj.l.b(this.f34342a, this.f34343b, this.f34345d, this.f34346e, this.f34344c);
    }

    public final String toString() {
        return zj.j.c(this).d("proxyAddr", this.f34342a).d("targetAddr", this.f34343b).d("headers", this.f34344c).d("username", this.f34345d).e("hasPassword", this.f34346e != null).toString();
    }
}
