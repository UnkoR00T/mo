package eh;

/* JADX INFO: loaded from: classes3.dex */
final class n0 extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p0 f50830c;

    n0(p0 p0Var, int i15) {
        super(p0Var.size(), i15);
        this.f50830c = p0Var;
    }

    @Override // eh.e
    protected final Object a(int i15) {
        return this.f50830c.get(i15);
    }
}
