package os;

import ct.n;
import ct.y;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pq.v;
import st.c2;
import st.d1;
import st.d2;
import st.e1;
import st.k0;
import st.t0;
import st.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends k0 implements d1 {
    private k(e1 e1Var, e1 e1Var2, boolean z15) {
        super(e1Var, e1Var2);
        if (z15) {
            return;
        }
        tt.e.f192117a.b(e1Var, e1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h1(String str) {
        return "(raw) " + str;
    }

    private static final boolean i1(String str, String str2) {
        return t.c(str, r.M0(str2, "out ")) || t.c(str2, "*");
    }

    private static final List<String> j1(n nVar, t0 t0Var) {
        List<d2> listR0 = t0Var.R0();
        ArrayList arrayList = new ArrayList(v.y(listR0, 10));
        Iterator<T> it = listR0.iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.T((d2) it.next()));
        }
        return arrayList;
    }

    private static final String k1(String str, String str2) {
        if (!r.c0(str, '<', false, 2, null)) {
            return str;
        }
        return r.n1(str, '<', null, 2, null) + '<' + str2 + '>' + r.j1(str, '>', null, 2, null);
    }

    @Override // st.k0
    public e1 a1() {
        return b1();
    }

    @Override // st.k0
    public String d1(n nVar, y yVar) {
        oq.r rVar;
        String strS = nVar.S(b1());
        String strS2 = nVar.S(c1());
        if (yVar.i()) {
            return "raw (" + strS + ".." + strS2 + ')';
        }
        if (c1().R0().isEmpty()) {
            return nVar.P(strS, strS2, xt.d.n(this));
        }
        List<String> listJ1 = j1(nVar, b1());
        List<String> listJ2 = j1(nVar, c1());
        List<String> list = listJ1;
        String strV0 = v.v0(list, ", ", null, null, 0, null, j.f149671a, 30, null);
        List listP1 = v.p1(list, listJ2);
        if (!(listP1 instanceof Collection) || !listP1.isEmpty()) {
            Iterator it = listP1.iterator();
            do {
                if (!it.hasNext()) {
                    strS2 = k1(strS2, strV0);
                    break;
                }
                rVar = (oq.r) it.next();
            } while (i1((String) rVar.c(), (String) rVar.d()));
        } else {
            strS2 = k1(strS2, strV0);
            break;
        }
        String strK1 = k1(strS, strV0);
        return t.c(strK1, strS2) ? strK1 : nVar.P(strK1, strS2, xt.d.n(this));
    }

    @Override // st.o2
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public k X0(boolean z15) {
        return new k(b1().X0(z15), c1().X0(z15));
    }

    @Override // st.o2
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public k0 d1(tt.g gVar) {
        return new k((e1) gVar.a(b1()), (e1) gVar.a(c1()), true);
    }

    @Override // st.o2
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public k Z0(t1 t1Var) {
        return new k(b1().Z0(t1Var), c1().Z0(t1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // st.k0, st.t0
    public lt.k r() {
        vr.h hVarC = T0().c();
        c2 c2Var = null;
        Object[] objArr = 0;
        vr.e eVar = hVarC instanceof vr.e ? (vr.e) hVarC : null;
        if (eVar != null) {
            return eVar.O(new i(c2Var, 1, objArr == true ? 1 : 0));
        }
        throw new IllegalStateException(("Incorrect classifier: " + T0().c()).toString());
    }

    public k(e1 e1Var, e1 e1Var2) {
        this(e1Var, e1Var2, false);
    }
}
