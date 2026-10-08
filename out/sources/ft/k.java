package ft;

import st.e1;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends g<oq.r<? extends zs.b, ? extends zs.f>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.b f66957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zs.f f66958c;

    public k(zs.b bVar, zs.f fVar) {
        super(oq.y.a(bVar, fVar));
        this.f66957b = bVar;
        this.f66958c = fVar;
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        e1 e1VarT;
        vr.e eVarB = vr.y.b(i0Var, this.f66957b);
        if (eVarB != null) {
            if (!dt.i.A(eVarB)) {
                eVarB = null;
            }
            if (eVarB != null && (e1VarT = eVarB.t()) != null) {
                return e1VarT;
            }
        }
        return ut.l.d(ut.k.X0, this.f66957b.toString(), this.f66958c.toString());
    }

    public final zs.f c() {
        return this.f66958c;
    }

    @Override // ft.g
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f66957b.h());
        sb5.append('.');
        sb5.append(this.f66958c);
        return sb5.toString();
    }
}
