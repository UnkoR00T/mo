package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f31153a = F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c5<?, ?> f31154b = g(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c5<?, ?> f31155c = g(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c5<?, ?> f31156d = new e5();

    static int A(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i3)) {
            int iN0 = 0;
            while (i15 < size) {
                iN0 += t1.n0(list.get(i15).longValue());
                i15++;
            }
            return iN0;
        }
        i3 i3Var = (i3) list;
        int iN1 = 0;
        while (i15 < size) {
            iN1 += t1.n0(i3Var.g(i15));
            i15++;
        }
        return iN1;
    }

    public static c5<?, ?> B() {
        return f31156d;
    }

    public static void C(int i15, List<Long> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.c(i15, list, z15);
    }

    static int D(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * t1.g0(i15));
    }

    static int E(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n2)) {
            int iB0 = 0;
            while (i15 < size) {
                iB0 += t1.B0(list.get(i15).intValue());
                i15++;
            }
            return iB0;
        }
        n2 n2Var = (n2) list;
        int iB1 = 0;
        while (i15 < size) {
            iB1 += t1.B0(n2Var.f(i15));
            i15++;
        }
        return iB1;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i15, List<Long> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.F(i15, list, z15);
    }

    static int H(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * t1.g0(i15));
    }

    static int I(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n2)) {
            int iK0 = 0;
            while (i15 < size) {
                iK0 += t1.k0(list.get(i15).intValue());
                i15++;
            }
            return iK0;
        }
        n2 n2Var = (n2) list;
        int iK1 = 0;
        while (i15 < size) {
            iK1 += t1.k0(n2Var.f(i15));
            i15++;
        }
        return iK1;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i15, List<Long> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.d(i15, list, z15);
    }

    static int L(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * t1.g0(i15));
    }

    static int M(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n2)) {
            int iO0 = 0;
            while (i15 < size) {
                iO0 += t1.o0(list.get(i15).intValue());
                i15++;
            }
            return iO0;
        }
        n2 n2Var = (n2) list;
        int iO1 = 0;
        while (i15 < size) {
            iO1 += t1.o0(n2Var.f(i15));
            i15++;
        }
        return iO1;
    }

    public static void N(int i15, List<Long> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.E(i15, list, z15);
    }

    static int O(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * t1.g0(i15));
    }

    static int P(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof n2)) {
            int iS0 = 0;
            while (i15 < size) {
                iS0 += t1.s0(list.get(i15).intValue());
                i15++;
            }
            return iS0;
        }
        n2 n2Var = (n2) list;
        int iS1 = 0;
        while (i15 < size) {
            iS1 += t1.s0(n2Var.f(i15));
            i15++;
        }
        return iS1;
    }

    public static void Q(int i15, List<Long> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.e(i15, list, z15);
    }

    static int R(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t1.x0(i15, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.j(i15, list, z15);
    }

    static int U(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t1.q0(i15, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.f(i15, list, z15);
    }

    static int X(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * t1.H(i15, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.t(i15, list, z15);
    }

    static int a(int i15, Object obj, l4 l4Var) {
        return obj instanceof d3 ? t1.c(i15, (d3) obj) : t1.F(i15, (u3) obj, l4Var);
    }

    public static void a0(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.n(i15, list, z15);
    }

    static int b(int i15, List<?> list) {
        int size = list.size();
        int i16 = 0;
        if (size == 0) {
            return 0;
        }
        int iG0 = t1.g0(i15) * size;
        if (!(list instanceof f3)) {
            while (i16 < size) {
                Object obj = list.get(i16);
                iG0 += obj instanceof e1 ? t1.I((e1) obj) : t1.K((String) obj);
                i16++;
            }
            return iG0;
        }
        f3 f3Var = (f3) list;
        while (i16 < size) {
            Object objP = f3Var.p(i16);
            iG0 += objP instanceof e1 ? t1.I((e1) objP) : t1.K((String) objP);
            i16++;
        }
        return iG0;
    }

    public static void b0(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.D(i15, list, z15);
    }

    static int c(int i15, List<?> list, l4 l4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = t1.g0(i15) * size;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            iG0 += obj instanceof d3 ? t1.d((d3) obj) : t1.e((u3) obj, l4Var);
        }
        return iG0;
    }

    public static void c0(int i15, List<Integer> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.B(i15, list, z15);
    }

    static int d(int i15, List<Long> list, boolean z15) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * t1.g0(i15));
    }

    public static void d0(int i15, List<Boolean> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.A(i15, list, z15);
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i3)) {
            int iD0 = 0;
            while (i15 < size) {
                iD0 += t1.d0(list.get(i15).longValue());
                i15++;
            }
            return iD0;
        }
        i3 i3Var = (i3) list;
        int iD1 = 0;
        while (i15 < size) {
            iD1 += t1.d0(i3Var.g(i15));
            i15++;
        }
        return iD1;
    }

    public static c5<?, ?> f() {
        return f31154b;
    }

    private static c5<?, ?> g(boolean z15) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (c5) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z15));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i15, int i16, UB ub5, c5<UT, UB> c5Var) {
        if (ub5 == null) {
            ub5 = c5Var.a();
        }
        c5Var.b(ub5, i15, i16);
        return ub5;
    }

    static <UT, UB> UB i(int i15, List<Integer> list, q2 q2Var, UB ub5, c5<UT, UB> c5Var) {
        if (q2Var == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!q2Var.b(iIntValue)) {
                    ub5 = (UB) h(i15, iIntValue, ub5, c5Var);
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
            if (q2Var.b(iIntValue2)) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) h(i15, iIntValue2, ub5, c5Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }

    public static void j(int i15, List<String> list, z5 z5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.y(i15, list);
    }

    public static void k(int i15, List<?> list, z5 z5Var, l4 l4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.N(i15, list, l4Var);
    }

    public static void l(int i15, List<Double> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.g(i15, list, z15);
    }

    static <T, FT extends g2<FT>> void m(a2<FT> a2Var, T t15, T t16) {
        e2<T> e2VarB = a2Var.b(t16);
        if (e2VarB.f31003a.isEmpty()) {
            return;
        }
        a2Var.f(t15).f(e2VarB);
    }

    static <T> void n(r3 r3Var, T t15, T t16, long j15) {
        i5.j(t15, j15, r3Var.g(i5.F(t15, j15), i5.F(t16, j15)));
    }

    static <T, UT, UB> void o(c5<UT, UB> c5Var, T t15, T t16) {
        c5Var.e(t15, c5Var.i(c5Var.f(t15), c5Var.f(t16)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!l2.class.isAssignableFrom(cls) && (cls2 = f31153a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i15, List<e1> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = size * t1.g0(i15);
        for (int i16 = 0; i16 < list.size(); i16++) {
            iG0 += t1.I(list.get(i16));
        }
        return iG0;
    }

    static int s(int i15, List<u3> list, l4 l4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iU += t1.U(i15, list.get(i16), l4Var);
        }
        return iU;
    }

    static int t(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * t1.g0(i15));
    }

    static int u(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i3)) {
            int iI0 = 0;
            while (i15 < size) {
                iI0 += t1.i0(list.get(i15).longValue());
                i15++;
            }
            return iI0;
        }
        i3 i3Var = (i3) list;
        int iI1 = 0;
        while (i15 < size) {
            iI1 += t1.i0(i3Var.g(i15));
            i15++;
        }
        return iI1;
    }

    public static c5<?, ?> v() {
        return f31155c;
    }

    public static void w(int i15, List<e1> list, z5 z5Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.u(i15, list);
    }

    public static void x(int i15, List<?> list, z5 z5Var, l4 l4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.K(i15, list, l4Var);
    }

    public static void y(int i15, List<Float> list, z5 z5Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z5Var.G(i15, list, z15);
    }

    static int z(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * t1.g0(i15));
    }
}
