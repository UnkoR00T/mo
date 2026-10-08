package v9;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f205287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w7.b0 f205288b = new w7.b0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f205289c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f205290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w7.k0 f205291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f205292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f205293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f205294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f205295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f205296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f205297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f205298l;

    public y(m mVar) {
        this.f205287a = mVar;
    }

    private boolean e(w7.c0 c0Var, byte[] bArr, int i15) {
        int iMin = Math.min(c0Var.a(), i15 - this.f205290d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0Var.g0(iMin);
        } else {
            c0Var.u(bArr, this.f205290d, iMin);
        }
        int i16 = this.f205290d + iMin;
        this.f205290d = i16;
        return i16 == i15;
    }

    private boolean f() {
        this.f205288b.p(0);
        int iH = this.f205288b.h(24);
        if (iH != 1) {
            w7.t.h("PesReader", "Unexpected start code prefix: " + iH);
            this.f205296j = -1;
            return false;
        }
        this.f205288b.r(8);
        int iH2 = this.f205288b.h(16);
        this.f205288b.r(5);
        this.f205297k = this.f205288b.g();
        this.f205288b.r(2);
        this.f205292f = this.f205288b.g();
        this.f205293g = this.f205288b.g();
        this.f205288b.r(6);
        int iH3 = this.f205288b.h(8);
        this.f205295i = iH3;
        if (iH2 == 0) {
            this.f205296j = -1;
        } else {
            int i15 = (iH2 - 3) - iH3;
            this.f205296j = i15;
            if (i15 < 0) {
                w7.t.h("PesReader", "Found negative packet payload size: " + this.f205296j);
                this.f205296j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f205288b.p(0);
        this.f205298l = -9223372036854775807L;
        if (this.f205292f) {
            this.f205288b.r(4);
            long jH = ((long) this.f205288b.h(3)) << 30;
            this.f205288b.r(1);
            long jH2 = jH | ((long) (this.f205288b.h(15) << 15));
            this.f205288b.r(1);
            long jH3 = jH2 | ((long) this.f205288b.h(15));
            this.f205288b.r(1);
            if (!this.f205294h && this.f205293g) {
                this.f205288b.r(4);
                long jH4 = ((long) this.f205288b.h(3)) << 30;
                this.f205288b.r(1);
                long jH5 = jH4 | ((long) (this.f205288b.h(15) << 15));
                this.f205288b.r(1);
                long jH6 = jH5 | ((long) this.f205288b.h(15));
                this.f205288b.r(1);
                this.f205291e.b(jH6);
                this.f205294h = true;
            }
            this.f205298l = this.f205291e.b(jH3);
        }
    }

    private void h(int i15) {
        this.f205289c = i15;
        this.f205290d = 0;
    }

    @Override // v9.l0
    public void a(w7.k0 k0Var, o8.r rVar, l0.d dVar) {
        this.f205291e = k0Var;
        this.f205287a.d(rVar, dVar);
    }

    @Override // v9.l0
    public void b(w7.c0 c0Var, int i15) {
        zj.p.q(this.f205291e);
        if ((i15 & 1) != 0) {
            int i16 = this.f205289c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    w7.t.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f205296j != -1) {
                        w7.t.h("PesReader", "Unexpected start indicator: expected " + this.f205296j + " more bytes");
                    }
                    this.f205287a.e(c0Var.j() == 0);
                }
            }
            h(1);
        }
        while (c0Var.a() > 0) {
            int i17 = this.f205289c;
            if (i17 == 0) {
                c0Var.g0(c0Var.a());
            } else if (i17 != 1) {
                if (i17 == 2) {
                    if (e(c0Var, this.f205288b.f210609a, Math.min(10, this.f205295i)) && e(c0Var, null, this.f205295i)) {
                        g();
                        i15 |= this.f205297k ? 4 : 0;
                        this.f205287a.f(this.f205298l, i15);
                        h(3);
                    }
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = c0Var.a();
                    int i18 = this.f205296j;
                    int i19 = i18 == -1 ? 0 : iA - i18;
                    if (i19 > 0) {
                        iA -= i19;
                        c0Var.e0(c0Var.g() + iA);
                    }
                    this.f205287a.b(c0Var);
                    int i25 = this.f205296j;
                    if (i25 != -1) {
                        int i26 = i25 - iA;
                        this.f205296j = i26;
                        if (i26 == 0) {
                            this.f205287a.e(false);
                            h(1);
                        }
                    }
                }
            } else if (e(c0Var, this.f205288b.f210609a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // v9.l0
    public void c() {
        this.f205289c = 0;
        this.f205290d = 0;
        this.f205294h = false;
        this.f205287a.c();
    }

    public boolean d(boolean z15) {
        return this.f205289c == 3 && this.f205296j == -1 && !(z15 && (this.f205287a instanceof n)) && (!z15 || f());
    }
}
