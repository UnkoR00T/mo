package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f143187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f143188b;

    class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f143189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0 l0Var, l0 l0Var2) {
            super(l0Var);
            this.f143189b = l0Var2;
        }

        @Override // o8.a0, o8.l0
        public l0.a c(long j15) {
            l0.a aVarC = this.f143189b.c(j15);
            m0 m0Var = aVarC.f143129a;
            m0 m0Var2 = new m0(m0Var.f143158a, m0Var.f143159b + r0.this.f143187a);
            m0 m0Var3 = aVarC.f143130b;
            return new l0.a(m0Var2, new m0(m0Var3.f143158a, m0Var3.f143159b + r0.this.f143187a));
        }
    }

    public r0(long j15, r rVar) {
        this.f143187a = j15;
        this.f143188b = rVar;
    }

    @Override // o8.r
    public void f(l0 l0Var) {
        this.f143188b.f(new a(l0Var, l0Var));
    }

    @Override // o8.r
    public void s() {
        this.f143188b.s();
    }

    @Override // o8.r
    public s0 v(int i15, int i16) {
        return this.f143188b.v(i15, i16);
    }
}
