package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class y71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f34349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final f71 f34350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final WeakHashMap f34351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x71 f34352d;

    static {
        ak.u0.M("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f34349a = new AtomicReference(ak.u0.C());
        f34350b = new f71("tiktok_systrace");
        f34351c = new WeakHashMap();
        f34352d = new x71();
        new ArrayDeque();
        new ArrayDeque();
    }

    static ak.u0 a() {
        return (ak.u0) f34349a.get();
    }

    static n81 b(boolean z15) {
        l81 l81VarD = d();
        n81 n81Var = l81VarD.f32805b;
        return (n81Var == null || n81Var == c81.f31853f) ? b81.h(l81VarD) : n81Var;
    }

    public static n81 c(l81 l81Var, n81 n81Var) {
        n81 n81Var2;
        l81Var.getClass();
        n81 n81Var3 = l81Var.f32805b;
        if (n81Var3 != n81Var) {
            if (n81Var3 == null) {
                l81Var.f32804a = Build.VERSION.SDK_INT >= 29 ? Trace.isEnabled() : k71.a(f34350b);
            }
            if (l81Var.f32804a) {
                if (n81Var3 != null) {
                    n81Var2 = n81Var != null ? n81Var : null;
                    m81.b(n81Var3);
                } else {
                    n81Var2 = n81Var;
                }
                if (n81Var2 != null) {
                    m81.a(n81Var2);
                }
            }
            if (n81Var3 != n81Var) {
                if (n81Var == null) {
                    n81Var = null;
                }
                l81Var.f32805b = n81Var;
                return n81Var3;
            }
        }
        return n81Var;
    }

    public static l81 d() {
        return (l81) f34352d.get();
    }

    public static boolean e() {
        n81 n81Var = d().f32805b;
        return (n81Var == null || n81Var == c81.f31853f) ? false : true;
    }
}
