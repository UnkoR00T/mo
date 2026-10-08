package xt;

import er.l;
import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oq.p;
import pq.IndexedValue;
import pq.v;
import sr.j;
import st.d2;
import st.e1;
import st.f2;
import st.h2;
import st.k0;
import st.l1;
import st.l2;
import st.n1;
import st.n2;
import st.o2;
import st.p2;
import st.t0;
import st.u1;
import st.w0;
import st.x1;
import st.z;
import vr.e;
import vr.f;
import vr.i;
import vr.m1;
import wr.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final t0 A(t0 t0Var) {
        return l2.n(t0Var);
    }

    public static final t0 B(t0 t0Var) {
        return l2.o(t0Var);
    }

    public static final t0 C(t0 t0Var, h hVar) {
        return (t0Var.getAnnotations().isEmpty() && hVar.isEmpty()) ? t0Var : t0Var.W0().Z0(u1.a(t0Var.S0(), hVar));
    }

    public static final t0 D(t0 t0Var) {
        e1 e1Var;
        o2 o2VarF;
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            k0 k0Var = (k0) o2VarW0;
            e1 e1VarB1 = k0Var.b1();
            if (!e1VarB1.T0().getParameters().isEmpty() && e1VarB1.T0().c() != null) {
                List<m1> parameters = e1VarB1.T0().getParameters();
                ArrayList arrayList = new ArrayList(v.y(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new l1((m1) it.next()));
                }
                e1VarB1 = h2.f(e1VarB1, arrayList, null, 2, null);
            }
            e1 e1VarC1 = k0Var.c1();
            if (!e1VarC1.T0().getParameters().isEmpty() && e1VarC1.T0().c() != null) {
                List<m1> parameters2 = e1VarC1.T0().getParameters();
                ArrayList arrayList2 = new ArrayList(v.y(parameters2, 10));
                Iterator<T> it4 = parameters2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new l1((m1) it4.next()));
                }
                e1VarC1 = h2.f(e1VarC1, arrayList2, null, 2, null);
            }
            o2VarF = w0.e(e1VarB1, e1VarC1);
        } else {
            if (!(o2VarW0 instanceof e1)) {
                throw new p();
            }
            e1Var = (e1) o2VarW0;
            if (!e1Var.T0().getParameters().isEmpty() && e1Var.T0().c() != null) {
                o2VarF = e1Var;
                o2VarF = e1Var;
                List<m1> parameters3 = e1Var.T0().getParameters();
                ArrayList arrayList3 = new ArrayList(v.y(parameters3, 10));
                Iterator<T> it5 = parameters3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(new l1((m1) it5.next()));
                }
                o2VarF = h2.f(e1Var, arrayList3, null, 2, null);
            }
        }
        o2VarF = e1Var;
        o2VarF = e1Var;
        o2VarF = e1Var;
        return n2.b(o2VarF, o2VarW0);
    }

    public static final boolean E(t0 t0Var) {
        return e(t0Var, c.f220870a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(o2 o2Var) {
        vr.h hVarC = o2Var.T0().c();
        if (hVarC != null) {
            return (hVarC instanceof vr.l1) || (hVarC instanceof m1);
        }
        return false;
    }

    public static final d2 d(t0 t0Var) {
        return new f2(t0Var);
    }

    public static final boolean e(t0 t0Var, l<? super o2, Boolean> lVar) {
        return l2.c(t0Var, lVar);
    }

    private static final boolean f(t0 t0Var, x1 x1Var, Set<? extends m1> set) {
        if (t.c(t0Var.T0(), x1Var)) {
            return true;
        }
        vr.h hVarC = t0Var.T0().c();
        i iVar = hVarC instanceof i ? (i) hVarC : null;
        List<m1> listV = iVar != null ? iVar.v() : null;
        Iterable<IndexedValue> iterableN1 = v.n1(t0Var.R0());
        if ((iterableN1 instanceof Collection) && ((Collection) iterableN1).isEmpty()) {
            return false;
        }
        for (IndexedValue indexedValue : iterableN1) {
            int index = indexedValue.getIndex();
            d2 d2Var = (d2) indexedValue.b();
            m1 m1Var = listV != null ? (m1) v.o0(listV, index) : null;
            if (((m1Var == null || set == null || !set.contains(m1Var)) && !d2Var.b()) ? f(d2Var.getType(), x1Var, set) : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(t0 t0Var) {
        return e(t0Var, b.f220869a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(o2 o2Var) {
        vr.h hVarC = o2Var.T0().c();
        if (hVarC != null) {
            return x(hVarC);
        }
        return false;
    }

    public static final boolean i(t0 t0Var) {
        return l2.c(t0Var, a.f220868a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(o2 o2Var) {
        return Boolean.valueOf(l2.m(o2Var));
    }

    public static final d2 k(t0 t0Var, p2 p2Var, m1 m1Var) {
        if ((m1Var != null ? m1Var.q() : null) == p2Var) {
            p2Var = p2.INVARIANT;
        }
        return new f2(p2Var, t0Var);
    }

    public static final Set<m1> l(t0 t0Var, Set<? extends m1> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(t0Var, t0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(t0 t0Var, t0 t0Var2, Set<m1> set, Set<? extends m1> set2) {
        vr.h hVarC = t0Var.T0().c();
        if (hVarC instanceof m1) {
            if (!t.c(t0Var.T0(), t0Var2.T0())) {
                set.add(hVarC);
                return;
            }
            Iterator<t0> it = ((m1) hVarC).getUpperBounds().iterator();
            while (it.hasNext()) {
                m(it.next(), t0Var2, set, set2);
            }
            return;
        }
        vr.h hVarC2 = t0Var.T0().c();
        i iVar = hVarC2 instanceof i ? (i) hVarC2 : null;
        List<m1> listV = iVar != null ? iVar.v() : null;
        int i15 = 0;
        for (d2 d2Var : t0Var.R0()) {
            int i16 = i15 + 1;
            m1 m1Var = listV != null ? (m1) v.o0(listV, i15) : null;
            if ((m1Var == null || set2 == null || !set2.contains(m1Var)) && !d2Var.b() && !v.c0(set, d2Var.getType().T0().c()) && !t.c(d2Var.getType().T0(), t0Var2.T0())) {
                m(d2Var.getType(), t0Var2, set, set2);
            }
            i15 = i16;
        }
    }

    public static final j n(t0 t0Var) {
        return t0Var.T0().i();
    }

    public static final t0 o(m1 m1Var) {
        Object obj;
        m1Var.getUpperBounds().isEmpty();
        Iterator<T> it = m1Var.getUpperBounds().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            vr.h hVarC = ((t0) next).T0().c();
            e eVar = hVarC instanceof e ? (e) hVarC : null;
            if (eVar != null && eVar.k() != f.INTERFACE && eVar.k() != f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        t0 t0Var = (t0) obj;
        return t0Var == null ? (t0) v.l0(m1Var.getUpperBounds()) : t0Var;
    }

    public static final boolean p(m1 m1Var) {
        return r(m1Var, null, null, 6, null);
    }

    public static final boolean q(m1 m1Var, x1 x1Var, Set<? extends m1> set) {
        List<t0> upperBounds = m1Var.getUpperBounds();
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (t0 t0Var : upperBounds) {
            if (f(t0Var, m1Var.t().T0(), set) && (x1Var == null || t.c(t0Var.T0(), x1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m1 m1Var, x1 x1Var, Set set, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            x1Var = null;
        }
        if ((i15 & 4) != 0) {
            set = null;
        }
        return q(m1Var, x1Var, set);
    }

    public static final boolean s(t0 t0Var) {
        return j.g0(t0Var);
    }

    public static final boolean t(t0 t0Var) {
        return j.o0(t0Var);
    }

    public static final boolean u(t0 t0Var) {
        if (t0Var instanceof st.e) {
            return true;
        }
        return (t0Var instanceof z) && (((z) t0Var).f1() instanceof st.e);
    }

    public static final boolean v(t0 t0Var) {
        if (t0Var instanceof n1) {
            return true;
        }
        return (t0Var instanceof z) && (((z) t0Var).f1() instanceof n1);
    }

    public static final boolean w(t0 t0Var, t0 t0Var2) {
        return tt.e.f192117a.b(t0Var, t0Var2);
    }

    public static final boolean x(vr.h hVar) {
        return (hVar instanceof m1) && (((m1) hVar).b() instanceof vr.l1);
    }

    public static final boolean y(t0 t0Var) {
        return l2.m(t0Var);
    }

    public static final boolean z(t0 t0Var) {
        return (t0Var instanceof ut.i) && ((ut.i) t0Var).d1().g();
    }
}
