package ss;

import java.util.Collection;
import java.util.Set;
import pq.e1;
import qt.m0;
import qt.t0;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f183909b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<ts.a.EnumC5006a> f183910c = e1.d(ts.a.EnumC5006a.CLASS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<ts.a.EnumC5006a> f183911d = e1.i(ts.a.EnumC5006a.FILE_FACADE, ts.a.EnumC5006a.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ws.c f183912e = new ws.c(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ws.c f183913f = new ws.c(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ws.c f183914g = new ws.c(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ot.n f183915a;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final ws.c a() {
            return n.f183914g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return pq.v.n();
    }

    private final qt.r e(x xVar) {
        if (!f().g().e() && xVar.d().j()) {
            return qt.r.UNSTABLE;
        }
        return qt.r.STABLE;
    }

    private final ot.y<ws.c> g(x xVar) {
        if (i() || xVar.d().d().h(h())) {
            return null;
        }
        return new ot.y<>(xVar.d().d(), ws.c.f214749i, h(), h().k(xVar.d().d().j()), xVar.b());
    }

    private final ws.c h() {
        return f().g().d();
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(x xVar) {
        return !f().g().b() && xVar.d().i() && fr.t.c(xVar.d().d(), f183913f);
    }

    private final boolean k(x xVar) {
        return (f().g().g() && (xVar.d().i() || fr.t.c(xVar.d().d(), f183912e))) || j(xVar);
    }

    private final String[] m(x xVar, Set<? extends ts.a.EnumC5006a> set) {
        ts.a aVarD = xVar.d();
        String[] strArrA = aVarD.a();
        if (strArrA == null) {
            strArrA = aVarD.b();
        }
        if (strArrA == null || !set.contains(aVarD.c())) {
            return null;
        }
        return strArrA;
    }

    public final lt.k c(o0 o0Var, x xVar) {
        String[] strArrG;
        oq.r<ys.e, us.m> rVarM;
        String[] strArrM = m(xVar, f183911d);
        if (strArrM == null || (strArrG = xVar.d().g()) == null) {
            return null;
        }
        try {
            try {
                rVarM = ys.h.m(strArrM, strArrG);
            } catch (bt.k e15) {
                throw new IllegalStateException("Could not read data from " + xVar.b(), e15);
            }
        } catch (Throwable th4) {
            if (i() || xVar.d().d().h(h())) {
                throw th4;
            }
            rVarM = null;
        }
        if (rVarM == null) {
            return null;
        }
        ys.e eVarA = rVarM.a();
        us.m mVarB = rVarM.b();
        r rVar = new r(xVar, mVarB, eVarA, g(xVar), k(xVar), e(xVar));
        return new m0(o0Var, mVarB, eVarA, xVar.d().d(), rVar, f(), "scope for " + rVar + " in " + o0Var, m.f183908a);
    }

    public final ot.n f() {
        ot.n nVar = this.f183915a;
        if (nVar != null) {
            return nVar;
        }
        return null;
    }

    public final ot.i l(x xVar) {
        String[] strArrG;
        oq.r<ys.e, us.c> rVarI;
        String[] strArrM = m(xVar, f183910c);
        if (strArrM == null || (strArrG = xVar.d().g()) == null) {
            return null;
        }
        try {
            try {
                rVarI = ys.h.i(strArrM, strArrG);
            } catch (bt.k e15) {
                throw new IllegalStateException("Could not read data from " + xVar.b(), e15);
            }
        } catch (Throwable th4) {
            if (i() || xVar.d().d().h(h())) {
                throw th4;
            }
            rVarI = null;
        }
        if (rVarI == null) {
            return null;
        }
        return new ot.i(rVarI.a(), rVarI.b(), xVar.d().d(), new z(xVar, g(xVar), new t0(k(xVar), null, 2, null), e(xVar)));
    }

    public final vr.e n(x xVar) {
        ot.i iVarL = l(xVar);
        if (iVarL == null) {
            return null;
        }
        return f().f().e(xVar.i(), iVarL);
    }

    public final void o(ot.n nVar) {
        this.f183915a = nVar;
    }

    public final void p(k kVar) {
        o(kVar.a());
    }
}
