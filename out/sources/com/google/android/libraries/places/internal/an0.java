package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class an0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ en0 f31673a;

    an0(en0 en0Var) {
        Objects.requireNonNull(en0Var);
        this.f31673a = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            en0 en0Var = this.f31673a;
            if (en0Var.y() != null && en0Var.d().K() > 0) {
                en0Var.y().q1(en0Var.d(), en0Var.d().K());
            }
        } catch (IOException e15) {
            this.f31673a.p().h(e15);
        }
        try {
            en0 en0Var2 = this.f31673a;
            if (en0Var2.y() != null) {
                en0Var2.y().close();
            }
        } catch (IOException e16) {
            this.f31673a.p().h(e16);
        }
        try {
            en0 en0Var3 = this.f31673a;
            if (en0Var3.C() != null) {
                en0Var3.C().close();
            }
        } catch (IOException e17) {
            this.f31673a.p().h(e17);
        }
    }
}
