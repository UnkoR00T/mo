package js;

import java.util.Map;
import vr.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f104638o = new f();

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g1 g1Var, vr.b bVar) {
        return u0.f104736a.j().containsKey(ss.c0.d(g1Var));
    }

    public final zs.f j(g1 g1Var) {
        Map<String, zs.f> mapJ = u0.f104736a.j();
        String strD = ss.c0.d(g1Var);
        if (strD == null) {
            return null;
        }
        return mapJ.get(strD);
    }

    public final boolean k(g1 g1Var) {
        return sr.j.h0(g1Var) && ht.e.i(g1Var, false, new e(g1Var), 1, null) != null;
    }

    public final boolean m(g1 g1Var) {
        return fr.t.c(g1Var.getName().e(), "removeAt") && fr.t.c(ss.c0.d(g1Var), u0.f104736a.h().d());
    }
}
