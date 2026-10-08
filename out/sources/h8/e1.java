package h8;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class e1 extends h8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y7.j f81555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y7.f.a f81556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t7.p f81557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f81558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final k8.j f81559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f81560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t7.e0 f81561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.s f81562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zj.w<l8.a> f81563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private y7.x f81564q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y7.f.a f81565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k8.j f81566b = new k8.i();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f81567c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f81568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f81569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private zj.w<l8.a> f81570f;

        public b(y7.f.a aVar) {
            this.f81565a = (y7.f.a) zj.p.q(aVar);
        }

        public e1 a(t7.s.k kVar, long j15) {
            return new e1(this.f81569e, kVar, this.f81565a, j15, this.f81566b, this.f81567c, this.f81568d, this.f81570f);
        }

        public b b(k8.j jVar) {
            if (jVar == null) {
                jVar = new k8.i();
            }
            this.f81566b = jVar;
            return this;
        }
    }

    @Override // h8.a
    protected void A() {
    }

    @Override // h8.c0
    public t7.s b() {
        return this.f81562o;
    }

    @Override // h8.c0
    public b0 e(c0.b bVar, k8.b bVar2, long j15) {
        y7.j jVar = this.f81555h;
        y7.f.a aVar = this.f81556i;
        y7.x xVar = this.f81564q;
        t7.p pVar = this.f81557j;
        long j16 = this.f81558k;
        k8.j jVar2 = this.f81559l;
        j0.a aVarT = t(bVar);
        boolean z15 = this.f81560m;
        zj.w<l8.a> wVar = this.f81563p;
        return new d1(jVar, aVar, xVar, pVar, j16, jVar2, aVarT, z15, wVar != null ? wVar.get() : null);
    }

    @Override // h8.c0
    public void j() {
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        ((d1) b0Var).x();
    }

    @Override // h8.a
    protected void y(y7.x xVar) {
        this.f81564q = xVar;
        z(this.f81561n);
    }

    private e1(String str, t7.s.k kVar, y7.f.a aVar, long j15, k8.j jVar, boolean z15, Object obj, zj.w<l8.a> wVar) {
        this.f81556i = aVar;
        this.f81558k = j15;
        this.f81559l = jVar;
        this.f81560m = z15;
        t7.s sVarA = new t7.s.c().f(Uri.EMPTY).c(kVar.f188554a.toString()).d(ak.n0.E(kVar)).e(obj).a();
        this.f81562o = sVarA;
        t7.p.b bVarM0 = new t7.p.b().A0((String) zj.j.a(kVar.f188555b, "text/x-unknown")).o0(kVar.f188556c).C0(kVar.f188557d).y0(kVar.f188558e).m0(kVar.f188559f);
        String str2 = kVar.f188560g;
        this.f81557j = bVarM0.k0(str2 != null ? str2 : str).Q();
        this.f81555h = new y7.j.b().h(kVar.f188554a).b(1).a();
        this.f81561n = new c1(j15, true, false, false, null, sVarA);
        this.f81563p = wVar;
    }
}
