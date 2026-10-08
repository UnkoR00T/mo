package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class ua0 implements lb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lb0 f33873a;

    ua0(lb0 lb0Var, c40 c40Var, Executor executor) {
        this.f33873a = (lb0) zj.p.r(lb0Var, "delegate");
    }

    @Override // com.google.android.libraries.places.internal.lb0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33873a.close();
    }

    @Override // com.google.android.libraries.places.internal.lb0
    public final vb0 f3(SocketAddress socketAddress, kb0 kb0Var, i40 i40Var) {
        return new ta0(this, this.f33873a.f3(socketAddress, kb0Var, i40Var), kb0Var.a());
    }

    @Override // com.google.android.libraries.places.internal.lb0
    public final ScheduledExecutorService zzb() {
        return this.f33873a.zzb();
    }
}
