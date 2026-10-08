package v9;

import java.util.Collections;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f205178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f205179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f205180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s0 f205181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f205182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f205183f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f205190m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f205184g = new boolean[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f205185h = new w(32, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f205186i = new w(33, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f205187j = new w(34, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f205188k = new w(39, 128);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f205189l = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f205191n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w7.c0 f205192o = new w7.c0();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f205193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f205194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f205195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f205196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f205197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f205198f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f205199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f205200h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f205201i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f205202j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f205203k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f205204l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f205205m;

        public a(s0 s0Var) {
            this.f205193a = s0Var;
        }

        private static boolean b(int i15) {
            return (32 <= i15 && i15 <= 35) || i15 == 39;
        }

        private static boolean c(int i15) {
            return i15 < 32 || i15 == 40;
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
        private void d(int i15) {
            long j15 = this.f205204l;
            if (j15 != -9223372036854775807L) {
                long j16 = this.f205194b;
                long j17 = this.f205203k;
                if (j16 == j17) {
                    return;
                }
                int i16 = (int) (j16 - j17);
                this.f205193a.c(j15, this.f205205m ? 1 : 0, i16, i15, null);
            }
        }

        public void a(long j15, int i15, boolean z15) {
            if (this.f205202j && this.f205199g) {
                this.f205205m = this.f205195c;
                this.f205202j = false;
            } else if (this.f205200h || this.f205199g) {
                if (z15 && this.f205201i) {
                    d(i15 + ((int) (j15 - this.f205194b)));
                }
                this.f205203k = this.f205194b;
                this.f205204l = this.f205197e;
                this.f205205m = this.f205195c;
                this.f205201i = true;
            }
        }

        public void e(byte[] bArr, int i15, int i16) {
            if (this.f205198f) {
                int i17 = this.f205196d;
                int i18 = (i15 + 2) - i17;
                if (i18 >= i16) {
                    this.f205196d = i17 + (i16 - i15);
                } else {
                    this.f205199g = (bArr[i18] & 128) != 0;
                    this.f205198f = false;
                }
            }
        }

        public void f() {
            this.f205198f = false;
            this.f205199g = false;
            this.f205200h = false;
            this.f205201i = false;
            this.f205202j = false;
        }

        public void g(long j15, int i15, int i16, long j16, boolean z15) {
            this.f205199g = false;
            this.f205200h = false;
            this.f205197e = j16;
            this.f205196d = 0;
            this.f205194b = j15;
            if (!c(i16)) {
                if (this.f205201i && !this.f205202j) {
                    if (z15) {
                        d(i15);
                    }
                    this.f205201i = false;
                }
                if (b(i16)) {
                    this.f205200h = !this.f205202j;
                    this.f205202j = true;
                }
            }
            boolean z16 = i16 >= 16 && i16 <= 21;
            this.f205195c = z16;
            this.f205198f = z16 || i16 <= 9;
        }
    }

    public q(g0 g0Var, String str) {
        this.f205178a = g0Var;
        this.f205179b = str;
    }

    private void a() {
        zj.p.q(this.f205181d);
        w7.o0.h(this.f205182e);
    }

    private void g(long j15, int i15, int i16, long j16) {
        this.f205182e.a(j15, i15, this.f205183f);
        if (!this.f205183f) {
            this.f205185h.b(i16);
            this.f205186i.b(i16);
            this.f205187j.b(i16);
            if (this.f205185h.c() && this.f205186i.c() && this.f205187j.c()) {
                t7.p pVarI = i(this.f205180c, this.f205185h, this.f205186i, this.f205187j, this.f205179b);
                this.f205181d.e(pVarI);
                zj.p.w(pVarI.f188383r != -1);
                this.f205178a.f(pVarI.f188383r);
                this.f205183f = true;
            }
        }
        if (this.f205188k.b(i16)) {
            w wVar = this.f205188k;
            this.f205192o.d0(this.f205188k.f205282d, x7.g.M(wVar.f205282d, wVar.f205283e));
            this.f205192o.g0(5);
            this.f205178a.c(j16, this.f205192o);
        }
        if (this.f205189l.b(i16)) {
            w wVar2 = this.f205189l;
            this.f205192o.d0(this.f205189l.f205282d, x7.g.M(wVar2.f205282d, wVar2.f205283e));
            this.f205192o.g0(5);
            this.f205178a.c(j16, this.f205192o);
        }
    }

    private void h(byte[] bArr, int i15, int i16) {
        this.f205182e.e(bArr, i15, i16);
        if (!this.f205183f) {
            this.f205185h.a(bArr, i15, i16);
            this.f205186i.a(bArr, i15, i16);
            this.f205187j.a(bArr, i15, i16);
        }
        this.f205188k.a(bArr, i15, i16);
        this.f205189l.a(bArr, i15, i16);
    }

    private static t7.p i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i15 = wVar.f205283e;
        byte[] bArr = new byte[wVar2.f205283e + i15 + wVar3.f205283e];
        System.arraycopy(wVar.f205282d, 0, bArr, 0, i15);
        System.arraycopy(wVar2.f205282d, 0, bArr, wVar.f205283e, wVar2.f205283e);
        System.arraycopy(wVar3.f205282d, 0, bArr, wVar.f205283e + wVar2.f205283e, wVar3.f205283e);
        x7.g.h hVarV = x7.g.v(wVar2.f205282d, 3, wVar2.f205283e, null);
        x7.g.c cVar = hVarV.f217195c;
        return new t7.p.b().k0(str).X(str2).A0("video/hevc").V(cVar != null ? w7.i.i(cVar.f217169a, cVar.f217170b, cVar.f217171c, cVar.f217172d, cVar.f217173e, cVar.f217174f) : null).F0(hVarV.f217200h).i0(hVarV.f217201i).c0(hVarV.f217202j).b0(hVarV.f217203k).W(new t7.g.b().d(hVarV.f217206n).c(hVarV.f217207o).e(hVarV.f217208p).g(hVarV.f217197e + 8).b(hVarV.f217198f + 8).a()).v0(hVarV.f217204l).q0(hVarV.f217205m).r0(hVarV.f217194b + 1).l0(Collections.singletonList(bArr)).Q();
    }

    private void j(long j15, int i15, int i16, long j16) {
        this.f205182e.g(j15, i15, i16, j16, this.f205183f);
        if (!this.f205183f) {
            this.f205185h.e(i16);
            this.f205186i.e(i16);
            this.f205187j.e(i16);
        }
        this.f205188k.e(i16);
        this.f205189l.e(i16);
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        int i15;
        a();
        while (c0Var.a() > 0) {
            int iG = c0Var.g();
            int iJ = c0Var.j();
            byte[] bArrF = c0Var.f();
            this.f205190m += (long) c0Var.a();
            this.f205181d.a(c0Var, c0Var.a());
            while (iG < iJ) {
                int iE = x7.g.e(bArrF, iG, iJ, this.f205184g);
                if (iE == iJ) {
                    h(bArrF, iG, iJ);
                    return;
                }
                int i16 = x7.g.i(bArrF, iE);
                if (iE <= 0 || bArrF[iE - 1] != 0) {
                    i15 = 3;
                } else {
                    iE--;
                    i15 = 4;
                }
                int i17 = iE;
                int i18 = i15;
                int i19 = i17 - iG;
                if (i19 > 0) {
                    h(bArrF, iG, i17);
                }
                int i25 = iJ - i17;
                long j15 = this.f205190m - ((long) i25);
                g(j15, i25, i19 < 0 ? -i19 : 0, this.f205191n);
                j(j15, i25, i16, this.f205191n);
                iG = i17 + i18;
            }
        }
    }

    @Override // v9.m
    public void c() {
        this.f205190m = 0L;
        this.f205191n = -9223372036854775807L;
        x7.g.c(this.f205184g);
        this.f205185h.d();
        this.f205186i.d();
        this.f205187j.d();
        this.f205188k.d();
        this.f205189l.d();
        this.f205178a.b();
        a aVar = this.f205182e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205180c = dVar.b();
        s0 s0VarV = rVar.v(dVar.c(), 2);
        this.f205181d = s0VarV;
        this.f205182e = new a(s0VarV);
        this.f205178a.d(rVar, dVar);
    }

    @Override // v9.m
    public void e(boolean z15) {
        a();
        if (z15) {
            this.f205178a.e();
            g(this.f205190m, 0, 0, this.f205191n);
            j(this.f205190m, 0, 48, this.f205191n);
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205191n = j15;
    }
}
