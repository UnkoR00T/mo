package v9;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f205127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f205128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f205129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f205130d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f205134h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f205136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s0 f205137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f205138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f205139m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f205141o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f205135i = new boolean[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f205131e = new w(7, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f205132f = new w(8, 128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f205133g = new w(6, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f205140n = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w7.c0 f205142p = new w7.c0();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f205143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f205144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f205145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseArray<x7.g.m> f205146d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final SparseArray<x7.g.l> f205147e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final x7.j f205148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f205149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f205150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f205151i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f205152j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f205153k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f205154l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private a f205155m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private a f205156n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f205157o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f205158p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private long f205159q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f205160r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f205161s;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f205162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f205163b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private x7.g.m f205164c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f205165d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f205166e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f205167f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f205168g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f205169h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f205170i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f205171j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f205172k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f205173l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f205174m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f205175n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f205176o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f205177p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i15;
                int i16;
                int i17;
                boolean z15;
                if (!this.f205162a) {
                    return false;
                }
                if (!aVar.f205162a) {
                    return true;
                }
                x7.g.m mVar = (x7.g.m) zj.p.q(this.f205164c);
                x7.g.m mVar2 = (x7.g.m) zj.p.q(aVar.f205164c);
                return (this.f205167f == aVar.f205167f && this.f205168g == aVar.f205168g && this.f205169h == aVar.f205169h && (!this.f205170i || !aVar.f205170i || this.f205171j == aVar.f205171j) && (((i15 = this.f205165d) == (i16 = aVar.f205165d) || (i15 != 0 && i16 != 0)) && (((i17 = mVar.f217235n) != 0 || mVar2.f217235n != 0 || (this.f205174m == aVar.f205174m && this.f205175n == aVar.f205175n)) && ((i17 != 1 || mVar2.f217235n != 1 || (this.f205176o == aVar.f205176o && this.f205177p == aVar.f205177p)) && (z15 = this.f205172k) == aVar.f205172k && (!z15 || this.f205173l == aVar.f205173l))))) ? false : true;
            }

            public void b() {
                this.f205163b = false;
                this.f205162a = false;
            }

            public boolean d() {
                if (!this.f205163b) {
                    return false;
                }
                int i15 = this.f205166e;
                return i15 == 7 || i15 == 2;
            }

            public void e(x7.g.m mVar, int i15, int i16, int i17, int i18, boolean z15, boolean z16, boolean z17, boolean z18, int i19, int i25, int i26, int i27, int i28) {
                this.f205164c = mVar;
                this.f205165d = i15;
                this.f205166e = i16;
                this.f205167f = i17;
                this.f205168g = i18;
                this.f205169h = z15;
                this.f205170i = z16;
                this.f205171j = z17;
                this.f205172k = z18;
                this.f205173l = i19;
                this.f205174m = i25;
                this.f205175n = i26;
                this.f205176o = i27;
                this.f205177p = i28;
                this.f205162a = true;
                this.f205163b = true;
            }

            public void f(int i15) {
                this.f205166e = i15;
                this.f205163b = true;
            }
        }

        public b(s0 s0Var, boolean z15, boolean z16) {
            this.f205143a = s0Var;
            this.f205144b = z15;
            this.f205145c = z16;
            this.f205155m = new a();
            this.f205156n = new a();
            byte[] bArr = new byte[128];
            this.f205149g = bArr;
            this.f205148f = new x7.j(bArr, 0, 0);
            g();
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
            long j15 = this.f205159q;
            if (j15 != -9223372036854775807L) {
                long j16 = this.f205152j;
                long j17 = this.f205158p;
                if (j16 == j17) {
                    return;
                }
                int i16 = (int) (j16 - j17);
                this.f205143a.c(j15, this.f205160r ? 1 : 0, i16, i15, null);
            }
        }

        private void h() {
            boolean zD = this.f205144b ? this.f205156n.d() : this.f205161s;
            boolean z15 = this.f205160r;
            int i15 = this.f205151i;
            boolean z16 = true;
            if (i15 != 5 && (!zD || i15 != 1)) {
                z16 = false;
            }
            this.f205160r = z15 | z16;
        }

        /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0109  */
        /* JADX WARN: Code duplicated, block: B:54:0x010c  */
        /* JADX WARN: Code duplicated, block: B:56:0x0110  */
        /* JADX WARN: Code duplicated, block: B:59:0x011a  */
        /* JADX WARN: Code duplicated, block: B:60:0x0123  */
        /* JADX WARN: Code duplicated, block: B:63:0x0129  */
        /* JADX WARN: Code duplicated, block: B:66:0x0134  */
        /* JADX WARN: Code duplicated, block: B:76:0x0161  */
        public void a(byte[] bArr, int i15, int i16) {
            boolean z15;
            boolean z16;
            boolean zE;
            boolean z17;
            int i17;
            int i18;
            int i19;
            int iH;
            int i25;
            int iH2;
            int iF;
            if (this.f205153k) {
                int i26 = i16 - i15;
                byte[] bArr2 = this.f205149g;
                int length = bArr2.length;
                int i27 = this.f205150h;
                if (length < i27 + i26) {
                    this.f205149g = Arrays.copyOf(bArr2, (i27 + i26) * 2);
                }
                System.arraycopy(bArr, i15, this.f205149g, this.f205150h, i26);
                int i28 = this.f205150h + i26;
                this.f205150h = i28;
                this.f205148f.j(this.f205149g, 0, i28);
                if (this.f205148f.c(8)) {
                    this.f205148f.l();
                    int iF2 = this.f205148f.f(2);
                    this.f205148f.m(5);
                    if (this.f205148f.d()) {
                        this.f205148f.i();
                        if (this.f205148f.d()) {
                            int i29 = this.f205148f.i();
                            if (!this.f205145c) {
                                this.f205153k = false;
                                this.f205156n.f(i29);
                                return;
                            }
                            if (this.f205148f.d()) {
                                int i35 = this.f205148f.i();
                                if (this.f205147e.indexOfKey(i35) < 0) {
                                    this.f205153k = false;
                                    return;
                                }
                                x7.g.l lVar = this.f205147e.get(i35);
                                x7.g.m mVar = this.f205146d.get(lVar.f217220b);
                                if (mVar.f217232k) {
                                    if (!this.f205148f.c(2)) {
                                        return;
                                    } else {
                                        this.f205148f.m(2);
                                    }
                                }
                                if (this.f205148f.c(mVar.f217234m)) {
                                    int iF3 = this.f205148f.f(mVar.f217234m);
                                    if (!mVar.f217233l) {
                                        if (this.f205148f.c(1)) {
                                            boolean zE2 = this.f205148f.e();
                                            if (!zE2) {
                                                z15 = zE2;
                                                z16 = false;
                                            } else {
                                                if (!this.f205148f.c(1)) {
                                                    return;
                                                }
                                                z15 = zE2;
                                                z16 = true;
                                                zE = this.f205148f.e();
                                            }
                                            if (this.f205151i == 5) {
                                                z17 = true;
                                            } else {
                                                z17 = false;
                                            }
                                            if (z17) {
                                                i17 = 0;
                                            } else if (!this.f205148f.d()) {
                                                return;
                                            } else {
                                                i17 = this.f205148f.i();
                                            }
                                            i18 = mVar.f217235n;
                                            if (i18 != 0) {
                                                if (this.f205148f.c(mVar.f217236o)) {
                                                    iF = this.f205148f.f(mVar.f217236o);
                                                    if (lVar.f217221c || z15) {
                                                        i19 = iF;
                                                        iH = 0;
                                                    } else {
                                                        if (!this.f205148f.d()) {
                                                            return;
                                                        }
                                                        iH = this.f205148f.h();
                                                        i19 = iF;
                                                        i25 = 0;
                                                    }
                                                    iH2 = i25;
                                                    this.f205156n.e(mVar, iF2, i29, iF3, i35, z15, z16, zE, z17, i17, i19, iH, i25, iH2);
                                                    this.f205153k = false;
                                                }
                                                return;
                                            }
                                            if (i18 == 1 || mVar.f217237p) {
                                                i19 = 0;
                                                iH = 0;
                                            } else {
                                                if (!this.f205148f.d()) {
                                                    return;
                                                }
                                                int iH3 = this.f205148f.h();
                                                if (!lVar.f217221c || z15) {
                                                    i25 = iH3;
                                                    i19 = 0;
                                                    iH = 0;
                                                    iH2 = 0;
                                                } else {
                                                    if (!this.f205148f.d()) {
                                                        return;
                                                    }
                                                    iH2 = this.f205148f.h();
                                                    i25 = iH3;
                                                    i19 = 0;
                                                    iH = 0;
                                                }
                                            }
                                            this.f205156n.e(mVar, iF2, i29, iF3, i35, z15, z16, zE, z17, i17, i19, iH, i25, iH2);
                                            this.f205153k = false;
                                            i25 = iH;
                                            iH2 = i25;
                                            this.f205156n.e(mVar, iF2, i29, iF3, i35, z15, z16, zE, z17, i17, i19, iH, i25, iH2);
                                            this.f205153k = false;
                                        }
                                        return;
                                    }
                                    z15 = false;
                                    z16 = false;
                                    zE = z16;
                                    if (this.f205151i == 5) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (z17) {
                                        i17 = 0;
                                    } else if (!this.f205148f.d()) {
                                        return;
                                    } else {
                                        i17 = this.f205148f.i();
                                    }
                                    i18 = mVar.f217235n;
                                    if (i18 != 0) {
                                        if (i18 == 1) {
                                        }
                                        i19 = 0;
                                        iH = 0;
                                    } else {
                                        if (this.f205148f.c(mVar.f217236o)) {
                                            return;
                                        }
                                        iF = this.f205148f.f(mVar.f217236o);
                                        if (lVar.f217221c) {
                                        }
                                        i19 = iF;
                                        iH = 0;
                                    }
                                    i25 = iH;
                                    iH2 = i25;
                                    this.f205156n.e(mVar, iF2, i29, iF3, i35, z15, z16, zE, z17, i17, i19, iH, i25, iH2);
                                    this.f205153k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j15, int i15, boolean z15) {
            if (this.f205151i == 9 || (this.f205145c && this.f205156n.c(this.f205155m))) {
                if (z15 && this.f205157o) {
                    d(i15 + ((int) (j15 - this.f205152j)));
                }
                this.f205158p = this.f205152j;
                this.f205159q = this.f205154l;
                this.f205160r = false;
                this.f205157o = true;
            }
            h();
            this.f205151i = 24;
            return this.f205160r;
        }

        public boolean c() {
            return this.f205145c;
        }

        public void e(x7.g.l lVar) {
            this.f205147e.append(lVar.f217219a, lVar);
        }

        public void f(x7.g.m mVar) {
            this.f205146d.append(mVar.f217225d, mVar);
        }

        public void g() {
            this.f205153k = false;
            this.f205157o = false;
            this.f205156n.b();
        }

        public void i(long j15, int i15, long j16, boolean z15) {
            this.f205151i = i15;
            this.f205154l = j16;
            this.f205152j = j15;
            this.f205161s = z15;
            if (!this.f205144b || i15 != 1) {
                if (!this.f205145c) {
                    return;
                }
                if (i15 != 5 && i15 != 1 && i15 != 2) {
                    return;
                }
            }
            a aVar = this.f205155m;
            this.f205155m = this.f205156n;
            this.f205156n = aVar;
            aVar.b();
            this.f205150h = 0;
            this.f205153k = true;
        }
    }

    public p(g0 g0Var, boolean z15, boolean z16, String str) {
        this.f205127a = g0Var;
        this.f205128b = z15;
        this.f205129c = z16;
        this.f205130d = str;
    }

    private void a() {
        zj.p.q(this.f205137k);
        w7.o0.h(this.f205138l);
    }

    private void g(long j15, int i15, int i16, long j16) {
        if (!this.f205139m || this.f205138l.c()) {
            this.f205131e.b(i16);
            this.f205132f.b(i16);
            if (this.f205139m) {
                if (this.f205131e.c()) {
                    w wVar = this.f205131e;
                    x7.g.m mVarD = x7.g.D(wVar.f205282d, 3, wVar.f205283e);
                    this.f205127a.f(mVarD.f217241t);
                    this.f205138l.f(mVarD);
                    this.f205131e.d();
                } else if (this.f205132f.c()) {
                    w wVar2 = this.f205132f;
                    this.f205138l.e(x7.g.B(wVar2.f205282d, 3, wVar2.f205283e));
                    this.f205132f.d();
                }
            } else if (this.f205131e.c() && this.f205132f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f205131e;
                arrayList.add(Arrays.copyOf(wVar3.f205282d, wVar3.f205283e));
                w wVar4 = this.f205132f;
                arrayList.add(Arrays.copyOf(wVar4.f205282d, wVar4.f205283e));
                w wVar5 = this.f205131e;
                x7.g.m mVarD2 = x7.g.D(wVar5.f205282d, 3, wVar5.f205283e);
                w wVar6 = this.f205132f;
                x7.g.l lVarB = x7.g.B(wVar6.f205282d, 3, wVar6.f205283e);
                this.f205137k.e(new t7.p.b().k0(this.f205136j).X(this.f205130d).A0("video/avc").V(w7.i.g(mVarD2.f217222a, mVarD2.f217223b, mVarD2.f217224c)).F0(mVarD2.f217227f).i0(mVarD2.f217228g).W(new t7.g.b().d(mVarD2.f217238q).c(mVarD2.f217239r).e(mVarD2.f217240s).g(mVarD2.f217230i + 8).b(mVarD2.f217231j + 8).a()).v0(mVarD2.f217229h).l0(arrayList).q0(mVarD2.f217241t).Q());
                this.f205139m = true;
                this.f205127a.f(mVarD2.f217241t);
                this.f205138l.f(mVarD2);
                this.f205138l.e(lVarB);
                this.f205131e.d();
                this.f205132f.d();
            }
        }
        if (this.f205133g.b(i16)) {
            w wVar7 = this.f205133g;
            this.f205142p.d0(this.f205133g.f205282d, x7.g.M(wVar7.f205282d, wVar7.f205283e));
            this.f205142p.f0(4);
            this.f205127a.c(j16, this.f205142p);
        }
        if (this.f205138l.b(j15, i15, this.f205139m)) {
            this.f205141o = false;
        }
    }

    private void h(byte[] bArr, int i15, int i16) {
        if (!this.f205139m || this.f205138l.c()) {
            this.f205131e.a(bArr, i15, i16);
            this.f205132f.a(bArr, i15, i16);
        }
        this.f205133g.a(bArr, i15, i16);
        this.f205138l.a(bArr, i15, i16);
    }

    private void i(long j15, int i15, long j16) {
        if (!this.f205139m || this.f205138l.c()) {
            this.f205131e.e(i15);
            this.f205132f.e(i15);
        }
        this.f205133g.e(i15);
        this.f205138l.i(j15, i15, j16, this.f205141o);
    }

    @Override // v9.m
    public void b(w7.c0 c0Var) {
        int i15;
        a();
        int iG = c0Var.g();
        int iJ = c0Var.j();
        byte[] bArrF = c0Var.f();
        this.f205134h += (long) c0Var.a();
        this.f205137k.a(c0Var, c0Var.a());
        while (true) {
            int iE = x7.g.e(bArrF, iG, iJ, this.f205135i);
            if (iE == iJ) {
                h(bArrF, iG, iJ);
                return;
            }
            int iK = x7.g.k(bArrF, iE);
            if (iE <= 0 || bArrF[iE - 1] != 0) {
                i15 = 3;
            } else {
                iE--;
                i15 = 4;
            }
            int i16 = iE;
            int i17 = i15;
            int i18 = i16 - iG;
            if (i18 > 0) {
                h(bArrF, iG, i16);
            }
            int i19 = iJ - i16;
            long j15 = this.f205134h - ((long) i19);
            g(j15, i19, i18 < 0 ? -i18 : 0, this.f205140n);
            i(j15, iK, this.f205140n);
            iG = i16 + i17;
        }
    }

    @Override // v9.m
    public void c() {
        this.f205134h = 0L;
        this.f205141o = false;
        this.f205140n = -9223372036854775807L;
        x7.g.c(this.f205135i);
        this.f205131e.d();
        this.f205132f.d();
        this.f205133g.d();
        this.f205127a.b();
        b bVar = this.f205138l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // v9.m
    public void d(o8.r rVar, l0.d dVar) {
        dVar.a();
        this.f205136j = dVar.b();
        s0 s0VarV = rVar.v(dVar.c(), 2);
        this.f205137k = s0VarV;
        this.f205138l = new b(s0VarV, this.f205128b, this.f205129c);
        this.f205127a.d(rVar, dVar);
    }

    @Override // v9.m
    public void e(boolean z15) {
        a();
        if (z15) {
            this.f205127a.e();
            g(this.f205134h, 0, 0, this.f205140n);
            i(this.f205134h, 9, this.f205140n);
            g(this.f205134h, 0, 0, this.f205140n);
        }
    }

    @Override // v9.m
    public void f(long j15, int i15) {
        this.f205140n = j15;
        this.f205141o |= (i15 & 2) != 0;
    }
}
