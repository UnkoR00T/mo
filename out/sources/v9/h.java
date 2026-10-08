package v9;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements o8.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o8.u f204954m = new o8.u() { // from class: v9.g
        @Override // o8.u
        public final o8.p[] f() {
            return h.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f204955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f204956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f204957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.c0 f204958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.b0 f204959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o8.r f204960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f204961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f204962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f204963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f204964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f204965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f204966l;

    public h() {
        this(0);
    }

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new h()};
    }

    private void i(o8.q qVar) throws t7.x {
        if (this.f204964j) {
            return;
        }
        this.f204963i = -1;
        qVar.g();
        long j15 = 0;
        if (qVar.getPosition() == 0) {
            m(qVar);
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            try {
                if (qVar.e(this.f204958d.f(), 0, 2, true)) {
                    this.f204958d.f0(0);
                    if (!i.m(this.f204958d.Y())) {
                        break;
                    }
                    if (qVar.e(this.f204958d.f(), 0, 4, true)) {
                        this.f204959e.p(14);
                        int iH = this.f204959e.h(13);
                        if (iH <= 6) {
                            this.f204964j = true;
                            throw t7.x.a("Malformed ADTS stream", null);
                        }
                        j15 += (long) iH;
                        i16++;
                        if (i16 != 1000 && qVar.o(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i15 = i16;
            break;
        }
        qVar.g();
        if (i15 > 0) {
            this.f204963i = (int) (j15 / ((long) i15));
        } else {
            this.f204963i = -1;
        }
        this.f204964j = true;
    }

    private static int j(int i15, long j15) {
        return (int) ((((long) i15) * 8000000) / j15);
    }

    private o8.l0 k(long j15, boolean z15) {
        return new o8.i(j15, this.f204962h, j(this.f204963i, this.f204956b.k()), this.f204963i, z15);
    }

    private void l(long j15, boolean z15) {
        if (this.f204966l) {
            return;
        }
        boolean z16 = (this.f204955a & 1) != 0 && this.f204963i > 0;
        if (z16 && this.f204956b.k() == -9223372036854775807L && !z15) {
            return;
        }
        if (!z16 || this.f204956b.k() == -9223372036854775807L) {
            this.f204960f.f(new o8.l0.b(-9223372036854775807L));
        } else {
            this.f204960f.f(k(j15, (this.f204955a & 2) != 0));
        }
        this.f204966l = true;
    }

    private int m(o8.q qVar) {
        int i15 = 0;
        while (true) {
            qVar.p(this.f204958d.f(), 0, 10);
            this.f204958d.f0(0);
            if (this.f204958d.T() != 4801587) {
                break;
            }
            this.f204958d.g0(3);
            int iP = this.f204958d.P();
            i15 += iP + 10;
            qVar.k(iP);
        }
        qVar.g();
        qVar.k(i15);
        if (this.f204962h == -1) {
            this.f204962h = i15;
        }
        return i15;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f204965k = false;
        this.f204956b.c();
        this.f204961g = j16;
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        int iM = m(qVar);
        int i15 = iM;
        int i16 = 0;
        int i17 = 0;
        do {
            qVar.p(this.f204958d.f(), 0, 2);
            this.f204958d.f0(0);
            if (i.m(this.f204958d.Y())) {
                i16++;
                if (i16 >= 4 && i17 > 188) {
                    return true;
                }
                qVar.p(this.f204958d.f(), 0, 4);
                this.f204959e.p(14);
                int iH = this.f204959e.h(13);
                if (iH <= 6) {
                    i15++;
                    qVar.g();
                    qVar.k(i15);
                } else {
                    qVar.k(iH - 6);
                    i17 += iH;
                }
            } else {
                i15++;
                qVar.g();
                qVar.k(i15);
            }
            i16 = 0;
            i17 = 0;
        } while (i15 - iM < 8192);
        return false;
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        this.f204960f = rVar;
        this.f204956b.d(rVar, new l0.d(0, 1));
        rVar.s();
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) throws t7.x {
        zj.p.q(this.f204960f);
        long jA = qVar.a();
        int i15 = this.f204955a;
        if ((i15 & 2) != 0 || ((i15 & 1) != 0 && jA != -1)) {
            i(qVar);
        }
        int i16 = qVar.read(this.f204957c.f(), 0, 2048);
        boolean z15 = i16 == -1;
        l(jA, z15);
        if (z15) {
            return -1;
        }
        this.f204957c.f0(0);
        this.f204957c.e0(i16);
        if (!this.f204965k) {
            this.f204956b.f(this.f204961g, 4);
            this.f204965k = true;
        }
        this.f204956b.b(this.f204957c);
        return 0;
    }

    public h(int i15) {
        this.f204955a = (i15 & 2) != 0 ? i15 | 1 : i15;
        this.f204956b = new i(true, "audio/mp4a-latm");
        this.f204957c = new w7.c0(2048);
        this.f204963i = -1;
        this.f204962h = -1L;
        w7.c0 c0Var = new w7.c0(10);
        this.f204958d = c0Var;
        this.f204959e = new w7.b0(c0Var.f());
    }
}
