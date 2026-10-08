package v9;

import java.util.Arrays;
import java.util.Collections;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f205096m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f205097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.c0 f205099c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f205102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f205103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f205104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f205105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f205106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f205107k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f205100d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f205101e = new a(128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f205108l = -9223372036854775807L;

    private static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f205109f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f205110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f205111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f205112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f205113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f205114e;

        public a(int i15) {
            this.f205114e = new byte[i15];
        }

        public void a(byte[] bArr, int i15, int i16) {
            if (this.f205110a) {
                int i17 = i16 - i15;
                byte[] bArr2 = this.f205114e;
                int length = bArr2.length;
                int i18 = this.f205112c;
                if (length < i18 + i17) {
                    this.f205114e = Arrays.copyOf(bArr2, (i18 + i17) * 2);
                }
                System.arraycopy(bArr, i15, this.f205114e, this.f205112c, i17);
                this.f205112c += i17;
            }
        }

        public boolean b(int i15, int i16) {
            int i17 = this.f205111b;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i15 == 179 || i15 == 181) {
                                this.f205112c -= i16;
                                this.f205110a = false;
                                return true;
                            }
                        } else if ((i15 & 240) != 32) {
                            w7.t.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f205113d = this.f205112c;
                            this.f205111b = 4;
                        }
                    } else if (i15 > 31) {
                        w7.t.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f205111b = 3;
                    }
                } else if (i15 != 181) {
                    w7.t.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f205111b = 2;
                }
            } else if (i15 == 176) {
                this.f205111b = 1;
                this.f205110a = true;
            }
            byte[] bArr = f205109f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f205110a = false;
            this.f205112c = 0;
            this.f205111b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f205115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f205116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f205117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f205118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f205119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f205120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f205121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f205122h;

        public b(s0 s0Var) {
            this.f205115a = s0Var;
        }

        public void a(byte[] bArr, int i15, int i16) {
            if (this.f205117c) {
                int i17 = this.f205120f;
                int i18 = (i15 + 1) - i17;
                if (i18 >= i16) {
                    this.f205120f = i17 + (i16 - i15);
                } else {
                    this.f205118d = ((bArr[i18] & 192) >> 6) == 0;
                    this.f205117c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void b(long j15, int i15, boolean z15) {
            zj.p.w(this.f205122h != -9223372036854775807L);
            if (this.f205119e == 182 && z15 && this.f205116b) {
                this.f205115a.c(this.f205122h, this.f205118d ? 1 : 0, (int) (j15 - this.f205121g), i15, null);
            }
            if (this.f205119e != 179) {
                this.f205121g = j15;
            }
        }

        public void c(int i15, long j15) {
            this.f205119e = i15;
            this.f205118d = false;
            this.f205116b = i15 == 182 || i15 == 179;
            this.f205117c = i15 == 182;
            this.f205120f = 0;
            this.f205122h = j15;
        }

        public void d() {
            this.f205116b = false;
            this.f205117c = false;
            this.f205118d = false;
            this.f205119e = -1;
        }
    }

    o(o0 o0Var, String str) {
        this.f205097a = o0Var;
        this.f205098b = str;
        if (o0Var != null) {
            this.f205102f = new w(178, 128);
            this.f205099c = new w7.c0();
        } else {
            this.f205102f = null;
            this.f205099c = null;
        }
    }

    private static t7.p a(a aVar, int i15, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f205114e, aVar.f205112c);
        w7.b0 b0Var = new w7.b0(bArrCopyOf);
        b0Var.s(i15);
        b0Var.s(4);
        b0Var.q();
        b0Var.r(8);
        if (b0Var.g()) {
            b0Var.r(4);
            b0Var.r(3);
        }
        int iH = b0Var.h(4);
        float f15 = 1.0f;
        if (iH == 15) {
            int iH2 = b0Var.h(8);
            int iH3 = b0Var.h(8);
            if (iH3 == 0) {
                w7.t.h("H263Reader", "Invalid aspect ratio");
            } else {
                f15 = iH2 / iH3;
            }
        } else {
            float[] fArr = f205096m;
            if (iH < fArr.length) {
                f15 = fArr[iH];
            } else {
                w7.t.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (b0Var.g()) {
            b0Var.r(2);
            b0Var.r(1);
            if (b0Var.g()) {
                b0Var.r(15);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
                b0Var.r(3);
                b0Var.r(11);
                b0Var.q();
                b0Var.r(15);
                b0Var.q();
            }
        }
        if (b0Var.h(2) != 0) {
            w7.t.h("H263Reader", "Unhandled video object layer shape");
        }
        b0Var.q();
        int iH4 = b0Var.h(16);
        b0Var.q();
        if (b0Var.g()) {
            if (iH4 == 0) {
                w7.t.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i16 = 0;
                for (int i17 = iH4 - 1; i17 > 0; i17 >>= 1) {
                    i16++;
                }
                b0Var.r(i16);
            }
        }
        b0Var.q();
        int iH5 = b0Var.h(13);
        b0Var.q();
        int iH6 = b0Var.h(13);
        b0Var.q();
        b0Var.q();
        return new t7.p.b().k0(str).X(str2).A0("video/mp4v-es").F0(iH5).i0(iH6).v0(f15).l0(Collections.singletonList(bArrCopyOf)).Q();
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        zj.p.q(this.f205103g);
        zj.p.q(this.f205106j);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f205104h += (long) c0Var.a();
        this.f205106j.a(c0Var, c0Var.a());
        while (true) {
            int iE = x7.g.e(bArrF, iG, iJ, this.f205100d);
            if (iE == iJ) {
                break;
            }
            int i15 = iE + 3;
            int i16 = c0Var.f()[i15] & 255;
            int i17 = iE - iG;
            int i18 = 0;
            if (!this.f205107k) {
                if (i17 > 0) {
                    this.f205101e.a(bArrF, iG, iE);
                }
                if (this.f205101e.b(i16, i17 < 0 ? -i17 : 0)) {
                    s0 s0Var = this.f205106j;
                    a aVar = this.f205101e;
                    s0Var.e(a(aVar, aVar.f205113d, (String) zj.p.q(this.f205105i), this.f205098b));
                    this.f205107k = true;
                }
            }
            this.f205103g.a(bArrF, iG, iE);
            w wVar = this.f205102f;
            if (wVar != null) {
                if (i17 > 0) {
                    wVar.a(bArrF, iG, iE);
                } else {
                    i18 = -i17;
                }
                if (this.f205102f.b(i18)) {
                    w wVar2 = this.f205102f;
                    ((w7.c0) w7.o0.h(this.f205099c)).d0(this.f205102f.f205282d, x7.g.M(wVar2.f205282d, wVar2.f205283e));
                    ((o0) w7.o0.h(this.f205097a)).b(this.f205108l, this.f205099c);
                }
                if (i16 == 178 && c0Var.f()[iE + 2] == 1) {
                    this.f205102f.e(i16);
                }
            }
            int i19 = iJ - iE;
            this.f205103g.b(this.f205104h - ((long) i19), i19, this.f205107k);
            this.f205103g.c(i16, this.f205108l);
            iG = i15;
        }
        if (!this.f205107k) {
            this.f205101e.a(bArrF, iG, iJ);
        }
        this.f205103g.a(bArrF, iG, iJ);
        w wVar3 = this.f205102f;
        if (wVar3 != null) {
            wVar3.a(bArrF, iG, iJ);
        }
    }

    @Override // v9.m
    public void c() {
        x7.g.c(this.f205100d);
        this.f205101e.c();
        b bVar = this.f205103g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f205102f;
        if (wVar != null) {
            wVar.d();
        }
        this.f205104h = 0L;
        this.f205108l = -9223372036854775807L;
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205105i = dVar.b();
        s0 s0VarV = rVar.v(dVar.c(), 2);
        this.f205106j = s0VarV;
        this.f205103g = new b(s0VarV);
        o0 o0Var = this.f205097a;
        if (o0Var != null) {
            o0Var.c(rVar, dVar);
        }
    }

    @Override // v9.m
    public void e(boolean z15) {
        zj.p.q(this.f205103g);
        if (z15) {
            this.f205103g.b(this.f205104h, 0, this.f205107k);
            this.f205103g.d();
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205108l = j15;
    }
}
