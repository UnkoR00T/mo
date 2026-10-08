package et;

import java.util.Collection;
import java.util.List;
import pq.v;
import sr.j;
import st.d2;
import st.p2;
import st.t0;
import tt.g;
import tt.n;
import vr.h;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d2 f53374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f53375b;

    public c(d2 d2Var) {
        this.f53374a = d2Var;
        v().c();
        p2 p2Var = p2.INVARIANT;
    }

    @Override // st.x1
    public /* bridge */ /* synthetic */ h c() {
        return (h) e();
    }

    @Override // st.x1
    public boolean d() {
        return false;
    }

    public Void e() {
        return null;
    }

    public final n f() {
        return this.f53375b;
    }

    @Override // st.x1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a(g gVar) {
        return new c(v().a(gVar));
    }

    @Override // st.x1
    public List<m1> getParameters() {
        return v.n();
    }

    public final void h(n nVar) {
        this.f53375b = nVar;
    }

    @Override // st.x1
    public j i() {
        return v().getType().T0().i();
    }

    @Override // st.x1
    public Collection<t0> q() {
        return v.e(v().c() == p2.OUT_VARIANCE ? v().getType() : i().J());
    }

    public String toString() {
        return "CapturedTypeConstructor(" + v() + ')';
    }

    @Override // et.b
    public d2 v() {
        return this.f53374a;
    }
}
