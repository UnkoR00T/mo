package ls;

import java.util.List;
import oq.r;
import pq.v;
import rs.s1;
import rt.j;
import st.t0;
import vr.b1;
import vr.f0;
import vr.h1;
import vr.m;
import vr.u;
import vr.z0;
import yr.k0;
import yr.l0;
import yr.m0;

/* JADX INFO: loaded from: classes4.dex */
public class f extends k0 implements a {
    private final boolean F;
    private final r<vr.a.InterfaceC5463a<?>, ?> G;
    private t0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(m mVar, wr.h hVar, f0 f0Var, u uVar, boolean z15, zs.f fVar, h1 h1Var, z0 z0Var, vr.b.a aVar, boolean z16, r<vr.a.InterfaceC5463a<?>, ?> rVar) {
        super(mVar, z0Var, hVar, f0Var, uVar, z15, fVar, aVar, h1Var, false, false, false, false, false, false);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (f0Var == null) {
            m0(2);
        }
        if (uVar == null) {
            m0(3);
        }
        if (fVar == null) {
            m0(4);
        }
        if (h1Var == null) {
            m0(5);
        }
        if (aVar == null) {
            m0(6);
        }
        this.H = null;
        this.F = z16;
        this.G = rVar;
    }

    public static f l1(m mVar, wr.h hVar, f0 f0Var, u uVar, boolean z15, zs.f fVar, h1 h1Var, boolean z16) {
        if (mVar == null) {
            m0(7);
        }
        if (hVar == null) {
            m0(8);
        }
        if (f0Var == null) {
            m0(9);
        }
        if (uVar == null) {
            m0(10);
        }
        if (fVar == null) {
            m0(11);
        }
        if (h1Var == null) {
            m0(12);
        }
        return new f(mVar, hVar, f0Var, uVar, z15, fVar, h1Var, null, vr.b.a.DECLARATION, z16, null);
    }

    private static /* synthetic */ void m0(int i15) {
        String str = i15 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 21 ? 3 : 2];
        switch (i15) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i15 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // ls.a
    public a D(t0 t0Var, List<t0> list, t0 t0Var2, r<vr.a.InterfaceC5463a<?>, ?> rVar) {
        l0 l0Var;
        m0 m0Var;
        if (list == null) {
            m0(19);
        }
        if (t0Var2 == null) {
            m0(20);
        }
        z0 z0VarQ0 = Q0() == this ? null : Q0();
        f fVar = new f(b(), getAnnotations(), w(), h(), Q(), getName(), m(), z0VarQ0, k(), this.F, rVar);
        l0 l0VarX0 = d();
        if (l0VarX0 != null) {
            l0 l0Var2 = new l0(fVar, l0VarX0.getAnnotations(), l0VarX0.w(), l0VarX0.h(), l0VarX0.J(), l0VarX0.d0(), l0VarX0.n(), k(), z0VarQ0 == null ? null : z0VarQ0.d(), l0VarX0.m());
            l0Var2.T0(l0VarX0.w0());
            l0Var2.W0(t0Var2);
            l0Var = l0Var2;
        } else {
            l0Var = null;
        }
        b1 b1VarJ = j();
        if (b1VarJ != null) {
            m0Var = new m0(fVar, b1VarJ.getAnnotations(), b1VarJ.w(), b1VarJ.h(), b1VarJ.J(), b1VarJ.d0(), b1VarJ.n(), k(), z0VarQ0 == null ? null : z0VarQ0.j(), b1VarJ.m());
            m0Var.T0(m0Var.w0());
            m0Var.X0(b1VarJ.l().get(0));
        } else {
            m0Var = null;
        }
        fVar.b1(l0Var, m0Var, A0(), S());
        fVar.g1(c1());
        er.a<j<ft.g<?>>> aVar = this.f228950h;
        if (aVar != null) {
            fVar.Q0(this.f228949g, aVar);
        }
        fVar.H0(e());
        fVar.h1(t0Var2, getTypeParameters(), N(), t0Var != null ? dt.h.i(this, t0Var, wr.h.f214542p0.b()) : null, v.n());
        return fVar;
    }

    @Override // yr.k0
    protected k0 V0(m mVar, f0 f0Var, u uVar, z0 z0Var, vr.b.a aVar, zs.f fVar, h1 h1Var) {
        if (mVar == null) {
            m0(13);
        }
        if (f0Var == null) {
            m0(14);
        }
        if (uVar == null) {
            m0(15);
        }
        if (aVar == null) {
            m0(16);
        }
        if (fVar == null) {
            m0(17);
        }
        if (h1Var == null) {
            m0(18);
        }
        return new f(mVar, getAnnotations(), f0Var, uVar, Q(), fVar, h1Var, z0Var, aVar, this.F, this.G);
    }

    @Override // yr.k0, vr.a
    public <V> V W(vr.a.InterfaceC5463a<V> interfaceC5463a) {
        r<vr.a.InterfaceC5463a<?>, ?> rVar = this.G;
        if (rVar == null || !rVar.c().equals(interfaceC5463a)) {
            return null;
        }
        return (V) this.G.d();
    }

    @Override // yr.k0, vr.u1
    public boolean f0() {
        t0 type = getType();
        if (this.F && vr.j.a(type)) {
            return !s1.i(type) || sr.j.w0(type);
        }
        return false;
    }

    @Override // yr.k0
    public void f1(t0 t0Var) {
        if (t0Var == null) {
            m0(22);
        }
        this.H = t0Var;
    }

    @Override // yr.w0, vr.a
    public boolean l0() {
        return false;
    }
}
