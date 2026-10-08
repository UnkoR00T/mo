package n5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o5.n;
import o5.p;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    public int A;
    int A0;
    public float B;
    boolean B0;
    public int C;
    boolean C0;
    public int D;
    public float[] D0;
    public float E;
    protected e[] E0;
    int F;
    protected e[] F0;
    float G;
    e G0;
    private int[] H;
    e H0;
    public float I;
    public int I0;
    private boolean J;
    public int J0;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    public d O;
    public d P;
    public d Q;
    public d R;
    public d S;
    d T;
    d U;
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f131839a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f131840a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f131841b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f131842b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o5.c f131843c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f131844c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o5.c f131845d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f131846d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o5.l f131847e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected int f131848e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f131849f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected int f131850f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f131851g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f131852g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f131853h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f131854h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f131855i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f131856i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f131857j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected int f131858j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f131859k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected int f131860k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f131861l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    int f131862l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f131863m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f131864m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k5.h f131865n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected int f131866n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f131867o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f131868o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f131869p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    float f131870p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f131871q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Object f131872q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f131873r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f131874r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f131875s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f131876s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f131877t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f131878t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f131879u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f131880u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f131881v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private String f131882v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f131883w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f131884w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f131885x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    boolean f131886x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f131887y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    boolean f131888y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f131889z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f131890z0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f131891a;

        static {
            int[] iArr = new int[d.a.values().length];
            f131891a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f131891a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f131891a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f131891a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f131891a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f131891a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f131891a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f131891a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f131891a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        this.f131839a = false;
        this.f131841b = new p[2];
        this.f131847e = null;
        this.f131849f = null;
        this.f131851g = new boolean[]{true, true};
        this.f131853h = false;
        this.f131855i = true;
        this.f131857j = false;
        this.f131859k = true;
        this.f131861l = -1;
        this.f131863m = -1;
        this.f131865n = new k5.h(this);
        this.f131869p = false;
        this.f131871q = false;
        this.f131873r = false;
        this.f131875s = false;
        this.f131877t = -1;
        this.f131879u = -1;
        this.f131881v = 0;
        this.f131883w = 0;
        this.f131885x = 0;
        this.f131887y = new int[2];
        this.f131889z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.F = -1;
        this.G = 1.0f;
        this.H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.I = Float.NaN;
        this.J = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new d(this, d.a.LEFT);
        this.P = new d(this, d.a.TOP);
        this.Q = new d(this, d.a.RIGHT);
        this.R = new d(this, d.a.BOTTOM);
        this.S = new d(this, d.a.BASELINE);
        this.T = new d(this, d.a.CENTER_X);
        this.U = new d(this, d.a.CENTER_Y);
        d dVar = new d(this, d.a.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f131840a0 = null;
        this.f131842b0 = 0;
        this.f131844c0 = 0;
        this.f131846d0 = 0.0f;
        this.f131848e0 = -1;
        this.f131850f0 = 0;
        this.f131852g0 = 0;
        this.f131854h0 = 0;
        this.f131856i0 = 0;
        this.f131858j0 = 0;
        this.f131860k0 = 0;
        this.f131862l0 = 0;
        float f15 = K0;
        this.f131868o0 = f15;
        this.f131870p0 = f15;
        this.f131874r0 = 0;
        this.f131876s0 = 0;
        this.f131878t0 = false;
        this.f131880u0 = null;
        this.f131882v0 = null;
        this.f131888y0 = false;
        this.f131890z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void A0(StringBuilder sb5, String str, int i15, int i16) {
        if (i15 == i16) {
            return;
        }
        sb5.append(str);
        sb5.append(" :   ");
        sb5.append(i15);
        sb5.append(",\n");
    }

    private void B0(StringBuilder sb5, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb5.append(str);
        sb5.append(" :   ");
        sb5.append(str2);
        sb5.append(",\n");
    }

    private void C0(StringBuilder sb5, String str, float f15, int i15) {
        if (f15 == 0.0f) {
            return;
        }
        sb5.append(str);
        sb5.append(" :  [");
        sb5.append(f15);
        sb5.append(",");
        sb5.append(i15);
        sb5.append("");
        sb5.append("],\n");
    }

    private void Q(StringBuilder sb5, String str, int i15, int i16, int i17, int i18, int i19, int i25, float f15, b bVar, float f16) {
        sb5.append(str);
        sb5.append(" :  {\n");
        B0(sb5, "      behavior", bVar.toString(), b.FIXED.toString());
        A0(sb5, "      size", i15, 0);
        A0(sb5, "      min", i16, 0);
        A0(sb5, "      max", i17, Integer.MAX_VALUE);
        A0(sb5, "      matchMin", i19, 0);
        A0(sb5, "      matchDef", i25, 0);
        z0(sb5, "      matchPercent", f15, 1.0f);
        sb5.append("    },\n");
    }

    private void R(StringBuilder sb5, String str, d dVar) {
        if (dVar.f131825f == null) {
            return;
        }
        sb5.append("    ");
        sb5.append(str);
        sb5.append(" : [ '");
        sb5.append(dVar.f131825f);
        sb5.append("'");
        if (dVar.f131827h != Integer.MIN_VALUE || dVar.f131826g != 0) {
            sb5.append(",");
            sb5.append(dVar.f131826g);
            if (dVar.f131827h != Integer.MIN_VALUE) {
                sb5.append(",");
                sb5.append(dVar.f131827h);
                sb5.append(",");
            }
        }
        sb5.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean h0(int i15) {
        d dVar;
        d dVar2;
        int i16 = i15 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i16];
        d dVar4 = dVar3.f131825f;
        return (dVar4 == null || dVar4.f131825f == dVar3 || (dVar2 = (dVar = dVarArr[i16 + 1]).f131825f) == null || dVar2.f131825f != dVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    private void i(g5.d dVar, boolean z15, boolean z16, boolean z17, boolean z18, g5.i iVar, g5.i iVar2, b bVar, boolean z19, d dVar2, d dVar3, int i15, int i16, int i17, int i18, float f15, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i19, int i25, int i26, int i27, float f16, boolean z35) {
        boolean z36;
        int iMin;
        int i28;
        g5.i iVar3;
        boolean z37;
        boolean z38;
        int i29;
        int i35;
        g5.i iVarQ;
        g5.i iVarQ2;
        int i36;
        char c15;
        char c16;
        d dVar4;
        boolean z39;
        g5.i iVar4;
        boolean z45;
        boolean z46;
        int i37;
        int i38;
        boolean z47;
        boolean z48;
        g5.i iVar5;
        e eVar;
        int i39;
        boolean z49;
        int iMin2;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        e eVar2;
        int i57;
        e eVar3;
        dVar = dVar;
        g5.i iVarQ3 = dVar.q(dVar2);
        g5.i iVarQ4 = dVar.q(dVar3);
        g5.i iVarQ5 = dVar.q(dVar2.j());
        g5.i iVarQ6 = dVar.q(dVar3.j());
        g5.d.x();
        boolean zO = dVar2.o();
        boolean zO2 = dVar3.o();
        boolean zO3 = this.V.o();
        int i58 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i58++;
        }
        int i59 = z25 ? 3 : i19;
        g5.i iVar6 = iVarQ6;
        int iOrdinal = bVar.ordinal();
        boolean z55 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i59 == 4) ? false : true;
        int i65 = this.f131861l;
        if (i65 != -1 && z15) {
            this.f131861l = -1;
            i16 = i65;
            z55 = false;
        }
        int i66 = this.f131863m;
        if (i66 == -1 || z15) {
            i66 = i16;
        } else {
            this.f131863m = -1;
            z55 = false;
        }
        int i67 = i66;
        if (this.f131876s0 == 8) {
            iMin = 0;
            z36 = false;
        } else {
            z36 = z55;
            iMin = i67;
        }
        if (z35) {
            if (!zO && !zO2 && !zO3) {
                dVar.f(iVarQ3, i15);
            } else if (zO && !zO2) {
                i28 = 8;
                dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
            }
            i28 = 8;
        } else {
            i28 = 8;
        }
        if (z36 == 0) {
            if (z19) {
                dVar.e(iVarQ4, iVarQ3, 0, 3);
                if (i17 > 0) {
                    dVar.h(iVarQ4, iVarQ3, i17, 8);
                }
                if (i18 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ4, iVarQ3, i18, 8);
                }
            } else {
                dVar.e(iVarQ4, iVarQ3, iMin, i28);
            }
            i35 = i27;
            iVar3 = iVarQ4;
            i58 = i58 == true ? 1 : 0;
            iVar6 = iVar6;
            z37 = z36;
            z38 = z18;
            i29 = i26;
        } else if (i58 == 2 || z25 || !(i59 == 1 || i59 == 0)) {
            int i68 = i26 == -2 ? iMin : i26;
            int i69 = i27 == -2 ? iMin : i27;
            if (iMin > 0 && i59 != 1) {
                iMin = 0;
            }
            if (i68 > 0) {
                dVar.h(iVarQ4, iVarQ3, i68, 8);
                iMin = Math.max(iMin, i68);
            }
            if (i69 > 0) {
                if (!z16 || i59 != 1) {
                    dVar.j(iVarQ4, iVarQ3, i69, 8);
                }
                iMin = Math.min(iMin, i69);
            }
            if (i59 == 1) {
                if (z16) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z27) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                }
                iVar3 = iVarQ4;
                iVar6 = iVar6;
                z37 = z36;
                z38 = z18;
                i29 = i68;
                i35 = i69;
                i58 = i58 == true ? 1 : 0;
            } else {
                if (i59 == 2) {
                    d.a aVarK = dVar2.k();
                    d.a aVar = d.a.TOP;
                    if (aVarK == aVar || dVar2.k() == d.a.BOTTOM) {
                        iVarQ = dVar.q(this.f131840a0.o(aVar));
                        iVarQ2 = dVar.q(this.f131840a0.o(d.a.BOTTOM));
                    } else {
                        iVarQ = dVar.q(this.f131840a0.o(d.a.LEFT));
                        iVarQ2 = dVar.q(this.f131840a0.o(d.a.RIGHT));
                    }
                    g5.i iVar7 = iVarQ2;
                    iVar3 = iVarQ4;
                    dVar.d(dVar.r().k(iVar3, iVarQ3, iVar7, iVarQ, f16));
                    if (z16) {
                        z36 = false;
                    }
                    z38 = z18;
                    z37 = z36;
                } else {
                    iVar3 = iVarQ4;
                    z37 = z36;
                    z38 = true;
                }
                i29 = i68;
                i35 = i69;
            }
        } else {
            int iMax = Math.max(i26, iMin);
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            dVar.e(iVarQ4, iVarQ3, iMax, 8);
            i29 = i26;
            i35 = i27;
            iVar3 = iVarQ4;
            i58 = i58 == true ? 1 : 0;
            iVar6 = iVar6;
            z37 = false;
            z38 = z18;
        }
        if (!z35) {
            i36 = 8;
            c15 = 1;
            c16 = 2;
        } else {
            if (!z27) {
                if (!zO && !zO2 && !zO3) {
                    i46 = 5;
                    z49 = z16;
                    i57 = i46;
                } else if (!zO || zO2) {
                    if (zO || !zO2) {
                        if (zO && zO2) {
                            e eVar4 = dVar2.f131825f.f131823d;
                            e eVar5 = dVar3.f131825f.f131823d;
                            e eVarL = L();
                            int i75 = 6;
                            if (!z37) {
                                z39 = true;
                                if (iVarQ5.f70680g && iVar6.f70680g) {
                                    g5.i iVar8 = iVar6;
                                    dVar.c(iVarQ3, iVarQ5, dVar2.f(), f15, iVar8, iVar3, dVar3.f(), 8);
                                    if (z16 && z38) {
                                        int iF = dVar3.f131825f != null ? dVar3.f() : 0;
                                        if (iVar8 != iVar2) {
                                            dVar.h(iVar2, iVar3, iF, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                g5.i iVar9 = iVar6;
                                iVarQ3 = iVarQ3;
                                iVar4 = iVar9;
                                dVar = dVar;
                                iVarQ5 = iVarQ5;
                                z45 = true;
                                z46 = true;
                                i75 = 6;
                                i37 = 5;
                                i38 = 4;
                                z47 = false;
                            } else if (i59 == 0) {
                                if (i35 != 0 || i29 != 0) {
                                    i55 = 5;
                                    i56 = 5;
                                    z46 = true;
                                    z47 = false;
                                    z45 = true;
                                } else if (iVarQ5.f70680g && iVar6.f70680g) {
                                    dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
                                    dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                                    return;
                                } else {
                                    i55 = 8;
                                    i56 = 8;
                                    z46 = false;
                                    z47 = true;
                                    z45 = false;
                                }
                                if ((eVar4 instanceof n5.a) || (eVar5 instanceof n5.a)) {
                                    iVar4 = iVar6;
                                    z39 = true;
                                    i38 = 4;
                                } else {
                                    iVar4 = iVar6;
                                    i38 = i56;
                                    z39 = true;
                                }
                                i37 = i55;
                                iVarQ5 = iVarQ5;
                                i75 = 6;
                            } else {
                                if (i59 == 2) {
                                    if ((eVar4 instanceof n5.a) || (eVar5 instanceof n5.a)) {
                                        iVar4 = iVar6;
                                        z39 = true;
                                        i38 = 4;
                                    } else {
                                        iVar4 = iVar6;
                                        z39 = true;
                                        i38 = 5;
                                    }
                                    i37 = 5;
                                } else if (i59 == 1) {
                                    g5.i iVar10 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar10;
                                    iVarQ5 = iVarQ5;
                                    i75 = 6;
                                    z39 = true;
                                    i38 = 4;
                                    i37 = 8;
                                } else if (i59 != 3) {
                                    z39 = true;
                                    g5.i iVar11 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar11;
                                    dVar = dVar;
                                    iVarQ5 = iVarQ5;
                                    i75 = 6;
                                    i38 = 4;
                                    i37 = 5;
                                    z45 = false;
                                    z46 = false;
                                    z47 = false;
                                } else if (this.F == -1) {
                                    if (z28) {
                                        g5.i iVar12 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar12;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z39 = true;
                                        i75 = z16 ? 5 : 4;
                                    } else {
                                        g5.i iVar13 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar13;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z39 = true;
                                        i75 = 8;
                                    }
                                    i38 = 5;
                                    i37 = 8;
                                    z45 = true;
                                    z46 = true;
                                    z47 = true;
                                } else {
                                    if (z25) {
                                        if (i25 != 2) {
                                            z39 = true;
                                            if (i25 != 1) {
                                                i48 = 8;
                                                i49 = 5;
                                            }
                                            iVar4 = iVar6;
                                            i37 = i48;
                                            i38 = i49;
                                            z45 = z39;
                                            z46 = z45;
                                            z47 = z46;
                                        } else {
                                            z39 = true;
                                        }
                                        i48 = 5;
                                        i49 = 4;
                                        iVar4 = iVar6;
                                        i37 = i48;
                                        i38 = i49;
                                        z45 = z39;
                                        z46 = z45;
                                        z47 = z46;
                                    } else {
                                        z39 = true;
                                        if (i35 > 0) {
                                            iVar4 = iVar6;
                                            z45 = true;
                                            z46 = true;
                                            z47 = true;
                                            i38 = 5;
                                        } else if (i35 != 0 || i29 != 0) {
                                            iVar4 = iVar6;
                                            z45 = true;
                                            z46 = true;
                                            z47 = true;
                                            i38 = 4;
                                        } else if (z28) {
                                            iVar4 = iVar6;
                                            i37 = (eVar4 == eVarL || eVar5 == eVarL) ? 5 : 4;
                                            z45 = true;
                                            z46 = true;
                                            z47 = true;
                                            i38 = 4;
                                        } else {
                                            iVar4 = iVar6;
                                            z45 = true;
                                            z46 = true;
                                            z47 = true;
                                            i38 = 8;
                                        }
                                        i37 = 5;
                                    }
                                    dVar = dVar;
                                }
                                z45 = true;
                                z46 = true;
                                z47 = false;
                            }
                            if (z45 && iVarQ5 == iVar4 && eVar4 != eVarL) {
                                z45 = false;
                                z48 = false;
                            } else {
                                z48 = z39;
                            }
                            if (z46) {
                                if (z37 || z26 || z28 || iVarQ5 != iVar || iVar4 != iVar2) {
                                    i47 = i75;
                                    z49 = z16;
                                } else {
                                    i47 = 8;
                                    z49 = false;
                                    i37 = 8;
                                    z48 = false;
                                }
                                g5.i iVar14 = iVarQ3;
                                eVar = eVarL;
                                i39 = 8;
                                g5.i iVar15 = iVar3;
                                dVar.c(iVar14, iVarQ5, dVar2.f(), f15, iVar4, iVar15, dVar3.f(), i47);
                                g5.i iVar16 = iVar4;
                                iVar5 = iVar14;
                                iVar6 = iVar16;
                                iVar3 = iVar15;
                            } else {
                                iVar6 = iVar4;
                                iVar5 = iVarQ3;
                                eVar = eVarL;
                                z39 = z39;
                                i39 = 8;
                                z49 = z16;
                            }
                            if (this.f131876s0 == i39 && !dVar3.m()) {
                                return;
                            }
                            if (z45) {
                                int i76 = (!z49 || iVarQ5 == iVar6 || z37 || !((eVar4 instanceof n5.a) || (eVar5 instanceof n5.a))) ? i37 : 6;
                                dVar.h(iVar5, iVarQ5, dVar2.f(), i76);
                                dVar.j(iVar3, iVar6, -dVar3.f(), i76);
                                i37 = i76;
                            }
                            if (!z49 || !z29 || (eVar4 instanceof n5.a) || (eVar5 instanceof n5.a) || eVar5 == eVar) {
                                iMin2 = i38;
                                i45 = i37;
                                z39 = z48;
                            } else {
                                iMin2 = 6;
                                i45 = 6;
                            }
                            if (z39) {
                                if (z47 && (!z28 || z17)) {
                                    if (eVar4 != eVar && eVar5 != eVar) {
                                        i75 = iMin2;
                                    }
                                    if ((eVar4 instanceof h) || (eVar5 instanceof h)) {
                                        i75 = 5;
                                    }
                                    if ((eVar4 instanceof n5.a) || (eVar5 instanceof n5.a)) {
                                        i75 = 5;
                                    }
                                    iMin2 = Math.max(z28 ? 5 : i75, iMin2);
                                }
                                if (z49) {
                                    iMin2 = Math.min(i45, iMin2);
                                    if (z25 && !z28 && (eVar4 == eVar || eVar5 == eVar)) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar.e(iVar5, iVarQ5, dVar2.f(), iMin2);
                                dVar.e(iVar3, iVar6, -dVar3.f(), iMin2);
                            }
                            if (z49) {
                                int iF2 = iVar == iVarQ5 ? dVar2.f() : 0;
                                if (iVarQ5 != iVar) {
                                    dVar.h(iVar5, iVar, iF2, 5);
                                }
                            }
                            if (!z49 || !z37 || i17 != 0 || i29 != 0) {
                                i46 = 5;
                            } else if (z37 && i59 == 3) {
                                dVar.h(iVar3, iVar5, 0, i39);
                                i46 = 5;
                            } else {
                                i46 = 5;
                                dVar.h(iVar3, iVar5, 0, 5);
                            }
                        }
                        i57 = i46;
                    } else {
                        dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                        if (z16) {
                            if (this.f131857j && iVarQ3.f70680g && (eVar2 = this.f131840a0) != null) {
                                f fVar = (f) eVar2;
                                if (z15) {
                                    fVar.D1(dVar2);
                                } else {
                                    fVar.I1(dVar2);
                                }
                            } else {
                                i46 = 5;
                                dVar.h(iVarQ3, iVar, 0, 5);
                            }
                        }
                        z49 = z16;
                        i57 = i46;
                    }
                    i46 = 5;
                    z49 = z16;
                    i57 = i46;
                } else {
                    i57 = (z16 && (dVar2.f131825f.f131823d instanceof n5.a)) ? 8 : 5;
                    z49 = z16;
                    iVar6 = iVar6;
                }
                if (z49 && z38) {
                    int iF3 = dVar3.f131825f != null ? dVar3.f() : 0;
                    if (iVar6 != iVar2) {
                        if (!this.f131857j || !iVar3.f70680g || (eVar3 = this.f131840a0) == null) {
                            dVar.h(iVar2, iVar3, iF3, i57);
                            return;
                        }
                        f fVar2 = (f) eVar3;
                        if (z15) {
                            fVar2.C1(dVar3);
                            return;
                        } else {
                            fVar2.H1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            c16 = 2;
            i36 = 8;
            c15 = 1;
        }
        if (i58 < c16 && z16 && z38) {
            dVar.h(iVarQ3, iVar, 0, i36);
            char c17 = (z15 || this.S.f131825f == null) ? c15 : (char) 0;
            if (!z15 && (dVar4 = this.S.f131825f) != null) {
                e eVar6 = dVar4.f131823d;
                if (eVar6.f131846d0 != 0.0f) {
                    b[] bVarArr = eVar6.Z;
                    b bVar2 = bVarArr[0];
                    b bVar3 = b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && bVarArr[c15] == bVar3) {
                        c17 = c15;
                    } else {
                        c17 = 0;
                    }
                } else {
                    c17 = 0;
                }
            }
            if (c17 != 0) {
                dVar.h(iVar2, iVar3, 0, i36);
            }
        }
    }

    private void z0(StringBuilder sb5, String str, float f15, float f16) {
        if (f15 == f16) {
            return;
        }
        sb5.append(str);
        sb5.append(" :   ");
        sb5.append(f15);
        sb5.append(",\n");
    }

    public b A() {
        return this.Z[0];
    }

    public int B() {
        d dVar = this.O;
        int i15 = dVar != null ? dVar.f131826g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i15 + dVar2.f131826g : i15;
    }

    public int C() {
        return this.M;
    }

    public int D() {
        return this.N;
    }

    public void D0(int i15) {
        this.f131862l0 = i15;
        this.J = i15 > 0;
    }

    public int E() {
        return Z();
    }

    public void E0(Object obj) {
        this.f131872q0 = obj;
    }

    public int F(int i15) {
        if (i15 == 0) {
            return Y();
        }
        if (i15 == 1) {
            return x();
        }
        return 0;
    }

    public void F0(String str) {
        this.f131880u0 = str;
    }

    public int G() {
        return this.H[1];
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void G0(String str) {
        float fAbs;
        int i15 = 0;
        if (str == null || str.length() == 0) {
            this.f131846d0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i16 = 0;
        int i17 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i16 = strSubstring.equalsIgnoreCase(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n) ? 1 : -1;
            }
            i17 = i16;
            i16 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i16);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i15;
                }
            } else {
                String strSubstring3 = str.substring(i16, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i15;
                } else {
                    float f15 = Float.parseFloat(strSubstring3);
                    float f16 = Float.parseFloat(strSubstring4);
                    if (f15 <= 0.0f || f16 <= 0.0f) {
                        fAbs = i15;
                    } else {
                        fAbs = i17 == 1 ? Math.abs(f16 / f15) : Math.abs(f15 / f16);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i15 = (fAbs > i15 ? 1 : (fAbs == i15 ? 0 : -1));
        if (i15 > 0) {
            this.f131846d0 = fAbs;
            this.f131848e0 = i17;
        }
    }

    public int H() {
        return this.H[0];
    }

    public void H0(int i15) {
        if (this.J) {
            int i16 = i15 - this.f131862l0;
            int i17 = this.f131844c0 + i16;
            this.f131852g0 = i16;
            this.P.t(i16);
            this.R.t(i17);
            this.S.t(i15);
            this.f131871q = true;
        }
    }

    public int I() {
        return this.f131866n0;
    }

    public void I0(int i15, int i16) {
        if (this.f131869p) {
            return;
        }
        this.O.t(i15);
        this.Q.t(i16);
        this.f131850f0 = i15;
        this.f131842b0 = i16 - i15;
        this.f131869p = true;
    }

    public int J() {
        return this.f131864m0;
    }

    public void J0(int i15) {
        this.O.t(i15);
        this.f131850f0 = i15;
    }

    public e K(int i15) {
        d dVar;
        d dVar2;
        if (i15 != 0) {
            if (i15 == 1 && (dVar2 = (dVar = this.R).f131825f) != null && dVar2.f131825f == dVar) {
                return dVar2.f131823d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f131825f;
        if (dVar4 == null || dVar4.f131825f != dVar3) {
            return null;
        }
        return dVar4.f131823d;
    }

    public void K0(int i15) {
        this.P.t(i15);
        this.f131852g0 = i15;
    }

    public e L() {
        return this.f131840a0;
    }

    public void L0(int i15, int i16) {
        if (this.f131871q) {
            return;
        }
        this.P.t(i15);
        this.R.t(i16);
        this.f131852g0 = i15;
        this.f131844c0 = i16 - i15;
        if (this.J) {
            this.S.t(i15 + this.f131862l0);
        }
        this.f131871q = true;
    }

    public e M(int i15) {
        d dVar;
        d dVar2;
        if (i15 != 0) {
            if (i15 == 1 && (dVar2 = (dVar = this.P).f131825f) != null && dVar2.f131825f == dVar) {
                return dVar2.f131823d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f131825f;
        if (dVar4 == null || dVar4.f131825f != dVar3) {
            return null;
        }
        return dVar4.f131823d;
    }

    public void M0(int i15, int i16, int i17, int i18) {
        int i19;
        int i25;
        int i26 = i17 - i15;
        int i27 = i18 - i16;
        this.f131850f0 = i15;
        this.f131852g0 = i16;
        if (this.f131876s0 == 8) {
            this.f131842b0 = 0;
            this.f131844c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i26 < (i25 = this.f131842b0)) {
            i26 = i25;
        }
        if (bVarArr[1] == bVar2 && i27 < (i19 = this.f131844c0)) {
            i27 = i19;
        }
        this.f131842b0 = i26;
        this.f131844c0 = i27;
        int i28 = this.f131866n0;
        if (i27 < i28) {
            this.f131844c0 = i28;
        }
        int i29 = this.f131864m0;
        if (i26 < i29) {
            this.f131842b0 = i29;
        }
        int i35 = this.A;
        if (i35 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f131842b0 = Math.min(this.f131842b0, i35);
        }
        int i36 = this.D;
        if (i36 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f131844c0 = Math.min(this.f131844c0, i36);
        }
        int i37 = this.f131842b0;
        if (i26 != i37) {
            this.f131861l = i37;
        }
        int i38 = this.f131844c0;
        if (i27 != i38) {
            this.f131863m = i38;
        }
    }

    public int N() {
        return Z() + this.f131842b0;
    }

    public void N0(boolean z15) {
        this.J = z15;
    }

    public p O(int i15) {
        if (i15 == 0) {
            return this.f131847e;
        }
        if (i15 == 1) {
            return this.f131849f;
        }
        return null;
    }

    public void O0(int i15) {
        this.f131844c0 = i15;
        int i16 = this.f131866n0;
        if (i15 < i16) {
            this.f131844c0 = i16;
        }
    }

    public void P(StringBuilder sb5) {
        sb5.append("  " + this.f131867o + ":{\n");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("    actualWidth:");
        sb6.append(this.f131842b0);
        sb5.append(sb6.toString());
        sb5.append("\n");
        sb5.append("    actualHeight:" + this.f131844c0);
        sb5.append("\n");
        sb5.append("    actualLeft:" + this.f131850f0);
        sb5.append("\n");
        sb5.append("    actualTop:" + this.f131852g0);
        sb5.append("\n");
        R(sb5, "left", this.O);
        R(sb5, "top", this.P);
        R(sb5, "right", this.Q);
        R(sb5, "bottom", this.R);
        R(sb5, "baseline", this.S);
        R(sb5, "centerX", this.T);
        R(sb5, "centerY", this.U);
        Q(sb5, "    width", this.f131842b0, this.f131864m0, this.H[0], this.f131861l, this.f131889z, this.f131883w, this.B, this.Z[0], this.D0[0]);
        Q(sb5, "    height", this.f131844c0, this.f131866n0, this.H[1], this.f131863m, this.C, this.f131885x, this.E, this.Z[1], this.D0[1]);
        C0(sb5, "    dimensionRatio", this.f131846d0, this.f131848e0);
        z0(sb5, "    horizontalBias", this.f131868o0, K0);
        z0(sb5, "    verticalBias", this.f131870p0, K0);
        A0(sb5, "    horizontalChainStyle", this.f131890z0, 0);
        A0(sb5, "    verticalChainStyle", this.A0, 0);
        sb5.append("  }");
    }

    public void P0(float f15) {
        this.f131868o0 = f15;
    }

    public void Q0(int i15) {
        this.f131890z0 = i15;
    }

    public void R0(int i15, int i16) {
        this.f131850f0 = i15;
        int i17 = i16 - i15;
        this.f131842b0 = i17;
        int i18 = this.f131864m0;
        if (i17 < i18) {
            this.f131842b0 = i18;
        }
    }

    public int S() {
        return a0();
    }

    public void S0(b bVar) {
        this.Z[0] = bVar;
    }

    public float T() {
        return this.f131870p0;
    }

    public void T0(int i15, int i16, int i17, float f15) {
        this.f131883w = i15;
        this.f131889z = i16;
        if (i17 == Integer.MAX_VALUE) {
            i17 = 0;
        }
        this.A = i17;
        this.B = f15;
        if (f15 <= 0.0f || f15 >= 1.0f || i15 != 0) {
            return;
        }
        this.f131883w = 2;
    }

    public int U() {
        return this.A0;
    }

    public void U0(float f15) {
        this.D0[0] = f15;
    }

    public b V() {
        return this.Z[1];
    }

    protected void V0(int i15, boolean z15) {
        this.Y[i15] = z15;
    }

    public int W() {
        int i15 = this.O != null ? this.P.f131826g : 0;
        return this.Q != null ? i15 + this.R.f131826g : i15;
    }

    public void W0(boolean z15) {
        this.K = z15;
    }

    public int X() {
        return this.f131876s0;
    }

    public void X0(boolean z15) {
        this.L = z15;
    }

    public int Y() {
        if (this.f131876s0 == 8) {
            return 0;
        }
        return this.f131842b0;
    }

    public void Y0(int i15, int i16) {
        this.M = i15;
        this.N = i16;
        b1(false);
    }

    public int Z() {
        e eVar = this.f131840a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f131850f0 : ((f) eVar).S0 + this.f131850f0;
    }

    public void Z0(int i15) {
        this.H[1] = i15;
    }

    public int a0() {
        e eVar = this.f131840a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f131852g0 : ((f) eVar).T0 + this.f131852g0;
    }

    public void a1(int i15) {
        this.H[0] = i15;
    }

    public boolean b0() {
        return this.J;
    }

    public void b1(boolean z15) {
        this.f131855i = z15;
    }

    public boolean c0(int i15) {
        if (i15 == 0) {
            return (this.O.f131825f != null ? 1 : 0) + (this.Q.f131825f != null ? 1 : 0) < 2;
        }
        return ((this.P.f131825f != null ? 1 : 0) + (this.R.f131825f != null ? 1 : 0)) + (this.S.f131825f != null ? 1 : 0) < 2;
    }

    public void c1(int i15) {
        if (i15 < 0) {
            this.f131866n0 = 0;
        } else {
            this.f131866n0 = i15;
        }
    }

    public boolean d0() {
        int size = this.X.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (this.X.get(i15).m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(int i15) {
        if (i15 < 0) {
            this.f131864m0 = 0;
        } else {
            this.f131864m0 = i15;
        }
    }

    public void e(f fVar, g5.d dVar, HashSet<e> hashSet, int i15, boolean z15) {
        if (z15) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.Y1(64));
        }
        if (i15 == 0) {
            HashSet<d> hashSetD = this.O.d();
            if (hashSetD != null) {
                Iterator<d> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().f131823d.e(fVar, dVar, hashSet, i15, true);
                }
            }
            HashSet<d> hashSetD2 = this.Q.d();
            if (hashSetD2 != null) {
                Iterator<d> it4 = hashSetD2.iterator();
                while (it4.hasNext()) {
                    it4.next().f131823d.e(fVar, dVar, hashSet, i15, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetD3 = this.P.d();
        if (hashSetD3 != null) {
            Iterator<d> it5 = hashSetD3.iterator();
            while (it5.hasNext()) {
                it5.next().f131823d.e(fVar, dVar, hashSet, i15, true);
            }
        }
        HashSet<d> hashSetD4 = this.R.d();
        if (hashSetD4 != null) {
            Iterator<d> it6 = hashSetD4.iterator();
            while (it6.hasNext()) {
                it6.next().f131823d.e(fVar, dVar, hashSet, i15, true);
            }
        }
        HashSet<d> hashSetD5 = this.S.d();
        if (hashSetD5 != null) {
            Iterator<d> it7 = hashSetD5.iterator();
            while (it7.hasNext()) {
                it7.next().f131823d.e(fVar, dVar, hashSet, i15, true);
            }
        }
    }

    public boolean e0() {
        return (this.f131861l == -1 && this.f131863m == -1) ? false : true;
    }

    public void e1(int i15, int i16) {
        this.f131850f0 = i15;
        this.f131852g0 = i16;
    }

    boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public boolean f0(int i15, int i16) {
        d dVar;
        d dVar2;
        if (i15 == 0) {
            d dVar3 = this.O.f131825f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.Q.f131825f) != null && dVar2.n() && (this.Q.f131825f.e() - this.Q.f()) - (this.O.f131825f.e() + this.O.f()) >= i16;
        }
        d dVar4 = this.P.f131825f;
        if (dVar4 != null && dVar4.n() && (dVar = this.R.f131825f) != null && dVar.n() && (this.R.f131825f.e() - this.R.f()) - (this.P.f131825f.e() + this.P.f()) >= i16) {
            return true;
        }
        return false;
    }

    public void f1(e eVar) {
        this.f131840a0 = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x030b  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:264:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0460  */
    /* JADX WARN: Code duplicated, block: B:304:0x0537  */
    /* JADX WARN: Code duplicated, block: B:306:0x053e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0545  */
    /* JADX WARN: Code duplicated, block: B:309:0x0554  */
    /* JADX WARN: Code duplicated, block: B:310:0x0557  */
    /* JADX WARN: Code duplicated, block: B:313:0x056f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(g5.d dVar, boolean z15) {
        boolean z16;
        boolean z17;
        e eVar;
        e eVar2;
        boolean z18;
        boolean z19;
        int i15;
        g5.i iVar;
        int i16;
        int i17;
        boolean z25;
        int i18;
        boolean z26;
        b bVar;
        b bVar2;
        boolean z27;
        int i19;
        int i25;
        boolean z28;
        g5.i iVar2;
        g5.i iVar3;
        g5.i iVar4;
        int i26;
        int i27;
        char c15;
        int i28;
        int i29;
        g5.d dVar2;
        boolean z29;
        n nVar;
        o5.l lVar;
        int i35;
        int i36;
        boolean zK0;
        boolean zM0;
        o5.l lVar2;
        n nVar2;
        g5.d dVar3 = dVar;
        g5.i iVarQ = dVar3.q(this.O);
        g5.i iVarQ2 = dVar3.q(this.Q);
        g5.i iVarQ3 = dVar3.q(this.P);
        g5.i iVarQ4 = dVar3.q(this.R);
        g5.i iVarQ5 = dVar3.q(this.S);
        e eVar3 = this.f131840a0;
        if (eVar3 == null) {
            z16 = false;
            z17 = false;
        } else {
            z17 = eVar3 != null && eVar3.Z[0] == b.WRAP_CONTENT;
            z16 = eVar3 != null && eVar3.Z[1] == b.WRAP_CONTENT;
            int i37 = this.f131881v;
            if (i37 == 1) {
                z16 = false;
            } else if (i37 == 2) {
                z17 = false;
            } else if (i37 == 3) {
                z16 = false;
                z17 = false;
            }
        }
        if (this.f131876s0 == 8 && !this.f131878t0 && !d0()) {
            boolean[] zArr = this.Y;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z35 = this.f131869p;
        if (z35 || this.f131871q) {
            if (z35) {
                dVar3.f(iVarQ, this.f131850f0);
                dVar3.f(iVarQ2, this.f131850f0 + this.f131842b0);
                if (z17 && (eVar2 = this.f131840a0) != null) {
                    if (this.f131859k) {
                        f fVar = (f) eVar2;
                        fVar.D1(this.O);
                        fVar.C1(this.Q);
                    } else {
                        dVar3.h(dVar3.q(eVar2.Q), iVarQ2, 0, 5);
                    }
                }
            }
            if (this.f131871q) {
                dVar3.f(iVarQ3, this.f131852g0);
                dVar3.f(iVarQ4, this.f131852g0 + this.f131844c0);
                if (this.S.m()) {
                    dVar3.f(iVarQ5, this.f131852g0 + this.f131862l0);
                }
                if (z16 && (eVar = this.f131840a0) != null) {
                    if (this.f131859k) {
                        f fVar2 = (f) eVar;
                        fVar2.I1(this.P);
                        fVar2.H1(this.R);
                    } else {
                        dVar3.h(dVar3.q(eVar.R), iVarQ4, 0, 5);
                    }
                }
            }
            if (this.f131869p && this.f131871q) {
                this.f131869p = false;
                this.f131871q = false;
                return;
            }
        }
        boolean z36 = g5.d.f70636s;
        if (z15 && (lVar2 = this.f131847e) != null && (nVar2 = this.f131849f) != null) {
            o5.f fVar3 = lVar2.f142448h;
            if (fVar3.f142398j && lVar2.f142449i.f142398j && nVar2.f142448h.f142398j && nVar2.f142449i.f142398j) {
                dVar3.f(iVarQ, fVar3.f142395g);
                dVar3.f(iVarQ2, this.f131847e.f142449i.f142395g);
                dVar3.f(iVarQ3, this.f131849f.f142448h.f142395g);
                dVar3.f(iVarQ4, this.f131849f.f142449i.f142395g);
                dVar3.f(iVarQ5, this.f131849f.f142424k.f142395g);
                if (this.f131840a0 != null) {
                    if (z17 && this.f131851g[0] && !k0()) {
                        dVar3.h(dVar3.q(this.f131840a0.Q), iVarQ2, 0, 8);
                    }
                    if (z16 && this.f131851g[1] && !m0()) {
                        dVar3.h(dVar3.q(this.f131840a0.R), iVarQ4, 0, 8);
                    }
                }
                this.f131869p = false;
                this.f131871q = false;
                return;
            }
        }
        if (this.f131840a0 != null) {
            if (h0(0)) {
                ((f) this.f131840a0).z1(this, 0);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (h0(1)) {
                ((f) this.f131840a0).z1(this, 1);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (!zK0 && z17 && this.f131876s0 != 8 && this.O.f131825f == null && this.Q.f131825f == null) {
                dVar3.h(dVar3.q(this.f131840a0.Q), iVarQ2, 0, 1);
            }
            if (!zM0 && z16 && this.f131876s0 != 8 && this.P.f131825f == null && this.R.f131825f == null && this.S == null) {
                dVar3.h(dVar3.q(this.f131840a0.R), iVarQ4, 0, 1);
            }
            z18 = zK0;
            z19 = zM0;
        } else {
            z18 = false;
            z19 = false;
        }
        int i38 = this.f131842b0;
        int i39 = this.f131864m0;
        if (i38 >= i39) {
            i39 = i38;
        }
        int i45 = this.f131844c0;
        int i46 = this.f131866n0;
        if (i45 >= i46) {
            i46 = i45;
        }
        b[] bVarArr = this.Z;
        b bVar3 = bVarArr[0];
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z37 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z38 = bVar5 != bVar4;
        int i47 = this.f131848e0;
        this.F = i47;
        int i48 = i39;
        float f15 = this.f131846d0;
        this.G = f15;
        int i49 = this.f131883w;
        int i55 = this.f131885x;
        if (f15 > 0.0f) {
            i15 = i46;
            if (this.f131876s0 != 8) {
                i16 = (bVar3 == bVar4 && i49 == 0) ? 3 : i49;
                int i56 = (bVar5 == bVar4 && i55 == 0) ? 3 : i55;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    iVar = iVarQ2;
                    i36 = 3;
                    if (i16 == 3 && i56 == 3) {
                        r1(z17, z16, z37, z38);
                    }
                    i17 = i56;
                    z25 = true;
                    int[] iArr = this.f131887y;
                    iArr[0] = i16;
                    iArr[1] = i17;
                    this.f131853h = z25;
                    if (z25) {
                        int i57 = this.F;
                        i18 = -1;
                        boolean z39 = i57 != 0 || i57 == -1;
                        if (z25 || !((i35 = this.F) == 1 || i35 == i18)) {
                            z26 = false;
                        } else {
                            z26 = true;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof f)) {
                            z27 = false;
                        } else {
                            z27 = true;
                        }
                        if (z27) {
                            i19 = 0;
                        } else {
                            i19 = i48;
                        }
                        boolean z45 = !this.V.o();
                        boolean[] zArr2 = this.Y;
                        boolean z46 = zArr2[0];
                        boolean z47 = zArr2[1];
                        if (this.f131877t != 2 || this.f131869p) {
                            i25 = i16;
                            z28 = z17;
                        } else {
                            if (z15 && (lVar = this.f131847e) != null) {
                                o5.f fVar4 = lVar.f142448h;
                                if (fVar4.f142398j && lVar.f142449i.f142398j) {
                                    if (z15) {
                                        dVar3.f(iVarQ, fVar4.f142395g);
                                        g5.i iVar5 = iVar;
                                        dVar3.f(iVar5, this.f131847e.f142449i.f142395g);
                                        if (this.f131840a0 != null && z17 && this.f131851g[0] && !k0()) {
                                            dVar3.h(dVar3.q(this.f131840a0.Q), iVar5, 0, 8);
                                        }
                                        iVar = iVar5;
                                    }
                                    i25 = i16;
                                    z28 = z17;
                                }
                            }
                            g5.i iVar6 = iVar;
                            e eVar4 = this.f131840a0;
                            g5.i iVarQ6 = eVar4 != null ? dVar3.q(eVar4.Q) : null;
                            e eVar5 = this.f131840a0;
                            g5.i iVarQ7 = eVar5 != null ? dVar3.q(eVar5.O) : null;
                            boolean z48 = this.f131851g[0];
                            b[] bVarArr2 = this.Z;
                            iVar = iVar6;
                            b bVar6 = bVarArr2[0];
                            d dVar4 = this.O;
                            g5.i iVar7 = iVarQ7;
                            d dVar5 = this.Q;
                            z25 = z25;
                            z28 = z17;
                            int i58 = this.f131850f0;
                            int i59 = this.f131864m0;
                            int i65 = this.H[0];
                            float f16 = this.f131868o0;
                            boolean z49 = bVarArr2[1] == bVar4;
                            iVarQ = iVarQ;
                            boolean z55 = z16;
                            g5.i iVar8 = iVarQ6;
                            z16 = z55;
                            i25 = i16;
                            bVar2 = bVar2;
                            dVar3 = dVar;
                            i(dVar3, true, z28, z16, z48, iVar7, iVar8, bVar6, z27, dVar4, dVar5, i58, i19, i59, i65, f16, z39, z49, z18, z19, z46, i25, i17, this.f131889z, this.A, this.B, z45);
                        }
                        if (z15 || (nVar = this.f131849f) == null) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i26 = 0;
                            i27 = 8;
                            c15 = 1;
                            i28 = 1;
                        } else {
                            o5.f fVar5 = nVar.f142448h;
                            if (fVar5.f142398j && nVar.f142449i.f142398j) {
                                int i66 = fVar5.f142395g;
                                iVar2 = iVarQ3;
                                dVar3.f(iVar2, i66);
                                iVar3 = iVarQ4;
                                dVar3.f(iVar3, this.f131849f.f142449i.f142395g);
                                iVar4 = iVarQ5;
                                dVar3.f(iVar4, this.f131849f.f142424k.f142395g);
                                e eVar6 = this.f131840a0;
                                if (eVar6 == null || z19 || !z16) {
                                    i26 = 0;
                                    i27 = 8;
                                    c15 = 1;
                                } else {
                                    c15 = 1;
                                    if (this.f131851g[1]) {
                                        i26 = 0;
                                        i27 = 8;
                                        dVar3.h(dVar3.q(eVar6.R), iVar3, 0, 8);
                                    } else {
                                        i26 = 0;
                                        i27 = 8;
                                    }
                                }
                                i28 = i26;
                            } else {
                                iVar2 = r24;
                                iVar3 = r25;
                                iVar4 = r26;
                                i26 = 0;
                                i27 = 8;
                                c15 = 1;
                                i28 = 1;
                            }
                        }
                        if (this.f131879u == 2) {
                            i29 = i26;
                        } else {
                            i29 = i28;
                        }
                        if (i29 == 0 && !this.f131871q) {
                            boolean z56 = (this.Z[c15] == bVar2 && (this instanceof f)) ? c15 : i26;
                            int i67 = z56 != 0 ? i26 : i15;
                            e eVar7 = this.f131840a0;
                            g5.i iVarQ8 = eVar7 != null ? dVar3.q(eVar7.R) : null;
                            e eVar8 = this.f131840a0;
                            g5.i iVarQ9 = eVar8 != null ? dVar3.q(eVar8.P) : null;
                            if (this.f131862l0 > 0 || this.f131876s0 == i27) {
                                z29 = z45;
                                d dVar6 = this.S;
                                if (dVar6.f131825f != null) {
                                    dVar3.e(iVar4, iVar2, p(), i27);
                                    dVar3.e(iVar4, dVar3.q(this.S.f131825f), this.S.f(), i27);
                                    if (z16) {
                                        dVar3.h(iVarQ8, dVar3.q(this.R), i26, 5);
                                    }
                                    z29 = i26;
                                } else if (this.f131876s0 == i27) {
                                    dVar3.e(iVar4, iVar2, dVar6.f(), i27);
                                    z29 = z45;
                                } else {
                                    dVar3.e(iVar4, iVar2, p(), i27);
                                    z29 = z45;
                                }
                            }
                            z29 = z45;
                            boolean z57 = this.f131851g[c15];
                            b[] bVarArr3 = this.Z;
                            int i68 = i26;
                            i(dVar, false, z16, z28, z57, iVarQ9, iVarQ8, bVarArr3[c15], z56, this.P, this.R, this.f131852g0, i67, this.f131866n0, this.H[c15], this.f131870p0, z26, bVarArr3[i68] == bVar4 ? c15 : i68, z19, z18, z47, i17, i25, this.C, this.D, this.E, z29);
                        }
                        if (!z25) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f131869p = false;
                        this.f131871q = false;
                    }
                    i18 = -1;
                    if (z25) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        i19 = 0;
                    } else {
                        i19 = i48;
                    }
                    boolean z410 = !this.V.o();
                    boolean[] zArr3 = this.Y;
                    boolean z411 = zArr3[0];
                    boolean z412 = zArr3[1];
                    if (this.f131877t != 2) {
                        i25 = i16;
                        z28 = z17;
                    } else {
                        i25 = i16;
                        z28 = z17;
                    }
                    if (z15) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    }
                    if (this.f131879u == 2) {
                        i29 = i26;
                    } else {
                        i29 = i28;
                    }
                    if (i29 == 0) {
                    }
                    if (!z25) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f131869p = false;
                    this.f131871q = false;
                }
                iVar = iVarQ2;
                i36 = 3;
                if (bVar3 == bVar4 && i16 == i36) {
                    this.F = 0;
                    i48 = (int) (i45 * f15);
                    if (bVar5 != bVar4) {
                        i16 = 4;
                        i17 = i56;
                    } else {
                        i17 = i56;
                        z25 = true;
                    }
                    int[] iArr2 = this.f131887y;
                    iArr2[0] = i16;
                    iArr2[1] = i17;
                    this.f131853h = z25;
                    if (z25) {
                        int i510 = this.F;
                        i18 = -1;
                        if (i510 != 0) {
                        }
                        if (z25) {
                            z26 = false;
                        } else {
                            z26 = false;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        if (z27) {
                            i19 = 0;
                        } else {
                            i19 = i48;
                        }
                        boolean z413 = !this.V.o();
                        boolean[] zArr4 = this.Y;
                        boolean z414 = zArr4[0];
                        boolean z415 = zArr4[1];
                        if (this.f131877t != 2) {
                            i25 = i16;
                            z28 = z17;
                        } else {
                            i25 = i16;
                            z28 = z17;
                        }
                        if (z15) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i26 = 0;
                            i27 = 8;
                            c15 = 1;
                            i28 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i26 = 0;
                            i27 = 8;
                            c15 = 1;
                            i28 = 1;
                        }
                        if (this.f131879u == 2) {
                            i29 = i26;
                        } else {
                            i29 = i28;
                        }
                        if (i29 == 0) {
                        }
                        if (!z25) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f131869p = false;
                        this.f131871q = false;
                    }
                    i18 = -1;
                    if (z25) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        i19 = 0;
                    } else {
                        i19 = i48;
                    }
                    boolean z416 = !this.V.o();
                    boolean[] zArr5 = this.Y;
                    boolean z417 = zArr5[0];
                    boolean z418 = zArr5[1];
                    if (this.f131877t != 2) {
                        i25 = i16;
                        z28 = z17;
                    } else {
                        i25 = i16;
                        z28 = z17;
                    }
                    if (z15) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    }
                    if (this.f131879u == 2) {
                        i29 = i26;
                    } else {
                        i29 = i28;
                    }
                    if (i29 == 0) {
                    }
                    if (!z25) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f131869p = false;
                    this.f131871q = false;
                }
                if (bVar5 == bVar4 && i56 == i36) {
                    this.F = 1;
                    if (i47 == -1) {
                        this.G = 1.0f / f15;
                    }
                    i15 = (int) (this.G * i38);
                    if (bVar3 != bVar4) {
                        i17 = 4;
                    }
                    int[] iArr3 = this.f131887y;
                    iArr3[0] = i16;
                    iArr3[1] = i17;
                    this.f131853h = z25;
                    if (z25) {
                        int i511 = this.F;
                        i18 = -1;
                        if (i511 != 0) {
                        }
                        if (z25) {
                            z26 = false;
                        } else {
                            z26 = false;
                        }
                        bVar = this.Z[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z27 = false;
                        } else {
                            z27 = false;
                        }
                        if (z27) {
                            i19 = 0;
                        } else {
                            i19 = i48;
                        }
                        boolean z419 = !this.V.o();
                        boolean[] zArr6 = this.Y;
                        boolean z4110 = zArr6[0];
                        boolean z4111 = zArr6[1];
                        if (this.f131877t != 2) {
                            i25 = i16;
                            z28 = z17;
                        } else {
                            i25 = i16;
                            z28 = z17;
                        }
                        if (z15) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i26 = 0;
                            i27 = 8;
                            c15 = 1;
                            i28 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i26 = 0;
                            i27 = 8;
                            c15 = 1;
                            i28 = 1;
                        }
                        if (this.f131879u == 2) {
                            i29 = i26;
                        } else {
                            i29 = i28;
                        }
                        if (i29 == 0) {
                        }
                        if (!z25) {
                            dVar2 = dVar;
                        } else if (this.F == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                            dVar2 = dVar;
                        }
                        if (this.V.o()) {
                            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                        }
                        this.f131869p = false;
                        this.f131871q = false;
                    }
                    i18 = -1;
                    if (z25) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        i19 = 0;
                    } else {
                        i19 = i48;
                    }
                    boolean z4112 = !this.V.o();
                    boolean[] zArr7 = this.Y;
                    boolean z4113 = zArr7[0];
                    boolean z4114 = zArr7[1];
                    if (this.f131877t != 2) {
                        i25 = i16;
                        z28 = z17;
                    } else {
                        i25 = i16;
                        z28 = z17;
                    }
                    if (z15) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    }
                    if (this.f131879u == 2) {
                        i29 = i26;
                    } else {
                        i29 = i28;
                    }
                    if (i29 == 0) {
                    }
                    if (!z25) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f131869p = false;
                    this.f131871q = false;
                }
                i17 = i56;
                z25 = true;
                int[] iArr4 = this.f131887y;
                iArr4[0] = i16;
                iArr4[1] = i17;
                this.f131853h = z25;
                if (z25) {
                    int i512 = this.F;
                    i18 = -1;
                    if (i512 != 0) {
                    }
                    if (z25) {
                        z26 = false;
                    } else {
                        z26 = false;
                    }
                    bVar = this.Z[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z27 = false;
                    } else {
                        z27 = false;
                    }
                    if (z27) {
                        i19 = 0;
                    } else {
                        i19 = i48;
                    }
                    boolean z4115 = !this.V.o();
                    boolean[] zArr8 = this.Y;
                    boolean z4116 = zArr8[0];
                    boolean z4117 = zArr8[1];
                    if (this.f131877t != 2) {
                        i25 = i16;
                        z28 = z17;
                    } else {
                        i25 = i16;
                        z28 = z17;
                    }
                    if (z15) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i26 = 0;
                        i27 = 8;
                        c15 = 1;
                        i28 = 1;
                    }
                    if (this.f131879u == 2) {
                        i29 = i26;
                    } else {
                        i29 = i28;
                    }
                    if (i29 == 0) {
                    }
                    if (!z25) {
                        dVar2 = dVar;
                    } else if (this.F == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                        dVar2 = dVar;
                    }
                    if (this.V.o()) {
                        dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                    }
                    this.f131869p = false;
                    this.f131871q = false;
                }
                i18 = -1;
                if (z25) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                bVar = this.Z[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (z27) {
                    i19 = 0;
                } else {
                    i19 = i48;
                }
                boolean z4118 = !this.V.o();
                boolean[] zArr9 = this.Y;
                boolean z4119 = zArr9[0];
                boolean z41110 = zArr9[1];
                if (this.f131877t != 2) {
                    i25 = i16;
                    z28 = z17;
                } else {
                    i25 = i16;
                    z28 = z17;
                }
                if (z15) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i26 = 0;
                    i27 = 8;
                    c15 = 1;
                    i28 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i26 = 0;
                    i27 = 8;
                    c15 = 1;
                    i28 = 1;
                }
                if (this.f131879u == 2) {
                    i29 = i26;
                } else {
                    i29 = i28;
                }
                if (i29 == 0) {
                }
                if (!z25) {
                    dVar2 = dVar;
                } else if (this.F == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                    dVar2 = dVar;
                }
                if (this.V.o()) {
                    dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                }
                this.f131869p = false;
                this.f131871q = false;
            }
            z25 = false;
            int[] iArr5 = this.f131887y;
            iArr5[0] = i16;
            iArr5[1] = i17;
            this.f131853h = z25;
            if (z25) {
                int i513 = this.F;
                i18 = -1;
                if (i513 != 0) {
                }
                if (z25) {
                    z26 = false;
                } else {
                    z26 = false;
                }
                bVar = this.Z[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                if (z27) {
                    i19 = 0;
                } else {
                    i19 = i48;
                }
                boolean z41111 = !this.V.o();
                boolean[] zArr10 = this.Y;
                boolean z41112 = zArr10[0];
                boolean z41113 = zArr10[1];
                if (this.f131877t != 2) {
                    i25 = i16;
                    z28 = z17;
                } else {
                    i25 = i16;
                    z28 = z17;
                }
                if (z15) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i26 = 0;
                    i27 = 8;
                    c15 = 1;
                    i28 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i26 = 0;
                    i27 = 8;
                    c15 = 1;
                    i28 = 1;
                }
                if (this.f131879u == 2) {
                    i29 = i26;
                } else {
                    i29 = i28;
                }
                if (i29 == 0) {
                }
                if (!z25) {
                    dVar2 = dVar;
                } else if (this.F == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                    dVar2 = dVar;
                }
                if (this.V.o()) {
                    dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
                }
                this.f131869p = false;
                this.f131871q = false;
            }
            i18 = -1;
            if (z25) {
                z26 = false;
            } else {
                z26 = false;
            }
            bVar = this.Z[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z27 = false;
            } else {
                z27 = false;
            }
            if (z27) {
                i19 = 0;
            } else {
                i19 = i48;
            }
            boolean z41114 = !this.V.o();
            boolean[] zArr11 = this.Y;
            boolean z41115 = zArr11[0];
            boolean z41116 = zArr11[1];
            if (this.f131877t != 2) {
                i25 = i16;
                z28 = z17;
            } else {
                i25 = i16;
                z28 = z17;
            }
            if (z15) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i26 = 0;
                i27 = 8;
                c15 = 1;
                i28 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i26 = 0;
                i27 = 8;
                c15 = 1;
                i28 = 1;
            }
            if (this.f131879u == 2) {
                i29 = i26;
            } else {
                i29 = i28;
            }
            if (i29 == 0) {
            }
            if (!z25) {
                dVar2 = dVar;
            } else if (this.F == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                dVar2 = dVar;
            }
            if (this.V.o()) {
                dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
            }
            this.f131869p = false;
            this.f131871q = false;
        }
        i15 = i46;
        iVar = iVarQ2;
        i16 = i49;
        i17 = i55;
        z25 = false;
        int[] iArr6 = this.f131887y;
        iArr6[0] = i16;
        iArr6[1] = i17;
        this.f131853h = z25;
        if (z25) {
            int i514 = this.F;
            i18 = -1;
            if (i514 != 0) {
            }
            if (z25) {
                z26 = false;
            } else {
                z26 = false;
            }
            bVar = this.Z[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z27 = false;
            } else {
                z27 = false;
            }
            if (z27) {
                i19 = 0;
            } else {
                i19 = i48;
            }
            boolean z41117 = !this.V.o();
            boolean[] zArr12 = this.Y;
            boolean z41118 = zArr12[0];
            boolean z41119 = zArr12[1];
            if (this.f131877t != 2) {
                i25 = i16;
                z28 = z17;
            } else {
                i25 = i16;
                z28 = z17;
            }
            if (z15) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i26 = 0;
                i27 = 8;
                c15 = 1;
                i28 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i26 = 0;
                i27 = 8;
                c15 = 1;
                i28 = 1;
            }
            if (this.f131879u == 2) {
                i29 = i26;
            } else {
                i29 = i28;
            }
            if (i29 == 0) {
            }
            if (!z25) {
                dVar2 = dVar;
            } else if (this.F == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
                dVar2 = dVar;
            }
            if (this.V.o()) {
                dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
            }
            this.f131869p = false;
            this.f131871q = false;
        }
        i18 = -1;
        if (z25) {
            z26 = false;
        } else {
            z26 = false;
        }
        bVar = this.Z[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z27 = false;
        } else {
            z27 = false;
        }
        if (z27) {
            i19 = 0;
        } else {
            i19 = i48;
        }
        boolean z411110 = !this.V.o();
        boolean[] zArr13 = this.Y;
        boolean z411111 = zArr13[0];
        boolean z411112 = zArr13[1];
        if (this.f131877t != 2) {
            i25 = i16;
            z28 = z17;
        } else {
            i25 = i16;
            z28 = z17;
        }
        if (z15) {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i26 = 0;
            i27 = 8;
            c15 = 1;
            i28 = 1;
        } else {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i26 = 0;
            i27 = 8;
            c15 = 1;
            i28 = 1;
        }
        if (this.f131879u == 2) {
            i29 = i26;
        } else {
            i29 = i28;
        }
        if (i29 == 0) {
        }
        if (!z25) {
            dVar2 = dVar;
        } else if (this.F == 1) {
            dVar.k(iVar3, iVar2, iVar, iVarQ, this.G, 8);
            dVar2 = dVar;
        } else {
            dVar.k(iVar, iVarQ, iVar3, iVar2, this.G, 8);
            dVar2 = dVar;
        }
        if (this.V.o()) {
            dVar2.b(this, this.V.j().h(), (float) Math.toRadians(this.I + 90.0f), this.V.f());
        }
        this.f131869p = false;
        this.f131871q = false;
    }

    public void g0(d.a aVar, e eVar, d.a aVar2, int i15, int i16) {
        o(aVar).b(eVar.o(aVar2), i15, i16, true);
    }

    public void g1(float f15) {
        this.f131870p0 = f15;
    }

    public boolean h() {
        return this.f131876s0 != 8;
    }

    public void h1(int i15) {
        this.A0 = i15;
    }

    public boolean i0() {
        return this.f131873r;
    }

    public void i1(int i15, int i16) {
        this.f131852g0 = i15;
        int i17 = i16 - i15;
        this.f131844c0 = i17;
        int i18 = this.f131866n0;
        if (i17 < i18) {
            this.f131844c0 = i18;
        }
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i15) {
        d.a aVar3;
        d.a aVar4;
        boolean z15;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarO = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarO2 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarO3 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarO4 = o(aVar11);
            boolean z16 = true;
            if ((dVarO == null || !dVarO.o()) && (dVarO2 == null || !dVarO2.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z15 = true;
            } else {
                z15 = false;
            }
            if ((dVarO3 == null || !dVarO3.o()) && (dVarO4 == null || !dVarO4.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z16 = false;
            }
            if (z15 && z16) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z15) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z16) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarO5 = o(aVar4);
            d dVarO6 = eVar.o(aVar2);
            d dVarO7 = o(d.a.RIGHT);
            dVarO5.a(dVarO6, 0);
            dVarO7.a(dVarO6, 0);
            o(aVar14).a(dVarO6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarO8 = eVar.o(aVar2);
            o(aVar3).a(dVarO8, 0);
            o(d.a.BOTTOM).a(dVarO8, 0);
            o(aVar15).a(dVarO8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d dVarO9 = o(aVar);
        d dVarO10 = eVar.o(aVar2);
        if (dVarO9.p(dVarO10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarO11 = o(d.a.TOP);
                d dVarO12 = o(d.a.BOTTOM);
                if (dVarO11 != null) {
                    dVarO11.q();
                }
                if (dVarO12 != null) {
                    dVarO12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarO13 = o(aVar20);
                if (dVarO13 != null) {
                    dVarO13.q();
                }
                d dVarO14 = o(aVar5);
                if (dVarO14.j() != dVarO10) {
                    dVarO14.q();
                }
                d dVarG = o(aVar).g();
                d dVarO15 = o(aVar15);
                if (dVarO15.o()) {
                    dVarG.q();
                    dVarO15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarO16 = o(aVar5);
                if (dVarO16.j() != dVarO10) {
                    dVarO16.q();
                }
                d dVarG2 = o(aVar).g();
                d dVarO17 = o(aVar14);
                if (dVarO17.o()) {
                    dVarG2.q();
                    dVarO17.q();
                }
            }
            dVarO9.a(dVarO10, i15);
        }
    }

    public boolean j0(int i15) {
        return this.Y[i15];
    }

    public void j1(b bVar) {
        this.Z[1] = bVar;
    }

    public void k(d dVar, d dVar2, int i15) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i15);
        }
    }

    public boolean k0() {
        d dVar = this.O;
        d dVar2 = dVar.f131825f;
        if (dVar2 != null && dVar2.f131825f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f131825f;
        return dVar4 != null && dVar4.f131825f == dVar3;
    }

    public void k1(int i15, int i16, int i17, float f15) {
        this.f131885x = i15;
        this.C = i16;
        if (i17 == Integer.MAX_VALUE) {
            i17 = 0;
        }
        this.D = i17;
        this.E = f15;
        if (f15 <= 0.0f || f15 >= 1.0f || i15 != 0) {
            return;
        }
        this.f131885x = 2;
    }

    public void l(e eVar, float f15, int i15) {
        d.a aVar = d.a.CENTER;
        g0(aVar, eVar, aVar, i15, 0);
        this.I = f15;
    }

    public boolean l0() {
        return this.K;
    }

    public void l1(float f15) {
        this.D0[1] = f15;
    }

    public void m(g5.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f131862l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        d dVar = this.P;
        d dVar2 = dVar.f131825f;
        if (dVar2 != null && dVar2.f131825f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f131825f;
        return dVar4 != null && dVar4.f131825f == dVar3;
    }

    public void m1(int i15) {
        this.f131876s0 = i15;
    }

    public void n() {
        if (this.f131847e == null) {
            this.f131847e = new o5.l(this);
        }
        if (this.f131849f == null) {
            this.f131849f = new n(this);
        }
    }

    public boolean n0() {
        return this.L;
    }

    public void n1(int i15) {
        this.f131842b0 = i15;
        int i16 = this.f131864m0;
        if (i15 < i16) {
            this.f131842b0 = i16;
        }
    }

    public d o(d.a aVar) {
        switch (a.f131891a[aVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        return this.f131855i && this.f131876s0 != 8;
    }

    public void o1(int i15) {
        if (i15 < 0 || i15 > 3) {
            return;
        }
        this.f131881v = i15;
    }

    public int p() {
        return this.f131862l0;
    }

    public boolean p0() {
        if (this.f131869p) {
            return true;
        }
        return this.O.n() && this.Q.n();
    }

    public void p1(int i15) {
        this.f131850f0 = i15;
    }

    public float q(int i15) {
        if (i15 == 0) {
            return this.f131868o0;
        }
        if (i15 == 1) {
            return this.f131870p0;
        }
        return -1.0f;
    }

    public boolean q0() {
        if (this.f131871q) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void q1(int i15) {
        this.f131852g0 = i15;
    }

    public int r() {
        return a0() + this.f131844c0;
    }

    public boolean r0() {
        return this.f131875s;
    }

    public void r1(boolean z15, boolean z16, boolean z17, boolean z18) {
        if (this.F == -1) {
            if (z17 && !z18) {
                this.F = 0;
            } else if (!z17 && z18) {
                this.F = 1;
                if (this.f131848e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i15 = this.f131889z;
            if (i15 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i15 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public Object s() {
        return this.f131872q0;
    }

    public void s0() {
        this.f131873r = true;
    }

    public void s1(boolean z15, boolean z16) {
        int i15;
        int i16;
        boolean zK = z15 & this.f131847e.k();
        boolean zK2 = z16 & this.f131849f.k();
        o5.l lVar = this.f131847e;
        int i17 = lVar.f142448h.f142395g;
        n nVar = this.f131849f;
        int i18 = nVar.f142448h.f142395g;
        int i19 = lVar.f142449i.f142395g;
        int i25 = nVar.f142449i.f142395g;
        int i26 = i25 - i18;
        if (i19 - i17 < 0 || i26 < 0 || i17 == Integer.MIN_VALUE || i17 == Integer.MAX_VALUE || i18 == Integer.MIN_VALUE || i18 == Integer.MAX_VALUE || i19 == Integer.MIN_VALUE || i19 == Integer.MAX_VALUE || i25 == Integer.MIN_VALUE || i25 == Integer.MAX_VALUE) {
            i19 = 0;
            i17 = 0;
            i25 = 0;
            i18 = 0;
        }
        int i27 = i19 - i17;
        int i28 = i25 - i18;
        if (zK) {
            this.f131850f0 = i17;
        }
        if (zK2) {
            this.f131852g0 = i18;
        }
        if (this.f131876s0 == 8) {
            this.f131842b0 = 0;
            this.f131844c0 = 0;
            return;
        }
        if (zK) {
            if (this.Z[0] == b.FIXED && i27 < (i16 = this.f131842b0)) {
                i27 = i16;
            }
            this.f131842b0 = i27;
            int i29 = this.f131864m0;
            if (i27 < i29) {
                this.f131842b0 = i29;
            }
        }
        if (zK2) {
            if (this.Z[1] == b.FIXED && i28 < (i15 = this.f131844c0)) {
                i28 = i15;
            }
            this.f131844c0 = i28;
            int i35 = this.f131866n0;
            if (i28 < i35) {
                this.f131844c0 = i35;
            }
        }
    }

    public String t() {
        return this.f131880u0;
    }

    public void t0() {
        this.f131875s = true;
    }

    public void t1(g5.d dVar, boolean z15) {
        n nVar;
        o5.l lVar;
        int iY = dVar.y(this.O);
        int iY2 = dVar.y(this.P);
        int iY3 = dVar.y(this.Q);
        int iY4 = dVar.y(this.R);
        if (z15 && (lVar = this.f131847e) != null) {
            o5.f fVar = lVar.f142448h;
            if (fVar.f142398j) {
                o5.f fVar2 = lVar.f142449i;
                if (fVar2.f142398j) {
                    iY = fVar.f142395g;
                    iY3 = fVar2.f142395g;
                }
            }
        }
        if (z15 && (nVar = this.f131849f) != null) {
            o5.f fVar3 = nVar.f142448h;
            if (fVar3.f142398j) {
                o5.f fVar4 = nVar.f142449i;
                if (fVar4.f142398j) {
                    iY2 = fVar3.f142395g;
                    iY4 = fVar4.f142395g;
                }
            }
        }
        int i15 = iY4 - iY2;
        if (iY3 - iY < 0 || i15 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        M0(iY, iY2, iY3, iY4);
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        String str2 = "";
        if (this.f131882v0 != null) {
            str = "type: " + this.f131882v0 + " ";
        } else {
            str = "";
        }
        sb5.append(str);
        if (this.f131880u0 != null) {
            str2 = "id: " + this.f131880u0 + " ";
        }
        sb5.append(str2);
        sb5.append("(");
        sb5.append(this.f131850f0);
        sb5.append(", ");
        sb5.append(this.f131852g0);
        sb5.append(") - (");
        sb5.append(this.f131842b0);
        sb5.append(" x ");
        sb5.append(this.f131844c0);
        sb5.append(")");
        return sb5.toString();
    }

    public b u(int i15) {
        if (i15 == 0) {
            return A();
        }
        if (i15 == 1) {
            return V();
        }
        return null;
    }

    public boolean u0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public float v() {
        return this.f131846d0;
    }

    public void v0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.f131840a0 = null;
        this.I = Float.NaN;
        this.f131842b0 = 0;
        this.f131844c0 = 0;
        this.f131846d0 = 0.0f;
        this.f131848e0 = -1;
        this.f131850f0 = 0;
        this.f131852g0 = 0;
        this.f131858j0 = 0;
        this.f131860k0 = 0;
        this.f131862l0 = 0;
        this.f131864m0 = 0;
        this.f131866n0 = 0;
        float f15 = K0;
        this.f131868o0 = f15;
        this.f131870p0 = f15;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f131872q0 = null;
        this.f131874r0 = 0;
        this.f131876s0 = 0;
        this.f131882v0 = null;
        this.f131884w0 = false;
        this.f131886x0 = false;
        this.f131890z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f131877t = -1;
        this.f131879u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f131883w = 0;
        this.f131885x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f131889z = 0;
        this.C = 0;
        this.f131853h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f131888y0 = false;
        boolean[] zArr = this.f131851g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f131855i = true;
        int[] iArr2 = this.f131887y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f131861l = -1;
        this.f131863m = -1;
    }

    public int w() {
        return this.f131848e0;
    }

    public void w0() {
        e eVarL = L();
        if (eVarL != null && (eVarL instanceof f) && ((f) L()).Q1()) {
            return;
        }
        int size = this.X.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.X.get(i15).q();
        }
    }

    public int x() {
        if (this.f131876s0 == 8) {
            return 0;
        }
        return this.f131844c0;
    }

    public void x0() {
        this.f131869p = false;
        this.f131871q = false;
        this.f131873r = false;
        this.f131875s = false;
        int size = this.X.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.X.get(i15).r();
        }
    }

    public float y() {
        return this.f131868o0;
    }

    public void y0(g5.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int z() {
        return this.f131890z0;
    }

    public e(int i15, int i16, int i17, int i18) {
        this.f131839a = false;
        this.f131841b = new p[2];
        this.f131847e = null;
        this.f131849f = null;
        this.f131851g = new boolean[]{true, true};
        this.f131853h = false;
        this.f131855i = true;
        this.f131857j = false;
        this.f131859k = true;
        this.f131861l = -1;
        this.f131863m = -1;
        this.f131865n = new k5.h(this);
        this.f131869p = false;
        this.f131871q = false;
        this.f131873r = false;
        this.f131875s = false;
        this.f131877t = -1;
        this.f131879u = -1;
        this.f131881v = 0;
        this.f131883w = 0;
        this.f131885x = 0;
        this.f131887y = new int[2];
        this.f131889z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.F = -1;
        this.G = 1.0f;
        this.H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.I = Float.NaN;
        this.J = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new d(this, d.a.LEFT);
        this.P = new d(this, d.a.TOP);
        this.Q = new d(this, d.a.RIGHT);
        this.R = new d(this, d.a.BOTTOM);
        this.S = new d(this, d.a.BASELINE);
        this.T = new d(this, d.a.CENTER_X);
        this.U = new d(this, d.a.CENTER_Y);
        d dVar = new d(this, d.a.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f131840a0 = null;
        this.f131846d0 = 0.0f;
        this.f131848e0 = -1;
        this.f131854h0 = 0;
        this.f131856i0 = 0;
        this.f131858j0 = 0;
        this.f131860k0 = 0;
        this.f131862l0 = 0;
        float f15 = K0;
        this.f131868o0 = f15;
        this.f131870p0 = f15;
        this.f131874r0 = 0;
        this.f131876s0 = 0;
        this.f131878t0 = false;
        this.f131880u0 = null;
        this.f131882v0 = null;
        this.f131888y0 = false;
        this.f131890z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        this.f131850f0 = i15;
        this.f131852g0 = i16;
        this.f131842b0 = i17;
        this.f131844c0 = i18;
        d();
    }

    public e(int i15, int i16) {
        this(0, 0, i15, i16);
    }
}
