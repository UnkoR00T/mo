package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y5 f29764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29765b = 0;

    static {
        int i15 = z4.f30339d;
        f29764a = new a6();
    }

    public static void A(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.W(i15, list, z15);
    }

    public static void B(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.R(i15, list, z15);
    }

    public static void C(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.d0(i15, list, z15);
    }

    public static void D(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.H(i15, list, z15);
    }

    public static void E(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.E(i15, list, z15);
    }

    public static void a(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.L(i15, list, z15);
    }

    public static void b(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.M(i15, list, z15);
    }

    public static void c(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.J(i15, list, z15);
    }

    public static void d(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.G(i15, list, z15);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m3)) {
            int iB = 0;
            while (i15 < size) {
                iB += r2.b(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iB;
        }
        m3 m3Var = (m3) list;
        int iB2 = 0;
        while (i15 < size) {
            iB2 += r2.b(m3Var.f(i15));
            i15++;
        }
        return iB2;
    }

    static int g(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (r2.a(i15 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (r2.a(i15 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m3)) {
            int iB = 0;
            while (i15 < size) {
                iB += r2.b(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iB;
        }
        m3 m3Var = (m3) list;
        int iB2 = 0;
        while (i15 < size) {
            iB2 += r2.b(m3Var.f(i15));
            i15++;
        }
        return iB2;
    }

    static int l(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g4)) {
            int iB = 0;
            while (i15 < size) {
                iB += r2.b(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iB;
        }
        g4 g4Var = (g4) list;
        int iB2 = 0;
        while (i15 < size) {
            iB2 += r2.b(g4Var.f(i15));
            i15++;
        }
        return iB2;
    }

    static int m(int i15, Object obj, k5 k5Var) {
        int i16 = i15 << 3;
        if (!(obj instanceof b4)) {
            return r2.a(i16) + r2.B((r4) obj, k5Var);
        }
        int iA = r2.a(i16);
        int iA2 = ((b4) obj).a();
        return iA + r2.a(iA2) + iA2;
    }

    static int n(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m3)) {
            int iA = 0;
            while (i15 < size) {
                int iIntValue = ((Integer) list.get(i15)).intValue();
                iA += r2.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i15++;
            }
            return iA;
        }
        m3 m3Var = (m3) list;
        int iA2 = 0;
        while (i15 < size) {
            int iF = m3Var.f(i15);
            iA2 += r2.a((iF >> 31) ^ (iF + iF));
            i15++;
        }
        return iA2;
    }

    static int o(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g4)) {
            int iB = 0;
            while (i15 < size) {
                long jLongValue = ((Long) list.get(i15)).longValue();
                iB += r2.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i15++;
            }
            return iB;
        }
        g4 g4Var = (g4) list;
        int iB2 = 0;
        while (i15 < size) {
            long jF = g4Var.f(i15);
            iB2 += r2.b((jF >> 63) ^ (jF + jF));
            i15++;
        }
        return iB2;
    }

    static int p(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m3)) {
            int iA = 0;
            while (i15 < size) {
                iA += r2.a(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iA;
        }
        m3 m3Var = (m3) list;
        int iA2 = 0;
        while (i15 < size) {
            iA2 += r2.a(m3Var.f(i15));
            i15++;
        }
        return iA2;
    }

    static int q(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof g4)) {
            int iB = 0;
            while (i15 < size) {
                iB += r2.b(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iB;
        }
        g4 g4Var = (g4) list;
        int iB2 = 0;
        while (i15 < size) {
            iB2 += r2.b(g4Var.f(i15));
            i15++;
        }
        return iB2;
    }

    public static y5 r() {
        return f29764a;
    }

    static Object s(Object obj, int i15, int i16, Object obj2, y5 y5Var) {
        l3 l3Var;
        z5 z5Var;
        Object obj3 = obj2;
        if (obj2 == null && (z5Var = (l3Var = (l3) obj).zzc) == z5.c()) {
            obj3 = z5Var;
            z5 z5VarF = z5.f();
            l3Var.zzc = z5VarF;
            obj3 = z5VarF;
        }
        obj3 = z5Var;
        ((z5) obj3).j(i15 << 3, Long.valueOf(i16));
        return obj3;
    }

    static void t(x2 x2Var, Object obj, Object obj2) {
        b3 b3Var = ((i3) obj2).zzb;
        if (b3Var.f29647a.isEmpty()) {
            return;
        }
        ((i3) obj).J().h(b3Var);
    }

    static void u(y5 y5Var, Object obj, Object obj2) {
        l3 l3Var = (l3) obj;
        z5 z5VarE = l3Var.zzc;
        z5 z5Var = ((l3) obj2).zzc;
        if (!z5.c().equals(z5Var)) {
            if (z5.c().equals(z5VarE)) {
                z5VarE = z5.e(z5VarE, z5Var);
            } else {
                z5VarE.d(z5Var);
            }
        }
        l3Var.zzc = z5VarE;
    }

    public static void v(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.c(i15, list, z15);
    }

    public static void w(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.g(i15, list, z15);
    }

    public static void x(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.f(i15, list, z15);
    }

    public static void y(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.e(i15, list, z15);
    }

    public static void z(int i15, List list, o6 o6Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o6Var.d(i15, list, z15);
    }
}
