package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 implements e0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x7 f94901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s6 f94902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile m0 f94903d = null;

    public f2(q7 q7Var) {
        q7 q7Var2 = (q7) io.sentry.util.v.c(q7Var, "The SentryOptions is required.");
        this.f94900a = q7Var2;
        w7 w7Var = new w7(q7Var2);
        this.f94902c = new s6(w7Var);
        this.f94901b = new x7(w7Var, q7Var2);
    }

    private void C(i5 i5Var) {
        N(i5Var);
        J(i5Var);
        V(i5Var);
        I(i5Var);
        O(i5Var);
        Z(i5Var);
        y(i5Var);
    }

    private void E(i5 i5Var) {
        M(i5Var);
    }

    private void H(i5 i5Var) {
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(i5Var.D(), this.f94900a);
        if (dVarC != null) {
            i5Var.T(dVarC);
        }
    }

    private void I(i5 i5Var) {
        if (i5Var.E() == null) {
            i5Var.U(this.f94900a.getDist());
        }
    }

    private void J(i5 i5Var) {
        if (i5Var.F() == null) {
            i5Var.V(this.f94900a.getEnvironment());
        }
    }

    private void K(r6 r6Var) {
        Throwable thP = r6Var.P();
        if (thP != null) {
            r6Var.A0(this.f94902c.d(thP));
        }
    }

    private void L(r6 r6Var) {
        Map<String, String> mapA = this.f94900a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map<String, String> mapT0 = r6Var.t0();
        if (mapT0 == null) {
            r6Var.E0(mapA);
        } else {
            mapT0.putAll(mapA);
        }
    }

    private void M(i5 i5Var) {
        if (i5Var.I() == null) {
            i5Var.Y("java");
        }
    }

    private void N(i5 i5Var) {
        if (i5Var.J() == null) {
            i5Var.Z(this.f94900a.getRelease());
        }
    }

    private void O(i5 i5Var) {
        if (i5Var.L() == null) {
            i5Var.b0(this.f94900a.getSdkVersion());
        }
    }

    private void V(i5 i5Var) {
        if (i5Var.M() == null) {
            i5Var.c0(this.f94900a.getServerName());
        }
        if (this.f94900a.isAttachServerName() && i5Var.M() == null) {
            r();
            if (this.f94903d != null) {
                i5Var.c0(this.f94903d.d());
            }
        }
    }

    private void Z(i5 i5Var) {
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(this.f94900a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f94900a.getTags().entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void a0(r6 r6Var, j0 j0Var) {
        if (r6Var.u0() == null) {
            List<io.sentry.protocol.q> listP0 = r6Var.p0();
            ArrayList arrayList = null;
            if (listP0 != null && !listP0.isEmpty()) {
                for (io.sentry.protocol.q qVar : listP0) {
                    if (qVar.g() != null && qVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(qVar.j());
                    }
                }
            }
            if (this.f94900a.isAttachThreads() || io.sentry.util.m.h(j0Var, io.sentry.hints.a.class)) {
                Object objG = io.sentry.util.m.g(j0Var);
                r6Var.F0(this.f94901b.b(arrayList, objG instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objG).f() : false));
            } else if (this.f94900a.isAttachStacktrace()) {
                if ((listP0 == null || listP0.isEmpty()) && !u(j0Var)) {
                    r6Var.F0(this.f94901b.a());
                }
            }
        }
    }

    private boolean b0(i5 i5Var, j0 j0Var) {
        if (io.sentry.util.m.q(j0Var)) {
            return true;
        }
        this.f94900a.getLogger().c(b7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", i5Var.G());
        return false;
    }

    private void r() {
        if (this.f94903d == null) {
            this.f94903d = m0.e();
        }
    }

    private boolean u(j0 j0Var) {
        return io.sentry.util.m.h(j0Var, io.sentry.hints.e.class);
    }

    private void y(i5 i5Var) {
        io.sentry.protocol.g0 g0VarQ = i5Var.Q();
        if (g0VarQ == null) {
            g0VarQ = new io.sentry.protocol.g0();
            i5Var.f0(g0VarQ);
        }
        if (g0VarQ.j() == null && this.f94900a.isSendDefaultPii()) {
            g0VarQ.m("{{auto}}");
        }
    }

    @Override // io.sentry.e0
    public r7 b(r7 r7Var, j0 j0Var) {
        E(r7Var);
        if (b0(r7Var, j0Var)) {
            C(r7Var);
            io.sentry.protocol.p pVarI = this.f94900a.getSessionReplay().i();
            if (pVarI != null) {
                r7Var.b0(pVarI);
            }
        }
        return r7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f94903d != null) {
            this.f94903d.c();
        }
    }

    @Override // io.sentry.e0
    public d7 h(d7 d7Var) {
        return d7Var;
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, j0 j0Var) {
        E(r6Var);
        K(r6Var);
        H(r6Var);
        L(r6Var);
        if (b0(r6Var, j0Var)) {
            C(r6Var);
            a0(r6Var, j0Var);
        }
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, j0 j0Var) {
        E(c0Var);
        H(c0Var);
        if (b0(c0Var, j0Var)) {
            C(c0Var);
        }
        return c0Var;
    }
}
