package ft;

import java.util.List;
import st.t0;
import vr.i0;

/* JADX INFO: loaded from: classes4.dex */
public class b extends g<List<? extends g<?>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final er.l<i0, t0> f66951b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, er.l<? super i0, ? extends t0> lVar) {
        super(list);
        this.f66951b = lVar;
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        t0 t0VarB = this.f66951b.b(i0Var);
        if (!sr.j.d0(t0VarB) && !sr.j.r0(t0VarB)) {
            sr.j.E0(t0VarB);
        }
        return t0VarB;
    }
}
