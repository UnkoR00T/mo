package m8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f124298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f124299d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124301f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f124296a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f124297b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f124300e = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f124302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f124303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f124304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f124305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f124306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f124307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f124308g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f124309h;

        private static int c(long j15) {
            return (int) (j15 % 15);
        }

        public long a() {
            long j15 = this.f124306e;
            if (j15 == 0) {
                return 0L;
            }
            return this.f124307f / j15;
        }

        public long b() {
            return this.f124307f;
        }

        public boolean d() {
            long j15 = this.f124305d;
            if (j15 == 0) {
                return false;
            }
            return this.f124308g[c(j15 - 1)];
        }

        public boolean e() {
            return this.f124305d > 15 && this.f124309h == 0;
        }

        public void f(long j15) {
            long j16 = this.f124305d;
            if (j16 == 0) {
                this.f124302a = j15;
            } else if (j16 == 1) {
                long j17 = j15 - this.f124302a;
                this.f124303b = j17;
                this.f124307f = j17;
                this.f124306e = 1L;
            } else {
                long j18 = j15 - this.f124304c;
                int iC = c(j16);
                if (Math.abs(j18 - this.f124303b) <= 1000000) {
                    this.f124306e++;
                    this.f124307f += j18;
                    boolean[] zArr = this.f124308g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f124309h--;
                    }
                } else {
                    boolean[] zArr2 = this.f124308g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f124309h++;
                    }
                }
            }
            this.f124305d++;
            this.f124304c = j15;
        }

        public void g() {
            this.f124305d = 0L;
            this.f124306e = 0L;
            this.f124307f = 0L;
            this.f124309h = 0;
            Arrays.fill(this.f124308g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f124296a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f124296a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f124301f;
    }

    public long d() {
        if (e()) {
            return this.f124296a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f124296a.e();
    }

    public void f(long j15) {
        this.f124296a.f(j15);
        if (this.f124296a.e() && !this.f124299d) {
            this.f124298c = false;
        } else if (this.f124300e != -9223372036854775807L) {
            if (!this.f124298c || this.f124297b.d()) {
                this.f124297b.g();
                this.f124297b.f(this.f124300e);
            }
            this.f124298c = true;
            this.f124297b.f(j15);
        }
        if (this.f124298c && this.f124297b.e()) {
            a aVar = this.f124296a;
            this.f124296a = this.f124297b;
            this.f124297b = aVar;
            this.f124298c = false;
            this.f124299d = false;
        }
        this.f124300e = j15;
        this.f124301f = this.f124296a.e() ? 0 : this.f124301f + 1;
    }

    public void g() {
        this.f124296a.g();
        this.f124297b.g();
        this.f124298c = false;
        this.f124300e = -9223372036854775807L;
        this.f124301f = 0;
    }
}
