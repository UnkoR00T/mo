package st;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    public static final k0 a(t0 t0Var) {
        return (k0) t0Var.W0();
    }

    public static final boolean b(t0 t0Var) {
        return t0Var.W0() instanceof k0;
    }

    public static final e1 c(t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            return ((k0) o2VarW0).b1();
        }
        if (o2VarW0 instanceof e1) {
            return (e1) o2VarW0;
        }
        throw new oq.p();
    }

    public static final e1 d(t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            return ((k0) o2VarW0).c1();
        }
        if (o2VarW0 instanceof e1) {
            return (e1) o2VarW0;
        }
        throw new oq.p();
    }
}
