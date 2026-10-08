package st;

/* JADX INFO: loaded from: classes4.dex */
class g implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f184033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wt.s f184034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wt.j f184035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wt.j f184036d;

    public g(w1 w1Var, wt.s sVar, wt.j jVar, wt.j jVar2) {
        this.f184033a = w1Var;
        this.f184034b = sVar;
        this.f184035c = jVar;
        this.f184036d = jVar2;
    }

    @Override // er.a
    public Object a() {
        return Boolean.valueOf(h.z(this.f184033a, this.f184034b, this.f184035c, this.f184036d));
    }
}
