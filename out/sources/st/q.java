package st;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rt.i<b> f184110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f184111c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final tt.g f184112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final oq.k f184113b;

        public a(tt.g gVar) {
            this.f184112a = gVar;
            this.f184113b = oq.l.b(oq.o.PUBLICATION, new p(this, q.this));
        }

        private final List<t0> f() {
            return (List) this.f184113b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List h(a aVar, q qVar) {
            return tt.h.b(aVar.f184112a, qVar.q());
        }

        @Override // st.x1
        public x1 a(tt.g gVar) {
            return q.this.a(gVar);
        }

        @Override // st.x1
        public vr.h c() {
            return q.this.c();
        }

        @Override // st.x1
        public boolean d() {
            return q.this.d();
        }

        public boolean equals(Object obj) {
            return q.this.equals(obj);
        }

        @Override // st.x1
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<t0> q() {
            return f();
        }

        @Override // st.x1
        public List<vr.m1> getParameters() {
            return q.this.getParameters();
        }

        public int hashCode() {
            return q.this.hashCode();
        }

        @Override // st.x1
        public sr.j i() {
            return q.this.i();
        }

        public String toString() {
            return q.this.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<t0> f184115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<? extends t0> f184116b = pq.v.e(ut.l.f201331a.l());

        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends t0> collection) {
            this.f184115a = collection;
        }

        public final Collection<t0> a() {
            return this.f184115a;
        }

        public final List<t0> b() {
            return this.f184116b;
        }

        public final void c(List<? extends t0> list) {
            this.f184116b = list;
        }
    }

    public q(rt.n nVar) {
        this.f184110b = nVar.h(new i(this), j.f184058a, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(q qVar) {
        return new b(qVar.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b C(boolean z15) {
        return new b(pq.v.e(ut.l.f201331a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(q qVar, b bVar) {
        List listA = qVar.w().a(qVar, bVar.a(), new l(qVar), new m(qVar));
        if (listA.isEmpty()) {
            t0 t0VarS = qVar.s();
            List listE = t0VarS != null ? pq.v.e(t0VarS) : null;
            if (listE == null) {
                listE = pq.v.n();
            }
            listA = listE;
        }
        if (qVar.u()) {
            qVar.w().a(qVar, listA, new n(qVar), new o(qVar));
        }
        List<t0> listF1 = listA instanceof List ? (List) listA : null;
        if (listF1 == null) {
            listF1 = pq.v.f1(listA);
        }
        bVar.c(qVar.y(listF1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable E(q qVar, x1 x1Var) {
        return qVar.p(x1Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(q qVar, t0 t0Var) {
        qVar.A(t0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable G(q qVar, x1 x1Var) {
        return qVar.p(x1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(q qVar, t0 t0Var) {
        qVar.z(t0Var);
        return oq.i0.f148189a;
    }

    private final Collection<t0> p(x1 x1Var, boolean z15) {
        List listL0;
        q qVar = x1Var instanceof q ? (q) x1Var : null;
        return (qVar == null || (listL0 = pq.v.L0(qVar.f184110b.a().a(), qVar.t(z15))) == null) ? x1Var.q() : listL0;
    }

    protected void A(t0 t0Var) {
    }

    @Override // st.x1
    public x1 a(tt.g gVar) {
        return new a(gVar);
    }

    protected abstract Collection<t0> r();

    protected abstract t0 s();

    protected Collection<t0> t(boolean z15) {
        return pq.v.n();
    }

    protected boolean u() {
        return this.f184111c;
    }

    protected abstract vr.k1 w();

    @Override // st.x1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<t0> q() {
        return this.f184110b.a().b();
    }

    protected List<t0> y(List<t0> list) {
        return list;
    }

    protected void z(t0 t0Var) {
    }
}
