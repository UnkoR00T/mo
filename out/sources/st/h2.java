package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 {
    public static final e1 a(t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        e1 e1Var = o2VarW0 instanceof e1 ? (e1) o2VarW0 : null;
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + t0Var).toString());
    }

    public static final t0 b(t0 t0Var, List<? extends d2> list, wr.h hVar) {
        return e(t0Var, list, hVar, null, 4, null);
    }

    public static final t0 c(t0 t0Var, List<? extends d2> list, wr.h hVar, List<? extends d2> list2) {
        if ((list.isEmpty() || list == t0Var.R0()) && hVar == t0Var.getAnnotations()) {
            return t0Var;
        }
        t1 t1VarS0 = t0Var.S0();
        if ((hVar instanceof wr.p) && ((wr.p) hVar).isEmpty()) {
            hVar = wr.h.f214542p0.b();
        }
        t1 t1VarA = u1.a(t1VarS0, hVar);
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            k0 k0Var = (k0) o2VarW0;
            return w0.e(d(k0Var.b1(), list, t1VarA), d(k0Var.c1(), list2, t1VarA));
        }
        if (o2VarW0 instanceof e1) {
            return d((e1) o2VarW0, list, t1VarA);
        }
        throw new oq.p();
    }

    public static final e1 d(e1 e1Var, List<? extends d2> list, t1 t1Var) {
        if (list.isEmpty() && t1Var == e1Var.S0()) {
            return e1Var;
        }
        if (list.isEmpty()) {
            return e1Var.Z0(t1Var);
        }
        return e1Var instanceof ut.i ? ((ut.i) e1Var).f1(list) : w0.k(t1Var, e1Var.T0(), list, e1Var.U0(), null, 16, null);
    }

    public static /* synthetic */ t0 e(t0 t0Var, List list, wr.h hVar, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = t0Var.R0();
        }
        if ((i15 & 2) != 0) {
            hVar = t0Var.getAnnotations();
        }
        if ((i15 & 4) != 0) {
            list2 = list;
        }
        return c(t0Var, list, hVar, list2);
    }

    public static /* synthetic */ e1 f(e1 e1Var, List list, t1 t1Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = e1Var.R0();
        }
        if ((i15 & 2) != 0) {
            t1Var = e1Var.S0();
        }
        return d(e1Var, list, t1Var);
    }
}
