package pr;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m3 extends fr.r0 {
    private static g1 m(fr.f fVar) {
        mr.f fVarI = fVar.i();
        return fVarI instanceof g1 ? (g1) fVarI : l.f161879d;
    }

    @Override // fr.r0
    public mr.c a(Class cls) {
        return new f0(cls);
    }

    @Override // fr.r0
    public mr.g b(fr.p pVar) {
        return new l1(m(pVar), pVar.getName(), pVar.r(), pVar.h());
    }

    @Override // fr.r0
    public mr.c c(Class cls) {
        return i.m(cls);
    }

    @Override // fr.r0
    public mr.f d(Class cls, String str) {
        return i.n(cls);
    }

    @Override // fr.r0
    public mr.i e(fr.y yVar) {
        return new n1(m(yVar), yVar.getName(), yVar.r(), yVar.h());
    }

    @Override // fr.r0
    public mr.j f(fr.a0 a0Var) {
        return new p1(m(a0Var), a0Var.getName(), a0Var.r(), a0Var.h());
    }

    @Override // fr.r0
    public mr.m g(fr.e0 e0Var) {
        return new h2(m(e0Var), e0Var.getName(), e0Var.r(), e0Var.h());
    }

    @Override // fr.r0
    public mr.n h(fr.g0 g0Var) {
        return new k2(m(g0Var), g0Var.getName(), g0Var.r(), g0Var.h());
    }

    @Override // fr.r0
    public mr.o i(fr.i0 i0Var) {
        return new n2(m(i0Var), i0Var.getName(), i0Var.r());
    }

    @Override // fr.r0
    public String j(fr.o oVar) {
        l1 l1VarC;
        mr.g gVarA = or.e.a(oVar);
        return (gVarA == null || (l1VarC = y3.c(gVarA)) == null) ? super.j(oVar) : t3.f161969a.t(l1VarC);
    }

    @Override // fr.r0
    public String k(fr.w wVar) {
        return j(wVar);
    }

    @Override // fr.r0
    public mr.p l(mr.e eVar, List<mr.r> list, boolean z15) {
        return eVar instanceof fr.h ? i.k(((fr.h) eVar).a(), list, z15) : nr.e.b(eVar, list, z15, Collections.EMPTY_LIST);
    }
}
