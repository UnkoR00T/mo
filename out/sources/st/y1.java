package st;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y1 extends g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f184171c = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: st.y1$a$a, reason: collision with other inner class name */
        public static final class C4747a extends y1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<x1, d2> f184172d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f184173e;

            /* JADX WARN: Multi-variable type inference failed */
            C4747a(Map<x1, ? extends d2> map, boolean z15) {
                this.f184172d = map;
                this.f184173e = z15;
            }

            @Override // st.g2
            public boolean a() {
                return this.f184173e;
            }

            @Override // st.g2
            public boolean f() {
                return this.f184172d.isEmpty();
            }

            @Override // st.y1
            public d2 k(x1 x1Var) {
                return this.f184172d.get(x1Var);
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public static /* synthetic */ y1 e(a aVar, Map map, boolean z15, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                z15 = false;
            }
            return aVar.d(map, z15);
        }

        public final g2 a(t0 t0Var) {
            return b(t0Var.T0(), t0Var.R0());
        }

        public final g2 b(x1 x1Var, List<? extends d2> list) {
            List<vr.m1> parameters = x1Var.getParameters();
            vr.m1 m1Var = (vr.m1) pq.v.z0(parameters);
            if (m1Var == null || !m1Var.T()) {
                return new o0(parameters, list);
            }
            List<vr.m1> parameters2 = x1Var.getParameters();
            ArrayList arrayList = new ArrayList(pq.v.y(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((vr.m1) it.next()).o());
            }
            return e(this, pq.v0.s(pq.v.p1(arrayList, list)), false, 2, null);
        }

        public final y1 c(Map<x1, ? extends d2> map) {
            return e(this, map, false, 2, null);
        }

        public final y1 d(Map<x1, ? extends d2> map, boolean z15) {
            return new C4747a(map, z15);
        }

        private a() {
        }
    }

    public static final g2 i(x1 x1Var, List<? extends d2> list) {
        return f184171c.b(x1Var, list);
    }

    public static final y1 j(Map<x1, ? extends d2> map) {
        return f184171c.c(map);
    }

    @Override // st.g2
    public d2 e(t0 t0Var) {
        return k(t0Var.T0());
    }

    public abstract d2 k(x1 x1Var);
}
