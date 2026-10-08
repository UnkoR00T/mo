package qt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ot.x0;
import vr.h1;
import vr.k1;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends yr.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ot.p f168389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final us.t f168390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f168391n;

    public r0(ot.p pVar, us.t tVar, int i15) {
        super(pVar.h(), pVar.e(), wr.h.f214542p0.b(), ot.m0.b(pVar.g(), tVar.T()), ot.p0.f149838a.d(tVar.a0()), tVar.U(), i15, h1.f208052a, k1.a.f208057a);
        this.f168389l = pVar;
        this.f168390m = tVar;
        this.f168391n = new a(pVar.h(), new q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(r0 r0Var) {
        return pq.v.f1(r0Var.f168389l.c().d().f(r0Var.f168390m, r0Var.f168389l.g()));
    }

    @Override // yr.h
    protected List<st.t0> R0() {
        List<us.r> listT = ws.g.t(this.f168390m, this.f168389l.j());
        if (listT.isEmpty()) {
            return pq.v.e(ht.e.m(this).z());
        }
        List<us.r> list = listT;
        x0 x0VarI = this.f168389l.i();
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(x0VarI.u((us.r) it.next()));
        }
        return arrayList;
    }

    @Override // wr.b, wr.a
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public a getAnnotations() {
        return this.f168391n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.h
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public Void Q0(st.t0 t0Var) {
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
