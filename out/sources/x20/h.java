package x20;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f216543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f216544b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f216545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f216546d;

    class a implements j {
        a() {
        }

        @Override // x20.j
        public void a() {
            h.this.f216544b = true;
            if (!h.this.f216545c || h.this.f216543a == null || h.this.f216543a.getSurface() == null) {
                return;
            }
            h hVar = h.this;
            hVar.f216546d = hVar.f216543a.getSurface().a();
            if (h.this.f216546d != null) {
                h.this.f216546d.start();
            }
        }

        @Override // x20.j
        public void b() {
            h.this.f216544b = false;
            if (h.this.f216546d != null) {
                h.this.f216546d.p();
            }
        }
    }

    public h() {
    }

    private void f() {
        d dVar = this.f216543a;
        if (dVar == null || dVar.getSurface() == null) {
            return;
        }
        this.f216543a.getSurface().c(new a());
    }

    public void g(d dVar) {
        this.f216543a = dVar;
        f();
    }

    public void h() {
        d dVar = this.f216543a;
        if (dVar == null || !this.f216544b || dVar.getSurface() == null) {
            return;
        }
        g gVar = this.f216546d;
        if (gVar == null || !gVar.n()) {
            this.f216543a.getSurface().b();
            g gVarA = this.f216543a.getSurface().a();
            this.f216546d = gVarA;
            if (gVarA != null) {
                gVarA.start();
            }
        }
    }

    public void i() {
        g gVar = this.f216546d;
        if (gVar != null) {
            gVar.p();
        }
    }

    public h(boolean z15) {
        this.f216545c = z15;
    }
}
