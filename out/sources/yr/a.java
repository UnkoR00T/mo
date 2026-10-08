package yr;

import java.util.Collections;
import java.util.List;
import st.e1;
import st.g2;
import st.i2;
import st.l2;
import vr.c1;
import vr.l1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.f f228739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final rt.i<e1> f228740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i<lt.k> f228741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.i<c1> f228742e;

    /* JADX INFO: renamed from: yr.a$a, reason: collision with other inner class name */
    class C6146a implements er.a<e1> {

        /* JADX INFO: renamed from: yr.a$a$a, reason: collision with other inner class name */
        class C6147a implements er.l<tt.g, e1> {
            C6147a() {
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public e1 b(tt.g gVar) {
                vr.h hVarF = gVar.f(a.this);
                if (hVarF == null) {
                    return a.this.f228740c.a();
                }
                if (hVarF instanceof l1) {
                    return st.w0.c((l1) hVarF, l2.g(hVarF.o().getParameters()));
                }
                return hVarF instanceof z ? l2.u(hVarF.o().a(gVar), ((z) hVarF).I0(gVar), this) : hVarF.t();
            }
        }

        C6146a() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e1 a() {
            a aVar = a.this;
            return l2.v(aVar, aVar.a0(), new C6147a());
        }
    }

    class b implements er.a<lt.k> {
        b() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public lt.k a() {
            return new lt.g(a.this.a0());
        }
    }

    class c implements er.a<c1> {
        c() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c1 a() {
            return new t(a.this);
        }
    }

    public a(rt.n nVar, zs.f fVar) {
        if (nVar == null) {
            K0(0);
        }
        if (fVar == null) {
            K0(1);
        }
        this.f228739b = fVar;
        this.f228740c = nVar.d(new C6146a());
        this.f228741d = nVar.d(new b());
        this.f228742e = nVar.d(new c());
    }

    private static /* synthetic */ void K0(int i15) {
        String str = (i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5 || i15 == 6 || i15 == 9 || i15 == 12 || i15 == 14 || i15 == 16 || i15 == 17 || i15 == 19 || i15 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 2 || i15 == 3 || i15 == 4 || i15 == 5 || i15 == 6 || i15 == 9 || i15 == 12 || i15 == 14 || i15 == 16 || i15 == 17 || i15 == 19 || i15 == 20) ? 2 : 3];
        switch (i15) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i15 == 2) {
            objArr[1] = "getName";
        } else if (i15 == 3) {
            objArr[1] = "getOriginal";
        } else if (i15 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i15 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i15 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i15 == 9 || i15 == 12 || i15 == 14 || i15 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i15 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i15 == 19) {
            objArr[1] = "substitute";
        } else if (i15 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i15) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5 && i15 != 6 && i15 != 9 && i15 != 12 && i15 != 14 && i15 != 16 && i15 != 17 && i15 != 19 && i15 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // vr.j1
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public vr.e c(i2 i2Var) {
        if (i2Var == null) {
            K0(18);
        }
        return i2Var.l() ? this : new y(this, i2Var);
    }

    @Override // vr.e
    public lt.k O(g2 g2Var) {
        if (g2Var == null) {
            K0(15);
        }
        lt.k kVarM0 = m0(g2Var, ht.e.r(dt.i.g(this)));
        if (kVarM0 == null) {
            K0(16);
        }
        return kVarM0;
    }

    @Override // vr.e
    public c1 P0() {
        c1 c1VarA = this.f228742e.a();
        if (c1VarA == null) {
            K0(5);
        }
        return c1VarA;
    }

    @Override // vr.e
    public lt.k X() {
        lt.k kVarA = this.f228741d.a();
        if (kVarA == null) {
            K0(4);
        }
        return kVarA;
    }

    @Override // vr.e
    public lt.k a0() {
        lt.k kVarI0 = I0(ht.e.r(dt.i.g(this)));
        if (kVarI0 == null) {
            K0(17);
        }
        return kVarI0;
    }

    @Override // vr.e
    public List<c1> c0() {
        List<c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            K0(6);
        }
        return list;
    }

    @Override // vr.k0
    public zs.f getName() {
        zs.f fVar = this.f228739b;
        if (fVar == null) {
            K0(2);
        }
        return fVar;
    }

    @Override // yr.z
    public lt.k m0(g2 g2Var, tt.g gVar) {
        if (g2Var == null) {
            K0(10);
        }
        if (gVar == null) {
            K0(11);
        }
        if (!g2Var.f()) {
            return new lt.t(I0(gVar), i2.h(g2Var));
        }
        lt.k kVarI0 = I0(gVar);
        if (kVarI0 == null) {
            K0(12);
        }
        return kVarI0;
    }

    @Override // vr.e, vr.h
    public e1 t() {
        e1 e1VarA = this.f228740c.a();
        if (e1VarA == null) {
            K0(20);
        }
        return e1VarA;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.d(this, d15);
    }

    @Override // yr.z, vr.m
    public vr.e a() {
        return this;
    }
}
