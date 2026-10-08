package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ud0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f33877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xd0 f33878b;

    ud0(xd0 xd0Var, boolean z15) {
        this.f33877a = z15;
        Objects.requireNonNull(xd0Var);
        this.f33878b = xd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f33877a) {
            ae0 ae0Var = this.f33878b.f34266b;
            ae0Var.f31610n = true;
            if (ae0Var.i() > 0) {
                ae0Var.k().f().g();
            }
        }
        this.f33878b.f34266b.l(false);
    }
}
