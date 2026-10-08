package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f184143a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final er.l<tt.g, e1> f184144b = a.f184145a;

    static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f184145a = new a();

        a() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(tt.g gVar) {
            return null;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e1 f184146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x1 f184147b;

        public b(e1 e1Var, x1 x1Var) {
            this.f184146a = e1Var;
            this.f184147b = x1Var;
        }

        public final e1 a() {
            return this.f184146a;
        }

        public final x1 b() {
            return this.f184147b;
        }
    }

    private w0() {
    }

    public static final e1 c(vr.l1 l1Var, List<? extends d2> list) {
        return new o1(q1.a.f184118a, false).i(p1.f184096e.a(null, l1Var, list), t1.f184126b.k());
    }

    private final lt.k d(x1 x1Var, List<? extends d2> list, tt.g gVar) {
        vr.h hVarC = x1Var.c();
        if (hVarC instanceof vr.m1) {
            return ((vr.m1) hVarC).t().r();
        }
        if (hVarC instanceof vr.e) {
            if (gVar == null) {
                gVar = ht.e.r(ht.e.s(hVarC));
            }
            return list.isEmpty() ? yr.a0.b((vr.e) hVarC, gVar) : yr.a0.a((vr.e) hVarC, y1.f184171c.b(x1Var, list), gVar);
        }
        if (hVarC instanceof vr.l1) {
            return ut.l.a(ut.h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((vr.l1) hVarC).getName().toString());
        }
        if (x1Var instanceof s0) {
            return ((s0) x1Var).h();
        }
        throw new IllegalStateException("Unsupported classifier: " + hVarC + " for constructor: " + x1Var);
    }

    public static final o2 e(e1 e1Var, e1 e1Var2) {
        return fr.t.c(e1Var, e1Var2) ? e1Var : new l0(e1Var, e1Var2);
    }

    public static final e1 f(t1 t1Var, ft.q qVar, boolean z15) {
        return m(t1Var, qVar, pq.v.n(), z15, ut.l.a(ut.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    private final b g(x1 x1Var, tt.g gVar, List<? extends d2> list) {
        vr.h hVarF;
        vr.h hVarC = x1Var.c();
        if (hVarC == null || (hVarF = gVar.f(hVarC)) == null) {
            return null;
        }
        return hVarF instanceof vr.l1 ? new b(c((vr.l1) hVarF, list), null) : new b(null, hVarF.o().a(gVar));
    }

    public static final e1 h(t1 t1Var, vr.e eVar, List<? extends d2> list) {
        return k(t1Var, eVar.o(), list, false, null, 16, null);
    }

    public static final e1 i(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15) {
        return k(t1Var, x1Var, list, z15, null, 16, null);
    }

    public static final e1 j(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15, tt.g gVar) {
        return (!t1Var.isEmpty() || !list.isEmpty() || z15 || x1Var.c() == null) ? n(t1Var, x1Var, list, z15, f184143a.d(x1Var, list, gVar), new u0(x1Var, list, t1Var, z15)) : x1Var.c().t();
    }

    public static /* synthetic */ e1 k(t1 t1Var, x1 x1Var, List list, boolean z15, tt.g gVar, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            gVar = null;
        }
        return j(t1Var, x1Var, list, z15, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 l(x1 x1Var, List list, t1 t1Var, boolean z15, tt.g gVar) {
        b bVarG = f184143a.g(x1Var, gVar, list);
        if (bVarG == null) {
            return null;
        }
        e1 e1VarA = bVarG.a();
        return e1VarA != null ? e1VarA : j(t1Var, bVarG.b(), list, z15, gVar);
    }

    public static final e1 m(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15, lt.k kVar) {
        f1 f1Var = new f1(x1Var, list, z15, kVar, new v0(x1Var, list, t1Var, z15, kVar));
        return t1Var.isEmpty() ? f1Var : new g1(f1Var, t1Var);
    }

    public static final e1 n(t1 t1Var, x1 x1Var, List<? extends d2> list, boolean z15, lt.k kVar, er.l<? super tt.g, ? extends e1> lVar) {
        f1 f1Var = new f1(x1Var, list, z15, kVar, lVar);
        return t1Var.isEmpty() ? f1Var : new g1(f1Var, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 o(x1 x1Var, List list, t1 t1Var, boolean z15, lt.k kVar, tt.g gVar) {
        b bVarG = f184143a.g(x1Var, gVar, list);
        if (bVarG == null) {
            return null;
        }
        e1 e1VarA = bVarG.a();
        return e1VarA != null ? e1VarA : m(t1Var, bVarG.b(), list, z15, kVar);
    }
}
