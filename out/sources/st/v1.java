package st;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 {
    public static final x a(t0 t0Var) {
        wr.a aVarW0 = t0Var.W0();
        x xVar = aVarW0 instanceof x ? (x) aVarW0 : null;
        if (xVar == null || !xVar.I0()) {
            return null;
        }
        return xVar;
    }

    public static final boolean b(t0 t0Var) {
        wr.a aVarW0 = t0Var.W0();
        x xVar = aVarW0 instanceof x ? (x) aVarW0 : null;
        if (xVar != null) {
            return xVar.I0();
        }
        return false;
    }
}
