package w7;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f210701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f210702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f210703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f210704d = new ThreadLocal<>();

    public k0(long j15) {
        i(j15);
    }

    public static long h(long j15) {
        return o0.U0(j15, 1000000L, 90000L);
    }

    public static long j(long j15) {
        return o0.U0(j15, 90000L, 1000000L);
    }

    public synchronized long a(long j15) {
        if (j15 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f210701a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) zj.p.q(this.f210704d.get())).longValue();
                }
                this.f210702b = jLongValue - j15;
                notifyAll();
            }
            this.f210703c = j15;
            return j15 + this.f210702b;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized long b(long j15) {
        if (j15 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j16 = this.f210703c;
            if (j16 != -9223372036854775807L) {
                long j17 = j(j16);
                long j18 = (4294967296L + j17) / 8589934592L;
                long j19 = ((j18 - 1) * 8589934592L) + j15;
                j15 += j18 * 8589934592L;
                if (Math.abs(j19 - j17) < Math.abs(j15 - j17)) {
                    j15 = j19;
                }
            }
            return a(h(j15));
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized long c(long j15) {
        if (j15 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j16 = this.f210703c;
            if (j16 != -9223372036854775807L) {
                long j17 = j(j16);
                long j18 = j17 / 8589934592L;
                long j19 = (j18 * 8589934592L) + j15;
                j15 += (j18 + 1) * 8589934592L;
                if (j19 >= j17) {
                    j15 = j19;
                }
            }
            return a(h(j15));
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public synchronized long d() {
        long j15;
        j15 = this.f210701a;
        if (j15 == Long.MAX_VALUE || j15 == 9223372036854775806L) {
            j15 = -9223372036854775807L;
        }
        return j15;
    }

    public synchronized long e() {
        long j15;
        try {
            j15 = this.f210703c;
        } catch (Throwable th4) {
            throw th4;
        }
        return j15 != -9223372036854775807L ? j15 + this.f210702b : d();
    }

    public synchronized long f() {
        return this.f210702b;
    }

    public synchronized boolean g() {
        return this.f210702b != -9223372036854775807L;
    }

    public synchronized void i(long j15) {
        this.f210701a = j15;
        this.f210702b = j15 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f210703c = -9223372036854775807L;
    }
}
