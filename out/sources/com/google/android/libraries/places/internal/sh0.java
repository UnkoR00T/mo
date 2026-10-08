package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class sh0 extends ja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w60 f33681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final n60 f33682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final xa0 f33683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ya0 f33684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List f33685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    cg0 f33686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f33687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f33688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    t90 f33689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ uh0 f33690j;

    sh0(uh0 uh0Var, w60 w60Var) {
        Objects.requireNonNull(uh0Var);
        this.f33690j = uh0Var;
        zj.p.r(w60Var, "args");
        this.f33685e = w60Var.a();
        this.f33681a = w60Var;
        n60 n60VarB = n60.b("Subchannel", uh0Var.h());
        this.f33682b = n60VarB;
        ya0 ya0Var = new ya0(n60VarB, 0, uh0Var.t0().zza(), "Subchannel for ".concat(String.valueOf(w60Var.a())));
        this.f33684d = ya0Var;
        this.f33683c = new xa0(ya0Var, uh0Var.t0());
    }

    @Override // com.google.android.libraries.places.internal.f70
    public final void a(h70 h70Var) {
        uh0 uh0Var = this.f33690j;
        u90 u90Var = uh0Var.f33925n;
        u90Var.d();
        zj.p.x(!this.f33687g, "already started");
        zj.p.x(!this.f33688h, "already shutdown");
        zj.p.x(!uh0Var.z(), "Channel is being terminated");
        this.f33687g = true;
        String strH = uh0Var.h();
        ScheduledExecutorService scheduledExecutorServiceZzb = uh0Var.q0().zzb();
        qh0 qh0Var = new qh0(this, h70Var);
        i80 i80VarS = uh0Var.o().f31900b.S();
        d60 d60VarG = uh0Var.G();
        wa0 wa0VarZza = uh0Var.C().zza();
        ya0 ya0Var = this.f33684d;
        n60 n60Var = this.f33682b;
        cg0 cg0Var = new cg0(this.f33681a, strH, uh0Var.m(), uh0Var.W(), uh0Var.q0(), scheduledExecutorServiceZzb, uh0Var.j(), u90Var, qh0Var, d60VarG, wa0VarZza, ya0Var, n60Var, this.f33683c, uh0Var.l(), uh0Var.p0(), i80VarS);
        z50 z50Var = new z50();
        z50Var.a("Child Subchannel started");
        z50Var.c(a60.CT_INFO);
        z50Var.b(uh0Var.t0().zza());
        z50Var.d(cg0Var);
        uh0Var.E().a(z50Var.e());
        this.f33686f = cg0Var;
        uh0Var.G().b(cg0Var);
        uh0Var.q().add(cg0Var);
    }

    @Override // com.google.android.libraries.places.internal.f70
    public final void b() {
        t90 t90Var;
        uh0 uh0Var = this.f33690j;
        u90 u90Var = uh0Var.f33925n;
        u90Var.d();
        if (this.f33686f == null) {
            this.f33688h = true;
            return;
        }
        if (!this.f33688h) {
            this.f33688h = true;
        } else {
            if (!uh0Var.z() || (t90Var = this.f33689i) == null) {
                return;
            }
            t90Var.a();
            this.f33689i = null;
        }
        if (uh0Var.z()) {
            this.f33686f.d(uh0.f33903f0);
        } else {
            this.f33689i = u90Var.e(new hg0(new rh0(this)), 5L, TimeUnit.SECONDS, uh0Var.q0().zzb());
        }
    }

    @Override // com.google.android.libraries.places.internal.f70
    public final void c() {
        this.f33690j.f33925n.d();
        zj.p.x(this.f33687g, "not started");
        if (this.f33688h) {
            return;
        }
        this.f33686f.zza();
    }

    @Override // com.google.android.libraries.places.internal.f70
    public final void d(List list) {
        this.f33690j.f33925n.d();
        this.f33685e = list;
        this.f33686f.v(list);
    }

    @Override // com.google.android.libraries.places.internal.f70
    public final Object e() {
        zj.p.x(this.f33687g, "Subchannel is not started");
        return this.f33686f;
    }

    public final String toString() {
        return this.f33682b.toString();
    }
}
