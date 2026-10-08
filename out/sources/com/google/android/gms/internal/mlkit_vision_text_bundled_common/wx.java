package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class wx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ky f30688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30689b = 0;

    static {
        int i15 = rx.f30613d;
        f30688a = new my();
    }

    public static void A(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.E(i15, list, z15);
    }

    public static void B(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.u(i15, list, z15);
    }

    public static void C(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.A(i15, list, z15);
    }

    public static void D(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.q(i15, list, z15);
    }

    public static void E(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.z(i15, list, z15);
    }

    public static void a(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.j(i15, list, z15);
    }

    public static void b(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.h(i15, list, z15);
    }

    public static void c(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.g(i15, list, z15);
    }

    public static void d(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.H(i15, list, z15);
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
        if (!(list instanceof cw)) {
            int iE = 0;
            while (i15 < size) {
                iE += gv.e(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iE;
        }
        cw cwVar = (cw) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += gv.e(cwVar.f(i15));
            i15++;
        }
        return iE2;
    }

    static int g(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (gv.d(i15 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (gv.d(i15 << 3) + 8);
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
        if (!(list instanceof cw)) {
            int iE = 0;
            while (i15 < size) {
                iE += gv.e(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iE;
        }
        cw cwVar = (cw) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += gv.e(cwVar.f(i15));
            i15++;
        }
        return iE2;
    }

    static int l(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xw)) {
            int iE = 0;
            while (i15 < size) {
                iE += gv.e(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iE;
        }
        xw xwVar = (xw) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += gv.e(xwVar.f(i15));
            i15++;
        }
        return iE2;
    }

    static int m(int i15, Object obj, ux uxVar) {
        int i16 = i15 << 3;
        if (!(obj instanceof sw)) {
            return gv.d(i16) + gv.b((jx) obj, uxVar);
        }
        int iD = gv.d(i16);
        int iA = ((sw) obj).a();
        return iD + gv.d(iA) + iA;
    }

    static int n(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cw)) {
            int iD = 0;
            while (i15 < size) {
                int iIntValue = ((Integer) list.get(i15)).intValue();
                iD += gv.d((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i15++;
            }
            return iD;
        }
        cw cwVar = (cw) list;
        int iD2 = 0;
        while (i15 < size) {
            int iF = cwVar.f(i15);
            iD2 += gv.d((iF >> 31) ^ (iF + iF));
            i15++;
        }
        return iD2;
    }

    static int o(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xw)) {
            int iE = 0;
            while (i15 < size) {
                long jLongValue = ((Long) list.get(i15)).longValue();
                iE += gv.e((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i15++;
            }
            return iE;
        }
        xw xwVar = (xw) list;
        int iE2 = 0;
        while (i15 < size) {
            long jF = xwVar.f(i15);
            iE2 += gv.e((jF >> 63) ^ (jF + jF));
            i15++;
        }
        return iE2;
    }

    static int p(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cw)) {
            int iD = 0;
            while (i15 < size) {
                iD += gv.d(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iD;
        }
        cw cwVar = (cw) list;
        int iD2 = 0;
        while (i15 < size) {
            iD2 += gv.d(cwVar.f(i15));
            i15++;
        }
        return iD2;
    }

    static int q(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof xw)) {
            int iE = 0;
            while (i15 < size) {
                iE += gv.e(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iE;
        }
        xw xwVar = (xw) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += gv.e(xwVar.f(i15));
            i15++;
        }
        return iE2;
    }

    public static ky r() {
        return f30688a;
    }

    static Object s(Object obj, int i15, int i16, Object obj2, ky kyVar) {
        if (obj2 == null) {
            obj2 = kyVar.a(obj);
        }
        ((ly) obj2).j(i15 << 3, Long.valueOf(i16));
        return obj2;
    }

    static void t(mv mvVar, Object obj, Object obj2) {
        qv qvVar = ((yv) obj2).zbb;
        if (qvVar.f30564a.isEmpty()) {
            return;
        }
        ((yv) obj).E().i(qvVar);
    }

    static void u(ky kyVar, Object obj, Object obj2) {
        bw bwVar = (bw) obj;
        ly lyVarE = bwVar.zbc;
        ly lyVar = ((bw) obj2).zbc;
        if (!ly.c().equals(lyVar)) {
            if (ly.c().equals(lyVarE)) {
                lyVarE = ly.e(lyVarE, lyVar);
            } else {
                lyVarE.d(lyVar);
            }
        }
        bwVar.zbc = lyVarE;
    }

    public static void v(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.s(i15, list, z15);
    }

    public static void w(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.k(i15, list, z15);
    }

    public static void x(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.o(i15, list, z15);
    }

    public static void y(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.b(i15, list, z15);
    }

    public static void z(int i15, List list, xy xyVar, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xyVar.e(i15, list, z15);
    }
}
