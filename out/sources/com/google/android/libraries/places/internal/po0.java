package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class po0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final no0 f33344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp0 f33345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33346c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mo0 f33347d = new mo0(this, 0, 65535, null);

    public po0(no0 no0Var, lp0 lp0Var) {
        this.f33344a = (no0) zj.p.r(no0Var, "transport");
        this.f33345b = (lp0) zj.p.r(lp0Var, "frameWriter");
    }

    public final boolean a(int i15) {
        if (i15 < 0) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 29);
            sb5.append("Invalid initial window size: ");
            sb5.append(i15);
            throw new IllegalArgumentException(sb5.toString());
        }
        int i16 = i15 - this.f33346c;
        this.f33346c = i15;
        for (mo0 mo0Var : this.f33344a.b()) {
            mo0Var.f(i16);
        }
        return i16 > 0;
    }

    public final int b(mo0 mo0Var, int i15) {
        if (mo0Var == null) {
            int iF = this.f33347d.f(i15);
            f();
            return iF;
        }
        int iF2 = mo0Var.f(i15);
        oo0 oo0Var = new oo0(null);
        mo0Var.i(mo0Var.g(), oo0Var);
        if (!oo0Var.a()) {
            return iF2;
        }
        d();
        return iF2;
    }

    public final void c(boolean z15, mo0 mo0Var, nr0 nr0Var, boolean z16) {
        zj.p.r(nr0Var, "source");
        int iG = mo0Var.g();
        boolean zH = mo0Var.h();
        int iK = (int) nr0Var.K();
        if (zH || iG < iK) {
            if (!zH && iG > 0) {
                mo0Var.j(nr0Var, iG, false);
            }
            mo0Var.k(nr0Var, (int) nr0Var.K(), z15);
        } else {
            mo0Var.j(nr0Var, iK, z15);
        }
        if (z16) {
            d();
        }
    }

    public final void d() {
        try {
            this.f33345b.d();
        } catch (IOException e15) {
            throw new RuntimeException(e15);
        }
    }

    public final mo0 e(lo0 lo0Var, int i15) {
        return new mo0(this, i15, this.f33346c, (lo0) zj.p.r(lo0Var, "stream"));
    }

    public final void f() {
        int i15;
        no0 no0Var = this.f33344a;
        mo0[] mo0VarArrB = no0Var.b();
        Collections.shuffle(Arrays.asList(mo0VarArrB));
        int length = mo0VarArrB.length;
        int iA = this.f33347d.a();
        while (true) {
            i15 = 0;
            if (length <= 0 || iA <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iA / length);
            for (int i16 = 0; i16 < length && iA > 0; i16++) {
                mo0 mo0Var = mo0VarArrB[i16];
                int iMin = Math.min(iA, Math.min(mo0Var.d(), iCeil));
                if (iMin > 0) {
                    mo0Var.b(iMin);
                    iA -= iMin;
                }
                if (mo0Var.d() > 0) {
                    mo0VarArrB[i15] = mo0Var;
                    i15++;
                }
            }
            length = i15;
        }
        oo0 oo0Var = new oo0(null);
        mo0[] mo0VarArrB2 = no0Var.b();
        int length2 = mo0VarArrB2.length;
        while (i15 < length2) {
            mo0 mo0Var2 = mo0VarArrB2[i15];
            mo0Var2.i(mo0Var2.c(), oo0Var);
            mo0Var2.e();
            i15++;
        }
        if (oo0Var.a()) {
            d();
        }
    }

    final /* synthetic */ lp0 g() {
        return this.f33345b;
    }

    final /* synthetic */ mo0 h() {
        return this.f33347d;
    }
}
