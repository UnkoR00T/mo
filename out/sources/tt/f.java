package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import st.d2;
import st.e1;
import st.k0;
import st.l2;
import st.n2;
import st.o2;
import st.p2;
import st.s0;
import st.t0;
import st.w0;
import st.x1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends st.r {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f192118a = new a();

        private a() {
        }
    }

    static final /* synthetic */ class b extends fr.q implements er.l<wt.i, o2> {
        b(Object obj) {
            super(1, obj, f.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final o2 b(wt.i iVar) {
            return ((f) this.f66391b).a(iVar);
        }
    }

    private final e1 c(e1 e1Var) {
        t0 type;
        x1 x1VarT0 = e1Var.T0();
        s0 s0VarS = null;
        o2VarW0 = null;
        o2 o2VarW0 = null;
        if (x1VarT0 instanceof et.c) {
            et.c cVar = (et.c) x1VarT0;
            d2 d2VarV = cVar.v();
            if (d2VarV.c() != p2.IN_VARIANCE) {
                d2VarV = null;
            }
            if (d2VarV != null && (type = d2VarV.getType()) != null) {
                o2VarW0 = type.W0();
            }
            o2 o2Var = o2VarW0;
            if (cVar.f() == null) {
                d2 d2VarV2 = cVar.v();
                Collection<t0> collectionQ = cVar.q();
                ArrayList arrayList = new ArrayList(pq.v.y(collectionQ, 10));
                Iterator<T> it = collectionQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t0) it.next()).W0());
                }
                cVar.h(new n(d2VarV2, arrayList, null, 4, null));
            }
            return new i(wt.b.FOR_SUBTYPING, cVar.f(), o2Var, e1Var.S0(), e1Var.U0(), false, 32, null);
        }
        boolean z15 = false;
        if (x1VarT0 instanceof ft.s) {
            Collection<t0> collectionQ2 = ((ft.s) x1VarT0).q();
            ArrayList arrayList2 = new ArrayList(pq.v.y(collectionQ2, 10));
            Iterator<T> it4 = collectionQ2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(l2.p((t0) it4.next(), e1Var.U0()));
            }
            return w0.m(e1Var.S0(), new s0(arrayList2), pq.v.n(), false, e1Var.r());
        }
        if (!(x1VarT0 instanceof s0) || !e1Var.U0()) {
            return e1Var;
        }
        s0 s0Var = (s0) x1VarT0;
        Collection<t0> collectionQ3 = s0Var.q();
        ArrayList arrayList3 = new ArrayList(pq.v.y(collectionQ3, 10));
        Iterator<T> it5 = collectionQ3.iterator();
        while (it5.hasNext()) {
            arrayList3.add(xt.d.B((t0) it5.next()));
            z15 = true;
        }
        if (z15) {
            t0 t0VarL = s0Var.l();
            s0VarS = new s0(arrayList3).s(t0VarL != null ? xt.d.B(t0VarL) : null);
        }
        if (s0VarS != null) {
            s0Var = s0VarS;
        }
        return s0Var.j();
    }

    @Override // st.r
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o2 a(wt.i iVar) {
        o2 o2VarE;
        if (!(iVar instanceof t0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        o2 o2VarW0 = ((t0) iVar).W0();
        if (o2VarW0 instanceof e1) {
            o2VarE = c((e1) o2VarW0);
        } else {
            if (!(o2VarW0 instanceof k0)) {
                throw new oq.p();
            }
            k0 k0Var = (k0) o2VarW0;
            e1 e1VarC = c(k0Var.b1());
            e1 e1VarC2 = c(k0Var.c1());
            o2VarE = (e1VarC == k0Var.b1() && e1VarC2 == k0Var.c1()) ? o2VarW0 : w0.e(e1VarC, e1VarC2);
        }
        return n2.c(o2VarE, o2VarW0, new b(this));
    }
}
