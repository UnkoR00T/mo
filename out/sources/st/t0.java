package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t0 implements wr.a, wt.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f184125a;

    public /* synthetic */ t0(fr.k kVar) {
        this();
    }

    private final int Q0() {
        return x0.a(this) ? super.hashCode() : (((T0().hashCode() * 31) + R0().hashCode()) * 31) + (U0() ? 1 : 0);
    }

    public abstract List<d2> R0();

    public abstract t1 S0();

    public abstract x1 T0();

    public abstract boolean U0();

    /* JADX INFO: renamed from: V0 */
    public abstract t0 Y0(tt.g gVar);

    public abstract o2 W0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return U0() == t0Var.U0() && tt.v.f192146a.a(W0(), t0Var.W0());
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        return u.a(S0());
    }

    public final int hashCode() {
        int i15 = this.f184125a;
        if (i15 != 0) {
            return i15;
        }
        int iQ0 = Q0();
        this.f184125a = iQ0;
        return iQ0;
    }

    public abstract lt.k r();

    private t0() {
    }
}
