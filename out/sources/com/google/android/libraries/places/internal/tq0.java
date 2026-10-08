package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class tq0 extends sq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ uq0 f33813a;

    protected tq0(uq0 uq0Var) {
        Objects.requireNonNull(uq0Var);
        this.f33813a = uq0Var;
    }

    @Override // com.google.android.libraries.places.internal.sq0, com.google.android.libraries.places.internal.z60
    public void b(b50 b50Var, g70 g70Var) {
        uq0 uq0Var = this.f33813a;
        if (uq0Var.h() == b50.SHUTDOWN) {
            return;
        }
        uq0Var.i(b50Var);
        uq0Var.j(g70Var);
        wq0 wq0Var = uq0Var.f33971e;
        if (wq0Var.f34197h) {
            return;
        }
        wq0Var.e();
    }

    @Override // com.google.android.libraries.places.internal.sq0
    protected final z60 f() {
        return this.f33813a.f33971e.k();
    }
}
