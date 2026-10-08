package b0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.e1;
import v.f2;
import v.m0;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f15606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rational f15609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f15610e;

    public p(m0 m0Var, Size size) {
        this.f15606a = m0Var;
        this.f15607b = m0Var.g();
        this.f15608c = m0Var.n();
        Rational rationalH = size != null ? h(size) : i(m0Var);
        this.f15609d = rationalH;
        this.f15610e = new q(m0Var, rationalH);
    }

    private static LinkedHashMap<Rational, List<Size>> a(List<Size> list, j0.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, j0.a aVar, Rational rational) {
        boolean z15 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z15 = false;
        }
        Rational rationalN = n(aVar.b(), z15);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z15);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new y.a.C5950a(rationalN, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> c(List<Size> list, j0.c cVar, int i15) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f15606a.o(i15));
        Collections.sort(arrayList, new y.d(true));
        return arrayList;
    }

    private static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int iB = f0.d.b(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (f0.d.b(size2) <= iB) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List<Size> e(List<Size> list, j0.b bVar, int i15, int i16, int i17) {
        if (bVar == null) {
            return list;
        }
        List<Size> listA = bVar.a(new ArrayList(list), y.c.a(y.c.b(i15), i16, i17 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, j0.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    private static void g(List<Size> list, j0.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(j0.d.f98437c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(m0 m0Var) {
        List<Size> listT = m0Var.t(256);
        if (listT.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listT, new y.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List<Size> j(List<Pair<Integer, Size[]>> list, int i15) {
        List<Size> listL = l(list, i15);
        if (listL == null) {
            listL = this.f15606a.t(i15);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new y.d(true));
        if (arrayList.isEmpty()) {
            e1.o("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i15 + ".");
        }
        return arrayList;
    }

    static List<Rational> k(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y.a.f222435a);
        arrayList.add(y.a.f222437c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!y.a.a(size, (Rational) it.next()));
            }
        }
        return arrayList;
    }

    private List<Size> l(List<Pair<Integer, Size[]>> list, int i15) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i15) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i15, boolean z15) {
        if (i15 == -1 || i15 == 0) {
            return z15 ? y.a.f222435a : y.a.f222436b;
        }
        if (i15 == 1) {
            return z15 ? y.a.f222437c : y.a.f222438d;
        }
        e1.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i15);
        return null;
    }

    static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = k(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (y.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List<Size> p(j0.c cVar, List<Size> list, Size size, int i15, Rational rational, int i16, int i17) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i15, i16, i17);
    }

    static void q(List<Size> list, Size size, boolean z15) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z15) {
            list.addAll(arrayList);
        }
    }

    private static void r(List<Size> list, Size size, boolean z15) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < list.size(); i15++) {
            Size size2 = list.get(i15);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z15) {
            list.addAll(arrayList);
        }
    }

    private static void s(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public List<Size> m(w3<?> w3Var) {
        f2 f2Var = (f2) w3Var;
        List<Size> listL = f2Var.L(null);
        if (listL != null) {
            return listL;
        }
        j0.c cVarK = f2Var.K(null);
        List<Size> listJ = j(f2Var.n(null), w3Var.r());
        if (cVarK == null) {
            return this.f15610e.f(listJ, w3Var);
        }
        Size sizeJ = ((f2) w3Var).j(null);
        int I = f2Var.I(0);
        if (!w3Var.d0(false)) {
            listJ = c(listJ, cVarK, w3Var.r());
        }
        List<Size> list = listJ;
        e1.a("SupportedOutputSizesCollector", "useCaseConfig = " + w3Var + ", candidateSizes = " + list);
        return p(f2Var.o(), list, sizeJ, I, this.f15609d, this.f15607b, this.f15608c);
    }
}
