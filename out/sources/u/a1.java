package u;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n1 f193324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n1.a f193325b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f193328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f193329f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f193332i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f193330g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f193331h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f193326c = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: u.y0
        @Override // androidx.concurrent.futures.c.InterfaceC0250c
        public final Object a(androidx.concurrent.futures.c.a aVar) {
            return a1.j(this.f193493a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f193327d = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: u.z0
        @Override // androidx.concurrent.futures.c.InterfaceC0250c
        public final Object a(androidx.concurrent.futures.c.a aVar) {
            return a1.k(this.f193495a, aVar);
        }
    });

    a1(n1 n1Var, n1.a aVar) {
        this.f193324a = n1Var;
        this.f193325b = aVar;
    }

    public static /* synthetic */ Object j(a1 a1Var, androidx.concurrent.futures.c.a aVar) {
        a1Var.f193328e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(a1 a1Var, androidx.concurrent.futures.c.a aVar) {
        a1Var.f193329f = aVar;
        return "RequestCompleteFuture";
    }

    private void l(o.v0 v0Var) {
        y.w.b();
        this.f193330g = true;
        com.google.common.util.concurrent.q<Void> qVar = this.f193332i;
        Objects.requireNonNull(qVar);
        qVar.cancel(true);
        this.f193328e.f(v0Var);
        this.f193329f.c(null);
    }

    private void o() {
        i6.i.j(this.f193326c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void r() {
        if (!this.f193324a.t() || this.f193324a.s()) {
            if (!this.f193324a.t()) {
                i6.i.j(!this.f193327d.isDone(), "The callback can only complete once.");
            }
            this.f193329f.c(null);
        }
    }

    private void s(o.v0 v0Var) {
        y.w.b();
        this.f193324a.x(v0Var);
    }

    @Override // u.c1
    public void a(int i15) {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        this.f193324a.w(i15);
    }

    @Override // u.c1
    public void b(Bitmap bitmap) {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        this.f193324a.y(bitmap);
    }

    @Override // u.c1
    public void c() {
        y.w.b();
        if (this.f193330g || this.f193331h) {
            return;
        }
        this.f193331h = true;
        this.f193324a.j();
        o.t0.g gVarL = this.f193324a.l();
        if (gVarL != null) {
            gVarL.c();
        }
    }

    @Override // u.c1
    public void d(androidx.camera.core.o oVar) {
        y.w.b();
        if (this.f193330g) {
            oVar.close();
            return;
        }
        o();
        r();
        this.f193324a.z(oVar);
    }

    @Override // u.c1
    public boolean e() {
        return this.f193330g;
    }

    @Override // u.c1
    public void f(o.v0 v0Var) {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        o();
        r();
        s(v0Var);
    }

    @Override // u.c1
    public void g() {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        if (!this.f193331h) {
            c();
        }
        this.f193328e.c(null);
    }

    @Override // u.c1
    public void h(o.t0.i iVar) {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        o();
        r();
        this.f193324a.A(iVar);
    }

    @Override // u.c1
    public void i(o.v0 v0Var) {
        y.w.b();
        if (this.f193330g) {
            return;
        }
        boolean zF = this.f193324a.f();
        if (!zF) {
            s(v0Var);
        }
        r();
        this.f193328e.f(v0Var);
        if (zF) {
            this.f193325b.d(this.f193324a);
        }
    }

    void m(o.v0 v0Var) {
        y.w.b();
        if (this.f193327d.isDone()) {
            return;
        }
        l(v0Var);
        s(v0Var);
    }

    void n() {
        y.w.b();
        if (this.f193327d.isDone()) {
            return;
        }
        l(new o.v0(3, "The request is aborted silently and retried.", null));
        this.f193325b.d(this.f193324a);
    }

    com.google.common.util.concurrent.q<Void> p() {
        y.w.b();
        return this.f193326c;
    }

    com.google.common.util.concurrent.q<Void> q() {
        y.w.b();
        return this.f193327d;
    }

    public void t(com.google.common.util.concurrent.q<Void> qVar) {
        y.w.b();
        i6.i.j(this.f193332i == null, "CaptureRequestFuture can only be set once.");
        this.f193332i = qVar;
    }
}
