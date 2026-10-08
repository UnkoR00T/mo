package st;

/* JADX INFO: loaded from: classes4.dex */
public interface s1 {

    public static final class a {
        public static /* synthetic */ t1 a(s1 s1Var, wr.h hVar, x1 x1Var, vr.m mVar, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i15 & 2) != 0) {
                x1Var = null;
            }
            if ((i15 & 4) != 0) {
                mVar = null;
            }
            return s1Var.a(hVar, x1Var, mVar);
        }
    }

    t1 a(wr.h hVar, x1 x1Var, vr.m mVar);
}
