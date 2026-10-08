package mt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.a f128140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zs.f f128141d;

    public c(vr.a aVar, t0 t0Var, zs.f fVar, g gVar) {
        super(t0Var, gVar);
        this.f128140c = aVar;
        this.f128141d = fVar;
    }

    @Override // mt.f
    public zs.f a() {
        return this.f128141d;
    }

    public vr.a d() {
        return this.f128140c;
    }

    public String toString() {
        return "Cxt { " + d() + " }";
    }
}
