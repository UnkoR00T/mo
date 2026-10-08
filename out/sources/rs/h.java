package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import st.d2;
import st.l2;
import st.n2;
import st.o2;
import st.u1;
import st.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms.e f175647a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final st.t0 f175648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f175649b;

        public a(st.t0 t0Var, int i15) {
            this.f175648a = t0Var;
            this.f175649b = i15;
        }

        public final int a() {
            return this.f175649b;
        }

        public final st.t0 b() {
            return this.f175648a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final st.e1 f175650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f175651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f175652c;

        public b(st.e1 e1Var, int i15, boolean z15) {
            this.f175650a = e1Var;
            this.f175651b = i15;
            this.f175652c = z15;
        }

        public final boolean a() {
            return this.f175652c;
        }

        public final int b() {
            return this.f175651b;
        }

        public final st.e1 c() {
            return this.f175650a;
        }
    }

    public h(ms.e eVar) {
        this.f175647a = eVar;
    }

    private final b b(st.e1 e1Var, er.l<? super Integer, i> lVar, int i15, p1 p1Var, boolean z15, boolean z16) {
        vr.h hVarC;
        x1 x1VarT0;
        Boolean bool;
        a aVar;
        d2 d2VarS;
        er.l<? super Integer, i> lVar2 = lVar;
        boolean zA = q1.a(p1Var);
        boolean z17 = (z16 && z15) ? false : true;
        st.t0 t0Var = null;
        if ((zA || !e1Var.R0().isEmpty()) && (hVarC = e1Var.T0().c()) != null) {
            i iVarB = lVar2.b(Integer.valueOf(i15));
            vr.h hVarF = s1.f(hVarC, iVarB, p1Var);
            Boolean boolH = s1.h(iVarB, p1Var);
            if (hVarF == null || (x1VarT0 = hVarF.o()) == null) {
                x1VarT0 = e1Var.T0();
            }
            x1 x1Var = x1VarT0;
            int iA = i15 + 1;
            List<d2> listR0 = e1Var.R0();
            List<vr.m1> parameters = x1Var.getParameters();
            Iterator<T> it = listR0.iterator();
            Iterator<T> it4 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(pq.v.y(listR0, 10), pq.v.y(parameters, 10)));
            while (it.hasNext() && it4.hasNext()) {
                Object next = it.next();
                vr.m1 m1Var = (vr.m1) it4.next();
                d2 d2Var = (d2) next;
                if (z17) {
                    bool = boolH;
                    if (!d2Var.b()) {
                        aVar = d(d2Var.getType().W0(), lVar2, iA, z16);
                    } else if (lVar2.b(Integer.valueOf(iA)).f() == l.FORCE_FLEXIBILITY) {
                        o2 o2VarW0 = d2Var.getType().W0();
                        aVar = new a(st.w0.e(st.n0.c(o2VarW0).X0(false), st.n0.d(o2VarW0).X0(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                } else {
                    bool = boolH;
                    aVar = new a(t0Var, 0);
                }
                iA += aVar.a();
                if (aVar.b() != null) {
                    d2VarS = xt.d.k(aVar.b(), d2Var.c(), m1Var);
                } else if (hVarF == null || d2Var.b()) {
                    d2VarS = hVarF != null ? l2.s(m1Var) : null;
                } else {
                    d2VarS = xt.d.k(d2Var.getType(), d2Var.c(), m1Var);
                }
                arrayList.add(d2VarS);
                lVar2 = lVar;
                boolH = bool;
                t0Var = null;
            }
            Boolean bool2 = boolH;
            int i16 = iA - i15;
            if (hVarF == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it5 = arrayList.iterator();
                    do {
                        if (it5.hasNext()) {
                        }
                    } while (((d2) it5.next()) == null);
                }
                return new b(null, i16, false);
            }
            wr.h annotations = e1Var.getAnnotations();
            g gVar = s1.f175718b;
            if (hVarF == null) {
                gVar = null;
            }
            st.t1 t1VarB = u1.b(s1.e(pq.v.s(annotations, gVar, bool2 != null ? s1.g() : null)));
            List<d2> listR1 = e1Var.R0();
            Iterator it6 = arrayList.iterator();
            Iterator<T> it7 = listR1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(pq.v.y(arrayList, 10), pq.v.y(listR1, 10)));
            while (it6.hasNext() && it7.hasNext()) {
                Object next2 = it6.next();
                d2 d2Var2 = (d2) it7.next();
                d2 d2Var3 = (d2) next2;
                if (d2Var3 != null) {
                    d2Var2 = d2Var3;
                }
                arrayList2.add(d2Var2);
            }
            st.e1 e1VarK = st.w0.k(t1VarB, x1Var, arrayList2, bool2 != null ? bool2.booleanValue() : e1Var.U0(), null, 16, null);
            if (iVarB.d()) {
                e1VarK = e(e1VarK);
            }
            return new b(e1VarK, i16, bool2 != null && iVarB.g());
        }
        return new b(null, 1, false);
    }

    static /* synthetic */ b c(h hVar, st.e1 e1Var, er.l lVar, int i15, p1 p1Var, boolean z15, boolean z16, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            z15 = false;
        }
        if ((i16 & 16) != 0) {
            z16 = false;
        }
        return hVar.b(e1Var, lVar, i15, p1Var, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    private final a d(o2 o2Var, er.l<? super Integer, i> lVar, int i15, boolean z15) {
        st.t0 t0VarC;
        st.t0 t0VarD = null;
        if (st.x0.a(o2Var)) {
            return new a(null, 1);
        }
        if (!(o2Var instanceof st.k0)) {
            if (!(o2Var instanceof st.e1)) {
                throw new oq.p();
            }
            b bVarC = c(this, (st.e1) o2Var, lVar, i15, p1.INFLEXIBLE, false, z15, 8, null);
            return new a(bVarC.a() ? n2.d(o2Var, bVarC.c()) : bVarC.c(), bVarC.b());
        }
        boolean z16 = o2Var instanceof st.d1;
        st.k0 k0Var = (st.k0) o2Var;
        b bVarB = b(k0Var.b1(), lVar, i15, p1.FLEXIBLE_LOWER, z16, z15);
        b bVarB2 = b(k0Var.c1(), lVar, i15, p1.FLEXIBLE_UPPER, z16, z15);
        bVarB.b();
        bVarB2.b();
        if (bVarB.c() != null || bVarB2.c() != null) {
            if (bVarB.a() || bVarB2.a()) {
                st.e1 e1VarC = bVarB2.c();
                if (e1VarC == null) {
                    t0VarC = bVarB.c();
                } else {
                    st.e1 e1VarC2 = bVarB.c();
                    if (e1VarC2 == null) {
                        e1VarC2 = e1VarC;
                    }
                    t0VarC = st.w0.e(e1VarC2, e1VarC);
                    if (t0VarC == null) {
                        t0VarC = bVarB.c();
                    }
                }
                t0VarD = n2.d(o2Var, t0VarC);
            } else if (z16) {
                st.e1 e1VarC3 = bVarB.c();
                if (e1VarC3 == null) {
                    e1VarC3 = k0Var.b1();
                }
                st.e1 e1VarC4 = bVarB2.c();
                if (e1VarC4 == null) {
                    e1VarC4 = k0Var.c1();
                }
                t0VarD = new os.k(e1VarC3, e1VarC4);
            } else {
                st.e1 e1VarC5 = bVarB.c();
                if (e1VarC5 == null) {
                    e1VarC5 = k0Var.b1();
                }
                st.e1 e1VarC6 = bVarB2.c();
                if (e1VarC6 == null) {
                    e1VarC6 = k0Var.c1();
                }
                t0VarD = st.w0.e(e1VarC5, e1VarC6);
            }
        }
        return new a(t0VarD, bVarB.b());
    }

    private final st.e1 e(st.e1 e1Var) {
        return this.f175647a.a() ? st.i1.h(e1Var, true) : new k(e1Var);
    }

    public final st.t0 a(st.t0 t0Var, er.l<? super Integer, i> lVar, boolean z15) {
        return d(t0Var.W0(), lVar, 0, z15).b();
    }
}
