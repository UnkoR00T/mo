package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class eh0 extends p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ch0 f32207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t80 f32208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ uh0 f32209c;

    eh0(uh0 uh0Var, ch0 ch0Var, t80 t80Var) {
        Objects.requireNonNull(uh0Var);
        this.f32209c = uh0Var;
        this.f32207a = (ch0) zj.p.r(ch0Var, "helperImpl");
        this.f32208b = (t80) zj.p.r(t80Var, "resolver");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(l90 l90Var) {
        Logger logger = uh0.f33901d0;
        Level level = Level.WARNING;
        uh0 uh0Var = this.f32209c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{uh0Var.a(), l90Var});
        uh0Var.H().j();
        if (uh0Var.U() != 3) {
            uh0Var.F().b(3, "Failed to resolve name: {0}", l90Var);
            uh0Var.V(3);
        }
        ch0 ch0Var = this.f32207a;
        if (ch0Var != uh0Var.o()) {
            return;
        }
        ch0Var.f31899a.b(l90Var);
    }

    @Override // com.google.android.libraries.places.internal.p80
    public final l90 a(r80 r80Var) {
        fi0 fi0Var;
        uh0 uh0Var = this.f32209c;
        u90 u90Var = uh0Var.f33925n;
        u90Var.d();
        if (uh0Var.n() != this.f32208b) {
            return l90.f32807e;
        }
        n90 n90VarB = r80Var.b();
        if (!n90VarB.c()) {
            b(n90VarB.e());
            return n90VarB.e();
        }
        List list = (List) n90VarB.d();
        uh0Var.F().b(1, "Resolved address: {0}, config={1}", list, r80Var.c());
        if (uh0Var.U() != 2) {
            uh0Var.F().b(2, "Address resolved: {0}", list);
            uh0Var.V(2);
        }
        m80 m80VarD = r80Var.d();
        g60 g60Var = (g60) r80Var.c().a(g60.f32366a);
        fi0 fi0VarI = (m80VarD == null || m80VarD.c() == null) ? null : (fi0) m80VarD.c();
        l90 l90VarD = m80VarD != null ? m80VarD.d() : null;
        if (uh0Var.M()) {
            if (fi0VarI != null) {
                if (g60Var != null) {
                    uh0Var.H().i(g60Var);
                    if (fi0VarI.b() != null) {
                        uh0Var.F().a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    uh0Var.H().i(fi0VarI.b());
                }
            } else if (l90VarD == null) {
                uh0Var.H().i(null);
                fi0VarI = uh0.f33905h0;
            } else {
                if (!uh0Var.K()) {
                    uh0Var.F().a(2, "Fallback to error due to invalid first service config without default config");
                    l90 l90VarD2 = m80VarD.d();
                    zj.p.e(!l90VarD2.j(), "the error status must not be OK");
                    u90Var.c(new dh0(this, l90VarD2));
                    u90Var.a();
                    return m80VarD.d();
                }
                fi0VarI = uh0Var.I();
            }
            if (!fi0VarI.equals(uh0Var.I())) {
                uh0Var.F().b(2, "Service config changed{0}", fi0VarI == uh0.f33905h0 ? " to empty" : "");
                uh0Var.J(fi0VarI);
                uh0Var.R().f33788a = fi0VarI.d();
            }
            try {
                uh0Var.L(true);
            } catch (RuntimeException e15) {
                uh0 uh0Var2 = this.f32209c;
                Logger logger = uh0.f33901d0;
                Level level = Level.WARNING;
                String strValueOf = String.valueOf(uh0Var2.a());
                StringBuilder sb5 = new StringBuilder(strValueOf.length() + 51);
                sb5.append("[");
                sb5.append(strValueOf);
                sb5.append("] Unexpected exception from parsing service config");
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", sb5.toString(), (Throwable) e15);
            }
            fi0Var = fi0VarI;
        } else {
            if (fi0VarI != null) {
                uh0Var.F().a(2, "Service config from name resolver discarded by channel settings");
            }
            if (g60Var != null) {
                uh0Var.F().a(2, "Config selector from name resolver discarded by channel settings");
            }
            oh0 oh0VarH = uh0Var.H();
            fi0Var = uh0.f33905h0;
            oh0VarH.i(fi0Var.b());
        }
        b40 b40VarC = r80Var.c();
        ch0 ch0Var = this.f32207a;
        if (ch0Var != this.f32209c.o()) {
            return l90.f32807e;
        }
        z30 z30VarC = b40VarC.c();
        z30VarC.b(g60.f32366a);
        Map mapA = fi0Var.a();
        if (mapA != null) {
            z30VarC.a(i70.f32530a, mapA);
            z30VarC.c();
        }
        b40 b40VarC2 = z30VarC.c();
        d70 d70VarA = e70.a();
        d70VarA.a((List) n90VarB.d());
        d70VarA.b(b40VarC2);
        d70VarA.c(fi0Var.c());
        return ch0Var.f31899a.a(d70VarA.d());
    }
}
