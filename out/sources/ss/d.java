package ss;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ot.o0;
import st.t0;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<A, C> extends e<A, g<? extends A, ? extends C>> implements ot.e<A, C> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.g<x, g<A, C>> f183827c;

    public static final class a implements x.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<A, C> f183828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap<a0, List<A>> f183829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f183830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap<a0, C> f183831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap<a0, C> f183832e;

        /* JADX INFO: renamed from: ss.d$a$a, reason: collision with other inner class name */
        public final class C4735a extends b implements x.e {
            public C4735a(a0 a0Var) {
                super(a0Var);
            }

            @Override // ss.x.e
            public x.a c(int i15, zs.b bVar, h1 h1Var) {
                a0 a0VarE = a0.f183823b.e(d(), i15);
                List<A> arrayList = a.this.f183829b.get(a0VarE);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    a.this.f183829b.put(a0VarE, arrayList);
                }
                return a.this.f183828a.A(bVar, h1Var, arrayList);
            }
        }

        public class b implements x.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a0 f183834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayList<A> f183835b = new ArrayList<>();

            public b(a0 a0Var) {
                this.f183834a = a0Var;
            }

            @Override // ss.x.c
            public void a() {
                if (this.f183835b.isEmpty()) {
                    return;
                }
                a.this.f183829b.put(this.f183834a, this.f183835b);
            }

            @Override // ss.x.c
            public x.a b(zs.b bVar, h1 h1Var) {
                return a.this.f183828a.A(bVar, h1Var, this.f183835b);
            }

            protected final a0 d() {
                return this.f183834a;
            }
        }

        a(d<A, C> dVar, HashMap<a0, List<A>> map, x xVar, HashMap<a0, C> map2, HashMap<a0, C> map3) {
            this.f183828a = dVar;
            this.f183829b = map;
            this.f183830c = xVar;
            this.f183831d = map2;
            this.f183832e = map3;
        }

        @Override // ss.x.d
        public x.e a(zs.f fVar, String str) {
            return new C4735a(a0.f183823b.d(fVar.e(), str));
        }

        @Override // ss.x.d
        public x.c b(zs.f fVar, String str, Object obj) {
            C cL;
            a0 a0VarA = a0.f183823b.a(fVar.e(), str);
            if (obj != null && (cL = this.f183828a.L(str, obj)) != null) {
                this.f183832e.put(a0VarA, cL);
            }
            return new b(a0VarA);
        }
    }

    public d(rt.n nVar, v vVar) {
        super(vVar);
        this.f183827c = nVar.i(new ss.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J(g gVar, a0 a0Var) {
        return gVar.b().get(a0Var);
    }

    private final g<A, C> K(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.a(new a(this, map, xVar, map3, map2), s(xVar));
        return new g<>(map, map2, map3);
    }

    private final C M(o0 o0Var, us.o oVar, ot.d dVar, t0 t0Var, er.p<? super g<? extends A, ? extends C>, ? super a0, ? extends C> pVar) {
        C cB;
        x xVarQ = q(o0Var, e.f183838b.a(o0Var, true, true, ws.b.D.d(oVar.O0()), ys.h.f(oVar), w(), x()));
        if (xVarQ == null) {
            return null;
        }
        a0 a0VarT = t(oVar, o0Var.b(), o0Var.d(), dVar, xVarQ.d().d().d(n.f183909b.a()));
        if (a0VarT == null || (cB = pVar.B(this.f183827c.b(xVarQ), a0VarT)) == null) {
            return null;
        }
        return sr.t.d(t0Var) ? P(cB) : cB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object N(g gVar, a0 a0Var) {
        return gVar.c().get(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g O(d dVar, x xVar) {
        return dVar.K(xVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ss.e
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g<A, C> r(x xVar) {
        return this.f183827c.b(xVar);
    }

    protected final boolean I(zs.b bVar, Map<zs.f, ? extends ft.g<?>> map) {
        if (!fr.t.c(bVar, rr.a.f175535a.a())) {
            return false;
        }
        ft.g<?> gVar = map.get(zs.f.l("value"));
        ft.t tVar = gVar instanceof ft.t ? (ft.t) gVar : null;
        if (tVar == null) {
            return false;
        }
        ft.t.b bVarB = tVar.b();
        ft.t.b.C1499b c1499b = bVarB instanceof ft.t.b.C1499b ? (ft.t.b.C1499b) bVarB : null;
        if (c1499b == null) {
            return false;
        }
        return y(c1499b.b());
    }

    protected abstract C L(String str, Object obj);

    protected abstract C P(C c15);

    @Override // ot.e
    public C d(o0 o0Var, us.o oVar, t0 t0Var) {
        return M(o0Var, oVar, ot.d.PROPERTY_GETTER, t0Var, b.f183825a);
    }

    @Override // ot.e
    public C k(o0 o0Var, us.o oVar, t0 t0Var) {
        return M(o0Var, oVar, ot.d.PROPERTY, t0Var, c.f183826a);
    }
}
