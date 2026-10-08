package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sq0 extends z60 {
    @Override // com.google.android.libraries.places.internal.z60
    public final f70 a(w60 w60Var) {
        return f().a(w60Var);
    }

    @Override // com.google.android.libraries.places.internal.z60
    public void b(b50 b50Var, g70 g70Var) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final void c() {
        f().c();
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final u90 d() {
        return f().d();
    }

    @Override // com.google.android.libraries.places.internal.z60
    public final ScheduledExecutorService e() {
        return f().e();
    }

    protected abstract z60 f();

    public final String toString() {
        return zj.j.c(this).d("delegate", f()).toString();
    }
}
