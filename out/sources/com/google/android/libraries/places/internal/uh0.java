package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class uh0 extends r70 implements l60 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    static final Logger f33901d0 = Logger.getLogger(uh0.class.getName());

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    static final l90 f33902e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    static final l90 f33903f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final l90 f33904g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final fi0 f33905h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final g60 f33906i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final a70 f33907j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final l40 f33908k0;
    private Collection A;
    private final Object B;
    private final xc0 C;
    private final th0 D;
    private final AtomicBoolean E;
    private boolean F;
    private boolean G;
    private volatile boolean H;
    private final CountDownLatch I;
    private final va0 J;
    private final wa0 K;
    private final ya0 L;
    private final i40 M;
    private final d60 N;
    private final oh0 O;
    private fi0 P;
    private boolean Q;
    private final boolean R;
    private final tk0 S;
    private final long T;
    private final long U;
    private final boolean V;
    private final gi0 W;
    final ef0 X;
    private final tg0 Y;
    private final ak0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n60 f33909a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final i80 f33910a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33911b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f33912b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vm0 f33913c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ce0 f33914c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u80 f33915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l80 f33916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k70 f33917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lb0 f33918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ph0 f33919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f33920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final si0 f33921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final yg0 f33922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final yg0 f33923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final nm0 f33924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final u90 f33925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n50 f33926o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final zj.w f33927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f33928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final xb0 f33929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final g40 f33930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f33931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f33932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private t80 f33933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f33934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ch0 f33935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f33936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Set f33937z;

    static {
        l90 l90Var = l90.f32815m;
        f33902e0 = l90Var.e("Channel shutdownNow invoked");
        f33903f0 = l90Var.e("Channel shutdown invoked");
        f33904g0 = l90Var.e("Subchannel shutdown invoked");
        f33905h0 = new fi0(null, new HashMap(), new HashMap(), null, null, null);
        f33906i0 = new kg0();
        f33907j0 = new pg0();
        f33908k0 = new rg0();
    }

    uh0(ai0 ai0Var, lb0 lb0Var, vm0 vm0Var, u80 u80Var, ce0 ce0Var, si0 si0Var, zj.w wVar, List list, nm0 nm0Var) {
        u90 u90Var = new u90(new qg0(this));
        this.f33925n = u90Var;
        this.f33929r = new xb0();
        this.f33937z = new HashSet(16, 0.75f);
        this.B = new Object();
        byte[] bArr = null;
        this.D = new th0(this, bArr);
        this.E = new AtomicBoolean(false);
        this.I = new CountDownLatch(1);
        this.f33912b0 = 1;
        this.P = f33905h0;
        this.Q = false;
        this.S = new tk0();
        int i15 = j50.f32641h;
        xg0 xg0Var = new xg0(this, bArr);
        this.W = xg0Var;
        this.X = new zg0(this, null);
        this.Y = new tg0(this, null);
        String str = (String) zj.p.r(ai0Var.f31645f, "target");
        this.f33911b = str;
        n60 n60VarB = n60.b("Channel", str);
        this.f33909a = n60VarB;
        this.f33924m = (nm0) zj.p.r(nm0Var, "timeProvider");
        si0 si0Var2 = (si0) zj.p.r(ai0Var.f31640a, "executorPool");
        this.f33921j = si0Var2;
        Executor executor = (Executor) zj.p.r((Executor) si0Var2.zza(), "executor");
        this.f33920i = executor;
        yg0 yg0Var = new yg0((si0) zj.p.r(ai0Var.f31641b, "offloadExecutorPool"));
        this.f33923l = yg0Var;
        ua0 ua0Var = new ua0(lb0Var, null, yg0Var);
        this.f33918g = ua0Var;
        ph0 ph0Var = new ph0(ua0Var.zzb(), null);
        this.f33919h = ph0Var;
        long jZza = nm0Var.zza();
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 14);
        sb5.append("Channel for '");
        sb5.append(str);
        sb5.append("'");
        ya0 ya0Var = new ya0(n60VarB, 0, jZza, sb5.toString());
        this.L = ya0Var;
        xa0 xa0Var = new xa0(ya0Var, nm0Var);
        this.M = xa0Var;
        d90 d90Var = ze0.f34505m;
        this.V = true;
        qa0 qa0Var = new qa0(o70.a(), ai0Var.f31647h);
        this.f33917f = qa0Var;
        this.f33913c = (vm0) zj.p.r(vm0Var, "targetUri");
        this.f33915d = (u80) zj.p.r(u80Var, "nameResolverProvider");
        rl0 rl0Var = new rl0(true, 5, 5, qa0Var);
        qi0 qi0Var = new qi0(ai0Var.f31652m, h80.a());
        this.f33910a0 = qi0Var;
        k80 k80VarG = l80.g();
        ai0Var.d();
        k80VarG.a(443);
        k80VarG.b(d90Var);
        k80VarG.c(u90Var);
        k80VarG.d(ph0Var);
        k80VarG.e(rl0Var);
        k80VarG.f(xa0Var);
        k80VarG.g(yg0Var);
        k80VarG.h(qi0Var);
        k80VarG.i(ai0Var.f31643d);
        l80 l80VarJ = k80VarG.j();
        this.f33916e = l80VarJ;
        this.f33933v = a0(vm0Var, null, u80Var, l80VarJ);
        this.f33922k = new yg0((si0) zj.p.r(si0Var, "balancerRpcExecutorPool"));
        xc0 xc0Var = new xc0(executor, u90Var);
        this.C = xc0Var;
        xc0Var.e(xg0Var);
        this.f33914c0 = ce0Var;
        this.R = true;
        oh0 oh0Var = new oh0(this, this.f33933v.a(), null);
        this.O = oh0Var;
        this.f33930s = o40.a(oh0Var, list);
        this.f33931t = new ArrayList(ai0Var.f31644e);
        this.f33927p = (zj.w) zj.p.r(wVar, "stopwatchSupplier");
        long j15 = ai0Var.f31650k;
        if (j15 == -1) {
            this.f33928q = -1L;
        } else {
            zj.p.k(j15 >= ai0.f31634r, "invalid idleTimeoutMillis %s", j15);
            this.f33928q = ai0Var.f31650k;
        }
        this.Z = new ak0(new ah0(this, null), u90Var, ua0Var.zzb(), zj.u.c());
        this.f33926o = (n50) zj.p.r(ai0Var.f31648i, "decompressorRegistry");
        this.f33932u = ai0Var.f31646g;
        this.U = 16777216L;
        this.T = 1048576L;
        mg0 mg0Var = new mg0(this, nm0Var);
        this.J = mg0Var;
        this.K = mg0Var.zza();
        d60 d60Var = (d60) zj.p.q(ai0Var.f31651l);
        this.N = d60Var;
        d60Var.c(this);
    }

    private final void X(boolean z15) {
        this.f33925n.d();
        if (z15) {
            zj.p.x(this.f33934w, "nameResolver is not started");
            zj.p.x(this.f33935x != null, "lbHelper is null");
        }
        t80 t80Var = this.f33933v;
        if (t80Var != null) {
            t80Var.c();
            this.f33934w = false;
            if (z15) {
                this.f33933v = a0(this.f33913c, null, this.f33915d, this.f33916e);
            } else {
                this.f33933v = null;
            }
        }
        ch0 ch0Var = this.f33935x;
        if (ch0Var != null) {
            ch0Var.f31899a.c();
            this.f33935x = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void h0() {
        long j15 = this.f33928q;
        if (j15 == -1) {
            return;
        }
        this.Z.a(j15, TimeUnit.MILLISECONDS);
    }

    static t80 a0(vm0 vm0Var, String str, u80 u80Var, l80 l80Var) {
        t80 t80VarA = vm0Var.a(u80Var, l80Var);
        if (t80VarA != null) {
            return new ql0(t80VarA, new sa0(new ce0(), l80Var.d(), l80Var.c()), l80Var.c());
        }
        throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(vm0Var)));
    }

    final /* synthetic */ void A(boolean z15) {
        this.G = true;
    }

    final /* synthetic */ boolean B() {
        return this.H;
    }

    final /* synthetic */ va0 C() {
        return this.J;
    }

    final /* synthetic */ wa0 D() {
        return this.K;
    }

    final /* synthetic */ ya0 E() {
        return this.L;
    }

    final /* synthetic */ i40 F() {
        return this.M;
    }

    final /* synthetic */ d60 G() {
        return this.N;
    }

    final /* synthetic */ oh0 H() {
        return this.O;
    }

    final /* synthetic */ fi0 I() {
        return this.P;
    }

    final /* synthetic */ void J(fi0 fi0Var) {
        this.P = fi0Var;
    }

    final /* synthetic */ boolean K() {
        return this.Q;
    }

    final /* synthetic */ void L(boolean z15) {
        this.Q = true;
    }

    final /* synthetic */ boolean M() {
        return this.R;
    }

    final /* synthetic */ tk0 N() {
        return this.S;
    }

    final /* synthetic */ long O() {
        return this.T;
    }

    final /* synthetic */ long P() {
        return this.U;
    }

    final /* synthetic */ boolean Q() {
        return this.V;
    }

    final /* synthetic */ tg0 R() {
        return this.Y;
    }

    final /* synthetic */ i80 S() {
        return this.f33910a0;
    }

    final /* synthetic */ int U() {
        return this.f33912b0;
    }

    final /* synthetic */ void V(int i15) {
        this.f33912b0 = i15;
    }

    final /* synthetic */ ce0 W() {
        return this.f33914c0;
    }

    final void Z() {
        this.f33925n.d();
        if (this.E.get() || this.f33936y) {
            return;
        }
        if (this.X.b()) {
            this.Z.b(false);
        } else {
            h0();
        }
        if (this.f33935x == null) {
            this.M.a(2, "Exiting idle mode");
            ch0 ch0Var = new ch0(this, null);
            ch0Var.f31899a = new pa0((qa0) this.f33917f, ch0Var);
            this.f33935x = ch0Var;
            this.f33929r.a(b50.CONNECTING);
            this.f33933v.b(new eh0(this, ch0Var, this.f33933v));
            this.f33934w = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        return this.f33909a;
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final l40 b(f80 f80Var, f40 f40Var) {
        return this.f33930s.b(f80Var, f40Var);
    }

    public final uh0 b0() {
        i40 i40Var = this.M;
        i40Var.a(1, "shutdownNow() called");
        i40Var.a(1, "shutdown() called");
        if (this.E.compareAndSet(false, true)) {
            u90 u90Var = this.f33925n;
            u90Var.c(new ng0(this));
            u90Var.a();
            oh0 oh0Var = this.O;
            u90 u90Var2 = oh0Var.f33184d.f33925n;
            u90Var2.c(new gh0(oh0Var));
            u90Var2.a();
            u90Var.c(new lg0(this));
            u90Var.a();
        }
        oh0 oh0Var2 = this.O;
        u90 u90Var3 = oh0Var2.f33184d.f33925n;
        u90Var3.c(new hh0(oh0Var2));
        u90Var3.a();
        u90 u90Var4 = this.f33925n;
        u90Var4.c(new og0(this));
        u90Var4.a();
        return this;
    }

    final void c0(Throwable th4) {
        if (this.f33936y) {
            return;
        }
        this.f33936y = true;
        try {
            this.Z.b(true);
            X(false);
        } finally {
            this.C.h(new y60(b70.c(l90.f32814l.e("Panic! This is a bug!").d(th4))));
            this.O.i(null);
            this.M.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            this.f33929r.a(b50.TRANSIENT_FAILURE);
        }
    }

    final /* synthetic */ void d0() {
        if (this.F) {
            Iterator it = this.f33937z.iterator();
            while (it.hasNext()) {
                ((cg0) it.next()).c(f33902e0);
            }
        }
    }

    final /* synthetic */ void e0(boolean z15) {
        X(false);
    }

    final /* synthetic */ void f0() {
        X(true);
        xc0 xc0Var = this.C;
        xc0Var.h(null);
        this.M.a(2, "Entering IDLE state");
        this.f33929r.a(b50.IDLE);
        if (this.X.c(this.B, xc0Var)) {
            Z();
        }
    }

    final /* synthetic */ void g0(boolean z15) {
        this.Z.b(true);
    }

    @Override // com.google.android.libraries.places.internal.g40
    public final String h() {
        return this.f33930s.h();
    }

    @Override // com.google.android.libraries.places.internal.r70
    public final /* bridge */ /* synthetic */ r70 i() {
        b0();
        return this;
    }

    final /* synthetic */ void i0() {
        this.f33925n.d();
        if (this.f33934w) {
            this.f33933v.d();
        }
    }

    final /* synthetic */ zj.w j() {
        return this.f33927p;
    }

    final /* synthetic */ void j0(g70 g70Var) {
        this.C.h(g70Var);
    }

    final /* synthetic */ xb0 k() {
        return this.f33929r;
    }

    final /* synthetic */ Executor k0(f40 f40Var) {
        Executor executorJ = f40Var.j();
        return executorJ == null ? this.f33920i : executorJ;
    }

    final /* synthetic */ List l() {
        return this.f33931t;
    }

    final /* synthetic */ void l0() {
        if (!this.H && this.E.get() && this.f33937z.isEmpty()) {
            this.M.a(2, "Terminated");
            this.N.f(this);
            this.f33921j.c(this.f33920i);
            this.f33922k.c();
            this.f33923l.c();
            this.f33918g.close();
            this.H = true;
            this.I.countDown();
        }
    }

    final /* synthetic */ String m() {
        return this.f33932u;
    }

    final /* synthetic */ t80 n() {
        return this.f33933v;
    }

    final /* synthetic */ ch0 o() {
        return this.f33935x;
    }

    final /* synthetic */ boolean p() {
        return this.f33936y;
    }

    final /* synthetic */ String p0() {
        return this.f33911b;
    }

    final /* synthetic */ Set q() {
        return this.f33937z;
    }

    final /* synthetic */ lb0 q0() {
        return this.f33918g;
    }

    final /* synthetic */ Collection r() {
        return this.A;
    }

    final /* synthetic */ ph0 r0() {
        return this.f33919h;
    }

    final /* synthetic */ void s(Collection collection) {
        this.A = collection;
    }

    final /* synthetic */ Executor s0() {
        return this.f33920i;
    }

    final /* synthetic */ Object t() {
        return this.B;
    }

    final /* synthetic */ nm0 t0() {
        return this.f33924m;
    }

    public final String toString() {
        return zj.j.c(this).c("logId", this.f33909a.c()).d("target", this.f33911b).toString();
    }

    final /* synthetic */ xc0 u() {
        return this.C;
    }

    final /* synthetic */ n50 u0() {
        return this.f33926o;
    }

    final /* synthetic */ th0 v() {
        return this.D;
    }

    final /* synthetic */ AtomicBoolean w() {
        return this.E;
    }

    final /* synthetic */ boolean x() {
        return this.F;
    }

    final /* synthetic */ void y(boolean z15) {
        this.F = true;
    }

    final /* synthetic */ boolean z() {
        return this.G;
    }
}
