package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import st.e1;
import st.p2;
import st.t1;
import st.x1;
import vr.h1;
import vr.k1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends n implements m1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p2 f228781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f228782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f228783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rt.i<x1> f228784h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rt.i<e1> f228785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rt.n f228786k;

    class a implements er.a<x1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ rt.n f228787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1 f228788b;

        a(rt.n nVar, k1 k1Var) {
            this.f228787a = nVar;
            this.f228788b = k1Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x1 a() {
            return new c(h.this, this.f228787a, this.f228788b);
        }
    }

    class b implements er.a<e1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zs.f f228790a;

        class a implements er.a<lt.k> {
            a() {
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public lt.k a() {
                return lt.x.m("Scope for type parameter " + b.this.f228790a.e(), h.this.getUpperBounds());
            }
        }

        b(zs.f fVar) {
            this.f228790a = fVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e1 a() {
            return st.w0.m(t1.f184126b.k(), h.this.o(), Collections.EMPTY_LIST, false, new lt.i(new a()));
        }
    }

    private class c extends st.q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k1 f228793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f228794e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, rt.n nVar, k1 k1Var) {
            super(nVar);
            if (nVar == null) {
                I(0);
            }
            this.f228794e = hVar;
            this.f228793d = k1Var;
        }

        private static /* synthetic */ void I(int i15) {
            String str = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5 || i15 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5 || i15 == 8) ? 2 : 3];
            switch (i15) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i15 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i15 == 2) {
                objArr[1] = "getParameters";
            } else if (i15 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i15 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i15 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i15 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i15) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5 && i15 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // st.q
        protected void A(st.t0 t0Var) {
            if (t0Var == null) {
                I(6);
            }
            this.f228794e.Q0(t0Var);
        }

        @Override // st.w, st.x1
        public vr.h c() {
            h hVar = this.f228794e;
            if (hVar == null) {
                I(3);
            }
            return hVar;
        }

        @Override // st.x1
        public boolean d() {
            return true;
        }

        @Override // st.w
        protected boolean g(vr.h hVar) {
            if (hVar == null) {
                I(9);
            }
            return (hVar instanceof m1) && dt.g.f44479a.m(this.f228794e, (m1) hVar, true);
        }

        @Override // st.x1
        public List<m1> getParameters() {
            List<m1> list = Collections.EMPTY_LIST;
            if (list == null) {
                I(2);
            }
            return list;
        }

        @Override // st.x1
        public sr.j i() {
            sr.j jVarM = ht.e.m(this.f228794e);
            if (jVarM == null) {
                I(4);
            }
            return jVarM;
        }

        @Override // st.q
        protected Collection<st.t0> r() {
            List<st.t0> listR0 = this.f228794e.R0();
            if (listR0 == null) {
                I(1);
            }
            return listR0;
        }

        @Override // st.q
        protected st.t0 s() {
            return ut.l.d(ut.k.f201323x, new String[0]);
        }

        public String toString() {
            return this.f228794e.getName().toString();
        }

        @Override // st.q
        protected k1 w() {
            k1 k1Var = this.f228793d;
            if (k1Var == null) {
                I(5);
            }
            return k1Var;
        }

        @Override // st.q
        protected List<st.t0> y(List<st.t0> list) {
            if (list == null) {
                I(7);
            }
            List<st.t0> listM0 = this.f228794e.M0(list);
            if (listM0 == null) {
                I(8);
            }
            return listM0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected h(rt.n nVar, vr.m mVar, wr.h hVar, zs.f fVar, p2 p2Var, boolean z15, int i15, h1 h1Var, k1 k1Var) {
        super(mVar, hVar, fVar, h1Var);
        if (nVar == null) {
            m0(0);
        }
        if (mVar == null) {
            m0(1);
        }
        if (hVar == null) {
            m0(2);
        }
        if (fVar == null) {
            m0(3);
        }
        if (p2Var == null) {
            m0(4);
        }
        if (h1Var == null) {
            m0(5);
        }
        if (k1Var == null) {
            m0(6);
        }
        this.f228781e = p2Var;
        this.f228782f = z15;
        this.f228783g = i15;
        this.f228784h = nVar.d(new a(nVar, k1Var));
        this.f228785j = nVar.d(new b(fVar));
        this.f228786k = nVar;
    }

    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i16 = 2;
                break;
            case 12:
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i15) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // vr.m1
    public boolean B() {
        return this.f228782f;
    }

    protected List<st.t0> M0(List<st.t0> list) {
        if (list == null) {
            m0(12);
        }
        if (list == null) {
            m0(13);
        }
        return list;
    }

    @Override // vr.m1
    public rt.n P() {
        rt.n nVar = this.f228786k;
        if (nVar == null) {
            m0(14);
        }
        return nVar;
    }

    protected abstract void Q0(st.t0 t0Var);

    protected abstract List<st.t0> R0();

    @Override // vr.m1
    public boolean T() {
        return false;
    }

    @Override // vr.m1
    public int getIndex() {
        return this.f228783g;
    }

    @Override // vr.m1
    public List<st.t0> getUpperBounds() {
        List<st.t0> listQ = ((c) o()).q();
        if (listQ == null) {
            m0(8);
        }
        return listQ;
    }

    @Override // vr.m1, vr.h
    public final x1 o() {
        x1 x1VarA = this.f228784h.a();
        if (x1VarA == null) {
            m0(9);
        }
        return x1VarA;
    }

    @Override // vr.m1
    public p2 q() {
        p2 p2Var = this.f228781e;
        if (p2Var == null) {
            m0(7);
        }
        return p2Var;
    }

    @Override // vr.h
    public e1 t() {
        e1 e1VarA = this.f228785j.a();
        if (e1VarA == null) {
            m0(10);
        }
        return e1VarA;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.a(this, d15);
    }

    @Override // yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1 Q0() {
        m1 m1Var = (m1) super.Q0();
        if (m1Var == null) {
            m0(11);
        }
        return m1Var;
    }
}
