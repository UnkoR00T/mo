package io.sentry;

import java.io.Closeable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class UncaughtExceptionHandlerIntegration implements r1, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.util.a f93612f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f93613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1 f93614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q7 f93615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f93616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f9 f93617e;

    public static class a extends io.sentry.hints.d implements io.sentry.hints.l, io.sentry.hints.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicReference<io.sentry.protocol.v> f93618d;

        public a(long j15, v0 v0Var) {
            super(j15, v0Var);
            this.f93618d = new AtomicReference<>();
        }

        @Override // io.sentry.hints.f
        public boolean b(io.sentry.protocol.v vVar) {
            io.sentry.protocol.v vVar2 = this.f93618d.get();
            return vVar2 != null && vVar2.equals(vVar);
        }

        @Override // io.sentry.hints.f
        public void c(io.sentry.protocol.v vVar) {
            this.f93618d.set(vVar);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(f9.a.c());
    }

    static Throwable b(Thread thread, Throwable th4) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.n(Boolean.FALSE);
        jVar.p("UncaughtExceptionHandler");
        return new io.sentry.exception.a(jVar, th4, thread);
    }

    private void h(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        p(uncaughtExceptionHandler, new HashSet());
    }

    private void p(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Set<Thread.UncaughtExceptionHandler> set) {
        if (uncaughtExceptionHandler == null) {
            q7 q7Var = this.f93615c;
            if (q7Var != null) {
                q7Var.getLogger().c(b7.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!set.add(uncaughtExceptionHandler)) {
            q7 q7Var2 = this.f93615c;
            if (q7Var2 != null) {
                q7Var2.getLogger().c(b7.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f93613a;
            if (this != uncaughtExceptionHandler2) {
                p(uncaughtExceptionHandler2, set);
                return;
            }
            uncaughtExceptionHandlerIntegration.f93613a = this.f93613a;
            q7 q7Var3 = this.f93615c;
            if (q7Var3 != null) {
                q7Var3.getLogger().c(b7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g1 g1VarA = f93612f.a();
        try {
            if (this == this.f93617e.b()) {
                this.f93617e.a(this.f93613a);
                q7 q7Var = this.f93615c;
                if (q7Var != null) {
                    q7Var.getLogger().c(b7.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                h(this.f93617e.b());
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

    @Override // io.sentry.r1
    public final void m(c1 c1Var, q7 q7Var) {
        if (this.f93616d) {
            q7Var.getLogger().c(b7.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f93616d = true;
        this.f93614b = (c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        q7 q7Var2 = (q7) io.sentry.util.v.c(q7Var, "SentryOptions is required");
        this.f93615c = q7Var2;
        v0 logger = q7Var2.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f93615c.isEnableUncaughtExceptionHandler()));
        if (this.f93615c.isEnableUncaughtExceptionHandler()) {
            g1 g1VarA = f93612f.a();
            try {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandlerB = this.f93617e.b();
                if (uncaughtExceptionHandlerB != null) {
                    this.f93615c.getLogger().c(b7Var, "default UncaughtExceptionHandler class='" + uncaughtExceptionHandlerB.getClass().getName() + "'", new Object[0]);
                    if (uncaughtExceptionHandlerB instanceof UncaughtExceptionHandlerIntegration) {
                        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandlerB;
                        if (uncaughtExceptionHandlerIntegration.f93614b == null || c1Var.N() != uncaughtExceptionHandlerIntegration.f93614b.N()) {
                            this.f93613a = uncaughtExceptionHandlerB;
                        } else {
                            this.f93613a = uncaughtExceptionHandlerIntegration.f93613a;
                        }
                    } else {
                        this.f93613a = uncaughtExceptionHandlerB;
                    }
                }
                this.f93617e.a(this);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                this.f93615c.getLogger().c(b7Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                io.sentry.util.p.a("UncaughtExceptionHandler");
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
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th4) {
        q7 q7Var = this.f93615c;
        if (q7Var == null || this.f93614b == null) {
            return;
        }
        q7Var.getLogger().c(b7.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f93615c.getFlushTimeoutMillis(), this.f93615c.getLogger());
            r6 r6Var = new r6(b(thread, th4));
            r6Var.C0(b7.FATAL);
            if (this.f93614b.u() == null && r6Var.G() != null) {
                aVar.c(r6Var.G());
            }
            j0 j0VarE = io.sentry.util.m.e(aVar);
            boolean zEquals = this.f93614b.R(r6Var, j0VarE).equals(io.sentry.protocol.v.f95495b);
            io.sentry.hints.h hVarF = io.sentry.util.m.f(j0VarE);
            if ((!zEquals || io.sentry.hints.h.MULTITHREADED_DEDUPLICATION.equals(hVarF)) && !aVar.g()) {
                this.f93615c.getLogger().c(b7.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", r6Var.G());
            }
        } catch (Throwable th5) {
            this.f93615c.getLogger().b(b7.ERROR, "Error sending uncaught exception to Sentry.", th5);
        }
        if (this.f93613a != null) {
            this.f93615c.getLogger().c(b7.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f93613a.uncaughtException(thread, th4);
        } else if (this.f93615c.isPrintUncaughtStackTrace()) {
            th4.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(f9 f9Var) {
        this.f93616d = false;
        this.f93617e = (f9) io.sentry.util.v.c(f9Var, "threadAdapter is required.");
    }
}
