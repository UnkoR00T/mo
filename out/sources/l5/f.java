package l5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class f extends k5.e {
    protected int A0;
    protected int B0;
    protected int C0;
    protected int D0;
    protected int E0;
    protected int F0;
    protected int G0;
    protected int H0;
    protected int I0;
    protected int J0;
    protected int K0;
    protected float L0;
    protected float M0;
    protected float N0;
    protected float O0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected n5.g f116039q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected HashMap<String, Float> f116040r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected HashMap<String, Float> f116041s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    protected HashMap<String, Float> f116042t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    protected int f116043u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected int f116044v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected int f116045w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f116046x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f116047y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected int f116048z0;

    public f(k5.g gVar, k5.g.d dVar) {
        super(gVar, dVar);
        this.f116043u0 = 0;
        this.f116044v0 = -1;
        this.f116045w0 = -1;
        this.f116046x0 = -1;
        this.f116047y0 = -1;
        this.f116048z0 = -1;
        this.A0 = -1;
        this.B0 = 2;
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        if (dVar == k5.g.d.VERTICAL_FLOW) {
            this.K0 = 1;
        }
    }

    public void A0(int i15) {
        this.f116045w0 = i15;
    }

    public void B0(int i15) {
        this.C0 = i15;
    }

    public void C0(int i15) {
        this.E0 = i15;
    }

    public void D0(int i15) {
        this.f116047y0 = i15;
    }

    public void E0(float f15) {
        this.O0 = f15;
    }

    public void F0(int i15) {
        this.A0 = i15;
    }

    public void G0(float f15) {
        this.M0 = f15;
    }

    public void H0(int i15) {
        this.f116046x0 = i15;
    }

    public void I0(int i15) {
        this.J0 = i15;
    }

    public void J0(int i15) {
        this.K0 = i15;
    }

    public void K0(int i15) {
        this.I0 = i15;
    }

    public void L0(int i15) {
        this.F0 = i15;
    }

    public void M0(int i15) {
        this.G0 = i15;
    }

    public void N0(int i15) {
        this.H0 = i15;
    }

    public void O0(int i15) {
        this.B0 = i15;
    }

    public void P0(int i15) {
        this.D0 = i15;
    }

    public void Q0(int i15) {
        this.f116044v0 = i15;
    }

    public void R0(int i15) {
        this.f116043u0 = i15;
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        u0();
        b(this.f116039q0);
        this.f116039q0.G2(this.K0);
        this.f116039q0.L2(this.f116043u0);
        int i15 = this.J0;
        if (i15 != -1) {
            this.f116039q0.F2(i15);
        }
        int i16 = this.F0;
        if (i16 != 0) {
            this.f116039q0.O1(i16);
        }
        int i17 = this.H0;
        if (i17 != 0) {
            this.f116039q0.R1(i17);
        }
        int i18 = this.G0;
        if (i18 != 0) {
            this.f116039q0.P1(i18);
        }
        int i19 = this.I0;
        if (i19 != 0) {
            this.f116039q0.M1(i19);
        }
        int i25 = this.E0;
        if (i25 != 0) {
            this.f116039q0.z2(i25);
        }
        int i26 = this.D0;
        if (i26 != 0) {
            this.f116039q0.J2(i26);
        }
        float f15 = this.f108434i;
        if (f15 != 0.5f) {
            this.f116039q0.y2(f15);
        }
        float f16 = this.N0;
        if (f16 != 0.5f) {
            this.f116039q0.t2(f16);
        }
        float f17 = this.O0;
        if (f17 != 0.5f) {
            this.f116039q0.B2(f17);
        }
        float f18 = this.f108436j;
        if (f18 != 0.5f) {
            this.f116039q0.I2(f18);
        }
        float f19 = this.L0;
        if (f19 != 0.5f) {
            this.f116039q0.v2(f19);
        }
        float f25 = this.M0;
        if (f25 != 0.5f) {
            this.f116039q0.D2(f25);
        }
        int i27 = this.C0;
        if (i27 != 2) {
            this.f116039q0.x2(i27);
        }
        int i28 = this.B0;
        if (i28 != 2) {
            this.f116039q0.H2(i28);
        }
        int i29 = this.f116044v0;
        if (i29 != -1) {
            this.f116039q0.K2(i29);
        }
        int i35 = this.f116045w0;
        if (i35 != -1) {
            this.f116039q0.w2(i35);
        }
        int i36 = this.f116046x0;
        if (i36 != -1) {
            this.f116039q0.E2(i36);
        }
        int i37 = this.f116047y0;
        if (i37 != -1) {
            this.f116039q0.A2(i37);
        }
        int i38 = this.f116048z0;
        if (i38 != -1) {
            this.f116039q0.u2(i38);
        }
        int i39 = this.A0;
        if (i39 != -1) {
            this.f116039q0.C2(i39);
        }
        t0();
    }

    @Override // k5.e
    public n5.j u0() {
        if (this.f116039q0 == null) {
            this.f116039q0 = new n5.g();
        }
        return this.f116039q0;
    }

    public void w0(String str, float f15, float f16, float f17) {
        super.s0(str);
        if (!Float.isNaN(f15)) {
            if (this.f116040r0 == null) {
                this.f116040r0 = new HashMap<>();
            }
            this.f116040r0.put(str, Float.valueOf(f15));
        }
        if (!Float.isNaN(f16)) {
            if (this.f116041s0 == null) {
                this.f116041s0 = new HashMap<>();
            }
            this.f116041s0.put(str, Float.valueOf(f16));
        }
        if (Float.isNaN(f17)) {
            return;
        }
        if (this.f116042t0 == null) {
            this.f116042t0 = new HashMap<>();
        }
        this.f116042t0.put(str, Float.valueOf(f17));
    }

    public void x0(float f15) {
        this.N0 = f15;
    }

    public void y0(int i15) {
        this.f116048z0 = i15;
    }

    public void z0(float f15) {
        this.L0 = f15;
    }
}
