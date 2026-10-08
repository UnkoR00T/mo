package o5;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f142414k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f142415a;

        static {
            int[] iArr = new int[p.b.values().length];
            f142415a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142415a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f142415a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(n5.e eVar) {
        super(eVar);
        this.f142448h.f142393e = f.a.LEFT;
        this.f142449i.f142393e = f.a.RIGHT;
        this.f142446f = 0;
    }

    private void q(int[] iArr, int i15, int i16, int i17, int i18, float f15, int i19) {
        int i25 = i16 - i15;
        int i26 = i18 - i17;
        if (i19 != -1) {
            if (i19 == 0) {
                iArr[0] = (int) ((i26 * f15) + 0.5f);
                iArr[1] = i26;
                return;
            } else {
                if (i19 != 1) {
                    return;
                }
                iArr[0] = i25;
                iArr[1] = (int) ((i25 * f15) + 0.5f);
                return;
            }
        }
        int i27 = (int) ((i26 * f15) + 0.5f);
        int i28 = (int) ((i25 / f15) + 0.5f);
        if (i27 <= i25) {
            iArr[0] = i27;
            iArr[1] = i26;
        } else if (i28 <= i26) {
            iArr[0] = i25;
            iArr[1] = i28;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // o5.p, o5.d
    public void a(d dVar) {
        int iG;
        int i15;
        int iG2;
        float f15;
        float fV;
        float fV2;
        int i16;
        int i17 = a.f142415a[this.f142450j.ordinal()];
        if (i17 == 1) {
            p(dVar);
        } else if (i17 == 2) {
            o(dVar);
        } else if (i17 == 3) {
            n5.e eVar = this.f142442b;
            n(dVar, eVar.O, eVar.Q, 0);
            return;
        }
        if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
            n5.e eVar2 = this.f142442b;
            int i18 = eVar2.f131883w;
            if (i18 == 2) {
                n5.e eVarL = eVar2.L();
                if (eVarL != null) {
                    g gVar = eVarL.f131847e.f142445e;
                    if (gVar.f142398j) {
                        this.f142445e.d((int) ((gVar.f142395g * this.f142442b.B) + 0.5f));
                    }
                }
            } else if (i18 == 3) {
                int i19 = eVar2.f131885x;
                if (i19 == 0 || i19 == 3) {
                    n nVar = eVar2.f131849f;
                    f fVar = nVar.f142448h;
                    f fVar2 = nVar.f142449i;
                    boolean z15 = eVar2.O.f131825f != null;
                    boolean z16 = eVar2.P.f131825f != null;
                    boolean z17 = eVar2.Q.f131825f != null;
                    boolean z18 = eVar2.R.f131825f != null;
                    int iW = eVar2.w();
                    if (z15 && z16 && z17 && z18) {
                        float fV3 = this.f142442b.v();
                        if (fVar.f142398j && fVar2.f142398j) {
                            f fVar3 = this.f142448h;
                            if (fVar3.f142391c && this.f142449i.f142391c) {
                                q(f142414k, this.f142448h.f142394f + fVar3.f142400l.get(0).f142395g, this.f142449i.f142400l.get(0).f142395g - this.f142449i.f142394f, fVar.f142394f + fVar.f142395g, fVar2.f142395g - fVar2.f142394f, fV3, iW);
                                this.f142445e.d(f142414k[0]);
                                this.f142442b.f131849f.f142445e.d(f142414k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f142448h;
                        if (fVar4.f142398j) {
                            f fVar5 = this.f142449i;
                            if (fVar5.f142398j) {
                                if (!fVar.f142391c || !fVar2.f142391c) {
                                    return;
                                }
                                q(f142414k, fVar4.f142395g + fVar4.f142394f, fVar5.f142395g - fVar5.f142394f, fVar.f142394f + fVar.f142400l.get(0).f142395g, fVar2.f142400l.get(0).f142395g - fVar2.f142394f, fV3, iW);
                                this.f142445e.d(f142414k[0]);
                                this.f142442b.f131849f.f142445e.d(f142414k[1]);
                            }
                        }
                        f fVar6 = this.f142448h;
                        if (!fVar6.f142391c || !this.f142449i.f142391c || !fVar.f142391c || !fVar2.f142391c) {
                            return;
                        }
                        q(f142414k, this.f142448h.f142394f + fVar6.f142400l.get(0).f142395g, this.f142449i.f142400l.get(0).f142395g - this.f142449i.f142394f, fVar.f142394f + fVar.f142400l.get(0).f142395g, fVar2.f142400l.get(0).f142395g - fVar2.f142394f, fV3, iW);
                        this.f142445e.d(f142414k[0]);
                        this.f142442b.f131849f.f142445e.d(f142414k[1]);
                    } else if (z15 && z17) {
                        if (!this.f142448h.f142391c || !this.f142449i.f142391c) {
                            return;
                        }
                        float fV4 = this.f142442b.v();
                        int i25 = this.f142448h.f142400l.get(0).f142395g + this.f142448h.f142394f;
                        int i26 = this.f142449i.f142400l.get(0).f142395g - this.f142449i.f142394f;
                        if (iW == -1 || iW == 0) {
                            int iG3 = g(i26 - i25, 0);
                            int i27 = (int) ((iG3 * fV4) + 0.5f);
                            int iG4 = g(i27, 1);
                            if (i27 != iG4) {
                                iG3 = (int) ((iG4 / fV4) + 0.5f);
                            }
                            this.f142445e.d(iG3);
                            this.f142442b.f131849f.f142445e.d(iG4);
                        } else if (iW == 1) {
                            int iG5 = g(i26 - i25, 0);
                            int i28 = (int) ((iG5 / fV4) + 0.5f);
                            int iG6 = g(i28, 1);
                            if (i28 != iG6) {
                                iG5 = (int) ((iG6 * fV4) + 0.5f);
                            }
                            this.f142445e.d(iG5);
                            this.f142442b.f131849f.f142445e.d(iG6);
                        }
                    } else if (z16 && z18) {
                        if (!fVar.f142391c || !fVar2.f142391c) {
                            return;
                        }
                        float fV5 = this.f142442b.v();
                        int i29 = fVar.f142400l.get(0).f142395g + fVar.f142394f;
                        int i35 = fVar2.f142400l.get(0).f142395g - fVar2.f142394f;
                        if (iW == -1) {
                            iG = g(i35 - i29, 1);
                            i15 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i15, 0);
                            if (i15 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f142445e.d(iG2);
                            this.f142442b.f131849f.f142445e.d(iG);
                        } else if (iW == 0) {
                            int iG7 = g(i35 - i29, 1);
                            int i36 = (int) ((iG7 * fV5) + 0.5f);
                            int iG8 = g(i36, 0);
                            if (i36 != iG8) {
                                iG7 = (int) ((iG8 / fV5) + 0.5f);
                            }
                            this.f142445e.d(iG8);
                            this.f142442b.f131849f.f142445e.d(iG7);
                        } else if (iW == 1) {
                            iG = g(i35 - i29, 1);
                            i15 = (int) ((iG / fV5) + 0.5f);
                            iG2 = g(i15, 0);
                            if (i15 != iG2) {
                                iG = (int) ((iG2 * fV5) + 0.5f);
                            }
                            this.f142445e.d(iG2);
                            this.f142442b.f131849f.f142445e.d(iG);
                        }
                    }
                } else {
                    int iW2 = eVar2.w();
                    if (iW2 != -1) {
                        if (iW2 == 0) {
                            n5.e eVar3 = this.f142442b;
                            fV2 = eVar3.f131849f.f142445e.f142395g / eVar3.v();
                            i16 = (int) (fV2 + 0.5f);
                        } else if (iW2 != 1) {
                            i16 = 0;
                        } else {
                            n5.e eVar4 = this.f142442b;
                            f15 = eVar4.f131849f.f142445e.f142395g;
                            fV = eVar4.v();
                        }
                        this.f142445e.d(i16);
                    } else {
                        n5.e eVar5 = this.f142442b;
                        f15 = eVar5.f131849f.f142445e.f142395g;
                        fV = eVar5.v();
                    }
                    fV2 = f15 * fV;
                    i16 = (int) (fV2 + 0.5f);
                    this.f142445e.d(i16);
                }
            }
        }
        f fVar7 = this.f142448h;
        if (fVar7.f142391c) {
            f fVar8 = this.f142449i;
            if (fVar8.f142391c) {
                if (fVar7.f142398j && fVar8.f142398j && this.f142445e.f142398j) {
                    return;
                }
                if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
                    n5.e eVar6 = this.f142442b;
                    if (eVar6.f131883w == 0 && !eVar6.k0()) {
                        f fVar9 = this.f142448h.f142400l.get(0);
                        f fVar10 = this.f142449i.f142400l.get(0);
                        int i37 = fVar9.f142395g;
                        f fVar11 = this.f142448h;
                        int i38 = i37 + fVar11.f142394f;
                        int i39 = fVar10.f142395g + this.f142449i.f142394f;
                        fVar11.d(i38);
                        this.f142449i.d(i39);
                        this.f142445e.d(i39 - i38);
                        return;
                    }
                }
                if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT && this.f142441a == 1 && this.f142448h.f142400l.size() > 0 && this.f142449i.f142400l.size() > 0) {
                    int iMin = Math.min((this.f142449i.f142400l.get(0).f142395g + this.f142449i.f142394f) - (this.f142448h.f142400l.get(0).f142395g + this.f142448h.f142394f), this.f142445e.f142410m);
                    n5.e eVar7 = this.f142442b;
                    int i45 = eVar7.A;
                    int iMax = Math.max(eVar7.f131889z, iMin);
                    if (i45 > 0) {
                        iMax = Math.min(i45, iMax);
                    }
                    this.f142445e.d(iMax);
                }
                if (this.f142445e.f142398j) {
                    f fVar12 = this.f142448h.f142400l.get(0);
                    f fVar13 = this.f142449i.f142400l.get(0);
                    int i46 = fVar12.f142395g + this.f142448h.f142394f;
                    int i47 = fVar13.f142395g + this.f142449i.f142394f;
                    float fY = this.f142442b.y();
                    if (fVar12 == fVar13) {
                        i46 = fVar12.f142395g;
                        i47 = fVar13.f142395g;
                        fY = 0.5f;
                    }
                    this.f142448h.d((int) (i46 + 0.5f + (((i47 - i46) - this.f142445e.f142395g) * fY)));
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
            this.f142445e.d(eVar.Y());
        }
        if (this.f142445e.f142398j) {
            n5.e.b bVar = this.f142444d;
            n5.e.b bVar2 = n5.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarL = this.f142442b.L()) != null && (eVarL.A() == n5.e.b.FIXED || eVarL.A() == bVar2)) {
                b(this.f142448h, eVarL.f131847e.f142448h, this.f142442b.O.f());
                b(this.f142449i, eVarL.f131847e.f142449i, -this.f142442b.Q.f());
                return;
            }
        } else {
            n5.e.b bVarA = this.f142442b.A();
            this.f142444d = bVarA;
            if (bVarA != n5.e.b.MATCH_CONSTRAINT) {
                n5.e.b bVar3 = n5.e.b.MATCH_PARENT;
                if (bVarA == bVar3 && (eVarL2 = this.f142442b.L()) != null && (eVarL2.A() == n5.e.b.FIXED || eVarL2.A() == bVar3)) {
                    int iY = (eVarL2.Y() - this.f142442b.O.f()) - this.f142442b.Q.f();
                    b(this.f142448h, eVarL2.f131847e.f142448h, this.f142442b.O.f());
                    b(this.f142449i, eVarL2.f131847e.f142449i, -this.f142442b.Q.f());
                    this.f142445e.d(iY);
                    return;
                }
                if (this.f142444d == n5.e.b.FIXED) {
                    this.f142445e.d(this.f142442b.Y());
                }
            }
        }
        g gVar = this.f142445e;
        if (gVar.f142398j) {
            n5.e eVar2 = this.f142442b;
            if (eVar2.f131839a) {
                n5.d[] dVarArr = eVar2.W;
                n5.d dVar = dVarArr[0];
                n5.d dVar2 = dVar.f131825f;
                if (dVar2 != null && dVarArr[1].f131825f != null) {
                    if (eVar2.k0()) {
                        this.f142448h.f142394f = this.f142442b.W[0].f();
                        this.f142449i.f142394f = -this.f142442b.W[1].f();
                        return;
                    }
                    f fVarH = h(this.f142442b.W[0]);
                    if (fVarH != null) {
                        b(this.f142448h, fVarH, this.f142442b.W[0].f());
                    }
                    f fVarH2 = h(this.f142442b.W[1]);
                    if (fVarH2 != null) {
                        b(this.f142449i, fVarH2, -this.f142442b.W[1].f());
                    }
                    this.f142448h.f142390b = true;
                    this.f142449i.f142390b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f142448h, fVarH3, this.f142442b.W[0].f());
                        b(this.f142449i, this.f142448h, this.f142445e.f142395g);
                        return;
                    }
                    return;
                }
                n5.d dVar3 = dVarArr[1];
                if (dVar3.f131825f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f142449i, fVarH4, -this.f142442b.W[1].f());
                        b(this.f142448h, this.f142449i, -this.f142445e.f142395g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof n5.i) || eVar2.L() == null || this.f142442b.o(n5.d.a.CENTER).f131825f != null) {
                    return;
                }
                b(this.f142448h, this.f142442b.L().f131847e.f142448h, this.f142442b.Z());
                b(this.f142449i, this.f142448h, this.f142445e.f142395g);
                return;
            }
        }
        if (this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
            n5.e eVar3 = this.f142442b;
            int i15 = eVar3.f131883w;
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
            } else if (i15 == 3) {
                if (eVar3.f131885x == 3) {
                    this.f142448h.f142389a = this;
                    this.f142449i.f142389a = this;
                    n nVar = eVar3.f131849f;
                    nVar.f142448h.f142389a = this;
                    nVar.f142449i.f142389a = this;
                    gVar.f142389a = this;
                    if (eVar3.m0()) {
                        this.f142445e.f142400l.add(this.f142442b.f131849f.f142445e);
                        this.f142442b.f131849f.f142445e.f142399k.add(this.f142445e);
                        n nVar2 = this.f142442b.f131849f;
                        nVar2.f142445e.f142389a = this;
                        this.f142445e.f142400l.add(nVar2.f142448h);
                        this.f142445e.f142400l.add(this.f142442b.f131849f.f142449i);
                        this.f142442b.f131849f.f142448h.f142399k.add(this.f142445e);
                        this.f142442b.f131849f.f142449i.f142399k.add(this.f142445e);
                    } else if (this.f142442b.k0()) {
                        this.f142442b.f131849f.f142445e.f142400l.add(this.f142445e);
                        this.f142445e.f142399k.add(this.f142442b.f131849f.f142445e);
                    } else {
                        this.f142442b.f131849f.f142445e.f142400l.add(this.f142445e);
                    }
                } else {
                    g gVar4 = eVar3.f131849f.f142445e;
                    gVar.f142400l.add(gVar4);
                    gVar4.f142399k.add(this.f142445e);
                    this.f142442b.f131849f.f142448h.f142399k.add(this.f142445e);
                    this.f142442b.f131849f.f142449i.f142399k.add(this.f142445e);
                    g gVar5 = this.f142445e;
                    gVar5.f142390b = true;
                    gVar5.f142399k.add(this.f142448h);
                    this.f142445e.f142399k.add(this.f142449i);
                    this.f142448h.f142400l.add(this.f142445e);
                    this.f142449i.f142400l.add(this.f142445e);
                }
            }
        }
        n5.e eVar4 = this.f142442b;
        n5.d[] dVarArr2 = eVar4.W;
        n5.d dVar4 = dVarArr2[0];
        n5.d dVar5 = dVar4.f131825f;
        if (dVar5 != null && dVarArr2[1].f131825f != null) {
            if (eVar4.k0()) {
                this.f142448h.f142394f = this.f142442b.W[0].f();
                this.f142449i.f142394f = -this.f142442b.W[1].f();
                return;
            }
            f fVarH5 = h(this.f142442b.W[0]);
            f fVarH6 = h(this.f142442b.W[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f142450j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f142448h, fVarH7, this.f142442b.W[0].f());
                c(this.f142449i, this.f142448h, 1, this.f142445e);
                return;
            }
            return;
        }
        n5.d dVar6 = dVarArr2[1];
        if (dVar6.f131825f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f142449i, fVarH8, -this.f142442b.W[1].f());
                c(this.f142448h, this.f142449i, -1, this.f142445e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof n5.i) || eVar4.L() == null) {
            return;
        }
        b(this.f142448h, this.f142442b.L().f131847e.f142448h, this.f142442b.Z());
        c(this.f142449i, this.f142448h, 1, this.f142445e);
    }

    @Override // o5.p
    public void e() {
        f fVar = this.f142448h;
        if (fVar.f142398j) {
            this.f142442b.p1(fVar.f142395g);
        }
    }

    @Override // o5.p
    void f() {
        this.f142443c = null;
        this.f142448h.c();
        this.f142449i.c();
        this.f142445e.c();
        this.f142447g = false;
    }

    @Override // o5.p
    boolean m() {
        return this.f142444d != n5.e.b.MATCH_CONSTRAINT || this.f142442b.f131883w == 0;
    }

    void r() {
        this.f142447g = false;
        this.f142448h.c();
        this.f142448h.f142398j = false;
        this.f142449i.c();
        this.f142449i.f142398j = false;
        this.f142445e.f142398j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f142442b.t();
    }
}
