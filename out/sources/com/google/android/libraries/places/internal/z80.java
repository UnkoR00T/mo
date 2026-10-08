package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class z80 extends l40 {
    z80() {
    }

    @Override // com.google.android.libraries.places.internal.l40
    public void c(int i15) {
        f().c(i15);
    }

    @Override // com.google.android.libraries.places.internal.l40
    public void d() {
        f().d();
    }

    @Override // com.google.android.libraries.places.internal.l40
    public void e(String str, Throwable th4) {
        f().e(str, th4);
    }

    protected abstract l40 f();

    public final String toString() {
        return zj.j.c(this).d("delegate", f()).toString();
    }
}
