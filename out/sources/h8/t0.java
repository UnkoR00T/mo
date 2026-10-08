package h8;

import a8.b2;
import a8.f3;
import a8.y1;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class t0 implements b0, o8.r, k8.l.b<c>, k8.l.f, y0.d {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Map<String, String> f81709u0 = O();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final t7.p f81710v0 = new t7.p.b().k0("icy").A0("application/x-icy").Q();
    private y0[] A;
    private f[] B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private g G;
    private o8.l0 H;
    private long I;
    private boolean K;
    private int L;
    private long O = Long.MIN_VALUE;
    private boolean P;
    private boolean R;
    private boolean T;
    private int X;
    private boolean Y;
    private long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f81711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y7.f f81712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d8.u f81713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.j f81714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0.a f81715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d8.t.a f81716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f81717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k8.b f81718h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private long f81719h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f81720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f81721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f81722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f81723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t7.p f81724n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f81725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final k8.l f81726q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f81727q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o0 f81728r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f81729r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final w7.k f81730s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f81731s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f81732t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f81733t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f81734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Handler f81735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private b0.a f81736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b9.b f81737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private b[] f81738z;

    class a extends o8.a0 {
        a(o8.l0 l0Var) {
            super(l0Var);
        }

        @Override // o8.a0, o8.l0
        public long h() {
            return t0.this.I;
        }
    }

    private static class b extends o8.b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y0 f81740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o8.n f81741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<a> f81742d;

        enum a {
            PASS_THROUGH,
            DISCARD_AFTER_NEXT_SAMPLE_METADATA,
            DISCARDING
        }

        b(y0 y0Var) {
            super(y0Var);
            this.f81740b = y0Var;
            this.f81741c = new o8.n();
            this.f81742d = new AtomicReference<>(a.PASS_THROUGH);
        }

        private o8.s0 h() {
            return this.f81742d.get() == a.DISCARDING ? this.f81741c : this.f81740b;
        }

        @Override // o8.s0
        public void a(w7.c0 c0Var, int i15) {
            h().a(c0Var, i15);
        }

        @Override // o8.s0
        public void b(w7.c0 c0Var, int i15, int i16) {
            h().b(c0Var, i15, i16);
        }

        @Override // o8.s0
        public void c(long j15, int i15, int i16, int i17, o8.s0.a aVar) {
            h().c(j15, i15, i16, i17, aVar);
            if (this.f81742d.get() == a.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
                this.f81740b.R();
                this.f81742d.set(a.DISCARDING);
            }
        }

        @Override // o8.s0
        public int f(t7.h hVar, int i15, boolean z15) {
            return h().f(hVar, i15, z15);
        }

        @Override // o8.s0
        public int g(t7.h hVar, int i15, boolean z15, int i16) {
            return h().g(hVar, i15, z15, i16);
        }

        boolean i() {
            return this.f81742d.get() == a.PASS_THROUGH;
        }

        void j(boolean z15) {
            this.f81742d.set(z15 ? a.PASS_THROUGH : a.DISCARD_AFTER_NEXT_SAMPLE_METADATA);
            if (z15) {
                return;
            }
            this.f81740b.r();
        }
    }

    final class c implements k8.l.e, w.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f81748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y7.w f81749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o0 f81750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o8.r f81751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w7.k f81752f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f81754h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f81756j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private o8.s0 f81758l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f81759m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final o8.k0 f81753g = new o8.k0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f81755i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f81747a = x.b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private y7.j f81757k = i(0, null);

        public c(Uri uri, y7.f fVar, o0 o0Var, o8.r rVar, w7.k kVar) {
            this.f81748b = uri;
            this.f81749c = new y7.w(fVar);
            this.f81750d = o0Var;
            this.f81751e = rVar;
            this.f81752f = kVar;
        }

        private y7.j i(long j15, String str) {
            Map<String, String> mapC = t0.f81709u0;
            if (str != null && !str.startsWith("W/")) {
                mapC = ak.p0.a().j(mapC).g("If-Range", str).c();
            }
            return new y7.j.b().h(this.f81748b).g(j15).f(t0.this.f81720j).b(6).e(mapC).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j15, long j16) {
            this.f81753g.f143128a = j15;
            this.f81756j = j16;
            this.f81755i = true;
            this.f81759m = false;
        }

        @Override // h8.w.a
        public void a(w7.c0 c0Var) {
            long jMax = !this.f81759m ? this.f81756j : Math.max(t0.this.Q(true), this.f81756j);
            int iA = c0Var.a();
            o8.s0 s0Var = (o8.s0) zj.p.q(this.f81758l);
            s0Var.a(c0Var, iA);
            s0Var.c(jMax, 1, iA, 0, null);
            this.f81759m = true;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x005d */
        @Override // k8.l.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b() {
            /*
                Method dump skipped, instruction units count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.t0.c.b():void");
        }

        @Override // k8.l.e
        public void c() {
            this.f81754h = true;
        }
    }

    interface d {
        void o(long j15, o8.l0 l0Var, boolean z15);
    }

    private final class e implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f81761a;

        public e(int i15) {
            this.f81761a = i15;
        }

        @Override // h8.z0
        public void a() throws IOException {
            t0.this.a0(this.f81761a);
        }

        @Override // h8.z0
        public int b(y1 y1Var, z7.f fVar, int i15) {
            return t0.this.h0(this.f81761a, y1Var, fVar, i15);
        }

        @Override // h8.z0
        public int c(long j15) {
            return t0.this.l0(this.f81761a, j15);
        }

        @Override // h8.z0
        public boolean f() {
            return t0.this.V(this.f81761a);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81764b;

        public f(int i15, boolean z15) {
            this.f81763a = i15;
            this.f81764b = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f81763a == fVar.f81763a && this.f81764b == fVar.f81764b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f81763a * 31) + (this.f81764b ? 1 : 0);
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j1 f81765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f81766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f81767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f81768d;

        public g(j1 j1Var, boolean[] zArr) {
            this.f81765a = j1Var;
            this.f81766b = zArr;
            int i15 = j1Var.f81616a;
            this.f81767c = new boolean[i15];
            this.f81768d = new boolean[i15];
        }
    }

    public t0(Uri uri, y7.f fVar, o0 o0Var, d8.u uVar, d8.t.a aVar, k8.j jVar, j0.a aVar2, d dVar, k8.b bVar, String str, int i15, boolean z15, int i16, t7.p pVar, long j15, l8.a aVar3) {
        this.f81711a = uri;
        this.f81712b = fVar;
        this.f81713c = uVar;
        this.f81716f = aVar;
        this.f81714d = jVar;
        this.f81715e = aVar2;
        this.f81717g = dVar;
        this.f81718h = bVar;
        this.f81720j = str;
        this.f81721k = i15;
        this.f81722l = z15;
        this.f81723m = i16;
        this.f81724n = pVar;
        this.f81726q = aVar3 != null ? new k8.l(aVar3) : new k8.l("ProgressiveMediaPeriod");
        this.f81728r = o0Var;
        this.f81725p = j15;
        this.f81730s = new w7.k();
        this.f81732t = new Runnable() { // from class: h8.q0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f81693a.W();
            }
        };
        this.f81734v = new Runnable() { // from class: h8.r0
            @Override // java.lang.Runnable
            public final void run() {
                t0.z(this.f81694a);
            }
        };
        this.f81735w = w7.o0.z();
        this.B = new f[0];
        this.A = new y0[0];
        this.f81738z = new b[0];
        this.f81719h0 = -9223372036854775807L;
        this.L = 1;
    }

    private void M() {
        zj.p.w(this.D);
        zj.p.q(this.G);
        zj.p.q(this.H);
    }

    private boolean N(c cVar, int i15) {
        o8.l0 l0Var;
        if (this.Y || !((l0Var = this.H) == null || l0Var.h() == -9223372036854775807L)) {
            this.f81729r0 = i15;
            return true;
        }
        if (this.D && !n0()) {
            this.f81727q0 = true;
            return false;
        }
        this.R = this.D;
        this.Z = 0L;
        this.f81729r0 = 0;
        for (y0 y0Var : this.A) {
            y0Var.R();
        }
        cVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> O() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int P() {
        int iE = 0;
        for (y0 y0Var : this.A) {
            iE += y0Var.E();
        }
        return iE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long Q(boolean z15) {
        long jMax = Long.MIN_VALUE;
        for (int i15 = 0; i15 < this.A.length; i15++) {
            if (z15 || ((g) zj.p.q(this.G)).f81767c[i15]) {
                jMax = Math.max(jMax, this.A[i15].x());
            }
        }
        return jMax;
    }

    private static int R(int i15) {
        if (i15 == 1) {
            return 3;
        }
        if (i15 == 2) {
            return 4;
        }
        if (i15 != 3) {
            return i15 != 4 ? 0 : 2;
        }
        return 1;
    }

    private boolean S() {
        int i15 = 0;
        if (this.O == Long.MIN_VALUE) {
            return false;
        }
        M();
        boolean zG = true;
        while (true) {
            y0[] y0VarArr = this.A;
            if (i15 >= y0VarArr.length) {
                return zG;
            }
            g gVar = this.G;
            if (gVar.f81767c[i15] && (gVar.f81766b[i15] || !this.E)) {
                zG &= y0VarArr[i15].G();
            }
            i15++;
        }
    }

    private boolean U() {
        return this.f81719h0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() throws Throwable {
        if (this.f81733t0 || this.D || !this.C || this.H == null) {
            return;
        }
        for (y0 y0Var : this.A) {
            if (y0Var.D() == null) {
                return;
            }
        }
        this.f81730s.d();
        int length = this.A.length;
        int i15 = -1;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int iF = t7.w.f(((t7.p) zj.p.q(this.A[i17].D())).f188381p);
            if (R(iF) > R(i15)) {
                i16 = i17;
                i15 = iF;
            }
        }
        t7.f0[] f0VarArr = new t7.f0[length];
        boolean[] zArr = new boolean[length];
        for (int i18 = 0; i18 < length; i18++) {
            t7.p pVarQ = (t7.p) zj.p.q(this.A[i18].D());
            String str = pVarQ.f188381p;
            boolean zH = t7.w.h(str);
            boolean z15 = zH || t7.w.k(str);
            zArr[i18] = z15;
            this.E = z15 | this.E;
            this.F = this.f81725p != -9223372036854775807L && length == 1 && t7.w.i(str);
            b9.b bVar = this.f81737y;
            if (bVar != null) {
                if (zH || this.B[i18].f81764b) {
                    t7.v vVar = pVarQ.f188377l;
                    pVarQ = pVarQ.b().s0(vVar == null ? new t7.v(bVar) : vVar.a(bVar)).Q();
                }
                if (zH && pVarQ.f188373h == -1 && pVarQ.f188374i == -1 && bVar.f17589a != -1) {
                    pVarQ = pVarQ.b().T(bVar.f17589a).Q();
                }
            }
            t7.p pVarC = pVarQ.c(this.f81713c.c(pVarQ));
            if (i18 != i16) {
                pVarC = pVarC.b().w0(Integer.toString(i16)).Q();
            }
            f0VarArr[i18] = new t7.f0(Integer.toString(i18), pVarC);
            this.T = pVarC.f188387v | this.T;
            this.A[i18].W(this.O);
        }
        this.G = new g(new j1(f0VarArr), zArr);
        if (this.F && this.I == -9223372036854775807L) {
            this.I = this.f81725p;
            this.H = new a(this.H);
        }
        this.f81717g.o(this.I, this.H, this.K);
        this.D = true;
        ((b0.a) zj.p.q(this.f81736x)).f(this);
    }

    private void X(int i15) {
        M();
        g gVar = this.G;
        boolean[] zArr = gVar.f81768d;
        if (zArr[i15]) {
            return;
        }
        t7.p pVarA = gVar.f81765a.b(i15).a(0);
        this.f81715e.i(t7.w.f(pVarA.f188381p), pVarA, 0, null, this.Z);
        zArr[i15] = true;
    }

    private void Y(int i15) {
        M();
        if (this.f81727q0) {
            if (!this.E || this.G.f81766b[i15]) {
                if (this.A[i15].I(false)) {
                    return;
                }
                this.f81719h0 = 0L;
                this.f81727q0 = false;
                this.R = true;
                this.Z = 0L;
                this.f81729r0 = 0;
                for (y0 y0Var : this.A) {
                    y0Var.R();
                }
                ((b0.a) zj.p.q(this.f81736x)).g(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.f81735w.post(new Runnable() { // from class: h8.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81665a.Y = true;
            }
        });
    }

    private o8.s0 g0(f fVar) {
        int length = this.A.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (fVar.equals(this.B[i15])) {
                return this.A[i15];
            }
        }
        if (this.C) {
            w7.t.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + fVar.f81763a + ") after finishing tracks.");
            return new o8.n();
        }
        y0 y0VarM = y0.m(this.f81718h, this.f81713c, this.f81716f);
        b bVar = new b(y0VarM);
        y0VarM.Z(this);
        int i16 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.B, i16);
        fVarArr[length] = fVar;
        this.B = (f[]) w7.o0.i(fVarArr);
        y0[] y0VarArr = (y0[]) Arrays.copyOf(this.A, i16);
        y0VarArr[length] = y0VarM;
        this.A = (y0[]) w7.o0.i(y0VarArr);
        b[] bVarArr = (b[]) Arrays.copyOf(this.f81738z, i16);
        bVarArr[length] = bVar;
        this.f81738z = (b[]) w7.o0.i(bVarArr);
        return bVar;
    }

    private boolean j0(boolean[] zArr, long j15, boolean z15) {
        int length = this.A.length;
        for (int i15 = 0; i15 < length; i15++) {
            y0 y0Var = this.A[i15];
            if (this.f81738z[i15].i() && (y0Var.A() != 0 || !z15)) {
                if (!(this.F ? y0Var.U(y0Var.w()) : y0Var.V(j15, this.f81731s0)) && (zArr[i15] || !this.E)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(o8.l0 l0Var) throws Throwable {
        this.H = this.f81737y == null ? l0Var : new o8.l0.b(-9223372036854775807L);
        this.I = l0Var.h();
        boolean z15 = !this.Y && l0Var.h() == -9223372036854775807L;
        this.K = z15;
        this.L = z15 ? 7 : 1;
        if (this.D) {
            this.f81717g.o(this.I, l0Var, z15);
        } else {
            W();
        }
    }

    private void m0() {
        c cVar = new c(this.f81711a, this.f81712b, this.f81728r, this, this.f81730s);
        if (this.D) {
            zj.p.w(U());
            long j15 = this.O;
            if (j15 == Long.MIN_VALUE) {
                j15 = this.I;
            }
            if (j15 != -9223372036854775807L && this.f81719h0 > j15) {
                this.f81731s0 = true;
                this.f81719h0 = -9223372036854775807L;
                return;
            }
            cVar.j(((o8.l0) zj.p.q(this.H)).c(this.f81719h0).f143129a.f143159b, this.f81719h0);
            for (y0 y0Var : this.A) {
                y0Var.X(this.f81719h0);
            }
            this.f81719h0 = -9223372036854775807L;
        }
        this.f81729r0 = P();
        this.f81726q.n(cVar, this, this.f81714d.b(this.L));
    }

    private boolean n0() {
        return this.R || U();
    }

    public static /* synthetic */ void z(t0 t0Var) {
        if (t0Var.f81733t0) {
            return;
        }
        ((b0.a) zj.p.q(t0Var.f81736x)).g(t0Var);
    }

    o8.s0 T() {
        return g0(new f(0, true));
    }

    boolean V(int i15) {
        return !n0() && this.A[i15].I(this.f81731s0);
    }

    void Z() throws IOException {
        this.f81726q.k(this.f81714d.b(this.L));
    }

    @Override // h8.b0, h8.a1
    public long a() {
        return d();
    }

    void a0(int i15) throws IOException {
        this.A[i15].K();
        Z();
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return !this.f81731s0 && this.f81726q.i() && this.f81730s.e();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        if (this.f81731s0 || this.f81726q.h() || this.f81727q0) {
            return false;
        }
        if ((this.D || this.f81724n != null) && this.X == 0) {
            return false;
        }
        boolean zF = this.f81730s.f();
        if (this.f81726q.i()) {
            return zF;
        }
        m0();
        return true;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void g(c cVar, long j15, long j16, boolean z15) {
        y7.w wVar = cVar.f81749c;
        x xVar = new x(cVar.f81747a, cVar.f81757k, wVar.r(), wVar.s(), j15, j16, wVar.q());
        this.f81714d.c(cVar.f81747a);
        this.f81715e.k(xVar, 1, -1, null, 0, null, cVar.f81756j, this.I);
        if (z15) {
            return;
        }
        for (y0 y0Var : this.A) {
            y0Var.R();
        }
        if (this.X > 0) {
            ((b0.a) zj.p.q(this.f81736x)).g(this);
        }
    }

    @Override // h8.b0, h8.a1
    public long d() {
        long jQ;
        M();
        if (this.f81731s0 || this.X == 0) {
            return Long.MIN_VALUE;
        }
        if (U()) {
            return this.f81719h0;
        }
        if (this.E) {
            int length = this.A.length;
            jQ = Long.MAX_VALUE;
            for (int i15 = 0; i15 < length; i15++) {
                g gVar = this.G;
                if (gVar.f81766b[i15] && gVar.f81767c[i15] && !this.A[i15].H()) {
                    jQ = Math.min(jQ, this.A[i15].x());
                }
            }
        } else {
            jQ = Long.MAX_VALUE;
        }
        if (jQ == Long.MAX_VALUE) {
            jQ = Q(false);
        }
        return jQ == Long.MIN_VALUE ? this.Z : jQ;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void r(c cVar, long j15, long j16) {
        if (this.I == -9223372036854775807L && this.H != null) {
            long jQ = Q(true);
            long j17 = jQ == Long.MIN_VALUE ? 0L : jQ + 10000;
            this.I = j17;
            this.f81717g.o(j17, this.H, this.K);
        }
        y7.w wVar = cVar.f81749c;
        x xVar = new x(cVar.f81747a, cVar.f81757k, wVar.r(), wVar.s(), j15, j16, wVar.q());
        this.f81714d.c(cVar.f81747a);
        this.f81715e.m(xVar, 1, -1, null, 0, null, cVar.f81756j, this.I);
        this.f81731s0 = true;
        ((b0.a) zj.p.q(this.f81736x)).g(this);
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
        if (this.X <= 0 || U() || !S()) {
            return;
        }
        this.f81731s0 = true;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public k8.l.c l(c cVar, long j15, long j16, IOException iOException, int i15) {
        c cVar2;
        k8.l.c cVarG;
        y7.w wVar = cVar.f81749c;
        x xVar = new x(cVar.f81747a, cVar.f81757k, wVar.r(), wVar.s(), j15, j16, wVar.q());
        long jA = this.f81714d.a(new k8.j.a(xVar, new a0(1, -1, null, 0, null, w7.o0.g1(cVar.f81756j), w7.o0.g1(this.I)), iOException, i15));
        if (jA == -9223372036854775807L) {
            cVarG = k8.l.f109102g;
            cVar2 = cVar;
        } else {
            int iP = P();
            cVar2 = cVar;
            cVarG = N(cVar2, iP) ? k8.l.g(iP > this.f81729r0, jA) : k8.l.f109101f;
        }
        boolean zC = cVarG.c();
        this.f81715e.o(xVar, 1, -1, null, 0, null, cVar2.f81756j, this.I, iOException, !zC);
        if (!zC) {
            this.f81714d.c(cVar2.f81747a);
        }
        return cVarG;
    }

    @Override // o8.r
    public void f(final o8.l0 l0Var) {
        this.f81735w.post(new Runnable() { // from class: h8.s0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f81696a.k0(l0Var);
            }
        });
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void m(c cVar, long j15, long j16, int i15) {
        y7.w wVar = cVar.f81749c;
        this.f81715e.q(i15 == 0 ? new x(cVar.f81747a, cVar.f81757k, j15) : new x(cVar.f81747a, cVar.f81757k, wVar.r(), wVar.s(), j15, j16, wVar.q()), 1, -1, null, 0, null, cVar.f81756j, this.I, i15);
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        M();
        if (!this.H.e()) {
            return 0L;
        }
        o8.l0.a aVarC = this.H.c(j15);
        return f3Var.a(j15, aVarC.f143129a.f143158a, aVarC.f143130b.f143158a);
    }

    int h0(int i15, y1 y1Var, z7.f fVar, int i16) {
        if (n0()) {
            return -3;
        }
        X(i15);
        int iO = this.A[i15].O(y1Var, fVar, i16, this.f81731s0);
        if (iO == -3) {
            Y(i15);
        }
        return iO;
    }

    @Override // h8.b0
    public long i(long j15) {
        M();
        boolean[] zArr = this.G.f81766b;
        if (!this.H.e()) {
            j15 = 0;
        }
        int i15 = 0;
        this.R = false;
        boolean z15 = this.Z == j15;
        this.Z = j15;
        if (U()) {
            this.f81719h0 = j15;
            return j15;
        }
        if (this.L == 7 || ((!this.f81731s0 && !this.f81726q.i()) || !j0(zArr, j15, z15))) {
            this.f81727q0 = false;
            this.f81719h0 = j15;
            this.f81731s0 = false;
            this.T = false;
            if (this.f81726q.i()) {
                y0[] y0VarArr = this.A;
                int length = y0VarArr.length;
                while (i15 < length) {
                    y0VarArr[i15].r();
                    i15++;
                }
                this.f81726q.e();
                return j15;
            }
            this.f81726q.f();
            y0[] y0VarArr2 = this.A;
            int length2 = y0VarArr2.length;
            while (i15 < length2) {
                y0VarArr2[i15].R();
                i15++;
            }
        }
        return j15;
    }

    public void i0() {
        if (this.D) {
            for (y0 y0Var : this.A) {
                y0Var.N();
            }
        }
        this.f81726q.m(this);
        this.f81735w.removeCallbacksAndMessages(null);
        this.f81736x = null;
        this.f81733t0 = true;
    }

    @Override // h8.y0.d
    public void j(t7.p pVar) {
        this.f81735w.post(this.f81732t);
    }

    @Override // h8.b0
    public long k() {
        if (this.T) {
            this.T = false;
            return this.Z;
        }
        if (!this.R) {
            return -9223372036854775807L;
        }
        if (!this.f81731s0 && P() <= this.f81729r0) {
            return -9223372036854775807L;
        }
        this.R = false;
        return this.Z;
    }

    int l0(int i15, long j15) throws Throwable {
        if (n0()) {
            return 0;
        }
        X(i15);
        y0 y0Var = this.A[i15];
        int iC = y0Var.C(j15, this.f81731s0);
        y0Var.a0(iC);
        if (iC == 0) {
            Y(i15);
        }
        return iC;
    }

    @Override // h8.b0
    public long n(long j15) throws Throwable {
        this.O = j15;
        for (y0 y0Var : this.A) {
            y0Var.W(j15);
        }
        return j15;
    }

    @Override // k8.l.f
    public void o() {
        for (y0 y0Var : this.A) {
            y0Var.P();
        }
        this.f81728r.b();
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) throws Throwable {
        this.f81736x = aVar;
        if (this.f81724n == null) {
            this.f81730s.f();
            m0();
        } else {
            v(this.f81723m, 3).e(this.f81724n);
            k0(new o8.h0(new long[]{0}, new long[]{0}, -9223372036854775807L));
            s();
            this.f81719h0 = j15;
        }
    }

    @Override // h8.b0
    public void q() throws IOException {
        Z();
        if (this.f81731s0 && !this.D) {
            throw t7.x.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // o8.r
    public void s() {
        this.C = true;
        this.f81735w.post(this.f81732t);
    }

    @Override // h8.b0
    public j1 t() {
        M();
        return this.G.f81765a;
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        j8.r rVar;
        M();
        g gVar = this.G;
        j1 j1Var = gVar.f81765a;
        boolean[] zArr3 = gVar.f81767c;
        int i15 = this.X;
        int i16 = 0;
        for (int i17 = 0; i17 < rVarArr.length; i17++) {
            z0 z0Var = z0VarArr[i17];
            if (z0Var != null && (rVarArr[i17] == null || !zArr[i17])) {
                int i18 = ((e) z0Var).f81761a;
                zj.p.w(zArr3[i18]);
                this.X--;
                zArr3[i18] = false;
                z0VarArr[i17] = null;
            }
        }
        boolean z15 = !this.P ? j15 == 0 || this.F : i15 != 0;
        for (int i19 = 0; i19 < rVarArr.length; i19++) {
            if (z0VarArr[i19] == null && (rVar = rVarArr[i19]) != null) {
                zj.p.w(rVar.length() == 1);
                zj.p.w(rVar.e(0) == 0);
                int iD = j1Var.d(rVar.i());
                zj.p.w(!zArr3[iD]);
                this.X++;
                zArr3[iD] = true;
                this.T = rVar.l().f188387v | this.T;
                z0VarArr[i19] = new e(iD);
                zArr2[i19] = true;
                if (this.f81722l) {
                    z15 |= this.P;
                } else if (!z15) {
                    y0 y0Var = this.A[iD];
                    z15 = (y0Var.A() == 0 || y0Var.V(j15, true)) ? false : true;
                }
            }
        }
        if (this.f81722l) {
            int i25 = 0;
            while (true) {
                b[] bVarArr = this.f81738z;
                if (i25 >= bVarArr.length) {
                    break;
                }
                bVarArr[i25].j(zArr3[i25]);
                i25++;
            }
        }
        if (this.X == 0) {
            this.f81727q0 = false;
            this.R = false;
            this.T = false;
            if (this.f81726q.i()) {
                y0[] y0VarArr = this.A;
                int length = y0VarArr.length;
                while (i16 < length) {
                    y0VarArr[i16].r();
                    i16++;
                }
                this.f81726q.e();
            } else {
                this.f81731s0 = false;
                y0[] y0VarArr2 = this.A;
                int length2 = y0VarArr2.length;
                while (i16 < length2) {
                    y0VarArr2[i16].R();
                    i16++;
                }
            }
        } else if (z15) {
            j15 = i(j15);
            while (i16 < z0VarArr.length) {
                if (z0VarArr[i16] != null) {
                    zArr2[i16] = true;
                }
                i16++;
            }
        }
        this.P = true;
        return j15;
    }

    @Override // o8.r
    public o8.s0 v(int i15, int i16) {
        return g0(new f(i15, false));
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
        if (this.F) {
            return;
        }
        M();
        if (U()) {
            return;
        }
        boolean[] zArr = this.G.f81767c;
        int length = this.A.length;
        for (int i15 = 0; i15 < length; i15++) {
            this.A[i15].q(j15, z15, zArr[i15]);
        }
    }
}
