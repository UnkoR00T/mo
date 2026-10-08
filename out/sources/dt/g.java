package dt;

import st.x1;
import vr.e0;
import vr.h1;
import vr.m1;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f44479a = new g();

    private g() {
    }

    public static /* synthetic */ boolean f(g gVar, vr.a aVar, vr.a aVar2, boolean z15, boolean z16, boolean z17, tt.g gVar2, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z16 = true;
        }
        boolean z18 = z16;
        if ((i15 & 16) != 0) {
            z17 = false;
        }
        return gVar.e(aVar, aVar2, z15, z18, z17, gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(vr.m mVar, vr.m mVar2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z15, vr.a aVar, vr.a aVar2, x1 x1Var, x1 x1Var2) {
        if (fr.t.c(x1Var, x1Var2)) {
            return true;
        }
        vr.h hVarC = x1Var.c();
        vr.h hVarC2 = x1Var2.c();
        if ((hVarC instanceof m1) && (hVarC2 instanceof m1)) {
            return f44479a.n((m1) hVarC, (m1) hVarC2, z15, new f(aVar, aVar2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(vr.a aVar, vr.a aVar2, vr.m mVar, vr.m mVar2) {
        return fr.t.c(mVar, aVar) && fr.t.c(mVar2, aVar2);
    }

    private final boolean j(vr.e eVar, vr.e eVar2) {
        return fr.t.c(eVar.o(), eVar2.o());
    }

    public static /* synthetic */ boolean l(g gVar, vr.m mVar, vr.m mVar2, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z16 = true;
        }
        return gVar.k(mVar, mVar2, z15, z16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean o(g gVar, m1 m1Var, m1 m1Var2, boolean z15, er.p pVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            pVar = c.f44472a;
        }
        return gVar.n(m1Var, m1Var2, z15, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(vr.m mVar, vr.m mVar2) {
        return false;
    }

    private final boolean q(vr.m mVar, vr.m mVar2, er.p<? super vr.m, ? super vr.m, Boolean> pVar, boolean z15) {
        vr.m mVarB = mVar.b();
        vr.m mVarB2 = mVar2.b();
        return ((mVarB instanceof vr.b) || (mVarB2 instanceof vr.b)) ? pVar.B(mVarB, mVarB2).booleanValue() : l(this, mVarB, mVarB2, z15, false, 8, null);
    }

    private final h1 r(vr.a aVar) {
        while (aVar instanceof vr.b) {
            vr.b bVar = (vr.b) aVar;
            if (bVar.k() != vr.b.a.FAKE_OVERRIDE) {
                break;
            }
            aVar = (vr.b) pq.v.Q0(bVar.e());
            if (aVar == null) {
                return null;
            }
        }
        return aVar.m();
    }

    public final boolean e(vr.a aVar, vr.a aVar2, boolean z15, boolean z16, boolean z17, tt.g gVar) {
        if (fr.t.c(aVar, aVar2)) {
            return true;
        }
        if (!fr.t.c(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z16 && (aVar instanceof e0) && (aVar2 instanceof e0) && ((e0) aVar).o0() != ((e0) aVar2).o0()) {
            return false;
        }
        if ((fr.t.c(aVar.b(), aVar2.b()) && (!z15 || !fr.t.c(r(aVar), r(aVar2)))) || i.E(aVar) || i.E(aVar2) || !q(aVar, aVar2, d.f44473a, z15)) {
            return false;
        }
        o oVarI = o.i(gVar, new e(z15, aVar, aVar2));
        o.i.a aVarC = oVarI.E(aVar, aVar2, null, !z17).c();
        o.i.a aVar3 = o.i.a.OVERRIDABLE;
        return aVarC == aVar3 && oVarI.E(aVar2, aVar, null, z17 ^ true).c() == aVar3;
    }

    public final boolean k(vr.m mVar, vr.m mVar2, boolean z15, boolean z16) {
        if ((mVar instanceof vr.e) && (mVar2 instanceof vr.e)) {
            return j((vr.e) mVar, (vr.e) mVar2);
        }
        if ((mVar instanceof m1) && (mVar2 instanceof m1)) {
            return o(this, (m1) mVar, (m1) mVar2, z15, null, 8, null);
        }
        if ((mVar instanceof vr.a) && (mVar2 instanceof vr.a)) {
            return f(this, (vr.a) mVar, (vr.a) mVar2, z15, z16, false, tt.g.a.f192119a, 16, null);
        }
        return ((mVar instanceof o0) && (mVar2 instanceof o0)) ? fr.t.c(((o0) mVar).g(), ((o0) mVar2).g()) : fr.t.c(mVar, mVar2);
    }

    public final boolean m(m1 m1Var, m1 m1Var2, boolean z15) {
        return o(this, m1Var, m1Var2, z15, null, 8, null);
    }

    public final boolean n(m1 m1Var, m1 m1Var2, boolean z15, er.p<? super vr.m, ? super vr.m, Boolean> pVar) {
        if (fr.t.c(m1Var, m1Var2)) {
            return true;
        }
        return !fr.t.c(m1Var.b(), m1Var2.b()) && q(m1Var, m1Var2, pVar, z15) && m1Var.getIndex() == m1Var2.getIndex();
    }
}
