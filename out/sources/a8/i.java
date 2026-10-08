package a8;

/* JADX INFO: loaded from: classes3.dex */
final class i implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3 f4498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z2 f4500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c2 f4501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4502e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4503f;

    public interface a {
        void u(t7.z zVar);
    }

    public i(a aVar, w7.h hVar) {
        this.f4499b = aVar;
        this.f4498a = new g3(hVar);
    }

    private boolean e(boolean z15) {
        z2 z2Var = this.f4500c;
        if (z2Var == null || z2Var.e()) {
            return true;
        }
        if (z15 && this.f4500c.getState() != 2) {
            return true;
        }
        if (this.f4500c.f()) {
            return false;
        }
        return z15 || this.f4500c.n();
    }

    private void j(boolean z15) {
        if (e(z15)) {
            this.f4502e = true;
            if (this.f4503f) {
                this.f4498a.b();
                return;
            }
            return;
        }
        c2 c2Var = (c2) zj.p.q(this.f4501d);
        long jM = c2Var.m();
        if (this.f4502e) {
            if (jM < this.f4498a.m()) {
                this.f4498a.c();
                return;
            } else {
                this.f4502e = false;
                if (this.f4503f) {
                    this.f4498a.b();
                }
            }
        }
        this.f4498a.a(jM);
        t7.z zVarD = c2Var.d();
        if (zVarD.equals(this.f4498a.d())) {
            return;
        }
        this.f4498a.i(zVarD);
        this.f4499b.u(zVarD);
    }

    public void a(z2 z2Var) {
        if (z2Var == this.f4500c) {
            this.f4501d = null;
            this.f4500c = null;
            this.f4502e = true;
        }
    }

    public void b(z2 z2Var) throws w {
        c2 c2Var;
        c2 c2VarS = z2Var.S();
        if (c2VarS == null || c2VarS == (c2Var = this.f4501d)) {
            return;
        }
        if (c2Var != null) {
            throw w.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f4501d = c2VarS;
        this.f4500c = z2Var;
        c2VarS.i(this.f4498a.d());
    }

    public void c(long j15) {
        this.f4498a.a(j15);
    }

    @Override // a8.c2
    public t7.z d() {
        c2 c2Var = this.f4501d;
        return c2Var != null ? c2Var.d() : this.f4498a.d();
    }

    public void f() {
        this.f4503f = true;
        this.f4498a.b();
    }

    public void g() {
        this.f4503f = false;
        this.f4498a.c();
    }

    public long h(boolean z15) {
        j(z15);
        return m();
    }

    @Override // a8.c2
    public void i(t7.z zVar) {
        c2 c2Var = this.f4501d;
        if (c2Var != null) {
            c2Var.i(zVar);
            zVar = this.f4501d.d();
        }
        this.f4498a.i(zVar);
    }

    @Override // a8.c2
    public long m() {
        return this.f4502e ? this.f4498a.m() : ((c2) zj.p.q(this.f4501d)).m();
    }

    @Override // a8.c2
    public boolean z() {
        return this.f4502e ? this.f4498a.z() : ((c2) zj.p.q(this.f4501d)).z();
    }
}
