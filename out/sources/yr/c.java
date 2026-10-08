package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import st.i2;
import st.p2;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends m implements c1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wr.h hVar) {
        super(hVar, zs.h.f236663i);
        if (hVar == null) {
            m0(0);
        }
    }

    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i16 = 2;
                break;
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i15) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i15) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yr.m, vr.m
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public vr.w0 a() {
        return this;
    }

    @Override // vr.a
    public c1 N() {
        return null;
    }

    @Override // vr.a
    public c1 R() {
        return null;
    }

    @Override // vr.a
    public Collection<? extends vr.a> e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            m0(8);
        }
        return set;
    }

    @Override // vr.a
    public st.t0 f() {
        return getType();
    }

    @Override // vr.s1
    public st.t0 getType() {
        st.t0 type = getValue().getType();
        if (type == null) {
            m0(6);
        }
        return type;
    }

    @Override // vr.a
    public List<m1> getTypeParameters() {
        List<m1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(5);
        }
        return list;
    }

    @Override // vr.q
    public vr.u h() {
        vr.u uVar = vr.t.f208081f;
        if (uVar == null) {
            m0(9);
        }
        return uVar;
    }

    @Override // vr.a
    public List<t1> l() {
        List<t1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(7);
        }
        return list;
    }

    @Override // vr.a
    public boolean l0() {
        return false;
    }

    @Override // vr.p
    public h1 m() {
        h1 h1Var = h1.f208052a;
        if (h1Var == null) {
            m0(11);
        }
        return h1Var;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.m(this, d15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wr.h hVar, zs.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            m0(1);
        }
        if (fVar == null) {
            m0(2);
        }
    }

    @Override // vr.j1
    public c1 c(i2 i2Var) {
        if (i2Var == null) {
            m0(3);
        }
        if (!i2Var.l()) {
            st.t0 t0VarQ = b() instanceof vr.e ? i2Var.q(getType(), p2.OUT_VARIANCE) : i2Var.q(getType(), p2.INVARIANT);
            if (t0VarQ == null) {
                return null;
            }
            if (t0VarQ != getType()) {
                return new n0(b(), new mt.j(t0VarQ), getAnnotations());
            }
        }
        return this;
    }
}
