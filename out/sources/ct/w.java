package ct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import st.d2;
import st.e1;
import st.i1;
import st.k0;
import st.l2;
import st.n1;
import st.o2;
import st.p2;
import st.q2;
import st.s0;
import st.t0;
import st.x0;
import st.x1;
import vr.a1;
import vr.b1;
import vr.c1;
import vr.l1;
import vr.m1;
import vr.n0;
import vr.o0;
import vr.q1;
import vr.t1;
import vr.u1;
import vr.v0;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends n implements y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b0 f37683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oq.k f37684n;

    private final class a implements vr.o<oq.i0, StringBuilder> {

        /* JADX INFO: renamed from: ct.w$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0794a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37686a;

            static {
                int[] iArr = new int[g0.values().length];
                try {
                    iArr[g0.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g0.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g0.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f37686a = iArr;
            }
        }

        public a() {
        }

        private final void t(y0 y0Var, StringBuilder sb5, String str) throws IOException {
            int i15 = C0794a.f37686a[w.this.S0().ordinal()];
            if (i15 != 1) {
                if (i15 == 2) {
                    p(y0Var, sb5);
                    return;
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    return;
                }
            }
            w.this.z1(y0Var, sb5);
            sb5.append(str + " for ");
            w.this.m2(y0Var.Z(), sb5);
        }

        public void A(t1 t1Var, StringBuilder sb5) {
            w.this.G2(t1Var, true, sb5, true);
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 a(m1 m1Var, StringBuilder sb5) {
            z(m1Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 b(t1 t1Var, StringBuilder sb5) {
            A(t1Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 c(b1 b1Var, StringBuilder sb5) throws IOException {
            w(b1Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 d(vr.e eVar, StringBuilder sb5) throws IOException {
            n(eVar, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 e(o0 o0Var, StringBuilder sb5) {
            r(o0Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 f(vr.z zVar, StringBuilder sb5) throws IOException {
            p(zVar, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 g(vr.i0 i0Var, StringBuilder sb5) {
            q(i0Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 h(a1 a1Var, StringBuilder sb5) throws IOException {
            v(a1Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 i(vr.l lVar, StringBuilder sb5) throws IOException {
            o(lVar, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 j(l1 l1Var, StringBuilder sb5) {
            y(l1Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 k(v0 v0Var, StringBuilder sb5) {
            s(v0Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 l(z0 z0Var, StringBuilder sb5) throws IOException {
            u(z0Var, sb5);
            return oq.i0.f148189a;
        }

        @Override // vr.o
        public /* bridge */ /* synthetic */ oq.i0 m(c1 c1Var, StringBuilder sb5) {
            x(c1Var, sb5);
            return oq.i0.f148189a;
        }

        public void n(vr.e eVar, StringBuilder sb5) throws IOException {
            w.this.F1(eVar, sb5);
        }

        public void o(vr.l lVar, StringBuilder sb5) throws IOException {
            w.this.K1(lVar, sb5);
        }

        public void p(vr.z zVar, StringBuilder sb5) throws IOException {
            w.this.U1(zVar, sb5);
        }

        public void q(vr.i0 i0Var, StringBuilder sb5) {
            w.this.e2(i0Var, sb5, true);
        }

        public void r(o0 o0Var, StringBuilder sb5) {
            w.this.i2(o0Var, sb5);
        }

        public void s(v0 v0Var, StringBuilder sb5) {
            w.this.k2(v0Var, sb5);
        }

        public void u(z0 z0Var, StringBuilder sb5) throws IOException {
            w.this.m2(z0Var, sb5);
        }

        public void v(a1 a1Var, StringBuilder sb5) throws IOException {
            t(a1Var, sb5, "getter");
        }

        public void w(b1 b1Var, StringBuilder sb5) throws IOException {
            t(b1Var, sb5, "setter");
        }

        public void x(c1 c1Var, StringBuilder sb5) {
            sb5.append(c1Var.getName());
        }

        public void y(l1 l1Var, StringBuilder sb5) {
            w.this.v2(l1Var, sb5);
        }

        public void z(m1 m1Var, StringBuilder sb5) {
            w.this.B2(m1Var, sb5, true);
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f37688b;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37687a = iArr;
            int[] iArr2 = new int[f0.values().length];
            try {
                iArr2[f0.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f0.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f37688b = iArr2;
        }
    }

    static final /* synthetic */ class c extends fr.q implements er.l<String, String> {
        c(Object obj) {
            super(1, obj, w.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final String b(String str) {
            return ((w) this.f66391b).t0(str);
        }
    }

    public w(b0 b0Var) {
        this.f37683m = b0Var;
        b0Var.p0();
        this.f37684n = oq.l.a(new o(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    private final void A1(vr.z zVar, StringBuilder sb5) {
        boolean z15;
        boolean z16 = false;
        if (zVar.p0()) {
            Collection<? extends vr.z> collectionE = zVar.e();
            if (!collectionE.isEmpty()) {
                Iterator<T> it = collectionE.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((vr.z) it.next()).p0()) {
                            if (!x0()) {
                                z15 = false;
                            }
                        }
                    }
                }
            }
            z15 = true;
        } else {
            z15 = false;
        }
        if (zVar.N0()) {
            Collection<? extends vr.z> collectionE2 = zVar.e();
            if (collectionE2.isEmpty()) {
                z16 = true;
            } else {
                Iterator<T> it4 = collectionE2.iterator();
                while (it4.hasNext()) {
                    if (((vr.z) it4.next()).N0()) {
                        if (x0()) {
                            break;
                        }
                    }
                }
                z16 = true;
            }
        }
        d2(sb5, zVar.G(), "tailrec");
        u2(zVar, sb5);
        d2(sb5, zVar.n(), "inline");
        d2(sb5, z16, "infix");
        d2(sb5, z15, "operator");
    }

    static /* synthetic */ void A2(w wVar, StringBuilder sb5, t0 t0Var, x1 x1Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            x1Var = t0Var.T0();
        }
        wVar.z2(sb5, t0Var, x1Var);
    }

    private final List<String> B1(wr.c cVar) {
        vr.d dVarH;
        List<t1> listL;
        Map<zs.f, ft.g<?>> mapA = cVar.a();
        List listN = null;
        vr.e eVarL = Y0() ? ht.e.l(cVar) : null;
        if (eVarL != null && (dVarH = eVarL.H()) != null && (listL = dVarH.l()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listL) {
                if (((t1) obj).E0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(pq.v.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t1) it.next()).getName());
            }
            listN = arrayList2;
        }
        if (listN == null) {
            listN = pq.v.n();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listN) {
            if (!mapA.containsKey((zs.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(pq.v.y(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((zs.f) it4.next()).e() + " = ...");
        }
        Set<Map.Entry<zs.f, ft.g<?>>> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(pq.v.y(setEntrySet, 10));
        Iterator<T> it5 = setEntrySet.iterator();
        while (it5.hasNext()) {
            Map.Entry entry = (Map.Entry) it5.next();
            zs.f fVar = (zs.f) entry.getKey();
            ft.g<?> gVar = (ft.g) entry.getValue();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(fVar.e());
            sb5.append(" = ");
            sb5.append(!listN.contains(fVar) ? J1(gVar) : "...");
            arrayList5.add(sb5.toString());
        }
        return pq.v.T0(pq.v.L0(arrayList4, arrayList5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(m1 m1Var, StringBuilder sb5, boolean z15) {
        if (z15) {
            sb5.append(w1());
        }
        if (m1()) {
            sb5.append("/*");
            sb5.append(m1Var.getIndex());
            sb5.append("*/ ");
        }
        d2(sb5, m1Var.B(), "reified");
        String strG = m1Var.q().g();
        boolean z16 = true;
        d2(sb5, strG.length() > 0, strG);
        D1(this, sb5, m1Var, null, 2, null);
        e2(m1Var, sb5, z15);
        int size = m1Var.getUpperBounds().size();
        if ((size > 1 && !z15) || size == 1) {
            t0 next = m1Var.getUpperBounds().iterator().next();
            if (!sr.j.k0(next)) {
                sb5.append(" : ");
                sb5.append(S(next));
            }
        } else if (z15) {
            for (t0 t0Var : m1Var.getUpperBounds()) {
                if (!sr.j.k0(t0Var)) {
                    if (z16) {
                        sb5.append(" : ");
                    } else {
                        sb5.append(" & ");
                    }
                    sb5.append(S(t0Var));
                    z16 = false;
                }
            }
        }
        if (z15) {
            sb5.append(s1());
        }
    }

    private final void C1(StringBuilder sb5, wr.a aVar, wr.e eVar) {
        if (L0().contains(x.ANNOTATIONS)) {
            Set<zs.c> setH = aVar instanceof t0 ? h() : E0();
            er.l<wr.c, Boolean> lVarY0 = y0();
            for (wr.c cVar : aVar.getAnnotations()) {
                if (!pq.v.c0(setH, cVar.g()) && !v1(cVar) && (lVarY0 == null || lVarY0.b(cVar).booleanValue())) {
                    sb5.append(N(cVar, eVar));
                    if (D0()) {
                        sb5.append('\n');
                    } else {
                        sb5.append(" ");
                    }
                }
            }
        }
    }

    private final void C2(StringBuilder sb5, List<? extends m1> list) {
        Iterator<? extends m1> it = list.iterator();
        while (it.hasNext()) {
            B2(it.next(), sb5, false);
            if (it.hasNext()) {
                sb5.append(", ");
            }
        }
    }

    static /* synthetic */ void D1(w wVar, StringBuilder sb5, wr.a aVar, wr.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            eVar = null;
        }
        wVar.C1(sb5, aVar, eVar);
    }

    private final void D2(List<? extends m1> list, StringBuilder sb5, boolean z15) {
        if (r1() || list.isEmpty()) {
            return;
        }
        sb5.append(w1());
        C2(sb5, list);
        sb5.append(s1());
        if (z15) {
            sb5.append(" ");
        }
    }

    private final void E1(vr.i iVar, StringBuilder sb5) {
        List<m1> listV = iVar.v();
        List<m1> parameters = iVar.o().getParameters();
        if (m1() && iVar.E() && parameters.size() > listV.size()) {
            sb5.append(" /*captured type parameters: ");
            C2(sb5, parameters.subList(listV.size(), parameters.size()));
            sb5.append("*/");
        }
    }

    private final void E2(u1 u1Var, StringBuilder sb5, boolean z15) {
        if (z15 || !(u1Var instanceof t1)) {
            sb5.append(X1(u1Var.Q() ? "var" : "val"));
            sb5.append(" ");
        }
    }

    private final w F0() {
        return (w) this.f37684n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(vr.e eVar, StringBuilder sb5) throws IOException {
        vr.d dVarH;
        boolean z15 = eVar.k() == vr.f.ENUM_ENTRY;
        if (!g1()) {
            M1(eVar.c0(), sb5);
            D1(this, sb5, eVar, null, 2, null);
            if (!z15) {
                J2(eVar.h(), sb5);
            }
            if ((eVar.k() != vr.f.INTERFACE || eVar.w() != vr.f0.ABSTRACT) && (!eVar.k().e() || eVar.w() != vr.f0.FINAL)) {
                b2(eVar.w(), sb5, u1(eVar));
            }
            Z1(eVar, sb5);
            d2(sb5, L0().contains(x.INNER) && eVar.E(), "inner");
            d2(sb5, L0().contains(x.DATA) && eVar.O0(), "data");
            d2(sb5, L0().contains(x.INLINE) && eVar.n(), "inline");
            d2(sb5, L0().contains(x.VALUE) && eVar.x(), "value");
            d2(sb5, L0().contains(x.FUN) && eVar.j0(), "fun");
            G1(eVar, sb5);
        }
        if (dt.i.x(eVar)) {
            I1(eVar, sb5);
        } else {
            if (!g1()) {
                r2(sb5);
            }
            e2(eVar, sb5, true);
        }
        if (z15) {
            return;
        }
        List<m1> listV = eVar.v();
        D2(listV, sb5, false);
        E1(eVar, sb5);
        if (!eVar.k().e() && A0() && (dVarH = eVar.H()) != null) {
            sb5.append(" ");
            D1(this, sb5, dVarH, null, 2, null);
            J2(dVarH.h(), sb5);
            sb5.append(X1("constructor"));
            H2(dVarH.l(), dVarH.l0(), sb5);
        }
        s2(eVar, sb5);
        K2(listV, sb5);
    }

    static /* synthetic */ void F2(w wVar, u1 u1Var, StringBuilder sb5, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        wVar.E2(u1Var, sb5, z15);
    }

    private final void G1(vr.e eVar, StringBuilder sb5) {
        sb5.append(X1(n.f37659a.a(eVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void G2(t1 t1Var, boolean z15, StringBuilder sb5, boolean z16) {
        boolean z17;
        if (z16) {
            sb5.append(X1("value-parameter"));
            sb5.append(" ");
        }
        if (m1()) {
            sb5.append("/*");
            sb5.append(t1Var.getIndex());
            sb5.append("*/ ");
        }
        D1(this, sb5, t1Var, null, 2, null);
        d2(sb5, t1Var.v0(), "crossinline");
        d2(sb5, t1Var.u0(), "noinline");
        boolean z18 = false;
        if (b1()) {
            vr.a aVarB = t1Var.b();
            vr.d dVar = aVarB instanceof vr.d ? (vr.d) aVarB : null;
            if (dVar == null || !dVar.h0()) {
                z17 = false;
            } else {
                z17 = true;
            }
        } else {
            z17 = false;
        }
        if (z17) {
            d2(sb5, w0(), "actual");
        }
        I2(t1Var, z15, sb5, z16, z17);
        if (C0() != null) {
            if (i() ? t1Var.E0() : ht.e.f(t1Var)) {
                z18 = true;
            }
        }
        if (z18) {
            sb5.append(" = " + C0().b(t1Var));
        }
    }

    private final void H2(Collection<? extends t1> collection, boolean z15, StringBuilder sb5) {
        boolean zM2 = M2(z15);
        int size = collection.size();
        l1().b(size, sb5);
        int i15 = 0;
        for (t1 t1Var : collection) {
            l1().a(t1Var, i15, size, sb5);
            G2(t1Var, zM2, sb5, false);
            l1().d(t1Var, i15, size, sb5);
            i15++;
        }
        l1().c(size, sb5);
    }

    private final void I1(vr.m mVar, StringBuilder sb5) {
        if (V0()) {
            if (g1()) {
                sb5.append("companion object");
            }
            r2(sb5);
            vr.m mVarB = mVar.b();
            if (mVarB != null) {
                sb5.append("of ");
                sb5.append(R(mVarB.getName(), false));
            }
        }
        if (m1() || !fr.t.c(mVar.getName(), zs.h.f236658d)) {
            if (!g1()) {
                r2(sb5);
            }
            sb5.append(R(mVar.getName(), true));
        }
    }

    private final void I2(u1 u1Var, boolean z15, StringBuilder sb5, boolean z16, boolean z17) {
        t0 type = u1Var.getType();
        t1 t1Var = u1Var instanceof t1 ? (t1) u1Var : null;
        t0 t0VarY0 = t1Var != null ? t1Var.y0() : null;
        t0 t0Var = t0VarY0 == null ? type : t0VarY0;
        d2(sb5, t0VarY0 != null, "vararg");
        if (z17 || (z16 && !g1())) {
            E2(u1Var, sb5, z17);
        }
        if (z15) {
            e2(u1Var, sb5, z16);
            sb5.append(": ");
        }
        sb5.append(S(t0Var));
        W1(u1Var, sb5);
        if (!m1() || t0VarY0 == null) {
            return;
        }
        sb5.append(" /*");
        sb5.append(S(type));
        sb5.append("*/");
    }

    private final String J1(ft.g<?> gVar) {
        er.l<ft.g<?>, String> lVarP = this.f37683m.P();
        if (lVarP != null) {
            return lVarP.b(gVar);
        }
        if (gVar instanceof ft.b) {
            List<? extends ft.g<?>> listB = ((ft.b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                String strJ1 = J1((ft.g) it.next());
                if (strJ1 != null) {
                    arrayList.add(strJ1);
                }
            }
            return pq.v.v0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (gVar instanceof ft.a) {
            return fu.r.M0(n.O(this, ((ft.a) gVar).b(), null, 2, null), "@");
        }
        if (!(gVar instanceof ft.t)) {
            return gVar.toString();
        }
        ft.t.b bVarB = ((ft.t) gVar).b();
        if (bVarB instanceof ft.t.b.a) {
            return ((ft.t.b.a) bVarB).a() + "::class";
        }
        if (!(bVarB instanceof ft.t.b.C1499b)) {
            throw new oq.p();
        }
        ft.t.b.C1499b c1499b = (ft.t.b.C1499b) bVarB;
        String strA = c1499b.b().a().a();
        for (int i15 = 0; i15 < c1499b.a(); i15++) {
            strA = "kotlin.Array<" + strA + '>';
        }
        return strA + "::class";
    }

    private final boolean J2(vr.u uVar, StringBuilder sb5) {
        if (!L0().contains(x.VISIBILITY)) {
            return false;
        }
        if (M0()) {
            uVar = uVar.f();
        }
        if (!a1() && fr.t.c(uVar, vr.t.f208087l)) {
            return false;
        }
        sb5.append(X1(uVar.c()));
        sb5.append(" ");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(vr.l lVar, StringBuilder sb5) throws IOException {
        vr.d dVarH;
        D1(this, sb5, lVar, null, 2, null);
        boolean z15 = (this.f37683m.X() || lVar.i0().w() != vr.f0.SEALED) && J2(lVar.h(), sb5);
        Y1(lVar, sb5);
        boolean z16 = X0() || !lVar.h0() || z15;
        if (z16) {
            sb5.append(X1("constructor"));
        }
        vr.i iVarB = lVar.b();
        if (e1()) {
            if (z16) {
                sb5.append(" ");
            }
            e2(iVarB, sb5, true);
            D2(lVar.getTypeParameters(), sb5, false);
        }
        H2(lVar.l(), lVar.l0(), sb5);
        if (W0() && !lVar.h0() && (iVarB instanceof vr.e) && (dVarH = ((vr.e) iVarB).H()) != null) {
            List<t1> listL = dVarH.l();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listL) {
                t1 t1Var = (t1) obj;
                if (!t1Var.E0() && t1Var.y0() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb5.append(" : ");
                sb5.append(X1("this"));
                sb5.append(pq.v.v0(arrayList, ", ", "(", ")", 0, null, t.f37680a, 24, null));
            }
        }
        if (e1()) {
            K2(lVar.getTypeParameters(), sb5);
        }
    }

    private final void K2(List<? extends m1> list, StringBuilder sb5) throws IOException {
        if (r1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (m1 m1Var : list) {
            Iterator it = pq.v.f0(m1Var.getUpperBounds(), 1).iterator();
            while (it.hasNext()) {
                arrayList.add(R(m1Var.getName(), false) + " : " + S((t0) it.next()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb5.append(" ");
        sb5.append(X1("where"));
        sb5.append(" ");
        pq.g0.s0(arrayList, sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence L1(t1 t1Var) {
        return "";
    }

    private final boolean L2(t0 t0Var) {
        if (!sr.i.p(t0Var)) {
            return false;
        }
        List<d2> listR0 = t0Var.R0();
        if ((listR0 instanceof Collection) && listR0.isEmpty()) {
            return true;
        }
        Iterator<T> it = listR0.iterator();
        while (it.hasNext()) {
            if (((d2) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    private final void M1(List<? extends c1> list, StringBuilder sb5) {
        if (list.isEmpty()) {
            return;
        }
        sb5.append("context(");
        int i15 = 0;
        for (c1 c1Var : list) {
            int i16 = i15 + 1;
            C1(sb5, c1Var, wr.e.RECEIVER);
            sb5.append(S1(c1Var.getType()));
            if (i15 == pq.v.p(list)) {
                sb5.append(") ");
            } else {
                sb5.append(", ");
            }
            i15 = i16;
        }
    }

    private final boolean M2(boolean z15) {
        int i15 = b.f37688b[P0().ordinal()];
        if (i15 == 1) {
            return true;
        }
        if (i15 == 2) {
            return !z15;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    private final void N1(StringBuilder sb5, t0 t0Var) {
        D1(this, sb5, t0Var, null, 2, null);
        st.z zVar = t0Var instanceof st.z ? (st.z) t0Var : null;
        e1 e1VarF1 = zVar != null ? zVar.f1() : null;
        if (x0.a(t0Var)) {
            if (xt.d.z(t0Var) && R0()) {
                sb5.append(O1(ut.l.f201331a.p(t0Var)));
            } else {
                if (!(t0Var instanceof ut.i) || K0()) {
                    sb5.append(t0Var.T0().toString());
                } else {
                    sb5.append(((ut.i) t0Var).c1());
                }
                sb5.append(w2(t0Var.R0()));
            }
        } else if (t0Var instanceof n1) {
            sb5.append(((n1) t0Var).c1().toString());
        } else if (e1VarF1 instanceof n1) {
            sb5.append(((n1) e1VarF1).c1().toString());
        } else {
            A2(this, sb5, t0Var, null, 2, null);
            oq.i0 i0Var = oq.i0.f148189a;
        }
        if (t0Var.U0()) {
            sb5.append("?");
        }
        if (i1.c(t0Var)) {
            sb5.append(" & Any");
        }
    }

    private final String O1(String str) {
        int i15 = b.f37687a[h1().ordinal()];
        if (i15 == 1) {
            return str;
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void P1(StringBuilder sb5, st.a aVar) {
        h0 h0VarH1 = h1();
        h0 h0Var = h0.HTML;
        if (h0VarH1 == h0Var) {
            sb5.append("<font color=\"808080\"><i>");
        }
        sb5.append(" /* ");
        sb5.append("= ");
        g2(sb5, aVar.K());
        sb5.append(" */");
        if (h1() == h0Var) {
            sb5.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Q1(w wVar, sr.j jVar) {
        return fu.r.o1(wVar.B0().a(jVar.x(), wVar), "Collection", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String R1(w wVar, sr.j jVar) {
        return fu.r.o1(wVar.B0().a(jVar.j(), wVar), "Array", null, 2, null);
    }

    private final String S1(t0 t0Var) {
        String strS = S(t0Var);
        if ((!L2(t0Var) || l2.l(t0Var)) && !(t0Var instanceof st.z)) {
            return strS;
        }
        return '(' + strS + ')';
    }

    private final String T1(List<zs.f> list) {
        return t0(j0.g(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(vr.z zVar, StringBuilder sb5) throws IOException {
        vr.z zVar2;
        StringBuilder sb6;
        if (g1()) {
            zVar2 = zVar;
            sb6 = sb5;
        } else {
            if (f1()) {
                zVar2 = zVar;
                sb6 = sb5;
            } else {
                M1(zVar.B0(), sb5);
                zVar2 = zVar;
                sb6 = sb5;
                D1(this, sb6, zVar2, null, 2, null);
                J2(zVar2.h(), sb6);
                c2(zVar2, sb6);
                if (G0()) {
                    Z1(zVar2, sb6);
                }
                h2(zVar2, sb6);
                if (G0()) {
                    A1(zVar2, sb6);
                } else {
                    u2(zVar2, sb6);
                }
                Y1(zVar2, sb6);
                if (m1()) {
                    if (zVar2.G0()) {
                        sb6.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (zVar2.J0()) {
                        sb6.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb6.append(X1("fun"));
            sb6.append(" ");
            D2(zVar2.getTypeParameters(), sb6, true);
            o2(zVar2, sb6);
        }
        e2(zVar2, sb6, true);
        H2(zVar2.l(), zVar2.l0(), sb6);
        p2(zVar2, sb6);
        t0 t0VarF = zVar2.f();
        if (!p1() && (k1() || t0VarF == null || !sr.j.D0(t0VarF))) {
            sb6.append(": ");
            sb6.append(t0VarF == null ? "[NULL]" : S(t0VarF));
        }
        K2(zVar2.getTypeParameters(), sb6);
    }

    private final void V1(StringBuilder sb5, t0 t0Var) {
        int length = sb5.length();
        D1(F0(), sb5, t0Var, null, 2, null);
        boolean z15 = sb5.length() != length;
        t0 t0VarK = sr.i.k(t0Var);
        List<t0> listE = sr.i.e(t0Var);
        boolean zS = sr.i.s(t0Var);
        boolean zU0 = t0Var.U0();
        boolean z16 = zU0 || (z15 && t0VarK != null);
        if (z16) {
            if (zS) {
                sb5.insert(length, '(');
            } else {
                if (z15) {
                    fu.a.c(fu.r.F1(sb5));
                    if (sb5.charAt(fu.r.k0(sb5) - 1) != ')') {
                        sb5.insert(fu.r.k0(sb5), "()");
                    }
                }
                sb5.append("(");
            }
        }
        d2(sb5, zS, "suspend");
        if (!listE.isEmpty()) {
            sb5.append("context(");
            Iterator<t0> it = listE.subList(0, pq.v.p(listE)).iterator();
            while (it.hasNext()) {
                f2(sb5, it.next());
                sb5.append(", ");
            }
            f2(sb5, (t0) pq.v.x0(listE));
            sb5.append(") ");
        }
        if (t0VarK != null) {
            boolean z17 = (L2(t0VarK) && !t0VarK.U0()) || t1(t0VarK) || (t0VarK instanceof st.z);
            if (z17) {
                sb5.append("(");
            }
            f2(sb5, t0VarK);
            if (z17) {
                sb5.append(")");
            }
            sb5.append(".");
        }
        sb5.append("(");
        if (!sr.i.n(t0Var) || t0Var.R0().size() > 1) {
            int i15 = 0;
            for (d2 d2Var : sr.i.m(t0Var)) {
                int i16 = i15 + 1;
                if (i15 > 0) {
                    sb5.append(", ");
                }
                zs.f fVarD = Q0() ? sr.i.d(d2Var.getType()) : null;
                if (fVarD != null) {
                    sb5.append(R(fVarD, false));
                    sb5.append(": ");
                }
                sb5.append(T(d2Var));
                i15 = i16;
            }
        } else {
            sb5.append("???");
        }
        sb5.append(") ");
        sb5.append(s0());
        sb5.append(" ");
        f2(sb5, sr.i.l(t0Var));
        if (z16) {
            sb5.append(")");
        }
        if (zU0) {
            sb5.append("?");
        }
    }

    private final void W1(u1 u1Var, StringBuilder sb5) {
        ft.g<?> gVarS0;
        String strJ1;
        if (!J0() || (gVarS0 = u1Var.s0()) == null || (strJ1 = J1(gVarS0)) == null) {
            return;
        }
        sb5.append(" = ");
        sb5.append(t0(strJ1));
    }

    private final String X1(String str) {
        int i15 = b.f37687a[h1().ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new oq.p();
            }
            if (!z0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    private final void Y1(vr.b bVar, StringBuilder sb5) {
        if (L0().contains(x.MEMBER_KIND) && m1() && bVar.k() != vr.b.a.DECLARATION) {
            sb5.append("/*");
            sb5.append(au.a.f(bVar.k().name()));
            sb5.append("*/ ");
        }
    }

    private final void Z1(vr.e0 e0Var, StringBuilder sb5) {
        d2(sb5, e0Var.d0(), "external");
        boolean z15 = false;
        d2(sb5, L0().contains(x.EXPECT) && e0Var.o0(), "expect");
        if (L0().contains(x.ACTUAL) && e0Var.b0()) {
            z15 = true;
        }
        d2(sb5, z15, "actual");
    }

    private final void b2(vr.f0 f0Var, StringBuilder sb5, vr.f0 f0Var2) {
        if (Z0() || f0Var != f0Var2) {
            d2(sb5, L0().contains(x.MODALITY), au.a.f(f0Var.name()));
        }
    }

    private final void c2(vr.b bVar, StringBuilder sb5) {
        if (dt.i.J(bVar) && bVar.w() == vr.f0.FINAL) {
            return;
        }
        if (O0() == e0.RENDER_OVERRIDE && bVar.w() == vr.f0.OPEN && x1(bVar)) {
            return;
        }
        b2(bVar.w(), sb5, u1(bVar));
    }

    private final void d2(StringBuilder sb5, boolean z15, String str) {
        if (z15) {
            sb5.append(X1(str));
            sb5.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(vr.m mVar, StringBuilder sb5, boolean z15) {
        sb5.append(R(mVar.getName(), z15));
    }

    private final void f2(StringBuilder sb5, t0 t0Var) {
        o2 o2VarW0 = t0Var.W0();
        st.a aVar = o2VarW0 instanceof st.a ? (st.a) o2VarW0 : null;
        if (aVar == null) {
            g2(sb5, t0Var);
            return;
        }
        if (c1()) {
            g2(sb5, aVar.K());
            if (U0()) {
                y1(sb5, aVar);
                return;
            }
            return;
        }
        g2(sb5, aVar.f1());
        if (d1()) {
            P1(sb5, aVar);
        }
    }

    private final void g2(StringBuilder sb5, t0 t0Var) {
        if ((t0Var instanceof q2) && i() && !((q2) t0Var).Y0()) {
            sb5.append("<Not computed yet>");
            return;
        }
        o2 o2VarW0 = t0Var.W0();
        if (o2VarW0 instanceof k0) {
            sb5.append(((k0) o2VarW0).d1(this, this));
        } else {
            if (!(o2VarW0 instanceof e1)) {
                throw new oq.p();
            }
            q2(sb5, (e1) o2VarW0);
        }
    }

    private final void h2(vr.b bVar, StringBuilder sb5) {
        if (L0().contains(x.OVERRIDE) && x1(bVar) && O0() != e0.RENDER_OPEN) {
            d2(sb5, true, "override");
            if (m1()) {
                sb5.append("/*");
                sb5.append(bVar.e().size());
                sb5.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(o0 o0Var, StringBuilder sb5) {
        j2(o0Var.g(), "package-fragment", sb5);
        if (i()) {
            sb5.append(" in ");
            e2(o0Var.b(), sb5, false);
        }
    }

    private final void j2(zs.c cVar, String str, StringBuilder sb5) {
        sb5.append(X1(str));
        String strQ = Q(cVar.i());
        if (strQ.length() > 0) {
            sb5.append(" ");
            sb5.append(strQ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(v0 v0Var, StringBuilder sb5) {
        j2(v0Var.g(), "package", sb5);
        if (i()) {
            sb5.append(" in context of ");
            e2(v0Var.F0(), sb5, false);
        }
    }

    private final void l2(StringBuilder sb5, vr.x0 x0Var) {
        vr.x0 x0VarC = x0Var.c();
        if (x0VarC != null) {
            l2(sb5, x0VarC);
            sb5.append('.');
            sb5.append(R(x0Var.b().getName(), false));
        } else {
            sb5.append(x2(x0Var.b().o()));
        }
        sb5.append(w2(x0Var.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(z0 z0Var, StringBuilder sb5) throws IOException {
        z0 z0Var2;
        StringBuilder sb6;
        if (g1()) {
            z0Var2 = z0Var;
            sb6 = sb5;
        } else {
            if (!f1()) {
                M1(z0Var.B0(), sb5);
                n2(z0Var, sb5);
                J2(z0Var.h(), sb5);
                boolean z15 = false;
                d2(sb5, L0().contains(x.CONST) && z0Var.f0(), "const");
                Z1(z0Var, sb5);
                c2(z0Var, sb5);
                h2(z0Var, sb5);
                if (L0().contains(x.LATEINIT) && z0Var.C0()) {
                    z15 = true;
                }
                d2(sb5, z15, "lateinit");
                Y1(z0Var, sb5);
            }
            z0Var2 = z0Var;
            sb6 = sb5;
            F2(this, z0Var2, sb6, false, 4, null);
            D2(z0Var2.getTypeParameters(), sb6, true);
            o2(z0Var2, sb6);
        }
        e2(z0Var2, sb6, true);
        sb6.append(": ");
        sb6.append(S(z0Var2.getType()));
        p2(z0Var2, sb6);
        W1(z0Var2, sb6);
        K2(z0Var2.getTypeParameters(), sb6);
    }

    private final void n2(z0 z0Var, StringBuilder sb5) {
        if (L0().contains(x.ANNOTATIONS)) {
            D1(this, sb5, z0Var, null, 2, null);
            vr.w wVarA0 = z0Var.A0();
            if (wVarA0 != null) {
                C1(sb5, wVarA0, wr.e.FIELD);
            }
            vr.w wVarS = z0Var.S();
            if (wVarS != null) {
                C1(sb5, wVarS, wr.e.PROPERTY_DELEGATE_FIELD);
            }
            if (S0() == g0.NONE) {
                a1 a1VarD = z0Var.d();
                if (a1VarD != null) {
                    C1(sb5, a1VarD, wr.e.PROPERTY_GETTER);
                }
                b1 b1VarJ = z0Var.j();
                if (b1VarJ != null) {
                    C1(sb5, b1VarJ, wr.e.PROPERTY_SETTER);
                    C1(sb5, (t1) pq.v.P0(b1VarJ.l()), wr.e.SETTER_PARAMETER);
                }
            }
        }
    }

    private final void o2(vr.a aVar, StringBuilder sb5) {
        c1 c1VarR = aVar.R();
        if (c1VarR != null) {
            C1(sb5, c1VarR, wr.e.RECEIVER);
            sb5.append(S1(c1VarR.getType()));
            sb5.append(".");
        }
    }

    private final void p0(StringBuilder sb5, vr.m mVar) {
        vr.m mVarB;
        String name;
        if ((mVar instanceof o0) || (mVar instanceof v0) || (mVarB = mVar.b()) == null || (mVarB instanceof vr.i0)) {
            return;
        }
        sb5.append(" ");
        sb5.append(a2("defined in"));
        sb5.append(" ");
        zs.d dVarM = dt.i.m(mVarB);
        sb5.append(dVarM.e() ? "root package" : Q(dVarM));
        if (o1() && (mVarB instanceof o0) && (mVar instanceof vr.p) && (name = ((vr.p) mVar).m().b().getName()) != null) {
            sb5.append(" ");
            sb5.append(a2("in file"));
            sb5.append(" ");
            sb5.append(name);
        }
    }

    private final void p2(vr.a aVar, StringBuilder sb5) {
        c1 c1VarR;
        if (T0() && (c1VarR = aVar.R()) != null) {
            sb5.append(" on ");
            sb5.append(S(c1VarR.getType()));
        }
    }

    private final void q0(StringBuilder sb5, List<? extends d2> list) throws IOException {
        pq.g0.s0(list, sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new s(this));
    }

    private final void q2(StringBuilder sb5, e1 e1Var) {
        if (fr.t.c(e1Var, l2.f184076b) || l2.k(e1Var)) {
            sb5.append("???");
            return;
        }
        if (ut.l.o(e1Var)) {
            if (j1()) {
                sb5.append(O1(((ut.j) e1Var.T0()).f(0)));
                return;
            } else {
                sb5.append("???");
                return;
            }
        }
        if (x0.a(e1Var)) {
            N1(sb5, e1Var);
        } else if (L2(e1Var)) {
            V1(sb5, e1Var);
        } else {
            N1(sb5, e1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence r0(w wVar, d2 d2Var) {
        if (d2Var.b()) {
            return "*";
        }
        String strS = wVar.S(d2Var.getType());
        if (d2Var.c() == p2.INVARIANT) {
            return strS;
        }
        return d2Var.c() + ' ' + strS;
    }

    private final void r2(StringBuilder sb5) {
        int length = sb5.length();
        if (length == 0 || sb5.charAt(length - 1) != ' ') {
            sb5.append(' ');
        }
    }

    private final String s0() {
        int i15 = b.f37687a[h1().ordinal()];
        if (i15 == 1) {
            return t0("->");
        }
        if (i15 == 2) {
            return "&rarr;";
        }
        throw new oq.p();
    }

    private final String s1() {
        return t0(">");
    }

    private final void s2(vr.e eVar, StringBuilder sb5) throws IOException {
        if (q1() || sr.j.o0(eVar.t())) {
            return;
        }
        Collection<t0> collectionQ = eVar.o().q();
        if (collectionQ.isEmpty()) {
            return;
        }
        if (collectionQ.size() == 1 && sr.j.c0(collectionQ.iterator().next())) {
            return;
        }
        r2(sb5);
        sb5.append(": ");
        pq.g0.s0(collectionQ, sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t0(String str) {
        return h1().e(str);
    }

    private final boolean t1(t0 t0Var) {
        return sr.i.s(t0Var) || !t0Var.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence t2(w wVar, t0 t0Var) {
        return wVar.S(t0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w u0(w wVar) {
        return (w) wVar.U(v.f37682a);
    }

    private final vr.f0 u1(vr.e0 e0Var) {
        if (e0Var instanceof vr.e) {
            return ((vr.e) e0Var).k() == vr.f.INTERFACE ? vr.f0.ABSTRACT : vr.f0.FINAL;
        }
        vr.m mVarB = e0Var.b();
        vr.e eVar = mVarB instanceof vr.e ? (vr.e) mVarB : null;
        if (eVar != null && (e0Var instanceof vr.b)) {
            vr.b bVar = (vr.b) e0Var;
            if (!bVar.e().isEmpty() && eVar.w() != vr.f0.FINAL) {
                return vr.f0.OPEN;
            }
            if (eVar.k() != vr.f.INTERFACE || fr.t.c(bVar.h(), vr.t.f208076a)) {
                return vr.f0.FINAL;
            }
            vr.f0 f0VarW = bVar.w();
            vr.f0 f0Var = vr.f0.ABSTRACT;
            return f0VarW == f0Var ? f0Var : vr.f0.OPEN;
        }
        return vr.f0.FINAL;
    }

    private final void u2(vr.z zVar, StringBuilder sb5) {
        d2(sb5, zVar.u(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(y yVar) {
        yVar.k(pq.e1.l(yVar.h(), pq.v.q(sr.p.a.C, sr.p.a.D)));
        return oq.i0.f148189a;
    }

    private final boolean v1(wr.c cVar) {
        return fr.t.c(cVar.g(), sr.p.a.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v2(l1 l1Var, StringBuilder sb5) {
        D1(this, sb5, l1Var, null, 2, null);
        J2(l1Var.h(), sb5);
        Z1(l1Var, sb5);
        sb5.append(X1("typealias"));
        sb5.append(" ");
        e2(l1Var, sb5, true);
        D2(l1Var.v(), sb5, false);
        E1(l1Var, sb5);
        sb5.append(" = ");
        sb5.append(S(l1Var.x0()));
    }

    private final String w1() {
        return t0("<");
    }

    private final boolean x1(vr.b bVar) {
        return !bVar.e().isEmpty();
    }

    private final void y1(StringBuilder sb5, st.a aVar) {
        h0 h0VarH1 = h1();
        h0 h0Var = h0.HTML;
        if (h0VarH1 == h0Var) {
            sb5.append("<font color=\"808080\"><i>");
        }
        sb5.append(" /* ");
        sb5.append("from: ");
        g2(sb5, aVar.f1());
        sb5.append(" */");
        if (h1() == h0Var) {
            sb5.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object y2(t0 t0Var) {
        return t0Var instanceof n1 ? ((n1) t0Var).c1() : t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(y0 y0Var, StringBuilder sb5) {
        Z1(y0Var, sb5);
    }

    private final void z2(StringBuilder sb5, t0 t0Var, x1 x1Var) {
        vr.x0 x0VarD = q1.d(t0Var);
        if (x0VarD != null) {
            l2(sb5, x0VarD);
        } else {
            sb5.append(x2(x1Var));
            sb5.append(w2(t0Var.R0()));
        }
    }

    public boolean A0() {
        return this.f37683m.y();
    }

    public ct.b B0() {
        return this.f37683m.z();
    }

    public er.l<t1, String> C0() {
        return this.f37683m.A();
    }

    public boolean D0() {
        return this.f37683m.B();
    }

    public Set<zs.c> E0() {
        return this.f37683m.C();
    }

    public boolean G0() {
        return this.f37683m.D();
    }

    public boolean H0() {
        return this.f37683m.E();
    }

    public String H1(vr.h hVar) {
        return ut.l.m(hVar) ? hVar.o().toString() : B0().a(hVar, this);
    }

    public boolean I0() {
        return this.f37683m.F();
    }

    public boolean J0() {
        return this.f37683m.G();
    }

    public boolean K0() {
        return this.f37683m.H();
    }

    public Set<x> L0() {
        return this.f37683m.I();
    }

    @Override // ct.n
    public String M(vr.m mVar) {
        StringBuilder sb5 = new StringBuilder();
        mVar.z0(new a(), sb5);
        if (n1()) {
            p0(sb5, mVar);
        }
        return sb5.toString();
    }

    public boolean M0() {
        return this.f37683m.J();
    }

    @Override // ct.n
    public String N(wr.c cVar, wr.e eVar) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('@');
        if (eVar != null) {
            sb5.append(eVar.e() + ':');
        }
        t0 type = cVar.getType();
        sb5.append(S(type));
        if (H0()) {
            List<String> listB1 = B1(cVar);
            if (I0() || !listB1.isEmpty()) {
                pq.g0.s0(listB1, sb5, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (m1() && (x0.a(type) || (type.T0().c() instanceof n0.b))) {
            sb5.append(" /* annotation class not found */");
        }
        return sb5.toString();
    }

    public final b0 N0() {
        return this.f37683m;
    }

    public e0 O0() {
        return this.f37683m.K();
    }

    @Override // ct.n
    public String P(String str, String str2, sr.j jVar) {
        if (j0.j(str, str2)) {
            if (!fu.r.V(str2, "(", false, 2, null)) {
                return str + '!';
            }
            return '(' + str + ")!";
        }
        String strD = j0.d(str, str2, new p(this, jVar), new q(this, jVar), new c(this));
        if (strD != null) {
            return strD;
        }
        return '(' + str + ".." + str2 + ')';
    }

    public f0 P0() {
        return this.f37683m.L();
    }

    @Override // ct.n
    public String Q(zs.d dVar) {
        return T1(dVar.h());
    }

    public boolean Q0() {
        return this.f37683m.M();
    }

    @Override // ct.n
    public String R(zs.f fVar, boolean z15) {
        String strT0 = t0(j0.c(fVar));
        if (!z0() || h1() != h0.HTML || !z15) {
            return strT0;
        }
        return "<b>" + strT0 + "</b>";
    }

    public boolean R0() {
        return this.f37683m.N();
    }

    @Override // ct.n
    public String S(t0 t0Var) {
        StringBuilder sb5 = new StringBuilder();
        f2(sb5, i1().b(t0Var));
        return sb5.toString();
    }

    public g0 S0() {
        return this.f37683m.O();
    }

    @Override // ct.n
    public String T(d2 d2Var) throws IOException {
        StringBuilder sb5 = new StringBuilder();
        q0(sb5, pq.v.e(d2Var));
        return sb5.toString();
    }

    public boolean T0() {
        return this.f37683m.Q();
    }

    public boolean U0() {
        return this.f37683m.R();
    }

    public boolean V0() {
        return this.f37683m.S();
    }

    public boolean W0() {
        return this.f37683m.T();
    }

    public boolean X0() {
        return this.f37683m.U();
    }

    public boolean Y0() {
        return this.f37683m.V();
    }

    public boolean Z0() {
        return this.f37683m.W();
    }

    @Override // ct.y
    public void a(h0 h0Var) {
        this.f37683m.a(h0Var);
    }

    public boolean a1() {
        return this.f37683m.X();
    }

    public String a2(String str) {
        int i15 = b.f37687a[h1().ordinal()];
        if (i15 == 1) {
            return str;
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        return "<i>" + str + "</i>";
    }

    @Override // ct.y
    public void b(boolean z15) {
        this.f37683m.b(z15);
    }

    public boolean b1() {
        return this.f37683m.Y();
    }

    @Override // ct.y
    public void c(boolean z15) {
        this.f37683m.c(z15);
    }

    public boolean c1() {
        return this.f37683m.Z();
    }

    @Override // ct.y
    public boolean d() {
        return this.f37683m.d();
    }

    public boolean d1() {
        return this.f37683m.a0();
    }

    @Override // ct.y
    public void e(boolean z15) {
        this.f37683m.e(z15);
    }

    public boolean e1() {
        return this.f37683m.b0();
    }

    @Override // ct.y
    public void f(boolean z15) {
        this.f37683m.f(z15);
    }

    public boolean f1() {
        return this.f37683m.c0();
    }

    @Override // ct.y
    public void g(ct.b bVar) {
        this.f37683m.g(bVar);
    }

    public boolean g1() {
        return this.f37683m.d0();
    }

    @Override // ct.y
    public Set<zs.c> h() {
        return this.f37683m.h();
    }

    public h0 h1() {
        return this.f37683m.e0();
    }

    @Override // ct.y
    public boolean i() {
        return this.f37683m.i();
    }

    public er.l<t0, t0> i1() {
        return this.f37683m.f0();
    }

    @Override // ct.y
    public ct.a j() {
        return this.f37683m.j();
    }

    public boolean j1() {
        return this.f37683m.g0();
    }

    @Override // ct.y
    public void k(Set<zs.c> set) {
        this.f37683m.k(set);
    }

    public boolean k1() {
        return this.f37683m.h0();
    }

    @Override // ct.y
    public void l(Set<? extends x> set) {
        this.f37683m.l(set);
    }

    public n.b l1() {
        return this.f37683m.i0();
    }

    @Override // ct.y
    public void m(boolean z15) {
        this.f37683m.m(z15);
    }

    public boolean m1() {
        return this.f37683m.j0();
    }

    @Override // ct.y
    public void n(boolean z15) {
        this.f37683m.n(z15);
    }

    public boolean n1() {
        return this.f37683m.k0();
    }

    @Override // ct.y
    public void o(f0 f0Var) {
        this.f37683m.o(f0Var);
    }

    public boolean o1() {
        return this.f37683m.l0();
    }

    @Override // ct.y
    public void p(boolean z15) {
        this.f37683m.p(z15);
    }

    public boolean p1() {
        return this.f37683m.m0();
    }

    public boolean q1() {
        return this.f37683m.n0();
    }

    public boolean r1() {
        return this.f37683m.o0();
    }

    public boolean w0() {
        return this.f37683m.u();
    }

    public String w2(List<? extends d2> list) throws IOException {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(w1());
        q0(sb5, list);
        sb5.append(s1());
        return sb5.toString();
    }

    public boolean x0() {
        return this.f37683m.v();
    }

    public String x2(x1 x1Var) {
        vr.h hVarC = x1Var.c();
        if ((hVarC instanceof m1) || (hVarC instanceof vr.e) || (hVarC instanceof l1)) {
            return H1(hVarC);
        }
        if (hVarC == null) {
            return x1Var instanceof s0 ? ((s0) x1Var).m(r.f37678a) : x1Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + hVarC.getClass()).toString());
    }

    public er.l<wr.c, Boolean> y0() {
        return this.f37683m.w();
    }

    public boolean z0() {
        return this.f37683m.x();
    }
}
