package st;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final t0 a(t0 t0Var) {
        if (t0Var instanceof m2) {
            return ((m2) t0Var).m0();
        }
        return null;
    }

    public static final o2 b(o2 o2Var, t0 t0Var) {
        return d(o2Var, a(t0Var));
    }

    public static final o2 c(o2 o2Var, t0 t0Var, er.l<? super t0, ? extends t0> lVar) {
        t0 t0VarA = a(t0Var);
        return d(o2Var, t0VarA != null ? lVar.b(t0VarA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o2 d(o2 o2Var, t0 t0Var) {
        if (o2Var instanceof m2) {
            return d(((m2) o2Var).K0(), t0Var);
        }
        if (t0Var == null || fr.t.c(t0Var, o2Var)) {
            return o2Var;
        }
        if (o2Var instanceof e1) {
            return new h1((e1) o2Var, t0Var);
        }
        if (o2Var instanceof k0) {
            return new m0((k0) o2Var, t0Var);
        }
        throw new oq.p();
    }
}
