package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class k implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f12032a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12033a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f12033a = iArr;
            try {
                iArr[s1.b.f12104k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12033a[s1.b.f12103j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12033a[s1.b.f12101g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12033a[s1.b.f12111s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12033a[s1.b.f12113v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12033a[s1.b.f12109q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12033a[s1.b.f12102h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12033a[s1.b.f12099e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12033a[s1.b.f12112t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12033a[s1.b.f12114w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12033a[s1.b.f12100f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12033a[s1.b.f12105l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k(j jVar) {
        j jVar2 = (j) z.b(jVar, "output");
        this.f12032a = jVar2;
        jVar2.f11999a = this;
    }

    public static k P(j jVar) {
        k kVar = jVar.f11999a;
        return kVar != null ? kVar : new k(jVar);
    }

    private void Q(int i15, e eVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < eVar.size()) {
                this.f12032a.j0(i15, eVar.g(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iE = 0;
        for (int i17 = 0; i17 < eVar.size(); i17++) {
            iE += j.e(eVar.g(i17));
        }
        this.f12032a.X0(iE);
        while (i16 < eVar.size()) {
            this.f12032a.k0(eVar.g(i16));
            i16++;
        }
    }

    private void R(int i15, List<Boolean> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.j0(i15, list.get(i16).booleanValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iE = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iE += j.e(list.get(i17).booleanValue());
        }
        this.f12032a.X0(iE);
        while (i16 < list.size()) {
            this.f12032a.k0(list.get(i16).booleanValue());
            i16++;
        }
    }

    private <V> void S(int i15, boolean z15, V v15, k0.a<Boolean, V> aVar) {
        this.f12032a.V0(i15, 2);
        this.f12032a.X0(k0.b(aVar, Boolean.valueOf(z15), v15));
        k0.e(this.f12032a, aVar, Boolean.valueOf(z15), v15);
    }

    private <V> void T(int i15, k0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i16 = 0;
        while (it.hasNext()) {
            iArr[i16] = it.next().intValue();
            i16++;
        }
        Arrays.sort(iArr);
        for (int i17 = 0; i17 < size; i17++) {
            int i18 = iArr[i17];
            V v15 = map.get(Integer.valueOf(i18));
            this.f12032a.V0(i15, 2);
            this.f12032a.X0(k0.b(aVar, Integer.valueOf(i18), v15));
            k0.e(this.f12032a, aVar, Integer.valueOf(i18), v15);
        }
    }

    private <V> void U(int i15, k0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i16 = 0;
        while (it.hasNext()) {
            jArr[i16] = it.next().longValue();
            i16++;
        }
        Arrays.sort(jArr);
        for (int i17 = 0; i17 < size; i17++) {
            long j15 = jArr[i17];
            V v15 = map.get(Long.valueOf(j15));
            this.f12032a.V0(i15, 2);
            this.f12032a.X0(k0.b(aVar, Long.valueOf(j15), v15));
            k0.e(this.f12032a, aVar, Long.valueOf(j15), v15);
        }
    }

    private <K, V> void V(int i15, k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f12033a[aVar.f12037a.ordinal()]) {
            case 1:
                V v15 = map.get(Boolean.FALSE);
                if (v15 != null) {
                    S(i15, false, v15, aVar);
                }
                V v16 = map.get(Boolean.TRUE);
                if (v16 != null) {
                    S(i15, true, v16, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i15, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                U(i15, aVar, map);
                return;
            case 12:
                W(i15, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f12037a);
        }
    }

    private <V> void W(int i15, k0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i16 = 0;
        while (it.hasNext()) {
            strArr[i16] = it.next();
            i16++;
        }
        Arrays.sort(strArr);
        for (int i17 = 0; i17 < size; i17++) {
            String str = strArr[i17];
            V v15 = map.get(str);
            this.f12032a.V0(i15, 2);
            this.f12032a.X0(k0.b(aVar, str, v15));
            k0.e(this.f12032a, aVar, str, v15);
        }
    }

    private void X(int i15, l lVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < lVar.size()) {
                this.f12032a.p0(i15, lVar.g(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iJ = 0;
        for (int i17 = 0; i17 < lVar.size(); i17++) {
            iJ += j.j(lVar.g(i17));
        }
        this.f12032a.X0(iJ);
        while (i16 < lVar.size()) {
            this.f12032a.q0(lVar.g(i16));
            i16++;
        }
    }

    private void Y(int i15, List<Double> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.p0(i15, list.get(i16).doubleValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iJ = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iJ += j.j(list.get(i17).doubleValue());
        }
        this.f12032a.X0(iJ);
        while (i16 < list.size()) {
            this.f12032a.q0(list.get(i16).doubleValue());
            i16++;
        }
    }

    private void Z(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.r0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iL += j.l(yVar.l(i17));
        }
        this.f12032a.X0(iL);
        while (i16 < yVar.size()) {
            this.f12032a.s0(yVar.l(i16));
            i16++;
        }
    }

    private void a0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.r0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iL += j.l(list.get(i17).intValue());
        }
        this.f12032a.X0(iL);
        while (i16 < list.size()) {
            this.f12032a.s0(list.get(i16).intValue());
            i16++;
        }
    }

    private void b0(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.t0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iN = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iN += j.n(yVar.l(i17));
        }
        this.f12032a.X0(iN);
        while (i16 < yVar.size()) {
            this.f12032a.u0(yVar.l(i16));
            i16++;
        }
    }

    private void c0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.t0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iN = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iN += j.n(list.get(i17).intValue());
        }
        this.f12032a.X0(iN);
        while (i16 < list.size()) {
            this.f12032a.u0(list.get(i16).intValue());
            i16++;
        }
    }

    private void d0(int i15, i0 i0Var, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < i0Var.size()) {
                this.f12032a.v0(i15, i0Var.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iP = 0;
        for (int i17 = 0; i17 < i0Var.size(); i17++) {
            iP += j.p(i0Var.l(i17));
        }
        this.f12032a.X0(iP);
        while (i16 < i0Var.size()) {
            this.f12032a.w0(i0Var.l(i16));
            i16++;
        }
    }

    private void e0(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.v0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iP = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iP += j.p(list.get(i17).longValue());
        }
        this.f12032a.X0(iP);
        while (i16 < list.size()) {
            this.f12032a.w0(list.get(i16).longValue());
            i16++;
        }
    }

    private void f0(int i15, v vVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < vVar.size()) {
                this.f12032a.x0(i15, vVar.g(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iR = 0;
        for (int i17 = 0; i17 < vVar.size(); i17++) {
            iR += j.r(vVar.g(i17));
        }
        this.f12032a.X0(iR);
        while (i16 < vVar.size()) {
            this.f12032a.y0(vVar.g(i16));
            i16++;
        }
    }

    private void g0(int i15, List<Float> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.x0(i15, list.get(i16).floatValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iR = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iR += j.r(list.get(i17).floatValue());
        }
        this.f12032a.X0(iR);
        while (i16 < list.size()) {
            this.f12032a.y0(list.get(i16).floatValue());
            i16++;
        }
    }

    private void h0(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.D0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iW += j.w(yVar.l(i17));
        }
        this.f12032a.X0(iW);
        while (i16 < yVar.size()) {
            this.f12032a.E0(yVar.l(i16));
            i16++;
        }
    }

    private void i0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.D0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iW += j.w(list.get(i17).intValue());
        }
        this.f12032a.X0(iW);
        while (i16 < list.size()) {
            this.f12032a.E0(list.get(i16).intValue());
            i16++;
        }
    }

    private void j0(int i15, i0 i0Var, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < i0Var.size()) {
                this.f12032a.F0(i15, i0Var.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iY = 0;
        for (int i17 = 0; i17 < i0Var.size(); i17++) {
            iY += j.y(i0Var.l(i17));
        }
        this.f12032a.X0(iY);
        while (i16 < i0Var.size()) {
            this.f12032a.G0(i0Var.l(i16));
            i16++;
        }
    }

    private void k0(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.F0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iY = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iY += j.y(list.get(i17).longValue());
        }
        this.f12032a.X0(iY);
        while (i16 < list.size()) {
            this.f12032a.G0(list.get(i16).longValue());
            i16++;
        }
    }

    private void l0(int i15, Object obj) {
        if (obj instanceof String) {
            this.f12032a.T0(i15, (String) obj);
        } else {
            this.f12032a.n0(i15, (g) obj);
        }
    }

    private void m0(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.L0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iL += j.L(yVar.l(i17));
        }
        this.f12032a.X0(iL);
        while (i16 < yVar.size()) {
            this.f12032a.M0(yVar.l(i16));
            i16++;
        }
    }

    private void n0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.L0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iL = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iL += j.L(list.get(i17).intValue());
        }
        this.f12032a.X0(iL);
        while (i16 < list.size()) {
            this.f12032a.M0(list.get(i16).intValue());
            i16++;
        }
    }

    private void o0(int i15, i0 i0Var, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < i0Var.size()) {
                this.f12032a.N0(i15, i0Var.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iN = 0;
        for (int i17 = 0; i17 < i0Var.size(); i17++) {
            iN += j.N(i0Var.l(i17));
        }
        this.f12032a.X0(iN);
        while (i16 < i0Var.size()) {
            this.f12032a.O0(i0Var.l(i16));
            i16++;
        }
    }

    private void p0(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.N0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iN = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iN += j.N(list.get(i17).longValue());
        }
        this.f12032a.X0(iN);
        while (i16 < list.size()) {
            this.f12032a.O0(list.get(i16).longValue());
            i16++;
        }
    }

    private void q0(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.P0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iP = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iP += j.P(yVar.l(i17));
        }
        this.f12032a.X0(iP);
        while (i16 < yVar.size()) {
            this.f12032a.Q0(yVar.l(i16));
            i16++;
        }
    }

    private void s0(int i15, i0 i0Var, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < i0Var.size()) {
                this.f12032a.R0(i15, i0Var.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iR = 0;
        for (int i17 = 0; i17 < i0Var.size(); i17++) {
            iR += j.R(i0Var.l(i17));
        }
        this.f12032a.X0(iR);
        while (i16 < i0Var.size()) {
            this.f12032a.S0(i0Var.l(i16));
            i16++;
        }
    }

    private void t0(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.R0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iR = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iR += j.R(list.get(i17).longValue());
        }
        this.f12032a.X0(iR);
        while (i16 < list.size()) {
            this.f12032a.S0(list.get(i16).longValue());
            i16++;
        }
    }

    private void u0(int i15, y yVar, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < yVar.size()) {
                this.f12032a.W0(i15, yVar.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < yVar.size(); i17++) {
            iW += j.W(yVar.l(i17));
        }
        this.f12032a.X0(iW);
        while (i16 < yVar.size()) {
            this.f12032a.X0(yVar.l(i16));
            i16++;
        }
    }

    private void w0(int i15, i0 i0Var, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < i0Var.size()) {
                this.f12032a.Y0(i15, i0Var.l(i16));
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iY = 0;
        for (int i17 = 0; i17 < i0Var.size(); i17++) {
            iY += j.Y(i0Var.l(i17));
        }
        this.f12032a.X0(iY);
        while (i16 < i0Var.size()) {
            this.f12032a.Z0(i0Var.l(i16));
            i16++;
        }
    }

    private void x0(int i15, List<Long> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.Y0(i15, list.get(i16).longValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iY = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iY += j.Y(list.get(i17).longValue());
        }
        this.f12032a.X0(iY);
        while (i16 < list.size()) {
            this.f12032a.Z0(list.get(i16).longValue());
            i16++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void A(int i15, List<Boolean> list, boolean z15) {
        if (list instanceof e) {
            Q(i15, (e) list, z15);
        } else {
            R(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void B(int i15, float f15) {
        this.f12032a.x0(i15, f15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    @Deprecated
    public void C(int i15) {
        this.f12032a.V0(i15, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void D(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            q0(i15, (y) list, z15);
        } else {
            r0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void E(int i15, int i16) {
        this.f12032a.r0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void F(int i15, List<Long> list, boolean z15) {
        if (list instanceof i0) {
            j0(i15, (i0) list, z15);
        } else {
            k0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void G(int i15, List<Double> list, boolean z15) {
        if (list instanceof l) {
            X(i15, (l) list, z15);
        } else {
            Y(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void H(int i15, int i16) {
        this.f12032a.P0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void I(int i15, List<g> list) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.f12032a.n0(i15, list.get(i16));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void J(int i15, List<?> list, g1 g1Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            N(i15, list.get(i16), g1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void K(int i15, g gVar) {
        this.f12032a.n0(i15, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void L(int i15, Object obj, g1 g1Var) {
        this.f12032a.H0(i15, (r0) obj, g1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public <K, V> void M(int i15, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f12032a.d0()) {
            V(i15, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f12032a.V0(i15, 2);
            this.f12032a.X0(k0.b(aVar, entry.getKey(), entry.getValue()));
            k0.e(this.f12032a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void N(int i15, Object obj, g1 g1Var) {
        this.f12032a.A0(i15, (r0) obj, g1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void O(int i15, List<?> list, g1 g1Var) {
        for (int i16 = 0; i16 < list.size(); i16++) {
            L(i15, list.get(i16), g1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void a(int i15, List<Float> list, boolean z15) {
        if (list instanceof v) {
            f0(i15, (v) list, z15);
        } else {
            g0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public final void b(int i15, Object obj) {
        if (obj instanceof g) {
            this.f12032a.K0(i15, (g) obj);
        } else {
            this.f12032a.J0(i15, (r0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void c(int i15, int i16) {
        this.f12032a.t0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void d(int i15, List<String> list) {
        int i16 = 0;
        if (!(list instanceof e0)) {
            while (i16 < list.size()) {
                this.f12032a.T0(i15, list.get(i16));
                i16++;
            }
        } else {
            e0 e0Var = (e0) list;
            while (i16 < list.size()) {
                l0(i15, e0Var.K(i16));
                i16++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void e(int i15, String str) {
        this.f12032a.T0(i15, str);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void f(int i15, long j15) {
        this.f12032a.Y0(i15, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void g(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            h0(i15, (y) list, z15);
        } else {
            i0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void h(int i15, int i16) {
        this.f12032a.D0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void i(int i15, long j15) {
        this.f12032a.N0(i15, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void j(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            b0(i15, (y) list, z15);
        } else {
            c0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void k(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            u0(i15, (y) list, z15);
        } else {
            v0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void l(int i15, List<Long> list, boolean z15) {
        if (list instanceof i0) {
            s0(i15, (i0) list, z15);
        } else {
            t0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void m(int i15, long j15) {
        this.f12032a.R0(i15, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void n(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            Z(i15, (y) list, z15);
        } else {
            a0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void o(int i15, int i16) {
        this.f12032a.W0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void p(int i15, double d15) {
        this.f12032a.p0(i15, d15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void q(int i15, List<Long> list, boolean z15) {
        if (list instanceof i0) {
            o0(i15, (i0) list, z15);
        } else {
            p0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void r(int i15, List<Long> list, boolean z15) {
        if (list instanceof i0) {
            w0(i15, (i0) list, z15);
        } else {
            x0(i15, list, z15);
        }
    }

    public void r0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.P0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iP = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iP += j.P(list.get(i17).intValue());
        }
        this.f12032a.X0(iP);
        while (i16 < list.size()) {
            this.f12032a.Q0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void s(int i15, long j15) {
        this.f12032a.v0(i15, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public t1.a t() {
        return t1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void u(int i15, long j15) {
        this.f12032a.F0(i15, j15);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void v(int i15, boolean z15) {
        this.f12032a.j0(i15, z15);
    }

    public void v0(int i15, List<Integer> list, boolean z15) {
        int i16 = 0;
        if (!z15) {
            while (i16 < list.size()) {
                this.f12032a.W0(i15, list.get(i16).intValue());
                i16++;
            }
            return;
        }
        this.f12032a.V0(i15, 2);
        int iW = 0;
        for (int i17 = 0; i17 < list.size(); i17++) {
            iW += j.W(list.get(i17).intValue());
        }
        this.f12032a.X0(iW);
        while (i16 < list.size()) {
            this.f12032a.X0(list.get(i16).intValue());
            i16++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void w(int i15, int i16) {
        this.f12032a.L0(i15, i16);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    @Deprecated
    public void x(int i15) {
        this.f12032a.V0(i15, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void y(int i15, List<Long> list, boolean z15) {
        if (list instanceof i0) {
            d0(i15, (i0) list, z15);
        } else {
            e0(i15, list, z15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void z(int i15, List<Integer> list, boolean z15) {
        if (list instanceof y) {
            m0(i15, (y) list, z15);
        } else {
            n0(i15, list, z15);
        }
    }
}
