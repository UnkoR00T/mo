package sr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pq.v;
import st.d2;
import st.e1;
import st.p2;
import st.t1;
import st.w0;
import vr.f0;
import vr.h1;
import yr.g0;
import yr.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f183681a;

    static {
        yr.p pVar = new yr.p(ut.l.f201331a.i(), p.f183621s);
        vr.f fVar = vr.f.INTERFACE;
        zs.f fVarF = p.f183625w.f();
        h1 h1Var = h1.f208052a;
        rt.n nVar = rt.f.f175955e;
        g0 g0Var = new g0(pVar, fVar, false, false, fVarF, h1Var, nVar);
        g0Var.S0(f0.ABSTRACT);
        g0Var.U0(vr.t.f208080e);
        g0Var.T0(v.e(t0.X0(g0Var, wr.h.f214542p0.b(), false, p2.IN_VARIANCE, zs.f.l("T"), 0, nVar)));
        g0Var.Q0();
        f183681a = g0Var;
    }

    public static final e1 a(st.t0 t0Var) {
        i.s(t0Var);
        j jVarN = xt.d.n(t0Var);
        wr.h annotations = t0Var.getAnnotations();
        st.t0 t0VarK = i.k(t0Var);
        List<st.t0> listE = i.e(t0Var);
        List<d2> listM = i.m(t0Var);
        ArrayList arrayList = new ArrayList(v.y(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((d2) it.next()).getType());
        }
        return i.b(jVarN, annotations, t0VarK, listE, v.M0(arrayList, w0.k(t1.f184126b.k(), f183681a.o(), v.e(xt.d.d(i.l(t0Var))), false, null, 16, null)), null, xt.d.n(t0Var).J(), (128 & 128) != 0 ? false : false).X0(t0Var.U0());
    }
}
