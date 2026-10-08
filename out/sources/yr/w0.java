package yr;

import java.util.Collections;
import java.util.List;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.t1;
import vr.u1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 extends n implements u1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected st.t0 f228941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(vr.m mVar, wr.h hVar, zs.f fVar, st.t0 t0Var, h1 h1Var) {
        super(mVar, hVar, fVar, h1Var);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (fVar == null) {
            m0(2);
        }
        if (h1Var == null) {
            m0(3);
        }
        this.f228941e = t0Var;
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
                i16 = 2;
                break;
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i15) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void M0(st.t0 t0Var) {
        this.f228941e = t0Var;
    }

    public c1 N() {
        return null;
    }

    public c1 R() {
        return null;
    }

    public st.t0 f() {
        st.t0 type = getType();
        if (type == null) {
            m0(10);
        }
        return type;
    }

    @Override // vr.s1
    public st.t0 getType() {
        st.t0 t0Var = this.f228941e;
        if (t0Var == null) {
            m0(4);
        }
        return t0Var;
    }

    public List<m1> getTypeParameters() {
        List<m1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(8);
        }
        return list;
    }

    @Override // vr.a
    public List<t1> l() {
        List<t1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(6);
        }
        return list;
    }

    public boolean l0() {
        return false;
    }
}
