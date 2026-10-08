package tt;

import java.util.List;
import st.d2;
import st.e1;
import st.o2;
import st.t1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends e1 implements wt.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wt.b f192121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f192122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o2 f192123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f192124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f192125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f192126g;

    public i(wt.b bVar, n nVar, o2 o2Var, t1 t1Var, boolean z15, boolean z16) {
        this.f192121b = bVar;
        this.f192122c = nVar;
        this.f192123d = o2Var;
        this.f192124e = t1Var;
        this.f192125f = z15;
        this.f192126g = z16;
    }

    @Override // st.t0
    public List<d2> R0() {
        return pq.v.n();
    }

    @Override // st.t0
    public t1 S0() {
        return this.f192124e;
    }

    @Override // st.t0
    public boolean U0() {
        return this.f192125f;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return new i(this.f192121b, T0(), this.f192123d, t1Var, U0(), this.f192126g);
    }

    public final wt.b c1() {
        return this.f192121b;
    }

    @Override // st.t0
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public n T0() {
        return this.f192122c;
    }

    public final o2 e1() {
        return this.f192123d;
    }

    public final boolean f1() {
        return this.f192126g;
    }

    @Override // st.e1
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public i X0(boolean z15) {
        return new i(this.f192121b, T0(), this.f192123d, S0(), z15, false, 32, null);
    }

    @Override // st.o2
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public i d1(g gVar) {
        wt.b bVar = this.f192121b;
        n nVarP = T0().a(gVar);
        o2 o2Var = this.f192123d;
        return new i(bVar, nVarP, o2Var != null ? gVar.a(o2Var).W0() : null, S0(), U0(), false, 32, null);
    }

    @Override // st.t0
    public lt.k r() {
        return ut.l.a(ut.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public /* synthetic */ i(wt.b bVar, n nVar, o2 o2Var, t1 t1Var, boolean z15, boolean z16, int i15, fr.k kVar) {
        this(bVar, nVar, o2Var, (i15 & 8) != 0 ? t1.f184126b.k() : t1Var, (i15 & 16) != 0 ? false : z15, (i15 & 32) != 0 ? false : z16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(wt.b bVar, o2 o2Var, d2 d2Var, m1 m1Var) {
        t1 t1Var = null;
        boolean z15 = false;
        boolean z16 = false;
        this(bVar, new n(d2Var, null, null, m1Var, 6, null), o2Var, t1Var, z15, z16, 56, null);
    }
}
