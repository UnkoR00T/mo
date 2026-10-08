package n5;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f131956a;

        static {
            int[] iArr = new int[d.a.values().length];
            f131956a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f131956a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f131956a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f131956a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f131956a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f131956a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f131956a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f131956a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f131956a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i15 = 0; i15 < length; i15++) {
            this.W[i15] = this.P0;
        }
    }

    public void A1(int i15) {
        if (i15 > -1) {
            this.L0 = -1.0f;
            this.M0 = i15;
            this.N0 = -1;
        }
    }

    public void B1(int i15) {
        if (i15 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i15;
        }
    }

    public void C1(float f15) {
        if (f15 > -1.0f) {
            this.L0 = f15;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void D1(int i15) {
        if (this.Q0 == i15) {
            return;
        }
        this.Q0 = i15;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i16 = 0; i16 < length; i16++) {
            this.W[i16] = this.P0;
        }
    }

    @Override // n5.e
    public void g(g5.d dVar, boolean z15) {
        f fVar = (f) L();
        if (fVar == null) {
            return;
        }
        d dVarO = fVar.o(d.a.LEFT);
        d dVarO2 = fVar.o(d.a.RIGHT);
        e eVar = this.f131840a0;
        boolean z16 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            dVarO = fVar.o(d.a.TOP);
            dVarO2 = fVar.o(d.a.BOTTOM);
            e eVar2 = this.f131840a0;
            z16 = eVar2 != null && eVar2.Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.n()) {
            g5.i iVarQ = dVar.q(this.P0);
            dVar.f(iVarQ, this.P0.e());
            if (this.M0 != -1) {
                if (z16) {
                    dVar.h(dVar.q(dVarO2), iVarQ, 0, 5);
                }
            } else if (this.N0 != -1 && z16) {
                g5.i iVarQ2 = dVar.q(dVarO2);
                dVar.h(iVarQ, dVar.q(dVarO), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            g5.i iVarQ3 = dVar.q(this.P0);
            dVar.e(iVarQ3, dVar.q(dVarO), this.M0, 8);
            if (z16) {
                dVar.h(dVar.q(dVarO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(g5.d.s(dVar, dVar.q(this.P0), dVar.q(dVarO2), this.L0));
                return;
            }
            return;
        }
        g5.i iVarQ4 = dVar.q(this.P0);
        g5.i iVarQ5 = dVar.q(dVarO2);
        dVar.e(iVarQ4, iVarQ5, -this.N0, 8);
        if (z16) {
            dVar.h(iVarQ4, dVar.q(dVarO), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // n5.e
    public boolean h() {
        return true;
    }

    @Override // n5.e
    public d o(d.a aVar) {
        int i15 = a.f131956a[aVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i15 == 3 || i15 == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // n5.e
    public boolean p0() {
        return this.S0;
    }

    @Override // n5.e
    public boolean q0() {
        return this.S0;
    }

    @Override // n5.e
    public void t1(g5.d dVar, boolean z15) {
        if (L() == null) {
            return;
        }
        int iY = dVar.y(this.P0);
        if (this.Q0 == 1) {
            p1(iY);
            q1(0);
            O0(L().x());
            n1(0);
            return;
        }
        p1(0);
        q1(iY);
        n1(L().Y());
        O0(0);
    }

    public d u1() {
        return this.P0;
    }

    public int v1() {
        return this.Q0;
    }

    public int w1() {
        return this.M0;
    }

    public int x1() {
        return this.N0;
    }

    public float y1() {
        return this.L0;
    }

    public void z1(int i15) {
        this.P0.t(i15);
        this.S0 = true;
    }
}
