package com.google.android.gms.internal.clearcut;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class o0 implements p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f29476a;

    private o0(m0 m0Var) {
        m0 m0Var2 = (m0) h1.e(m0Var, "output");
        this.f29476a = m0Var2;
        m0Var2.f29414a = this;
    }

    public static o0 b(m0 m0Var) {
        o0 o0Var = m0Var.f29414a;
        return o0Var != null ? o0Var : new o0(m0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void A(int i15, List<Boolean> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.K(i15, list.get(i16).booleanValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iF = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iF += m0.F(list.get(i17).booleanValue());
        }
        this.f29476a.y0(iF);
        while (i16 < list.size()) {
            this.f29476a.t(list.get(i16).booleanValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void B(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.T(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iH0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iH0 += m0.H0(list.get(i17).intValue());
        }
        this.f29476a.y0(iH0);
        while (i16 < list.size()) {
            this.f29476a.x0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void C(int i15, String str) {
        this.f29476a.p(i15, str);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void D(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.i0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iG0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iG0 += m0.G0(list.get(i17).intValue());
        }
        this.f29476a.y0(iG0);
        while (i16 < list.size()) {
            this.f29476a.A0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void E(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.U(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iP0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iP0 += m0.p0(list.get(i17).longValue());
        }
        this.f29476a.y0(iP0);
        while (i16 < list.size()) {
            this.f29476a.c0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void F(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.l(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iH0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iH0 += m0.h0(list.get(i17).longValue());
        }
        this.f29476a.y0(iH0);
        while (i16 < list.size()) {
            this.f29476a.L(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void G(int i15, List<Float> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.k(i15, list.get(i16).floatValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iX = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iX += m0.x(list.get(i17).floatValue());
        }
        this.f29476a.y0(iX);
        while (i16 < list.size()) {
            this.f29476a.i(list.get(i16).floatValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void H(int i15, List<?> list, c3 c3Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            M(i15, list.get(i16), c3Var);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void I(int i15, List<?> list, c3 c3Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            L(i15, list.get(i16), c3Var);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void J(int i15) {
        this.f29476a.G(i15, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void K(int i15, a0 a0Var) {
        this.f29476a.m(i15, a0Var);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void L(int i15, Object obj, c3 c3Var) {
        this.f29476a.o(i15, (l2) obj, c3Var);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void M(int i15, Object obj, c3 c3Var) {
        m0 m0Var = this.f29476a;
        m0Var.G(i15, 3);
        c3Var.e((l2) obj, m0Var.f29414a);
        m0Var.G(i15, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final int N() {
        return f1.e.f29331l;
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void O(int i15, long j15) {
        this.f29476a.l(i15, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void P(int i15, int i16) {
        this.f29476a.T(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void Q(int i15) {
        this.f29476a.G(i15, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final <K, V> void R(int i15, e2<K, V> e2Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f29476a.G(i15, 2);
            this.f29476a.y0(d2.a(e2Var, entry.getKey(), entry.getValue()));
            d2.b(this.f29476a, e2Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void S(int i15, int i16) {
        this.f29476a.i0(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void a(int i15, long j15) {
        this.f29476a.U(i15, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void c(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.l(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iE0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iE0 += m0.e0(list.get(i17).longValue());
        }
        this.f29476a.y0(iE0);
        while (i16 < list.size()) {
            this.f29476a.L(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void d(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.H(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iL0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iL0 += m0.l0(list.get(i17).longValue());
        }
        this.f29476a.y0(iL0);
        while (i16 < list.size()) {
            this.f29476a.V(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void e(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.U(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iS0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iS0 += m0.s0(list.get(i17).longValue());
        }
        this.f29476a.y0(iS0);
        while (i16 < list.size()) {
            this.f29476a.c0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void f(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.b0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iD0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iD0 += m0.D0(list.get(i17).intValue());
        }
        this.f29476a.y0(iD0);
        while (i16 < list.size()) {
            this.f29476a.y0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void g(int i15, List<Double> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.j(i15, list.get(i16).doubleValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iW += m0.w(list.get(i17).doubleValue());
        }
        this.f29476a.y0(iW);
        while (i16 < list.size()) {
            this.f29476a.h(list.get(i16).doubleValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void h(int i15, long j15) {
        this.f29476a.H(i15, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void j(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.T(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iC0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iC0 += m0.C0(list.get(i17).intValue());
        }
        this.f29476a.y0(iC0);
        while (i16 < list.size()) {
            this.f29476a.x0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void k(int i15, boolean z15) {
        this.f29476a.K(i15, z15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void l(int i15, int i16) {
        this.f29476a.T(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void m(int i15, Object obj) {
        if (obj instanceof a0) {
            this.f29476a.I(i15, (a0) obj);
        } else {
            this.f29476a.J(i15, (l2) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void n(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.i0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iF0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iF0 += m0.F0(list.get(i17).intValue());
        }
        this.f29476a.y0(iF0);
        while (i16 < list.size()) {
            this.f29476a.A0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void o(int i15, long j15) {
        this.f29476a.l(i15, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void q(int i15, double d15) {
        this.f29476a.j(i15, d15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void r(int i15, float f15) {
        this.f29476a.k(i15, f15);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void s(int i15, int i16) {
        this.f29476a.i0(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void t(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f29476a.f0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f29476a.G(i15, 2);
        int iE0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iE0 += m0.E0(list.get(i17).intValue());
        }
        this.f29476a.y0(iE0);
        while (i16 < list.size()) {
            this.f29476a.z0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void u(int i15, List<a0> list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f29476a.m(i15, list.get(i16));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void v(int i15, int i16) {
        this.f29476a.b0(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void x(int i15, int i16) {
        this.f29476a.f0(i15, i16);
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void y(int i15, List<String> list) {
        int i16 = 0;
        if (!(list instanceof u1)) {
            while (i16 < list.size()) {
                this.f29476a.p(i15, list.get(i16));
                i16++;
            }
            return;
        }
        u1 u1Var = (u1) list;
        while (i16 < list.size()) {
            Object objK = u1Var.K(i16);
            if (objK instanceof String) {
                this.f29476a.p(i15, (String) objK);
            } else {
                this.f29476a.m(i15, (a0) objK);
            }
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.p4
    public final void z(int i15, long j15) {
        this.f29476a.U(i15, j15);
    }
}
