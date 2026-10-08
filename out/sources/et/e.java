package et;

import java.util.ArrayList;
import java.util.List;
import oq.r;
import pq.n;
import pq.v;
import rt.f;
import st.a0;
import st.d2;
import st.f2;
import st.g2;
import st.o0;
import st.p2;
import st.t0;
import st.z0;
import vr.h;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    public static final class a extends a0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f53377d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g2 g2Var, boolean z15) {
            super(g2Var);
            this.f53377d = z15;
        }

        @Override // st.g2
        public boolean b() {
            return this.f53377d;
        }

        @Override // st.a0, st.g2
        public d2 e(t0 t0Var) {
            d2 d2VarE = super.e(t0Var);
            if (d2VarE == null) {
                return null;
            }
            h hVarC = t0Var.T0().c();
            return e.c(d2VarE, hVarC instanceof m1 ? (m1) hVarC : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d2 c(d2 d2Var, m1 m1Var) {
        if (m1Var == null || d2Var.c() == p2.INVARIANT) {
            return d2Var;
        }
        if (m1Var.q() == d2Var.c()) {
            return d2Var.b() ? new f2(new z0(f.f175955e, new d(d2Var))) : new f2(d2Var.getType());
        }
        return new f2(e(d2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 d(d2 d2Var) {
        return d2Var.getType();
    }

    public static final t0 e(d2 d2Var) {
        return new et.a(d2Var, null, false, null, 14, null);
    }

    public static final boolean f(t0 t0Var) {
        return t0Var.T0() instanceof b;
    }

    public static final g2 g(g2 g2Var, boolean z15) {
        if (!(g2Var instanceof o0)) {
            return new a(g2Var, z15);
        }
        o0 o0Var = (o0) g2Var;
        m1[] m1VarArrJ = o0Var.j();
        List<r> listF1 = n.F1(o0Var.i(), o0Var.j());
        ArrayList arrayList = new ArrayList(v.y(listF1, 10));
        for (r rVar : listF1) {
            arrayList.add(c((d2) rVar.c(), (m1) rVar.d()));
        }
        return new o0(m1VarArrJ, (d2[]) arrayList.toArray(new d2[0]), z15);
    }

    public static /* synthetic */ g2 h(g2 g2Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return g(g2Var, z15);
    }
}
