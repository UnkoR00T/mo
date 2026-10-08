package st;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e1 extends o2 implements wt.k, wt.l {
    public e1() {
        super(null);
    }

    /* JADX INFO: renamed from: a1 */
    public abstract e1 X0(boolean z15);

    /* JADX INFO: renamed from: b1 */
    public abstract e1 Z0(t1 t1Var);

    public String toString() throws IOException {
        StringBuilder sb5 = new StringBuilder();
        Iterator<wr.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            fu.r.q(sb5, "[", ct.n.O(ct.n.f37669k, it.next(), null, 2, null), "] ");
        }
        sb5.append(T0());
        if (!R0().isEmpty()) {
            pq.g0.s0(R0(), sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (U0()) {
            sb5.append("?");
        }
        return sb5.toString();
    }
}
