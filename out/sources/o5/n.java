package o5;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f142424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f142425l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f142426a;

        static {
            int[] iArr = new int[p.b.values().length];
            f142426a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142426a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f142426a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(n5.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f142424k = fVar;
        this.f142425l = null;
        this.f142448h.f142393e = f.a.TOP;
        this.f142449i.f142393e = f.a.BOTTOM;
        fVar.f142393e = f.a.BASELINE;
        this.f142446f = 1;
    }

    @Override // o5.p, o5.d
    public void a(d dVar) {
        float f15;
        float fV;
        float fV2;
        int i15;
        int i16 = a.f142426a[this.f142450j.ordinal()];
        if (i16 == 1) {
            p(dVar);
        } else if (i16 == 2) {
            o(dVar);
        } else if (i16 == 3) {
            n5.e eVar = this.f142442b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f142445e;
        if (gVar.f142391c && !gVar.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
            n5.e eVar2 = this.f142442b;
            int i17 = eVar2.f131885x;
            if (i17 == 2) {
                n5.e eVarL = eVar2.L();
                if (eVarL != null) {
                    g gVar2 = eVarL.f131849f.f142445e;
                    if (gVar2.f142398j) {
                        this.f142445e.d((int) ((gVar2.f142395g * this.f142442b.E) + 0.5f));
                    }
                }
            } else if (i17 == 3 && eVar2.f131847e.f142445e.f142398j) {
                int iW = eVar2.w();
                if (iW != -1) {
                    if (iW == 0) {
                        n5.e eVar3 = this.f142442b;
                        fV2 = eVar3.f131847e.f142445e.f142395g * eVar3.v();
                        i15 = (int) (fV2 + 0.5f);
                    } else if (iW != 1) {
                        i15 = 0;
                    } else {
                        n5.e eVar4 = this.f142442b;
                        f15 = eVar4.f131847e.f142445e.f142395g;
                        fV = eVar4.v();
                    }
                    this.f142445e.d(i15);
                } else {
                    n5.e eVar5 = this.f142442b;
                    f15 = eVar5.f131847e.f142445e.f142395g;
                    fV = eVar5.v();
                }
                fV2 = f15 / fV;
                i15 = (int) (fV2 + 0.5f);
                this.f142445e.d(i15);
            }
        }
        f fVar = this.f142448h;
        if (fVar.f142391c) {
            f fVar2 = this.f142449i;
            if (fVar2.f142391c) {
                if (fVar.f142398j && fVar2.f142398j && this.f142445e.f142398j) {
                    return;
                }
                if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
                    n5.e eVar6 = this.f142442b;
                    if (eVar6.f131883w == 0 && !eVar6.m0()) {
                        f fVar3 = this.f142448h.f142400l.get(0);
                        f fVar4 = this.f142449i.f142400l.get(0);
                        int i18 = fVar3.f142395g;
                        f fVar5 = this.f142448h;
                        int i19 = i18 + fVar5.f142394f;
                        int i25 = fVar4.f142395g + this.f142449i.f142394f;
                        fVar5.d(i19);
                        this.f142449i.d(i25);
                        this.f142445e.d(i25 - i19);
                        return;
                    }
                }
                if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT && this.f142441a == 1 && this.f142448h.f142400l.size() > 0 && this.f142449i.f142400l.size() > 0) {
                    f fVar6 = this.f142448h.f142400l.get(0);
                    int i26 = (this.f142449i.f142400l.get(0).f142395g + this.f142449i.f142394f) - (fVar6.f142395g + this.f142448h.f142394f);
                    g gVar3 = this.f142445e;
                    int i27 = gVar3.f142410m;
                    if (i26 < i27) {
                        gVar3.d(i26);
                    } else {
                        gVar3.d(i27);
                    }
                }
                if (this.f142445e.f142398j && this.f142448h.f142400l.size() > 0 && this.f142449i.f142400l.size() > 0) {
                    f fVar7 = this.f142448h.f142400l.get(0);
                    f fVar8 = this.f142449i.f142400l.get(0);
                    int i28 = fVar7.f142395g + this.f142448h.f142394f;
                    int i29 = fVar8.f142395g + this.f142449i.f142394f;
                    float fT = this.f142442b.T();
                    if (fVar7 == fVar8) {
                        i28 = fVar7.f142395g;
                        i29 = fVar8.f142395g;
                        fT = 0.5f;
                    }
                    this.f142448h.d((int) (i28 + 0.5f + (((i29 - i28) - this.f142445e.f142395g) * fT)));
                    this.f142449i.d(this.f142448h.f142395g + this.f142445e.f142395g);
                }
            }
        }
    }

    @Override // o5.p
    void d() {
        n5.e eVarL;
        n5.e eVarL2;
        n5.e eVar = this.f142442b;
        if (eVar.f131839a) {
            this.f142445e.d(eVar.x());
        }
        if (!this.f142445e.f142398j) {
            this.f142444d = this.f142442b.V();
            if (this.f142442b.b0()) {
                this.f142425l = new o5.a(this);
            }
            n5.e.b bVar = this.f142444d;
            if (bVar != n5.e.b.MATCH_CONSTRAINT) {
                if (bVar == n5.e.b.MATCH_PARENT && (eVarL2 = this.f142442b.L()) != null && eVarL2.V() == n5.e.b.FIXED) {
                    int iX = (eVarL2.x() - this.f142442b.P.f()) - this.f142442b.R.f();
                    b(this.f142448h, eVarL2.f131849f.f142448h, this.f142442b.P.f());
                    b(this.f142449i, eVarL2.f131849f.f142449i, -this.f142442b.R.f());
                    this.f142445e.d(iX);
                    return;
                }
                if (this.f142444d == n5.e.b.FIXED) {
                    this.f142445e.d(this.f142442b.x());
                }
            }
        } else if (this.f142444d == n5.e.b.MATCH_PARENT && (eVarL = this.f142442b.L()) != null && eVarL.V() == n5.e.b.FIXED) {
            b(this.f142448h, eVarL.f131849f.f142448h, this.f142442b.P.f());
            b(this.f142449i, eVarL.f131849f.f142449i, -this.f142442b.R.f());
            return;
        }
        g gVar = this.f142445e;
        boolean z15 = gVar.f142398j;
        if (z15) {
            n5.e eVar2 = this.f142442b;
            if (eVar2.f131839a) {
                n5.d[] dVarArr = eVar2.W;
                n5.d dVar = dVarArr[2];
                n5.d dVar2 = dVar.f131825f;
                if (dVar2 != null && dVarArr[3].f131825f != null) {
                    if (eVar2.m0()) {
                        this.f142448h.f142394f = this.f142442b.W[2].f();
                        this.f142449i.f142394f = -this.f142442b.W[3].f();
                    } else {
                        f fVarH = h(this.f142442b.W[2]);
                        if (fVarH != null) {
                            b(this.f142448h, fVarH, this.f142442b.W[2].f());
                        }
                        f fVarH2 = h(this.f142442b.W[3]);
                        if (fVarH2 != null) {
                            b(this.f142449i, fVarH2, -this.f142442b.W[3].f());
                        }
                        this.f142448h.f142390b = true;
                        this.f142449i.f142390b = true;
                    }
                    if (this.f142442b.b0()) {
                        b(this.f142424k, this.f142448h, this.f142442b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f142448h, fVarH3, this.f142442b.W[2].f());
                        b(this.f142449i, this.f142448h, this.f142445e.f142395g);
                        if (this.f142442b.b0()) {
                            b(this.f142424k, this.f142448h, this.f142442b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                n5.d dVar3 = dVarArr[3];
                if (dVar3.f131825f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f142449i, fVarH4, -this.f142442b.W[3].f());
                        b(this.f142448h, this.f142449i, -this.f142445e.f142395g);
                    }
                    if (this.f142442b.b0()) {
                        b(this.f142424k, this.f142448h, this.f142442b.p());
                        return;
                    }
                    return;
                }
                n5.d dVar4 = dVarArr[4];
                if (dVar4.f131825f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f142424k, fVarH5, 0);
                        b(this.f142448h, this.f142424k, -this.f142442b.p());
                        b(this.f142449i, this.f142448h, this.f142445e.f142395g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof n5.i) || eVar2.L() == null || this.f142442b.o(n5.d.a.CENTER).f131825f != null) {
                    return;
                }
                b(this.f142448h, this.f142442b.L().f131849f.f142448h, this.f142442b.a0());
                b(this.f142449i, this.f142448h, this.f142445e.f142395g);
                if (this.f142442b.b0()) {
                    b(this.f142424k, this.f142448h, this.f142442b.p());
                    return;
                }
                return;
            }
        }
        if (z15 || this.f142444d != n5.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            n5.e eVar3 = this.f142442b;
            int i15 = eVar3.f131885x;
            if (i15 == 2) {
                n5.e eVarL3 = eVar3.L();
                if (eVarL3 != null) {
                    g gVar2 = eVarL3.f131849f.f142445e;
                    this.f142445e.f142400l.add(gVar2);
                    gVar2.f142399k.add(this.f142445e);
                    g gVar3 = this.f142445e;
                    gVar3.f142390b = true;
                    gVar3.f142399k.add(this.f142448h);
                    this.f142445e.f142399k.add(this.f142449i);
                }
            } else if (i15 == 3 && !eVar3.m0()) {
                n5.e eVar4 = this.f142442b;
                if (eVar4.f131883w != 3) {
                    g gVar4 = eVar4.f131847e.f142445e;
                    this.f142445e.f142400l.add(gVar4);
                    gVar4.f142399k.add(this.f142445e);
                    g gVar5 = this.f142445e;
                    gVar5.f142390b = true;
                    gVar5.f142399k.add(this.f142448h);
                    this.f142445e.f142399k.add(this.f142449i);
                }
            }
        }
        n5.e eVar5 = this.f142442b;
        n5.d[] dVarArr2 = eVar5.W;
        n5.d dVar5 = dVarArr2[2];
        n5.d dVar6 = dVar5.f131825f;
        if (dVar6 != null && dVarArr2[3].f131825f != null) {
            if (eVar5.m0()) {
                this.f142448h.f142394f = this.f142442b.W[2].f();
                this.f142449i.f142394f = -this.f142442b.W[3].f();
            } else {
                f fVarH6 = h(this.f142442b.W[2]);
                f fVarH7 = h(this.f142442b.W[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f142450j = p.b.CENTER;
            }
            if (this.f142442b.b0()) {
                c(this.f142424k, this.f142448h, 1, this.f142425l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f142448h, fVarH8, this.f142442b.W[2].f());
                c(this.f142449i, this.f142448h, 1, this.f142445e);
                if (this.f142442b.b0()) {
                    c(this.f142424k, this.f142448h, 1, this.f142425l);
                }
                n5.e.b bVar2 = this.f142444d;
                n5.e.b bVar3 = n5.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f142442b.v() > 0.0f) {
                    l lVar = this.f142442b.f131847e;
                    if (lVar.f142444d == bVar3) {
                        lVar.f142445e.f142399k.add(this.f142445e);
                        this.f142445e.f142400l.add(this.f142442b.f131847e.f142445e);
                        this.f142445e.f142389a = this;
                    }
                }
            }
        } else {
            n5.d dVar7 = dVarArr2[3];
            if (dVar7.f131825f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f142449i, fVarH9, -this.f142442b.W[3].f());
                    c(this.f142448h, this.f142449i, -1, this.f142445e);
                    if (this.f142442b.b0()) {
                        c(this.f142424k, this.f142448h, 1, this.f142425l);
                    }
                }
            } else {
                n5.d dVar8 = dVarArr2[4];
                if (dVar8.f131825f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f142424k, fVarH10, 0);
                        c(this.f142448h, this.f142424k, -1, this.f142425l);
                        c(this.f142449i, this.f142448h, 1, this.f142445e);
                    }
                } else if (!(eVar5 instanceof n5.i) && eVar5.L() != null) {
                    b(this.f142448h, this.f142442b.L().f131849f.f142448h, this.f142442b.a0());
                    c(this.f142449i, this.f142448h, 1, this.f142445e);
                    if (this.f142442b.b0()) {
                        c(this.f142424k, this.f142448h, 1, this.f142425l);
                    }
                    n5.e.b bVar4 = this.f142444d;
                    n5.e.b bVar5 = n5.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f142442b.v() > 0.0f) {
                        l lVar2 = this.f142442b.f131847e;
                        if (lVar2.f142444d == bVar5) {
                            lVar2.f142445e.f142399k.add(this.f142445e);
                            this.f142445e.f142400l.add(this.f142442b.f131847e.f142445e);
                            this.f142445e.f142389a = this;
                        }
                    }
                }
            }
        }
        if (this.f142445e.f142400l.size() == 0) {
            this.f142445e.f142391c = true;
        }
    }

    @Override // o5.p
    public void e() {
        f fVar = this.f142448h;
        if (fVar.f142398j) {
            this.f142442b.q1(fVar.f142395g);
        }
    }

    @Override // o5.p
    void f() {
        this.f142443c = null;
        this.f142448h.c();
        this.f142449i.c();
        this.f142424k.c();
        this.f142445e.c();
        this.f142447g = false;
    }

    @Override // o5.p
    boolean m() {
        return this.f142444d != n5.e.b.MATCH_CONSTRAINT || this.f142442b.f131885x == 0;
    }

    void q() {
        this.f142447g = false;
        this.f142448h.c();
        this.f142448h.f142398j = false;
        this.f142449i.c();
        this.f142449i.f142398j = false;
        this.f142424k.c();
        this.f142424k.f142398j = false;
        this.f142445e.f142398j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f142442b.t();
    }
}
