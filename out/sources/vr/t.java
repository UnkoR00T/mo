package vr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f208076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f208077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f208078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f208079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f208080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f208081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f208082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f208083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f208084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<u> f208085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<u, Integer> f208086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f208087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final mt.g f208088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mt.g f208089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final mt.g f208090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final zt.l f208091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<x1, u> f208092q;

    static class a implements mt.g {
        a() {
        }

        @Override // mt.g
        public st.t0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class b implements mt.g {
        b() {
        }

        @Override // mt.g
        public st.t0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class c implements mt.g {
        c() {
        }

        @Override // mt.g
        public st.t0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    static class d extends r {
        d(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "what";
            } else if (i15 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i15 == 1 || i15 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(m mVar) {
            if (mVar == null) {
                g(0);
            }
            return dt.i.j(mVar) != i1.f208053a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == 0) {
                g(1);
            }
            if (mVar == null) {
                g(2);
            }
            if (dt.i.J(qVar) && h(mVar)) {
                return t.f(qVar, mVar);
            }
            if (qVar instanceof vr.l) {
                vr.i iVarB = ((vr.l) qVar).b();
                if (z15 && dt.i.G(iVarB) && dt.i.J(iVarB) && (mVar instanceof vr.l) && dt.i.J(mVar.b()) && t.f(qVar, mVar)) {
                    return true;
                }
            }
            while (qVar != 0) {
                qVar = qVar.b();
                if (((qVar instanceof vr.e) && !dt.i.x(qVar)) || (qVar instanceof o0)) {
                    break;
                }
            }
            if (qVar == 0) {
                return false;
            }
            while (mVar != null) {
                if (qVar == mVar) {
                    return true;
                }
                if (mVar instanceof o0) {
                    return (qVar instanceof o0) && ((o0) qVar).g().equals(((o0) mVar).g()) && dt.i.b(mVar, qVar);
                }
                mVar = mVar.b();
            }
            return false;
        }
    }

    static class e extends r {
        e(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            m mVarQ;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (t.f208076a.e(gVar, qVar, mVar, z15)) {
                if (gVar == t.f208089n) {
                    return true;
                }
                if (gVar != t.f208088m && (mVarQ = dt.i.q(qVar, vr.e.class)) != null && (gVar instanceof mt.i)) {
                    return ((mt.i) gVar).y().a().equals(mVarQ.a());
                }
            }
            return false;
        }
    }

    static class f extends r {
        f(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "from";
            } else if (i15 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i15 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i15 == 2 || i15 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(mt.g gVar, q qVar, vr.e eVar) {
            if (qVar == null) {
                g(2);
            }
            if (eVar == null) {
                g(3);
            }
            if (gVar == t.f208090o) {
                return false;
            }
            if (!(qVar instanceof vr.b) || (qVar instanceof vr.l) || gVar == t.f208089n) {
                return true;
            }
            if (gVar == t.f208088m || gVar == null) {
                return false;
            }
            st.t0 t0VarB = gVar instanceof mt.h ? ((mt.h) gVar).b() : gVar.getType();
            return dt.i.I(t0VarB, eVar) || st.g0.a(t0VarB);
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            vr.e eVar;
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            vr.e eVar2 = (vr.e) dt.i.q(qVar, vr.e.class);
            vr.e eVar3 = (vr.e) dt.i.r(mVar, vr.e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && dt.i.x(eVar2) && (eVar = (vr.e) dt.i.q(eVar2, vr.e.class)) != null && dt.i.H(eVar3, eVar)) {
                return true;
            }
            q qVarM = dt.i.M(qVar);
            vr.e eVar4 = (vr.e) dt.i.q(qVarM, vr.e.class);
            if (eVar4 == null) {
                return false;
            }
            if (dt.i.H(eVar3, eVar4) && h(gVar, qVarM, eVar3)) {
                return true;
            }
            return e(gVar, qVar, eVar3.b(), z15);
        }
    }

    static class g extends r {
        g(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            if (dt.i.g(mVar).C(dt.i.g(qVar))) {
                return t.f208091p.a(qVar, mVar);
            }
            return false;
        }
    }

    static class h extends r {
        h(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return true;
        }
    }

    static class i extends r {
        i(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    static class j extends r {
        j(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    static class k extends r {
        k(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static class l extends r {
        l(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, q qVar, m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(w1.e.f208101c);
        f208076a = dVar;
        e eVar = new e(w1.f.f208102c);
        f208077b = eVar;
        f fVar = new f(w1.g.f208103c);
        f208078c = fVar;
        g gVar = new g(w1.b.f208098c);
        f208079d = gVar;
        h hVar = new h(w1.h.f208104c);
        f208080e = hVar;
        i iVar = new i(w1.d.f208100c);
        f208081f = iVar;
        j jVar = new j(w1.a.f208097c);
        f208082g = jVar;
        k kVar = new k(w1.c.f208099c);
        f208083h = kVar;
        l lVar = new l(w1.i.f208105c);
        f208084i = lVar;
        f208085j = Collections.unmodifiableSet(pq.e1.i(dVar, eVar, gVar, iVar));
        HashMap mapE = cu.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f208086k = Collections.unmodifiableMap(mapE);
        f208087l = hVar;
        f208088m = new a();
        f208089n = new b();
        f208090o = new c();
        Iterator it = ServiceLoader.load(zt.l.class, zt.l.class.getClassLoader()).iterator();
        f208091p = it.hasNext() ? (zt.l) it.next() : zt.l.a.f237231a;
        f208092q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    private static /* synthetic */ void a(int i15) {
        String str = i15 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 16 ? 3 : 2];
        if (i15 != 1 && i15 != 3 && i15 != 5 && i15 != 7) {
            switch (i15) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i15 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i15) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer d(u uVar, u uVar2) {
        if (uVar == null) {
            a(12);
        }
        if (uVar2 == null) {
            a(13);
        }
        Integer numA = uVar.a(uVar2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = uVar2.a(uVar);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static q e(mt.g gVar, q qVar, m mVar, boolean z15) {
        q qVarE;
        if (qVar == null) {
            a(8);
        }
        if (mVar == null) {
            a(9);
        }
        for (q qVar2 = (q) qVar.a(); qVar2 != null && qVar2.h() != f208081f; qVar2 = (q) dt.i.q(qVar2, q.class)) {
            if (!qVar2.h().e(gVar, qVar2, mVar, z15)) {
                return qVar2;
            }
        }
        if (!(qVar instanceof yr.q0) || (qVarE = e(gVar, ((yr.q0) qVar).U(), mVar, z15)) == null) {
            return null;
        }
        return qVarE;
    }

    public static boolean f(m mVar, m mVar2) {
        if (mVar == null) {
            a(6);
        }
        if (mVar2 == null) {
            a(7);
        }
        i1 i1VarJ = dt.i.j(mVar2);
        if (i1VarJ != i1.f208053a) {
            return i1VarJ.equals(dt.i.j(mVar));
        }
        return false;
    }

    public static boolean g(u uVar) {
        if (uVar == null) {
            a(14);
        }
        return uVar == f208076a || uVar == f208077b;
    }

    public static boolean h(q qVar, m mVar, boolean z15) {
        if (qVar == null) {
            a(2);
        }
        if (mVar == null) {
            a(3);
        }
        return e(f208089n, qVar, mVar, z15) == null;
    }

    private static void i(u uVar) {
        f208092q.put(uVar.b(), uVar);
    }

    public static u j(x1 x1Var) {
        if (x1Var == null) {
            a(15);
        }
        u uVar = f208092q.get(x1Var);
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x1Var);
    }
}
