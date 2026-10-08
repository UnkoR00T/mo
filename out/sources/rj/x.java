package rj;

/* JADX INFO: loaded from: classes4.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f174610a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sj.f f174611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sj.f f174612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sj.f f174613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sj.f f174614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sj.f f174615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sj.f f174616g;

    /* synthetic */ x(l lVar, w wVar) {
        n nVar = new n(lVar);
        this.f174611b = nVar;
        sj.f fVarA = sj.d.a(new v(nVar));
        this.f174612c = fVarA;
        sj.f fVarA2 = sj.d.a(new t(nVar, fVarA));
        this.f174613d = fVarA2;
        sj.f fVarA3 = sj.d.a(new i(nVar));
        this.f174614e = fVarA3;
        sj.f fVarA4 = sj.d.a(new k(fVarA2, fVarA3, nVar));
        this.f174615f = fVarA4;
        this.f174616g = sj.d.a(new m(fVarA4));
    }

    @Override // rj.d
    public final b zza() {
        return (b) this.f174616g.zza();
    }
}
