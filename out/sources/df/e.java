package df;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f41341c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41343b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41344a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f41345b = 0;

        a() {
        }

        public e a() {
            return new e(this.f41344a, this.f41345b);
        }

        public a b(long j15) {
            this.f41344a = j15;
            return this;
        }

        public a c(long j15) {
            this.f41345b = j15;
            return this;
        }
    }

    e(long j15, long j16) {
        this.f41342a = j15;
        this.f41343b = j16;
    }

    public static a c() {
        return new a();
    }

    @gl.d(tag = 1)
    public long a() {
        return this.f41342a;
    }

    @gl.d(tag = 2)
    public long b() {
        return this.f41343b;
    }
}
