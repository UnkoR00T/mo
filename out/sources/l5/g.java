package l5;

/* JADX INFO: loaded from: classes.dex */
public class g extends k5.e {
    private String A0;
    private String B0;
    private String C0;
    private String D0;
    private int E0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private m5.b f116049q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f116050r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f116051s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f116052t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f116053u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f116054v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f116055w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f116056x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f116057y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private float f116058z0;

    public g(k5.g gVar, k5.g.d dVar) {
        super(gVar, dVar);
        this.f116050r0 = 0;
        this.f116051s0 = 0;
        this.f116052t0 = 0;
        this.f116053u0 = 0;
        if (dVar == k5.g.d.ROW) {
            this.f116055w0 = 1;
        } else if (dVar == k5.g.d.COLUMN) {
            this.f116056x0 = 1;
        }
    }

    public void A0(float f15) {
        this.f116057y0 = f15;
    }

    public void B0(int i15) {
        this.f116054v0 = i15;
    }

    public void C0(int i15) {
        this.f116053u0 = i15;
    }

    public void D0(int i15) {
        this.f116051s0 = i15;
    }

    public void E0(int i15) {
        this.f116050r0 = i15;
    }

    public void F0(int i15) {
        this.f116052t0 = i15;
    }

    public void G0(String str) {
        this.A0 = str;
    }

    public void H0(int i15) {
        if (super.v0() == k5.g.d.COLUMN) {
            return;
        }
        this.f116055w0 = i15;
    }

    public void I0(String str) {
        this.D0 = str;
    }

    public void J0(String str) {
        this.C0 = str;
    }

    public void K0(float f15) {
        this.f116058z0 = f15;
    }

    @Override // k5.e, k5.a, k5.f
    public void apply() {
        u0();
        this.f116049q0.t2(this.f116054v0);
        int i15 = this.f116055w0;
        if (i15 != 0) {
            this.f116049q0.v2(i15);
        }
        int i16 = this.f116056x0;
        if (i16 != 0) {
            this.f116049q0.q2(i16);
        }
        float f15 = this.f116057y0;
        if (f15 != 0.0f) {
            this.f116049q0.s2(f15);
        }
        float f16 = this.f116058z0;
        if (f16 != 0.0f) {
            this.f116049q0.y2(f16);
        }
        String str = this.A0;
        if (str != null && !str.isEmpty()) {
            this.f116049q0.u2(this.A0);
        }
        String str2 = this.B0;
        if (str2 != null && !str2.isEmpty()) {
            this.f116049q0.p2(this.B0);
        }
        String str3 = this.C0;
        if (str3 != null && !str3.isEmpty()) {
            this.f116049q0.x2(this.C0);
        }
        String str4 = this.D0;
        if (str4 != null && !str4.isEmpty()) {
            this.f116049q0.w2(this.D0);
        }
        this.f116049q0.r2(this.E0);
        this.f116049q0.Q1(this.f116050r0);
        this.f116049q0.N1(this.f116051s0);
        this.f116049q0.R1(this.f116052t0);
        this.f116049q0.M1(this.f116053u0);
        t0();
    }

    @Override // k5.e
    public n5.j u0() {
        if (this.f116049q0 == null) {
            this.f116049q0 = new m5.b();
        }
        return this.f116049q0;
    }

    public void w0(String str) {
        this.B0 = str;
    }

    public void x0(int i15) {
        if (super.v0() == k5.g.d.ROW) {
            return;
        }
        this.f116056x0 = i15;
    }

    public void y0(int i15) {
        this.E0 = i15;
    }

    public void z0(String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.E0 = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("subgridbycolrow")) {
                this.E0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.E0 |= 2;
            }
        }
    }
}
