package mt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.e f128138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zs.f f128139d;

    public b(vr.e eVar, t0 t0Var, zs.f fVar, g gVar) {
        super(t0Var, gVar);
        this.f128138c = eVar;
        this.f128139d = fVar;
    }

    @Override // mt.f
    public zs.f a() {
        return this.f128139d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f128138c + " }";
    }
}
