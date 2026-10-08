package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag0 f34511a;

    zf0(ag0 ag0Var) {
        Objects.requireNonNull(ag0Var);
        this.f34511a = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag0 ag0Var = this.f34511a;
        cg0 cg0Var = ag0Var.f31620c;
        cg0Var.P().remove(ag0Var.f31618a);
        if (cg0Var.k().c() == b50.SHUTDOWN && cg0Var.P().isEmpty()) {
            cg0Var.z();
        }
    }
}
