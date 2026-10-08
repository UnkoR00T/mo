package u;

import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import v.g2;
import v.h2;
import v.t3;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.camera.core.r f193478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    androidx.camera.core.r f193479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.camera.core.r f193480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w0.a f193481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f193482f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    x0 f193477a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k0 f193483g = null;

    class a extends v.s {
        a() {
        }

        public static /* synthetic */ void f(a aVar) {
            x0 x0Var = y.this.f193477a;
            if (x0Var != null) {
                x0Var.p();
            }
        }

        public static /* synthetic */ void g(a aVar, int i15) {
            x0 x0Var = y.this.f193477a;
            if (x0Var != null) {
                x0Var.o(i15);
            }
        }

        @Override // v.s
        public void d(int i15, final int i16) {
            z.a.d().execute(new Runnable() { // from class: u.w
                @Override // java.lang.Runnable
                public final void run() {
                    y.a.g(this.f193445a, i16);
                }
            });
        }

        @Override // v.s
        public void e(int i15) {
            z.a.d().execute(new Runnable() { // from class: u.x
                @Override // java.lang.Runnable
                public final void run() {
                    y.a.f(this.f193463a);
                }
            });
        }
    }

    class b implements a0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x0 f193485a;

        b(x0 x0Var) {
            this.f193485a = x0Var;
        }

        @Override // a0.c
        public void b(Throwable th4) {
            y.w.b();
            if (this.f193485a == y.this.f193477a) {
                o.e1.o("CaptureNode", "request aborted, id=" + y.this.f193477a.e());
                if (y.this.f193483g != null) {
                    y.this.f193483g.i();
                }
                y.this.f193477a = null;
            }
        }

        @Override // a0.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r15) {
        }
    }

    static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v.s f193488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u1 f193489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u1 f193490d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v.s f193487a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private u1 f193491e = null;

        class a extends v.s {
            a() {
            }
        }

        c() {
        }

        static c n(Size size, int i15, List<Integer> list, boolean z15, o.a1 a1Var, l0 l0Var) {
            return new u.b(size, i15, list, z15, a1Var, l0Var, new g0.u(), new g0.u());
        }

        v.s a() {
            return this.f193487a;
        }

        abstract g0.u<d1.a> b();

        abstract o.a1 c();

        abstract int d();

        abstract List<Integer> e();

        abstract l0 f();

        u1 g() {
            return this.f193491e;
        }

        abstract g0.u<x0> h();

        v.s i() {
            return this.f193488b;
        }

        u1 j() {
            return this.f193490d;
        }

        abstract Size k();

        u1 l() {
            u1 u1Var = this.f193489c;
            Objects.requireNonNull(u1Var);
            return u1Var;
        }

        abstract boolean m();

        void o(v.s sVar) {
            this.f193487a = sVar;
        }

        void p(Surface surface, Size size, int i15) {
            this.f193491e = new h2(surface, size, i15);
        }

        void q(v.s sVar) {
            this.f193488b = sVar;
        }

        void r(Surface surface) {
            i6.i.j(this.f193490d == null, "The secondary surface is already set.");
            this.f193490d = new h2(surface, k(), d());
        }

        void s(Surface surface) {
            i6.i.j(this.f193489c == null, "The surface is already set.");
            this.f193489c = new h2(surface, k(), d());
        }
    }

    y() {
    }

    public static /* synthetic */ void a(y yVar, g2 g2Var) {
        yVar.getClass();
        try {
            androidx.camera.core.o oVarC = g2Var.c();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("OnImageAvailableListener: mCurrentRequest ID = ");
            x0 x0Var = yVar.f193477a;
            sb5.append(x0Var == null ? null : Integer.valueOf(x0Var.e()));
            sb5.append(", image.isNull = ");
            sb5.append(oVarC == null);
            o.e1.a("CaptureNode", sb5.toString());
            if (oVarC != null) {
                yVar.k(oVarC);
                return;
            }
            x0 x0Var2 = yVar.f193477a;
            if (x0Var2 != null) {
                yVar.p(d1.a.c(x0Var2.e(), new o.v0(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e15) {
            x0 x0Var3 = yVar.f193477a;
            if (x0Var3 != null) {
                yVar.p(d1.a.c(x0Var3.e(), new o.v0(2, "Failed to acquire latest image", e15)));
            }
        }
    }

    public static /* synthetic */ void b(y yVar, x0 x0Var) {
        yVar.l(x0Var);
        yVar.f193483g.h(x0Var);
    }

    public static /* synthetic */ void d(androidx.camera.core.r rVar) {
        if (rVar != null) {
            rVar.j();
        }
    }

    public static /* synthetic */ void e(y yVar, g2 g2Var) {
        yVar.getClass();
        try {
            androidx.camera.core.o oVarC = g2Var.c();
            if (oVarC != null) {
                yVar.m(oVarC);
            }
        } catch (IllegalStateException e15) {
            o.e1.d("CaptureNode", "Failed to acquire latest image of postview", e15);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.r rVar) {
        if (rVar != null) {
            rVar.j();
        }
    }

    private static g2 h(o.a1 a1Var, int i15, int i16, int i17) {
        return a1Var != null ? a1Var.a(i15, i16, i17, 4, 0L) : androidx.camera.core.p.a(i15, i16, i17, 4);
    }

    private void j(androidx.camera.core.o oVar) {
        x0 x0Var;
        x0 x0Var2;
        y.w.b();
        w0.a aVar = this.f193481e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(w0.b.c(this.f193477a, oVar));
        x0 x0Var3 = this.f193477a;
        c cVar = this.f193482f;
        boolean z15 = cVar != null && cVar.e().size() > 1;
        if (z15 && (x0Var2 = this.f193477a) != null) {
            x0Var2.k().u(oVar.getFormat(), true);
        }
        if (!z15 || ((x0Var = this.f193477a) != null && x0Var.k().s())) {
            this.f193477a = null;
        }
        x0Var3.s();
    }

    private void m(androidx.camera.core.o oVar) {
        if (this.f193477a == null) {
            o.e1.o("CaptureNode", "Postview image is closed due to request completed or aborted");
            oVar.close();
        } else {
            w0.a aVar = this.f193481e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(w0.b.c(this.f193477a, oVar));
        }
    }

    private void o(c cVar, final androidx.camera.core.r rVar, final androidx.camera.core.r rVar2, final androidx.camera.core.r rVar3) {
        cVar.l().d();
        cVar.l().k().b(new Runnable() { // from class: u.s
            @Override // java.lang.Runnable
            public final void run() {
                rVar.j();
            }
        }, z.a.d());
        if (cVar.g() != null) {
            cVar.g().d();
            cVar.g().k().b(new Runnable() { // from class: u.t
                @Override // java.lang.Runnable
                public final void run() {
                    y.f(rVar3);
                }
            }, z.a.d());
        }
        if (cVar.e().size() <= 1 || cVar.j() == null) {
            return;
        }
        cVar.j().d();
        cVar.j().k().b(new Runnable() { // from class: u.u
            @Override // java.lang.Runnable
            public final void run() {
                y.d(rVar2);
            }
        }, z.a.d());
    }

    private void q(g2 g2Var) {
        g2Var.f(new g2.a() { // from class: u.v
            @Override // v.g2.a
            public final void a(g2 g2Var2) {
                y.a(this.f193442a, g2Var2);
            }
        }, z.a.d());
    }

    public int i() {
        y.w.b();
        i6.i.j(this.f193478b != null, "The ImageReader is not initialized.");
        return this.f193478b.i();
    }

    void k(androidx.camera.core.o oVar) {
        y.w.b();
        if (this.f193477a == null) {
            o.e1.o("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + oVar);
            oVar.close();
            return;
        }
        t3 t3VarD = oVar.v3().d();
        if (((Integer) t3VarD.d(this.f193477a.j())) != null) {
            j(oVar);
            return;
        }
        o.e1.o("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + this.f193477a.e() + ", ImageProxy tagBundle keys = " + t3VarD.e());
        oVar.close();
    }

    void l(x0 x0Var) {
        y.w.b();
        i6.i.j(x0Var.i().size() == 1, "only one capture stage is supported.");
        i6.i.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f193477a = x0Var;
        a0.f.b(x0Var.a(), new b(x0Var), z.a.a());
    }

    public void n() {
        y.w.b();
        c cVar = this.f193482f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.r rVar = this.f193478b;
        Objects.requireNonNull(rVar);
        o(cVar, rVar, this.f193479c, this.f193480d);
    }

    void p(d1.a aVar) {
        y.w.b();
        x0 x0Var = this.f193477a;
        if (x0Var == null || x0Var.e() != aVar.b()) {
            return;
        }
        this.f193477a.n(aVar.a());
    }

    public void r(androidx.camera.core.e.a aVar) {
        y.w.b();
        i6.i.j(this.f193478b != null, "The ImageReader is not initialized.");
        this.f193478b.k(aVar);
    }

    public w0.a s(c cVar) {
        i6.a<x0> aVar;
        g2 g2Var;
        androidx.camera.core.q qVar;
        g2 g2Var2;
        i6.i.j(this.f193482f == null && this.f193478b == null, "CaptureNode does not support recreation yet.");
        this.f193482f = cVar;
        Size sizeK = cVar.k();
        int iD = cVar.d();
        boolean zM = cVar.m();
        v.s aVar2 = new a();
        boolean z15 = cVar.e().size() > 1;
        v.s sVarB = null;
        if (zM || cVar.c() != null) {
            k0 k0Var = new k0(h(cVar.c(), sizeK.getWidth(), sizeK.getHeight(), iD));
            this.f193483g = k0Var;
            aVar = new i6.a() { // from class: u.p
                @Override // i6.a
                public final void accept(Object obj) {
                    y.b(this.f193424a, (x0) obj);
                }
            };
            g2Var = k0Var;
            qVar = null;
        } else {
            if (z15) {
                androidx.camera.core.q qVar2 = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), 256, 4);
                v.s sVarB2 = v.t.b(aVar2, qVar2.n());
                qVar = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), 32, 4);
                v.s[] sVarArr = {aVar2, qVar.n()};
                aVar2 = sVarB2;
                sVarB = v.t.b(sVarArr);
                g2Var2 = qVar2;
            } else {
                androidx.camera.core.q qVar3 = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), iD, 4);
                aVar2 = v.t.b(aVar2, qVar3.n());
                g2Var2 = qVar3;
                qVar = null;
            }
            aVar = new i6.a() { // from class: u.o
                @Override // i6.a
                public final void accept(Object obj) {
                    this.f193422a.l((x0) obj);
                }
            };
            g2Var = g2Var2;
        }
        cVar.o(aVar2);
        if (z15 && sVarB != null) {
            cVar.q(sVarB);
        }
        Surface surface = g2Var.getSurface();
        Objects.requireNonNull(surface);
        cVar.s(surface);
        this.f193478b = new androidx.camera.core.r(g2Var);
        q(g2Var);
        l0 l0VarF = cVar.f();
        if (l0VarF != null) {
            g2 g2VarH = h(cVar.c(), l0VarF.c().getWidth(), l0VarF.c().getHeight(), l0VarF.b());
            g2VarH.f(new g2.a() { // from class: u.q
                @Override // v.g2.a
                public final void a(g2 g2Var3) {
                    y.e(this.f193427a, g2Var3);
                }
            }, z.a.d());
            this.f193480d = new androidx.camera.core.r(g2VarH);
            cVar.p(g2VarH.getSurface(), l0VarF.c(), l0VarF.b());
        }
        if (z15 && qVar != null) {
            cVar.r(qVar.getSurface());
            this.f193479c = new androidx.camera.core.r(qVar);
            q(qVar);
        }
        cVar.h().a(aVar);
        cVar.b().a(new i6.a() { // from class: u.r
            @Override // i6.a
            public final void accept(Object obj) {
                this.f193430a.p((d1.a) obj);
            }
        });
        w0.a aVarE = w0.a.e(cVar.d(), cVar.e());
        this.f193481e = aVarE;
        return aVarE;
    }
}
