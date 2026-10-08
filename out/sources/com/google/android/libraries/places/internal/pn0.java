package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class pn0 implements ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ rn0 f33340a;

    pn0(rn0 rn0Var) {
        Objects.requireNonNull(rn0Var);
        this.f33340a = rn0Var;
    }

    @Override // com.google.android.libraries.places.internal.ba0
    public final void a(l90 l90Var) {
        int i15 = fr0.f32341a;
        rn0 rn0Var = this.f33340a;
        synchronized (rn0Var.H().U()) {
            rn0Var.H().R(l90Var, true, null);
        }
    }

    @Override // com.google.android.libraries.places.internal.ba0
    public final void b(wm0 wm0Var, boolean z15, boolean z16, int i15) {
        nr0 nr0VarE;
        int i16 = fr0.f32341a;
        if (wm0Var == null) {
            nr0VarE = rn0.f33520q;
        } else {
            nr0VarE = ((jo0) wm0Var).e();
            int iK = (int) nr0VarE.K();
            if (iK > 0) {
                this.f33340a.i(iK);
            }
        }
        rn0 rn0Var = this.f33340a;
        synchronized (rn0Var.H().U()) {
            rn0Var.H().S(nr0VarE, z15, z16);
            rn0Var.w().c(i15);
        }
    }

    @Override // com.google.android.libraries.places.internal.ba0
    public final void c(a80 a80Var, byte[] bArr) {
        int i15 = fr0.f32341a;
        rn0 rn0Var = this.f33340a;
        String strB = rn0Var.D().b();
        StringBuilder sb5 = new StringBuilder(String.valueOf(strB).length() + 1);
        sb5.append("/");
        sb5.append(strB);
        String string = sb5.toString();
        synchronized (rn0Var.H().U()) {
            rn0Var.H().T(a80Var, string);
        }
    }
}
