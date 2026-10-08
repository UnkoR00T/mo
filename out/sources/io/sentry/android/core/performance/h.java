package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a1;
import io.sentry.android.core.b1;
import io.sentry.android.core.internal.util.p;
import io.sentry.android.core.t0;
import io.sentry.b9;
import io.sentry.g1;
import io.sentry.m1;
import io.sentry.p2;
import io.sentry.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class h extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static volatile h f94102r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static long f94101q = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final io.sentry.util.a f94103s = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f94104a = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m1 f94111h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q0 f94112j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b9 f94113k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f94114l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f94115m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f94116n = new AtomicInteger();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f94117p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f94106c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f94107d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f94108e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<ContentProvider, i> f94109f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<c> f94110g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f94105b = a1.s();

    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public static /* synthetic */ void a(h hVar) {
        if (hVar.f94116n.get() == 0) {
            hVar.f94105b = false;
            m1 m1Var = hVar.f94111h;
            if (m1Var != null && m1Var.isRunning()) {
                hVar.f94111h.close();
                hVar.f94111h = null;
            }
            q0 q0Var = hVar.f94112j;
            if (q0Var == null || !q0Var.isRunning()) {
                return;
            }
            hVar.f94112j.n(true);
            hVar.f94112j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.g
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f94100a);
            }
        });
    }

    public static h p() {
        if (f94102r == null) {
            g1 g1VarA = f94103s.a();
            try {
                if (f94102r == null) {
                    f94102r = new h();
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
        return f94102r;
    }

    public static void s(Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarP = p();
        if (hVarP.f94108e.r()) {
            hVarP.f94108e.y(jUptimeMillis);
            hVarP.x(application);
        }
    }

    public static void t(Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarP = p();
        if (hVarP.f94108e.s()) {
            hVarP.f94108e.x(application.getClass().getName() + ".onCreate");
            hVarP.f94108e.z(jUptimeMillis);
        }
    }

    public static void u(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = new i();
        iVar.y(jUptimeMillis);
        p().f94109f.put(contentProvider, iVar);
    }

    public static void v(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = p().f94109f.get(contentProvider);
        if (iVar == null || !iVar.s()) {
            return;
        }
        iVar.x(contentProvider.getClass().getName() + ".onCreate");
        iVar.z(jUptimeMillis);
    }

    public void A(b9 b9Var) {
        this.f94113k = b9Var;
    }

    public boolean B() {
        return this.f94115m && this.f94105b;
    }

    public void e(c cVar) {
        this.f94110g.add(cVar);
    }

    public i g() {
        i iVar = new i();
        iVar.A("Process Initialization", this.f94106c.o(), this.f94106c.q(), f94101q);
        return iVar;
    }

    public q0 h() {
        return this.f94112j;
    }

    public m1 i() {
        return this.f94111h;
    }

    public b9 j() {
        return this.f94113k;
    }

    public i k() {
        return this.f94106c;
    }

    public i l(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f94104a != a.UNKNOWN && this.f94105b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVarK = k();
                if (iVarK.t() && iVarK.g() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVarK;
                }
            }
            i iVarQ = q();
            if (iVarQ.t() && iVarQ.g() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVarQ;
            }
        }
        return new i();
    }

    public a m() {
        return this.f94104a;
    }

    public i n() {
        return this.f94108e;
    }

    public List<i> o() {
        ArrayList arrayList = new ArrayList(this.f94109f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        b1.c().d(activity);
        if (this.f94116n.incrementAndGet() == 1 && !this.f94117p.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jQ = jUptimeMillis - this.f94106c.q();
            if (!this.f94105b || jQ > TimeUnit.MINUTES.toMillis(1L)) {
                this.f94104a = a.WARM;
                this.f94115m = true;
                this.f94106c.w();
                this.f94106c.B();
                this.f94106c.y(jUptimeMillis);
                f94101q = jUptimeMillis;
                this.f94109f.clear();
                this.f94108e.w();
            } else {
                this.f94104a = bundle == null ? a.COLD : a.WARM;
            }
        }
        this.f94105b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b1.c().a(activity);
        if (this.f94116n.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f94105b = false;
        this.f94115m = true;
        this.f94117p.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b1.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b1.c().d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        b1.c().d(activity);
        if (this.f94117p.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            p.d(activity, new Runnable() { // from class: io.sentry.android.core.performance.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94098a.w();
                }
            }, new t0(p2.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94099a.w();
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b1.c().a(activity);
    }

    public i q() {
        return this.f94107d;
    }

    public void r() {
        this.f94115m = false;
        this.f94109f.clear();
        this.f94110g.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void w() {
        if (!this.f94117p.getAndSet(true)) {
            h hVarP = p();
            hVarP.q().D();
            hVarP.k().D();
        }
    }

    public void x(Application application) {
        if (this.f94114l) {
            return;
        }
        boolean z15 = true;
        this.f94114l = true;
        if (!this.f94105b && !a1.s()) {
            z15 = false;
        }
        this.f94105b = z15;
        application.registerActivityLifecycleCallbacks(f94102r);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f94097a.f();
            }
        });
    }

    public void y(q0 q0Var) {
        this.f94112j = q0Var;
    }

    public void z(m1 m1Var) {
        this.f94111h = m1Var;
    }
}
