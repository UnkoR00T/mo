package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.b7;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FrameMetricsAggregator f93856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f93857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<io.sentry.protocol.v, Map<String, io.sentry.protocol.i>> f93858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Activity, b> f93859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p1 f93860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected io.sentry.util.a f93861f;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f93862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f93863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f93864c;

        private b(int i15, int i16, int i17) {
            this.f93862a = i15;
            this.f93863b = i16;
            this.f93864c = i17;
        }
    }

    public h(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions, p1 p1Var) {
        this.f93856a = null;
        this.f93858c = new ConcurrentHashMap();
        this.f93859d = new WeakHashMap();
        this.f93861f = new io.sentry.util.a();
        if (sVar.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f93856a = new FrameMetricsAggregator();
        }
        this.f93857b = sentryAndroidOptions;
        this.f93860e = p1Var;
    }

    public static /* synthetic */ void c(h hVar, Runnable runnable, String str) {
        hVar.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                hVar.f93857b.getLogger().c(b7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private b f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i15;
        int i16;
        SparseIntArray sparseIntArray;
        if (!h() || (frameMetricsAggregator = this.f93856a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = frameMetricsAggregator.b();
        int i17 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i15 = 0;
            i16 = 0;
        } else {
            int i18 = 0;
            i15 = 0;
            i16 = 0;
            while (i17 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i17);
                int iValueAt = sparseIntArray.valueAt(i17);
                i18 += iValueAt;
                if (iKeyAt > 700) {
                    i16 += iValueAt;
                } else if (iKeyAt > 16) {
                    i15 += iValueAt;
                }
                i17++;
            }
            i17 = i18;
        }
        return new b(i17, i15, i16);
    }

    private b g(Activity activity) {
        b bVarF;
        b bVarRemove = this.f93859d.remove(activity);
        if (bVarRemove == null || (bVarF = f()) == null) {
            return null;
        }
        return new b(bVarF.f93862a - bVarRemove.f93862a, bVarF.f93863b - bVarRemove.f93863b, bVarF.f93864c - bVarRemove.f93864c);
    }

    private void i(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.h.e().a()) {
                runnable.run();
            } else {
                this.f93860e.b(new Runnable() { // from class: io.sentry.android.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.c(this.f93810a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f93857b.getLogger().c(b7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void k(Activity activity) {
        b bVarF = f();
        if (bVarF != null) {
            this.f93859d.put(activity, bVarF);
        }
    }

    public void e(final Activity activity) {
        io.sentry.g1 g1VarA = this.f93861f.a();
        try {
            if (!h()) {
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } else {
                i(new Runnable() { // from class: io.sentry.android.core.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f93783a.f93856a.a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                k(activity);
                if (g1VarA != null) {
                    g1VarA.close();
                }
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

    public boolean h() {
        return (this.f93856a == null || !this.f93857b.isEnableFramesTracking() || this.f93857b.isEnablePerformanceV2()) ? false : true;
    }

    public void j(final Activity activity, io.sentry.protocol.v vVar) {
        io.sentry.g1 g1VarA = this.f93861f.a();
        try {
            if (!h()) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            i(new Runnable() { // from class: io.sentry.android.core.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93839a.f93856a.c(activity);
                }
            }, null);
            b bVarG = g(activity);
            if (bVarG != null && (bVarG.f93862a != 0 || bVarG.f93863b != 0 || bVarG.f93864c != 0)) {
                io.sentry.protocol.i iVar = new io.sentry.protocol.i(Integer.valueOf(bVarG.f93862a), "none");
                io.sentry.protocol.i iVar2 = new io.sentry.protocol.i(Integer.valueOf(bVarG.f93863b), "none");
                io.sentry.protocol.i iVar3 = new io.sentry.protocol.i(Integer.valueOf(bVarG.f93864c), "none");
                HashMap map = new HashMap();
                map.put("frames_total", iVar);
                map.put("frames_slow", iVar2);
                map.put("frames_frozen", iVar3);
                this.f93858c.put(vVar, map);
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
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

    public void l() {
        io.sentry.g1 g1VarA = this.f93861f.a();
        try {
            if (h()) {
                i(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f93787a.f93856a.e();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f93856a.d();
            }
            this.f93858c.clear();
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

    public Map<String, io.sentry.protocol.i> m(io.sentry.protocol.v vVar) {
        io.sentry.g1 g1VarA = this.f93861f.a();
        try {
            if (!h()) {
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            Map<String, io.sentry.protocol.i> map = this.f93858c.get(vVar);
            this.f93858c.remove(vVar);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return map;
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

    public h(io.sentry.util.s sVar, SentryAndroidOptions sentryAndroidOptions) {
        this(sVar, sentryAndroidOptions, new p1());
    }
}
