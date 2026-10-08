package df;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f41346c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f41348b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41349a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f41350b = 0;

        a() {
        }

        public f a() {
            return new f(this.f41349a, this.f41350b);
        }

        public a b(long j15) {
            this.f41350b = j15;
            return this;
        }

        public a c(long j15) {
            this.f41349a = j15;
            return this;
        }
    }

    f(long j15, long j16) {
        this.f41347a = j15;
        this.f41348b = j16;
    }

    public static a c() {
        return new a();
    }

    @gl.d(tag = 2)
    public long a() {
        return this.f41348b;
    }

    @gl.d(tag = 1)
    public long b() {
        return this.f41347a;
    }
}
