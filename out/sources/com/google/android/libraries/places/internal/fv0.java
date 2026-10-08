package com.google.android.libraries.places.internal;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
final class fv0 implements com.google.common.util.concurrent.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ vh.m f32342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.q f32343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ vh.b f32344c;

    fv0(vh.m mVar, com.google.common.util.concurrent.q qVar, vh.b bVar) {
        this.f32342a = mVar;
        this.f32343b = qVar;
        this.f32344c = bVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final void a(Object obj) {
        this.f32342a.c(obj);
    }

    @Override // com.google.common.util.concurrent.j
    public final void b(Throwable th4) {
        if (this.f32343b.isCancelled()) {
            this.f32344c.a();
        } else if (th4 instanceof Exception) {
            this.f32342a.b((Exception) th4);
        } else {
            this.f32342a.b(new ExecutionException(th4));
        }
    }
}
