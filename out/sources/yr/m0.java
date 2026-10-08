package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import st.e1;
import vr.b1;
import vr.h1;
import vr.t1;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class m0 extends j0 implements b1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t1 f228851n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b1 f228852p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(z0 z0Var, wr.h hVar, vr.f0 f0Var, vr.u uVar, boolean z15, boolean z16, boolean z17, vr.b.a aVar, b1 b1Var, h1 h1Var) {
        super(f0Var, uVar, z0Var, hVar, zs.f.p("<set-" + z0Var.getName() + ">"), z15, z16, z17, aVar, h1Var);
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
        this.f228852p = b1Var != null ? b1Var : this;
    }

    public static u0 V0(b1 b1Var, st.t0 t0Var, wr.h hVar) {
        if (b1Var == null) {
            m0(7);
        }
        if (t0Var == null) {
            m0(8);
        }
        if (hVar == null) {
            m0(9);
        }
        return new u0(b1Var, null, 0, hVar, zs.h.f236670p, t0Var, false, false, false, null, h1.f208052a);
    }

    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 10:
            case 11:
            case 12:
            case 13:
                i16 = 2;
                break;
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i15) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i15) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yr.j0, yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b1 Q0() {
        b1 b1Var = this.f228852p;
        if (b1Var == null) {
            m0(13);
        }
        return b1Var;
    }

    public void X0(t1 t1Var) {
        if (t1Var == null) {
            m0(6);
        }
        this.f228851n = t1Var;
    }

    @Override // vr.z, vr.b, vr.a
    public Collection<? extends b1> e() {
        Collection<y0> collectionR0 = super.R0(false);
        if (collectionR0 == null) {
            m0(10);
        }
        return collectionR0;
    }

    @Override // vr.a
    public st.t0 f() {
        e1 e1VarA0 = ht.e.m(this).a0();
        if (e1VarA0 == null) {
            m0(12);
        }
        return e1VarA0;
    }

    @Override // vr.a
    public List<t1> l() {
        t1 t1Var = this.f228851n;
        if (t1Var == null) {
            throw new IllegalStateException();
        }
        List<t1> listSingletonList = Collections.singletonList(t1Var);
        if (listSingletonList == null) {
            m0(11);
        }
        return listSingletonList;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.c(this, d15);
    }
}
