package ot;

/* JADX INFO: loaded from: classes4.dex */
class f0 implements er.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f149750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f149751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final us.o f149752c;

    public f0(l0 l0Var, boolean z15, us.o oVar) {
        this.f149750a = l0Var;
        this.f149751b = z15;
        this.f149752c = oVar;
    }

    @Override // er.a
    public Object a() {
        return l0.q(this.f149750a, this.f149751b, this.f149752c);
    }
}
