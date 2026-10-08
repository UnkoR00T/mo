package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zj0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak0 f34519a;

    /* synthetic */ zj0(ak0 ak0Var, byte[] bArr) {
        Objects.requireNonNull(ak0Var);
        this.f34519a = ak0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ak0 ak0Var = this.f34519a;
        xj0 xj0Var = new xj0(ak0Var, null);
        u90 u90Var = (u90) ak0Var.e();
        u90Var.c(xj0Var);
        u90Var.a();
    }
}
