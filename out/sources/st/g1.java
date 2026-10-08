package st;

/* JADX INFO: loaded from: classes4.dex */
final class g1 extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1 f184037c;

    public g1(e1 e1Var, t1 t1Var) {
        super(e1Var);
        this.f184037c = t1Var;
    }

    @Override // st.b0, st.t0
    public t1 S0() {
        return this.f184037c;
    }

    @Override // st.b0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public g1 e1(e1 e1Var) {
        return new g1(e1Var, S0());
    }
}
