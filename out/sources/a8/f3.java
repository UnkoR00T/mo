package a8;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f3 f4409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f3 f4410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f3 f4411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f3 f4412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f3 f4413g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4415b;

    static {
        f3 f3Var = new f3(0L, 0L);
        f4409c = f3Var;
        f4410d = new f3(Long.MAX_VALUE, Long.MAX_VALUE);
        f4411e = new f3(Long.MAX_VALUE, 0L);
        f4412f = new f3(0L, Long.MAX_VALUE);
        f4413g = f3Var;
    }

    public f3(long j15, long j16) {
        zj.p.d(j15 >= 0);
        zj.p.d(j16 >= 0);
        this.f4414a = j15;
        this.f4415b = j16;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j15, long j16, long j17) {
        long j18 = this.f4414a;
        if (j18 == 0 && this.f4415b == 0) {
            return j15;
        }
        long jB1 = w7.o0.b1(j15, j18, Long.MIN_VALUE);
        long jC = w7.o0.c(j15, this.f4415b, Long.MAX_VALUE);
        boolean z15 = false;
        boolean z16 = jB1 <= j16 && j16 <= jC;
        if (jB1 <= j17 && j17 <= jC) {
            z15 = true;
        }
        if (z16 && z15) {
            if (Math.abs(j16 - j15) <= Math.abs(j17 - j15)) {
                return j16;
            }
            return j17;
        }
        if (!z16) {
            if (z15) {
                return j17;
            }
            return jB1;
        }
        return j16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f3.class == obj.getClass()) {
            f3 f3Var = (f3) obj;
            if (this.f4414a == f3Var.f4414a && this.f4415b == f3Var.f4415b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f4414a) * 31) + ((int) this.f4415b);
    }
}
