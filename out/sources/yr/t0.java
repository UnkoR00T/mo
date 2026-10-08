package yr;

import java.util.ArrayList;
import java.util.List;
import st.p2;
import vr.h1;
import vr.k1;
import vr.m1;

/* JADX INFO: loaded from: classes4.dex */
public class t0 extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final er.l<st.t0, Void> f228926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<st.t0> f228927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f228928n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private t0(vr.m mVar, wr.h hVar, boolean z15, p2 p2Var, zs.f fVar, int i15, h1 h1Var, er.l<st.t0, Void> lVar, k1 k1Var, rt.n nVar) {
        super(nVar, mVar, hVar, fVar, p2Var, z15, i15, h1Var, k1Var);
        if (mVar == null) {
            m0(19);
        }
        if (hVar == null) {
            m0(20);
        }
        if (p2Var == null) {
            m0(21);
        }
        if (fVar == null) {
            m0(22);
        }
        if (h1Var == null) {
            m0(23);
        }
        if (k1Var == null) {
            m0(24);
        }
        if (nVar == null) {
            m0(25);
        }
        this.f228927m = new ArrayList(1);
        this.f228928n = false;
        this.f228926l = lVar;
    }

    private void T0() {
        if (this.f228928n) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + a1());
    }

    private void U0() {
        if (this.f228928n) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + a1());
        }
    }

    public static t0 V0(vr.m mVar, wr.h hVar, boolean z15, p2 p2Var, zs.f fVar, int i15, h1 h1Var, er.l<st.t0, Void> lVar, k1 k1Var, rt.n nVar) {
        if (mVar == null) {
            m0(12);
        }
        if (hVar == null) {
            m0(13);
        }
        if (p2Var == null) {
            m0(14);
        }
        if (fVar == null) {
            m0(15);
        }
        if (h1Var == null) {
            m0(16);
        }
        if (k1Var == null) {
            m0(17);
        }
        if (nVar == null) {
            m0(18);
        }
        return new t0(mVar, hVar, z15, p2Var, fVar, i15, h1Var, lVar, k1Var, nVar);
    }

    public static t0 W0(vr.m mVar, wr.h hVar, boolean z15, p2 p2Var, zs.f fVar, int i15, h1 h1Var, rt.n nVar) {
        if (mVar == null) {
            m0(6);
        }
        if (hVar == null) {
            m0(7);
        }
        if (p2Var == null) {
            m0(8);
        }
        if (fVar == null) {
            m0(9);
        }
        if (h1Var == null) {
            m0(10);
        }
        if (nVar == null) {
            m0(11);
        }
        return V0(mVar, hVar, z15, p2Var, fVar, i15, h1Var, null, k1.a.f208057a, nVar);
    }

    public static m1 X0(vr.m mVar, wr.h hVar, boolean z15, p2 p2Var, zs.f fVar, int i15, rt.n nVar) {
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (p2Var == null) {
            m0(2);
        }
        if (fVar == null) {
            m0(3);
        }
        if (nVar == null) {
            m0(4);
        }
        t0 t0VarW0 = W0(mVar, hVar, z15, p2Var, fVar, i15, h1.f208052a, nVar);
        t0VarW0.S0(ht.e.m(mVar).z());
        t0VarW0.b1();
        return t0VarW0;
    }

    private void Y0(st.t0 t0Var) {
        if (st.x0.a(t0Var)) {
            return;
        }
        this.f228927m.add(t0Var);
    }

    private String a1() {
        return getName() + " declared in " + dt.i.m(b());
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 5 || i15 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 5 || i15 == 28) ? 2 : 3];
        switch (i15) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i15 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i15 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i15) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 5 && i15 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yr.h
    protected void Q0(st.t0 t0Var) {
        if (t0Var == null) {
            m0(27);
        }
        er.l<st.t0, Void> lVar = this.f228926l;
        if (lVar == null) {
            return;
        }
        lVar.b(t0Var);
    }

    @Override // yr.h
    protected List<st.t0> R0() {
        T0();
        List<st.t0> list = this.f228927m;
        if (list == null) {
            m0(28);
        }
        return list;
    }

    public void S0(st.t0 t0Var) {
        if (t0Var == null) {
            m0(26);
        }
        U0();
        Y0(t0Var);
    }

    public boolean Z0() {
        return this.f228928n;
    }

    public void b1() {
        U0();
        this.f228928n = true;
    }
}
