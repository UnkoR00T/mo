package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.b7;
import io.sentry.b9;
import io.sentry.c9;
import io.sentry.d9;
import io.sentry.e9;
import io.sentry.f4;
import io.sentry.g3;
import io.sentry.h4;
import io.sentry.i7;
import io.sentry.n5;
import io.sentry.q7;
import io.sentry.t8;
import io.sentry.u8;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityLifecycleIntegration implements io.sentry.r1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f93630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f93631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.c1 f93632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SentryAndroidOptions f93633d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f93636g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.sentry.j1 f93639k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f93646s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f93634e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f93635f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f93637h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.sentry.i0 f93638j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.j1> f93640l = new WeakHashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.j1> f93641m = new WeakHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.android.core.performance.b> f93642n = new WeakHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private n5 f93643p = new i7(new Date(0), 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Future<?> f93644q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final WeakHashMap<Activity, io.sentry.l1> f93645r = new WeakHashMap<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.sentry.util.a f93647t = new io.sentry.util.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f93648v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final io.sentry.util.a f93649w = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, t0 t0Var, h hVar) {
        this.f93630a = (Application) io.sentry.util.v.c(application, "Application is required");
        this.f93631b = (t0) io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
        this.f93646s = (h) io.sentry.util.v.c(hVar, "ActivityFramesTracker is required");
        if (t0Var.d() >= 29) {
            this.f93636g = true;
        }
    }

    public static /* synthetic */ void C(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, io.sentry.l1 l1Var) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.f93646s.j(activity, l1Var.i());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f93633d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private String C0(String str) {
        return str + " initial display";
    }

    public static /* synthetic */ void E(io.sentry.l1 l1Var, io.sentry.a1 a1Var, io.sentry.l1 l1Var2) {
        if (l1Var2 == l1Var) {
            a1Var.J();
        }
    }

    private boolean H0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private void J() {
        Future<?> future = this.f93644q;
        if (future != null) {
            future.cancel(false);
            this.f93644q = null;
        }
    }

    private void K() {
        this.f93637h = false;
        this.f93643p = new i7(new Date(0L), 0L);
        this.f93642n.clear();
    }

    private void M() {
        n5 n5VarJ = io.sentry.android.core.performance.h.p().l(this.f93633d).j();
        if (!this.f93634e || n5VarJ == null) {
            return;
        }
        V(this.f93639k, n5VarJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (j1Var == null || j1Var.d()) {
            return;
        }
        j1Var.h(t0(j1Var));
        n5 n5VarX = j1Var2 != null ? j1Var2.x() : null;
        if (n5VarX == null) {
            n5VarX = j1Var.A();
        }
        Z(j1Var, n5VarX, u8.DEADLINE_EXCEEDED);
    }

    private void O(io.sentry.j1 j1Var) {
        if (j1Var == null || j1Var.d()) {
            return;
        }
        j1Var.g();
    }

    private boolean O0(Activity activity) {
        return this.f93645r.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
        io.sentry.android.core.performance.i iVarK = hVarP.k();
        io.sentry.android.core.performance.i iVarQ = hVarP.q();
        if (iVarK.t() && iVarK.s()) {
            iVarK.D();
        }
        if (iVarQ.t() && iVarQ.s()) {
            iVarQ.D();
        }
        M();
        io.sentry.g1 g1VarA = this.f93649w.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f93633d;
            if (sentryAndroidOptions == null || j1Var2 == null) {
                O(j1Var2);
                if (this.f93648v) {
                    O(j1Var);
                }
            } else {
                n5 n5VarA = sentryAndroidOptions.getDateProvider().a();
                long millis = TimeUnit.NANOSECONDS.toMillis(n5VarA.e(j1Var2.A()));
                Long lValueOf = Long.valueOf(millis);
                io.sentry.h2.a aVar = io.sentry.h2.a.MILLISECOND;
                j1Var2.r("time_to_initial_display", lValueOf, aVar);
                if (j1Var != null && this.f93648v) {
                    this.f93648v = false;
                    j1Var2.r("time_to_full_display", Long.valueOf(millis), aVar);
                    j1Var.r("time_to_full_display", Long.valueOf(millis), aVar);
                    V(j1Var, n5VarA);
                }
                V(j1Var2, n5VarA);
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

    private void V(io.sentry.j1 j1Var, n5 n5Var) {
        Z(j1Var, n5Var, null);
    }

    private void Y0(t8 t8Var) {
        t8Var.g("auto.ui.activity");
    }

    private void Z(io.sentry.j1 j1Var, n5 n5Var, u8 u8Var) {
        if (j1Var == null || j1Var.d()) {
            return;
        }
        if (u8Var == null) {
            u8Var = j1Var.b() != null ? j1Var.b() : u8.OK;
        }
        j1Var.y(u8Var, n5Var);
    }

    private void a0(io.sentry.j1 j1Var, u8 u8Var) {
        if (j1Var == null || j1Var.d()) {
            return;
        }
        j1Var.o(u8Var);
    }

    private void b0(final io.sentry.l1 l1Var, io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (l1Var == null || l1Var.d()) {
            return;
        }
        a0(j1Var, u8.DEADLINE_EXCEEDED);
        N(j1Var2, j1Var);
        J();
        u8 u8VarB = l1Var.b();
        if (u8VarB == null) {
            u8VarB = u8.OK;
        }
        l1Var.o(u8VarB);
        io.sentry.c1 c1Var = this.f93632c;
        if (c1Var != null) {
            c1Var.J(new h4() { // from class: io.sentry.android.core.m
                @Override // io.sentry.h4
                public final void a(io.sentry.a1 a1Var) {
                    this.f94057a.L(a1Var, l1Var);
                }
            });
        }
    }

    private String c0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String d0(boolean z15) {
        return z15 ? "Cold Start" : "Warm Start";
    }

    private void d1(Activity activity) {
        Boolean boolValueOf;
        n5 n5Var;
        n5 n5Var2;
        final io.sentry.l1 l1Var;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f93632c == null || O0(activity)) {
            return;
        }
        if (!this.f93634e) {
            this.f93645r.put(activity, g3.B());
            if (this.f93633d.isEnableAutoTraceIdGeneration()) {
                io.sentry.util.i0.j(this.f93632c);
                return;
            }
            return;
        }
        i1();
        final String strC0 = c0(activity);
        io.sentry.android.core.performance.i iVarL = io.sentry.android.core.performance.h.p().l(this.f93633d);
        b9 b9Var = null;
        if (a1.s() && iVarL.t()) {
            n5 n5VarN = iVarL.n();
            boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.p().m() == io.sentry.android.core.performance.h.a.COLD);
            n5Var = n5VarN;
        } else {
            boolValueOf = null;
            n5Var = null;
        }
        e9 e9Var = new e9();
        long deadlineTimeout = this.f93633d.getDeadlineTimeout();
        e9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.f93633d.isEnableActivityLifecycleTracingAutoFinish()) {
            e9Var.t(this.f93633d.getIdleTimeout());
            e9Var.i(true);
        }
        e9Var.v(true);
        e9Var.u(new d9() { // from class: io.sentry.android.core.o
            @Override // io.sentry.d9
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.C(this.f94067a, weakReference, strC0, l1Var2);
            }
        });
        if (this.f93637h || n5Var == null || boolValueOf == null) {
            n5Var2 = this.f93643p;
        } else {
            b9 b9VarJ = io.sentry.android.core.performance.h.p().j();
            io.sentry.android.core.performance.h.p().A(null);
            b9Var = b9VarJ;
            n5Var2 = n5Var;
        }
        e9Var.h(n5Var2);
        e9Var.r(b9Var != null);
        Y0(e9Var);
        io.sentry.l1 l1VarS = this.f93632c.S(new c9(strC0, io.sentry.protocol.f0.COMPONENT, "ui.load", b9Var), e9Var);
        t8 t8Var = new t8();
        Y0(t8Var);
        if (this.f93637h || n5Var == null || boolValueOf == null) {
            l1Var = l1VarS;
        } else {
            l1Var = l1VarS;
            this.f93639k = l1Var.u(n0(boolValueOf.booleanValue()), d0(boolValueOf.booleanValue()), n5Var, io.sentry.q1.SENTRY, t8Var);
            M();
        }
        String strC1 = C0(strC0);
        io.sentry.q1 q1Var = io.sentry.q1.SENTRY;
        n5 n5Var3 = n5Var2;
        final io.sentry.j1 j1VarU = l1Var.u("ui.load.initial_display", strC1, n5Var3, q1Var, t8Var);
        this.f93640l.put(activity, j1VarU);
        if (this.f93635f && this.f93638j != null && this.f93633d != null) {
            final io.sentry.j1 j1VarU2 = l1Var.u("ui.load.full_display", u0(strC0), n5Var3, q1Var, t8Var);
            try {
                this.f93641m.put(activity, j1VarU2);
                this.f93644q = this.f93633d.getExecutorService().c(new Runnable() { // from class: io.sentry.android.core.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94083a.N(j1VarU2, j1VarU);
                    }
                }, 25000L);
            } catch (RejectedExecutionException e15) {
                this.f93633d.getLogger().b(b7.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e15);
            }
        }
        this.f93632c.J(new h4() { // from class: io.sentry.android.core.q
            @Override // io.sentry.h4
            public final void a(io.sentry.a1 a1Var) {
                this.f94123a.I(a1Var, l1Var);
            }
        });
        this.f93645r.put(activity, l1Var);
    }

    private void i1() {
        for (Map.Entry<Activity, io.sentry.l1> entry : this.f93645r.entrySet()) {
            b0(entry.getValue(), this.f93640l.get(entry.getKey()), this.f93641m.get(entry.getKey()));
        }
    }

    private String n0(boolean z15) {
        return z15 ? "app.start.cold" : "app.start.warm";
    }

    private void o1(Activity activity, boolean z15) {
        if (this.f93634e && z15) {
            b0(this.f93645r.get(activity), null, null);
        }
    }

    public static /* synthetic */ void r(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.a1 a1Var, io.sentry.l1 l1Var, io.sentry.l1 l1Var2) {
        if (l1Var2 == null) {
            activityLifecycleIntegration.getClass();
            a1Var.F(l1Var);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f93633d;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", l1Var.getName());
            }
        }
    }

    private String t0(io.sentry.j1 j1Var) {
        String description = j1Var.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return j1Var.getDescription() + " - Deadline Exceeded";
    }

    private String u0(String str) {
        return str + " full display";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(final io.sentry.a1 a1Var, final io.sentry.l1 l1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.core.r
            @Override // io.sentry.f4.c
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.r(this.f94127a, a1Var, l1Var, l1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(final io.sentry.a1 a1Var, final io.sentry.l1 l1Var) {
        a1Var.S(new f4.c() { // from class: io.sentry.android.core.n
            @Override // io.sentry.f4.c
            public final void a(io.sentry.l1 l1Var2) {
                ActivityLifecycleIntegration.E(l1Var, a1Var, l1Var2);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93630a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f93633d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.f93646s.l();
    }

    @Override // io.sentry.r1
    public void m(io.sentry.c1 c1Var, q7 q7Var) {
        this.f93633d = (SentryAndroidOptions) io.sentry.util.v.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f93632c = (io.sentry.c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        this.f93634e = H0(this.f93633d);
        this.f93638j = this.f93633d.getFullyDisplayedReporter();
        this.f93635f = this.f93633d.isEnableTimeToFullDisplayTracing();
        this.f93630a.registerActivityLifecycleCallbacks(this);
        this.f93633d.getLogger().c(b7.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.p.a("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.i0 i0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f93636g) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.g1 g1VarA = this.f93647t.a();
        try {
            if (this.f93632c != null && (sentryAndroidOptions = this.f93633d) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String strA = io.sentry.android.core.internal.util.i.a(activity);
                this.f93632c.J(new h4() { // from class: io.sentry.android.core.i
                    @Override // io.sentry.h4
                    public final void a(io.sentry.a1 a1Var) {
                        a1Var.O(strA);
                    }
                });
            }
            d1(activity);
            final io.sentry.j1 j1Var = this.f93640l.get(activity);
            final io.sentry.j1 j1Var2 = this.f93641m.get(activity);
            this.f93637h = true;
            if (this.f93634e && j1Var != null && j1Var2 != null && (i0Var = this.f93638j) != null) {
                i0Var.b(new io.sentry.i0.a() { // from class: io.sentry.android.core.j
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        io.sentry.g1 g1VarA = this.f93647t.a();
        try {
            io.sentry.android.core.performance.b bVarRemove = this.f93642n.remove(activity);
            if (bVarRemove != null) {
                bVarRemove.a();
            }
            if (this.f93634e) {
                a0(this.f93639k, u8.CANCELLED);
                io.sentry.j1 j1Var = this.f93640l.get(activity);
                io.sentry.j1 j1Var2 = this.f93641m.get(activity);
                a0(j1Var, u8.DEADLINE_EXCEEDED);
                N(j1Var2, j1Var);
                J();
                o1(activity, true);
                this.f93639k = null;
                this.f93640l.remove(activity);
                this.f93641m.remove(activity);
            }
            this.f93645r.remove(activity);
            if (this.f93645r.isEmpty() && !activity.isChangingConfigurations()) {
                K();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        io.sentry.g1 g1VarA = this.f93647t.a();
        try {
            if (!this.f93636g) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = this.f93642n.get(activity);
        if (bVar != null) {
            io.sentry.l1 l1Var = this.f93639k;
            if (l1Var == null) {
                l1Var = this.f93645r.get(activity);
            }
            bVar.b(l1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f93642n.get(activity);
        if (bVar != null) {
            io.sentry.l1 l1Var = this.f93639k;
            if (l1Var == null) {
                l1Var = this.f93645r.get(activity);
            }
            bVar.c(l1Var);
            bVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.f93642n.put(activity, bVar);
        if (this.f93637h) {
            return;
        }
        io.sentry.c1 c1Var = this.f93632c;
        n5 n5VarA = c1Var != null ? c1Var.s().getDateProvider().a() : w.a();
        this.f93643p = n5VarA;
        bVar.g(n5VarA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.f93637h = true;
        io.sentry.c1 c1Var = this.f93632c;
        this.f93643p = c1Var != null ? c1Var.s().getDateProvider().a() : w.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = this.f93642n.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f93633d;
            bVar.h(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().a() : w.a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        io.sentry.g1 g1VarA = this.f93647t.a();
        try {
            if (!this.f93636g) {
                onActivityPostStarted(activity);
            }
            if (this.f93634e) {
                final io.sentry.j1 j1Var = this.f93640l.get(activity);
                final io.sentry.j1 j1Var2 = this.f93641m.get(activity);
                if (activity.getWindow() != null) {
                    io.sentry.android.core.internal.util.p.d(activity, new Runnable() { // from class: io.sentry.android.core.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f94042a.T0(j1Var2, j1Var);
                        }
                    }, this.f93631b);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f94048a.T0(j1Var2, j1Var);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        io.sentry.g1 g1VarA = this.f93647t.a();
        try {
            if (!this.f93636g) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f93634e) {
                this.f93646s.e(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
