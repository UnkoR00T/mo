package io.sentry.util;

import io.sentry.a1;
import io.sentry.b9;
import io.sentry.c1;
import io.sentry.f4;
import io.sentry.h4;
import io.sentry.h9;
import io.sentry.j1;
import io.sentry.n8;
import io.sentry.p2;
import io.sentry.q7;
import io.sentry.y3;
import io.sentry.y7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y3 f95804a;

        private b() {
            this.f95804a = null;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y7 f95805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.e f95806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h9 f95807c;

        public c(y7 y7Var, io.sentry.e eVar, h9 h9Var) {
            this.f95805a = y7Var;
            this.f95806b = eVar;
            this.f95807c = h9Var;
        }

        public io.sentry.e a() {
            return this.f95806b;
        }

        public y7 b() {
            return this.f95805a;
        }

        public h9 c() {
            return this.f95807c;
        }
    }

    public static /* synthetic */ void c(a1 a1Var, q7 q7Var, y3 y3Var) {
        io.sentry.d dVarA = y3Var.a();
        if (dVarA.v()) {
            dVarA.M(a1Var, q7Var);
            dVarA.d();
        }
    }

    public static io.sentry.d e(io.sentry.d dVar, b9 b9Var) {
        return f(dVar, b9Var == null ? null : b9Var.e(), b9Var == null ? null : b9Var.d(), b9Var != null ? b9Var.c() : null);
    }

    public static io.sentry.d f(io.sentry.d dVar, Boolean bool, Double d15, Double d16) {
        if (dVar == null) {
            dVar = new io.sentry.d(p2.e());
        }
        if (dVar.m() == null) {
            Double dN = dVar.n();
            if (dN != null) {
                d15 = dN;
            }
            dVar.G(a0.b(d16, d15, bool));
        }
        if (dVar.v() && dVar.w()) {
            dVar.d();
        }
        return dVar;
    }

    public static boolean g(List<io.sentry.h0> list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Iterator<io.sentry.h0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<io.sentry.h0> it4 = list.iterator();
            while (it4.hasNext()) {
                try {
                    if (it4.next().b(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static y3 h(final a1 a1Var, final q7 q7Var) {
        return a1Var.R(new f4.a() { // from class: io.sentry.util.f0
            @Override // io.sentry.f4.a
            public final void a(y3 y3Var) {
                i0.c(a1Var, q7Var, y3Var);
            }
        });
    }

    private static boolean i(String str, q7 q7Var) {
        return y.a(q7Var.getTracePropagationTargets(), str);
    }

    public static void j(c1 c1Var) {
        c1Var.J(new h4() { // from class: io.sentry.util.g0
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                a1Var.R(new f4.a() { // from class: io.sentry.util.h0
                    @Override // io.sentry.f4.a
                    public final void a(y3 y3Var) {
                        a1Var.V(new y3());
                    }
                });
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.sentry.util.i0$a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static c k(c1 c1Var, List<String> list, j1 j1Var) {
        final q7 q7VarS = c1Var.s();
        h9 h9Var = 0;
        h9 h9Var2 = null;
        if (j1Var != null && !j1Var.G()) {
            y7 y7VarC = j1Var.c();
            io.sentry.e eVarP = j1Var.p(list);
            if (q7VarS.isPropagateTraceparent()) {
                n8 n8VarW = j1Var.w();
                h9Var2 = new h9(n8VarW.n(), n8VarW.k(), y7VarC.c());
            }
            return new c(y7VarC, eVarP, h9Var2);
        }
        final b bVar = new b();
        c1Var.J(new h4() { // from class: io.sentry.util.e0
            @Override // io.sentry.h4
            public final void a(a1 a1Var) {
                bVar.f95804a = i0.h(a1Var, q7VarS);
            }
        });
        if (bVar.f95804a == null) {
            return null;
        }
        y3 y3Var = bVar.f95804a;
        return new c(new y7(y3Var.e(), y3Var.d(), y3Var.f()), io.sentry.e.a(y3Var.a(), list), q7VarS.isPropagateTraceparent() ? new h9(y3Var.e(), y3Var.d(), y3Var.f()) : 0);
    }

    public static c l(c1 c1Var, String str, List<String> list, j1 j1Var) {
        q7 q7VarS = c1Var.s();
        if (q7VarS.isTraceSampling() && i(str, q7VarS)) {
            return k(c1Var, list, j1Var);
        }
        return null;
    }
}
