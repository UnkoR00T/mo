package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.b7;
import io.sentry.d7;
import io.sentry.e7;
import io.sentry.f5;
import io.sentry.i5;
import io.sentry.p2;
import io.sentry.r6;
import io.sentry.r7;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class e1 implements io.sentry.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f93789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f93790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f93791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Future<g1> f93792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.r<String> f93793e = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.android.core.c1
        @Override // io.sentry.util.r.a
        public final Object a() {
            return a1.l(p2.e());
        }
    });

    public e1(Context context, t0 t0Var, final SentryAndroidOptions sentryAndroidOptions) {
        this.f93789a = (Context) io.sentry.util.v.c(a1.g(context), "The application context is required.");
        this.f93790b = (t0) io.sentry.util.v.c(t0Var, "The BuildInfoProvider is required.");
        this.f93791c = (SentryAndroidOptions) io.sentry.util.v.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f93792d = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.d1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g1.i(this.f93785a.f93789a, sentryAndroidOptions);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void d(r6 r6Var) {
        io.sentry.protocol.a0 a0VarI;
        List<io.sentry.protocol.z> listD;
        List<io.sentry.protocol.q> listP0 = r6Var.p0();
        if (listP0 == null || listP0.size() <= 1) {
            return;
        }
        io.sentry.protocol.q qVar = listP0.get(listP0.size() - 1);
        if (!"java.lang".equals(qVar.h()) || (a0VarI = qVar.i()) == null || (listD = a0VarI.d()) == null) {
            return;
        }
        Iterator<io.sentry.protocol.z> it = listD.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().v())) {
                Collections.reverse(listP0);
                return;
            }
        }
    }

    private void e(i5 i5Var) {
        String str;
        io.sentry.protocol.l lVarG = i5Var.C().g();
        try {
            i5Var.C().s(this.f93792d.get().j());
        } catch (Throwable th4) {
            this.f93791c.getLogger().b(b7.ERROR, "Failed to retrieve os system", th4);
        }
        if (lVarG != null) {
            String strG = lVarG.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            i5Var.C().k(str, lVarG);
        }
    }

    private void f(i5 i5Var) {
        io.sentry.protocol.g0 g0VarQ = i5Var.Q();
        if (g0VarQ == null) {
            g0VarQ = new io.sentry.protocol.g0();
            i5Var.f0(g0VarQ);
        }
        if (g0VarQ.i() == null) {
            g0VarQ.l(l1.a(this.f93789a));
        }
        if (g0VarQ.j() == null && this.f93791c.isSendDefaultPii()) {
            g0VarQ.m("{{auto}}");
        }
    }

    private void g(i5 i5Var, io.sentry.j0 j0Var) {
        io.sentry.protocol.a aVarD = i5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        i(aVarD, j0Var);
        q(i5Var, aVarD);
        i5Var.C().n(aVarD);
    }

    private void i(io.sentry.protocol.a aVar, io.sentry.j0 j0Var) {
        Boolean boolC;
        aVar.o(a1.i(this.f93789a));
        io.sentry.android.core.performance.i iVarL = io.sentry.android.core.performance.h.p().l(this.f93791c);
        if (iVarL.t()) {
            aVar.p(io.sentry.m.o(iVarL.n()));
        }
        if (io.sentry.util.m.i(j0Var) || aVar.l() != null || (boolC = s0.y().C()) == null) {
            return;
        }
        aVar.r(Boolean.valueOf(!boolC.booleanValue()));
    }

    private void j(i5 i5Var, boolean z15, boolean z16) {
        f(i5Var);
        k(i5Var, z15, z16);
        r(i5Var);
    }

    private void k(i5 i5Var, boolean z15, boolean z16) {
        if (i5Var.C().e() == null) {
            try {
                i5Var.C().p(this.f93792d.get().a(z15, z16));
            } catch (Throwable th4) {
                this.f93791c.getLogger().b(b7.ERROR, "Failed to retrieve device info", th4);
            }
            e(i5Var);
        }
    }

    private void l(d7 d7Var) {
        try {
            f5 f5Var = f5.STRING;
            d7Var.a("device.brand", new e7(f5Var, Build.BRAND));
            d7Var.a("device.model", new e7(f5Var, Build.MODEL));
            d7Var.a("device.family", new e7(f5Var, this.f93793e.a()));
        } catch (Throwable th4) {
            this.f93791c.getLogger().b(b7.ERROR, "Failed to retrieve device info", th4);
        }
    }

    private void n(i5 i5Var, String str) {
        if (i5Var.E() == null) {
            i5Var.U(str);
        }
    }

    private void o(d7 d7Var) {
        try {
            f5 f5Var = f5.STRING;
            d7Var.a("os.name", new e7(f5Var, "Android"));
            d7Var.a("os.version", new e7(f5Var, Build.VERSION.RELEASE));
        } catch (Throwable th4) {
            this.f93791c.getLogger().b(b7.ERROR, "Failed to retrieve os system", th4);
        }
    }

    private void q(i5 i5Var, io.sentry.protocol.a aVar) {
        g1 g1Var;
        PackageInfo packageInfoO = a1.o(this.f93789a, PKIFailureInfo.certConfirmed, this.f93791c.getLogger(), this.f93790b);
        if (packageInfoO != null) {
            n(i5Var, a1.q(packageInfoO, this.f93790b));
            try {
                g1Var = this.f93792d.get();
            } catch (Throwable th4) {
                this.f93791c.getLogger().b(b7.ERROR, "Failed to retrieve device info", th4);
                g1Var = null;
            }
            a1.x(packageInfoO, this.f93790b, g1Var, aVar);
        }
    }

    private void r(i5 i5Var) {
        try {
            a1.a aVarL = this.f93792d.get().l();
            if (aVarL != null) {
                for (Map.Entry<String, String> entry : aVarL.a().entrySet()) {
                    i5Var.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th4) {
            this.f93791c.getLogger().b(b7.ERROR, "Error getting side loaded info.", th4);
        }
    }

    private void s(r6 r6Var, io.sentry.j0 j0Var) {
        if (r6Var.u0() != null) {
            boolean zI = io.sentry.util.m.i(j0Var);
            for (io.sentry.protocol.b0 b0Var : r6Var.u0()) {
                boolean zG = io.sentry.android.core.internal.util.h.e().g(b0Var);
                if (b0Var.o() == null) {
                    b0Var.r(Boolean.valueOf(zG));
                }
                if (!zI && b0Var.p() == null) {
                    b0Var.v(Boolean.valueOf(zG));
                }
            }
        }
    }

    private boolean t(i5 i5Var, io.sentry.j0 j0Var) {
        if (io.sentry.util.m.q(j0Var)) {
            return true;
        }
        this.f93791c.getLogger().c(b7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i5Var.G());
        return false;
    }

    @Override // io.sentry.e0
    public r7 b(r7 r7Var, io.sentry.j0 j0Var) {
        boolean zT = t(r7Var, j0Var);
        if (zT) {
            g(r7Var, j0Var);
        }
        j(r7Var, false, zT);
        return r7Var;
    }

    @Override // io.sentry.e0
    public d7 h(d7 d7Var) {
        l(d7Var);
        o(d7Var);
        return d7Var;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, io.sentry.j0 j0Var) {
        boolean zT = t(r6Var, j0Var);
        if (zT) {
            g(r6Var, j0Var);
            s(r6Var, j0Var);
        }
        j(r6Var, true, zT);
        d(r6Var);
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, io.sentry.j0 j0Var) {
        boolean zT = t(c0Var, j0Var);
        if (zT) {
            g(c0Var, j0Var);
        }
        j(c0Var, false, zT);
        return c0Var;
    }
}
