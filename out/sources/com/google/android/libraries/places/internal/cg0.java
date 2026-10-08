package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class cg0 implements l60, pm0 {
    private final String A;
    private de0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n60 f31872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vf0 f31875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lb0 f31876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f31877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d60 f31878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wa0 f31879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i40 f31880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f31881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f31882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u90 f31883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wf0 f31884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile List f31885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zj.u f31886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t90 f31887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private t90 f31888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private hi0 f31889r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private vb0 f31892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile hi0 f31893v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l90 f31895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile b40 f31896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final mm0 f31897z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Collection f31890s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ef0 f31891t = new hf0(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile c50 f31894w = c50.a(b50.IDLE);

    cg0(w60 w60Var, String str, String str2, ce0 ce0Var, lb0 lb0Var, ScheduledExecutorService scheduledExecutorService, zj.w wVar, u90 u90Var, vf0 vf0Var, d60 d60Var, wa0 wa0Var, ya0 ya0Var, n60 n60Var, i40 i40Var, List list, String str3, i80 i80Var) {
        List listA = w60Var.a();
        zj.p.r(listA, "addressGroups");
        zj.p.e(!listA.isEmpty(), "addressGroups is empty");
        t(listA, "addressGroups contains null entry");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listA));
        this.f31885n = listUnmodifiableList;
        this.f31884m = new wf0(listUnmodifiableList);
        this.f31873b = str;
        this.f31874c = str2;
        this.f31876e = lb0Var;
        this.f31877f = scheduledExecutorService;
        this.f31886o = (zj.u) wVar.get();
        this.f31883l = u90Var;
        this.f31875d = vf0Var;
        this.f31878g = d60Var;
        this.f31879h = wa0Var;
        this.f31872a = (n60) zj.p.r(n60Var, "logId");
        this.f31880i = (i40) zj.p.r(i40Var, "channelLogger");
        this.f31882k = list;
        this.f31881j = ((Boolean) w60Var.c(i70.f32532c)).booleanValue();
        this.A = str3;
        this.f31897z = new mm0(i80Var);
    }

    private final void s(c50 c50Var) {
        this.f31883l.d();
        if (this.f31894w.c() != c50Var.c()) {
            zj.p.B(this.f31894w.c() != b50.SHUTDOWN, "Cannot transition out of SHUTDOWN to %s", c50Var.c());
            if (this.f31881j && c50Var.c() == b50.TRANSIENT_FAILURE) {
                this.f31894w = c50.a(b50.IDLE);
            } else {
                this.f31894w = c50Var;
            }
            vf0 vf0Var = this.f31875d;
            zj.p.x(true, "listener is null");
            ((qh0) vf0Var).f33413a.a(c50Var);
        }
    }

    private static void t(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zj.p.r(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(l90 l90Var) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(l90Var.g());
        if (l90Var.h() != null) {
            sb5.append("(");
            sb5.append(l90Var.h());
            sb5.append(")");
        }
        if (l90Var.i() != null) {
            sb5.append("[");
            sb5.append(l90Var.i());
            sb5.append("]");
        }
        return sb5.toString();
    }

    final /* synthetic */ void A(vb0 vb0Var, boolean z15) {
        of0 of0Var = new of0(this, vb0Var, z15);
        u90 u90Var = this.f31883l;
        u90Var.c(of0Var);
        u90Var.a();
    }

    final /* synthetic */ void B() {
        this.f31883l.d();
        t90 t90Var = this.f31887p;
        if (t90Var != null) {
            t90Var.a();
            this.f31887p = null;
            this.B = null;
        }
    }

    final /* synthetic */ vf0 C() {
        return this.f31875d;
    }

    final /* synthetic */ ScheduledExecutorService D() {
        return this.f31877f;
    }

    final /* synthetic */ d60 E() {
        return this.f31878g;
    }

    final /* synthetic */ i40 F() {
        return this.f31880i;
    }

    final /* synthetic */ List G() {
        return this.f31882k;
    }

    final /* synthetic */ u90 H() {
        return this.f31883l;
    }

    final /* synthetic */ wf0 I() {
        return this.f31884m;
    }

    final /* synthetic */ void J(List list) {
        this.f31885n = list;
    }

    final /* synthetic */ void K(t90 t90Var) {
        this.f31887p = null;
    }

    final /* synthetic */ t90 L() {
        return this.f31888q;
    }

    final /* synthetic */ void M(t90 t90Var) {
        this.f31888q = t90Var;
    }

    final /* synthetic */ hi0 N() {
        return this.f31889r;
    }

    final /* synthetic */ void O(hi0 hi0Var) {
        this.f31889r = hi0Var;
    }

    final /* synthetic */ Collection P() {
        return this.f31890s;
    }

    final /* synthetic */ ef0 Q() {
        return this.f31891t;
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        return this.f31872a;
    }

    final /* synthetic */ vb0 b() {
        return this.f31892u;
    }

    final void c(l90 l90Var) {
        d(l90Var);
        pf0 pf0Var = new pf0(this, l90Var);
        u90 u90Var = this.f31883l;
        u90Var.c(pf0Var);
        u90Var.a();
    }

    public final void d(l90 l90Var) {
        mf0 mf0Var = new mf0(this, l90Var);
        u90 u90Var = this.f31883l;
        u90Var.c(mf0Var);
        u90Var.a();
    }

    final /* synthetic */ void h(vb0 vb0Var) {
        this.f31892u = null;
    }

    final /* synthetic */ hi0 i() {
        return this.f31893v;
    }

    final /* synthetic */ void j(hi0 hi0Var) {
        this.f31893v = hi0Var;
    }

    final /* synthetic */ c50 k() {
        return this.f31894w;
    }

    final /* synthetic */ l90 l() {
        return this.f31895x;
    }

    final /* synthetic */ void m(l90 l90Var) {
        this.f31895x = l90Var;
    }

    final /* synthetic */ void n(b40 b40Var) {
        this.f31896y = b40Var;
    }

    final /* synthetic */ mm0 o() {
        return this.f31897z;
    }

    final /* synthetic */ String p() {
        return this.A;
    }

    final /* synthetic */ void q(de0 de0Var) {
        this.B = null;
    }

    public final String toString() {
        return zj.j.c(this).c("logId", this.f31872a.c()).d("addressGroups", this.f31885n).toString();
    }

    public final void v(List list) {
        zj.p.r(list, "newAddressGroups");
        t(list, "newAddressGroups contains null entry");
        zj.p.e(!list.isEmpty(), "newAddressGroups is empty");
        lf0 lf0Var = new lf0(this, Collections.unmodifiableList(new ArrayList(list)));
        u90 u90Var = this.f31883l;
        u90Var.c(lf0Var);
        u90Var.a();
    }

    final /* synthetic */ void w() {
        y50 y50Var;
        this.f31883l.d();
        zj.p.x(this.f31887p == null, "Should have no reconnectTask scheduled");
        wf0 wf0Var = this.f31884m;
        if (wf0Var.b()) {
            this.f31886o.f().g();
        }
        SocketAddress socketAddressE = wf0Var.e();
        byte[] bArr = null;
        if (socketAddressE instanceof y50) {
            y50 y50Var2 = (y50) socketAddressE;
            y50Var = y50Var2;
            socketAddressE = y50Var2.d();
        } else {
            y50Var = null;
        }
        b40 b40VarF = wf0Var.f();
        String str = (String) b40VarF.a(p50.f33265d);
        kb0 kb0Var = new kb0();
        if (str == null) {
            str = this.f31873b;
        }
        kb0Var.b(str);
        kb0Var.d(b40VarF);
        kb0Var.f(this.f31874c);
        kb0Var.h(y50Var);
        bg0 bg0Var = new bg0();
        bg0Var.f31796a = this.f31872a;
        sf0 sf0Var = new sf0(this.f31876e.f3(socketAddressE, kb0Var, bg0Var), this.f31879h, bArr);
        bg0Var.f31796a = sf0Var.a();
        this.f31878g.d(sf0Var);
        this.f31892u = sf0Var;
        this.f31890s.add(sf0Var);
        sf0Var.e(new ag0(this, sf0Var));
        this.f31880i.b(2, "Started transport {0}", bg0Var.f31796a);
    }

    final /* synthetic */ void x(l90 l90Var) {
        u90 u90Var = this.f31883l;
        u90Var.d();
        s(c50.b(l90Var));
        if (this.f31881j) {
            return;
        }
        if (this.B == null) {
            this.B = new de0();
        }
        long jA = this.B.a();
        zj.u uVar = this.f31886o;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jD = jA - uVar.d(timeUnit);
        this.f31880i.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", u(l90Var), Long.valueOf(jD));
        zj.p.x(this.f31887p == null, "previous reconnectTask is not done");
        this.f31887p = u90Var.e(new if0(this), jD, timeUnit, this.f31877f);
    }

    final /* synthetic */ void y(b50 b50Var) {
        this.f31883l.d();
        s(c50.a(b50Var));
    }

    final /* synthetic */ void z() {
        nf0 nf0Var = new nf0(this);
        u90 u90Var = this.f31883l;
        u90Var.c(nf0Var);
        u90Var.a();
    }

    @Override // com.google.android.libraries.places.internal.pm0
    public final jb0 zza() {
        hi0 hi0Var = this.f31893v;
        if (hi0Var != null) {
            return hi0Var;
        }
        u90 u90Var = this.f31883l;
        u90Var.c(new jf0(this));
        u90Var.a();
        return null;
    }
}
