package h8;

import android.net.Uri;
import android.os.Looper;
import b8.e2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends h8.a implements t0.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y7.f.a f81774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final o0.a f81775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d8.u f81776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k8.j f81777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f81778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f81779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f81780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.p f81781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zj.w<l8.a> f81782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f81783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f81784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f81785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f81786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f81787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y7.x f81788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t7.s f81789w;

    class a extends v {
        a(t7.e0 e0Var) {
            super(e0Var);
        }

        @Override // h8.v, t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            super.g(i15, bVar, z15);
            bVar.f188141f = true;
            return bVar;
        }

        @Override // h8.v, t7.e0
        public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
            super.o(i15, cVar, j15);
            cVar.f188163k = true;
            return cVar;
        }
    }

    public static final class b implements k0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y7.f.a f81791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o0.a f81792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d8.w f81793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private k8.j f81794f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f81795g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private zj.w<l8.a> f81796h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f81797i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private t7.p f81798j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f81799k;

        public b(y7.f.a aVar, final o8.u uVar) {
            this(aVar, new o0.a() { // from class: h8.v0
                @Override // h8.o0.a
                public final o0 a(e2 e2Var) {
                    return u0.b.i(uVar, e2Var);
                }
            });
        }

        public static /* synthetic */ o0 i(o8.u uVar, e2 e2Var) {
            return new c(uVar);
        }

        @Override // h8.c0.a
        public c0.a g(zj.w<l8.a> wVar) {
            this.f81796h = wVar;
            return this;
        }

        @Override // h8.c0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u0 d(t7.s sVar) {
            zj.p.q(sVar.f188433b);
            return new u0(sVar, this.f81791c, this.f81792d, this.f81793e.a(sVar), this.f81794f, this.f81795g, this.f81799k, this.f81797i, this.f81798j, this.f81796h, null);
        }

        b k(int i15, t7.p pVar) {
            this.f81797i = i15;
            this.f81798j = (t7.p) zj.p.q(pVar);
            return this;
        }

        @Override // h8.c0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(d8.w wVar) {
            this.f81793e = (d8.w) zj.p.r(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // h8.c0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e(k8.j jVar) {
            this.f81794f = (k8.j) zj.p.r(jVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b n(boolean z15) {
            this.f81799k = z15;
            return this;
        }

        public b(y7.f.a aVar, o0.a aVar2) {
            this(aVar, aVar2, new d8.l(), new k8.i(), PKIFailureInfo.badCertTemplate);
        }

        public b(y7.f.a aVar, o0.a aVar2, d8.w wVar, k8.j jVar, int i15) {
            this.f81791c = aVar;
            this.f81792d = aVar2;
            this.f81793e = wVar;
            this.f81794f = jVar;
            this.f81795g = i15;
        }
    }

    /* synthetic */ u0(t7.s sVar, y7.f.a aVar, o0.a aVar2, d8.u uVar, k8.j jVar, int i15, boolean z15, int i16, t7.p pVar, zj.w wVar, a aVar3) {
        this(sVar, aVar, aVar2, uVar, jVar, i15, z15, i16, pVar, wVar);
    }

    private t7.s.h B() {
        return (t7.s.h) zj.p.q(b().f188433b);
    }

    private void C() {
        t7.e0 c1Var = new c1(this.f81784r, this.f81785s, false, this.f81786t, null, b());
        if (this.f81783q) {
            c1Var = new a(c1Var);
        }
        z(c1Var);
    }

    @Override // h8.a
    protected void A() {
        this.f81776j.b();
    }

    @Override // h8.c0
    public synchronized t7.s b() {
        return this.f81789w;
    }

    @Override // h8.c0
    public synchronized void c(t7.s sVar) {
        this.f81789w = sVar;
    }

    @Override // h8.c0
    public b0 e(c0.b bVar, k8.b bVar2, long j15) {
        y7.f fVarA = this.f81774h.a();
        y7.x xVar = this.f81788v;
        if (xVar != null) {
            fVarA.m(xVar);
        }
        t7.s.h hVarB = B();
        Uri uri = hVarB.f188528a;
        o0 o0VarA = this.f81775i.a(w());
        d8.u uVar = this.f81776j;
        d8.t.a aVarR = r(bVar);
        k8.j jVar = this.f81777k;
        j0.a aVarT = t(bVar);
        String str = hVarB.f188532e;
        int i15 = this.f81778l;
        boolean z15 = this.f81779m;
        int i16 = this.f81780n;
        t7.p pVar = this.f81781o;
        long jJ0 = w7.o0.J0(hVarB.f188536i);
        zj.w<l8.a> wVar = this.f81782p;
        return new t0(uri, fVarA, o0VarA, uVar, aVarR, jVar, aVarT, this, bVar2, str, i15, z15, i16, pVar, jJ0, wVar != null ? wVar.get() : null);
    }

    @Override // h8.c0
    public void j() {
    }

    @Override // h8.t0.d
    public void o(long j15, o8.l0 l0Var, boolean z15) {
        if (this.f81787u && l0Var.b()) {
            return;
        }
        this.f81787u = !l0Var.b();
        if (j15 == -9223372036854775807L) {
            j15 = this.f81784r;
        }
        boolean zE = l0Var.e();
        if (!this.f81783q && this.f81784r == j15 && this.f81785s == zE && this.f81786t == z15) {
            return;
        }
        this.f81784r = j15;
        this.f81785s = zE;
        this.f81786t = z15;
        this.f81783q = false;
        C();
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        ((t0) b0Var).i0();
    }

    @Override // h8.a
    protected void y(y7.x xVar) {
        this.f81788v = xVar;
        this.f81776j.d((Looper) zj.p.q(Looper.myLooper()), w());
        this.f81776j.a();
        C();
    }

    private u0(t7.s sVar, y7.f.a aVar, o0.a aVar2, d8.u uVar, k8.j jVar, int i15, boolean z15, int i16, t7.p pVar, zj.w<l8.a> wVar) {
        this.f81789w = sVar;
        this.f81774h = aVar;
        this.f81775i = aVar2;
        this.f81776j = uVar;
        this.f81777k = jVar;
        this.f81778l = i15;
        this.f81779m = z15;
        this.f81781o = pVar;
        this.f81780n = i16;
        this.f81783q = true;
        this.f81784r = -9223372036854775807L;
        this.f81782p = wVar;
    }
}
