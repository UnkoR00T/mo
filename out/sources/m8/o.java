package m8;

import a8.q1;
import ak.n0;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import t7.m0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements t7.l0.b {
    private static final Executor D = new Executor() { // from class: m8.n
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            o.a(runnable);
        }
    };
    private boolean A;
    private int B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f124382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.l0.a f124383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<d> f124384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f124385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l0 f124386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0.b f124387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w7.h f124388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f124389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f124390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final v f124391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w7.j0<h> f124392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t7.p f124393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t7.j0 f124394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n0<Object> f124395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w7.p f124396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t7.l0 f124397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private t f124398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f124399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f124400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f124401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f124402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Pair<Surface, w7.d0> f124403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f124404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f124405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f124406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f124407z;

    class a implements l0.b {
        a() {
        }

        @Override // m8.l0.b
        public void a() {
            ((t7.l0) zj.p.q(o.this.f124397p)).g(-2L);
        }

        @Override // m8.l0.b
        public void b(long j15) {
            ((t7.l0) zj.p.q(o.this.f124397p)).g(j15);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f124409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f124410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t7.l0.a f124411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f124412d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f124414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f124415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f124416h = 15000;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private v f124417i = new v(1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w7.h f124413e = w7.h.f210683a;

        public b(Context context, u uVar) {
            this.f124409a = context.getApplicationContext();
            this.f124410b = uVar;
        }

        public o h() {
            zj.p.w(!this.f124414f);
            if (this.f124411c == null) {
                this.f124411c = new g(this.f124415g);
            }
            o oVar = new o(this, null);
            this.f124414f = true;
            return oVar;
        }

        public b i(long j15) {
            this.f124416h = j15;
            return this;
        }

        public b j(w7.h hVar) {
            this.f124413e = hVar;
            return this;
        }

        public b k(boolean z15) {
            this.f124412d = z15;
            return this;
        }
    }

    private final class c implements l0.a {
        private c() {
        }

        @Override // m8.l0.a
        public void a(m0 m0Var) {
            Iterator it = o.this.f124389h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(m0Var);
            }
        }

        @Override // m8.l0.a
        public void d() {
            Iterator it = o.this.f124389h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d();
            }
        }

        @Override // m8.l0.a
        public void g() {
            Iterator it = o.this.f124389h.iterator();
            while (it.hasNext()) {
                ((e) it.next()).g();
            }
        }

        /* synthetic */ c(o oVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements l0, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f124420b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t7.p f124422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f124423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f124424f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f124426h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f124429k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f124430l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n0<Object> f124421c = n0.C();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f124425g = -9223372036854775807L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l0.a f124427i = l0.a.f124379a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Executor f124428j = o.D;

        public d(Context context, int i15) {
            this.f124420b = i15;
            this.f124419a = o0.a0(context);
        }

        private void B(t7.p pVar) {
            ((t7.l0) zj.p.q(o.this.f124397p)).h(this.f124420b, this.f124423e != 1 ? 2 : 1, pVar.b().W(o.this.G(pVar.F)).Q(), this.f124421c, 0L);
        }

        @Override // m8.o.e
        public void a(final m0 m0Var) {
            final l0.a aVar = this.f124427i;
            this.f124428j.execute(new Runnable() { // from class: m8.r
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(m0Var);
                }
            });
        }

        @Override // m8.l0
        public void b() {
            o.this.P();
        }

        @Override // m8.l0
        public boolean c() {
            return this.f124430l;
        }

        @Override // m8.o.e
        public void d() {
            final l0.a aVar = this.f124427i;
            Executor executor = this.f124428j;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: m8.q
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.d();
                }
            });
        }

        @Override // m8.l0
        public boolean e() {
            return c() && o.this.I();
        }

        @Override // m8.l0
        public void f() {
            if (c()) {
                boolean z15 = this.f124429k;
                long j15 = o.this.f124406y;
                o.this.F(false);
                ((t7.l0) zj.p.q(o.this.f124397p)).f();
                o.this.f124406y = j15;
                if (z15) {
                    l();
                }
            }
        }

        @Override // m8.o.e
        public void g() {
            final l0.a aVar = this.f124427i;
            Executor executor = this.f124428j;
            Objects.requireNonNull(aVar);
            executor.execute(new Runnable() { // from class: m8.p
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.g();
                }
            });
        }

        @Override // m8.l0
        public Surface getInputSurface() {
            zj.p.w(c());
            return ((t7.l0) zj.p.q(o.this.f124397p)).e(this.f124420b);
        }

        @Override // m8.l0
        public void h(long j15, long j16) {
            o.this.Q(j15 + this.f124424f, j16);
        }

        @Override // m8.l0
        public void i(l0.a aVar, Executor executor) {
            this.f124427i = aVar;
            this.f124428j = executor;
        }

        @Override // m8.l0
        public void j(int i15, t7.p pVar, long j15, int i16, List<Object> list) {
            zj.p.w(c());
            this.f124421c = n0.v(list);
            this.f124423e = i15;
            this.f124422d = pVar;
            o.this.f124407z = -9223372036854775807L;
            o.this.A = false;
            B(pVar);
            boolean z15 = this.f124425g == -9223372036854775807L;
            if (o.this.f124385d || (this.f124420b == 0 && z15)) {
                long j16 = z15 ? -4611686018427387904L : this.f124425g + 1;
                o.this.f124392k.a(j16, new h(this.f124424f + j15, i16, j16));
            }
        }

        @Override // m8.l0
        public void k(long j15) {
            this.f124424f = j15;
        }

        @Override // m8.l0
        public void l() {
            o.this.f124407z = this.f124425g;
            if (o.this.f124406y >= o.this.f124407z) {
                o.this.X();
            }
        }

        @Override // m8.l0
        public boolean m(long j15, l0.b bVar) {
            int i15;
            zj.p.w(c());
            long j16 = j15 + this.f124424f;
            long jC = o.this.f124391j.c(j16);
            if (jC != -9223372036854775807L && o.this.f124390i != -9223372036854775807L && jC < o.this.f124390i && (i15 = this.f124426h) < 2) {
                this.f124426h = i15 + 1;
                bVar.a();
                return true;
            }
            if (!o.this.W() || ((t7.l0) zj.p.q(o.this.f124397p)).i(this.f124420b) >= this.f124419a || !((t7.l0) zj.p.q(o.this.f124397p)).c(this.f124420b)) {
                return false;
            }
            this.f124425g = j16;
            bVar.b(j16 * 1000);
            this.f124426h = 0;
            return true;
        }

        @Override // m8.l0
        public void n(List<Object> list) {
            if (this.f124421c.equals(list)) {
                return;
            }
            this.f124421c = n0.v(list);
            t7.p pVar = this.f124422d;
            if (pVar != null) {
                B(pVar);
            }
        }

        @Override // m8.l0
        public boolean o(boolean z15) {
            return o.this.K(z15 && c());
        }

        @Override // m8.l0
        public boolean p(t7.p pVar) throws l0.c {
            zj.p.w(!c());
            boolean zO = o.this.O(pVar, this.f124420b);
            this.f124430l = zO;
            return zO;
        }

        @Override // m8.l0
        public void q() {
            if (o.this.f124392k.k() == 0) {
                o.this.D();
                return;
            }
            w7.j0 j0Var = new w7.j0();
            boolean z15 = true;
            while (o.this.f124392k.k() > 0) {
                h hVar = (h) zj.p.q((h) o.this.f124392k.h());
                if (z15) {
                    int i15 = hVar.f124436b;
                    if (i15 == 0 || i15 == 1) {
                        hVar = new h(hVar.f124435a, 0, hVar.f124437c);
                    } else {
                        o.this.D();
                    }
                    z15 = false;
                }
                j0Var.a(hVar.f124437c, hVar);
            }
            o.this.f124392k = j0Var;
        }

        @Override // m8.l0
        public void r() {
            if (o.this.f124385d) {
                o.this.Z();
            }
        }

        @Override // m8.l0
        public void s(t tVar) {
            if (this.f124420b == 0) {
                o.this.V(tVar);
            }
        }

        @Override // m8.l0
        public void t() {
            if (o.this.f124385d) {
                o.this.Y();
            }
        }

        @Override // m8.l0
        public void u(int i15) {
            if (this.f124420b == 0) {
                o.this.R(i15);
            }
        }

        @Override // m8.l0
        public void v(float f15) {
            if (this.f124420b == 0) {
                o.this.T(f15);
            }
        }

        @Override // m8.l0
        public void w() {
            o.this.E();
        }

        @Override // m8.l0
        public void x(Surface surface, w7.d0 d0Var) {
            o.this.S(surface, d0Var);
        }

        @Override // m8.l0
        public void y(boolean z15) {
            if (c()) {
                ((t7.l0) zj.p.q(o.this.f124397p)).flush();
            }
            this.f124425g = -9223372036854775807L;
            o.this.F(z15);
            this.f124429k = false;
        }

        @Override // m8.l0
        public void z(boolean z15) {
            if (o.this.f124385d) {
                o.this.L(z15);
            }
        }
    }

    public interface e {
        default void a(m0 m0Var) {
        }

        default void d() {
        }

        default void g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements t7.k0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final zj.w<Class<?>> f124432b = zj.x.a(new zj.w() { // from class: m8.s
            @Override // zj.w
            public final Object get() {
                return o.f.a();
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f124433a;

        public f(boolean z15) {
            this.f124433a = z15;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    private static final class g implements t7.l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t7.k0.b f124434a;

        public g(boolean z15) {
            this.f124434a = new f(z15);
        }

        @Override // t7.l0.a
        public t7.l0 a(Context context, t7.g gVar, t7.j jVar, t7.l0.b bVar, Executor executor, long j15, boolean z15) {
            try {
                return ((t7.l0.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(t7.k0.b.class).newInstance(this.f124434a)).a(context, gVar, jVar, bVar, executor, j15, z15);
            } catch (Exception e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f124435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f124436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f124437c;

        public h(long j15, int i15, long j16) {
            this.f124435a = j15;
            this.f124436b = i15;
            this.f124437c = j16;
        }
    }

    /* synthetic */ o(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f124386e.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(boolean z15) {
        if (J()) {
            this.f124404w++;
            this.f124386e.y(z15);
            while (this.f124392k.k() > 1) {
                this.f124392k.h();
            }
            if (this.f124392k.k() == 1) {
                h hVar = (h) zj.p.q(this.f124392k.h());
                this.f124401t = hVar.f124435a;
                this.f124402u = hVar.f124436b;
                N();
            }
            this.f124406y = -9223372036854775807L;
            if (z15) {
                this.f124407z = -9223372036854775807L;
                this.A = false;
            }
            ((w7.p) zj.p.q(this.f124396o)).j(new Runnable() { // from class: m8.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.b(this.f124381a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public t7.g G(t7.g gVar) {
        return (gVar == null || !gVar.g() || this.f124400s) ? t7.g.f188182h : gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        return this.f124404w == 0 && this.A && this.f124386e.e();
    }

    private boolean J() {
        return this.f124405x == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(boolean z15) {
        return this.f124386e.o(z15 && this.f124404w == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z15) {
        this.f124386e.z(z15);
    }

    private void M(Surface surface, int i15, int i16) {
        t7.l0 l0Var = this.f124397p;
        if (l0Var == null) {
            return;
        }
        if (surface != null) {
            l0Var.j(new t7.d0(surface, i15, i16));
            this.f124386e.x(surface, new w7.d0(i15, i16));
        } else {
            l0Var.j(null);
            this.f124386e.w();
        }
    }

    private void N() {
        this.f124386e.j(1, this.f124393l, this.f124401t, this.f124402u, n0.C());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(t7.p pVar, int i15) throws l0.c {
        o oVar;
        w7.o.a aVar;
        if (i15 == 0) {
            zj.p.w(this.f124405x == 0);
            t7.g gVarG = G(pVar.F);
            try {
                try {
                    if (this.f124399r) {
                        gVarG = t7.g.f188182h;
                    } else if (gVarG.f188192c == 7 && Build.VERSION.SDK_INT < 34 && w7.o.f()) {
                        gVarG = gVarG.a().e(6).a();
                    } else if (w7.o.g(gVarG.f188192c) || Build.VERSION.SDK_INT < 29) {
                        int i16 = gVarG.f188192c;
                        if (i16 == 2 || i16 == 10) {
                            gVarG = t7.g.f188182h;
                        }
                    } else {
                        w7.t.h("PlaybackVidGraphWrapper", o0.F("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(gVarG.f188192c)));
                        gVarG = t7.g.f188182h;
                    }
                    t7.g gVar = gVarG;
                    a aVar2 = null;
                    w7.p pVarE = this.f124388g.e((Looper) zj.p.q(Looper.myLooper()), null);
                    this.f124396o = pVarE;
                    t7.l0.a aVar3 = this.f124383b;
                    Context context = this.f124382a;
                    t7.j jVar = t7.j.f188304a;
                    Objects.requireNonNull(pVarE);
                    oVar = this;
                    t7.l0 l0VarA = aVar3.a(context, gVar, jVar, oVar, new q1(pVarE), 0L, false);
                    oVar.f124397p = l0VarA;
                    l0VarA.d(oVar.f124395n);
                    oVar.f124397p.l(oVar.f124394m);
                    oVar.f124397p.a();
                    Pair<Surface, w7.d0> pair = oVar.f124403v;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        w7.d0 d0Var = (w7.d0) pair.second;
                        M(surface, d0Var.b(), d0Var.a());
                    }
                    oVar.f124386e.p(pVar);
                    l0 l0Var = oVar.f124386e;
                    c cVar = new c(this, aVar2);
                    w7.p pVar2 = oVar.f124396o;
                    Objects.requireNonNull(pVar2);
                    l0Var.i(cVar, new q1(pVar2));
                    oVar.f124405x = 1;
                } catch (w7.o.a e15) {
                    aVar = e15;
                    throw new l0.c(aVar, pVar);
                }
            } catch (w7.o.a e16) {
                aVar = e16;
            }
        } else {
            oVar = this;
            if (!J()) {
                return false;
            }
        }
        ((t7.l0) zj.p.q(oVar.f124397p)).k(i15);
        oVar.C++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(long j15, long j16) {
        this.f124386e.h(j15, j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i15) {
        this.f124386e.u(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(float f15) {
        this.f124391j.e(f15);
        this.f124386e.v(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(t tVar) {
        this.f124398q = tVar;
        this.f124386e.s(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean W() {
        int i15 = this.B;
        return i15 != -1 && i15 == this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f124386e.l();
        this.A = true;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(o oVar) {
        oVar.f124404w--;
    }

    public void C(e eVar) {
        this.f124389h.add(eVar);
    }

    public void E() {
        w7.d0 d0Var = w7.d0.f210624c;
        M(null, d0Var.b(), d0Var.a());
        this.f124403v = null;
    }

    public l0 H(int i15) {
        if (o0.q(this.f124384c, i15)) {
            return this.f124384c.get(i15);
        }
        d dVar = new d(this.f124382a, i15);
        if (i15 == 0) {
            C(dVar);
        }
        this.f124384c.put(i15, dVar);
        return dVar;
    }

    public void P() {
        if (this.f124405x == 2) {
            return;
        }
        w7.p pVar = this.f124396o;
        if (pVar != null) {
            pVar.f(null);
        }
        t7.l0 l0Var = this.f124397p;
        if (l0Var != null) {
            l0Var.b();
        }
        this.f124403v = null;
        this.f124405x = 2;
    }

    public void S(Surface surface, w7.d0 d0Var) {
        Pair<Surface, w7.d0> pair = this.f124403v;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((w7.d0) this.f124403v.second).equals(d0Var)) {
            return;
        }
        this.f124403v = Pair.create(surface, d0Var);
        M(surface, d0Var.b(), d0Var.a());
    }

    public void U(int i15) {
        if (i15 < this.B) {
            return;
        }
        this.B = i15;
    }

    public void Y() {
        this.f124386e.t();
    }

    public void Z() {
        this.f124386e.r();
    }

    private o(b bVar) {
        this.f124382a = bVar.f124409a;
        this.f124392k = new w7.j0<>();
        this.f124383b = (t7.l0.a) zj.p.q(bVar.f124411c);
        this.f124384c = new SparseArray<>();
        this.f124395n = n0.C();
        this.f124394m = t7.j0.f188305a;
        this.f124385d = bVar.f124412d;
        w7.h hVar = bVar.f124413e;
        this.f124388g = hVar;
        this.f124390i = bVar.f124416h != -9223372036854775807L ? -bVar.f124416h : -9223372036854775807L;
        v vVar = bVar.f124417i;
        this.f124391j = vVar;
        this.f124386e = new m8.e(bVar.f124410b, vVar, hVar);
        this.f124387f = new a();
        this.f124389h = new CopyOnWriteArraySet<>();
        this.f124393l = new t7.p.b().Q();
        this.f124401t = -9223372036854775807L;
        this.f124406y = -9223372036854775807L;
        this.f124407z = -9223372036854775807L;
        this.B = -1;
        this.f124405x = 0;
    }
}
