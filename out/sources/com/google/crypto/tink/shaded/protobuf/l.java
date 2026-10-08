package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class l implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f36144a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36145a;

        static {
            int[] iArr = new int[t1.b.values().length];
            f36145a = iArr;
            try {
                iArr[t1.b.f36214k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36145a[t1.b.f36213j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36145a[t1.b.f36211g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36145a[t1.b.f36221s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36145a[t1.b.f36223v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36145a[t1.b.f36219q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36145a[t1.b.f36212h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36145a[t1.b.f36209e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36145a[t1.b.f36222t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36145a[t1.b.f36224w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36145a[t1.b.f36210f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36145a[t1.b.f36215l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l(k kVar) {
        k kVar2 = (k) a0.b(kVar, "output");
        this.f36144a = kVar2;
        kVar2.f36133a = this;
    }

    public static l P(k kVar) {
        l lVar = kVar.f36133a;
        return lVar != null ? lVar : new l(kVar);
    }

    private <K, V> void Q(int i15, k0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f36145a;
        throw null;
    }

    private void R(int i15, Object obj) {
        if (obj instanceof String) {
            this.f36144a.K0(i15, (String) obj);
        } else {
            this.f36144a.i0(i15, (h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void A(int i15, List<Boolean> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.g0(i15, list.get(i16).booleanValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iE = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iE += k.e(list.get(i17).booleanValue());
        }
        this.f36144a.N0(iE);
        while (i16 < list.size()) {
            this.f36144a.h0(list.get(i16).booleanValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void B(int i15, float f15) {
        this.f36144a.r0(i15, f15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    @Deprecated
    public void C(int i15) {
        this.f36144a.L0(i15, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void D(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.G0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iO = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iO += k.O(list.get(i17).intValue());
        }
        this.f36144a.N0(iO);
        while (i16 < list.size()) {
            this.f36144a.H0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void E(int i15, int i16) {
        this.f36144a.l0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void F(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.x0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iY = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iY += k.y(list.get(i17).longValue());
        }
        this.f36144a.N0(iY);
        while (i16 < list.size()) {
            this.f36144a.y0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void G(int i15, List<Double> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.j0(i15, list.get(i16).doubleValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iJ = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iJ += k.j(list.get(i17).doubleValue());
        }
        this.f36144a.N0(iJ);
        while (i16 < list.size()) {
            this.f36144a.k0(list.get(i16).doubleValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void H(int i15, int i16) {
        this.f36144a.G0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void I(int i15, List<h> list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f36144a.i0(i15, list.get(i16));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public <K, V> void J(int i15, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f36144a.b0()) {
            Q(i15, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f36144a.L0(i15, 2);
            this.f36144a.N0(k0.b(aVar, entry.getKey(), entry.getValue()));
            k0.d(this.f36144a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void K(int i15, Object obj, g1 g1Var) {
        this.f36144a.t0(i15, (r0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void L(int i15, List<?> list, g1 g1Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            N(i15, list.get(i16), g1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void M(int i15, h hVar) {
        this.f36144a.i0(i15, hVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void N(int i15, Object obj, g1 g1Var) {
        this.f36144a.z0(i15, (r0) obj, g1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void O(int i15, List<?> list, g1 g1Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            K(i15, list.get(i16), g1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void a(int i15, List<Float> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.r0(i15, list.get(i16).floatValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iR = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iR += k.r(list.get(i17).floatValue());
        }
        this.f36144a.N0(iR);
        while (i16 < list.size()) {
            this.f36144a.s0(list.get(i16).floatValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public final void b(int i15, Object obj) {
        if (obj instanceof h) {
            this.f36144a.B0(i15, (h) obj);
        } else {
            this.f36144a.A0(i15, (r0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void c(int i15, int i16) {
        this.f36144a.n0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void d(int i15, List<String> list) {
        int i16 = 0;
        if (!(list instanceof g0)) {
            while (i16 < list.size()) {
                this.f36144a.K0(i15, list.get(i16));
                i16++;
            }
        } else {
            g0 g0Var = (g0) list;
            while (i16 < list.size()) {
                R(i15, g0Var.K(i16));
                i16++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void e(int i15, String str) {
        this.f36144a.K0(i15, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void f(int i15, long j15) {
        this.f36144a.O0(i15, j15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void g(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.v0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iW += k.w(list.get(i17).intValue());
        }
        this.f36144a.N0(iW);
        while (i16 < list.size()) {
            this.f36144a.w0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void h(int i15, int i16) {
        this.f36144a.v0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void i(int i15, long j15) {
        this.f36144a.E0(i15, j15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void j(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.n0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iN = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iN += k.n(list.get(i17).intValue());
        }
        this.f36144a.N0(iN);
        while (i16 < list.size()) {
            this.f36144a.o0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void k(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.M0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iV = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iV += k.V(list.get(i17).intValue());
        }
        this.f36144a.N0(iV);
        while (i16 < list.size()) {
            this.f36144a.N0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void l(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.I0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iQ = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iQ += k.Q(list.get(i17).longValue());
        }
        this.f36144a.N0(iQ);
        while (i16 < list.size()) {
            this.f36144a.J0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void m(int i15, long j15) {
        this.f36144a.I0(i15, j15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void n(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.l0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iL += k.l(list.get(i17).intValue());
        }
        this.f36144a.N0(iL);
        while (i16 < list.size()) {
            this.f36144a.m0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void o(int i15, int i16) {
        this.f36144a.M0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void p(int i15, double d15) {
        this.f36144a.j0(i15, d15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void q(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.E0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iM = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iM += k.M(list.get(i17).longValue());
        }
        this.f36144a.N0(iM);
        while (i16 < list.size()) {
            this.f36144a.F0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void r(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.O0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iX = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iX += k.X(list.get(i17).longValue());
        }
        this.f36144a.N0(iX);
        while (i16 < list.size()) {
            this.f36144a.P0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void s(int i15, long j15) {
        this.f36144a.p0(i15, j15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public u1.a t() {
        return u1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void u(int i15, long j15) {
        this.f36144a.x0(i15, j15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void v(int i15, boolean z15) {
        this.f36144a.g0(i15, z15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void w(int i15, int i16) {
        this.f36144a.C0(i15, i16);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    @Deprecated
    public void x(int i15) {
        this.f36144a.L0(i15, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void y(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.p0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iP = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iP += k.p(list.get(i17).longValue());
        }
        this.f36144a.N0(iP);
        while (i16 < list.size()) {
            this.f36144a.q0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.u1
    public void z(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f36144a.C0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f36144a.L0(i15, 2);
        int iK = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iK += k.K(list.get(i17).intValue());
        }
        this.f36144a.N0(iK);
        while (i16 < list.size()) {
            this.f36144a.D0(list.get(i16).intValue());
            i16++;
        }
    }
}
