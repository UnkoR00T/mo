package tt;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.d2;
import st.l2;
import st.p2;
import st.t0;
import st.x1;
import st.y1;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {
    private static final t0 a(t0 t0Var) {
        return yt.c.b(t0Var).d();
    }

    private static final String b(x1 x1Var) {
        StringBuilder sb5 = new StringBuilder();
        c("type: " + x1Var, sb5);
        c("hashCode: " + x1Var.hashCode(), sb5);
        c("javaClass: " + x1Var.getClass().getCanonicalName(), sb5);
        for (vr.m mVarC = x1Var.c(); mVarC != null; mVarC = mVarC.b()) {
            c("fqName: " + ct.n.f37666h.M(mVarC), sb5);
            c("javaClass: " + mVarC.getClass().getCanonicalName(), sb5);
        }
        return sb5.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb5) {
        sb5.append(str);
        sb5.append('\n');
        return sb5;
    }

    public static final t0 d(t0 t0Var, t0 t0Var2, z zVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new w(t0Var, null));
        x1 x1VarT0 = t0Var2.T0();
        while (!arrayDeque.isEmpty()) {
            w wVar = (w) arrayDeque.poll();
            t0 t0VarB = wVar.b();
            x1 x1VarT1 = t0VarB.T0();
            if (zVar.a(x1VarT1, x1VarT0)) {
                boolean zU0 = t0VarB.U0();
                for (w wVarA = wVar.a(); wVarA != null; wVarA = wVarA.a()) {
                    t0 t0VarB2 = wVarA.b();
                    List<d2> listR0 = t0VarB2.R0();
                    if (!(listR0 instanceof Collection) || !listR0.isEmpty()) {
                        Iterator<T> it = listR0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t0VarB = y1.f184171c.a(t0VarB2).c().o(t0VarB, p2.INVARIANT);
                                break;
                            }
                            p2 p2VarC = ((d2) it.next()).c();
                            p2 p2Var = p2.INVARIANT;
                            if (p2VarC != p2Var) {
                                t0VarB = a(et.e.h(y1.f184171c.a(t0VarB2), false, 1, null).c().o(t0VarB, p2Var));
                                break;
                            }
                        }
                    } else {
                        t0VarB = y1.f184171c.a(t0VarB2).c().o(t0VarB, p2.INVARIANT);
                        break;
                    }
                    zU0 = zU0 || t0VarB2.U0();
                }
                x1 x1VarT2 = t0VarB.T0();
                if (zVar.a(x1VarT2, x1VarT0)) {
                    return l2.p(t0VarB, zU0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(x1VarT2) + ", \n\nsupertype: " + b(x1VarT0) + " \n" + zVar.a(x1VarT2, x1VarT0));
            }
            Iterator<t0> it4 = x1VarT1.q().iterator();
            while (it4.hasNext()) {
                arrayDeque.add(new w(it4.next(), wVar));
            }
        }
        return null;
    }
}
