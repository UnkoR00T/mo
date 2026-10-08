package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class yi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b40 f34408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketAddress f34409b;

    public yi0(b40 b40Var, SocketAddress socketAddress) {
        this.f34408a = b40Var;
        this.f34409b = socketAddress;
    }

    final /* synthetic */ p50 a() {
        return new p50(Collections.singletonList(this.f34409b), this.f34408a);
    }

    final /* synthetic */ b40 b() {
        return this.f34408a;
    }

    final /* synthetic */ SocketAddress c() {
        return this.f34409b;
    }
}
