package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.b7;
import io.sentry.g8;
import io.sentry.i7;
import io.sentry.q3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f93814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93815c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f93818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.a0 f93819g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.sentry.f1 f93824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.sentry.v0 f93825m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f93813a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Future<?> f93816d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f93817e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f93820h = new ArrayDeque<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f93821i = new ArrayDeque<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<io.sentry.profilemeasurements.b> f93822j = new ArrayDeque<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, io.sentry.profilemeasurements.a> f93823k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f93826n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final io.sentry.util.a f93827o = new io.sentry.util.a();

    class a implements io.sentry.android.core.internal.util.a0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f93828a = 0.0f;

        a() {
        }

        @Override // io.sentry.android.core.internal.util.a0.b
        public void e(long j15, long j16, long j17, long j18, boolean z15, boolean z16, float f15) {
            long jL = new i7().l();
            long jNanoTime = ((j16 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - f0.this.f93813a;
            if (jNanoTime < 0) {
                return;
            }
            if (z16) {
                f0.this.f93822j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j17), jL));
            } else if (z15) {
                f0.this.f93821i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Long.valueOf(j17), jL));
            }
            if (f15 != this.f93828a) {
                this.f93828a = f15;
                f0.this.f93820h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(jNanoTime), Float.valueOf(f15), jL));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f93830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f93831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f93832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, io.sentry.profilemeasurements.a> f93833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f93834e;

        public b(long j15, long j16, boolean z15, File file, Map<String, io.sentry.profilemeasurements.a> map) {
            this.f93830a = j15;
            this.f93832c = file;
            this.f93831b = j16;
            this.f93833d = map;
            this.f93834e = z15;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f93835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f93836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Date f93837c;

        public c(long j15, long j16, Date date) {
            this.f93835a = j15;
            this.f93836b = j16;
            this.f93837c = date;
        }
    }

    public f0(String str, int i15, io.sentry.android.core.internal.util.a0 a0Var, io.sentry.f1 f1Var, io.sentry.v0 v0Var) {
        this.f93814b = new File((String) io.sentry.util.v.c(str, "TracesFilesDirPath is required"));
        this.f93815c = i15;
        this.f93825m = (io.sentry.v0) io.sentry.util.v.c(v0Var, "Logger is required");
        this.f93824l = f1Var;
        this.f93819g = (io.sentry.android.core.internal.util.a0) io.sentry.util.v.c(a0Var, "SentryFrameMetricsCollector is required");
    }

    @SuppressLint({"NewApi"})
    private void h(List<q3> list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f93813a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (q3 q3Var : list) {
                        long jB = q3Var.b();
                        long j15 = jB + jElapsedRealtimeNanos;
                        Double dA = q3Var.a();
                        Long lC = q3Var.c();
                        Long lD = q3Var.d();
                        if (dA != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j15), dA, jB));
                        }
                        if (lC != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j15), lC, jB));
                        }
                        if (lD != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j15), lD, jB));
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f93823k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f93823k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f93823k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public void f() {
        io.sentry.g1 g1VarA = this.f93827o.a();
        try {
            Future<?> future = this.f93816d;
            if (future != null) {
                future.cancel(true);
                this.f93816d = null;
            }
            if (this.f93826n) {
                g(true, null);
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

    @SuppressLint({"NewApi"})
    public b g(boolean z15, List<q3> list) {
        io.sentry.g1 g1VarA = this.f93827o.a();
        try {
            if (!this.f93826n) {
                this.f93825m.c(b7.WARNING, "Profiler not running", new Object[0]);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th4) {
                try {
                    this.f93825m.b(b7.ERROR, "Error while stopping profiling: ", th4);
                } catch (Throwable th5) {
                    this.f93826n = false;
                    throw th5;
                }
            }
            this.f93826n = false;
            this.f93819g.m(this.f93818f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f93817e == null) {
                this.f93825m.c(b7.ERROR, "Trace file does not exists", new Object[0]);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            if (!this.f93821i.isEmpty()) {
                this.f93823k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f93821i));
            }
            if (!this.f93822j.isEmpty()) {
                this.f93823k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f93822j));
            }
            if (!this.f93820h.isEmpty()) {
                this.f93823k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f93820h));
            }
            h(list);
            Future<?> future = this.f93816d;
            if (future != null) {
                future.cancel(true);
                this.f93816d = null;
            }
            b bVar = new b(jElapsedRealtimeNanos, elapsedCpuTime, z15, this.f93817e, this.f93823k);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return bVar;
        } catch (Throwable th6) {
            if (g1VarA == null) {
                throw th6;
            }
            try {
                g1VarA.close();
                throw th6;
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
                throw th6;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public c i() {
        io.sentry.g1 g1VarA = this.f93827o.a();
        try {
            int i15 = this.f93815c;
            if (i15 == 0) {
                this.f93825m.c(b7.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i15));
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            if (this.f93826n) {
                this.f93825m.c(b7.WARNING, "Profiling has already started...", new Object[0]);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            this.f93817e = new File(this.f93814b, g8.a() + ".trace");
            this.f93823k.clear();
            this.f93820h.clear();
            this.f93821i.clear();
            this.f93822j.clear();
            this.f93818f = this.f93819g.l(new a());
            try {
                io.sentry.f1 f1Var = this.f93824l;
                if (f1Var != null) {
                    this.f93816d = f1Var.c(new Runnable() { // from class: io.sentry.android.core.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f93788a.g(true, null);
                        }
                    }, 30000L);
                }
            } catch (RejectedExecutionException e15) {
                this.f93825m.b(b7.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e15);
            }
            this.f93813a = SystemClock.elapsedRealtimeNanos();
            Date dateD = io.sentry.m.d();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f93817e.getPath(), 3000000, this.f93815c);
                this.f93826n = true;
                c cVar = new c(this.f93813a, elapsedCpuTime, dateD);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return cVar;
            } catch (Throwable th4) {
                g(false, null);
                this.f93825m.b(b7.ERROR, "Unable to start a profile: ", th4);
                this.f93826n = false;
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
        } catch (Throwable th5) {
            if (g1VarA == null) {
                throw th5;
            }
            try {
                g1VarA.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }
}
