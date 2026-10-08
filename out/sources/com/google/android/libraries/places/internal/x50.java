package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class x50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SocketAddress f34234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InetSocketAddress f34235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f34236c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34238e;

    private x50() {
    }

    public final x50 a(SocketAddress socketAddress) {
        this.f34234a = (SocketAddress) zj.p.r(socketAddress, "proxyAddress");
        return this;
    }

    public final x50 b(InetSocketAddress inetSocketAddress) {
        this.f34235b = (InetSocketAddress) zj.p.r(inetSocketAddress, "targetAddress");
        return this;
    }

    public final x50 c(String str) {
        this.f34237d = str;
        return this;
    }

    public final x50 d(String str) {
        this.f34238e = str;
        return this;
    }

    public final y50 e() {
        return new y50(this.f34234a, this.f34235b, this.f34236c, this.f34237d, this.f34238e, null);
    }

    /* synthetic */ x50(byte[] bArr) {
    }
}
