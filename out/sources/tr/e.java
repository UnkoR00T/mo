package tr;

import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import oq.r;
import pq.IndexedValue;
import pq.v;
import sr.i;
import st.i2;
import st.p2;
import vr.c1;
import vr.f0;
import vr.h1;
import vr.m;
import vr.m1;
import vr.t1;
import vr.z;
import wr.h;
import yr.o0;
import yr.s;
import yr.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends o0 {
    public static final a H = new a(null);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private final t1 b(e eVar, int i15, m1 m1Var) {
            String lowerCase;
            String strE = m1Var.getName().e();
            if (t.c(strE, "T")) {
                lowerCase = "instance";
            } else {
                lowerCase = t.c(strE, "E") ? "receiver" : strE.toLowerCase(Locale.ROOT);
            }
            return new u0(eVar, null, i15, h.f214542p0.b(), zs.f.l(lowerCase), m1Var.t(), false, false, false, null, h1.f208052a);
        }

        public final e a(b bVar, boolean z15) {
            List<m1> listV = bVar.v();
            e eVar = new e(bVar, null, vr.b.a.DECLARATION, z15, null);
            c1 c1VarP0 = bVar.P0();
            List<c1> listN = v.n();
            List<? extends m1> listN2 = v.n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listV) {
                if (((m1) obj).q() != p2.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableN1 = v.n1(arrayList);
            ArrayList arrayList2 = new ArrayList(v.y(iterableN1, 10));
            for (IndexedValue indexedValue : iterableN1) {
                arrayList2.add(e.H.b(eVar, indexedValue.c(), (m1) indexedValue.d()));
            }
            eVar.X0(null, c1VarP0, listN, listN2, arrayList2, ((m1) v.x0(listV)).t(), f0.ABSTRACT, vr.t.f208080e);
            eVar.f1(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(m mVar, e eVar, vr.b.a aVar, boolean z15, k kVar) {
        this(mVar, eVar, aVar, z15);
    }

    private final z v1(List<zs.f> list) {
        zs.f fVar;
        int size = l().size() - list.size();
        boolean z15 = true;
        if (size == 0) {
            List<r> listP1 = v.p1(list, l());
            if ((listP1 instanceof Collection) && listP1.isEmpty()) {
                return this;
            }
            for (r rVar : listP1) {
                if (!t.c((zs.f) rVar.a(), ((t1) rVar.b()).getName())) {
                }
            }
            return this;
        }
        List<t1> listL = l();
        ArrayList arrayList = new ArrayList(v.y(listL, 10));
        for (t1 t1Var : listL) {
            zs.f name = t1Var.getName();
            int index = t1Var.getIndex();
            int i15 = index - size;
            if (i15 >= 0 && (fVar = list.get(i15)) != null) {
                name = fVar;
            }
            arrayList.add(t1Var.t0(this, name, index));
        }
        s.c cVarY0 = Y0(i2.f184051b);
        List<zs.f> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z15 = false;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((zs.f) it.next()) == null) {
                }
            }
            z15 = false;
        }
        return super.S0(cVarY0.G(z15).c(arrayList).h(Q0()));
    }

    @Override // yr.s, vr.z
    public boolean G() {
        return false;
    }

    @Override // yr.o0, yr.s
    /* JADX INFO: renamed from: R0 */
    protected s u1(m mVar, z zVar, vr.b.a aVar, zs.f fVar, h hVar, h1 h1Var) {
        return new e(mVar, (e) zVar, aVar, u());
    }

    @Override // yr.s
    protected z S0(s.c cVar) {
        e eVar = (e) super.S0(cVar);
        if (eVar == null) {
            return null;
        }
        List<t1> listL = eVar.l();
        if ((listL instanceof Collection) && listL.isEmpty()) {
            return eVar;
        }
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            if (i.d(((t1) it.next()).getType()) != null) {
                List<t1> listL2 = eVar.l();
                ArrayList arrayList = new ArrayList(v.y(listL2, 10));
                Iterator<T> it4 = listL2.iterator();
                while (it4.hasNext()) {
                    arrayList.add(i.d(((t1) it4.next()).getType()));
                }
                return eVar.v1(arrayList);
            }
        }
        return eVar;
    }

    @Override // yr.s, vr.e0
    public boolean d0() {
        return false;
    }

    @Override // yr.s, vr.z
    public boolean n() {
        return false;
    }

    private e(m mVar, e eVar, vr.b.a aVar, boolean z15) {
        super(mVar, eVar, h.f214542p0.b(), zt.t.f237258i, aVar, h1.f208052a);
        l1(true);
        n1(z15);
        e1(false);
    }
}
