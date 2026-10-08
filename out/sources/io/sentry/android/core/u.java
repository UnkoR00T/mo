package io.sentry.android.core;

import io.sentry.a9;
import io.sentry.b7;
import io.sentry.d5;
import io.sentry.i7;
import io.sentry.n5;
import io.sentry.q7;
import io.sentry.s3;
import io.sentry.u3;
import io.sentry.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class u implements io.sentry.q0, io.sentry.transport.a0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.v0 f94150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.f1 f94153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0 f94154e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.a0 f94156g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.sentry.c1 f94159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Future<?> f94160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.j f94161m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private io.sentry.protocol.v f94163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private io.sentry.protocol.v f94164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f94165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private n5 f94166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f94167t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f94168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f94169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f94170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final io.sentry.util.a f94171y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.sentry.util.a f94172z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f94155f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f94157h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f94158j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<s3.a> f94162n = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94173a;

        static {
            int[] iArr = new int[u3.values().length];
            f94173a = iArr;
            try {
                iArr[u3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94173a[u3.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public u(t0 t0Var, io.sentry.android.core.internal.util.a0 a0Var, io.sentry.v0 v0Var, String str, int i15, io.sentry.f1 f1Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        this.f94163p = vVar;
        this.f94164q = vVar;
        this.f94165r = new AtomicBoolean(false);
        this.f94166s = new i7();
        this.f94167t = true;
        this.f94168v = false;
        this.f94169w = false;
        this.f94170x = 0;
        this.f94171y = new io.sentry.util.a();
        this.f94172z = new io.sentry.util.a();
        this.f94150a = v0Var;
        this.f94156g = a0Var;
        this.f94154e = t0Var;
        this.f94151b = str;
        this.f94152c = i15;
        this.f94153d = f1Var;
    }

    public static /* synthetic */ void b(u uVar, q7 q7Var, io.sentry.c1 c1Var) {
        if (uVar.f94165r.get()) {
            return;
        }
        ArrayList arrayList = new ArrayList(uVar.f94162n.size());
        io.sentry.g1 g1VarA = uVar.f94172z.a();
        try {
            Iterator<s3.a> it = uVar.f94162n.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(q7Var));
            }
            uVar.f94162n.clear();
            if (g1VarA != null) {
                g1VarA.close();
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                c1Var.P((s3) it4.next());
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

    private void c() {
        if (this.f94155f) {
            return;
        }
        this.f94155f = true;
        String str = this.f94151b;
        if (str == null) {
            this.f94150a.c(b7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i15 = this.f94152c;
        if (i15 <= 0) {
            this.f94150a.c(b7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i15));
        } else {
            this.f94157h = new f0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f94152c, this.f94156g, null, this.f94150a);
        }
    }

    private void d() {
        io.sentry.c1 c1Var = this.f94159k;
        if ((c1Var == null || c1Var == v2.d()) && d5.r() != v2.d()) {
            this.f94159k = d5.r();
            this.f94161m = d5.r().s().getCompositePerformanceCollector();
            io.sentry.transport.a0 a0VarF = this.f94159k.F();
            if (a0VarF != null) {
                a0VarF.r(this);
            }
        }
    }

    private void e(final io.sentry.c1 c1Var, final q7 q7Var) {
        try {
            q7Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.b(this.f94142a, q7Var, c1Var);
                }
            });
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.DEBUG, "Failed to send profile chunks.", th4);
        }
    }

    private void f() {
        d();
        if (this.f94154e.d() < 22) {
            return;
        }
        c();
        if (this.f94157h == null) {
            return;
        }
        io.sentry.c1 c1Var = this.f94159k;
        if (c1Var != null) {
            io.sentry.transport.a0 a0VarF = c1Var.F();
            if (a0VarF != null && (a0VarF.E(io.sentry.l.All) || a0VarF.E(io.sentry.l.ProfileChunkUi))) {
                this.f94150a.c(b7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                g(false);
                return;
            } else {
                if (this.f94159k.s().getConnectionStatusProvider().w1() == io.sentry.p0.a.DISCONNECTED) {
                    this.f94150a.c(b7.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    g(false);
                    return;
                }
                this.f94166s = this.f94159k.s().getDateProvider().a();
            }
        } else {
            this.f94166s = new i7();
        }
        if (this.f94157h.i() == null) {
            return;
        }
        this.f94158j = true;
        io.sentry.protocol.v vVar = this.f94163p;
        io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f95495b;
        if (vVar == vVar2) {
            this.f94163p = new io.sentry.protocol.v();
        }
        if (this.f94164q == vVar2) {
            this.f94164q = new io.sentry.protocol.v();
        }
        io.sentry.j jVar = this.f94161m;
        if (jVar != null) {
            jVar.f(this.f94164q.toString());
        }
        try {
            this.f94160l = this.f94153d.c(new Runnable() { // from class: io.sentry.android.core.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94132a.g(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e15) {
            this.f94150a.b(b7.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e15);
            this.f94168v = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z15) {
        d();
        io.sentry.g1 g1VarA = this.f94171y.a();
        try {
            Future<?> future = this.f94160l;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f94157h != null && this.f94158j) {
                if (this.f94154e.d() < 22) {
                    if (g1VarA != null) {
                        g1VarA.close();
                        return;
                    }
                    return;
                }
                io.sentry.j jVar = this.f94161m;
                f0.b bVarG = this.f94157h.g(false, jVar != null ? jVar.c(this.f94164q.toString()) : null);
                if (bVarG == null) {
                    this.f94150a.c(b7.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.g1 g1VarA2 = this.f94172z.a();
                    try {
                        this.f94162n.add(new s3.a(this.f94163p, this.f94164q, bVarG.f93833d, bVarG.f93832c, this.f94166s));
                        if (g1VarA2 != null) {
                            g1VarA2.close();
                        }
                    } catch (Throwable th4) {
                        if (g1VarA2 == null) {
                            throw th4;
                        }
                        try {
                            g1VarA2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
                this.f94158j = false;
                io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
                this.f94164q = vVar;
                io.sentry.c1 c1Var = this.f94159k;
                if (c1Var != null) {
                    e(c1Var, c1Var.s());
                }
                if (!z15 || this.f94168v) {
                    this.f94163p = vVar;
                    this.f94150a.c(b7.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f94150a.c(b7.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    f();
                }
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f95495b;
            this.f94163p = vVar2;
            this.f94164q = vVar2;
            if (g1VarA != null) {
                g1VarA.close();
            }
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

    @Override // io.sentry.q0
    public boolean isRunning() {
        return this.f94158j;
    }

    @Override // io.sentry.q0
    public void n(boolean z15) {
        io.sentry.g1 g1VarA = this.f94171y.a();
        try {
            this.f94170x = 0;
            this.f94168v = true;
            if (z15) {
                g(false);
                this.f94165r.set(true);
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

    @Override // io.sentry.q0
    public void o(u3 u3Var, a9 a9Var) {
        io.sentry.g1 g1VarA = this.f94171y.a();
        try {
            if (this.f94167t) {
                this.f94169w = a9Var.c(io.sentry.util.b0.a().c());
                this.f94167t = false;
            }
            if (!this.f94169w) {
                this.f94150a.c(b7.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            int i15 = a.f94173a[u3Var.ordinal()];
            if (i15 == 1) {
                if (this.f94170x < 0) {
                    this.f94170x = 0;
                }
                this.f94170x++;
            } else if (i15 == 2 && isRunning()) {
                this.f94150a.c(b7.DEBUG, "Profiler is already running.", new Object[0]);
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f94150a.c(b7.DEBUG, "Started Profiler.", new Object[0]);
                f();
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

    @Override // io.sentry.q0
    public void p() {
        this.f94167t = true;
    }

    @Override // io.sentry.q0
    public void q(u3 u3Var) {
        io.sentry.g1 g1VarA = this.f94171y.a();
        try {
            int i15 = a.f94173a[u3Var.ordinal()];
            if (i15 == 1) {
                int i16 = this.f94170x - 1;
                this.f94170x = i16;
                if (i16 > 0) {
                    if (g1VarA != null) {
                        g1VarA.close();
                        return;
                    }
                    return;
                } else {
                    if (i16 < 0) {
                        this.f94170x = 0;
                    }
                    this.f94168v = true;
                }
            } else if (i15 == 2) {
                this.f94168v = true;
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

    @Override // io.sentry.q0
    public io.sentry.protocol.v r() {
        return this.f94163p;
    }

    @Override // io.sentry.transport.a0.b
    public void y(io.sentry.transport.a0 a0Var) {
        if (a0Var.E(io.sentry.l.All) || a0Var.E(io.sentry.l.ProfileChunkUi)) {
            this.f94150a.c(b7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            g(false);
        }
    }
}
