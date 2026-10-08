package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ah0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uh0 f31631a;

    /* synthetic */ ah0(uh0 uh0Var, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f31631a = uh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uh0 uh0Var = this.f31631a;
        if (uh0Var.o() == null) {
            return;
        }
        uh0Var.f0();
    }
}
