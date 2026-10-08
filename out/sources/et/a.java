package et;

import java.util.List;
import lt.k;
import pq.v;
import st.d2;
import st.e1;
import st.t1;
import tt.g;
import ut.h;
import ut.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e1 implements wt.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f53370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f53371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f53372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t1 f53373e;

    public a(d2 d2Var, b bVar, boolean z15, t1 t1Var) {
        this.f53370b = d2Var;
        this.f53371c = bVar;
        this.f53372d = z15;
        this.f53373e = t1Var;
    }

    @Override // st.t0
    public List<d2> R0() {
        return v.n();
    }

    @Override // st.t0
    public t1 S0() {
        return this.f53373e;
    }

    @Override // st.t0
    public boolean U0() {
        return this.f53372d;
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return new a(this.f53370b, T0(), U0(), t1Var);
    }

    @Override // st.t0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public b T0() {
        return this.f53371c;
    }

    @Override // st.e1
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public a X0(boolean z15) {
        return z15 == U0() ? this : new a(this.f53370b, T0(), z15, S0());
    }

    @Override // st.o2
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public a d1(g gVar) {
        return new a(this.f53370b.a(gVar), T0(), U0(), S0());
    }

    @Override // st.t0
    public k r() {
        return l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // st.e1
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Captured(");
        sb5.append(this.f53370b);
        sb5.append(')');
        sb5.append(U0() ? "?" : "");
        return sb5.toString();
    }

    public /* synthetic */ a(d2 d2Var, b bVar, boolean z15, t1 t1Var, int i15, fr.k kVar) {
        this(d2Var, (i15 & 2) != 0 ? new c(d2Var) : bVar, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? t1.f184126b.k() : t1Var);
    }
}
