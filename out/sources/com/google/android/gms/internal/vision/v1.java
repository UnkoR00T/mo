package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class v1 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f31294a;

    private v1(t1 t1Var) {
        t1 t1Var2 = (t1) p2.f(t1Var, "output");
        this.f31294a = t1Var2;
        t1Var2.f31259a = this;
    }

    public static v1 O(t1 t1Var) {
        v1 v1Var = t1Var.f31259a;
        return v1Var != null ? v1Var : new v1(t1Var);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void A(int i15, List<Boolean> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.s(i15, list.get(i16).booleanValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iL += t1.L(list.get(i17).booleanValue());
        }
        this.f31294a.O(iL);
        while (i16 < list.size()) {
            this.f31294a.y(list.get(i16).booleanValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void B(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.P(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iB0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iB0 += t1.B0(list.get(i17).intValue());
        }
        this.f31294a.O(iB0);
        while (i16 < list.size()) {
            this.f31294a.j(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void C(int i15, String str) {
        this.f31294a.r(i15, str);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void D(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.j0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iZ0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iZ0 += t1.z0(list.get(i17).intValue());
        }
        this.f31294a.O(iZ0);
        while (i16 < list.size()) {
            this.f31294a.e0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void E(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.Y(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iR0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iR0 += t1.r0(list.get(i17).longValue());
        }
        this.f31294a.O(iR0);
        while (i16 < list.size()) {
            this.f31294a.Z(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void F(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.n(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iI0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iI0 += t1.i0(list.get(i17).longValue());
        }
        this.f31294a.O(iI0);
        while (i16 < list.size()) {
            this.f31294a.t(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void G(int i15, List<Float> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.l(i15, list.get(i16).floatValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iA = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iA += t1.A(list.get(i17).floatValue());
        }
        this.f31294a.O(iA);
        while (i16 < list.size()) {
            this.f31294a.i(list.get(i16).floatValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void H(int i15, long j15) {
        this.f31294a.Q(i15, j15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void I(int i15, e1 e1Var) {
        this.f31294a.o(i15, e1Var);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final <K, V> void J(int i15, p3<K, V> p3Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f31294a.m(i15, 2);
            this.f31294a.O(m3.a(p3Var, entry.getKey(), entry.getValue()));
            m3.b(this.f31294a, p3Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void K(int i15, List<?> list, l4 l4Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            M(i15, list.get(i16), l4Var);
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void L(int i15, Object obj, l4 l4Var) {
        this.f31294a.q(i15, (u3) obj, l4Var);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void M(int i15, Object obj, l4 l4Var) {
        t1 t1Var = this.f31294a;
        t1Var.m(i15, 3);
        l4Var.d((u3) obj, t1Var.f31259a);
        t1Var.m(i15, 4);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void N(int i15, List<?> list, l4 l4Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            L(i15, list.get(i16), l4Var);
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void a(int i15, long j15) {
        this.f31294a.n(i15, j15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void b(int i15) {
        this.f31294a.m(i15, 3);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void c(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.n(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iD0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iD0 += t1.d0(list.get(i17).longValue());
        }
        this.f31294a.O(iD0);
        while (i16 < list.size()) {
            this.f31294a.t(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void d(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.Q(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iN0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iN0 += t1.n0(list.get(i17).longValue());
        }
        this.f31294a.O(iN0);
        while (i16 < list.size()) {
            this.f31294a.S(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void e(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.Y(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iV0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iV0 += t1.v0(list.get(i17).longValue());
        }
        this.f31294a.O(iV0);
        while (i16 < list.size()) {
            this.f31294a.Z(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void f(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.X(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iO0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iO0 += t1.o0(list.get(i17).intValue());
        }
        this.f31294a.O(iO0);
        while (i16 < list.size()) {
            this.f31294a.O(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void g(int i15, List<Double> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.k(i15, list.get(i16).doubleValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iZ = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iZ += t1.z(list.get(i17).doubleValue());
        }
        this.f31294a.O(iZ);
        while (i16 < list.size()) {
            this.f31294a.h(list.get(i16).doubleValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void h(int i15, long j15) {
        this.f31294a.Y(i15, j15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void i(int i15, int i16) {
        this.f31294a.P(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void j(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.P(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iK0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iK0 += t1.k0(list.get(i17).intValue());
        }
        this.f31294a.O(iK0);
        while (i16 < list.size()) {
            this.f31294a.j(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void k(int i15, int i16) {
        this.f31294a.j0(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void l(int i15, int i16) {
        this.f31294a.P(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void m(int i15, Object obj) {
        if (obj instanceof e1) {
            this.f31294a.R(i15, (e1) obj);
        } else {
            this.f31294a.p(i15, (u3) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void n(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.j0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iW0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iW0 += t1.w0(list.get(i17).intValue());
        }
        this.f31294a.O(iW0);
        while (i16 < list.size()) {
            this.f31294a.e0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void o(int i15, long j15) {
        this.f31294a.n(i15, j15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void p(int i15) {
        this.f31294a.m(i15, 4);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void q(int i15, double d15) {
        this.f31294a.k(i15, d15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void r(int i15, float f15) {
        this.f31294a.l(i15, f15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void s(int i15, int i16) {
        this.f31294a.f0(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void t(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f31294a.f0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f31294a.m(i15, 2);
        int iS0 = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iS0 += t1.s0(list.get(i17).intValue());
        }
        this.f31294a.O(iS0);
        while (i16 < list.size()) {
            this.f31294a.W(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void u(int i15, List<e1> list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f31294a.o(i15, list.get(i16));
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void v(int i15, int i16) {
        this.f31294a.j0(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void w(int i15, long j15) {
        this.f31294a.Y(i15, j15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void x(int i15, int i16) {
        this.f31294a.X(i15, i16);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void y(int i15, List<String> list) {
        int i16 = 0;
        if (!(list instanceof f3)) {
            while (i16 < list.size()) {
                this.f31294a.r(i15, list.get(i16));
                i16++;
            }
            return;
        }
        f3 f3Var = (f3) list;
        while (i16 < list.size()) {
            Object objP = f3Var.p(i16);
            if (objP instanceof String) {
                this.f31294a.r(i15, (String) objP);
            } else {
                this.f31294a.o(i15, (e1) objP);
            }
            i16++;
        }
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final void z(int i15, boolean z15) {
        this.f31294a.s(i15, z15);
    }

    @Override // com.google.android.gms.internal.vision.z5
    public final int zza() {
        return y5.f31358a;
    }
}
