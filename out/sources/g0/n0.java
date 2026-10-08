package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o.h2;
import o.v1;
import v.n3;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f69065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f69067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f69069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n3 f69070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69072i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h2 f69074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f69075l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69073j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<Runnable> f69076m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69077n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<i6.a<h2.h>> f69078o = new ArrayList();

    static class a extends u1 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final com.google.common.util.concurrent.q<Surface> f69079o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        androidx.concurrent.futures.c.a<Surface> f69080p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private u1 f69081q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private q0 f69082r;

        a(Size size, int i15) {
            super(size, i15);
            this.f69079o = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: g0.l0
                @Override // androidx.concurrent.futures.c.InterfaceC0250c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return n0.a.r(this.f69060a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            q0 q0Var = aVar.f69082r;
            if (q0Var != null) {
                q0Var.u();
            }
            if (aVar.f69081q == null) {
                aVar.f69080p.d();
            }
            aVar.f69081q = null;
        }

        public static /* synthetic */ Object r(a aVar, androidx.concurrent.futures.c.a aVar2) {
            aVar.f69080p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // v.u1
        public void d() {
            super.d();
            y.w.e(new Runnable() { // from class: g0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.q(this.f69057a);
                }
            });
        }

        @Override // v.u1
        protected com.google.common.util.concurrent.q<Surface> o() {
            return this.f69079o;
        }

        boolean s() {
            y.w.b();
            return this.f69081q == null && !m();
        }

        public void t(q0 q0Var) {
            i6.i.j(this.f69082r == null, "Consumer can only be linked once.");
            this.f69082r = q0Var;
        }

        public boolean u(final u1 u1Var, Runnable runnable) {
            y.w.b();
            i6.i.g(u1Var);
            u1 u1Var2 = this.f69081q;
            if (u1Var2 == u1Var) {
                return false;
            }
            i6.i.j(u1Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            i6.i.b(h().equals(u1Var.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), u1Var.h()));
            i6.i.b(i() == u1Var.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(u1Var.i())));
            i6.i.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f69081q = u1Var;
            a0.f.j(u1Var.j(), this.f69080p);
            u1Var.l();
            k().b(new Runnable() { // from class: g0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    u1Var.e();
                }
            }, z.a.a());
            u1Var.f().b(runnable, z.a.d());
            return true;
        }
    }

    public n0(int i15, int i16, n3 n3Var, Matrix matrix, boolean z15, Rect rect, int i17, int i18, boolean z16) {
        this.f69069f = i15;
        this.f69064a = i16;
        this.f69070g = n3Var;
        this.f69065b = matrix;
        this.f69066c = z15;
        this.f69067d = rect;
        this.f69072i = i17;
        this.f69071h = i18;
        this.f69068e = z16;
        this.f69075l = new a(n3Var.f(), i16);
    }

    public static /* synthetic */ void a(final n0 n0Var) {
        n0Var.getClass();
        z.a.d().execute(new Runnable() { // from class: g0.i0
            @Override // java.lang.Runnable
            public final void run() {
                n0.b(this.f69052a);
            }
        });
    }

    public static /* synthetic */ void b(n0 n0Var) {
        if (n0Var.f69077n) {
            return;
        }
        n0Var.v();
    }

    public static /* synthetic */ void c(n0 n0Var, int i15, int i16) {
        boolean z15;
        boolean z16 = true;
        if (n0Var.f69072i != i15) {
            n0Var.f69072i = i15;
            z15 = true;
        } else {
            z15 = false;
        }
        if (n0Var.f69071h != i16) {
            n0Var.f69071h = i16;
        } else {
            z16 = z15;
        }
        if (z16) {
            n0Var.x();
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.q d(n0 n0Var, final a aVar, int i15, v1.a aVar2, v1.a aVar3, Surface surface) {
        n0Var.getClass();
        i6.i.g(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, n0Var.t(), i15, n0Var.f69070g.f(), aVar2, aVar3, n0Var.f69065b);
            q0Var.r().b(new Runnable() { // from class: g0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, z.a.a());
            aVar.t(q0Var);
            return a0.f.h(q0Var);
        } catch (u1.a e15) {
            return a0.f.f(e15);
        }
    }

    private void g() {
        i6.i.j(!this.f69073j, "Consumer can only be linked once.");
        this.f69073j = true;
    }

    private void h() {
        i6.i.j(!this.f69077n, "Edge is already closed.");
    }

    private void x() {
        y.w.b();
        h2.h hVarG = h2.h.g(this.f69067d, this.f69072i, this.f69071h, u(), this.f69065b, this.f69068e);
        h2 h2Var = this.f69074k;
        if (h2Var != null) {
            h2Var.v(hVarG);
        }
        Iterator<i6.a<h2.h>> it = this.f69078o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    public void e(Runnable runnable) {
        y.w.b();
        h();
        this.f69076m.add(runnable);
    }

    public void f(i6.a<h2.h> aVar) {
        i6.i.g(aVar);
        this.f69078o.add(aVar);
    }

    public final void i() {
        y.w.b();
        this.f69075l.d();
        this.f69077n = true;
        this.f69078o.clear();
        this.f69076m.clear();
    }

    public com.google.common.util.concurrent.q<v1> j(final int i15, final v1.a aVar, final v1.a aVar2) {
        y.w.b();
        h();
        g();
        final a aVar3 = this.f69075l;
        return a0.f.o(aVar3.j(), new a0.a() { // from class: g0.g0
            @Override // a0.a
            public final com.google.common.util.concurrent.q apply(Object obj) {
                return n0.d(this.f69041a, aVar3, i15, aVar, aVar2, (Surface) obj);
            }
        }, z.a.d());
    }

    public h2 k(v.n0 n0Var) {
        return l(n0Var, true);
    }

    public h2 l(v.n0 n0Var, boolean z15) {
        y.w.b();
        h();
        h2 h2Var = new h2(this.f69070g.f(), n0Var, z15, this.f69070g.b(), this.f69070g.g(), this.f69070g.c(), new Runnable() { // from class: g0.e0
            @Override // java.lang.Runnable
            public final void run() {
                n0.a(this.f69033a);
            }
        });
        try {
            final u1 u1VarN = h2Var.n();
            a aVar = this.f69075l;
            Objects.requireNonNull(aVar);
            if (aVar.u(u1VarN, new d0(aVar))) {
                com.google.common.util.concurrent.q<Void> qVarK = aVar.k();
                Objects.requireNonNull(u1VarN);
                qVarK.b(new Runnable() { // from class: g0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u1VarN.d();
                    }
                }, z.a.a());
            }
            this.f69074k = h2Var;
            x();
            return h2Var;
        } catch (RuntimeException e15) {
            h2Var.w();
            throw e15;
        } catch (u1.a e16) {
            throw new AssertionError("Surface is somehow already closed", e16);
        }
    }

    public final void m() {
        y.w.b();
        h();
        this.f69075l.d();
    }

    public Rect n() {
        return this.f69067d;
    }

    public u1 o() {
        y.w.b();
        h();
        g();
        return this.f69075l;
    }

    public int p() {
        return this.f69064a;
    }

    public int q() {
        return this.f69072i;
    }

    public Matrix r() {
        return this.f69065b;
    }

    public n3 s() {
        return this.f69070g;
    }

    public int t() {
        return this.f69069f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f69069f + ", format=" + this.f69064a + ", resolution=" + this.f69070g.f() + ", cropRect=" + this.f69067d + ", rotationDegrees=" + this.f69072i + ", mirroring=" + this.f69068e + ", sensorToBufferTransform= " + this.f69065b + ", rotationInTransform= " + y.x.g(this.f69065b) + ", isMirrorInTransform= " + y.x.l(this.f69065b) + ", isClosed=" + this.f69077n + '}';
    }

    public boolean u() {
        return this.f69066c;
    }

    public void v() {
        y.w.b();
        h();
        if (this.f69075l.s()) {
            return;
        }
        this.f69073j = false;
        this.f69075l.d();
        this.f69075l = new a(this.f69070g.f(), this.f69064a);
        Iterator<Runnable> it = this.f69076m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f69068e;
    }

    public void y(u1 u1Var) {
        y.w.b();
        h();
        a aVar = this.f69075l;
        Objects.requireNonNull(aVar);
        aVar.u(u1Var, new d0(aVar));
    }

    public void z(final int i15, final int i16) {
        y.w.e(new Runnable() { // from class: g0.h0
            @Override // java.lang.Runnable
            public final void run() {
                n0.c(this.f69048a, i15, i16);
            }
        });
    }
}
