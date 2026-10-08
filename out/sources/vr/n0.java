package vr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import st.p2;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rt.n f208060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f208061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.g<zs.c, o0> f208062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.g<a, e> f208063d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zs.b f208064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Integer> f208065b;

        public a(zs.b bVar, List<Integer> list) {
            this.f208064a = bVar;
            this.f208065b = list;
        }

        public final zs.b a() {
            return this.f208064a;
        }

        public final List<Integer> b() {
            return this.f208065b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fr.t.c(this.f208064a, aVar.f208064a) && fr.t.c(this.f208065b, aVar.f208065b);
        }

        public int hashCode() {
            return (this.f208064a.hashCode() * 31) + this.f208065b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f208064a + ", typeParametersCount=" + this.f208065b + ')';
        }
    }

    public static final class b extends yr.j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f208066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final List<m1> f208067k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final st.v f208068l;

        public b(rt.n nVar, m mVar, zs.f fVar, boolean z15, int i15) {
            super(nVar, mVar, fVar, h1.f208052a, false);
            this.f208066j = z15;
            lr.i iVarW = lr.m.w(0, i15);
            ArrayList arrayList = new ArrayList(pq.v.y(iVarW, 10));
            Iterator<Integer> it = iVarW.iterator();
            while (it.hasNext()) {
                int iNextInt = ((pq.s0) it).nextInt();
                wr.h hVarB = wr.h.f214542p0.b();
                p2 p2Var = p2.INVARIANT;
                StringBuilder sb5 = new StringBuilder();
                sb5.append('T');
                sb5.append(iNextInt);
                arrayList.add(yr.t0.X0(this, hVarB, false, p2Var, zs.f.l(sb5.toString()), iNextInt, nVar));
            }
            this.f208067k = arrayList;
            this.f208068l = new st.v(this, q1.g(this), pq.e1.d(ht.e.s(this).i().i()), nVar);
        }

        @Override // vr.i
        public boolean E() {
            return this.f208066j;
        }

        @Override // vr.e
        public d H() {
            return null;
        }

        @Override // vr.e
        public boolean O0() {
            return false;
        }

        @Override // vr.e
        /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
        public lt.k.b q0() {
            return lt.k.b.f120132b;
        }

        @Override // vr.h
        /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
        public st.v o() {
            return this.f208068l;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // yr.z
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public lt.k.b I0(tt.g gVar) {
            return lt.k.b.f120132b;
        }

        @Override // vr.e
        public r1<st.e1> Y() {
            return null;
        }

        @Override // vr.e0
        public boolean b0() {
            return false;
        }

        @Override // yr.j, vr.e0
        public boolean d0() {
            return false;
        }

        @Override // vr.e
        public boolean e0() {
            return false;
        }

        @Override // wr.a
        public wr.h getAnnotations() {
            return wr.h.f214542p0.b();
        }

        @Override // vr.e, vr.e0, vr.q
        public u h() {
            return t.f208080e;
        }

        @Override // vr.e
        public boolean j0() {
            return false;
        }

        @Override // vr.e
        public f k() {
            return f.CLASS;
        }

        @Override // vr.e
        public boolean n() {
            return false;
        }

        @Override // vr.e0
        public boolean o0() {
            return false;
        }

        @Override // vr.e
        public Collection<d> p() {
            return pq.e1.e();
        }

        @Override // vr.e
        public e r0() {
            return null;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // vr.e, vr.i
        public List<m1> v() {
            return this.f208067k;
        }

        @Override // vr.e, vr.e0
        public f0 w() {
            return f0.FINAL;
        }

        @Override // vr.e
        public boolean x() {
            return false;
        }
    }

    public n0(rt.n nVar, i0 i0Var) {
        this.f208060a = nVar;
        this.f208061b = i0Var;
        this.f208062c = nVar.i(new l0(this));
        this.f208063d = nVar.i(new m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e c(n0 n0Var, a aVar) {
        o0 o0VarB;
        zs.b bVarA = aVar.a();
        List<Integer> listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        zs.b bVarE = bVarA.e();
        if (bVarE == null || (o0VarB = n0Var.d(bVarE, pq.v.f0(listB, 1))) == null) {
            o0VarB = n0Var.f208062c.b(bVarA.f());
        }
        m mVar = o0VarB;
        boolean zJ = bVarA.j();
        rt.n nVar = n0Var.f208060a;
        zs.f fVarH = bVarA.h();
        Integer num = (Integer) pq.v.n0(listB);
        return new b(nVar, mVar, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 e(n0 n0Var, zs.c cVar) {
        return new yr.p(n0Var.f208061b, cVar);
    }

    public final e d(zs.b bVar, List<Integer> list) {
        return this.f208063d.b(new a(bVar, list));
    }
}
