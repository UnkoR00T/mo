package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class lj0 extends g70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ mj0 f32850b;

    /* synthetic */ lj0(mj0 mj0Var, byte[] bArr) {
        Objects.requireNonNull(mj0Var);
        this.f32850b = mj0Var;
        this.f32849a = new AtomicBoolean(false);
    }

    @Override // com.google.android.libraries.places.internal.g70
    public final b70 a(c70 c70Var) {
        if (this.f32849a.compareAndSet(false, true)) {
            final mj0 mj0Var = this.f32850b;
            u90 u90VarD = mj0Var.f().d();
            u90VarD.c(new Runnable() { // from class: com.google.android.libraries.places.internal.kj0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    mj0Var.d();
                }
            });
            u90VarD.a();
        }
        return b70.d();
    }
}
