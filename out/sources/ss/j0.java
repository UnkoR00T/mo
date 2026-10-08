package ss;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import rs.t1;
import st.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {
    public static final <T> T a(t<T> tVar, T t15, boolean z15) {
        return z15 ? tVar.b(t15) : t15;
    }

    public static final <T> T b(j2 j2Var, wt.i iVar, t<T> tVar, i0 i0Var) {
        wt.p pVarN = j2Var.n(iVar);
        if (!j2Var.O(pVarN)) {
            return null;
        }
        sr.m mVarU = j2Var.u(pVarN);
        if (mVarU != null) {
            return (T) a(tVar, tVar.d(mVarU), j2Var.q(iVar) || t1.c(j2Var, iVar));
        }
        sr.m mVarJ0 = j2Var.J0(pVarN);
        if (mVarJ0 != null) {
            return tVar.a('[' + jt.e.g(mVarJ0).j());
        }
        if (j2Var.T(pVarN)) {
            zs.d dVarC = j2Var.C(pVarN);
            zs.b bVarN = dVarC != null ? ur.c.f200031a.n(dVarC) : null;
            if (bVarN != null) {
                if (!i0Var.a()) {
                    List<ur.c.a> listI = ur.c.f200031a.i();
                    if (!(listI instanceof Collection) || !listI.isEmpty()) {
                        Iterator<T> it = listI.iterator();
                        while (it.hasNext()) {
                            if (fr.t.c(((ur.c.a) it.next()).d(), bVarN)) {
                                return null;
                            }
                        }
                    }
                }
                return tVar.e(jt.d.h(bVarN));
            }
        }
        return null;
    }
}
