package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f36099a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n1<?, ?> f36100b = C(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n1<?, ?> f36101c = C(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final n1<?, ?> f36102d = new p1();

    static <UT, UB> UB A(Object obj, int i15, List<Integer> list, a0.e eVar, UB ub5, n1<UT, UB> n1Var) {
        if (eVar == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.a(iIntValue)) {
                    ub5 = (UB) L(obj, i15, iIntValue, ub5, n1Var);
                    it.remove();
                }
            }
            return ub5;
        }
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Integer num = list.get(i17);
            int iIntValue2 = num.intValue();
            if (eVar.a(iIntValue2)) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) L(obj, i15, iIntValue2, ub5, n1Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static n1<?, ?> C(boolean z15) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (n1) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z15));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t15, T t16) {
        u<T> uVarC = qVar.c(t16);
        if (uVarC.m()) {
            return;
        }
        qVar.d(t15).u(uVarC);
    }

    static <T> void F(m0 m0Var, T t15, T t16, long j15) {
        r1.R(t15, j15, m0Var.a(r1.C(t15, j15), r1.C(t16, j15)));
    }

    static <T, UT, UB> void G(n1<UT, UB> n1Var, T t15, T t16) {
        n1Var.p(t15, n1Var.k(n1Var.g(t15), n1Var.g(t16)));
    }

    public static n1<?, ?> H() {
        return f36100b;
    }

    public static n1<?, ?> I() {
        return f36101c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = f36099a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB L(Object obj, int i15, int i16, UB ub5, n1<UT, UB> n1Var) {
        if (ub5 == null) {
            ub5 = n1Var.f(obj);
        }
        n1Var.e(ub5, i15, i16);
        return ub5;
    }

    public static n1<?, ?> M() {
        return f36102d;
    }

    public static void N(int i15, List<Boolean> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.A(i15, list, z15);
    }

    public static void O(int i15, List<h> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.I(i15, list);
    }

    public static void P(int i15, List<Double> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.G(i15, list, z15);
    }

    public static void Q(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.n(i15, list, z15);
    }

    public static void R(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.j(i15, list, z15);
    }

    public static void S(int i15, List<Long> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.y(i15, list, z15);
    }

    public static void T(int i15, List<Float> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.a(i15, list, z15);
    }

    public static void U(int i15, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.O(i15, list, g1Var);
    }

    public static void V(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.g(i15, list, z15);
    }

    public static void W(int i15, List<Long> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.F(i15, list, z15);
    }

    public static void X(int i15, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.L(i15, list, g1Var);
    }

    public static void Y(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.z(i15, list, z15);
    }

    public static void Z(int i15, List<Long> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.q(i15, list, z15);
    }

    static int a(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? k.T(i15) + k.C(size) : size * k.d(i15, true);
    }

    public static void a0(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.D(i15, list, z15);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i15, List<Long> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.l(i15, list, z15);
    }

    static int c(int i15, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = size * k.T(i15);
        for (int i16 = 0; i16 < list.size(); i16++) {
            iT += k.h(list.get(i16));
        }
        return iT;
    }

    public static void c0(int i15, List<String> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.d(i15, list);
    }

    static int d(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z15 ? k.T(i15) + k.C(iE) : iE + (size * k.T(i15));
    }

    public static void d0(int i15, List<Integer> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.k(i15, list, z15);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iL = 0;
            while (i15 < size) {
                iL += k.l(list.get(i15).intValue());
                i15++;
            }
            return iL;
        }
        z zVar = (z) list;
        int iL2 = 0;
        while (i15 < size) {
            iL2 += k.l(zVar.l(i15));
            i15++;
        }
        return iL2;
    }

    public static void e0(int i15, List<Long> list, u1 u1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u1Var.r(i15, list, z15);
    }

    static int f(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? k.T(i15) + k.C(size * 4) : size * k.m(i15, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? k.T(i15) + k.C(size * 8) : size * k.o(i15, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i15, List<r0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iS += k.s(i15, list.get(i16), g1Var);
        }
        return iS;
    }

    static int k(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z15 ? k.T(i15) + k.C(iL) : iL + (size * k.T(i15));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iW = 0;
            while (i15 < size) {
                iW += k.w(list.get(i15).intValue());
                i15++;
            }
            return iW;
        }
        z zVar = (z) list;
        int iW2 = 0;
        while (i15 < size) {
            iW2 += k.w(zVar.l(i15));
            i15++;
        }
        return iW2;
    }

    static int m(int i15, List<Long> list, boolean z15) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z15 ? k.T(i15) + k.C(iN) : iN + (list.size() * k.T(i15));
    }

    static int n(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iY = 0;
            while (i15 < size) {
                iY += k.y(list.get(i15).longValue());
                i15++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i15 < size) {
            iY2 += k.y(i0Var.l(i15));
            i15++;
        }
        return iY2;
    }

    static int o(int i15, Object obj, g1 g1Var) {
        return obj instanceof e0 ? k.A(i15, (e0) obj) : k.F(i15, (r0) obj, g1Var);
    }

    static int p(int i15, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = k.T(i15) * size;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            iT += obj instanceof e0 ? k.B((e0) obj) : k.H((r0) obj, g1Var);
        }
        return iT;
    }

    static int q(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z15 ? k.T(i15) + k.C(iR) : iR + (size * k.T(i15));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iO = 0;
            while (i15 < size) {
                iO += k.O(list.get(i15).intValue());
                i15++;
            }
            return iO;
        }
        z zVar = (z) list;
        int iO2 = 0;
        while (i15 < size) {
            iO2 += k.O(zVar.l(i15));
            i15++;
        }
        return iO2;
    }

    static int s(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z15 ? k.T(i15) + k.C(iT) : iT + (size * k.T(i15));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iQ = 0;
            while (i15 < size) {
                iQ += k.Q(list.get(i15).longValue());
                i15++;
            }
            return iQ;
        }
        i0 i0Var = (i0) list;
        int iQ2 = 0;
        while (i15 < size) {
            iQ2 += k.Q(i0Var.l(i15));
            i15++;
        }
        return iQ2;
    }

    static int u(int i15, List<?> list) {
        int size = list.size();
        int i16 = 0;
        if (size == 0) {
            return 0;
        }
        int iT = k.T(i15) * size;
        if (!(list instanceof g0)) {
            while (i16 < size) {
                Object obj = list.get(i16);
                iT += obj instanceof h ? k.h((h) obj) : k.S((String) obj);
                i16++;
            }
            return iT;
        }
        g0 g0Var = (g0) list;
        while (i16 < size) {
            Object objK = g0Var.K(i16);
            iT += objK instanceof h ? k.h((h) objK) : k.S((String) objK);
            i16++;
        }
        return iT;
    }

    static int v(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z15 ? k.T(i15) + k.C(iW) : iW + (size * k.T(i15));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iV = 0;
            while (i15 < size) {
                iV += k.V(list.get(i15).intValue());
                i15++;
            }
            return iV;
        }
        z zVar = (z) list;
        int iV2 = 0;
        while (i15 < size) {
            iV2 += k.V(zVar.l(i15));
            i15++;
        }
        return iV2;
    }

    static int x(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z15 ? k.T(i15) + k.C(iY) : iY + (size * k.T(i15));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iX = 0;
            while (i15 < size) {
                iX += k.X(list.get(i15).longValue());
                i15++;
            }
            return iX;
        }
        i0 i0Var = (i0) list;
        int iX2 = 0;
        while (i15 < size) {
            iX2 += k.X(i0Var.l(i15));
            i15++;
        }
        return iX2;
    }

    static <UT, UB> UB z(Object obj, int i15, List<Integer> list, a0.d<?> dVar, UB ub5, n1<UT, UB> n1Var) {
        if (dVar == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.a(iIntValue) == null) {
                    ub5 = (UB) L(obj, i15, iIntValue, ub5, n1Var);
                    it.remove();
                }
            }
            return ub5;
        }
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Integer num = list.get(i17);
            int iIntValue2 = num.intValue();
            if (dVar.a(iIntValue2) != null) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) L(obj, i15, iIntValue2, ub5, n1Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }
}
