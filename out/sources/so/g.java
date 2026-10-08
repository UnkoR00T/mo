package so;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f182628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f182629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f182630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f182631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final short f182632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f182633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f182634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f182635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f182636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f182637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f182638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f182639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f182640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f182641n;

    g(i0 i0Var) {
        this.f182634g = 1.0d;
        this.f182635h = 1.0d;
        this.f182636i = 0.0d;
        this.f182637j = 0.0d;
        this.f182638k = 0;
        this.f182639l = 0;
        this.f182640m = 0;
        this.f182641n = 0;
        short sE = i0Var.E();
        this.f182632e = sE;
        this.f182633f = i0Var.N();
        if ((sE & 1) != 0) {
            this.f182630c = i0Var.E();
            this.f182631d = i0Var.E();
        } else {
            this.f182630c = (short) i0Var.C();
            this.f182631d = (short) i0Var.C();
        }
        if ((sE & 2) != 0) {
            this.f182638k = this.f182630c;
            this.f182639l = this.f182631d;
        } else {
            this.f182640m = this.f182630c;
            this.f182641n = this.f182631d;
        }
        if ((sE & 8) != 0) {
            double dE = ((double) i0Var.E()) / 16384.0d;
            this.f182635h = dE;
            this.f182634g = dE;
        } else if ((sE & 64) != 0) {
            this.f182634g = ((double) i0Var.E()) / 16384.0d;
            this.f182635h = ((double) i0Var.E()) / 16384.0d;
        } else if ((sE & 128) != 0) {
            this.f182634g = ((double) i0Var.E()) / 16384.0d;
            this.f182636i = ((double) i0Var.E()) / 16384.0d;
            this.f182637j = ((double) i0Var.E()) / 16384.0d;
            this.f182635h = ((double) i0Var.E()) / 16384.0d;
        }
    }

    public int a() {
        return this.f182629b;
    }

    public int b() {
        return this.f182628a;
    }

    public short c() {
        return this.f182632e;
    }

    public int d() {
        return this.f182633f;
    }

    public int e() {
        return this.f182638k;
    }

    public int f() {
        return this.f182639l;
    }

    public int g(int i15, int i16) {
        return Math.round((float) ((((double) i15) * this.f182634g) + (((double) i16) * this.f182637j)));
    }

    public int h(int i15, int i16) {
        return Math.round((float) ((((double) i15) * this.f182636i) + (((double) i16) * this.f182635h)));
    }

    public void i(int i15) {
        this.f182629b = i15;
    }

    public void j(int i15) {
        this.f182628a = i15;
    }
}
