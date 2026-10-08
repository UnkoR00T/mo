package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f29296a = C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u3<?, ?> f29297b = w(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u3<?, ?> f29298c = w(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u3<?, ?> f29299d = new w3();

    public static u3<?, ?> A() {
        return f29298c;
    }

    public static u3<?, ?> B() {
        return f29299d;
    }

    private static Class<?> C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int E(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g1)) {
            int iC0 = 0;
            while (i15 < size) {
                iC0 += m0.C0(list.get(i15).intValue());
                i15++;
            }
            return iC0;
        }
        g1 g1Var = (g1) list;
        int iC1 = 0;
        while (i15 < size) {
            iC1 += m0.C0(g1Var.f(i15));
            i15++;
        }
        return iC1;
    }

    public static void F(int i15, List<Long> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.d(i15, list, z15);
    }

    static int G(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g1)) {
            int iD0 = 0;
            while (i15 < size) {
                iD0 += m0.D0(list.get(i15).intValue());
                i15++;
            }
            return iD0;
        }
        g1 g1Var = (g1) list;
        int iD1 = 0;
        while (i15 < size) {
            iD1 += m0.D0(g1Var.f(i15));
            i15++;
        }
        return iD1;
    }

    public static void H(int i15, List<Long> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.E(i15, list, z15);
    }

    public static void I(Class<?> cls) {
        Class<?> cls2;
        if (!f1.class.isAssignableFrom(cls) && (cls2 = f29296a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int J(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g1)) {
            int iE0 = 0;
            while (i15 < size) {
                iE0 += m0.E0(list.get(i15).intValue());
                i15++;
            }
            return iE0;
        }
        g1 g1Var = (g1) list;
        int iE1 = 0;
        while (i15 < size) {
            iE1 += m0.E0(g1Var.f(i15));
            i15++;
        }
        return iE1;
    }

    public static void K(int i15, List<Long> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.e(i15, list, z15);
    }

    static int L(List<?> list) {
        return list.size() << 2;
    }

    public static void M(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.j(i15, list, z15);
    }

    static int N(List<?> list) {
        return list.size() << 3;
    }

    public static void O(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.f(i15, list, z15);
    }

    static int P(List<?> list) {
        return list.size();
    }

    public static void Q(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.t(i15, list, z15);
    }

    public static void R(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.n(i15, list, z15);
    }

    public static void S(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.D(i15, list, z15);
    }

    public static void T(int i15, List<Integer> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.B(i15, list, z15);
    }

    public static void U(int i15, List<Boolean> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.A(i15, list, z15);
    }

    static int V(int i15, List<Long> list, boolean z15) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * m0.B0(i15));
    }

    static int W(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * m0.B0(i15));
    }

    static int X(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * m0.B0(i15));
    }

    static int Y(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * m0.B0(i15));
    }

    static int Z(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * m0.B0(i15));
    }

    static int a(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int iE0 = 0;
            while (i15 < size) {
                iE0 += m0.e0(list.get(i15).longValue());
                i15++;
            }
            return iE0;
        }
        z1 z1Var = (z1) list;
        int iE1 = 0;
        while (i15 < size) {
            iE1 += m0.e0(z1Var.f(i15));
            i15++;
        }
        return iE1;
    }

    static int a0(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * m0.B0(i15));
    }

    private static <UT, UB> UB b(int i15, int i16, UB ub5, u3<UT, UB> u3Var) {
        if (ub5 == null) {
            ub5 = u3Var.f();
        }
        u3Var.a(ub5, i15, i16);
        return ub5;
    }

    static int b0(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * m0.B0(i15));
    }

    static <UT, UB> UB c(int i15, List<Integer> list, j1<?> j1Var, UB ub5, u3<UT, UB> u3Var) {
        if (j1Var == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (j1Var.p(iIntValue) == null) {
                    ub5 = (UB) b(i15, iIntValue, ub5, u3Var);
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
            if (j1Var.p(iIntValue2) != null) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) b(i15, iIntValue2, ub5, u3Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }

    static int c0(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * m0.t0(i15, 0);
    }

    public static void d(int i15, List<String> list, p4 p4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.y(i15, list);
    }

    static int d0(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * m0.k0(i15, 0L);
    }

    public static void e(int i15, List<?> list, p4 p4Var, c3 c3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.I(i15, list, c3Var);
    }

    static int e0(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * m0.Q(i15, true);
    }

    public static void f(int i15, List<Double> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.g(i15, list, z15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends z0<FT>> void g(s0<FT> s0Var, T t15, T t16) {
        w0<T> w0VarB = s0Var.b(t16);
        if (w0VarB.b()) {
            return;
        }
        s0Var.e(t15).h(w0VarB);
    }

    static <T> void h(g2 g2Var, T t15, T t16, long j15) {
        b4.i(t15, j15, g2Var.e(b4.M(t15, j15), b4.M(t16, j15)));
    }

    static <T, UT, UB> void i(u3<UT, UB> u3Var, T t15, T t16) {
        u3Var.g(t15, u3Var.i(u3Var.k(t15), u3Var.k(t16)));
    }

    static int j(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int iH0 = 0;
            while (i15 < size) {
                iH0 += m0.h0(list.get(i15).longValue());
                i15++;
            }
            return iH0;
        }
        z1 z1Var = (z1) list;
        int iH1 = 0;
        while (i15 < size) {
            iH1 += m0.h0(z1Var.f(i15));
            i15++;
        }
        return iH1;
    }

    public static void k(int i15, List<a0> list, p4 p4Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.u(i15, list);
    }

    public static void l(int i15, List<?> list, p4 p4Var, c3 c3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.H(i15, list, c3Var);
    }

    public static void m(int i15, List<Float> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.G(i15, list, z15);
    }

    static int n(int i15, Object obj, c3 c3Var) {
        return obj instanceof s1 ? m0.d(i15, (s1) obj) : m0.B(i15, (l2) obj, c3Var);
    }

    static int o(int i15, List<?> list) {
        int size = list.size();
        int i16 = 0;
        if (size == 0) {
            return 0;
        }
        int iB0 = m0.B0(i15) * size;
        if (!(list instanceof u1)) {
            while (i16 < size) {
                Object obj = list.get(i16);
                iB0 += obj instanceof a0 ? m0.D((a0) obj) : m0.q0((String) obj);
                i16++;
            }
            return iB0;
        }
        u1 u1Var = (u1) list;
        while (i16 < size) {
            Object objK = u1Var.K(i16);
            iB0 += objK instanceof a0 ? m0.D((a0) objK) : m0.q0((String) objK);
            i16++;
        }
        return iB0;
    }

    static int p(int i15, List<?> list, c3 c3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = m0.B0(i15) * size;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            iB0 += obj instanceof s1 ? m0.e((s1) obj) : m0.E((l2) obj, c3Var);
        }
        return iB0;
    }

    static int q(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1)) {
            int iL0 = 0;
            while (i15 < size) {
                iL0 += m0.l0(list.get(i15).longValue());
                i15++;
            }
            return iL0;
        }
        z1 z1Var = (z1) list;
        int iL1 = 0;
        while (i15 < size) {
            iL1 += m0.l0(z1Var.f(i15));
            i15++;
        }
        return iL1;
    }

    public static void r(int i15, List<Long> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.c(i15, list, z15);
    }

    public static boolean s(int i15, int i16, int i17) {
        if (i16 < 40) {
            return true;
        }
        long j15 = ((long) i16) - ((long) i15);
        long j16 = i17;
        return j15 + 10 <= ((2 * j16) + 3) + ((j16 + 3) * 3);
    }

    static int t(int i15, List<a0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = size * m0.B0(i15);
        for (int i16 = 0; i16 < list.size(); i16++) {
            iB0 += m0.D(list.get(i16));
        }
        return iB0;
    }

    static int u(int i15, List<l2> list, c3 c3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iP += m0.P(i15, list.get(i16), c3Var);
        }
        return iP;
    }

    static int v(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g1)) {
            int iH0 = 0;
            while (i15 < size) {
                iH0 += m0.H0(list.get(i15).intValue());
                i15++;
            }
            return iH0;
        }
        g1 g1Var = (g1) list;
        int iH1 = 0;
        while (i15 < size) {
            iH1 += m0.H0(g1Var.f(i15));
            i15++;
        }
        return iH1;
    }

    private static u3<?, ?> w(boolean z15) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (u3) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z15));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i15, List<Long> list, p4 p4Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p4Var.F(i15, list, z15);
    }

    static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static u3<?, ?> z() {
        return f29297b;
    }
}
