package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f11994a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n1<?, ?> f11995b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n1<?, ?> f11996c = new p1();

    static <UT, UB> UB A(Object obj, int i15, List<Integer> list, z.c cVar, UB ub5, n1<UT, UB> n1Var) {
        if (cVar == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.a(iIntValue)) {
                    ub5 = (UB) J(obj, i15, iIntValue, ub5, n1Var);
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
            if (cVar.a(iIntValue2)) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) J(obj, i15, iIntValue2, ub5, n1Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }

    private static Class<?> B() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static n1<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (n1) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (c1.f11932d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t15, T t16) {
        t<T> tVarC = pVar.c(t16);
        if (tVarC.n()) {
            return;
        }
        pVar.d(t15).v(tVarC);
    }

    static <T> void F(m0 m0Var, T t15, T t16, long j15) {
        q1.O(t15, j15, m0Var.a(q1.z(t15, j15), q1.z(t16, j15)));
    }

    static <T, UT, UB> void G(n1<UT, UB> n1Var, T t15, T t16) {
        n1Var.p(t15, n1Var.k(n1Var.g(t15), n1Var.g(t16)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && !c1.f11932d && (cls2 = f11994a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB J(Object obj, int i15, int i16, UB ub5, n1<UT, UB> n1Var) {
        if (ub5 == null) {
            ub5 = n1Var.f(obj);
        }
        n1Var.e(ub5, i15, i16);
        return ub5;
    }

    public static n1<?, ?> K() {
        return f11995b;
    }

    public static n1<?, ?> L() {
        return f11996c;
    }

    public static void M(int i15, List<Boolean> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.A(i15, list, z15);
    }

    public static void N(int i15, List<g> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.I(i15, list);
    }

    public static void O(int i15, List<Double> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.G(i15, list, z15);
    }

    public static void P(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.n(i15, list, z15);
    }

    public static void Q(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.j(i15, list, z15);
    }

    public static void R(int i15, List<Long> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.y(i15, list, z15);
    }

    public static void S(int i15, List<Float> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.a(i15, list, z15);
    }

    public static void T(int i15, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.J(i15, list, g1Var);
    }

    public static void U(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.g(i15, list, z15);
    }

    public static void V(int i15, List<Long> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.F(i15, list, z15);
    }

    public static void W(int i15, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.O(i15, list, g1Var);
    }

    public static void X(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.z(i15, list, z15);
    }

    public static void Y(int i15, List<Long> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.q(i15, list, z15);
    }

    public static void Z(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.D(i15, list, z15);
    }

    static int a(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? j.U(i15) + j.C(size) : size * j.d(i15, true);
    }

    public static void a0(int i15, List<Long> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.l(i15, list, z15);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i15, List<String> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.d(i15, list);
    }

    static int c(int i15, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * j.U(i15);
        for (int i16 = 0; i16 < list.size(); i16++) {
            iU += j.h(list.get(i16));
        }
        return iU;
    }

    public static void c0(int i15, List<Integer> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.k(i15, list, z15);
    }

    static int d(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z15 ? j.U(i15) + j.C(iE) : iE + (size * j.U(i15));
    }

    public static void d0(int i15, List<Long> list, t1 t1Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.r(i15, list, z15);
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iL = 0;
            while (i15 < size) {
                iL += j.l(list.get(i15).intValue());
                i15++;
            }
            return iL;
        }
        y yVar = (y) list;
        int iL2 = 0;
        while (i15 < size) {
            iL2 += j.l(yVar.l(i15));
            i15++;
        }
        return iL2;
    }

    static int f(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? j.U(i15) + j.C(size * 4) : size * j.m(i15, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i15, List<?> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z15 ? j.U(i15) + j.C(size * 8) : size * j.o(i15, 0L);
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
            iS += j.s(i15, list.get(i16), g1Var);
        }
        return iS;
    }

    static int k(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z15 ? j.U(i15) + j.C(iL) : iL + (size * j.U(i15));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iW = 0;
            while (i15 < size) {
                iW += j.w(list.get(i15).intValue());
                i15++;
            }
            return iW;
        }
        y yVar = (y) list;
        int iW2 = 0;
        while (i15 < size) {
            iW2 += j.w(yVar.l(i15));
            i15++;
        }
        return iW2;
    }

    static int m(int i15, List<Long> list, boolean z15) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z15 ? j.U(i15) + j.C(iN) : iN + (list.size() * j.U(i15));
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
                iY += j.y(list.get(i15).longValue());
                i15++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i15 < size) {
            iY2 += j.y(i0Var.l(i15));
            i15++;
        }
        return iY2;
    }

    static int o(int i15, Object obj, g1 g1Var) {
        return obj instanceof d0 ? j.A(i15, (d0) obj) : j.F(i15, (r0) obj, g1Var);
    }

    static int p(int i15, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = j.U(i15) * size;
        for (int i16 = 0; i16 < size; i16++) {
            Object obj = list.get(i16);
            iU += obj instanceof d0 ? j.B((d0) obj) : j.H((r0) obj, g1Var);
        }
        return iU;
    }

    static int q(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z15 ? j.U(i15) + j.C(iR) : iR + (size * j.U(i15));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iP = 0;
            while (i15 < size) {
                iP += j.P(list.get(i15).intValue());
                i15++;
            }
            return iP;
        }
        y yVar = (y) list;
        int iP2 = 0;
        while (i15 < size) {
            iP2 += j.P(yVar.l(i15));
            i15++;
        }
        return iP2;
    }

    static int s(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z15 ? j.U(i15) + j.C(iT) : iT + (size * j.U(i15));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iR = 0;
            while (i15 < size) {
                iR += j.R(list.get(i15).longValue());
                i15++;
            }
            return iR;
        }
        i0 i0Var = (i0) list;
        int iR2 = 0;
        while (i15 < size) {
            iR2 += j.R(i0Var.l(i15));
            i15++;
        }
        return iR2;
    }

    static int u(int i15, List<?> list) {
        int size = list.size();
        int i16 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = j.U(i15) * size;
        if (!(list instanceof e0)) {
            while (i16 < size) {
                Object obj = list.get(i16);
                iU += obj instanceof g ? j.h((g) obj) : j.T((String) obj);
                i16++;
            }
            return iU;
        }
        e0 e0Var = (e0) list;
        while (i16 < size) {
            Object objK = e0Var.K(i16);
            iU += objK instanceof g ? j.h((g) objK) : j.T((String) objK);
            i16++;
        }
        return iU;
    }

    static int v(int i15, List<Integer> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z15 ? j.U(i15) + j.C(iW) : iW + (size * j.U(i15));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iW = 0;
            while (i15 < size) {
                iW += j.W(list.get(i15).intValue());
                i15++;
            }
            return iW;
        }
        y yVar = (y) list;
        int iW2 = 0;
        while (i15 < size) {
            iW2 += j.W(yVar.l(i15));
            i15++;
        }
        return iW2;
    }

    static int x(int i15, List<Long> list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z15 ? j.U(i15) + j.C(iY) : iY + (size * j.U(i15));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iY = 0;
            while (i15 < size) {
                iY += j.Y(list.get(i15).longValue());
                i15++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i15 < size) {
            iY2 += j.Y(i0Var.l(i15));
            i15++;
        }
        return iY2;
    }

    static <UT, UB> UB z(Object obj, int i15, List<Integer> list, z.b<?> bVar, UB ub5, n1<UT, UB> n1Var) {
        if (bVar == null) {
            return ub5;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bVar.a(iIntValue) == null) {
                    ub5 = (UB) J(obj, i15, iIntValue, ub5, n1Var);
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
            if (bVar.a(iIntValue2) != null) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                ub5 = (UB) J(obj, i15, iIntValue2, ub5, n1Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return ub5;
    }
}
