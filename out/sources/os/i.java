package os;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.r;
import oq.y;
import pq.v;
import st.c2;
import st.d2;
import st.e1;
import st.f2;
import st.g2;
import st.h0;
import st.k2;
import st.n0;
import st.t0;
import st.t1;
import st.w0;
import st.x0;
import st.x1;
import ut.l;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends g2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f149666e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final os.a f149667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final os.a f149668g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f149669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2 f149670d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        k2 k2Var = k2.COMMON;
        f149667f = b.b(k2Var, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f149668g = b.b(k2Var, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(c2 c2Var) {
        g gVar = new g();
        this.f149669c = gVar;
        if (c2Var == null) {
            c2Var = new c2(gVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f149670d = c2Var;
    }

    private final r<e1, Boolean> j(e1 e1Var, vr.e eVar, os.a aVar) {
        if (e1Var.T0().getParameters().isEmpty()) {
            return y.a(e1Var, Boolean.FALSE);
        }
        if (sr.j.d0(e1Var)) {
            d2 d2Var = e1Var.R0().get(0);
            return y.a(w0.k(e1Var.S0(), e1Var.T0(), v.e(new f2(d2Var.c(), l(d2Var.getType(), aVar))), e1Var.U0(), null, 16, null), Boolean.FALSE);
        }
        if (x0.a(e1Var)) {
            return y.a(l.d(ut.k.P, e1Var.T0().toString()), Boolean.FALSE);
        }
        lt.k kVarO = eVar.O(this);
        t1 t1VarS0 = e1Var.S0();
        x1 x1VarO = eVar.o();
        List<m1> parameters = eVar.o().getParameters();
        ArrayList arrayList = new ArrayList(v.y(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(h0.b(this.f149669c, (m1) it.next(), aVar, this.f149670d, null, 8, null));
        }
        return y.a(w0.n(t1VarS0, x1VarO, arrayList, e1Var.U0(), kVarO, new h(eVar, this, e1Var, aVar)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 k(vr.e eVar, i iVar, e1 e1Var, os.a aVar, tt.g gVar) {
        vr.e eVarB;
        zs.b bVarN = ht.e.n(eVar);
        if (bVarN == null || (eVarB = gVar.b(bVarN)) == null || t.c(eVarB, eVar)) {
            return null;
        }
        return iVar.j(e1Var, eVarB, aVar).c();
    }

    private final t0 l(t0 t0Var, os.a aVar) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC instanceof m1) {
            return l(this.f149670d.e((m1) hVarC, aVar.j(true)), aVar);
        }
        if (!(hVarC instanceof vr.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + hVarC).toString());
        }
        vr.h hVarC2 = n0.d(t0Var).T0().c();
        if (hVarC2 instanceof vr.e) {
            r<e1, Boolean> rVarJ = j(n0.c(t0Var), (vr.e) hVarC, f149667f);
            e1 e1VarA = rVarJ.a();
            boolean zBooleanValue = rVarJ.b().booleanValue();
            r<e1, Boolean> rVarJ2 = j(n0.d(t0Var), (vr.e) hVarC2, f149668g);
            e1 e1VarA2 = rVarJ2.a();
            return (zBooleanValue || rVarJ2.b().booleanValue()) ? new k(e1VarA, e1VarA2) : w0.e(e1VarA, e1VarA2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarC2 + "\" while for lower it's \"" + hVarC + '\"').toString());
    }

    static /* synthetic */ t0 m(i iVar, t0 t0Var, os.a aVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = new os.a(k2.COMMON, null, false, false, null, null, 62, null);
        }
        return iVar.l(t0Var, aVar);
    }

    @Override // st.g2
    public boolean f() {
        return false;
    }

    @Override // st.g2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f2 e(t0 t0Var) {
        return new f2(m(this, t0Var, null, 2, null));
    }

    public /* synthetic */ i(c2 c2Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : c2Var);
    }
}
