package zg;

/* JADX INFO: loaded from: classes3.dex */
final class x0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0 f235122c;

    x0(z0 z0Var, int i15) {
        super(z0Var.size(), i15);
        this.f235122c = z0Var;
    }

    @Override // zg.v0
    protected final Object a(int i15) {
        return this.f235122c.get(i15);
    }
}
