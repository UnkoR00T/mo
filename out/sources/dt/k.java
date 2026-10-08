package dt;

import st.e1;
import st.t0;
import vr.a0;
import vr.a1;
import vr.j0;
import vr.r1;
import vr.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zs.c f44489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.b f44490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zs.c f44491c;

    static {
        zs.c cVar = new zs.c("kotlin.jvm.JvmInline");
        f44489a = cVar;
        f44490b = zs.b.f236634d.c(cVar);
        f44491c = new zs.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(vr.a aVar) {
        return (aVar instanceof a1) && f(((a1) aVar).Z());
    }

    public static final boolean b(vr.m mVar) {
        return (mVar instanceof vr.e) && (((vr.e) mVar).Y() instanceof a0);
    }

    public static final boolean c(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC != null) {
            return b(hVarC);
        }
        return false;
    }

    public static final boolean d(vr.m mVar) {
        return (mVar instanceof vr.e) && (((vr.e) mVar).Y() instanceof j0);
    }

    public static final boolean e(u1 u1Var) {
        a0<e1> a0VarQ;
        if (u1Var.R() != null) {
            return false;
        }
        vr.m mVarB = u1Var.b();
        zs.f fVarC = null;
        vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        if (eVar != null && (a0VarQ = ht.e.q(eVar)) != null) {
            fVarC = a0VarQ.c();
        }
        return fr.t.c(fVarC, u1Var.getName());
    }

    public static final boolean f(u1 u1Var) {
        r1<e1> r1VarY;
        if (u1Var.R() != null) {
            return false;
        }
        vr.m mVarB = u1Var.b();
        vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        return (eVar == null || (r1VarY = eVar.Y()) == null || !r1VarY.a(u1Var.getName())) ? false : true;
    }

    public static final boolean g(vr.m mVar) {
        return b(mVar) || d(mVar);
    }

    public static final boolean h(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC != null) {
            return g(hVarC);
        }
        return false;
    }

    public static final boolean i(t0 t0Var) {
        vr.h hVarC = t0Var.T0().c();
        return (hVarC == null || !d(hVarC) || tt.u.f192145a.q(t0Var)) ? false : true;
    }

    public static final t0 j(t0 t0Var) {
        a0<e1> a0VarQ;
        vr.h hVarC = t0Var.T0().c();
        vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
        if (eVar == null || (a0VarQ = ht.e.q(eVar)) == null) {
            return null;
        }
        return (e1) a0VarQ.d();
    }
}
