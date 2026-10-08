package y;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f222502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f222503b;

    m(long j15, long j16) {
        this.f222502a = j15;
        this.f222503b = j16;
    }

    long a() {
        return this.f222503b;
    }

    long b() {
        return this.f222502a;
    }

    public String toString() {
        return this.f222502a + "/" + this.f222503b;
    }

    m(double d15) {
        this((long) (d15 * 10000.0d), 10000L);
    }
}
