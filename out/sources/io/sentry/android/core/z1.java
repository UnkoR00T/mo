package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b7;
import io.sentry.d5;
import io.sentry.h4;
import io.sentry.i8;
import io.sentry.m3;
import io.sentry.q7;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f94199a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final io.sentry.util.a f94200b = new io.sentry.util.a();

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, io.sentry.a1 a1Var) {
        i8 session = a1Var.getSession();
        if (session == null || session.k() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(io.sentry.v0 v0Var, Context context, d5.a aVar, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.s sVar = new io.sentry.util.s();
        boolean zB = sVar.b("timber.log.Timber", sentryAndroidOptions);
        boolean z15 = false;
        if (sVar.b("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", sentryAndroidOptions) && sVar.b("io.sentry.android.fragment.FragmentLifecycleIntegration", sentryAndroidOptions)) {
            z15 = true;
        }
        boolean z16 = zB && sVar.b("io.sentry.android.timber.SentryTimberIntegration", sentryAndroidOptions);
        boolean zB2 = sVar.b("io.sentry.android.replay.ReplayIntegration", sentryAndroidOptions);
        boolean zB3 = sVar.b("io.sentry.android.distribution.DistributionIntegration", sentryAndroidOptions);
        t0 t0Var = new t0(v0Var);
        io.sentry.util.s sVar2 = new io.sentry.util.s();
        h hVar = new h(sVar2, sentryAndroidOptions);
        d0.h(sentryAndroidOptions, context, v0Var, t0Var);
        d0.g(context, sentryAndroidOptions, t0Var, sVar2, hVar, z15, z16, zB2, zB3);
        try {
            aVar.a(sentryAndroidOptions);
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().b(b7.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th4);
        }
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        if (sentryAndroidOptions.isEnablePerformanceV2() && t0Var.d() >= 24) {
            io.sentry.android.core.performance.i iVarK = hVarP.k();
            if (iVarK.r()) {
                iVarK.y(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarP.x((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVarQ = hVarP.q();
        if (iVarQ.r()) {
            iVarQ.y(f94199a);
        }
        d0.f(sentryAndroidOptions, context, t0Var, sVar2, hVar);
        d(sentryAndroidOptions, z15, z16);
    }

    private static void d(q7 q7Var, boolean z15, boolean z16) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (io.sentry.r1 r1Var : q7Var.getIntegrations()) {
            if (z15 && (r1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(r1Var);
            }
            if (z16 && (r1Var instanceof SentryTimberIntegration)) {
                arrayList.add(r1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i15 = 0; i15 < arrayList2.size() - 1; i15++) {
                q7Var.getIntegrations().remove((io.sentry.r1) arrayList2.get(i15));
            }
        }
        if (arrayList.size() > 1) {
            for (int i16 = 0; i16 < arrayList.size() - 1; i16++) {
                q7Var.getIntegrations().remove((io.sentry.r1) arrayList.get(i16));
            }
        }
    }

    public static void e(Context context, io.sentry.v0 v0Var) {
        f(context, v0Var, new d5.a() { // from class: io.sentry.android.core.w1
            @Override // io.sentry.d5.a
            public final void a(q7 q7Var) {
                z1.a((SentryAndroidOptions) q7Var);
            }
        });
    }

    @SuppressLint({"NewApi"})
    public static void f(final Context context, final io.sentry.v0 v0Var, final d5.a<SentryAndroidOptions> aVar) {
        try {
            io.sentry.g1 g1VarA = f94200b.a();
            try {
                d5.v(m3.a(SentryAndroidOptions.class), new d5.a() { // from class: io.sentry.android.core.x1
                    @Override // io.sentry.d5.a
                    public final void a(q7 q7Var) {
                        z1.c(v0Var, context, aVar, (SentryAndroidOptions) q7Var);
                    }
                }, true);
                io.sentry.c1 c1VarR = d5.r();
                if (a1.s()) {
                    if (c1VarR.s().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        c1VarR.J(new h4() { // from class: io.sentry.android.core.y1
                            @Override // io.sentry.h4
                            public final void a(io.sentry.a1 a1Var) {
                                z1.b(atomicBoolean, a1Var);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            c1VarR.x();
                        }
                    }
                    c1VarR.s().getReplayController().start();
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
        } catch (IllegalAccessException e15) {
            v0Var.b(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e15);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e15);
        } catch (InstantiationException e16) {
            v0Var.b(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e16);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e16);
        } catch (NoSuchMethodException e17) {
            v0Var.b(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e17);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e17);
        } catch (InvocationTargetException e18) {
            v0Var.b(b7.FATAL, "Fatal error during SentryAndroid.init(...)", e18);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e18);
        }
    }

    public static void g(Context context, d5.a<SentryAndroidOptions> aVar) {
        f(context, new y(), aVar);
    }
}
