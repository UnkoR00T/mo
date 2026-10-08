package st;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 {
    public static final a a(t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof a) {
            return (a) o2VarW0;
        }
        return null;
    }

    public static final e1 b(t0 t0Var) {
        a aVarA = a(t0Var);
        if (aVarA != null) {
            return aVarA.f1();
        }
        return null;
    }

    public static final boolean c(t0 t0Var) {
        return t0Var.W0() instanceof z;
    }

    private static final s0 d(s0 s0Var) {
        t0 t0Var;
        Collection<t0> collectionQ = s0Var.q();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionQ, 10));
        Iterator<T> it = collectionQ.iterator();
        boolean z15 = false;
        while (true) {
            t0Var = null;
            if (!it.hasNext()) {
                break;
            }
            t0 t0VarF = (t0) it.next();
            if (l2.l(t0VarF)) {
                t0VarF = f(t0VarF.W0(), false, 1, null);
                z15 = true;
            }
            arrayList.add(t0VarF);
        }
        if (!z15) {
            return null;
        }
        t0 t0VarL = s0Var.l();
        if (t0VarL != null) {
            if (l2.l(t0VarL)) {
                t0VarL = f(t0VarL.W0(), false, 1, null);
            }
            t0Var = t0VarL;
        }
        return new s0(arrayList).s(t0Var);
    }

    public static final o2 e(o2 o2Var, boolean z15) {
        z zVarC = z.a.c(z.f184174d, o2Var, z15, false, 4, null);
        if (zVarC != null) {
            return zVarC;
        }
        e1 e1VarG = g(o2Var);
        return e1VarG != null ? e1VarG : o2Var.X0(false);
    }

    public static /* synthetic */ o2 f(o2 o2Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return e(o2Var, z15);
    }

    private static final e1 g(t0 t0Var) {
        s0 s0VarD;
        x1 x1VarT0 = t0Var.T0();
        s0 s0Var = x1VarT0 instanceof s0 ? (s0) x1VarT0 : null;
        if (s0Var == null || (s0VarD = d(s0Var)) == null) {
            return null;
        }
        return s0VarD.j();
    }

    public static final e1 h(e1 e1Var, boolean z15) {
        z zVarC = z.a.c(z.f184174d, e1Var, z15, false, 4, null);
        if (zVarC != null) {
            return zVarC;
        }
        e1 e1VarG = g(e1Var);
        return e1VarG == null ? e1Var.X0(false) : e1VarG;
    }

    public static /* synthetic */ e1 i(e1 e1Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return h(e1Var, z15);
    }

    public static final e1 j(e1 e1Var, e1 e1Var2) {
        return x0.a(e1Var) ? e1Var : new a(e1Var, e1Var2);
    }

    public static final tt.i k(tt.i iVar) {
        return new tt.i(iVar.c1(), iVar.T0(), iVar.e1(), iVar.S0(), iVar.U0(), true);
    }
}
