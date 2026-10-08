package os;

import pq.e1;
import st.k2;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final a a(k2 k2Var, boolean z15, boolean z16, m1 m1Var) {
        return new a(k2Var, null, z16, z15, m1Var != null ? e1.d(m1Var) : null, null, 34, null);
    }

    public static /* synthetic */ a b(k2 k2Var, boolean z15, boolean z16, m1 m1Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        if ((i15 & 2) != 0) {
            z16 = false;
        }
        if ((i15 & 4) != 0) {
            m1Var = null;
        }
        return a(k2Var, z15, z16, m1Var);
    }
}
