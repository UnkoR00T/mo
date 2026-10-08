package m8;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import t7.m0;

/* JADX INFO: loaded from: classes3.dex */
final class e implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f124270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f124271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f124272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue<l0.b> f124273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f124274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t7.p f124275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f124276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l0.a f124277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f124278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t f124279j;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t7.p f124280a;

        private b() {
        }

        @Override // m8.y.a
        public void a(final m0 m0Var) {
            this.f124280a = new t7.p.b().F0(m0Var.f188333a).i0(m0Var.f188334b).A0("video/raw").Q();
            e.this.f124278i.execute(new Runnable() { // from class: m8.h
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.f124277h.a(m0Var);
                }
            });
        }

        @Override // m8.y.a
        public void b() {
            e.this.f124278i.execute(new Runnable() { // from class: m8.g
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.f124277h.g();
                }
            });
            ((l0.b) e.this.f124273d.remove()).a();
        }

        @Override // m8.y.a
        public void c(long j15, long j16, boolean z15) {
            if (z15 && e.this.f124274e != null) {
                e.this.f124278i.execute(new Runnable() { // from class: m8.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.f124277h.d();
                    }
                });
            }
            t7.p pVarQ = this.f124280a;
            if (pVarQ == null) {
                pVarQ = new t7.p.b().Q();
            }
            e.this.f124279j.d(j16, j15, pVarQ, null);
            ((l0.b) e.this.f124273d.remove()).b(j15);
        }
    }

    public e(u uVar, v vVar, w7.h hVar) {
        this.f124270a = uVar;
        this.f124271b = vVar;
        uVar.m(hVar);
        this.f124272c = new y(new b(), uVar, vVar);
        this.f124273d = new ArrayDeque();
        this.f124275f = new t7.p.b().Q();
        this.f124276g = -9223372036854775807L;
        this.f124277h = l0.a.f124379a;
        this.f124278i = new Executor() { // from class: m8.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                e.a(runnable);
            }
        };
        this.f124279j = new t() { // from class: m8.c
            @Override // m8.t
            public final void d(long j15, long j16, t7.p pVar, MediaFormat mediaFormat) {
                e.g(j15, j16, pVar, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void g(long j15, long j16, t7.p pVar, MediaFormat mediaFormat) {
    }

    @Override // m8.l0
    public void b() {
    }

    @Override // m8.l0
    public boolean c() {
        return true;
    }

    @Override // m8.l0
    public boolean e() {
        return this.f124272c.d();
    }

    @Override // m8.l0
    public void f() {
        throw new UnsupportedOperationException();
    }

    @Override // m8.l0
    public Surface getInputSurface() {
        return (Surface) zj.p.q(this.f124274e);
    }

    @Override // m8.l0
    public void h(long j15, long j16) throws l0.c {
        try {
            this.f124272c.j(j15, j16);
        } catch (a8.w e15) {
            throw new l0.c(e15, this.f124275f);
        }
    }

    @Override // m8.l0
    public void i(l0.a aVar, Executor executor) {
        this.f124277h = aVar;
        this.f124278i = executor;
    }

    @Override // m8.l0
    public void j(int i15, t7.p pVar, long j15, int i16, List<Object> list) {
        zj.p.w(list.isEmpty());
        int i17 = pVar.f188388w;
        t7.p pVar2 = this.f124275f;
        if (i17 != pVar2.f188388w || pVar.f188389x != pVar2.f188389x) {
            this.f124272c.i(i17, pVar.f188389x);
        }
        float f15 = pVar.A;
        if (f15 != this.f124275f.A) {
            this.f124270a.n(f15);
        }
        this.f124275f = pVar;
        if (j15 != this.f124276g) {
            this.f124272c.h(i16, j15);
            this.f124276g = j15;
        }
    }

    @Override // m8.l0
    public void k(long j15) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.l0
    public void l() {
        this.f124272c.l();
    }

    @Override // m8.l0
    public boolean m(long j15, l0.b bVar) {
        this.f124273d.add(bVar);
        this.f124272c.g(j15);
        this.f124278i.execute(new Runnable() { // from class: m8.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f124266a.f124277h.b();
            }
        });
        return true;
    }

    @Override // m8.l0
    public void n(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // m8.l0
    public boolean o(boolean z15) {
        return this.f124270a.d(z15);
    }

    @Override // m8.l0
    public boolean p(t7.p pVar) {
        return true;
    }

    @Override // m8.l0
    public void q() {
        this.f124270a.a();
    }

    @Override // m8.l0
    public void r() {
        this.f124271b.d();
        this.f124270a.i();
    }

    @Override // m8.l0
    public void s(t tVar) {
        this.f124279j = tVar;
    }

    @Override // m8.l0
    public void t() {
        this.f124271b.d();
        this.f124270a.h();
    }

    @Override // m8.l0
    public void u(int i15) {
        this.f124270a.l(i15);
    }

    @Override // m8.l0
    public void v(float f15) {
        this.f124270a.p(f15);
    }

    @Override // m8.l0
    public void w() {
        this.f124274e = null;
        this.f124270a.o(null);
    }

    @Override // m8.l0
    public void x(Surface surface, w7.d0 d0Var) {
        this.f124274e = surface;
        this.f124270a.o(surface);
    }

    @Override // m8.l0
    public void y(boolean z15) {
        if (z15) {
            this.f124270a.k();
        }
        this.f124271b.d();
        this.f124272c.b();
        this.f124273d.clear();
    }

    @Override // m8.l0
    public void z(boolean z15) {
        this.f124270a.e(z15);
    }
}
