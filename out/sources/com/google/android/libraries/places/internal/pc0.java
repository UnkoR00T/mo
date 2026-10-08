package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class pc0 extends l40 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l40 f33296k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f33297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f33298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g50 f33299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f33300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j40 f33301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a80 f33302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l40 f33303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l90 f33304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f33305i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private oc0 f33306j;

    static {
        Logger.getLogger(pc0.class.getName());
        f33296k = new hc0();
    }

    protected pc0(Executor executor, ScheduledExecutorService scheduledExecutorService, j50 j50Var) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f33298b = (Executor) zj.p.r(executor, "callExecutor");
        zj.p.r(scheduledExecutorService, "scheduler");
        this.f33299c = g50.a();
        if (j50Var != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jG = j50Var.g(timeUnit);
            scheduledFutureSchedule = scheduledExecutorService.schedule(new bc0(this, jG, "CallOptions"), jG, timeUnit);
        } else {
            scheduledFutureSchedule = null;
        }
        this.f33297a = scheduledFutureSchedule;
    }

    private final void m(final j40 j40Var) {
        final a80 a80Var = this.f33302f;
        this.f33302f = null;
        Runnable runnable = new Runnable() { // from class: com.google.android.libraries.places.internal.jc0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32653a.h(j40Var, a80Var);
            }
        };
        g50 g50Var = this.f33299c;
        g50 g50VarB = g50Var.b();
        try {
            runnable.run();
        } finally {
            g50Var.c(g50VarB);
        }
    }

    private final void n(l90 l90Var, boolean z15) {
        j40 j40Var;
        boolean z16;
        synchronized (this) {
            try {
                if (this.f33303g == null) {
                    q(f33296k);
                    j40Var = this.f33301e;
                    this.f33304h = l90Var;
                    z16 = false;
                } else {
                    if (z15) {
                        return;
                    }
                    j40Var = null;
                    z16 = true;
                }
                if (z16) {
                    o(new dc0(this, l90Var));
                } else {
                    if (j40Var != null) {
                        this.f33298b.execute(new ic0(this, j40Var, l90Var));
                    }
                    m(j40Var);
                    j();
                }
                g();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void o(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f33300d) {
                    runnable.run();
                } else {
                    this.f33305i.add(runnable);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f33305i     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f33305i = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f33300d = r0     // Catch: java.lang.Throwable -> L24
            com.google.android.libraries.places.internal.oc0 r0 = r3.f33306j     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f33298b
            com.google.android.libraries.places.internal.cc0 r2 = new com.google.android.libraries.places.internal.cc0
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f33305i     // Catch: java.lang.Throwable -> L24
            r3.f33305i = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.pc0.j():void");
    }

    private final void q(l40 l40Var) {
        l40 l40Var2 = this.f33303g;
        zj.p.B(l40Var2 == null, "realCall already set to %s", l40Var2);
        ScheduledFuture scheduledFuture = this.f33297a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f33303g = l40Var;
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, a80 a80Var) {
        l90 l90Var;
        boolean z15;
        zj.p.r(a80Var, "headers");
        zj.p.x(this.f33301e == null, "already started");
        synchronized (this) {
            try {
                this.f33301e = (j40) zj.p.r(j40Var, "listener");
                l90Var = this.f33304h;
                z15 = this.f33300d;
                if (!z15) {
                    oc0 oc0Var = new oc0(j40Var);
                    this.f33306j = oc0Var;
                    this.f33302f = a80Var;
                    j40Var = oc0Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (l90Var != null) {
            this.f33298b.execute(new ic0(this, j40Var, l90Var));
        } else if (z15) {
            this.f33303g.a(j40Var, a80Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void b(Object obj) {
        if (this.f33300d) {
            this.f33303g.b(obj);
        } else {
            o(new ec0(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void c(int i15) {
        if (this.f33300d) {
            this.f33303g.c(i15);
        } else {
            o(new fc0(this, i15));
        }
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void d() {
        o(new gc0(this));
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void e(String str, Throwable th4) {
        l90 l90Var = l90.f32808f;
        l90 l90VarE = str != null ? l90Var.e(str) : l90Var.e("Call cancelled without message");
        if (th4 != null) {
            l90VarE = l90VarE.d(th4);
        }
        n(l90VarE, false);
    }

    public final Runnable f(l40 l40Var) {
        synchronized (this) {
            try {
                if (this.f33303g == null) {
                    q((l40) zj.p.r(l40Var, "call"));
                    oc0 oc0Var = this.f33306j;
                    if (oc0Var != null) {
                        m(oc0Var);
                        return new ac0(this, this.f33299c);
                    }
                    this.f33305i = null;
                    this.f33300d = true;
                }
                return null;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected void g() {
    }

    final /* synthetic */ void h(j40 j40Var, a80 a80Var) {
        this.f33303g.a(j40Var, a80Var);
    }

    final /* synthetic */ void i(l90 l90Var, boolean z15) {
        n(l90Var, true);
    }

    final /* synthetic */ g50 k() {
        return this.f33299c;
    }

    final /* synthetic */ l40 l() {
        return this.f33303g;
    }

    public final String toString() {
        return zj.j.c(this).d("realCall", this.f33303g).toString();
    }
}
