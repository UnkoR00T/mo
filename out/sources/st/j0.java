package st;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184059a;

        static {
            int[] iArr = new int[wt.y.values().length];
            try {
                iArr[wt.y.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f184059a = iArr;
        }
    }

    private static final wt.q a(j2 j2Var, wt.i iVar) {
        return j2Var.X(j2Var.n(iVar));
    }

    private static final wt.q b(j2 j2Var, wt.i iVar) {
        wt.i iVarH0;
        wt.q qVarA = a(j2Var, iVar);
        if (qVarA != null) {
            return qVarA;
        }
        if (j2Var.F0(iVar) && (iVarH0 = j2Var.H0((wt.m) pq.v.P0(j2Var.e0(iVar)))) != null) {
            return b(j2Var, iVarH0);
        }
        return null;
    }

    public static final wt.i c(j2 j2Var, wt.i iVar) {
        return d(j2Var, iVar, new HashSet());
    }

    private static final wt.i d(j2 j2Var, wt.i iVar, HashSet<wt.p> hashSet) {
        wt.i iVarD;
        wt.p pVarN = j2Var.n(iVar);
        if (!hashSet.add(pVarN)) {
            return null;
        }
        wt.q qVarX = j2Var.X(pVarN);
        if (qVarX != null) {
            wt.i iVarB0 = j2Var.b0(qVarX);
            wt.i iVarD2 = d(j2Var, iVarB0, hashSet);
            if (iVarD2 == null) {
                return null;
            }
            boolean z15 = j2Var.R0(j2Var.n(iVarB0)) || ((iVarB0 instanceof wt.k) && j2Var.K((wt.k) iVarB0));
            if ((iVarD2 instanceof wt.k) && j2Var.K((wt.k) iVarD2) && j2Var.q(iVar) && z15) {
                return j2Var.t0(iVarB0);
            }
            return (j2Var.q(iVarD2) || !j2Var.A(iVar)) ? iVarD2 : j2Var.t0(iVarD2);
        }
        if (j2Var.R0(pVarN)) {
            wt.i iVarE = e(j2Var, iVar);
            if (iVarE == null || (iVarD = d(j2Var, iVarE, hashSet)) == null) {
                return null;
            }
            if (!j2Var.q(iVar)) {
                return iVarD;
            }
            if (!j2Var.q(iVarD) && (!(iVarD instanceof wt.k) || !j2Var.K((wt.k) iVarD))) {
                return j2Var.t0(iVarD);
            }
        }
        return iVar;
    }

    private static final wt.i e(j2 j2Var, wt.i iVar) {
        List<wt.q> listY = j2Var.y(j2Var.n(iVar));
        List<wt.m> listE0 = j2Var.e0(iVar);
        ArrayList arrayList = new ArrayList(pq.v.y(listE0, 10));
        int i15 = 0;
        for (Object obj : listE0) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            wt.i iVarH0 = j2Var.H0((wt.m) obj);
            if (iVarH0 == null) {
                iVarH0 = j2Var.b0(listY.get(i15));
            }
            arrayList.add(iVarH0);
            i15 = i16;
        }
        List<wt.q> list = listY;
        ArrayList arrayList2 = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(j2Var.J((wt.q) it.next()));
        }
        wt.r rVarR = j2Var.R(pq.v0.s(pq.v.p1(arrayList2, arrayList)));
        wt.i iVarI = j2Var.I(iVar);
        if (iVarI == null) {
            return null;
        }
        wt.q qVarB = b(j2Var, iVarI);
        return qVarB == null ? j2Var.w(rVarR, iVarI) : f(j2Var, iVarI, j2Var.w(rVarR, j2Var.b0(qVarB)));
    }

    private static final wt.i f(j2 j2Var, wt.i iVar, wt.i iVar2) {
        if (a(j2Var, iVar) != null) {
            return j2Var.q(iVar) ? j2Var.t0(iVar2) : iVar2;
        }
        wt.m mVar = (wt.m) pq.v.P0(j2Var.e0(iVar));
        wt.k kVarN0 = j2Var.n0(a.f184059a[j2Var.m(mVar).ordinal()] == 1 ? j2Var.k0() : f(j2Var, j2Var.H0(mVar), iVar2));
        return j2Var.q(iVar) ? j2Var.t0(kVarN0) : kVarN0;
    }
}
