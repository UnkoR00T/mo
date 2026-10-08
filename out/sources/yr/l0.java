package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import vr.a1;
import vr.h1;
import vr.t1;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class l0 extends j0 implements a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private st.t0 f228848n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final a1 f228849p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(z0 z0Var, wr.h hVar, vr.f0 f0Var, vr.u uVar, boolean z15, boolean z16, boolean z17, vr.b.a aVar, a1 a1Var, h1 h1Var) {
        super(f0Var, uVar, z0Var, hVar, zs.f.p("<get-" + z0Var.getName() + ">"), z15, z16, z17, aVar, h1Var);
        if (z0Var == null) {
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
        if (aVar == null) {
            m0(4);
        }
        if (h1Var == null) {
            m0(5);
        }
        this.f228849p = a1Var != null ? a1Var : this;
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 6 || i15 == 7 || i15 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 6 || i15 == 7 || i15 == 8) ? 2 : 3];
        switch (i15) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i15 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i15 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i15 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i15 != 6 && i15 != 7 && i15 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 6 && i15 != 7 && i15 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yr.j0, yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a1 Q0() {
        a1 a1Var = this.f228849p;
        if (a1Var == null) {
            m0(8);
        }
        return a1Var;
    }

    public void W0(st.t0 t0Var) {
        if (t0Var == null) {
            t0Var = Z().getType();
        }
        this.f228848n = t0Var;
    }

    @Override // vr.z, vr.b, vr.a
    public Collection<? extends a1> e() {
        Collection<y0> collectionR0 = super.R0(true);
        if (collectionR0 == null) {
            m0(6);
        }
        return collectionR0;
    }

    @Override // vr.a
    public st.t0 f() {
        return this.f228848n;
    }

    @Override // vr.a
    public List<t1> l() {
        List<t1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(7);
        }
        return list;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.h(this, d15);
    }
}
