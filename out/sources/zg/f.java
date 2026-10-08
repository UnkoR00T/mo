package zg;

/* JADX INFO: loaded from: classes3.dex */
final class f implements ig.p, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f235062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ig.j f235063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f235064c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f235065d;

    f(g gVar, ig.j jVar, e eVar) {
        this.f235065d = gVar;
        this.f235063b = jVar;
        this.f235062a = eVar;
    }

    @Override // zg.z
    public final void a() {
        ig.j.a<?> aVarB;
        synchronized (this) {
            this.f235064c = false;
            aVarB = this.f235063b.b();
        }
        if (aVarB != null) {
            this.f235065d.r(aVarB, 2441);
        }
    }

    @Override // ig.p
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        ig.j.a aVarB;
        boolean z15;
        e0 e0Var = (e0) obj;
        vh.m mVar = (vh.m) obj2;
        synchronized (this) {
            aVarB = this.f235063b.b();
            z15 = this.f235064c;
            this.f235063b.a();
        }
        if (aVarB == null) {
            mVar.c(Boolean.FALSE);
        } else {
            this.f235062a.a(e0Var, aVarB, z15, mVar);
        }
    }

    @Override // zg.z
    public final synchronized void b(ig.j jVar) {
        ig.j jVar2 = this.f235063b;
        if (jVar2 != jVar) {
            jVar2.a();
            this.f235063b = jVar;
        }
    }

    @Override // zg.z
    public final synchronized ig.j zza() {
        return this.f235063b;
    }
}
