package k0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import v.f2;
import v.m0;
import v.n0;
import v.t2;
import v.w3;
import y.x;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f107133h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f107134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rational f107135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rational f107136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<w3<?>> f107137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b0.p f107138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m0 f107139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<w3<?>, List<Size>> f107140g;

    private static class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rational f107141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f107142b;

        a(Rational rational, boolean z15) {
            this.f107141a = rational;
            this.f107142b = z15;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = c.c(rational, this.f107141a);
            float fC2 = c.c(rational2, this.f107141a);
            return this.f107142b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    c(n0 n0Var, Set<w3<?>> set) {
        this(x.m(n0Var.o().k()), n0Var.o(), set);
    }

    private static boolean A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(Rational rational, Size size) {
        if (this.f107135b.equals(rational) || y.a.a(size, rational)) {
            return false;
        }
        return b(this.f107135b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    private boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    private boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!y.a.a(it.next(), this.f107136c)) {
                return true;
            }
        }
        return false;
    }

    private static List<Size> E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List<Size> G(List<Size> list, boolean z15) {
        Map<Rational, List<Size>> mapX = x(list);
        ArrayList arrayList = new ArrayList(mapX.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(y.a.f222437c) && !rational.equals(y.a.f222435a)) {
                List<Size> list2 = mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z15));
            }
        }
        return arrayList2;
    }

    private List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f107135b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f107136c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            e1.o("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        e1.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List<Size> I(Rational rational, List<Size> list, boolean z15) {
        List<Size> listG = g(rational, list);
        M(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator<w3<?>> it = this.f107137d.iterator();
        while (it.hasNext()) {
            List<Size> listV = v(it.next());
            if (!z15) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z15;
        j0.c cVarK;
        Iterator<w3<?>> it = this.f107137d.iterator();
        while (true) {
            z15 = false;
            if (!it.hasNext()) {
                break;
            }
            w3<?> next = it.next();
            if (!next.d0(false) && (next instanceof f2) && (cVarK = ((f2) next).K(null)) != null) {
                z15 = true;
                if (cVarK.a() == 1) {
                    break;
                }
            }
        }
        return z15;
    }

    private boolean K() {
        if (this.f107137d.isEmpty()) {
            return false;
        }
        Iterator<w3<?>> it = this.f107137d.iterator();
        while (it.hasNext()) {
            Iterator<Size> it4 = v(it.next()).iterator();
            boolean z15 = false;
            boolean z16 = false;
            while (it4.hasNext()) {
                boolean zA = y.a.a(it4.next(), this.f107136c);
                if (zA) {
                    z15 = true;
                }
                if (z16 && zA) {
                    return false;
                }
                if (!zA) {
                    z16 = true;
                }
            }
            if (!z15) {
                return false;
            }
        }
        return true;
    }

    private void L(List<Rational> list) {
        Collections.sort(list, new a(N(this.f107134a), true));
    }

    static void M(List<Size> list) {
        Collections.sort(list, new y.d(true));
    }

    private static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational O(Size size) {
        Rational rational = y.a.f222435a;
        if (y.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = y.a.f222437c;
        return y.a.a(size, rational2) ? rational2 : N(size);
    }

    private boolean b(float f15, float f16, float f17) {
        if (f15 != f16 && f16 != f17) {
            if (f15 > f16) {
                return f16 < f17;
            }
            if (f16 > f17) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    private List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> e(List<Size> list) {
        Rational rationalN;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalN = null;
                    break;
                }
                rationalN = (Rational) it.next();
            } while (!y.a.a(size, rationalN));
            if (rationalN != null) {
                Size size2 = (Size) map.get(rationalN);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalN = N(size);
            }
            arrayList.add(size);
            map.put(rationalN, size);
        }
        return arrayList;
    }

    static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (y.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f107133h ? y.a.f222437c : y.a.f222435a;
    }

    private List<Size> i() {
        return this.f107139f.o(34);
    }

    private List<Size> j() {
        return this.f107139f.t(34);
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalN = N(size);
        if (rational.floatValue() == rationalN.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalN.floatValue()) {
                float f15 = width;
                float fFloatValue = f15 / rational.floatValue();
                float f16 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f16, f15, fFloatValue + f16);
            } else {
                float f17 = height;
                float fFloatValue2 = rational.floatValue() * f17;
                float f18 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f18, 0.0f, fFloatValue2 + f18, f17);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    private Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<w3<?>> it = this.f107137d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    private static Rational n(Rational rational) {
        Rational rational2 = y.a.f222435a;
        if (rational.equals(rational2)) {
            return y.a.f222437c;
        }
        if (rational.equals(y.a.f222437c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private PreferredChildSize t(Rect rect, w3<?> w3Var, boolean z15) {
        Size sizeQ;
        Size size;
        if (z15) {
            Pair<Size, Size> pairS = s(x.m(rect), w3Var);
            sizeQ = (Size) pairS.first;
            size = (Size) pairS.second;
        } else {
            Size sizeM = x.m(rect);
            sizeQ = q(sizeM, w3Var);
            rect = m(sizeM, sizeQ);
            size = sizeQ;
        }
        return new PreferredChildSize(rect, size, sizeQ);
    }

    private static Rational u(Size size) {
        Rational rationalH = h(size);
        e1.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    private List<Size> v(w3<?> w3Var) {
        if (!this.f107137d.contains(w3Var)) {
            throw new IllegalArgumentException("Invalid child config: " + w3Var);
        }
        if (this.f107140g.containsKey(w3Var)) {
            List<Size> list = this.f107140g.get(w3Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = e(this.f107138e.m(w3Var));
        this.f107140g.put(w3Var, listE);
        return listE;
    }

    private static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    private Map<Rational, List<Size>> x(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = y.a.f222435a;
        map.put(rational, new ArrayList());
        Rational rational2 = y.a.f222437c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (y.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalN = N(size);
                    arrayList2.add(rationalN);
                    map.put(rationalN, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    List<Size> o(t2 t2Var) {
        List<Size> listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) t2Var.f(f2.f202584x, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    Size q(Size size, w3<?> w3Var) {
        List<Size> listV = v(w3Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    PreferredChildSize r(w3<?> w3Var, Rect rect, int i15, boolean z15) {
        boolean z16;
        if (x.i(i15)) {
            rect = F(rect);
            z16 = true;
        } else {
            z16 = false;
        }
        PreferredChildSize preferredChildSizeT = t(rect, w3Var, z15);
        return z16 ? new PreferredChildSize(F(preferredChildSizeT.getCropRectBeforeScaling()), x.n(preferredChildSizeT.getChildSizeToScale()), preferredChildSizeT.getOriginalSelectedChildSize()) : preferredChildSizeT;
    }

    Pair<Size, Size> s(Size size, w3<?> w3Var) {
        for (Size size2 : v(w3Var)) {
            Size sizeM = x.m(m(size2, size));
            if (!y(sizeM, size)) {
                return Pair.create(size2, sizeM);
            }
        }
        return Pair.create(size, size);
    }

    private c(Size size, m0 m0Var, Set<w3<?>> set) {
        this(size, m0Var, set, new b0.p(m0Var, size));
    }

    c(Size size, m0 m0Var, Set<w3<?>> set, b0.p pVar) {
        this.f107140g = new HashMap();
        this.f107134a = size;
        Rational rationalU = u(size);
        this.f107135b = rationalU;
        this.f107136c = n(rationalU);
        this.f107139f = m0Var;
        this.f107137d = set;
        this.f107138e = pVar;
    }
}
