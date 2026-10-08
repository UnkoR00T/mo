package yt;

import et.e;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.r;
import pq.v;
import sr.j;
import st.d2;
import st.f2;
import st.h2;
import st.i2;
import st.l2;
import st.n0;
import st.n2;
import st.o2;
import st.p2;
import st.t0;
import st.w0;
import st.x1;
import st.y1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229282a;

        static {
            int[] iArr = new int[p2.values().length];
            try {
                iArr[p2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f229282a = iArr;
        }
    }

    public static final class b extends y1 {
        b() {
        }

        @Override // st.y1
        public d2 k(x1 x1Var) {
            et.b bVar = x1Var instanceof et.b ? (et.b) x1Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.v().b() ? new f2(p2.OUT_VARIANCE, bVar.v().getType()) : bVar.v();
        }
    }

    public static final yt.a<t0> b(t0 t0Var) {
        if (n0.b(t0Var)) {
            yt.a<t0> aVarB = b(n0.c(t0Var));
            yt.a<t0> aVarB2 = b(n0.d(t0Var));
            return new yt.a<>(n2.b(w0.e(n0.c(aVarB.c()), n0.d(aVarB2.c())), t0Var), n2.b(w0.e(n0.c(aVarB.d()), n0.d(aVarB2.d())), t0Var));
        }
        x1 x1VarT0 = t0Var.T0();
        if (e.f(t0Var)) {
            d2 d2VarV = ((et.b) x1VarT0).v();
            t0 t0VarC = c(d2VarV.getType(), t0Var);
            int i15 = a.f229282a[d2VarV.c().ordinal()];
            if (i15 == 2) {
                return new yt.a<>(t0VarC, xt.d.n(t0Var).J());
            }
            if (i15 == 3) {
                return new yt.a<>(c(xt.d.n(t0Var).I(), t0Var), t0VarC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + d2VarV);
        }
        if (t0Var.R0().isEmpty() || t0Var.R0().size() != x1VarT0.getParameters().size()) {
            return new yt.a<>(t0Var, t0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (r rVar : v.p1(t0Var.R0(), x1VarT0.getParameters())) {
            d2 d2Var = (d2) rVar.a();
            d dVarI = i(d2Var, (m1) rVar.b());
            if (d2Var.b()) {
                arrayList.add(dVarI);
                arrayList2.add(dVarI);
            } else {
                yt.a<d> aVarF = f(dVarI);
                d dVarA = aVarF.a();
                d dVarB = aVarF.b();
                arrayList.add(dVarA);
                arrayList2.add(dVarB);
            }
        }
        boolean z15 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((d) it.next()).d()) {
                    z15 = true;
                    break;
                }
            }
        }
        return new yt.a<>(z15 ? xt.d.n(t0Var).I() : g(t0Var, arrayList), g(t0Var, arrayList2));
    }

    private static final t0 c(t0 t0Var, t0 t0Var2) {
        return l2.q(t0Var, t0Var2.U0());
    }

    public static final d2 d(d2 d2Var, boolean z15) {
        if (d2Var == null) {
            return null;
        }
        if (!d2Var.b()) {
            t0 type = d2Var.getType();
            if (l2.c(type, yt.b.f229281a)) {
                p2 p2VarC = d2Var.c();
                if (p2VarC == p2.OUT_VARIANCE) {
                    return new f2(p2VarC, b(type).d());
                }
                return z15 ? new f2(p2VarC, b(type).c()) : h(d2Var);
            }
        }
        return d2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(o2 o2Var) {
        return Boolean.valueOf(e.f(o2Var));
    }

    private static final yt.a<d> f(d dVar) {
        yt.a<t0> aVarB = b(dVar.a());
        t0 t0VarA = aVarB.a();
        t0 t0VarB = aVarB.b();
        yt.a<t0> aVarB2 = b(dVar.b());
        return new yt.a<>(new d(dVar.c(), t0VarB, aVarB2.a()), new d(dVar.c(), t0VarA, aVarB2.b()));
    }

    private static final t0 g(t0 t0Var, List<d> list) {
        t0Var.R0().size();
        list.size();
        List<d> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(j((d) it.next()));
        }
        return h2.e(t0Var, arrayList, null, null, 6, null);
    }

    private static final d2 h(d2 d2Var) {
        return i2.h(new b()).u(d2Var);
    }

    private static final d i(d2 d2Var, m1 m1Var) {
        int i15 = a.f229282a[i2.c(m1Var.q(), d2Var).ordinal()];
        if (i15 == 1) {
            return new d(m1Var, d2Var.getType(), d2Var.getType());
        }
        if (i15 == 2) {
            return new d(m1Var, d2Var.getType(), ht.e.m(m1Var).J());
        }
        if (i15 == 3) {
            return new d(m1Var, ht.e.m(m1Var).I(), d2Var.getType());
        }
        throw new p();
    }

    private static final d2 j(d dVar) {
        dVar.d();
        if (!t.c(dVar.a(), dVar.b())) {
            p2 p2VarQ = dVar.c().q();
            p2 p2Var = p2.IN_VARIANCE;
            if (p2VarQ != p2Var) {
                if ((!j.o0(dVar.a()) || dVar.c().q() == p2Var) && j.q0(dVar.b())) {
                    return new f2(k(dVar, p2Var), dVar.a());
                }
                return new f2(k(dVar, p2.OUT_VARIANCE), dVar.b());
            }
        }
        return new f2(dVar.a());
    }

    private static final p2 k(d dVar, p2 p2Var) {
        return p2Var == dVar.c().q() ? p2.INVARIANT : p2Var;
    }
}
