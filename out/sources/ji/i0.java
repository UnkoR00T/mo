package ji;

/* JADX INFO: loaded from: classes4.dex */
final class i0 extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ii.l0 f103201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f103202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f103203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private vh.a f103204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f103205e;

    i0() {
    }

    @Override // ji.k.a
    public final k.a b(vh.a aVar) {
        this.f103204d = aVar;
        return this;
    }

    @Override // ji.k.a
    public final k.a c(long j15) {
        this.f103203c = j15;
        this.f103205e = (byte) 1;
        return this;
    }

    @Override // ji.k.a
    final k d() {
        if (this.f103205e == 1) {
            return new j0(this.f103201a, this.f103202b, this.f103203c, this.f103204d, null);
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }

    public final k.a e(ii.l0 l0Var) {
        this.f103201a = l0Var;
        return this;
    }

    public final k.a f(String str) {
        this.f103202b = str;
        return this;
    }
}
