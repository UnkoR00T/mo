package f0;

import androidx.camera.core.o;
import o.w0;
import v.a0;
import v.c0;
import v.d0;
import v.w;
import v.y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a<o> {
    public f(int i15, c<o> cVar) {
        super(i15, cVar);
    }

    private boolean e(w0 w0Var) {
        c0 c0VarA = d0.a(w0Var);
        if (c0VarA == null) {
            return false;
        }
        return (c0VarA.j() == y.LOCKED_FOCUSED || c0VarA.j() == y.PASSIVE_FOCUSED) && c0VarA.n() == w.CONVERGED && c0VarA.k() == a0.CONVERGED;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void d(o oVar) {
        if (e(oVar.v3())) {
            super.b(oVar);
        } else {
            this.f54486d.a((T) oVar);
        }
    }
}
