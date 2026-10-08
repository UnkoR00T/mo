package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class a90 extends j40 {
    a90() {
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void d() {
        e().d();
    }

    protected abstract j40 e();

    public final String toString() {
        return zj.j.c(this).d("delegate", e()).toString();
    }
}
