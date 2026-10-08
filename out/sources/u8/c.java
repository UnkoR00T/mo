package u8;

import o8.h0;
import o8.k0;
import o8.l0;
import o8.p;
import o8.q;
import o8.r;
import o8.u;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f196276q = new u() { // from class: u8.b
        @Override // o8.u
        public final p[] f() {
            return c.h();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f196282f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f196284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f196285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f196286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f196287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f196288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f196289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f196290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f196291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f196292p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f196277a = new c0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f196278b = new c0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f196279c = new c0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f196280d = new c0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f196281e = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f196283g = 1;

    public static /* synthetic */ p[] h() {
        return new p[]{new c()};
    }

    private void i() {
        if (this.f196290n) {
            return;
        }
        this.f196282f.f(new l0.b(-9223372036854775807L));
        this.f196290n = true;
    }

    private long j() {
        if (this.f196284h) {
            return this.f196285i + this.f196289m;
        }
        if (this.f196281e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f196289m;
    }

    private c0 k(q qVar) {
        if (this.f196288l > this.f196280d.b()) {
            c0 c0Var = this.f196280d;
            c0Var.d0(new byte[Math.max(c0Var.b() * 2, this.f196288l)], 0);
        } else {
            this.f196280d.f0(0);
        }
        this.f196280d.e0(this.f196288l);
        qVar.readFully(this.f196280d.f(), 0, this.f196288l);
        return this.f196280d;
    }

    private boolean l(q qVar) {
        if (!qVar.h(this.f196278b.f(), 0, 9, true)) {
            return false;
        }
        this.f196278b.f0(0);
        this.f196278b.g0(4);
        int iQ = this.f196278b.Q();
        boolean z15 = (iQ & 4) != 0;
        boolean z16 = (iQ & 1) != 0;
        if (z15 && this.f196291o == null) {
            this.f196291o = new a(this.f196282f.v(8, 1));
        }
        if (z16 && this.f196292p == null) {
            this.f196292p = new f(this.f196282f.v(9, 2));
        }
        this.f196282f.s();
        this.f196286j = this.f196278b.z() - 5;
        this.f196283g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    private boolean m(q qVar) {
        boolean zA;
        boolean z15;
        long j15;
        long j16 = j();
        int i15 = this.f196287k;
        if (i15 == 8 && this.f196291o != null) {
            i();
            zA = this.f196291o.a(k(qVar), j16);
        } else {
            if (i15 != 9 || this.f196292p == null) {
                if (i15 != 18 || this.f196290n) {
                    qVar.n(this.f196288l);
                    zA = false;
                    z15 = false;
                } else {
                    zA = this.f196281e.a(k(qVar), j16);
                    long jD = this.f196281e.d();
                    if (jD != -9223372036854775807L) {
                        this.f196282f.f(new h0(this.f196281e.e(), this.f196281e.f(), jD));
                        this.f196290n = true;
                    }
                }
                if (!this.f196284h && zA) {
                    this.f196284h = true;
                    if (this.f196281e.d() == -9223372036854775807L) {
                        j15 = -this.f196289m;
                    } else {
                        j15 = 0;
                    }
                    this.f196285i = j15;
                }
                this.f196286j = 4;
                this.f196283g = 2;
                return z15;
            }
            i();
            zA = this.f196292p.a(k(qVar), j16);
        }
        z15 = true;
        if (!this.f196284h) {
            this.f196284h = true;
            if (this.f196281e.d() == -9223372036854775807L) {
                j15 = -this.f196289m;
            } else {
                j15 = 0;
            }
            this.f196285i = j15;
        }
        this.f196286j = 4;
        this.f196283g = 2;
        return z15;
    }

    private boolean n(q qVar) {
        if (!qVar.h(this.f196279c.f(), 0, 11, true)) {
            return false;
        }
        this.f196279c.f0(0);
        this.f196287k = this.f196279c.Q();
        this.f196288l = this.f196279c.T();
        this.f196289m = this.f196279c.T();
        this.f196289m = (((long) (this.f196279c.Q() << 24)) | this.f196289m) * 1000;
        this.f196279c.g0(3);
        this.f196283g = 4;
        return true;
    }

    private void o(q qVar) {
        qVar.n(this.f196286j);
        this.f196286j = 0;
        this.f196283g = 3;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        if (j15 == 0) {
            this.f196283g = 1;
            this.f196284h = false;
        } else {
            this.f196283g = 3;
        }
        this.f196286j = 0;
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        qVar.p(this.f196277a.f(), 0, 3);
        this.f196277a.f0(0);
        if (this.f196277a.T() != 4607062) {
            return false;
        }
        qVar.p(this.f196277a.f(), 0, 2);
        this.f196277a.f0(0);
        if ((this.f196277a.Y() & 250) != 0) {
            return false;
        }
        qVar.p(this.f196277a.f(), 0, 4);
        this.f196277a.f0(0);
        int iZ = this.f196277a.z();
        qVar.g();
        qVar.k(iZ);
        qVar.p(this.f196277a.f(), 0, 4);
        this.f196277a.f0(0);
        return this.f196277a.z() == 0;
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f196282f = rVar;
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) {
        zj.p.q(this.f196282f);
        while (true) {
            int i15 = this.f196283g;
            if (i15 != 1) {
                if (i15 == 2) {
                    o(qVar);
                } else if (i15 != 3) {
                    if (i15 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m(qVar)) {
                        return 0;
                    }
                } else if (!n(qVar)) {
                    return -1;
                }
            } else if (!l(qVar)) {
                return -1;
            }
        }
    }
}
