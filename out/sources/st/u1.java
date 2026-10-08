package st;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 {
    public static final t1 a(t1 t1Var, wr.h hVar) {
        t1 t1VarS;
        if (u.a(t1Var) == hVar) {
            return t1Var;
        }
        t tVarB = u.b(t1Var);
        if (tVarB != null && (t1VarS = t1Var.s(tVarB)) != null) {
            t1Var = t1VarS;
        }
        return (hVar.iterator().hasNext() || !hVar.isEmpty()) ? t1Var.q(new t(hVar)) : t1Var;
    }

    public static final t1 b(wr.h hVar) {
        return s1.a.a(y.f184168a, hVar, null, null, 6, null);
    }
}
