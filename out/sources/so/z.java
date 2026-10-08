package so;

import io.sentry.android.core.c2;
import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public class z extends l0 {
    private long A;
    private String B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f182838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private short f182839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f182840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f182841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private short f182842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short f182843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private short f182844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short f182845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short f182846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private short f182847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private short f182848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private short f182849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short f182850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private short f182851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private short f182852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f182853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f182854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f182855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f182856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f182857z;

    z(n0 n0Var) {
        super(n0Var);
        this.f182854w = new byte[10];
        this.B = "XXXX";
        this.K = 0L;
        this.L = 0L;
    }

    public short A() {
        return this.f182847p;
    }

    public short B() {
        return this.f182850s;
    }

    public short C() {
        return this.f182848q;
    }

    public int D() {
        return this.F;
    }

    public int E() {
        return this.G;
    }

    public int F() {
        return this.H;
    }

    public int G() {
        return this.f182838g;
    }

    public int H() {
        return this.f182840i;
    }

    public int I() {
        return this.f182841j;
    }

    public int J() {
        return this.I;
    }

    public int K() {
        return this.J;
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        this.f182838g = i0Var.N();
        this.f182839h = i0Var.E();
        this.f182840i = i0Var.N();
        this.f182841j = i0Var.N();
        this.f182842k = i0Var.E();
        this.f182843l = i0Var.E();
        this.f182844m = i0Var.E();
        this.f182845n = i0Var.E();
        this.f182846o = i0Var.E();
        this.f182847p = i0Var.E();
        this.f182848q = i0Var.E();
        this.f182849r = i0Var.E();
        this.f182850s = i0Var.E();
        this.f182851t = i0Var.E();
        this.f182852u = i0Var.E();
        this.f182853v = i0Var.E();
        this.f182854w = i0Var.p(10);
        this.f182855x = i0Var.M();
        this.f182856y = i0Var.M();
        this.f182857z = i0Var.M();
        this.A = i0Var.M();
        this.B = i0Var.H(4);
        this.C = i0Var.N();
        this.D = i0Var.N();
        this.E = i0Var.N();
        try {
            this.F = i0Var.E();
            this.G = i0Var.E();
            this.H = i0Var.E();
            this.I = i0Var.N();
            this.J = i0Var.N();
            if (this.f182838g >= 1) {
                try {
                    this.K = i0Var.M();
                    this.L = i0Var.M();
                } catch (EOFException e15) {
                    this.f182838g = 0;
                    c2.h("PdfBox-Android", "Could not read all expected parts of version >= 1, setting version to 0", e15);
                    this.f182681e = true;
                    return;
                }
            }
            if (this.f182838g >= 2) {
                try {
                    this.M = i0Var.E();
                    this.N = i0Var.E();
                    this.O = i0Var.N();
                    this.P = i0Var.N();
                    this.Q = i0Var.N();
                } catch (EOFException e16) {
                    this.f182838g = 1;
                    c2.h("PdfBox-Android", "Could not read all expected parts of version >= 2, setting version to 1", e16);
                    this.f182681e = true;
                    return;
                }
            }
            this.f182681e = true;
        } catch (EOFException unused) {
            this.f182681e = true;
        }
    }

    public String j() {
        return this.B;
    }

    public short k() {
        return this.f182839h;
    }

    public int l() {
        return this.N;
    }

    public long m() {
        return this.K;
    }

    public long n() {
        return this.L;
    }

    public int o() {
        return this.f182853v;
    }

    public int p() {
        return this.C;
    }

    public short q() {
        return this.f182842k;
    }

    public int r() {
        return this.M;
    }

    public byte[] s() {
        return this.f182854w;
    }

    public short t() {
        return this.f182852u;
    }

    public short u() {
        return this.f182851t;
    }

    public short v() {
        return this.f182845n;
    }

    public short w() {
        return this.f182843l;
    }

    public short x() {
        return this.f182846o;
    }

    public short y() {
        return this.f182844m;
    }

    public short z() {
        return this.f182849r;
    }
}
