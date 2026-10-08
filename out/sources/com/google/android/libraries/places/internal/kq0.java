package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class kq0 extends com.google.common.util.concurrent.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l40 f32756h;

    kq0(l40 l40Var) {
        this.f32756h = l40Var;
    }

    @Override // com.google.common.util.concurrent.a
    protected final boolean C(Object obj) {
        return super.C(obj);
    }

    @Override // com.google.common.util.concurrent.a
    protected final boolean D(Throwable th4) {
        return super.D(th4);
    }

    final /* synthetic */ l40 G() {
        return this.f32756h;
    }

    @Override // com.google.common.util.concurrent.a
    protected final void x() {
        this.f32756h.e("GrpcFuture was cancelled", null);
    }

    @Override // com.google.common.util.concurrent.a
    protected final String z() {
        return zj.j.c(this).d("clientCall", this.f32756h).toString();
    }
}
