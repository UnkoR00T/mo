package st;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f183998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e1 f183999c;

    public a(e1 e1Var, e1 e1Var2) {
        this.f183998b = e1Var;
        this.f183999c = e1Var2;
    }

    public final e1 K() {
        return c1();
    }

    @Override // st.o2
    /* JADX INFO: renamed from: b1 */
    public e1 Z0(t1 t1Var) {
        return new a(c1().Z0(t1Var), this.f183999c);
    }

    @Override // st.b0
    protected e1 c1() {
        return this.f183998b;
    }

    public final e1 f1() {
        return this.f183999c;
    }

    @Override // st.e1
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public a X0(boolean z15) {
        return new a(c1().X0(z15), this.f183999c.X0(z15));
    }

    @Override // st.b0
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a d1(tt.g gVar) {
        return new a((e1) gVar.a(c1()), (e1) gVar.a(this.f183999c));
    }

    @Override // st.b0
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public a e1(e1 e1Var) {
        return new a(e1Var, this.f183999c);
    }
}
