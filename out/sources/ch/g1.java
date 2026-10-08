package ch;

/* JADX INFO: loaded from: classes3.dex */
final class g1 extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i1 f25884c;

    g1(i1 i1Var, int i15) {
        super(i1Var.size(), i15);
        this.f25884c = i1Var;
    }

    @Override // ch.w
    protected final Object a(int i15) {
        return this.f25884c.get(i15);
    }
}
