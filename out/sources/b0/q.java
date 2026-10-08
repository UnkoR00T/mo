package b0;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v.f2;
import v.m0;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f15613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15614d;

    q(m0 m0Var, Rational rational) {
        this.f15611a = m0Var.g();
        this.f15612b = m0Var.n();
        this.f15613c = rational;
        boolean z15 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z15 = false;
        }
        this.f15614d = z15;
    }

    private static Size a(Size size, int i15, int i16, int i17) {
        return (size == null || !e(i15, i16, i17)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : p.k(list)) {
            if (y.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(f2 f2Var, List<Size> list) {
        if (f2Var.A()) {
            return p.n(f2Var.C(), this.f15614d);
        }
        Size sizeD = d(f2Var);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    private Size d(f2 f2Var) {
        return a(f2Var.S(null), f2Var.I(0), this.f15612b, this.f15611a);
    }

    private static boolean e(int i15, int i16, int i17) {
        int iA = y.c.a(y.c.b(i15), i17, 1 == i16);
        return iA == 90 || iA == 270;
    }

    List<Size> f(List<Size> list, w3<?> w3Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new y.d(true));
        ArrayList arrayList2 = new ArrayList();
        f2 f2Var = (f2) w3Var;
        Size sizeJ = f2Var.j(null);
        Size size = (Size) arrayList.get(0);
        if (sizeJ == null || f0.d.b(size) < f0.d.b(sizeJ)) {
            sizeJ = size;
        }
        Size sizeD = d(f2Var);
        Size size2 = f0.d.f54494c;
        int iB = f0.d.b(size2);
        if (f0.d.b(sizeJ) < iB) {
            size2 = f0.d.f54492a;
        } else if (sizeD != null && f0.d.b(sizeD) < iB) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (f0.d.b(size3) <= f0.d.b(sizeJ) && f0.d.b(size3) >= f0.d.b(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeJ + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(f2Var, arrayList2);
        if (sizeD == null) {
            sizeD = f2Var.O(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                p.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> mapO = p.o(arrayList2);
            if (sizeD != null) {
                Iterator<Rational> it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    p.q(mapO.get(it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new y.a.C5950a(rationalC, this.f15613c));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                for (Size size4 : mapO.get((Rational) it4.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
