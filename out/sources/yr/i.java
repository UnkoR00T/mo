package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import st.i2;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public class i extends s implements vr.d {
    protected final boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected i(vr.e eVar, vr.l lVar, wr.h hVar, boolean z15, vr.b.a aVar, h1 h1Var) {
        super(eVar, lVar, hVar, zs.h.f236664j, aVar, h1Var);
        if (eVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (aVar == null) {
            m0(2);
        }
        if (h1Var == null) {
            m0(3);
        }
        this.H = z15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        if (i15 != 21 && i15 != 27) {
            switch (i15) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 21 && i15 != 27) {
            switch (i15) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i16 = 2;
                    break;
                default:
                    i16 = 3;
                    break;
            }
        } else {
            i16 = 2;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i15 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i15 != 27) {
            switch (i15) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i15) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 21 && i15 != 27) {
            switch (i15) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    private List<c1> q1() {
        vr.e eVarB = b();
        if (eVarB.c0().isEmpty()) {
            List<c1> list = Collections.EMPTY_LIST;
            if (list == null) {
                m0(16);
            }
            return list;
        }
        List<c1> listC0 = eVarB.c0();
        if (listC0 == null) {
            m0(15);
        }
        return listC0;
    }

    public static i t1(vr.e eVar, wr.h hVar, boolean z15, h1 h1Var) {
        if (eVar == null) {
            m0(4);
        }
        if (hVar == null) {
            m0(5);
        }
        if (h1Var == null) {
            m0(6);
        }
        return new i(eVar, null, hVar, z15, vr.b.a.DECLARATION, h1Var);
    }

    @Override // yr.s, vr.b
    public void H0(Collection<? extends vr.b> collection) {
        if (collection == null) {
            m0(22);
        }
    }

    @Override // yr.s, vr.z, vr.b, vr.a
    public Collection<? extends vr.z> e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m0(21);
        }
        return set;
    }

    @Override // vr.l
    public boolean h0() {
        return this.H;
    }

    @Override // vr.l
    public vr.e i0() {
        vr.e eVarB = b();
        if (eVarB == null) {
            m0(18);
        }
        return eVarB;
    }

    public c1 r1() {
        vr.e eVarB = b();
        if (!eVarB.E()) {
            return null;
        }
        vr.m mVarB = eVarB.b();
        if (mVarB instanceof vr.e) {
            return ((vr.e) mVarB).P0();
        }
        return null;
    }

    @Override // yr.s, vr.b
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public vr.d g0(vr.m mVar, vr.f0 f0Var, vr.u uVar, vr.b.a aVar, boolean z15) {
        vr.d dVar = (vr.d) super.g0(mVar, f0Var, uVar, aVar, z15);
        if (dVar == null) {
            m0(27);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.s
    public i u1(vr.m mVar, vr.z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        if (mVar == null) {
            m0(23);
        }
        if (aVar == null) {
            m0(24);
        }
        if (hVar == null) {
            m0(25);
        }
        if (h1Var == null) {
            m0(26);
        }
        vr.b.a aVar2 = vr.b.a.DECLARATION;
        if (aVar == aVar2 || aVar == vr.b.a.SYNTHESIZED) {
            return new i((vr.e) mVar, this, hVar, this.H, aVar2, h1Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    @Override // yr.n, vr.m
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public vr.e b() {
        vr.e eVar = (vr.e) super.b();
        if (eVar == null) {
            m0(17);
        }
        return eVar;
    }

    public i w1(List<t1> list, vr.u uVar) {
        if (list == null) {
            m0(13);
        }
        if (uVar == null) {
            m0(14);
        }
        x1(list, uVar, b().v());
        return this;
    }

    public i x1(List<t1> list, vr.u uVar, List<m1> list2) {
        if (list == null) {
            m0(10);
        }
        if (uVar == null) {
            m0(11);
        }
        if (list2 == null) {
            m0(12);
        }
        super.X0(null, r1(), q1(), list2, list, null, vr.f0.FINAL, uVar);
        return this;
    }

    @Override // yr.s, vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.i(this, d15);
    }

    @Override // yr.s, vr.z, vr.j1
    public vr.d c(i2 i2Var) {
        if (i2Var == null) {
            m0(20);
        }
        return (vr.d) super.c(i2Var);
    }

    @Override // yr.s, yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: a */
    public vr.d Q0() {
        vr.d dVar = (vr.d) super.Q0();
        if (dVar == null) {
            m0(19);
        }
        return dVar;
    }
}
