package so;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f182653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f182654b;

    i(short s15, i0 i0Var) {
        this.f182654b = s15;
    }

    @Override // so.l
    public void c() {
    }

    @Override // so.l
    public int h() {
        return this.f182654b;
    }

    void i(i0 i0Var, int i15) {
        this.f182653a = i0Var.L(i15);
    }
}
