package ss;

import st.e1;
import st.t0;
import st.w0;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ot.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f183918a = new p();

    private p() {
    }

    @Override // ot.x
    public t0 a(us.r rVar, String str, e1 e1Var, e1 e1Var2) {
        if (fr.t.c(str, "kotlin.jvm.PlatformType")) {
            return rVar.B(xs.a.f220669g) ? new os.k(e1Var, e1Var2) : w0.e(e1Var, e1Var2);
        }
        return ut.l.d(ut.k.O, str, e1Var.toString(), e1Var2.toString());
    }
}
