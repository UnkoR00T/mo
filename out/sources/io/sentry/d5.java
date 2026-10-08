package io.sentry;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d1 f94836a = x2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c1 f94837b = v2.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a1 f94838c = new f4(q7.empty());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f94839d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f94840e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f94841f = System.currentTimeMillis();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final io.sentry.util.a f94842g = new io.sentry.util.a();

    public interface a<T extends q7> {
        void a(T t15);
    }

    private static void A(q7 q7Var) {
        if (q7Var.isDebug() && (q7Var.getLogger() instanceof p2)) {
            q7Var.setLogger(new y8());
        }
    }

    private static void B(q7 q7Var) {
        t().close();
        if (k7.OFF == q7Var.getOpenTelemetryMode()) {
            f94836a = new q();
        } else {
            f94836a = s4.a(new io.sentry.util.s(), p2.e());
        }
    }

    public static boolean C() {
        return r().isEnabled();
    }

    public static boolean D() {
        return r().w();
    }

    private static void E(q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new i2(q7Var));
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.DEBUG, "Failed to move previous session.", th4);
        }
    }

    private static void F(final q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.c5
                @Override // java.lang.Runnable
                public final void run() {
                    d5.c(q7Var);
                }
            });
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.DEBUG, "Failed to notify options observers.", th4);
        }
    }

    private static boolean G(q7 q7Var) {
        if (q7Var.isEnableExternalConfiguration()) {
            q7Var.merge(g0.g(io.sentry.config.g.a(), q7Var.getLogger()));
        }
        String dsn = q7Var.getDsn();
        if (!q7Var.isEnabled() || (dsn != null && dsn.isEmpty())) {
            l();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        q7Var.retrieveParsedDsn();
        return true;
    }

    private static b9 H(q7 q7Var) {
        c9 c9Var = new c9("app.launch", "profile");
        c9Var.z(true);
        return q7Var.getInternalTracesSampler().a(new e4(c9Var, null, Double.valueOf(io.sentry.util.b0.a().c()), null));
    }

    public static void I(String str, String str2) {
        r().p(str, str2);
    }

    public static void J() {
        r().x();
    }

    public static l1 K(c9 c9Var, e9 e9Var) {
        return r().S(c9Var, e9Var);
    }

    public static /* synthetic */ void a(q7 q7Var) {
        String cacheDirPathWithoutDsn = q7Var.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                io.sentry.util.h.a(file);
                if (q7Var.isEnableAppStartProfiling() || q7Var.isStartProfilerOnAppStart()) {
                    if (!q7Var.isStartProfilerOnAppStart() && !q7Var.isTracingEnabled()) {
                        q7Var.getLogger().c(b7.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        e5 e5Var = new e5(q7Var, q7Var.isEnableAppStartProfiling() ? H(q7Var) : new b9(Boolean.FALSE));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f94840e));
                            try {
                                q7Var.getSerializer().a(e5Var, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                            throw th6;
                        }
                    }
                }
            } catch (Throwable th8) {
                q7Var.getLogger().b(b7.ERROR, "Unable to create app start profiling config file. ", th8);
            }
        }
    }

    public static /* synthetic */ void c(q7 q7Var) {
        for (w0 w0Var : q7Var.getOptionsObservers()) {
            w0Var.g(q7Var.getRelease());
            w0Var.e(q7Var.getProguardUuid());
            w0Var.f(q7Var.getSdkVersion());
            w0Var.b(q7Var.getDist());
            w0Var.d(q7Var.getEnvironment());
            w0Var.a(q7Var.getTags());
            w0Var.c(q7Var.getSessionReplay().g());
        }
        io.sentry.cache.r rVarFindPersistingScopeObserver = q7Var.findPersistingScopeObserver();
        if (rVarFindPersistingScopeObserver != null) {
            rVarFindPersistingScopeObserver.v();
        }
    }

    public static /* synthetic */ void d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < f94841f - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.h.a(file2);
            }
        }
    }

    public static void e(f fVar) {
        r().c(fVar);
    }

    public static void f(f fVar, j0 j0Var) {
        r().q(fVar, j0Var);
    }

    private static <T extends q7> void g(a<T> aVar, T t15) {
        try {
            aVar.a(t15);
        } catch (Throwable th4) {
            t15.getLogger().b(b7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th4);
        }
    }

    public static io.sentry.protocol.v h(r6 r6Var, j0 j0Var) {
        return r().R(r6Var, j0Var);
    }

    public static io.sentry.protocol.v i(Throwable th4) {
        return r().T(th4);
    }

    public static io.sentry.protocol.v j(Throwable th4, j0 j0Var) {
        return r().U(th4, j0Var);
    }

    public static io.sentry.protocol.v k(String str, b7 b7Var) {
        return r().O(str, b7Var);
    }

    public static void l() {
        g1 g1VarA = f94842g.a();
        try {
            c1 c1VarR = r();
            f94837b = v2.d();
            t().close();
            c1VarR.n(false);
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

    public static void m(j4 j4Var, h4 h4Var) {
        r().K(j4Var, h4Var);
    }

    public static void n() {
        r().v();
    }

    private static void o(q7 q7Var, c1 c1Var) {
        try {
            q7Var.getExecutorService().submit(new r3(q7Var, c1Var));
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.DEBUG, "Failed to finalize previous session.", th4);
        }
    }

    public static void p(long j15) {
        r().t(j15);
    }

    public static c1 q(String str) {
        return r().W(str);
    }

    public static c1 r() {
        if (f94839d) {
            return f94837b;
        }
        c1 c1Var = t().get();
        if (c1Var != null && !c1Var.G()) {
            return c1Var;
        }
        c1 c1VarW = f94837b.W("getCurrentScopes");
        t().a(c1VarW);
        return c1VarW;
    }

    public static a1 s() {
        return f94838c;
    }

    private static d1 t() {
        return f94836a;
    }

    private static void u(final q7 q7Var, f1 f1Var) {
        try {
            f1Var.submit(new Runnable() { // from class: io.sentry.a5
                @Override // java.lang.Runnable
                public final void run() {
                    d5.a(q7Var);
                }
            });
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th4);
        }
    }

    public static <T extends q7> void v(m3<T> m3Var, a<T> aVar, boolean z15) {
        T tB = m3Var.b();
        g(aVar, tB);
        w(tB, z15);
    }

    private static void w(final q7 q7Var, boolean z15) {
        g1 g1VarA = f94842g.a();
        try {
            if (!q7Var.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.x.a()) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. " + q7Var.getClass().getName());
            }
            if (!G(q7Var)) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            Boolean boolIsGlobalHubMode = q7Var.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z15 = boolIsGlobalHubMode.booleanValue();
            }
            q7Var.getLogger().c(b7.INFO, "GlobalHubMode: '%s'", String.valueOf(z15));
            f94839d = z15;
            y(q7Var);
            a1 a1Var = f94838c;
            if (io.sentry.util.o.a(a1Var.s(), q7Var, C())) {
                if (C()) {
                    q7Var.getLogger().c(b7.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                r().n(true);
                a1Var.y(q7Var);
                f94837b = new q4(new f4(q7Var), new f4(q7Var), a1Var, "Sentry.init");
                A(q7Var);
                z(q7Var);
                t().a(f94837b);
                x(q7Var);
                a1Var.K(new l5(q7Var));
                if (q7Var.getExecutorService().isClosed()) {
                    q7Var.setExecutorService(new v6(q7Var));
                    q7Var.getExecutorService().b();
                }
                try {
                    q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.z4
                        @Override // java.lang.Runnable
                        public final void run() {
                            q7Var.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e15) {
                    q7Var.getLogger().b(b7.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e15);
                }
                E(q7Var);
                for (r1 r1Var : q7Var.getIntegrations()) {
                    try {
                        r1Var.m(r4.b(), q7Var);
                    } catch (Throwable th4) {
                        q7Var.getLogger().b(b7.WARNING, "Failed to register the integration " + r1Var.getClass().getName(), th4);
                    }
                }
                F(q7Var);
                o(q7Var, r4.b());
                u(q7Var, q7Var.getExecutorService());
                v0 logger = q7Var.getLogger();
                b7 b7Var = b7.DEBUG;
                logger.c(b7Var, "Using openTelemetryMode %s", q7Var.getOpenTelemetryMode());
                q7Var.getLogger().c(b7Var, "Using span factory %s", q7Var.getSpanFactory().getClass().getName());
                q7Var.getLogger().c(b7Var, "Using scopes storage %s", f94836a.getClass().getName());
            } else {
                q7Var.getLogger().c(b7.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
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

    private static void x(q7 q7Var) {
        v0 logger = q7Var.getLogger();
        b7 b7Var = b7.INFO;
        logger.c(b7Var, "Initializing SDK with DSN: '%s'", q7Var.getDsn());
        String outboxPath = q7Var.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(b7Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (q7Var.getEnvelopeDiskCache() instanceof io.sentry.transport.s) {
                q7Var.setEnvelopeDiskCache(io.sentry.cache.f.x(q7Var));
            }
        }
        String profilingTracesDirPath = q7Var.getProfilingTracesDirPath();
        if ((q7Var.isProfilingEnabled() || q7Var.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.b5
                    @Override // java.lang.Runnable
                    public final void run() {
                        d5.d(file);
                    }
                });
            } catch (RejectedExecutionException e15) {
                q7Var.getLogger().b(b7.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e15);
            }
        }
        io.sentry.internal.modules.b modulesLoader = q7Var.getModulesLoader();
        if (!q7Var.isSendModules()) {
            q7Var.setModulesLoader(io.sentry.internal.modules.e.b());
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            q7Var.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(q7Var.getLogger()), new io.sentry.internal.modules.f(q7Var.getLogger())), q7Var.getLogger()));
        }
        if (q7Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            q7Var.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(q7Var.getLogger()));
        }
        io.sentry.util.d.a(q7Var, q7Var.getDebugMetaLoader().a());
        if (q7Var.getThreadChecker() instanceof io.sentry.util.thread.b) {
            q7Var.setThreadChecker(io.sentry.util.thread.c.d());
        }
        if (q7Var.getPerformanceCollectors().isEmpty()) {
            q7Var.addPerformanceCollector(new s1());
        }
        if (q7Var.isEnableBackpressureHandling() && io.sentry.util.x.c()) {
            if (q7Var.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                q7Var.setBackpressureMonitor(new io.sentry.backpressure.a(q7Var, r4.b()));
            }
            q7Var.getBackpressureMonitor().start();
        }
    }

    private static void y(q7 q7Var) {
        if (q7Var.getFatalLogger() instanceof p2) {
            q7Var.setFatalLogger(new y8());
        }
    }

    private static void z(q7 q7Var) {
        io.sentry.opentelemetry.a.c(q7Var, new io.sentry.util.s());
        if (k7.OFF == q7Var.getOpenTelemetryMode()) {
            q7Var.setSpanFactory(new r());
        }
        B(q7Var);
        io.sentry.opentelemetry.a.a(q7Var);
    }
}
