package st;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f184041a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f184042b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f184044b;

        static {
            int[] iArr = new int[wt.y.values().length];
            try {
                iArr[wt.y.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wt.y.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wt.y.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f184043a = iArr;
            int[] iArr2 = new int[w1.b.values().length];
            try {
                iArr2[w1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w1.b.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f184044b = iArr2;
        }
    }

    private h() {
    }

    private final boolean A(wt.s sVar, wt.i iVar, wt.i iVar2, wt.p pVar) {
        wt.q qVarN;
        wt.j jVarE = wt.t.e(sVar, iVar);
        if (jVarE instanceof wt.d) {
            wt.d dVar = (wt.d) jVarE;
            if (wt.t.J(sVar, dVar) || !wt.t.L(sVar, wt.t.V(sVar, wt.t.Y(sVar, dVar))) || wt.t.g(sVar, dVar) != wt.b.FOR_SUBTYPING) {
                return false;
            }
            wt.p pVarZ = wt.t.Z(sVar, iVar2);
            wt.x xVar = pVarZ instanceof wt.x ? (wt.x) pVarZ : null;
            if (xVar != null && (qVarN = wt.t.n(sVar, xVar)) != null && wt.t.q(sVar, qVarN, pVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<wt.j> B(wt.s sVar, List<? extends wt.j> list) {
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                wt.l lVarB = wt.t.b(sVar, (wt.j) obj);
                int iW0 = sVar.w0(lVarB);
                int i15 = 0;
                while (true) {
                    if (i15 >= iW0) {
                        arrayList.add(obj);
                        break;
                    }
                    wt.i iVarM = wt.t.m(sVar, sVar.u0(lVarB, i15));
                    if ((iVarM != null ? wt.t.d(sVar, iVarM) : null) != null) {
                        break;
                    }
                    i15++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private final Boolean c(w1 w1Var, wt.s sVar, wt.j jVar, wt.j jVar2) {
        if (!wt.t.D(sVar, jVar) && !wt.t.D(sVar, jVar2)) {
            return null;
        }
        if (f(sVar, jVar) && f(sVar, jVar2)) {
            return Boolean.TRUE;
        }
        if (wt.t.D(sVar, jVar)) {
            if (g(sVar, w1Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (wt.t.D(sVar, jVar2) && (e(sVar, jVar) || g(sVar, w1Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(wt.s sVar, wt.j jVar) {
        wt.i iVarM;
        wt.j jVarB0;
        return (jVar instanceof wt.d) && (iVarM = wt.t.m(sVar, wt.t.V(sVar, wt.t.Y(sVar, (wt.d) jVar)))) != null && (jVarB0 = wt.t.b0(sVar, iVarM)) != null && wt.t.D(sVar, jVarB0);
    }

    private static final boolean e(wt.s sVar, wt.j jVar) {
        wt.p pVarA0 = wt.t.a0(sVar, jVar);
        if (!(pVarA0 instanceof wt.h)) {
            return false;
        }
        Collection<wt.i> collectionX = wt.t.X(sVar, pVarA0);
        if ((collectionX instanceof Collection) && collectionX.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionX.iterator();
        while (it.hasNext()) {
            wt.j jVarE = wt.t.e(sVar, (wt.i) it.next());
            if (jVarE != null && wt.t.D(sVar, jVarE)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(wt.s sVar, wt.j jVar) {
        return wt.t.D(sVar, jVar) || d(sVar, jVar);
    }

    private static final boolean g(wt.s sVar, w1 w1Var, wt.j jVar, wt.j jVar2, boolean z15) {
        w1 w1Var2;
        wt.j jVar3;
        Collection<wt.i> collectionU = wt.t.U(sVar, jVar);
        if ((collectionU instanceof Collection) && collectionU.isEmpty()) {
            return false;
        }
        for (wt.i iVar : collectionU) {
            if (fr.t.c(wt.t.Z(sVar, iVar), wt.t.a0(sVar, jVar2))) {
                return true;
            }
            if (z15) {
                w1Var2 = w1Var;
                jVar3 = jVar2;
                if (w(f184041a, w1Var2, jVar3, iVar, false, 8, null)) {
                    return true;
                }
            } else {
                w1Var2 = w1Var;
                jVar3 = jVar2;
            }
            w1Var = w1Var2;
            jVar2 = jVar3;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0123  */
    private final Boolean h(w1 w1Var, wt.s sVar, wt.j jVar, wt.j jVar2) {
        wt.q qVarP;
        boolean z15 = false;
        if (wt.t.A(sVar, jVar) || wt.t.A(sVar, jVar2)) {
            if (w1Var.n()) {
                return Boolean.TRUE;
            }
            return (!wt.t.G(sVar, jVar) || wt.t.G(sVar, jVar2)) ? Boolean.valueOf(d.f184013a.b(sVar, wt.t.d0(sVar, jVar, false), wt.t.d0(sVar, jVar2, false))) : Boolean.FALSE;
        }
        if (wt.t.N(sVar, jVar) && wt.t.N(sVar, jVar2)) {
            return Boolean.valueOf(s(sVar, jVar, jVar2) || w1Var.o());
        }
        if (wt.t.M(sVar, jVar) || wt.t.M(sVar, jVar2)) {
            return Boolean.valueOf(w1Var.o());
        }
        wt.d dVarC = wt.t.c(sVar, jVar2);
        wt.i iVarQ = dVarC != null ? wt.t.Q(sVar, dVarC) : null;
        if (dVarC != null && iVarQ != null) {
            if (wt.t.G(sVar, jVar2)) {
                iVarQ = wt.t.c0(sVar, iVarQ, true);
            } else if (wt.t.x(sVar, jVar2)) {
                iVarQ = wt.t.R(sVar, iVarQ);
            }
            int i15 = a.f184044b[w1Var.g(jVar, dVarC).ordinal()];
            if (i15 == 1) {
                return Boolean.valueOf(w(this, w1Var, jVar, iVarQ, false, 8, null));
            }
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new oq.p();
                }
            } else if (w(this, w1Var, jVar, iVarQ, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        wt.p pVarA0 = wt.t.a0(sVar, jVar2);
        if (wt.t.F(sVar, pVarA0)) {
            wt.t.G(sVar, jVar2);
            Collection<wt.i> collectionX = wt.t.X(sVar, pVarA0);
            if ((collectionX instanceof Collection) && collectionX.isEmpty()) {
                z15 = true;
            } else {
                Iterator<T> it = collectionX.iterator();
                while (it.hasNext()) {
                    if (!w(f184041a, w1Var, jVar, (wt.i) it.next(), false, 8, null)) {
                    }
                }
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
        wt.p pVarA1 = wt.t.a0(sVar, jVar);
        if (jVar instanceof wt.d) {
            qVarP = p(sVar, jVar2, jVar);
            if (qVarP != null && wt.t.q(sVar, qVarP, wt.t.a0(sVar, jVar2))) {
                return Boolean.TRUE;
            }
        } else if (wt.t.F(sVar, pVarA1)) {
            Collection<wt.i> collectionX2 = wt.t.X(sVar, pVarA1);
            if ((collectionX2 instanceof Collection) && collectionX2.isEmpty()) {
                qVarP = p(sVar, jVar2, jVar);
                if (qVarP != null) {
                    return Boolean.TRUE;
                }
            } else {
                Iterator<T> it4 = collectionX2.iterator();
                while (it4.hasNext()) {
                    if (!(((wt.i) it4.next()) instanceof wt.d)) {
                    }
                }
                qVarP = p(sVar, jVar2, jVar);
                if (qVarP != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    private final List<wt.j> i(w1 w1Var, wt.s sVar, wt.j jVar, wt.p pVar) {
        w1.c cVarV0;
        List<wt.k> listH = wt.t.h(sVar, jVar, pVar);
        if (listH != null) {
            return listH;
        }
        if (!wt.t.u(sVar, pVar) && wt.t.t(sVar, jVar)) {
            return pq.v.n();
        }
        if (wt.t.v(sVar, pVar)) {
            if (!sVar.y0(wt.t.a0(sVar, jVar), pVar)) {
                return pq.v.n();
            }
            wt.j jVarS0 = sVar.S0(jVar, wt.b.FOR_SUBTYPING);
            if (jVarS0 != null) {
                jVar = jVarS0;
            }
            return pq.v.e(jVar);
        }
        cu.j jVar2 = new cu.j();
        w1Var.k();
        ArrayDeque<wt.j> arrayDequeH = w1Var.h();
        Set<wt.j> setI = w1Var.i();
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            wt.j jVarPop = arrayDequeH.pop();
            if (setI.add(jVarPop)) {
                wt.j jVarS1 = sVar.S0(jVarPop, wt.b.FOR_SUBTYPING);
                if (jVarS1 == null) {
                    jVarS1 = jVarPop;
                }
                if (sVar.y0(wt.t.a0(sVar, jVarS1), pVar)) {
                    jVar2.add(jVarS1);
                    cVarV0 = w1.c.C4746c.f184166a;
                } else {
                    cVarV0 = wt.t.a(sVar, jVarS1) == 0 ? w1.c.b.f184165a : w1Var.j().v0(jVarS1);
                }
                if (fr.t.c(cVarV0, w1.c.C4746c.f184166a)) {
                    cVarV0 = null;
                }
                if (cVarV0 != null) {
                    wt.s sVarJ = w1Var.j();
                    Iterator<wt.i> it = sVarJ.I0(sVarJ.d(jVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVarV0.a(w1Var, it.next()));
                    }
                }
            }
        }
        w1Var.e();
        return jVar2;
    }

    private final List<wt.j> j(w1 w1Var, wt.s sVar, wt.j jVar, wt.p pVar) {
        return B(sVar, i(w1Var, sVar, jVar, pVar));
    }

    private final boolean k(w1 w1Var, wt.s sVar, wt.i iVar, wt.i iVar2, boolean z15) {
        wt.i iVarP = w1Var.p(w1Var.q(iVar));
        wt.i iVarP2 = w1Var.p(w1Var.q(iVar2));
        if (w1Var.m() && wt.t.B(sVar, iVarP) && wt.t.w(sVar, iVarP2)) {
            return k(w1Var, sVar, wt.t.O(sVar, wt.t.d(sVar, iVarP)), wt.t.S(sVar, wt.t.e(sVar, iVarP2)), z15);
        }
        Boolean boolH = h(w1Var, sVar, wt.t.P(sVar, iVarP), wt.t.b0(sVar, iVarP2));
        if (boolH == null) {
            Boolean boolC = w1Var.c(iVarP, iVarP2, z15);
            return boolC != null ? boolC.booleanValue() : x(w1Var, sVar, wt.t.P(sVar, iVarP), wt.t.b0(sVar, iVarP2));
        }
        boolean zBooleanValue = boolH.booleanValue();
        w1Var.c(iVarP, iVarP2, z15);
        return zBooleanValue;
    }

    private final wt.q p(wt.s sVar, wt.i iVar, wt.i iVar2) {
        wt.i iVarM;
        int iA = wt.t.a(sVar, iVar);
        int i15 = 0;
        while (true) {
            if (i15 >= iA) {
                return null;
            }
            wt.m mVarJ = wt.t.j(sVar, iVar, i15);
            wt.m mVar = wt.t.L(sVar, mVarJ) ? null : mVarJ;
            if (mVar != null && (iVarM = wt.t.m(sVar, mVar)) != null) {
                boolean z15 = wt.t.s(sVar, wt.t.P(sVar, iVarM)) && wt.t.s(sVar, wt.t.P(sVar, iVar2));
                if (fr.t.c(iVarM, iVar2) || (z15 && fr.t.c(wt.t.Z(sVar, iVarM), wt.t.Z(sVar, iVar2)))) {
                    return wt.t.l(sVar, wt.t.Z(sVar, iVar), i15);
                }
                wt.q qVarP = p(sVar, iVarM, iVar2);
                if (qVarP != null) {
                    return qVarP;
                }
            }
            i15++;
        }
    }

    private final boolean q(w1 w1Var, wt.s sVar, wt.j jVar) {
        wt.p pVarA0 = wt.t.a0(sVar, jVar);
        if (wt.t.u(sVar, pVarA0)) {
            return wt.t.I(sVar, pVarA0);
        }
        if (wt.t.I(sVar, wt.t.a0(sVar, jVar))) {
            return true;
        }
        w1Var.k();
        ArrayDeque<wt.j> arrayDequeH = w1Var.h();
        Set<wt.j> setI = w1Var.i();
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            wt.j jVarPop = arrayDequeH.pop();
            if (setI.add(jVarPop)) {
                w1.c cVar = wt.t.t(sVar, jVarPop) ? w1.c.C4746c.f184166a : w1.c.b.f184165a;
                if (fr.t.c(cVar, w1.c.C4746c.f184166a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    wt.s sVarJ = w1Var.j();
                    Iterator<wt.i> it = sVarJ.I0(sVarJ.d(jVarPop)).iterator();
                    while (it.hasNext()) {
                        wt.j jVarA = cVar.a(w1Var, it.next());
                        if (wt.t.I(sVar, wt.t.a0(sVar, jVarA))) {
                            w1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        w1Var.e();
        return false;
    }

    private final boolean r(wt.s sVar, wt.i iVar) {
        return (!wt.t.y(sVar, wt.t.Z(sVar, iVar)) || wt.t.z(sVar, iVar) || wt.t.w(sVar, iVar) || wt.t.H(sVar, iVar) || wt.t.C(sVar, iVar)) ? false : true;
    }

    private final boolean s(wt.s sVar, wt.j jVar, wt.j jVar2) {
        if (wt.t.a0(sVar, jVar) != wt.t.a0(sVar, jVar2)) {
            return false;
        }
        if (wt.t.x(sVar, jVar) || !wt.t.x(sVar, jVar2)) {
            return !wt.t.G(sVar, jVar) || wt.t.G(sVar, jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean w(h hVar, w1 w1Var, wt.i iVar, wt.i iVar2, boolean z15, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        return hVar.v(w1Var, iVar, iVar2, z15);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    private final boolean x(w1 w1Var, wt.s sVar, wt.j jVar, wt.j jVar2) {
        Collection<wt.j> arrayList;
        wt.j jVarE;
        wt.p pVar;
        boolean z15;
        wt.i iVarM;
        if (f184042b) {
            if (!wt.t.K(sVar, jVar) && !wt.t.F(sVar, wt.t.a0(sVar, jVar))) {
                w1Var.l(jVar);
            }
            if (!wt.t.K(sVar, jVar2)) {
                w1Var.l(jVar2);
            }
        }
        boolean z16 = false;
        if (!c.f184003a.d(w1Var, jVar, jVar2)) {
            return false;
        }
        Boolean boolC = c(w1Var, sVar, jVar, jVar2);
        if (boolC != null) {
            boolean zBooleanValue = boolC.booleanValue();
            w1.d(w1Var, jVar, jVar2, false, 4, null);
            return zBooleanValue;
        }
        wt.p pVarA0 = wt.t.a0(sVar, jVar2);
        boolean z17 = true;
        if ((sVar.y0(wt.t.a0(sVar, jVar), pVarA0) && wt.t.T(sVar, pVarA0) == 0) || wt.t.r(sVar, wt.t.a0(sVar, jVar2))) {
            return true;
        }
        List<wt.j> listN = n(w1Var, jVar, pVarA0);
        int i15 = 10;
        if (listN.size() > 1) {
            wt.s sVarJ = w1Var.j();
            wt.v vVar = sVarJ instanceof wt.v ? (wt.v) sVarJ : null;
            if (vVar == null || !vVar.L()) {
                List<wt.j> list = listN;
                arrayList = new ArrayList(pq.v.y(list, 10));
                for (wt.j jVar3 : list) {
                    jVarE = wt.t.e(sVar, w1Var.p(jVar3));
                    if (jVarE == null) {
                        jVar3 = jVarE;
                    }
                    arrayList.add(jVar3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (wt.j jVar4 : listN) {
                    wt.j jVarE2 = wt.t.e(sVar, w1Var.p(jVar4));
                    if (jVarE2 != null) {
                        jVar4 = jVarE2;
                    }
                    arrayList.add(jVar4);
                }
            }
        } else {
            List<wt.j> list2 = listN;
            arrayList = new ArrayList(pq.v.y(list2, 10));
            while (r7.hasNext()) {
                jVarE = wt.t.e(sVar, w1Var.p(jVar3));
                if (jVarE == null) {
                    jVar3 = jVarE;
                }
                arrayList.add(jVar3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return q(w1Var, sVar, jVar);
        }
        if (size == 1) {
            return t(w1Var, sVar, wt.t.b(sVar, (wt.j) pq.v.k0(arrayList)), jVar2);
        }
        wt.a aVar = new wt.a(wt.t.T(sVar, pVarA0));
        int iT = wt.t.T(sVar, pVarA0);
        int i16 = 0;
        boolean z18 = false;
        while (i16 < iT) {
            z18 = (z18 || wt.t.p(sVar, wt.t.l(sVar, pVarA0, i16)) != wt.y.OUT) ? z17 : z16;
            if (z18) {
                pVar = pVarA0;
                z15 = z17;
            } else {
                ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, i15));
                for (wt.j jVar5 : arrayList) {
                    boolean z19 = z17;
                    wt.m mVarK = wt.t.k(sVar, jVar5, i16);
                    if (mVarK != null) {
                        wt.p pVar2 = pVarA0;
                        if (wt.t.o(sVar, mVarK) != wt.y.INV) {
                            mVarK = null;
                        }
                        if (mVarK != null && (iVarM = wt.t.m(sVar, mVarK)) != null) {
                            arrayList2.add(iVarM);
                            z17 = z19;
                            pVarA0 = pVar2;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + jVar5 + ", subType: " + jVar + ", superType: " + jVar2).toString());
                }
                pVar = pVarA0;
                z15 = z17;
                aVar.add(wt.t.f(sVar, sVar.G(arrayList2)));
            }
            i16++;
            z17 = z15;
            pVarA0 = pVar;
            z16 = false;
            i15 = 10;
        }
        return (z18 || !t(w1Var, sVar, aVar, jVar2)) ? w1Var.r(new f(arrayList, w1Var, sVar, jVar2)) : z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(Collection collection, w1 w1Var, wt.s sVar, wt.j jVar, w1.a aVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(new g(w1Var, sVar, (wt.j) it.next(), jVar));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(w1 w1Var, wt.s sVar, wt.j jVar, wt.j jVar2) {
        return f184041a.t(w1Var, sVar, wt.t.b(sVar, jVar), jVar2);
    }

    public final wt.y l(wt.y yVar, wt.y yVar2) {
        wt.y yVar3 = wt.y.INV;
        if (yVar == yVar3) {
            return yVar2;
        }
        if (yVar2 == yVar3 || yVar == yVar2) {
            return yVar;
        }
        return null;
    }

    public final boolean m(w1 w1Var, wt.i iVar, wt.i iVar2) {
        wt.s sVarJ = w1Var.j();
        if (iVar == iVar2) {
            return true;
        }
        h hVar = f184041a;
        if (hVar.r(sVarJ, iVar) && hVar.r(sVarJ, iVar2)) {
            wt.i iVarP = w1Var.p(w1Var.q(iVar));
            wt.i iVarP2 = w1Var.p(w1Var.q(iVar2));
            wt.j jVarN0 = sVarJ.N0(iVarP);
            if (!sVarJ.y0(sVarJ.n(iVarP), sVarJ.n(iVarP2))) {
                return false;
            }
            if (sVarJ.r0(jVarN0) == 0) {
                return sVarJ.M0(iVarP) || sVarJ.M0(iVarP2) || sVarJ.A(jVarN0) == sVarJ.A(sVarJ.N0(iVarP2));
            }
        }
        return w(hVar, w1Var, iVar, iVar2, false, 8, null) && w(hVar, w1Var, iVar2, iVar, false, 8, null);
    }

    public final List<wt.j> n(w1 w1Var, wt.j jVar, wt.p pVar) {
        return f184041a.o(w1Var, w1Var.j(), jVar, pVar);
    }

    public final List<wt.j> o(w1 w1Var, wt.s sVar, wt.j jVar, wt.p pVar) {
        w1.c cVar;
        if (wt.t.t(sVar, jVar)) {
            return j(w1Var, sVar, jVar, pVar);
        }
        if (!wt.t.u(sVar, pVar) && !wt.t.E(sVar, pVar)) {
            return i(w1Var, sVar, jVar, pVar);
        }
        cu.j jVar2 = new cu.j();
        w1Var.k();
        ArrayDeque<wt.j> arrayDequeH = w1Var.h();
        Set<wt.j> setI = w1Var.i();
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            wt.j jVarPop = arrayDequeH.pop();
            if (setI.add(jVarPop)) {
                if (wt.t.t(sVar, jVarPop)) {
                    jVar2.add(jVarPop);
                    cVar = w1.c.C4746c.f184166a;
                } else {
                    cVar = w1.c.b.f184165a;
                }
                if (fr.t.c(cVar, w1.c.C4746c.f184166a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    wt.s sVarJ = w1Var.j();
                    Iterator<wt.i> it = sVarJ.I0(sVarJ.d(jVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(cVar.a(w1Var, it.next()));
                    }
                }
            }
        }
        w1Var.e();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it4 = jVar2.iterator();
        while (it4.hasNext()) {
            pq.v.D(arrayList, f184041a.j(w1Var, sVar, (wt.j) it4.next(), pVar));
        }
        return arrayList;
    }

    public final boolean t(w1 w1Var, wt.s sVar, wt.l lVar, wt.j jVar) {
        boolean zM;
        w1 w1Var2 = w1Var;
        wt.p pVarA0 = wt.t.a0(sVar, jVar);
        int iW = wt.t.W(sVar, lVar);
        int iT = wt.t.T(sVar, pVarA0);
        if (iW != iT || iW != wt.t.a(sVar, jVar)) {
            return false;
        }
        for (int i15 = 0; i15 < iT; i15++) {
            wt.m mVarJ = wt.t.j(sVar, jVar, i15);
            wt.i iVarM = wt.t.m(sVar, mVarJ);
            if (iVarM != null) {
                wt.m mVarI = wt.t.i(sVar, lVar, i15);
                wt.t.o(sVar, mVarI);
                wt.y yVar = wt.y.INV;
                wt.i iVarM2 = wt.t.m(sVar, mVarI);
                wt.y yVarL = l(wt.t.p(sVar, wt.t.l(sVar, pVarA0, i15)), wt.t.o(sVar, mVarJ));
                if (yVarL == null) {
                    return w1Var2.n();
                }
                if (yVarL != yVar || (!A(sVar, iVarM2, iVarM, pVarA0) && !A(sVar, iVarM, iVarM2, pVarA0))) {
                    if (w1Var2.f184155h > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + iVarM2).toString());
                    }
                    w1Var2.f184155h++;
                    int i16 = a.f184043a[yVarL.ordinal()];
                    if (i16 == 1) {
                        zM = f184041a.m(w1Var2, iVarM2, iVarM);
                    } else if (i16 == 2) {
                        w1Var2 = w1Var;
                        zM = w(f184041a, w1Var2, iVarM2, iVarM, false, 8, null);
                    } else {
                        if (i16 != 3) {
                            throw new oq.p();
                        }
                        zM = w(f184041a, w1Var2, iVarM, iVarM2, false, 8, null);
                        w1Var2 = w1Var;
                    }
                    w1Var2.f184155h--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean u(w1 w1Var, wt.i iVar, wt.i iVar2) {
        return w(this, w1Var, iVar, iVar2, false, 8, null);
    }

    public final boolean v(w1 w1Var, wt.i iVar, wt.i iVar2, boolean z15) {
        if (iVar == iVar2) {
            return true;
        }
        if (!w1Var.f(iVar, iVar2)) {
            return false;
        }
        return f184041a.k(w1Var, w1Var.j(), iVar, iVar2, z15);
    }
}
