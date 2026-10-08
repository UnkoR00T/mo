package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b7;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.d3;
import io.sentry.h3;
import io.sentry.j2;
import io.sentry.j3;
import io.sentry.j4;
import io.sentry.k2;
import io.sentry.k7;
import io.sentry.l2;
import io.sentry.u4;
import io.sentry.x4;
import io.sentry.y4;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class d0 {
    static File d(Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    private static String e(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    static void f(SentryAndroidOptions sentryAndroidOptions, Context context, t0 t0Var, io.sentry.util.s sVar, h hVar) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof k2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.e(context, sentryAndroidOptions, t0Var, io.sentry.android.core.internal.util.f.b()));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.r(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.n(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new e1(context, t0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new t1(sentryAndroidOptions, hVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, t0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n0(context, sentryAndroidOptions, t0Var));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.u) {
            sentryAndroidOptions.setTransportGate(new j0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        io.sentry.g1 g1VarA = io.sentry.android.core.performance.h.f94103s.a();
        try {
            io.sentry.m1 m1VarI = hVarP.i();
            io.sentry.q0 q0VarH = hVarP.h();
            hVarP.z(null);
            hVarP.y(null);
            if (g1VarA != null) {
                g1VarA.close();
            }
            j(sentryAndroidOptions, context, t0Var, m1VarI, q0VarH);
            if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
                sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.b(context, sentryAndroidOptions.getLogger()));
            }
            if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
                sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
            }
            if (sentryAndroidOptions.getVersionDetector() instanceof j3) {
                sentryAndroidOptions.setVersionDetector(new io.sentry.s(sentryAndroidOptions));
            }
            boolean zB = sVar.b("androidx.core.view.ScrollingView", sentryAndroidOptions);
            boolean zB2 = sVar.b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
            if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new io.sentry.android.core.internal.gestures.a(zB));
                if (zB2 && sVar.b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                    arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
                }
                sentryAndroidOptions.setGestureTargetLocators(arrayList);
            }
            if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB2 && sVar.b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
                sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
            }
            if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
                sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.h.e());
            }
            if (sentryAndroidOptions.getSocketTagger() instanceof d3) {
                sentryAndroidOptions.setSocketTagger(g0.c());
            }
            if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
                sentryAndroidOptions.addPerformanceCollector(new z());
                sentryAndroidOptions.addPerformanceCollector(new v(sentryAndroidOptions.getLogger()));
                if (sentryAndroidOptions.isEnablePerformanceV2()) {
                    sentryAndroidOptions.addPerformanceCollector(new e2(sentryAndroidOptions, (io.sentry.android.core.internal.util.a0) io.sentry.util.v.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                }
            }
            if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof j2) {
                sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.p(sentryAndroidOptions));
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

    static void g(Context context, final SentryAndroidOptions sentryAndroidOptions, t0 t0Var, io.sentry.util.s sVar, h hVar, boolean z15, boolean z16, boolean z17, boolean z18) {
        io.sentry.util.r rVar = new io.sentry.util.r(new io.sentry.util.r.a() { // from class: io.sentry.android.core.a0
            @Override // io.sentry.util.r.a
            public final Object a() {
                return Boolean.valueOf(io.sentry.android.core.cache.b.T(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new x4(new u4() { // from class: io.sentry.android.core.b0
            @Override // io.sentry.u4
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), rVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(sVar.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.h());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new y4(new u4() { // from class: io.sentry.android.core.c0
            @Override // io.sentry.u4
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), rVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(m0.a(context, t0Var));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, t0Var, hVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, sVar));
            if (z15) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(b7.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z16) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, t0Var));
        if (z17) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.b());
            replayIntegration.H0(new io.sentry.android.replay.a());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z18) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().g(new SentryAndroidOptions.a());
    }

    static void h(SentryAndroidOptions sentryAndroidOptions, Context context, io.sentry.v0 v0Var, t0 t0Var) {
        io.sentry.util.v.c(context, "The context is required.");
        Context contextG = a1.g(context);
        io.sentry.util.v.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.v.c(v0Var, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(v0Var);
        sentryAndroidOptions.setFatalLogger(new x());
        sentryAndroidOptions.setDefaultScopeType(j4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(k7.OFF);
        sentryAndroidOptions.setDateProvider(new a2());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.a0(contextG, v0Var, t0Var));
        q1.a(contextG, sentryAndroidOptions, t0Var);
        sentryAndroidOptions.setCacheDirPath(d(contextG).getAbsolutePath());
        i(sentryAndroidOptions, contextG, t0Var);
        s0.y().E(sentryAndroidOptions);
    }

    private static void i(SentryAndroidOptions sentryAndroidOptions, Context context, t0 t0Var) {
        PackageInfo packageInfoP = a1.p(context, t0Var);
        if (packageInfoP != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(e(packageInfoP, a1.q(packageInfoP, t0Var)));
            }
            String str = packageInfoP.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(l1.a(context));
            } catch (RuntimeException e15) {
                sentryAndroidOptions.getLogger().b(b7.ERROR, "Could not generate distinct Id.", e15);
            }
        }
    }

    private static void j(SentryAndroidOptions sentryAndroidOptions, Context context, t0 t0Var, io.sentry.m1 m1Var, io.sentry.q0 q0Var) {
        if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
            sentryAndroidOptions.setContinuousProfiler(l2.a());
            if (q0Var != null) {
                q0Var.n(true);
            }
            if (m1Var != null) {
                sentryAndroidOptions.setTransactionProfiler(m1Var);
                return;
            } else {
                sentryAndroidOptions.setTransactionProfiler(new i0(context, sentryAndroidOptions, t0Var, (io.sentry.android.core.internal.util.a0) io.sentry.util.v.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                return;
            }
        }
        sentryAndroidOptions.setTransactionProfiler(h3.c());
        if (m1Var != null) {
            m1Var.close();
        }
        if (q0Var != null) {
            sentryAndroidOptions.setContinuousProfiler(q0Var);
        } else {
            sentryAndroidOptions.setContinuousProfiler(new u(t0Var, (io.sentry.android.core.internal.util.a0) io.sentry.util.v.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required"), sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
        }
    }
}
