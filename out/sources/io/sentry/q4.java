package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f95546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f95547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1 f95548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q4 f95549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f95550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f95551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f95552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.logger.a f95553h;

    public q4(a1 a1Var, a1 a1Var2, a1 a1Var3, String str) {
        this(a1Var, a1Var2, a1Var3, null, str);
    }

    private Double A(c9 c9Var) {
        Double dM;
        d dVarB = c9Var.b();
        return (dVarB == null || (dM = dVarB.m()) == null) ? z().N().c() : dM;
    }

    private void C(io.sentry.protocol.v vVar) {
        z().T(vVar);
    }

    private static void D(q7 q7Var) {
        io.sentry.util.v.c(q7Var, "SentryOptions is required.");
        if (q7Var.getDsn() == null || q7Var.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    private void i(r6 r6Var) {
        z().Q(r6Var);
    }

    private a1 j(a1 a1Var, h4 h4Var) {
        if (h4Var != null) {
            try {
                a1 a1VarM47clone = a1Var.m42clone();
                h4Var.a(a1VarM47clone);
                return a1VarM47clone;
            } catch (Throwable th4) {
                s().getLogger().b(b7.ERROR, "Error in the 'ScopeCallback' callback.", th4);
            }
        }
        return a1Var;
    }

    private io.sentry.protocol.v k(r6 r6Var, j0 j0Var, h4 h4Var) {
        io.sentry.protocol.v vVarI = io.sentry.protocol.v.f95495b;
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVarI;
        }
        if (r6Var == null) {
            s().getLogger().c(b7.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return vVarI;
        }
        try {
            i(r6Var);
            vVarI = y().i(r6Var, j(z(), h4Var), j0Var);
            C(vVarI);
            return vVarI;
        } catch (Throwable th4) {
            s().getLogger().b(b7.ERROR, "Error while capturing event with id: " + r6Var.G(), th4);
            return vVarI;
        }
    }

    private io.sentry.protocol.v l(Throwable th4, j0 j0Var, h4 h4Var) {
        io.sentry.protocol.v vVarI = io.sentry.protocol.v.f95495b;
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th4 == null) {
            s().getLogger().c(b7.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                r6 r6Var = new r6(th4);
                i(r6Var);
                vVarI = y().i(r6Var, j(z(), h4Var), j0Var);
            } catch (Throwable th5) {
                s().getLogger().b(b7.ERROR, "Error while capturing exception: " + th4.getMessage(), th5);
            }
        }
        C(vVarI);
        return vVarI;
    }

    private io.sentry.protocol.v m(String str, b7 b7Var, h4 h4Var) {
        io.sentry.protocol.v vVarG = io.sentry.protocol.v.f95495b;
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            s().getLogger().c(b7.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                vVarG = y().g(str, b7Var, j(z(), h4Var));
            } catch (Throwable th4) {
                s().getLogger().b(b7.ERROR, "Error while capturing message: " + str, th4);
            }
        }
        C(vVarG);
        return vVarG;
    }

    private l1 o(c9 c9Var, e9 e9Var) {
        l1 l1VarA;
        io.sentry.util.v.c(c9Var, "transactionContext is required");
        c9Var.r(e9Var.a());
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            l1VarA = g3.B();
        } else if (io.sentry.util.c0.b(s().getIgnoredSpanOrigins(), c9Var.f())) {
            s().getLogger().c(b7.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", c9Var.f());
            l1VarA = g3.B();
        } else if (!s().getInstrumenter().equals(c9Var.d())) {
            s().getLogger().c(b7.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c9Var.d(), s().getInstrumenter());
            l1VarA = g3.B();
        } else if (s().isTracingEnabled()) {
            Double dA = A(c9Var);
            e9Var.j();
            b9 b9VarA = s().getInternalTracesSampler().a(new e4(c9Var, null, dA, null));
            c9Var.s(b9VarA);
            k1 k1VarM = e9Var.m();
            if (k1VarM == null) {
                k1VarM = s().getSpanFactory();
            }
            l1VarA = k1VarM.a(c9Var, this, e9Var, this.f95551f);
            if (b9VarA.e().booleanValue()) {
                if (b9VarA.b().booleanValue()) {
                    m1 transactionProfiler = s().getTransactionProfiler();
                    if (!transactionProfiler.isRunning()) {
                        transactionProfiler.start();
                        transactionProfiler.a(l1VarA);
                    } else if (e9Var.o()) {
                        transactionProfiler.a(l1VarA);
                    }
                }
                if (s().isContinuousProfilingEnabled()) {
                    u3 profileLifecycle = s().getProfileLifecycle();
                    u3 u3Var = u3.TRACE;
                    if (profileLifecycle == u3Var) {
                        s().getContinuousProfiler().o(u3Var, s().getInternalTracesSampler());
                    }
                }
            }
        } else {
            s().getLogger().c(b7.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            l1VarA = g3.B();
        }
        if (e9Var.p()) {
            l1VarA.s();
        }
        return l1VarA;
    }

    public a1 B() {
        return this.f95546a;
    }

    @Override // io.sentry.c1
    public io.sentry.transport.a0 F() {
        return y().F();
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v H(p5 p5Var, j0 j0Var) {
        io.sentry.util.v.c(p5Var, "SentryEnvelope is required.");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        if (isEnabled()) {
            try {
                io.sentry.protocol.v vVarH = y().H(p5Var, j0Var);
                if (vVarH != null) {
                    return vVarH;
                }
            } catch (Throwable th4) {
                s().getLogger().b(b7.ERROR, "Error while capturing envelope.", th4);
            }
        } else {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.c1
    public void K(j4 j4Var, h4 h4Var) {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            h4Var.a(this.f95552g.d(j4Var));
        } catch (Throwable th4) {
            s().getLogger().b(b7.ERROR, "Error in the 'configureScope' callback.", th4);
        }
    }

    @Override // io.sentry.c1
    public io.sentry.logger.a L() {
        return this.f95553h;
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v M(r7 r7Var, j0 j0Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        if (isEnabled()) {
            try {
                return y().a(r7Var, z(), j0Var);
            } catch (Throwable th4) {
                s().getLogger().b(b7.ERROR, "Error while capturing replay", th4);
            }
        } else {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.c1
    public a1 N() {
        return this.f95548c;
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v O(String str, b7 b7Var) {
        return m(str, b7Var, null);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v P(s3 s3Var) {
        io.sentry.util.v.c(s3Var, "profilingContinuousData is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        if (isEnabled()) {
            try {
                return y().h(s3Var, B());
            } catch (Throwable th4) {
                s().getLogger().b(b7.ERROR, "Error while capturing profile chunk with id: " + s3Var.l(), th4);
            }
        } else {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return vVar;
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v R(r6 r6Var, j0 j0Var) {
        return k(r6Var, j0Var, null);
    }

    @Override // io.sentry.c1
    public l1 S(c9 c9Var, e9 e9Var) {
        return o(c9Var, e9Var);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v U(Throwable th4, j0 j0Var) {
        return l(th4, j0Var, null);
    }

    @Override // io.sentry.c1
    public io.sentry.protocol.v V(io.sentry.protocol.c0 c0Var, z8 z8Var, j0 j0Var, w3 w3Var) {
        io.sentry.protocol.c0 c0Var2;
        io.sentry.util.v.c(c0Var, "transaction is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!c0Var.q0()) {
            s().getLogger().c(b7.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c0Var.G());
        } else if (Boolean.TRUE.equals(Boolean.valueOf(c0Var.r0()))) {
            try {
                c0Var2 = c0Var;
                try {
                    return y().c(c0Var2, z8Var, z(), j0Var, w3Var);
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    s().getLogger().b(b7.ERROR, "Error while capturing transaction with id: " + c0Var2.G(), th5);
                    return vVar;
                }
            } catch (Throwable th6) {
                th = th6;
                c0Var2 = c0Var;
            }
        } else {
            s().getLogger().c(b7.DEBUG, "Transaction %s was dropped due to sampling decision.", c0Var.G());
            if (s().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.h clientReportRecorder = s().getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.BACKPRESSURE;
                clientReportRecorder.a(fVar, l.Transaction);
                s().getClientReportRecorder().c(fVar, l.Span, c0Var.o0().size() + 1);
            } else {
                io.sentry.clientreport.h clientReportRecorder2 = s().getClientReportRecorder();
                io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.SAMPLE_RATE;
                clientReportRecorder2.a(fVar2, l.Transaction);
                s().getClientReportRecorder().c(fVar2, l.Span, c0Var.o0().size() + 1);
            }
        }
        return vVar;
    }

    @Override // io.sentry.c1
    public c1 W(String str) {
        return new q4(this.f95546a.m42clone(), this.f95547b.m42clone(), this.f95548c, this, str);
    }

    @Override // io.sentry.c1
    public j1 a() {
        if (isEnabled()) {
            return z().a();
        }
        s().getLogger().c(b7.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.c1
    public void c(f fVar) {
        q(fVar, new j0());
    }

    @Override // io.sentry.c1
    public boolean isEnabled() {
        return y().isEnabled();
    }

    @Override // io.sentry.c1
    public void n(final boolean z15) {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (r1 r1Var : s().getIntegrations()) {
                if (r1Var instanceof Closeable) {
                    try {
                        ((Closeable) r1Var).close();
                    } catch (Throwable th4) {
                        s().getLogger().c(b7.WARNING, "Failed to close the integration {}.", r1Var, th4);
                    }
                }
            }
            J(new h4() { // from class: io.sentry.k4
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    a1Var.clear();
                }
            });
            j4 j4Var = j4.ISOLATION;
            K(j4Var, new h4() { // from class: io.sentry.l4
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    a1Var.clear();
                }
            });
            s().getBackpressureMonitor().close();
            s().getTransactionProfiler().close();
            s().getContinuousProfiler().n(true);
            s().getCompositePerformanceCollector().close();
            s().getConnectionStatusProvider().close();
            final f1 executorService = s().getExecutorService();
            if (z15) {
                executorService.submit(new Runnable() { // from class: io.sentry.m4
                    @Override // java.lang.Runnable
                    public final void run() {
                        executorService.a(this.f95187a.s().getShutdownTimeoutMillis());
                    }
                });
            } else {
                executorService.a(s().getShutdownTimeoutMillis());
            }
            K(j4.CURRENT, new h4() { // from class: io.sentry.n4
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    a1Var.P().n(z15);
                }
            });
            K(j4Var, new h4() { // from class: io.sentry.o4
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    a1Var.P().n(z15);
                }
            });
            K(j4.GLOBAL, new h4() { // from class: io.sentry.p4
                @Override // io.sentry.h4
                public final void a(a1 a1Var) {
                    a1Var.P().n(z15);
                }
            });
        } catch (Throwable th5) {
            s().getLogger().b(b7.ERROR, "Error while closing the Scopes.", th5);
        }
    }

    @Override // io.sentry.c1
    public void p(String str, String str2) {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            s().getLogger().c(b7.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            z().p(str, str2);
        }
    }

    @Override // io.sentry.c1
    public void q(f fVar, j0 j0Var) {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (fVar == null) {
            s().getLogger().c(b7.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            z().q(fVar, j0Var);
        }
    }

    @Override // io.sentry.c1
    public void r(Throwable th4, j1 j1Var, String str) {
        z().r(th4, j1Var, str);
    }

    @Override // io.sentry.c1
    public q7 s() {
        return this.f95552g.s();
    }

    @Override // io.sentry.c1
    public void t(long j15) {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            y().t(j15);
        } catch (Throwable th4) {
            s().getLogger().b(b7.ERROR, "Error in the 'client.flush'.", th4);
        }
    }

    @Override // io.sentry.c1
    public l1 u() {
        if (isEnabled()) {
            return z().u();
        }
        s().getLogger().c(b7.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.c1
    public void v() {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        i8 i8VarV = z().v();
        if (i8VarV != null) {
            y().e(i8VarV, io.sentry.util.m.e(new io.sentry.hints.m()));
        }
    }

    @Override // io.sentry.c1
    public boolean w() {
        return y().w();
    }

    @Override // io.sentry.c1
    public void x() {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        f4.d dVarX = z().x();
        if (dVarX == null) {
            s().getLogger().c(b7.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (dVarX.b() != null) {
            y().e(dVarX.b(), io.sentry.util.m.e(new io.sentry.hints.m()));
        }
        y().e(dVarX.a(), io.sentry.util.m.e(new io.sentry.hints.o()));
    }

    public e1 y() {
        return z().P();
    }

    public a1 z() {
        return this.f95552g;
    }

    private q4(a1 a1Var, a1 a1Var2, a1 a1Var3, q4 q4Var, String str) {
        this.f95552g = new i(a1Var3, a1Var2, a1Var);
        this.f95546a = a1Var;
        this.f95547b = a1Var2;
        this.f95548c = a1Var3;
        this.f95549d = q4Var;
        this.f95550e = str;
        q7 q7VarS = s();
        D(q7VarS);
        this.f95551f = q7VarS.getCompositePerformanceCollector();
        this.f95553h = new io.sentry.logger.c(this);
    }

    @Override // io.sentry.c1
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public u0 m45clone() {
        if (!isEnabled()) {
            s().getLogger().c(b7.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new o0(W("scopes clone"));
    }
}
