package o8;

/* JADX INFO: loaded from: classes3.dex */
public class i implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f143099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f143100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f143101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f143102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f143103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f143104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f143105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f143106h;

    public i(long j15, long j16, int i15, int i16, boolean z15) {
        this(j15, j16, i15, i16, z15, true);
    }

    private long i(long j15) {
        long j16 = (j15 * ((long) this.f143103e)) / 8000000;
        int i15 = this.f143101c;
        long jMin = (j16 / ((long) i15)) * ((long) i15);
        long j17 = this.f143102d;
        if (j17 != -1) {
            jMin = Math.min(jMin, j17 - ((long) i15));
        }
        return this.f143100b + Math.max(jMin, 0L);
    }

    private static long k(long j15, long j16, int i15) {
        return (Math.max(0L, j15 - j16) * 8000000) / ((long) i15);
    }

    @Override // o8.l0
    public boolean b() {
        return this.f143106h;
    }

    @Override // o8.l0
    public l0.a c(long j15) {
        if (this.f143102d == -1 && !this.f143105g) {
            return new l0.a(new m0(0L, this.f143100b));
        }
        long jI = i(j15);
        long j16 = j(jI);
        m0 m0Var = new m0(j16, jI);
        if (this.f143102d != -1 && j16 < j15) {
            int i15 = this.f143101c;
            if (((long) i15) + jI < this.f143099a) {
                long j17 = jI + ((long) i15);
                return new l0.a(m0Var, new m0(j(j17), j17));
            }
        }
        return new l0.a(m0Var);
    }

    @Override // o8.l0
    public boolean e() {
        return this.f143102d != -1 || this.f143105g;
    }

    @Override // o8.l0
    public long h() {
        return this.f143104f;
    }

    public long j(long j15) {
        return k(j15, this.f143100b, this.f143103e);
    }

    protected i(long j15, long j16, int i15, int i16, boolean z15, boolean z16) {
        this.f143099a = j15;
        this.f143100b = j16;
        this.f143101c = i16 == -1 ? 1 : i16;
        this.f143103e = i15;
        this.f143105g = z15;
        this.f143106h = z16;
        if (j15 == -1) {
            this.f143102d = -1L;
            this.f143104f = -9223372036854775807L;
        } else {
            this.f143102d = j15 - j16;
            this.f143104f = k(j15, j16, i15);
        }
    }
}
