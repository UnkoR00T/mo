package df;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f41322c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f41324b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41325a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f41326b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f41325a, this.f41326b);
        }

        public a b(long j15) {
            this.f41325a = j15;
            return this;
        }

        public a c(b bVar) {
            this.f41326b = bVar;
            return this;
        }
    }

    public enum b implements gl.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41335a;

        b(int i15) {
            this.f41335a = i15;
        }

        @Override // gl.c
        public int h() {
            return this.f41335a;
        }
    }

    c(long j15, b bVar) {
        this.f41323a = j15;
        this.f41324b = bVar;
    }

    public static a c() {
        return new a();
    }

    @gl.d(tag = 1)
    public long a() {
        return this.f41323a;
    }

    @gl.d(tag = 3)
    public b b() {
        return this.f41324b;
    }
}
