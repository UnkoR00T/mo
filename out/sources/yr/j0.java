package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import st.i2;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 extends n implements y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f228804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f228805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final vr.f0 f228806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f228807h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f228808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vr.b.a f228809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private vr.u f228810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private vr.z f228811m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(vr.f0 f0Var, vr.u uVar, z0 z0Var, wr.h hVar, zs.f fVar, boolean z15, boolean z16, boolean z17, vr.b.a aVar, h1 h1Var) {
        super(z0Var.b(), hVar, fVar, h1Var);
        if (f0Var == null) {
            m0(0);
        }
        if (uVar == null) {
            m0(1);
        }
        if (z0Var == null) {
            m0(2);
        }
        if (hVar == null) {
            m0(3);
        }
        if (fVar == null) {
            m0(4);
        }
        if (h1Var == null) {
            m0(5);
        }
        this.f228811m = null;
        this.f228806g = f0Var;
        this.f228810l = uVar;
        this.f228807h = z0Var;
        this.f228804e = z15;
        this.f228805f = z16;
        this.f228808j = z17;
        this.f228809k = aVar;
    }

    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i16 = 2;
                break;
            case 7:
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i15) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i15) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // vr.a
    public List<c1> B0() {
        List<c1> listB0 = Z().B0();
        if (listB0 == null) {
            m0(14);
        }
        return listB0;
    }

    @Override // vr.z
    public boolean G() {
        return false;
    }

    @Override // vr.z
    public boolean G0() {
        return false;
    }

    @Override // vr.b
    public void H0(Collection<? extends vr.b> collection) {
        if (collection == null) {
            m0(16);
        }
    }

    @Override // vr.y0
    public boolean J() {
        return this.f228804e;
    }

    @Override // vr.z
    public boolean J0() {
        return false;
    }

    @Override // vr.b
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public y0 g0(vr.m mVar, vr.f0 f0Var, vr.u uVar, vr.b.a aVar, boolean z15) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // vr.a
    public c1 N() {
        return Z().N();
    }

    @Override // vr.z
    public boolean N0() {
        return false;
    }

    @Override // yr.n, yr.m, vr.m
    public abstract y0 Q0();

    @Override // vr.a
    public c1 R() {
        return Z().R();
    }

    protected Collection<y0> R0(boolean z15) {
        ArrayList arrayList = new ArrayList(0);
        for (z0 z0Var : Z().e()) {
            vr.k0 k0VarD = z15 ? z0Var.d() : z0Var.j();
            if (k0VarD != null) {
                arrayList.add(k0VarD);
            }
        }
        return arrayList;
    }

    public void S0(boolean z15) {
        this.f228804e = z15;
    }

    public void T0(vr.z zVar) {
        this.f228811m = zVar;
    }

    public void U0(vr.u uVar) {
        this.f228810l = uVar;
    }

    @Override // vr.a
    public <V> V W(vr.a.InterfaceC5463a<V> interfaceC5463a) {
        return null;
    }

    @Override // vr.y0
    public z0 Z() {
        z0 z0Var = this.f228807h;
        if (z0Var == null) {
            m0(13);
        }
        return z0Var;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // vr.j1
    public vr.z c(i2 i2Var) {
        if (i2Var == null) {
            m0(7);
        }
        return this;
    }

    @Override // vr.e0
    public boolean d0() {
        return this.f228805f;
    }

    @Override // vr.a
    public List<m1> getTypeParameters() {
        List<m1> list = Collections.EMPTY_LIST;
        if (list == null) {
            m0(9);
        }
        return list;
    }

    @Override // vr.q
    public vr.u h() {
        vr.u uVar = this.f228810l;
        if (uVar == null) {
            m0(11);
        }
        return uVar;
    }

    @Override // vr.b
    public vr.b.a k() {
        vr.b.a aVar = this.f228809k;
        if (aVar == null) {
            m0(6);
        }
        return aVar;
    }

    @Override // vr.a
    public boolean l0() {
        return false;
    }

    @Override // vr.z
    public boolean n() {
        return this.f228808j;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.z
    public boolean p0() {
        return false;
    }

    @Override // vr.z
    public boolean u() {
        return false;
    }

    @Override // vr.e0
    public vr.f0 w() {
        vr.f0 f0Var = this.f228806g;
        if (f0Var == null) {
            m0(10);
        }
        return f0Var;
    }

    @Override // vr.z
    public vr.z w0() {
        return this.f228811m;
    }
}
