package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.e1;
import o.i0;
import o.j2;
import o.k0;
import v.c2;
import v.e2;
import v.f2;
import v.h2;
import v.j3;
import v.m0;
import v.n0;
import v.n3;
import v.p1;
import v.t2;
import v.u1;
import v.u2;
import v.w3;
import v.x3;
import v.z2;
import y.w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j2 {
    public static final d E = new d();
    private static final Boolean F = null;
    private Matrix A;
    j3.b B;
    private u1 C;
    private j3.c D;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f9239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    j f9240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Executor f9241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f9242y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f9243z;

    public interface a {
        default Size a() {
            return null;
        }

        void c(o oVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements f2.a<c>, w3.b<g, c2, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u2 f9244a;

        public c() {
            this(u2.l0());
        }

        static c f(p1 p1Var) {
            return new c(u2.m0(p1Var));
        }

        @Override // o.j0
        public t2 a() {
            return this.f9244a;
        }

        public g e() {
            c2 c2VarD = d();
            f2.t(c2VarD);
            return new g(c2VarD);
        }

        @Override // v.w3.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public c2 d() {
            return new c2(z2.k0(this.f9244a));
        }

        public c h(int i15) {
            a().m(c2.S, Integer.valueOf(i15));
            return this;
        }

        public c i(x3.b bVar) {
            a().m(w3.L, bVar);
            return this;
        }

        public c j(Size size) {
            a().m(f2.f202582v, size);
            return this;
        }

        public c k(i0 i0Var) {
            if (!Objects.equals(i0.f140011d, i0Var)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().m(e2.f202559p, i0Var);
            return this;
        }

        public c l(j0.c cVar) {
            a().m(f2.f202585y, cVar);
            return this;
        }

        public c m(int i15) {
            a().m(w3.E, Integer.valueOf(i15));
            return this;
        }

        @Deprecated
        public c n(int i15) {
            if (i15 == -1) {
                i15 = 0;
            }
            a().m(f2.f202577q, Integer.valueOf(i15));
            return this;
        }

        public c o(Class<g> cls) {
            a().m(b0.r.f15616c, cls);
            if (a().f(b0.r.f15615b, null) == null) {
                p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c p(String str) {
            a().m(b0.r.f15615b, str);
            return this;
        }

        @Override // v.f2.a
        @Deprecated
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public c c(Size size) {
            a().m(f2.f202581u, size);
            return this;
        }

        @Override // v.f2.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public c b(int i15) {
            a().m(f2.f202578r, Integer.valueOf(i15));
            return this;
        }

        private c(u2 u2Var) {
            this.f9244a = u2Var;
            Class cls = (Class) u2Var.f(b0.r.f15616c, null);
            if (cls == null || cls.equals(g.class)) {
                i(x3.b.IMAGE_ANALYSIS);
                o(g.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Size f9245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final i0 f9246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final j0.c f9247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c2 f9248d;

        static {
            Size size = new Size(640, 480);
            f9245a = size;
            i0 i0Var = i0.f140011d;
            f9246b = i0Var;
            j0.c cVarA = new j0.c.a().d(j0.a.f98425c).f(new j0.d(f0.d.f54494c, 1)).a();
            f9247c = cVarA;
            f9248d = new c().j(size).m(1).n(0).l(cVarA).k(i0Var).d();
        }

        public c2 a() {
            return f9248d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    g(c2 c2Var) {
        super(c2Var);
        this.f9239v = new Object();
    }

    public static /* synthetic */ void i0(r rVar, r rVar2) {
        rVar.j();
        if (rVar2 != null) {
            rVar2.j();
        }
    }

    public static /* synthetic */ void j0(g gVar, j jVar, j3 j3Var, j3.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.n0();
        jVar.f();
        j3.b bVarO0 = gVar.o0(gVar.k(), (c2) gVar.l(), (n3) i6.i.g(gVar.g()));
        gVar.B = bVarO0;
        gVar.f0(k0.a(new Object[]{bVarO0.o()}));
        gVar.M();
    }

    public static /* synthetic */ List l0(Size size, List list, int i15) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private boolean t0(n0 n0Var) {
        return u0() && t(n0Var) % 180 != 0;
    }

    private void v0() {
        a aVar;
        synchronized (this.f9239v) {
            try {
                c2 c2Var = (c2) l();
                if (c2Var.i0(0) == 1) {
                    this.f9240w = new k();
                } else {
                    this.f9240w = new l(c2Var.f0(z.a.b()));
                }
                this.f9240w.q(s0());
                this.f9240w.r(u0());
                n0 n0VarI = i();
                Boolean boolR0 = r0();
                boolean zA = n0VarI != null ? n0VarI.o().s().a(OnePixelShiftQuirk.class) : false;
                j jVar = this.f9240w;
                if (boolR0 != null) {
                    zA = boolR0.booleanValue();
                }
                jVar.p(zA);
                if (n0VarI != null) {
                    this.f9240w.t(t(n0VarI));
                }
                Rect rect = this.f9243z;
                if (rect != null) {
                    this.f9240w.v(rect);
                }
                Matrix matrix = this.A;
                if (matrix != null) {
                    this.f9240w.u(matrix);
                }
                Executor executor = this.f9241x;
                if (executor != null && (aVar = this.f9242y) != null) {
                    this.f9240w.o(executor, aVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void y0() {
        synchronized (this.f9239v) {
            try {
                n0 n0VarI = i();
                if (n0VarI != null) {
                    this.f9240w.t(t(n0VarI));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    public w3.b<?, ?, ?> D(p1 p1Var) {
        return c.f(p1Var);
    }

    @Override // o.j2
    public boolean F() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.j2
    protected w3<?> Q(m0 m0Var, w3.b<?, ?, ?> bVar) {
        final Size sizeA;
        synchronized (this.f9239v) {
            try {
                a aVar = this.f9242y;
                sizeA = aVar != null ? aVar.a() : null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (sizeA == null) {
            return bVar.d();
        }
        if (m0Var.A(((Integer) bVar.a().f(f2.f202578r, 0)).intValue()) % 180 == 90) {
            sizeA = new Size(sizeA.getHeight(), sizeA.getWidth());
        }
        w3 w3VarD = bVar.d();
        p1.a<Size> aVar2 = f2.f202581u;
        if (!w3VarD.h(aVar2)) {
            bVar.a().m(aVar2, sizeA);
        }
        w3 w3VarD2 = bVar.d();
        p1.a aVar3 = f2.f202585y;
        if (w3VarD2.h(aVar3)) {
            j0.c cVar = (j0.c) e().f(aVar3, null);
            j0.c.a aVar4 = cVar == null ? new j0.c.a() : j0.c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new j0.d(sizeA, 1));
            }
            if (cVar == null) {
                aVar4.e(new j0.b() { // from class: o.o0
                    @Override // j0.b
                    public final List a(List list, int i15) {
                        return androidx.camera.core.g.l0(sizeA, list, i15);
                    }
                });
            }
            bVar.a().m(aVar3, aVar4.a());
        }
        return bVar.d();
    }

    @Override // o.j2
    protected void R(int i15) {
        x0(i15);
    }

    @Override // o.j2
    protected n3 U(p1 p1Var) {
        this.B.g(p1Var);
        f0(k0.a(new Object[]{this.B.o()}));
        return g().i().d(p1Var).a();
    }

    @Override // o.j2
    protected n3 V(n3 n3Var, n3 n3Var2) {
        e1.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + n3Var + ", secondaryStreamSpec " + n3Var2);
        j3.b bVarO0 = o0(k(), (c2) l(), n3Var);
        this.B = bVarO0;
        f0(k0.a(new Object[]{bVarO0.o()}));
        return n3Var;
    }

    @Override // o.j2
    public void W() {
        n0();
        synchronized (this.f9239v) {
            this.f9240w.i();
            this.f9240w = null;
        }
    }

    @Override // o.j2
    public void b0(Matrix matrix) {
        super.b0(matrix);
        synchronized (this.f9239v) {
            try {
                j jVar = this.f9240w;
                if (jVar != null) {
                    jVar.u(matrix);
                }
                this.A = matrix;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    public void d0(Rect rect) {
        super.d0(rect);
        synchronized (this.f9239v) {
            try {
                j jVar = this.f9240w;
                if (jVar != null) {
                    jVar.v(rect);
                }
                this.f9243z = rect;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.j2
    public w3<?> m(boolean z15, x3 x3Var) {
        d dVar = E;
        p1 p1VarA = x3Var.a(dVar.a().W(), 1);
        if (z15) {
            p1VarA = p1.u(p1VarA, dVar.a());
        }
        if (p1VarA == null) {
            return null;
        }
        return D(p1VarA).d();
    }

    public void m0() {
        synchronized (this.f9239v) {
            try {
                j jVar = this.f9240w;
                if (jVar != null) {
                    jVar.o(null, null);
                }
                if (this.f9242y != null) {
                    L();
                }
                this.f9241x = null;
                this.f9242y = null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void n0() {
        w.b();
        j3.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
            this.D = null;
        }
        u1 u1Var = this.C;
        if (u1Var != null) {
            u1Var.d();
            this.C = null;
        }
    }

    j3.b o0(String str, c2 c2Var, n3 n3Var) {
        final j jVar;
        w.b();
        Size sizeF = n3Var.f();
        Executor executor = (Executor) i6.i.g(c2Var.f0(z.a.b()));
        boolean z15 = true;
        int iQ0 = p0() == 1 ? q0() : 4;
        final r rVar = c2Var.k0() != null ? new r(c2Var.k0().a(sizeF.getWidth(), sizeF.getHeight(), p(), iQ0, 0L)) : new r(p.a(sizeF.getWidth(), sizeF.getHeight(), p(), iQ0));
        synchronized (this.f9239v) {
            v0();
            jVar = this.f9240w;
        }
        boolean zT0 = i() != null ? t0(i()) : false;
        int height = zT0 ? sizeF.getHeight() : sizeF.getWidth();
        int width = zT0 ? sizeF.getWidth() : sizeF.getHeight();
        int i15 = s0() == 2 ? 1 : 35;
        boolean z16 = p() == 35 && s0() == 2;
        boolean z17 = p() == 35 && s0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(r0()))) {
            z15 = false;
        }
        final r rVar2 = (z16 || (z15 && !z17)) ? new r(p.a(height, width, i15, rVar.a())) : null;
        if (rVar2 != null) {
            jVar.s(rVar2);
        }
        y0();
        rVar.f(jVar, executor);
        j3.b bVarP = j3.b.p(c2Var, n3Var.f());
        if (n3Var.d() != null) {
            bVarP.g(n3Var.d());
        }
        u1 u1Var = this.C;
        if (u1Var != null) {
            u1Var.d();
        }
        h2 h2Var = new h2(rVar.getSurface(), sizeF, p());
        this.C = h2Var;
        h2Var.k().b(new Runnable() { // from class: o.m0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.g.i0(rVar, rVar2);
            }
        }, z.a.d());
        bVarP.x(n3Var.g());
        b(bVarP, n3Var);
        bVarP.n(this.C, n3Var.b(), null, -1);
        j3.c cVar = this.D;
        if (cVar != null) {
            cVar.b();
        }
        j3.c cVar2 = new j3.c(new j3.d() { // from class: androidx.camera.core.f
            @Override // v.j3.d
            public final void a(j3 j3Var, j3.g gVar) {
                g.j0(this.f9237a, jVar, j3Var, gVar);
            }
        });
        this.D = cVar2;
        bVarP.r(cVar2);
        return bVarP;
    }

    public int p0() {
        return ((c2) l()).i0(0);
    }

    public int q0() {
        return ((c2) l()).j0(6);
    }

    public Boolean r0() {
        return ((c2) l()).l0(F);
    }

    public int s0() {
        return ((c2) l()).m0(1);
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }

    public boolean u0() {
        return ((c2) l()).n0(Boolean.FALSE).booleanValue();
    }

    public void w0(Executor executor, final a aVar) {
        synchronized (this.f9239v) {
            try {
                j jVar = this.f9240w;
                if (jVar != null) {
                    jVar.o(executor, new a() { // from class: o.n0
                        @Override // androidx.camera.core.g.a
                        public final void c(androidx.camera.core.o oVar) {
                            aVar.c(oVar);
                        }
                    });
                }
                if (this.f9242y == null) {
                    K();
                }
                this.f9241x = executor;
                this.f9242y = aVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void x0(int i15) {
        if (c0(i15)) {
            y0();
        }
    }
}
