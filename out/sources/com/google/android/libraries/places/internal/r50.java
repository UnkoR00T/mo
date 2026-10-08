package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r50 extends s70 {
    protected r50() {
    }

    @Override // com.google.android.libraries.places.internal.s70
    public final r70 a() {
        return b().a();
    }

    protected abstract s70 b();

    public final s70 c(m40... m40VarArr) {
        ((ai0) b()).b(Arrays.asList(m40VarArr));
        return this;
    }

    public final s70 d(String str) {
        ((ai0) b()).c(str);
        return this;
    }

    public final String toString() {
        return zj.j.c(this).d("delegate", b()).toString();
    }
}
