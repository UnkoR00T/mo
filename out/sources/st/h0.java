package st;

/* JADX INFO: loaded from: classes4.dex */
public class h0 {
    public static /* synthetic */ d2 b(h0 h0Var, vr.m1 m1Var, i0 i0Var, c2 c2Var, t0 t0Var, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i15 & 8) != 0) {
            t0Var = c2Var.e(m1Var, i0Var);
        }
        return h0Var.a(m1Var, i0Var, c2Var, t0Var);
    }

    public d2 a(vr.m1 m1Var, i0 i0Var, c2 c2Var, t0 t0Var) {
        return new f2(p2.OUT_VARIANCE, t0Var);
    }
}
