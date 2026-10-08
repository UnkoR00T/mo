package ot;

import java.util.Collection;
import java.util.List;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements vr.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rt.n f149730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f149731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.i0 f149732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected n f149733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.h<zs.c, vr.o0> f149734e;

    public c(rt.n nVar, a0 a0Var, vr.i0 i0Var) {
        this.f149730a = nVar;
        this.f149731b = a0Var;
        this.f149732c = i0Var;
        this.f149734e = nVar.a(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.o0 f(c cVar, zs.c cVar2) {
        r rVarE = cVar.e(cVar2);
        if (rVarE == null) {
            return null;
        }
        rVarE.R0(cVar.g());
        return rVarE;
    }

    @Override // vr.p0
    @oq.a
    public List<vr.o0> a(zs.c cVar) {
        return pq.v.r(this.f149734e.b(cVar));
    }

    @Override // vr.u0
    public boolean b(zs.c cVar) {
        return (this.f149734e.y(cVar) ? this.f149734e.b(cVar) : e(cVar)) == null;
    }

    @Override // vr.u0
    public void c(zs.c cVar, Collection<vr.o0> collection) {
        cu.a.a(collection, this.f149734e.b(cVar));
    }

    protected abstract r e(zs.c cVar);

    protected final n g() {
        n nVar = this.f149733d;
        if (nVar != null) {
            return nVar;
        }
        return null;
    }

    protected final a0 h() {
        return this.f149731b;
    }

    protected final vr.i0 i() {
        return this.f149732c;
    }

    protected final rt.n j() {
        return this.f149730a;
    }

    protected final void k(n nVar) {
        this.f149733d = nVar;
    }

    @Override // vr.p0
    public Collection<zs.c> s(zs.c cVar, er.l<? super zs.f, Boolean> lVar) {
        return e1.e();
    }
}
