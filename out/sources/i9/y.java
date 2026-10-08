package i9;

import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f90501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f90502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f90503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f90504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f90505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90506f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f90512l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f90514n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f90517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f90518r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f90507g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f90508h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f90509i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f90510j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f90511k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f90513m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0 f90515o = new c0();

    public void a(o8.q qVar) {
        qVar.readFully(this.f90515o.f(), 0, this.f90515o.j());
        this.f90515o.f0(0);
        this.f90516p = false;
    }

    public void b(c0 c0Var) {
        c0Var.u(this.f90515o.f(), 0, this.f90515o.j());
        this.f90515o.f0(0);
        this.f90516p = false;
    }

    public long c(int i15) {
        return this.f90510j[i15];
    }

    public void d(int i15) {
        this.f90515o.b0(i15);
        this.f90512l = true;
        this.f90516p = true;
    }

    public void e(int i15, int i16) {
        this.f90505e = i15;
        this.f90506f = i16;
        if (this.f90508h.length < i15) {
            this.f90507g = new long[i15];
            this.f90508h = new int[i15];
        }
        if (this.f90509i.length < i16) {
            int i17 = (i16 * 125) / 100;
            this.f90509i = new int[i17];
            this.f90510j = new long[i17];
            this.f90511k = new boolean[i17];
            this.f90513m = new boolean[i17];
        }
    }

    public void f() {
        this.f90505e = 0;
        this.f90517q = 0L;
        this.f90518r = false;
        this.f90512l = false;
        this.f90516p = false;
        this.f90514n = null;
    }

    public boolean g(int i15) {
        return this.f90512l && this.f90513m[i15];
    }
}
