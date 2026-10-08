package yr;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vr.c1;
import vr.g1;
import vr.h1;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public class o0 extends s implements g1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected o0(vr.m mVar, g1 g1Var, wr.h hVar, zs.f fVar, vr.b.a aVar, h1 h1Var) {
        super(mVar, g1Var, hVar, fVar, aVar, h1Var);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (fVar == null) {
            m0(2);
        }
        if (aVar == null) {
            m0(3);
        }
        if (h1Var == null) {
            m0(4);
        }
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 13 || i15 == 18 || i15 == 23 || i15 == 24 || i15 == 29 || i15 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 13 || i15 == 18 || i15 == 23 || i15 == 24 || i15 == 29 || i15 == 30) ? 2 : 3];
        switch (i15) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i15 == 13 || i15 == 18 || i15 == 23) {
            objArr[1] = "initialize";
        } else if (i15 == 24) {
            objArr[1] = "getOriginal";
        } else if (i15 == 29) {
            objArr[1] = "copy";
        } else if (i15 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i15) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 13 && i15 != 18 && i15 != 23 && i15 != 24 && i15 != 29 && i15 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static o0 r1(vr.m mVar, wr.h hVar, zs.f fVar, vr.b.a aVar, h1 h1Var) {
        if (mVar == null) {
            m0(5);
        }
        if (hVar == null) {
            m0(6);
        }
        if (fVar == null) {
            m0(7);
        }
        if (aVar == null) {
            m0(8);
        }
        if (h1Var == null) {
            m0(9);
        }
        return new o0(mVar, null, hVar, fVar, aVar, h1Var);
    }

    @Override // yr.s
    /* JADX INFO: renamed from: R0 */
    protected s u1(vr.m mVar, vr.z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        if (mVar == null) {
            m0(25);
        }
        if (aVar == null) {
            m0(26);
        }
        if (hVar == null) {
            m0(27);
        }
        if (h1Var == null) {
            m0(28);
        }
        g1 g1Var = (g1) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new o0(mVar, g1Var, hVar, fVar, aVar, h1Var);
    }

    @Override // yr.s, vr.b
    /* JADX INFO: renamed from: q1 */
    public g1 g0(vr.m mVar, vr.f0 f0Var, vr.u uVar, vr.b.a aVar, boolean z15) {
        g1 g1Var = (g1) super.g0(mVar, f0Var, uVar, aVar, z15);
        if (g1Var == null) {
            m0(29);
        }
        return g1Var;
    }

    @Override // yr.s, yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public g1 Q0() {
        g1 g1Var = (g1) super.Q0();
        if (g1Var == null) {
            m0(24);
        }
        return g1Var;
    }

    @Override // yr.s
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public o0 X0(c1 c1Var, c1 c1Var2, List<c1> list, List<? extends m1> list2, List<t1> list3, st.t0 t0Var, vr.f0 f0Var, vr.u uVar) {
        if (list == null) {
            m0(14);
        }
        if (list2 == null) {
            m0(15);
        }
        if (list3 == null) {
            m0(16);
        }
        if (uVar == null) {
            m0(17);
        }
        o0 o0VarU1 = u1(c1Var, c1Var2, list, list2, list3, t0Var, f0Var, uVar, null);
        if (o0VarU1 == null) {
            m0(18);
        }
        return o0VarU1;
    }

    public o0 u1(c1 c1Var, c1 c1Var2, List<c1> list, List<? extends m1> list2, List<t1> list3, st.t0 t0Var, vr.f0 f0Var, vr.u uVar, Map<? extends vr.a.InterfaceC5463a<?>, ?> map) {
        if (list == null) {
            m0(19);
        }
        if (list2 == null) {
            m0(20);
        }
        if (list3 == null) {
            m0(21);
        }
        if (uVar == null) {
            m0(22);
        }
        super.X0(c1Var, c1Var2, list, list2, list3, t0Var, f0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.G = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // yr.s, vr.z, vr.g1
    public vr.z.a<? extends g1> z() {
        vr.z.a aVarZ = super.z();
        if (aVarZ == null) {
            m0(30);
        }
        return aVarZ;
    }
}
