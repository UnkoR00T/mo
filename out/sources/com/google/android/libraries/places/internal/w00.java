package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h10 f34097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34098b = 0;

    static {
        int i15 = kx.f32765a;
        f34097a = new k10();
    }

    static int A(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bz)) {
            int iD = 0;
            while (i15 < size) {
                int iIntValue = ((Integer) list.get(i15)).intValue();
                iD += dy.d((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i15++;
            }
            return iD;
        }
        bz bzVar = (bz) list;
        int iD2 = 0;
        while (i15 < size) {
            int iH = bzVar.h(i15);
            iD2 += dy.d((iH >> 31) ^ (iH + iH));
            i15++;
        }
        return iD2;
    }

    static int B(List list) {
        return list.size() * 4;
    }

    static int C(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (dy.d(i15 << 3) + 4);
    }

    static int D(List list) {
        return list.size() * 8;
    }

    static int E(int i15, List list, boolean z15) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (dy.d(i15 << 3) + 8);
    }

    @Deprecated
    static int F(int i15, g00 g00Var, v00 v00Var) {
        int iD = dy.d(i15 << 3);
        return iD + iD + ((fx) g00Var).d(v00Var);
    }

    public static h10 a() {
        return f34097a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(my myVar, Object obj, Object obj2) {
        qy qyVar = ((xy) obj2).zzb;
        if (qyVar.f33463a.isEmpty()) {
            return;
        }
        myVar.a(obj).h(qyVar);
    }

    static void d(h10 h10Var, Object obj, Object obj2) {
        az azVar = (az) obj;
        j10 j10VarC = azVar.zzc;
        j10 j10Var = ((az) obj2).zzc;
        if (!j10.a().equals(j10Var)) {
            if (j10.a().equals(j10VarC)) {
                j10VarC = j10.c(j10VarC, j10Var);
            } else {
                j10VarC.l(j10Var);
            }
        }
        azVar.zzc = j10VarC;
    }

    static Object e(Object obj, int i15, List list, ez ezVar, Object obj2, h10 h10Var) {
        if (ezVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!ezVar.b(iIntValue)) {
                    obj2 = f(obj, i15, iIntValue, obj2, h10Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Integer num = (Integer) list.get(i17);
            int iIntValue2 = num.intValue();
            if (ezVar.b(iIntValue2)) {
                if (i17 != i16) {
                    list.set(i16, num);
                }
                i16++;
            } else {
                obj2 = f(obj, i15, iIntValue2, obj2, h10Var);
            }
        }
        if (i16 != size) {
            list.subList(i16, size).clear();
        }
        return obj2;
    }

    static Object f(Object obj, int i15, int i16, Object obj2, h10 h10Var) {
        if (obj2 == null) {
            obj2 = h10Var.h(obj);
        }
        h10Var.a(obj2, i15, i16);
        return obj2;
    }

    public static void g(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.L(i15, list, z15);
    }

    public static void h(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.q(i15, list, z15);
    }

    public static void i(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.H(i15, list, z15);
    }

    public static void j(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.k(i15, list, z15);
    }

    public static void k(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.G(i15, list, z15);
    }

    public static void l(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.E(i15, list, z15);
    }

    public static void m(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.J(i15, list, z15);
    }

    public static void n(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.C(i15, list, z15);
    }

    public static void o(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.o(i15, list, z15);
    }

    public static void p(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.f(i15, list, z15);
    }

    public static void q(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.v(i15, list, z15);
    }

    public static void r(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.m(i15, list, z15);
    }

    public static void s(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.B(i15, list, z15);
    }

    public static void t(int i15, List list, w10 w10Var, boolean z15) {
        if (list == null || list.isEmpty()) {
            return;
        }
        w10Var.M(i15, list, z15);
    }

    static int u(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof uz)) {
            int iE = 0;
            while (i15 < size) {
                iE += dy.e(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iE;
        }
        uz uzVar = (uz) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += dy.e(uzVar.i(i15));
            i15++;
        }
        return iE2;
    }

    static int v(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof uz)) {
            int iE = 0;
            while (i15 < size) {
                iE += dy.e(((Long) list.get(i15)).longValue());
                i15++;
            }
            return iE;
        }
        uz uzVar = (uz) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += dy.e(uzVar.i(i15));
            i15++;
        }
        return iE2;
    }

    static int w(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof uz)) {
            int iE = 0;
            while (i15 < size) {
                long jLongValue = ((Long) list.get(i15)).longValue();
                iE += dy.e((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i15++;
            }
            return iE;
        }
        uz uzVar = (uz) list;
        int iE2 = 0;
        while (i15 < size) {
            long jI = uzVar.i(i15);
            iE2 += dy.e((jI >> 63) ^ (jI + jI));
            i15++;
        }
        return iE2;
    }

    static int x(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bz)) {
            int iE = 0;
            while (i15 < size) {
                iE += dy.e(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iE;
        }
        bz bzVar = (bz) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += dy.e(bzVar.h(i15));
            i15++;
        }
        return iE2;
    }

    static int y(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bz)) {
            int iE = 0;
            while (i15 < size) {
                iE += dy.e(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iE;
        }
        bz bzVar = (bz) list;
        int iE2 = 0;
        while (i15 < size) {
            iE2 += dy.e(bzVar.h(i15));
            i15++;
        }
        return iE2;
    }

    static int z(List list) {
        int size = list.size();
        int i15 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bz)) {
            int iD = 0;
            while (i15 < size) {
                iD += dy.d(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return iD;
        }
        bz bzVar = (bz) list;
        int iD2 = 0;
        while (i15 < size) {
            iD2 += dy.d(bzVar.h(i15));
            i15++;
        }
        return iD2;
    }
}
