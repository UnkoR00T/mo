package o5;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    n5.e f142442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f142443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected n5.e.b f142444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f142445e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f142446f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f142447g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f142448h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f142449i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f142450j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f142451a;

        static {
            int[] iArr = new int[n5.d.a.values().length];
            f142451a = iArr;
            try {
                iArr[n5.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142451a[n5.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f142451a[n5.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f142451a[n5.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f142451a[n5.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(n5.e eVar) {
        this.f142442b = eVar;
    }

    private void l(int i15, int i16) {
        int i17 = this.f142441a;
        if (i17 == 0) {
            this.f142445e.d(g(i16, i15));
            return;
        }
        if (i17 == 1) {
            this.f142445e.d(Math.min(g(this.f142445e.f142410m, i15), i16));
            return;
        }
        if (i17 == 2) {
            n5.e eVarL = this.f142442b.L();
            if (eVarL != null) {
                g gVar = (i15 == 0 ? eVarL.f131847e : eVarL.f131849f).f142445e;
                if (gVar.f142398j) {
                    this.f142445e.d(g((int) ((gVar.f142395g * (i15 == 0 ? this.f142442b.B : this.f142442b.E)) + 0.5f), i15));
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 3) {
            return;
        }
        n5.e eVar = this.f142442b;
        p pVar = eVar.f131847e;
        n5.e.b bVar = pVar.f142444d;
        n5.e.b bVar2 = n5.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f142441a == 3) {
            n nVar = eVar.f131849f;
            if (nVar.f142444d == bVar2 && nVar.f142441a == 3) {
                return;
            }
        }
        if (i15 == 0) {
            pVar = eVar.f131849f;
        }
        if (pVar.f142445e.f142398j) {
            float fV = eVar.v();
            this.f142445e.d(i15 == 1 ? (int) ((pVar.f142445e.f142395g / fV) + 0.5f) : (int) ((fV * pVar.f142445e.f142395g) + 0.5f));
        }
    }

    @Override // o5.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i15) {
        fVar.f142400l.add(fVar2);
        fVar.f142394f = i15;
        fVar2.f142399k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i15, g gVar) {
        fVar.f142400l.add(fVar2);
        fVar.f142400l.add(this.f142445e);
        fVar.f142396h = i15;
        fVar.f142397i = gVar;
        fVar2.f142399k.add(fVar);
        gVar.f142399k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i15, int i16) {
        if (i16 == 0) {
            n5.e eVar = this.f142442b;
            int i17 = eVar.A;
            int iMax = Math.max(eVar.f131889z, i15);
            if (i17 > 0) {
                iMax = Math.min(i17, i15);
            }
            if (iMax != i15) {
                return iMax;
            }
        } else {
            n5.e eVar2 = this.f142442b;
            int i18 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i15);
            if (i18 > 0) {
                iMax2 = Math.min(i18, i15);
            }
            if (iMax2 != i15) {
                return iMax2;
            }
        }
        return i15;
    }

    protected final f h(n5.d dVar) {
        n5.d dVar2 = dVar.f131825f;
        if (dVar2 == null) {
            return null;
        }
        n5.e eVar = dVar2.f131823d;
        int i15 = a.f142451a[dVar2.f131824e.ordinal()];
        if (i15 == 1) {
            return eVar.f131847e.f142448h;
        }
        if (i15 == 2) {
            return eVar.f131847e.f142449i;
        }
        if (i15 == 3) {
            return eVar.f131849f.f142448h;
        }
        if (i15 == 4) {
            return eVar.f131849f.f142424k;
        }
        if (i15 != 5) {
            return null;
        }
        return eVar.f131849f.f142449i;
    }

    protected final f i(n5.d dVar, int i15) {
        n5.d dVar2 = dVar.f131825f;
        if (dVar2 == null) {
            return null;
        }
        n5.e eVar = dVar2.f131823d;
        p pVar = i15 == 0 ? eVar.f131847e : eVar.f131849f;
        int i16 = a.f142451a[dVar2.f131824e.ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    if (i16 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f142449i;
        }
        return pVar.f142448h;
    }

    public long j() {
        g gVar = this.f142445e;
        if (gVar.f142398j) {
            return gVar.f142395g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f142447g;
    }

    abstract boolean m();

    protected void n(d dVar, n5.d dVar2, n5.d dVar3, int i15) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f142398j && fVarH2.f142398j) {
            int iF = fVarH.f142395g + dVar2.f();
            int iF2 = fVarH2.f142395g - dVar3.f();
            int i16 = iF2 - iF;
            if (!this.f142445e.f142398j && this.f142444d == n5.e.b.MATCH_CONSTRAINT) {
                l(i15, i16);
            }
            g gVar = this.f142445e;
            if (gVar.f142398j) {
                if (gVar.f142395g == i16) {
                    this.f142448h.d(iF);
                    this.f142449i.d(iF2);
                    return;
                }
                float fY = i15 == 0 ? this.f142442b.y() : this.f142442b.T();
                if (fVarH == fVarH2) {
                    iF = fVarH.f142395g;
                    iF2 = fVarH2.f142395g;
                    fY = 0.5f;
                }
                this.f142448h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f142445e.f142395g) * fY)));
                this.f142449i.d(this.f142448h.f142395g + this.f142445e.f142395g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
