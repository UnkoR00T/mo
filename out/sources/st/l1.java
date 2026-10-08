package st;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr.m1 f184073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oq.k f184074b = oq.l.b(oq.o.PUBLICATION, new k1(this));

    public l1(vr.m1 m1Var) {
        this.f184073a = m1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 d(l1 l1Var) {
        return m1.b(l1Var.f184073a);
    }

    private final t0 f() {
        return (t0) this.f184074b.getValue();
    }

    @Override // st.d2
    public d2 a(tt.g gVar) {
        return this;
    }

    @Override // st.d2
    public boolean b() {
        return true;
    }

    @Override // st.d2
    public p2 c() {
        return p2.OUT_VARIANCE;
    }

    @Override // st.d2
    public t0 getType() {
        return f();
    }
}
