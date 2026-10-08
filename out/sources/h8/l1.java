package h8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends g<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f81626l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final c0 f81627k;

    protected l1(c0 c0Var) {
        this.f81627k = c0Var;
    }

    protected c0.b H(c0.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final c0.b C(Void r15, c0.b bVar) {
        return H(bVar);
    }

    protected long J(long j15, c0.b bVar) {
        return j15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final long D(Void r15, long j15, c0.b bVar) {
        return J(j15, bVar);
    }

    protected int L(int i15) {
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final int E(Void r15, int i15) {
        return L(i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h8.g
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void F(Void r15, c0 c0Var, t7.e0 e0Var) {
        O(e0Var);
    }

    protected abstract void O(t7.e0 e0Var);

    protected final void P() {
        G(f81626l, this.f81627k);
    }

    protected void Q() {
        P();
    }

    @Override // h8.c0
    public t7.s b() {
        return this.f81627k.b();
    }

    @Override // h8.c0
    public void c(t7.s sVar) {
        this.f81627k.c(sVar);
    }

    @Override // h8.c0
    public boolean k() {
        return this.f81627k.k();
    }

    @Override // h8.c0
    public t7.e0 m() {
        return this.f81627k.m();
    }

    @Override // h8.g, h8.a
    protected final void y(y7.x xVar) {
        super.y(xVar);
        Q();
    }
}
