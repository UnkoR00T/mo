package ft;

import st.d2;
import st.f2;
import st.p2;
import st.t0;
import st.t1;
import st.w0;
import st.x0;
import vr.i0;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends g<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f66974b = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final g<?> a(t0 t0Var) {
            if (x0.a(t0Var)) {
                return null;
            }
            t0 type = t0Var;
            int i15 = 0;
            while (sr.j.d0(type)) {
                type = ((d2) pq.v.P0(type.R0())).getType();
                i15++;
            }
            vr.h hVarC = type.T0().c();
            if (hVarC instanceof vr.e) {
                zs.b bVarN = ht.e.n(hVarC);
                return bVarN == null ? new t(new b.a(t0Var)) : new t(bVarN, i15);
            }
            if (hVarC instanceof m1) {
                return new t(zs.b.f236634d.c(sr.p.a.f183631b.m()), 0);
            }
            return null;
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final t0 f66975a;

            public a(t0 t0Var) {
                super(null);
                this.f66975a = t0Var;
            }

            public final t0 a() {
                return this.f66975a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && fr.t.c(this.f66975a, ((a) obj).f66975a);
            }

            public int hashCode() {
                return this.f66975a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f66975a + ')';
            }
        }

        /* JADX INFO: renamed from: ft.t$b$b, reason: collision with other inner class name */
        public static final class C1499b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final f f66976a;

            public C1499b(f fVar) {
                super(null);
                this.f66976a = fVar;
            }

            public final int a() {
                return this.f66976a.c();
            }

            public final zs.b b() {
                return this.f66976a.d();
            }

            public final f c() {
                return this.f66976a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1499b) && fr.t.c(this.f66976a, ((C1499b) obj).f66976a);
            }

            public int hashCode() {
                return this.f66976a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f66976a + ')';
            }
        }

        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    public t(b bVar) {
        super(bVar);
    }

    @Override // ft.g
    public t0 a(i0 i0Var) {
        return w0.h(t1.f184126b.k(), i0Var.i().F(), pq.v.e(new f2(c(i0Var))));
    }

    public final t0 c(i0 i0Var) {
        b bVarB = b();
        if (bVarB instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVarB instanceof b.C1499b)) {
            throw new oq.p();
        }
        f fVarC = ((b.C1499b) b()).c();
        zs.b bVarA = fVarC.a();
        int iB = fVarC.b();
        vr.e eVarB = vr.y.b(i0Var, bVarA);
        if (eVarB == null) {
            return ut.l.d(ut.k.f201300h, bVarA.toString(), String.valueOf(iB));
        }
        t0 t0VarD = xt.d.D(eVarB.t());
        for (int i15 = 0; i15 < iB; i15++) {
            t0VarD = i0Var.i().m(p2.INVARIANT, t0VarD);
        }
        return t0VarD;
    }

    public t(f fVar) {
        this(new b.C1499b(fVar));
    }

    public t(zs.b bVar, int i15) {
        this(new f(bVar, i15));
    }
}
