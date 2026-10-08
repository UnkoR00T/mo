package io.sentry;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f8 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m8 f94935b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c1 f94937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f94938e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile TimerTask f94940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile TimerTask f94941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Timer f94942i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private io.sentry.protocol.f0 f94947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final q1 f94948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.protocol.c f94949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f94950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e9 f94951r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f94934a = new io.sentry.protocol.v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<m8> f94936c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f94939f = c.f94954c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.util.a f94943j = new io.sentry.util.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f94944k = new io.sentry.util.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f94945l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f94946m = new AtomicBoolean(false);

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f8.this.a0();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f8.this.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f94954c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f94955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u8 f94956b;

        private c(boolean z15, u8 u8Var) {
            this.f94955a = z15;
            this.f94956b = u8Var;
        }

        static c c(u8 u8Var) {
            return new c(true, u8Var);
        }

        private static c d() {
            return new c(false, null);
        }
    }

    f8(c9 c9Var, c1 c1Var, e9 e9Var, j jVar) {
        this.f94942i = null;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f94949p = cVar;
        io.sentry.util.v.c(c9Var, "context is required");
        io.sentry.util.v.c(c1Var, "scopes are required");
        m8 m8Var = new m8(c9Var, this, c1Var, e9Var);
        this.f94935b = m8Var;
        this.f94938e = c9Var.w();
        this.f94948o = c9Var.d();
        this.f94937d = c1Var;
        this.f94950q = jVar;
        this.f94947n = c9Var.y();
        this.f94951r = e9Var;
        c0(m8Var);
        io.sentry.protocol.v vVarR = c1Var.s().getContinuousProfiler().r();
        if (!vVarR.equals(io.sentry.protocol.v.f95495b) && Boolean.TRUE.equals(f())) {
            cVar.t(new t3(vVarR));
        }
        if (jVar != null) {
            jVar.e(this);
        }
        if (e9Var.l() == null && e9Var.k() == null) {
            return;
        }
        this.f94942i = new Timer(true);
        b0();
        v();
    }

    public static /* synthetic */ void C(f8 f8Var, a1 a1Var, l1 l1Var) {
        f8Var.getClass();
        if (l1Var == f8Var) {
            a1Var.J();
        }
    }

    public static /* synthetic */ void D(final f8 f8Var, final a1 a1Var) {
        f8Var.getClass();
        a1Var.S(new f4.c() { // from class: io.sentry.e8
            @Override // io.sentry.f4.c
            public final void a(l1 l1Var) {
                f8.C(this.f94878a, a1Var, l1Var);
            }
        });
    }

    public static /* synthetic */ void E(f8 f8Var, a1 a1Var) {
        f8Var.getClass();
        a1Var.F(f8Var);
    }

    public static /* synthetic */ void F(f8 f8Var, m8 m8Var) {
        j jVar = f8Var.f94950q;
        if (jVar != null) {
            jVar.a(m8Var);
        }
        c cVar = f8Var.f94939f;
        if (f8Var.f94951r.l() == null) {
            if (cVar.f94955a) {
                f8Var.o(cVar.f94956b);
            }
        } else if (!f8Var.f94951r.q() || f8Var.X()) {
            f8Var.v();
        }
    }

    public static /* synthetic */ void H(f8 f8Var, p8 p8Var, AtomicReference atomicReference, m8 m8Var) {
        if (p8Var != null) {
            f8Var.getClass();
            p8Var.a(m8Var);
        }
        d9 d9VarN = f8Var.f94951r.n();
        if (d9VarN != null) {
            d9VarN.a(f8Var);
        }
        j jVar = f8Var.f94950q;
        if (jVar != null) {
            atomicReference.set(jVar.d(f8Var));
        }
    }

    private void K() {
        g1 g1VarA = this.f94943j.a();
        try {
            if (this.f94941h != null) {
                this.f94941h.cancel();
                this.f94946m.set(false);
                this.f94941h = null;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    private void L() {
        g1 g1VarA = this.f94943j.a();
        try {
            if (this.f94940g != null) {
                this.f94940g.cancel();
                this.f94945l.set(false);
                this.f94940g = null;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    private j1 M(n8 n8Var, t8 t8Var) {
        if (!this.f94935b.d() && this.f94948o.equals(n8Var.d()) && !io.sentry.util.c0.b(this.f94937d.s().getIgnoredSpanOrigins(), t8Var.a())) {
            s8 s8VarG = n8Var.g();
            String strE = n8Var.e();
            String strC = n8Var.c();
            if (this.f94936c.size() >= this.f94937d.s().getMaxSpans()) {
                this.f94937d.s().getLogger().c(b7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strE, strC);
                return e3.B();
            }
            io.sentry.util.v.c(s8VarG, "parentSpanId is required");
            io.sentry.util.v.c(strE, "operation is required");
            L();
            m8 m8Var = new m8(this, this.f94937d, n8Var, t8Var, new p8() { // from class: io.sentry.b8
                @Override // io.sentry.p8
                public final void a(m8 m8Var2) {
                    f8.F(this.f94682a, m8Var2);
                }
            });
            c0(m8Var);
            this.f94936c.add(m8Var);
            j jVar = this.f94950q;
            if (jVar != null) {
                jVar.b(m8Var);
            }
            return m8Var;
        }
        return e3.B();
    }

    private j1 N(s8 s8Var, String str, String str2, t8 t8Var) {
        n8 n8VarA = w().a(str, s8Var, null);
        n8VarA.p(str2);
        n8VarA.q(q1.SENTRY);
        return M(n8VarA, t8Var);
    }

    private j1 O(String str, String str2, n5 n5Var, q1 q1Var, t8 t8Var) {
        if (!this.f94935b.d() && this.f94948o.equals(q1Var)) {
            if (this.f94936c.size() < this.f94937d.s().getMaxSpans()) {
                return this.f94935b.u(str, str2, n5Var, q1Var, t8Var);
            }
            this.f94937d.s().getLogger().c(b7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return e3.B();
        }
        return e3.B();
    }

    private boolean X() {
        ListIterator<m8> listIterator = this.f94936c.listIterator();
        while (listIterator.hasNext()) {
            m8 next = listIterator.next();
            if (!next.d() && next.x() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        u8 u8VarB = b();
        if (u8VarB == null) {
            u8VarB = u8.DEADLINE_EXCEEDED;
        }
        e(u8VarB, this.f94951r.l() != null, null);
        this.f94946m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        u8 u8VarB = b();
        if (u8VarB == null) {
            u8VarB = u8.OK;
        }
        o(u8VarB);
        this.f94945l.set(false);
    }

    private void b0() {
        Long lK = this.f94951r.k();
        if (lK != null) {
            g1 g1VarA = this.f94943j.a();
            try {
                if (this.f94942i != null) {
                    K();
                    this.f94946m.set(true);
                    this.f94941h = new b();
                    try {
                        this.f94942i.schedule(this.f94941h, lK.longValue());
                    } catch (Throwable th4) {
                        this.f94937d.s().getLogger().b(b7.WARNING, "Failed to schedule finish timer", th4);
                        Z();
                    }
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th5) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        }
    }

    private void c0(j1 j1Var) {
        io.sentry.util.thread.a threadChecker = this.f94937d.s().getThreadChecker();
        io.sentry.protocol.v vVarR = this.f94937d.s().getContinuousProfiler().r();
        if (!vVarR.equals(io.sentry.protocol.v.f95495b) && Boolean.TRUE.equals(j1Var.f())) {
            j1Var.m("profiler_id", vVarR.toString());
        }
        j1Var.m("thread.id", String.valueOf(threadChecker.c()));
        j1Var.m("thread.name", threadChecker.b());
    }

    private void i0(d dVar) {
        g1 g1VarA = this.f94944k.a();
        try {
            if (dVar.v()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f94937d.J(new h4() { // from class: io.sentry.c8
                    @Override // io.sentry.h4
                    public final void a(a1 a1Var) {
                        atomicReference.set(a1Var.M());
                    }
                });
                dVar.N(w().n(), (io.sentry.protocol.v) atomicReference.get(), this.f94937d.s(), U(), getName(), W());
                dVar.d();
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA == null) {
                throw th4;
            }
            try {
                g1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.j1
    public n5 A() {
        return this.f94935b.A();
    }

    @Override // io.sentry.j1
    public boolean G() {
        return false;
    }

    public void P(u8 u8Var, n5 n5Var, boolean z15, j0 j0Var) {
        n5 n5VarX = this.f94935b.x();
        if (n5Var == null) {
            n5Var = n5VarX;
        }
        if (n5Var == null) {
            n5Var = this.f94937d.s().getDateProvider().a();
        }
        for (m8 m8Var : this.f94936c) {
            if (m8Var.F().d()) {
                m8Var.y(u8Var != null ? u8Var : w().f95224g, n5Var);
            }
        }
        this.f94939f = c.c(u8Var);
        if (this.f94935b.d()) {
            return;
        }
        if (!this.f94951r.q() || X()) {
            final AtomicReference atomicReference = new AtomicReference();
            final p8 p8VarJ = this.f94935b.J();
            this.f94935b.O(new p8() { // from class: io.sentry.z7
                @Override // io.sentry.p8
                public final void a(m8 m8Var2) {
                    f8.H(this.f96000a, p8VarJ, atomicReference, m8Var2);
                }
            });
            this.f94935b.y(this.f94939f.f94956b, n5Var);
            Boolean bool = Boolean.TRUE;
            w3 w3VarB = (bool.equals(f()) && bool.equals(Y())) ? this.f94937d.s().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f94937d.s()) : null;
            if (this.f94937d.s().isContinuousProfilingEnabled()) {
                u3 profileLifecycle = this.f94937d.s().getProfileLifecycle();
                u3 u3Var = u3.TRACE;
                if (profileLifecycle == u3Var) {
                    this.f94937d.s().getContinuousProfiler().q(u3Var);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f94937d.J(new h4() { // from class: io.sentry.a8
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    f8.D(this.f93624a, a1Var);
                }
            });
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(this);
            if (this.f94942i != null) {
                g1 g1VarA = this.f94943j.a();
                try {
                    if (this.f94942i != null) {
                        L();
                        K();
                        this.f94942i.cancel();
                        this.f94942i = null;
                    }
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                } catch (Throwable th4) {
                    if (g1VarA != null) {
                        try {
                            g1VarA.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
            if (z15 && this.f94936c.isEmpty() && this.f94951r.l() != null) {
                this.f94937d.s().getLogger().c(b7.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f94938e);
            } else {
                c0Var.m0().putAll(this.f94935b.D());
                this.f94937d.V(c0Var, l(), j0Var, w3VarB);
            }
        }
    }

    public List<m8> Q() {
        return this.f94936c;
    }

    public io.sentry.protocol.c R() {
        return this.f94949p;
    }

    public Map<String, Object> S() {
        return this.f94935b.B();
    }

    m8 T() {
        return this.f94935b;
    }

    public b9 U() {
        return this.f94935b.I();
    }

    public List<m8> V() {
        return this.f94936c;
    }

    public io.sentry.protocol.f0 W() {
        return this.f94947n;
    }

    public Boolean Y() {
        return this.f94935b.N();
    }

    @Override // io.sentry.j1
    public void a(u8 u8Var) {
        if (this.f94935b.d()) {
            this.f94937d.s().getLogger().c(b7.DEBUG, "The transaction is already finished. Status %s cannot be set", u8Var == null ? "null" : u8Var.name());
        } else {
            this.f94935b.a(u8Var);
        }
    }

    @Override // io.sentry.j1
    public u8 b() {
        return this.f94935b.b();
    }

    @Override // io.sentry.j1
    public y7 c() {
        return this.f94935b.c();
    }

    @Override // io.sentry.j1
    public boolean d() {
        return this.f94935b.d();
    }

    public void d0(String str, Number number) {
        if (this.f94935b.D().containsKey(str)) {
            return;
        }
        k(str, number);
    }

    @Override // io.sentry.l1
    public void e(u8 u8Var, boolean z15, j0 j0Var) {
        if (d()) {
            return;
        }
        n5 n5VarA = this.f94937d.s().getDateProvider().a();
        ListIterator listIteratorE = io.sentry.util.c.e((CopyOnWriteArrayList) this.f94936c);
        while (listIteratorE.hasPrevious()) {
            m8 m8Var = (m8) listIteratorE.previous();
            m8Var.O(null);
            m8Var.y(u8Var, n5VarA);
        }
        P(u8Var, n5VarA, z15, j0Var);
    }

    public void e0(String str, Number number, h2 h2Var) {
        if (this.f94935b.D().containsKey(str)) {
            return;
        }
        r(str, number, h2Var);
    }

    @Override // io.sentry.j1
    public Boolean f() {
        return this.f94935b.f();
    }

    j1 f0(s8 s8Var, String str, String str2) {
        return h0(s8Var, str, str2, new t8());
    }

    @Override // io.sentry.j1
    public void g() {
        o(b());
    }

    j1 g0(s8 s8Var, String str, String str2, n5 n5Var, q1 q1Var, t8 t8Var) {
        n8 n8VarA = w().a(str, s8Var, null);
        n8VarA.p(str2);
        n8VarA.q(q1Var);
        t8Var.h(n5Var);
        return M(n8VarA, t8Var);
    }

    @Override // io.sentry.j1
    public String getDescription() {
        return this.f94935b.getDescription();
    }

    @Override // io.sentry.l1
    public String getName() {
        return this.f94938e;
    }

    @Override // io.sentry.j1
    public void h(String str) {
        if (this.f94935b.d()) {
            this.f94937d.s().getLogger().c(b7.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f94935b.h(str);
        }
    }

    j1 h0(s8 s8Var, String str, String str2, t8 t8Var) {
        return N(s8Var, str, str2, t8Var);
    }

    @Override // io.sentry.l1
    public io.sentry.protocol.v i() {
        return this.f94934a;
    }

    @Override // io.sentry.j1
    public j1 j(String str) {
        return z(str, null);
    }

    @Override // io.sentry.j1
    public void k(String str, Number number) {
        this.f94935b.k(str, number);
    }

    @Override // io.sentry.j1
    public z8 l() {
        d dVarB;
        if (!this.f94937d.s().isTraceSampling() || (dVarB = w().b()) == null) {
            return null;
        }
        i0(dVarB);
        return dVarB.Q();
    }

    @Override // io.sentry.j1
    public void m(String str, Object obj) {
        if (this.f94935b.d()) {
            this.f94937d.s().getLogger().c(b7.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f94935b.m(str, obj);
        }
    }

    @Override // io.sentry.j1
    public void n(Throwable th4) {
        if (this.f94935b.d()) {
            this.f94937d.s().getLogger().c(b7.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            this.f94935b.n(th4);
        }
    }

    @Override // io.sentry.j1
    public void o(u8 u8Var) {
        y(u8Var, null);
    }

    @Override // io.sentry.j1
    public e p(List<String> list) {
        d dVarB;
        if (!this.f94937d.s().isTraceSampling() || (dVarB = w().b()) == null) {
            return null;
        }
        i0(dVarB);
        return e.a(dVarB, list);
    }

    @Override // io.sentry.j1
    public j1 q(String str, String str2, n5 n5Var, q1 q1Var) {
        return u(str, str2, n5Var, q1Var, new t8());
    }

    @Override // io.sentry.j1
    public void r(String str, Number number, h2 h2Var) {
        this.f94935b.r(str, number, h2Var);
    }

    @Override // io.sentry.j1
    public g1 s() {
        this.f94937d.J(new h4() { // from class: io.sentry.d8
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                f8.E(this.f94851a, a1Var);
            }
        });
        return w2.b();
    }

    @Override // io.sentry.l1
    public j1 t() {
        ListIterator listIteratorE = io.sentry.util.c.e((CopyOnWriteArrayList) this.f94936c);
        while (listIteratorE.hasPrevious()) {
            m8 m8Var = (m8) listIteratorE.previous();
            if (!m8Var.d()) {
                return m8Var;
            }
        }
        return null;
    }

    @Override // io.sentry.j1
    public j1 u(String str, String str2, n5 n5Var, q1 q1Var, t8 t8Var) {
        return O(str, str2, n5Var, q1Var, t8Var);
    }

    @Override // io.sentry.l1
    public void v() {
        Long l15;
        g1 g1VarA = this.f94943j.a();
        try {
            if (this.f94942i != null && (l15 = this.f94951r.l()) != null) {
                L();
                this.f94945l.set(true);
                this.f94940g = new a();
                try {
                    this.f94942i.schedule(this.f94940g, l15.longValue());
                } catch (Throwable th4) {
                    this.f94937d.s().getLogger().b(b7.WARNING, "Failed to schedule finish timer", th4);
                    a0();
                }
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th5) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // io.sentry.j1
    public n8 w() {
        return this.f94935b.w();
    }

    @Override // io.sentry.j1
    public n5 x() {
        return this.f94935b.x();
    }

    @Override // io.sentry.j1
    public void y(u8 u8Var, n5 n5Var) {
        P(u8Var, n5Var, true, null);
    }

    @Override // io.sentry.j1
    public j1 z(String str, String str2) {
        return u(str, str2, null, q1.SENTRY, new t8());
    }
}
