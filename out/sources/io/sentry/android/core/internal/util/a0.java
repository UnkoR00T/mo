package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.a1;
import io.sentry.android.core.t0;
import io.sentry.b7;
import io.sentry.g8;
import io.sentry.v0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f93953p = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f93954q = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f93955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Window> f93956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f93957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f93958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Window> f93959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, b> f93960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f93961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f93962h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Window.OnFrameMetricsAvailableListener f93963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Choreographer f93964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Field f93965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f93966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f93967n;

    class a implements c {
        a() {
        }
    }

    public interface b {
        void e(long j15, long j16, long j17, long j18, boolean z15, boolean z16, float f15);
    }

    public interface c {
        default void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @SuppressLint({"NewApi"})
    public a0(Context context, v0 v0Var, t0 t0Var) {
        this(context, v0Var, t0Var, new a());
    }

    public static /* synthetic */ void a(a0 a0Var, v0 v0Var) {
        a0Var.getClass();
        try {
            a0Var.f93964k = Choreographer.getInstance();
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th4);
        }
    }

    public static /* synthetic */ void b(a0 a0Var, Window window) {
        if (a0Var.f93956b.add(window)) {
            try {
                a0Var.f93962h.a(window, a0Var.f93963j, a0Var.f93958d);
            } catch (Throwable th4) {
                a0Var.f93957c.b(b7.ERROR, "Failed to add frameMetricsAvailableListener", th4);
            }
        }
    }

    public static /* synthetic */ void c(a0 a0Var, Window window) {
        a0Var.getClass();
        try {
            if (a0Var.f93956b.remove(window)) {
                a0Var.f93962h.b(window, a0Var.f93963j);
            }
        } catch (Throwable th4) {
            a0Var.f93957c.b(b7.ERROR, "Failed to remove frameMetricsAvailableListener", th4);
        }
    }

    public static /* synthetic */ void e(a0 a0Var, t0 t0Var, Window window, FrameMetrics frameMetrics, int i15) {
        a0Var.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = t0Var.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f15 = f93953p;
        long jF = a0Var.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f15 / refreshRate)));
        long jG = a0Var.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, a0Var.f93967n);
        if (jMax2 == a0Var.f93966m) {
            return;
        }
        a0Var.f93966m = jMax2;
        a0Var.f93967n = jMax2 + jF;
        boolean zJ = j(jF, (long) (f15 / (refreshRate - 1.0f)));
        boolean z15 = zJ && i(jF);
        Iterator<b> it = a0Var.f93960f.values().iterator();
        while (it.hasNext()) {
            it.next().e(jMax2, a0Var.f93967n, jF, jMax, zJ, z15, refreshRate);
        }
    }

    private long f(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    private long g(FrameMetrics frameMetrics) {
        return this.f93955a.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j15) {
        return j15 > f93954q;
    }

    public static boolean j(long j15, long j16) {
        return j15 > j16;
    }

    private void k(Window window) {
        WeakReference<Window> weakReference = this.f93959e;
        if (weakReference == null || weakReference.get() != window) {
            this.f93959e = new WeakReference<>(window);
            o();
        }
    }

    @SuppressLint({"NewApi"})
    private void n(final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.w
            @Override // java.lang.Runnable
            public final void run() {
                a0.c(this.f94026a, window);
            }
        });
    }

    @SuppressLint({"NewApi"})
    private void o() {
        WeakReference<Window> weakReference = this.f93959e;
        final Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.f93961g || this.f93960f.isEmpty() || this.f93958d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.v
            @Override // java.lang.Runnable
            public final void run() {
                a0.b(this.f94024a, window);
            }
        });
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f93964k;
        if (choreographer == null || (field = this.f93965l) == null) {
            return -1L;
        }
        try {
            Long l15 = (Long) field.get(choreographer);
            if (l15 != null) {
                return l15.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    public String l(b bVar) {
        if (!this.f93961g) {
            return null;
        }
        String strA = g8.a();
        this.f93960f.put(strA, bVar);
        o();
        return strA;
    }

    public void m(String str) {
        if (this.f93961g) {
            if (str != null) {
                this.f93960f.remove(str);
            }
            WeakReference<Window> weakReference = this.f93959e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f93960f.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n(activity.getWindow());
        WeakReference<Window> weakReference = this.f93959e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f93959e = null;
    }

    @SuppressLint({"NewApi", "PrivateApi"})
    public a0(Context context, final v0 v0Var, final t0 t0Var, c cVar) {
        this.f93956b = new CopyOnWriteArraySet();
        this.f93960f = new ConcurrentHashMap();
        this.f93961g = false;
        this.f93966m = 0L;
        this.f93967n = 0L;
        Context context2 = (Context) io.sentry.util.v.c(a1.g(context), "The context is required");
        this.f93957c = (v0) io.sentry.util.v.c(v0Var, "Logger is required");
        this.f93955a = (t0) io.sentry.util.v.c(t0Var, "BuildInfoProvider is required");
        this.f93962h = (c) io.sentry.util.v.c(cVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && t0Var.d() >= 24) {
            this.f93961g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.x
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th4) {
                    v0Var.b(b7.ERROR, "Error during frames measurements.", th4);
                }
            });
            handlerThread.start();
            this.f93958d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.y
                @Override // java.lang.Runnable
                public final void run() {
                    a0.a(this.f94029a, v0Var);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f93965l = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e15) {
                v0Var.b(b7.ERROR, "Unable to get the frame timestamp from the choreographer: ", e15);
            }
            this.f93963j = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.z
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i15) {
                    a0.e(this.f94031a, t0Var, window, frameMetrics, i15);
                }
            };
        }
    }
}
