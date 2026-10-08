package ls;

import java.util.List;
import oq.r;
import pq.v;
import st.t0;
import vr.h1;
import vr.m;
import vr.z;
import yr.i;

/* JADX INFO: loaded from: classes4.dex */
public class b extends i implements a {
    private Boolean I;
    private Boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(vr.e eVar, b bVar, wr.h hVar, boolean z15, vr.b.a aVar, h1 h1Var) {
        super(eVar, bVar, hVar, z15, aVar, h1Var);
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
        this.I = null;
        this.K = null;
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 11 || i15 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 11 || i15 == 18) ? 2 : 3];
        switch (i15) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i15 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i15 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i15) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 11 && i15 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b z1(vr.e eVar, wr.h hVar, boolean z15, h1 h1Var) {
        if (eVar == null) {
            m0(4);
        }
        if (hVar == null) {
            m0(5);
        }
        if (h1Var == null) {
            m0(6);
        }
        return new b(eVar, null, hVar, z15, vr.b.a.DECLARATION, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.i
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public b u1(m mVar, z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        if (mVar == null) {
            m0(7);
        }
        if (aVar == null) {
            m0(8);
        }
        if (hVar == null) {
            m0(9);
        }
        if (h1Var == null) {
            m0(10);
        }
        if (aVar == vr.b.a.DECLARATION || aVar == vr.b.a.SYNTHESIZED) {
            b bVarY1 = y1((vr.e) mVar, (b) zVar, aVar, h1Var, hVar);
            bVarY1.e1(W0());
            bVarY1.f1(l0());
            return bVarY1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    @Override // ls.a
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public b D(t0 t0Var, List<t0> list, t0 t0Var2, r<vr.a.InterfaceC5463a<?>, ?> rVar) {
        if (list == null) {
            m0(16);
        }
        if (t0Var2 == null) {
            m0(17);
        }
        b bVarU1 = u1(b(), null, k(), null, getAnnotations(), m());
        bVarU1.X0(t0Var == null ? null : dt.h.i(bVarU1, t0Var, wr.h.f214542p0.b()), N(), v.n(), getTypeParameters(), h.a(list, l(), bVarU1), t0Var2, w(), h());
        if (rVar != null) {
            bVarU1.a1(rVar.c(), rVar.d());
        }
        return bVarU1;
    }

    @Override // yr.s
    public boolean W0() {
        return this.I.booleanValue();
    }

    @Override // yr.s
    public void e1(boolean z15) {
        this.I = Boolean.valueOf(z15);
    }

    @Override // yr.s
    public void f1(boolean z15) {
        this.K = Boolean.valueOf(z15);
    }

    @Override // yr.s, vr.a
    public boolean l0() {
        return this.K.booleanValue();
    }

    protected b y1(vr.e eVar, b bVar, vr.b.a aVar, h1 h1Var, wr.h hVar) {
        if (eVar == null) {
            m0(12);
        }
        if (aVar == null) {
            m0(13);
        }
        if (h1Var == null) {
            m0(14);
        }
        if (hVar == null) {
            m0(15);
        }
        return new b(eVar, bVar, hVar, this.H, aVar, h1Var);
    }
}
