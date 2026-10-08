package fh;

/* JADX INFO: loaded from: classes3.dex */
final class k0 extends jl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f63309c;

    k0(m0 m0Var, int i15) {
        super(m0Var.size(), i15);
        this.f63309c = m0Var;
    }

    @Override // fh.jl
    protected final Object a(int i15) {
        return this.f63309c.get(i15);
    }
}
