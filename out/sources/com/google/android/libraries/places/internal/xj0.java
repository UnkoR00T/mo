package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class xj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak0 f34292a;

    /* synthetic */ xj0(ak0 ak0Var, byte[] bArr) {
        Objects.requireNonNull(ak0Var);
        this.f34292a = ak0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak0 ak0Var = this.f34292a;
        byte[] bArr = null;
        if (!ak0Var.h()) {
            ak0Var.j(null);
            return;
        }
        long jG = ak0Var.g();
        long jC = ak0Var.c();
        if (jG - jC > 0) {
            ak0Var.j(ak0Var.d().schedule(new zj0(ak0Var, bArr), ak0Var.g() - jC, TimeUnit.NANOSECONDS));
        } else {
            ak0Var.i(false);
            ak0Var.j(null);
            ak0Var.f().run();
        }
    }
}
