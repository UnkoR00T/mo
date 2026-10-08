package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.b7;
import io.sentry.q3;
import io.sentry.q7;
import io.sentry.r4;
import io.sentry.w3;
import io.sentry.x3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class i0 implements io.sentry.m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f93872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.v0 f93873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f93874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f93876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.f1 f93877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t0 f93878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f93879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f93880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.a0 f93881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x3 f93882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f0 f93883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f93884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f93885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Date f93886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final io.sentry.util.a f93887p;

    public i0(Context context, SentryAndroidOptions sentryAndroidOptions, t0 t0Var, io.sentry.android.core.internal.util.a0 a0Var) {
        this(context, t0Var, a0Var, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void d() {
        if (this.f93879h) {
            return;
        }
        this.f93879h = true;
        if (!this.f93875d) {
            this.f93873b.c(b7.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.f93874c;
        if (str == null) {
            this.f93873b.c(b7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i15 = this.f93876e;
        if (i15 <= 0) {
            this.f93873b.c(b7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i15));
        } else {
            this.f93883l = new f0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f93876e, this.f93881j, this.f93877f, this.f93873b);
        }
    }

    @SuppressLint({"NewApi"})
    private boolean e() {
        f0.c cVarI;
        f0 f0Var = this.f93883l;
        if (f0Var == null || (cVarI = f0Var.i()) == null) {
            return false;
        }
        this.f93884m = cVarI.f93835a;
        this.f93885n = cVarI.f93836b;
        this.f93886o = cVarI.f93837c;
        return true;
    }

    @SuppressLint({"NewApi"})
    private w3 f(String str, String str2, String str3, boolean z15, List<q3> list, q7 q7Var) {
        io.sentry.g1 g1VarA = this.f93887p.a();
        try {
            if (this.f93883l == null) {
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            if (this.f93878g.d() < 22) {
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return null;
            }
            x3 x3Var = this.f93882k;
            if (x3Var != null && x3Var.h().equals(str2)) {
                int i15 = this.f93880i;
                if (i15 > 0) {
                    this.f93880i = i15 - 1;
                }
                this.f93873b.c(b7.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.f93880i != 0) {
                    x3 x3Var2 = this.f93882k;
                    if (x3Var2 != null) {
                        x3Var2.k(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f93884m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f93885n));
                    }
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                    return null;
                }
                boolean z16 = false;
                f0.b bVarG = this.f93883l.g(false, list);
                if (bVarG == null) {
                    if (g1VarA != null) {
                        g1VarA.close();
                    }
                    return null;
                }
                long j15 = bVarG.f93830a - this.f93884m;
                ArrayList arrayList = new ArrayList(1);
                x3 x3Var3 = this.f93882k;
                if (x3Var3 != null) {
                    arrayList.add(x3Var3);
                }
                this.f93882k = null;
                this.f93880i = 0;
                String string = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
                Long lQ = q7Var instanceof SentryAndroidOptions ? g1.i(this.f93872a, (SentryAndroidOptions) q7Var).q() : null;
                if (lQ != null) {
                    string = Long.toString(lQ.longValue());
                }
                String str4 = string;
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x3) it.next()).k(Long.valueOf(bVarG.f93830a), Long.valueOf(this.f93884m), Long.valueOf(bVarG.f93831b), Long.valueOf(this.f93885n));
                    z16 = z16;
                }
                w3 w3Var = new w3(bVarG.f93832c, this.f93886o, arrayList, str, str2, str3, Long.toString(j15), this.f93878g.d(), (strArr == null || strArr.length <= 0) ? "" : strArr[z16 ? 1 : 0], new Callable() { // from class: io.sentry.android.core.h0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return io.sentry.android.core.internal.util.k.a().c();
                    }
                }, this.f93878g.b(), this.f93878g.c(), this.f93878g.e(), this.f93878g.f(), str4, q7Var.getProguardUuid(), q7Var.getRelease(), q7Var.getEnvironment(), (bVarG.f93834e || z15) ? "timeout" : "normal", bVarG.f93833d);
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return w3Var;
            }
            this.f93873b.c(b7.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return null;
        } catch (Throwable th4) {
            if (g1VarA == null) {
                throw th4;
            }
            try {
                g1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.m1
    public void a(io.sentry.l1 l1Var) {
        io.sentry.g1 g1VarA = this.f93887p.a();
        try {
            if (this.f93880i > 0 && this.f93882k == null) {
                this.f93882k = new x3(l1Var, Long.valueOf(this.f93884m), Long.valueOf(this.f93885n));
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

    @Override // io.sentry.m1
    public w3 b(io.sentry.l1 l1Var, List<q3> list, q7 q7Var) {
        io.sentry.g1 g1VarA = this.f93887p.a();
        try {
            w3 w3VarF = f(l1Var.getName(), l1Var.i().toString(), l1Var.w().n().toString(), false, list, q7Var);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return w3VarF;
        } catch (Throwable th4) {
            if (g1VarA == null) {
                throw th4;
            }
            try {
                g1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    @Override // io.sentry.m1
    public void close() {
        i0 i0Var;
        x3 x3Var = this.f93882k;
        if (x3Var != null) {
            i0Var = this;
            i0Var.f(x3Var.i(), this.f93882k.h(), this.f93882k.j(), true, null, r4.b().s());
        } else {
            i0Var = this;
            int i15 = i0Var.f93880i;
            if (i15 != 0) {
                i0Var.f93880i = i15 - 1;
            }
        }
        f0 f0Var = i0Var.f93883l;
        if (f0Var != null) {
            f0Var.f();
        }
    }

    @Override // io.sentry.m1
    public boolean isRunning() {
        return this.f93880i != 0;
    }

    @Override // io.sentry.m1
    public void start() {
        io.sentry.g1 g1VarA = this.f93887p.a();
        try {
            if (this.f93878g.d() < 22) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            d();
            int i15 = this.f93880i + 1;
            this.f93880i = i15;
            if (i15 == 1 && e()) {
                this.f93873b.c(b7.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.f93880i--;
                this.f93873b.c(b7.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
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

    public i0(Context context, t0 t0Var, io.sentry.android.core.internal.util.a0 a0Var, io.sentry.v0 v0Var, String str, boolean z15, int i15, io.sentry.f1 f1Var) {
        this.f93879h = false;
        this.f93880i = 0;
        this.f93883l = null;
        this.f93887p = new io.sentry.util.a();
        this.f93872a = (Context) io.sentry.util.v.c(a1.g(context), "The application context is required");
        this.f93873b = (io.sentry.v0) io.sentry.util.v.c(v0Var, "ILogger is required");
        this.f93881j = (io.sentry.android.core.internal.util.a0) io.sentry.util.v.c(a0Var, "SentryFrameMetricsCollector is required");
        this.f93878g = (t0) io.sentry.util.v.c(t0Var, "The BuildInfoProvider is required.");
        this.f93874c = str;
        this.f93875d = z15;
        this.f93876e = i15;
        this.f93877f = (io.sentry.f1) io.sentry.util.v.c(f1Var, "The ISentryExecutorService is required.");
        this.f93886o = io.sentry.m.d();
    }
}
