package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
abstract class ll0 implements gb0 {
    static final w70 A;
    static final w70 B;
    private static final l90 C;
    private static final Random D;
    private static final boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f80 f32851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f32852b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f32854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a80 f32855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ml0 f32856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final af0 f32857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f32858h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final tk0 f32860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f32861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f32862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final kl0 f32863m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private xk0 f32869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f32870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ib0 f32871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private uk0 f32872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private uk0 f32873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f32874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private l90 f32875y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f32876z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f32853c = new u90(new bk0(this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f32859i = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ff0 f32864n = new ff0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile al0 f32865o = new al0(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f32866p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicInteger f32867q = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicInteger f32868r = new AtomicInteger();

    static {
        v70 v70Var = a80.f31574d;
        A = w70.c("grpc-previous-rpc-attempts", v70Var);
        B = w70.c("grpc-retry-pushback-ms", v70Var);
        C = l90.f32808f.e("Stream thrown away because RetriableStream committed");
        D = new Random();
        w70 w70Var = ze0.f34495c;
        E = k60.b("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    ll0(f80 f80Var, a80 a80Var, tk0 tk0Var, long j15, long j16, Executor executor, ScheduledExecutorService scheduledExecutorService, ml0 ml0Var, af0 af0Var, kl0 kl0Var) {
        this.f32851a = f80Var;
        this.f32860j = tk0Var;
        this.f32861k = j15;
        this.f32862l = j16;
        this.f32852b = executor;
        this.f32854d = scheduledExecutorService;
        this.f32855e = a80Var;
        this.f32856f = ml0Var;
        if (ml0Var != null) {
            this.f32874x = ml0Var.f32956b;
        }
        this.f32857g = af0Var;
        zj.p.e(ml0Var == null || af0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f32858h = af0Var != null;
        this.f32863m = kl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final Runnable g0(jl0 jl0Var) {
        List list;
        boolean z15;
        Collection collectionSingleton;
        Future futureB;
        Future future;
        synchronized (this.f32859i) {
            try {
                if (this.f32865o.f31670f != null) {
                    return null;
                }
                Collection collection = this.f32865o.f31667c;
                al0 al0Var = this.f32865o;
                zj.p.x(al0Var.f31670f == null, "Already committed");
                List list2 = al0Var.f31666b;
                if (al0Var.f31667c.contains(jl0Var)) {
                    list = null;
                    collectionSingleton = Collections.singleton(jl0Var);
                    z15 = true;
                } else {
                    list = list2;
                    z15 = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.f32865o = new al0(list, collectionSingleton, al0Var.f31668d, jl0Var, al0Var.f31671g, z15, al0Var.f31672h, al0Var.f31669e);
                this.f32860j.a(-this.f32870t);
                uk0 uk0Var = this.f32872v;
                boolean z16 = uk0Var == null;
                boolean z17 = uk0Var != null ? uk0Var.f33946c : false;
                boolean z18 = !z16;
                if (z16) {
                    futureB = null;
                } else {
                    futureB = uk0Var.b();
                    this.f32872v = null;
                }
                uk0 uk0Var2 = this.f32873w;
                if (uk0Var2 != null) {
                    Future futureB2 = uk0Var2.b();
                    this.f32873w = null;
                    future = futureB2;
                } else {
                    future = null;
                }
                return new dk0(this, collection, jl0Var, z18, futureB, z17, future);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final jl0 i0(int i15, boolean z15, boolean z16) {
        AtomicInteger atomicInteger;
        int i16;
        do {
            atomicInteger = this.f32868r;
            i16 = atomicInteger.get();
            if (i16 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i16, i16 + 1));
        jl0 jl0Var = new jl0(i15);
        ok0 ok0Var = new ok0(this, new sk0(this, jl0Var));
        a80 a80Var = this.f32855e;
        a80 a80Var2 = new a80();
        a80Var2.f(a80Var);
        if (i15 > 0) {
            a80Var2.c(A, String.valueOf(i15));
        }
        jl0Var.f32664a = d0(a80Var2, ok0Var, i15, z15, z16);
        return jl0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        if (r5 >= r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        r7 = (com.google.android.libraries.places.internal.rk0) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof com.google.android.libraries.places.internal.yk0);
        r7 = r9.f32865o;
        r8 = r7.f31670f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r8 != r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r7.f31671g == false) goto L62;
     */
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(com.google.android.libraries.places.internal.jl0 r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.f32859i
            monitor-enter(r5)
            com.google.android.libraries.places.internal.al0 r6 = r9.f32865o     // Catch: java.lang.Throwable -> L12
            com.google.android.libraries.places.internal.jl0 r7 = r6.f31670f     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L12:
            r10 = move-exception
            goto Lac
        L15:
            boolean r7 = r6.f31671g     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L1b:
            java.util.List r7 = r6.f31666b     // Catch: java.lang.Throwable -> L12
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r8) goto L61
            com.google.android.libraries.places.internal.al0 r0 = r6.a(r10)     // Catch: java.lang.Throwable -> L12
            r9.f32865o = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.q()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            com.google.android.libraries.places.internal.pk0 r1 = new com.google.android.libraries.places.internal.pk0     // Catch: java.lang.Throwable -> L12
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L37:
            if (r1 == 0) goto L44
            java.util.concurrent.Executor r10 = r9.f32853c
            com.google.android.libraries.places.internal.u90 r10 = (com.google.android.libraries.places.internal.u90) r10
            r10.c(r1)
            r10.a()
            return
        L44:
            if (r4 != 0) goto L50
            com.google.android.libraries.places.internal.gb0 r0 = r10.f32664a
            com.google.android.libraries.places.internal.il0 r1 = new com.google.android.libraries.places.internal.il0
            r1.<init>(r9, r10)
            r0.u(r1)
        L50:
            com.google.android.libraries.places.internal.gb0 r0 = r10.f32664a
            com.google.android.libraries.places.internal.al0 r1 = r9.f32865o
            com.google.android.libraries.places.internal.jl0 r1 = r1.f31670f
            if (r1 != r10) goto L5b
            com.google.android.libraries.places.internal.l90 r10 = r9.f32875y
            goto L5d
        L5b:
            com.google.android.libraries.places.internal.l90 r10 = com.google.android.libraries.places.internal.ll0.C
        L5d:
            r0.t(r10)
            return
        L61:
            boolean r6 = r10.f32665b     // Catch: java.lang.Throwable -> L12
            if (r6 == 0) goto L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L67:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L12
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L87
        L7d:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L8d:
            if (r5 >= r2) goto La9
            java.lang.Object r7 = r3.get(r5)
            com.google.android.libraries.places.internal.rk0 r7 = (com.google.android.libraries.places.internal.rk0) r7
            r7.a(r10)
            boolean r7 = r7 instanceof com.google.android.libraries.places.internal.yk0
            r4 = r4 | r7
            com.google.android.libraries.places.internal.al0 r7 = r9.f32865o
            com.google.android.libraries.places.internal.jl0 r8 = r7.f31670f
            if (r8 == 0) goto La3
            if (r8 != r10) goto La9
        La3:
            boolean r7 = r7.f31671g
            int r5 = r5 + 1
            if (r7 == 0) goto L8d
        La9:
            r2 = r6
            goto L5
        Lac:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.ll0.j0(com.google.android.libraries.places.internal.jl0):void");
    }

    private final void X(rk0 rk0Var) {
        Collection collection;
        synchronized (this.f32859i) {
            try {
                if (!this.f32865o.f31665a) {
                    this.f32865o.f31666b.add(rk0Var);
                }
                collection = this.f32865o.f31667c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rk0Var.a((jl0) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final boolean l0(al0 al0Var) {
        return al0Var.f31670f == null && al0Var.f31669e < this.f32857g.f31615a && !al0Var.f31672h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void c() {
        Future future;
        synchronized (this.f32859i) {
            try {
                uk0 uk0Var = this.f32873w;
                future = null;
                if (uk0Var != null) {
                    Future futureB = uk0Var.b();
                    this.f32873w = null;
                    future = futureB;
                }
                this.f32865o = this.f32865o.b();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final void f(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        this.f32869s = new xk0(l90Var, hb0Var, a80Var);
        if (this.f32868r.addAndGet(PKIFailureInfo.systemUnavail) == Integer.MIN_VALUE) {
            u90 u90Var = (u90) this.f32853c;
            u90Var.c(new qk0(this, l90Var, hb0Var, a80Var));
            u90Var.a();
        }
    }

    public static long f0(long j15) {
        return (long) (j15 * (E ? (D.nextDouble() * 0.4d) + 0.8d : D.nextDouble()));
    }

    final /* synthetic */ long A() {
        return this.f32861k;
    }

    final /* synthetic */ long B() {
        return this.f32862l;
    }

    final /* synthetic */ kl0 C() {
        return this.f32863m;
    }

    final /* synthetic */ ff0 D() {
        return this.f32864n;
    }

    final /* synthetic */ al0 E() {
        return this.f32865o;
    }

    final /* synthetic */ void F(al0 al0Var) {
        this.f32865o = al0Var;
    }

    final /* synthetic */ AtomicBoolean G() {
        return this.f32866p;
    }

    final /* synthetic */ AtomicInteger H() {
        return this.f32867q;
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void I() {
        al0 al0Var = this.f32865o;
        if (al0Var.f31665a) {
            al0Var.f31670f.f32664a.I();
        } else {
            X(new hk0(this));
        }
    }

    final /* synthetic */ AtomicInteger J() {
        return this.f32868r;
    }

    final /* synthetic */ xk0 K() {
        return this.f32869s;
    }

    final /* synthetic */ long L() {
        return this.f32870t;
    }

    final /* synthetic */ void M(long j15) {
        this.f32870t = j15;
    }

    final /* synthetic */ ib0 N() {
        return this.f32871u;
    }

    final /* synthetic */ void O(uk0 uk0Var) {
        this.f32872v = uk0Var;
    }

    final /* synthetic */ void P(uk0 uk0Var) {
        this.f32873w = uk0Var;
    }

    final /* synthetic */ long Q() {
        return this.f32874x;
    }

    final /* synthetic */ void R(long j15) {
        this.f32874x = j15;
    }

    final /* synthetic */ boolean S() {
        return this.f32876z;
    }

    final /* synthetic */ void T(boolean z15) {
        this.f32876z = true;
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void a(int i15) {
        al0 al0Var = this.f32865o;
        if (al0Var.f31665a) {
            al0Var.f31670f.f32664a.a(i15);
        } else {
            X(new mk0(this, i15));
        }
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void b(x40 x40Var) {
        X(new ek0(this, x40Var));
    }

    abstract l90 b0();

    abstract void c0();

    @Override // com.google.android.libraries.places.internal.jm0
    public final void d(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    abstract gb0 d0(a80 a80Var, p40 p40Var, int i15, boolean z15, boolean z16);

    @Override // com.google.android.libraries.places.internal.jm0
    public final void e() {
        X(new lk0(this));
    }

    final void e0(Object obj) {
        al0 al0Var = this.f32865o;
        if (al0Var.f31665a) {
            al0Var.f31670f.f32664a.d(this.f32851a.e(obj));
        } else {
            X(new nk0(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void h() {
        X(new ik0(this));
    }

    final /* synthetic */ void h0(jl0 jl0Var) {
        Runnable runnableG0 = g0(jl0Var);
        if (runnableG0 != null) {
            this.f32852b.execute(runnableG0);
        }
    }

    final /* synthetic */ f80 i() {
        return this.f32851a;
    }

    final /* synthetic */ Executor j() {
        return this.f32852b;
    }

    final /* synthetic */ Executor k() {
        return this.f32853c;
    }

    final /* synthetic */ void k0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            c();
            return;
        }
        Object obj = this.f32859i;
        synchronized (obj) {
            try {
                uk0 uk0Var = this.f32873w;
                if (uk0Var == null) {
                    return;
                }
                Future futureB = uk0Var.b();
                uk0 uk0Var2 = new uk0(obj);
                this.f32873w = uk0Var2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                uk0Var2.a(this.f32854d.schedule(new wk0(this, uk0Var2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final /* synthetic */ ScheduledExecutorService l() {
        return this.f32854d;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void m(int i15) {
        X(new jk0(this, i15));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void n(n50 n50Var) {
        X(new gk0(this, n50Var));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void p(int i15) {
        X(new kk0(this, i15));
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final boolean q() {
        Iterator it = this.f32865o.f31667c.iterator();
        while (it.hasNext()) {
            if (((jl0) it.next()).f32664a.q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void r(ff0 ff0Var) {
        al0 al0Var;
        synchronized (this.f32859i) {
            ff0Var.b("closed", this.f32864n);
            al0Var = this.f32865o;
        }
        jl0 jl0Var = al0Var.f31670f;
        if (jl0Var != null) {
            ff0 ff0Var2 = new ff0();
            jl0Var.f32664a.r(ff0Var2);
            ff0Var.b("committed", ff0Var2);
            return;
        }
        ff0 ff0Var3 = new ff0();
        for (jl0 jl0Var2 : al0Var.f31667c) {
            ff0 ff0Var4 = new ff0();
            jl0Var2.f32664a.r(ff0Var4);
            ff0Var3.a(ff0Var4);
        }
        ff0Var.b("open", ff0Var3);
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void s(j50 j50Var) {
        X(new fk0(this, j50Var));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void t(l90 l90Var) {
        jl0 jl0Var;
        jl0 jl0Var2 = new jl0(0);
        jl0Var2.f32664a = new ri0();
        Runnable runnableG0 = g0(jl0Var2);
        if (runnableG0 != null) {
            synchronized (this.f32859i) {
                this.f32865o = this.f32865o.a(jl0Var2);
            }
            runnableG0.run();
            f(l90Var, hb0.PROCESSED, new a80());
            return;
        }
        synchronized (this.f32859i) {
            try {
                if (this.f32865o.f31667c.contains(this.f32865o.f31670f)) {
                    jl0Var = this.f32865o.f31670f;
                } else {
                    this.f32875y = l90Var;
                    jl0Var = null;
                }
                al0 al0Var = this.f32865o;
                this.f32865o = new al0(al0Var.f31666b, al0Var.f31667c, al0Var.f31668d, al0Var.f31670f, true, al0Var.f31665a, al0Var.f31672h, al0Var.f31669e);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (jl0Var != null) {
            jl0Var.f32664a.t(l90Var);
        }
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void u(ib0 ib0Var) {
        uk0 uk0Var;
        kl0 kl0Var;
        this.f32871u = ib0Var;
        l90 l90VarB0 = b0();
        if (l90VarB0 != null) {
            t(l90VarB0);
            return;
        }
        synchronized (this.f32859i) {
            this.f32865o.f31666b.add(new yk0(this));
        }
        jl0 jl0VarI0 = i0(0, false, false);
        if (jl0VarI0 == null) {
            return;
        }
        if (this.f32858h) {
            Object obj = this.f32859i;
            synchronized (obj) {
                try {
                    this.f32865o = this.f32865o.c(jl0VarI0);
                    uk0Var = null;
                    if (l0(this.f32865o) && ((kl0Var = this.f32863m) == null || kl0Var.a())) {
                        uk0Var = new uk0(obj);
                        this.f32873w = uk0Var;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (uk0Var != null) {
                uk0Var.a(this.f32854d.schedule(new wk0(this, uk0Var), this.f32857g.f31616b, TimeUnit.NANOSECONDS));
            }
        }
        j0(jl0VarI0);
    }

    final /* synthetic */ ml0 v() {
        return this.f32856f;
    }

    final /* synthetic */ af0 w() {
        return this.f32857g;
    }

    final /* synthetic */ boolean x() {
        return this.f32858h;
    }

    final /* synthetic */ Object y() {
        return this.f32859i;
    }

    final /* synthetic */ tk0 z() {
        return this.f32860j;
    }
}
