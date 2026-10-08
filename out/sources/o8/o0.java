package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f143183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f143184b;

    public o0(long j15) {
        this(j15, 0L);
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        return new l0.a(new m0(j15, this.f143184b));
    }

    @Override // o8.l0
    public boolean e() {
        return true;
    }

    @Override // o8.l0
    public long h() {
        return this.f143183a;
    }

    public o0(long j15, long j16) {
        this.f143183a = j15;
        this.f143184b = j16;
    }
}
