package rs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wt.i f175627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final js.f0 f175628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final wt.q f175629c;

        public a(wt.i iVar, js.f0 f0Var, wt.q qVar) {
            this.f175627a = iVar;
            this.f175628b = f0Var;
            this.f175629c = qVar;
        }

        public final js.f0 a() {
            return this.f175628b;
        }

        public final wt.i b() {
            return this.f175627a;
        }

        public final wt.q c() {
            return this.f175629c;
        }
    }

    private final l B(wt.i iVar) {
        wt.s sVarE = E();
        if (sVarE.A(sVarE.N0(iVar))) {
            return l.NULLABLE;
        }
        if (sVarE.A(sVarE.F(iVar))) {
            return null;
        }
        return l.NOT_NULL;
    }

    private final m K(m mVar, m mVar2) {
        if (mVar == null) {
            return mVar2;
        }
        return (mVar2 != null && ((mVar.d() && !mVar2.d()) || ((mVar.d() || !mVar2.d()) && (mVar.c().compareTo(mVar2.c()) < 0 || mVar.c().compareTo(mVar2.c()) <= 0)))) ? mVar2 : mVar;
    }

    private final List<a> L(wt.i iVar) {
        return m(new a(iVar, i(iVar, u()), null), new d(this, E()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable M(e eVar, wt.s sVar, a aVar) {
        wt.i iVarB;
        wt.p pVarN;
        List<wt.q> listY;
        wt.i iVarB2;
        if ((eVar.D() && (iVarB2 = aVar.b()) != null && sVar.f0(iVarB2)) || (iVarB = aVar.b()) == null || (pVarN = sVar.n(iVarB)) == null || (listY = sVar.y(pVarN)) == null) {
            return null;
        }
        List<wt.q> list = listY;
        List<wt.m> listE0 = sVar.e0(aVar.b());
        Iterator<T> it = list.iterator();
        Iterator<T> it4 = listE0.iterator();
        ArrayList arrayList = new ArrayList(Math.min(pq.v.y(list, 10), pq.v.y(listE0, 10)));
        while (it.hasNext() && it4.hasNext()) {
            wt.q qVar = (wt.q) it.next();
            wt.i iVarH0 = sVar.H0((wt.m) it4.next());
            arrayList.add(iVarH0 == null ? new a(null, aVar.a(), qVar) : new a(iVarH0, eVar.i(iVarH0, aVar.a()), qVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list, e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wt.i iVarY = eVar.y((wt.i) it.next());
            if (iVarY != null) {
                arrayList.add(iVarY);
            }
        }
        return arrayList;
    }

    private static final List<wt.i> b(oq.k<? extends List<? extends wt.i>> kVar) {
        return (List) kVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(r1 r1Var, i[] iVarArr, int i15) {
        Map<Integer, i> mapB;
        i iVar;
        if (r1Var == null || (mapB = r1Var.b()) == null || (iVar = mapB.get(Integer.valueOf(i15))) == null) {
            return (i15 < 0 || i15 >= iVarArr.length) ? i.f175656e.a() : iVarArr[i15];
        }
        return iVar;
    }

    private final js.f0 i(wt.i iVar, js.f0 f0Var) {
        return p().d(f0Var, q(iVar));
    }

    private final i j(wt.i iVar) {
        l lVarB;
        l lVarB2 = B(iVar);
        j jVar = null;
        if (lVarB2 == null) {
            wt.i iVarY = y(iVar);
            lVarB = iVarY != null ? B(iVarY) : null;
        } else {
            lVarB = lVarB2;
        }
        wt.s sVarE = E();
        ur.c cVar = ur.c.f200031a;
        if (cVar.l(A(sVarE.N0(iVar)))) {
            jVar = j.READ_ONLY;
        } else if (cVar.k(A(sVarE.F(iVar)))) {
            jVar = j.MUTABLE;
        }
        return new i(lVarB, jVar, E().d0(iVar) || J(iVar), lVarB != lVarB2);
    }

    private final i k(a aVar) {
        List listN;
        m mVarR;
        wt.i iVarB;
        wt.p pVarN;
        if (aVar.b() == null) {
            wt.s sVarE = E();
            wt.q qVarC = aVar.c();
            if ((qVarC != null ? sVarE.x(qVarC) : null) == wt.y.IN) {
                return i.f175656e.a();
            }
        }
        boolean z15 = false;
        boolean z16 = aVar.c() == null;
        wt.i iVarB2 = aVar.b();
        if (iVarB2 == null || (listN = q(iVarB2)) == null) {
            listN = pq.v.n();
        }
        wt.s sVarE2 = E();
        wt.i iVarB3 = aVar.b();
        wt.q qVarX = (iVarB3 == null || (pVarN = sVarE2.n(iVarB3)) == null) ? null : sVarE2.X(pVarN);
        boolean z17 = t() == js.c.TYPE_PARAMETER_BOUNDS;
        if (z16) {
            if (z17 || !x() || (iVarB = aVar.b()) == null || !F(iVarB)) {
                listN = pq.v.J0(s(), listN);
            } else {
                Iterable<TAnnotation> iterableS = s();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableS) {
                    if (!p().p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listN = pq.v.L0(arrayList, listN);
            }
        }
        j jVarG = p().g(listN);
        m mVarH = p().h(listN, new rs.a(this, aVar));
        if (mVarH != null) {
            l lVarC = mVarH.c();
            if (mVarH.c() == l.NOT_NULL && qVarX != null) {
                z15 = true;
            }
            return new i(lVarC, jVarG, z15, mVarH.d());
        }
        js.c cVarT = (z16 || z17) ? t() : js.c.TYPE_USE;
        js.f0 f0VarA = aVar.a();
        js.w wVarA = f0VarA != null ? f0VarA.a(cVarT) : null;
        m mVarR2 = qVarX != null ? r(qVarX) : null;
        m mVarW = w(mVarR2, wVarA);
        boolean z18 = (mVarR2 != null ? mVarR2.c() : null) == l.NOT_NULL || !(qVarX == null || wVarA == null || !wVarA.c());
        wt.q qVarC2 = aVar.c();
        if (qVarC2 == null || (mVarR = r(qVarC2)) == null) {
            mVarR = null;
        } else if (mVarR.c() == l.NULLABLE) {
            mVarR = m.b(mVarR, l.FORCE_FLEXIBILITY, false, 2, null);
        }
        m mVarK = K(mVarR, mVarW);
        l lVarC2 = mVarK != null ? mVarK.c() : null;
        if (mVarK != null && mVarK.d()) {
            z15 = true;
        }
        return new i(lVarC2, jVarG, z18, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(e eVar, a aVar, Object obj) {
        return eVar.o(obj, aVar.b());
    }

    private final <T> List<T> m(T t15, er.l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        n(t15, arrayList, lVar);
        return arrayList;
    }

    private final <T> void n(T t15, List<T> list, er.l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t15);
        Iterable<? extends T> iterableB = lVar.b(t15);
        if (iterableB != null) {
            Iterator<? extends T> it = iterableB.iterator();
            while (it.hasNext()) {
                n(it.next(), list, lVar);
            }
        }
    }

    private final m r(wt.q qVar) {
        List<wt.i> listB;
        l lVar;
        wt.s sVarE = E();
        if (!I(qVar)) {
            return null;
        }
        List<wt.i> listM = sVarE.M(qVar);
        List<wt.i> list = listM;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!sVarE.B((wt.i) it.next())) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (B((wt.i) obj) != null) {
                            arrayList.add(obj);
                        }
                    }
                    oq.k kVarB = oq.l.b(oq.o.NONE, new b(listM, this));
                    if (!arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            do {
                                if (it4.hasNext()) {
                                }
                            } while (!C((wt.i) it4.next()));
                            listB = listM;
                        }
                        return new m(l.FORCE_FLEXIBILITY, false);
                    }
                    if (b(kVarB).isEmpty()) {
                        break;
                    }
                    List<wt.i> listB2 = b(kVarB);
                    if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
                        Iterator<T> it5 = listB2.iterator();
                        do {
                            if (it5.hasNext()) {
                            }
                        } while (!C((wt.i) it5.next()));
                        listB = b(kVarB);
                    }
                    return new m(l.FORCE_FLEXIBILITY, true);
                    List<wt.i> list2 = listB;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                lVar = l.NULLABLE;
                                break;
                            }
                            if (!sVarE.q((wt.i) it6.next())) {
                                lVar = l.NOT_NULL;
                                break;
                            }
                        }
                    } else {
                        lVar = l.NULLABLE;
                        break;
                    }
                    return new m(lVar, listB != listM);
                }
            }
        }
        return null;
    }

    public abstract zs.d A(wt.i iVar);

    public boolean C(wt.i iVar) {
        return true;
    }

    public abstract boolean D();

    public abstract wt.s E();

    public abstract boolean F(wt.i iVar);

    public abstract boolean G();

    public abstract boolean H(wt.i iVar, wt.i iVar2);

    public abstract boolean I(wt.q qVar);

    public abstract boolean J(wt.i iVar);

    public final er.l<Integer, i> g(wt.i iVar, Iterable<? extends wt.i> iterable, r1 r1Var, boolean z15) {
        int size;
        wt.i iVarB;
        List<a> listL = L(iVar);
        ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
        Iterator<? extends wt.i> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(L(it.next()));
        }
        if (z()) {
            size = 1;
        } else {
            if (G() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
                Iterator<? extends wt.i> it4 = iterable.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (!H(iVar, it4.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = listL.size();
        }
        i[] iVarArr = new i[size];
        int i15 = 0;
        while (i15 < size) {
            i iVarK = k(listL.get(i15));
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                a aVar = (a) pq.v.o0((List) it5.next(), i15);
                i iVarJ = (aVar == null || (iVarB = aVar.b()) == null) ? null : j(iVarB);
                if (iVarJ != null) {
                    arrayList2.add(iVarJ);
                }
            }
            iVarArr[i15] = t1.a(iVarK, arrayList2, i15 == 0 && G(), i15 == 0 && v(), z15);
            i15++;
        }
        return new c(r1Var, iVarArr);
    }

    public abstract boolean o(TAnnotation tannotation, wt.i iVar);

    public abstract js.b<TAnnotation> p();

    public abstract Iterable<TAnnotation> q(wt.i iVar);

    public abstract Iterable<TAnnotation> s();

    public abstract js.c t();

    public abstract js.f0 u();

    public abstract boolean v();

    protected abstract m w(m mVar, js.w wVar);

    public abstract boolean x();

    public abstract wt.i y(wt.i iVar);

    public boolean z() {
        return false;
    }
}
