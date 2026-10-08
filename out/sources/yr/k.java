package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import st.e1;
import st.x1;
import vr.h1;
import vr.m1;
import vr.r1;

/* JADX INFO: loaded from: classes4.dex */
public class k extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vr.f0 f228812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vr.f f228813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x1 f228814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private lt.k f228815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Set<vr.d> f228816n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private vr.d f228817p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vr.m mVar, zs.f fVar, vr.f0 f0Var, vr.f fVar2, Collection<st.t0> collection, h1 h1Var, boolean z15, rt.n nVar) {
        super(nVar, mVar, fVar, h1Var, z15);
        if (mVar == null) {
            K0(0);
        }
        if (fVar == null) {
            K0(1);
        }
        if (f0Var == null) {
            K0(2);
        }
        if (fVar2 == null) {
            K0(3);
        }
        if (collection == null) {
            K0(4);
        }
        if (h1Var == null) {
            K0(5);
        }
        if (nVar == null) {
            K0(6);
        }
        this.f228812j = f0Var;
        this.f228813k = fVar2;
        this.f228814l = new st.v(this, Collections.EMPTY_LIST, collection, nVar);
    }

    private static /* synthetic */ void K0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i16 = 2;
                break;
            case 12:
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i15) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i15) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // vr.i
    public boolean E() {
        return false;
    }

    @Override // vr.e
    public vr.d H() {
        return this.f228817p;
    }

    @Override // yr.z
    public lt.k I0(tt.g gVar) {
        if (gVar == null) {
            K0(12);
        }
        lt.k kVar = this.f228815m;
        if (kVar == null) {
            K0(13);
        }
        return kVar;
    }

    @Override // vr.e
    public boolean O0() {
        return false;
    }

    public final void Q0(lt.k kVar, Set<vr.d> set, vr.d dVar) {
        if (kVar == null) {
            K0(7);
        }
        if (set == null) {
            K0(8);
        }
        this.f228815m = kVar;
        this.f228816n = set;
        this.f228817p = dVar;
    }

    @Override // vr.e
    public r1<e1> Y() {
        return null;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // vr.e
    public boolean e0() {
        return false;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        wr.h hVarB = wr.h.f214542p0.b();
        if (hVarB == null) {
            K0(9);
        }
        return hVarB;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        vr.u uVar = vr.t.f208080e;
        if (uVar == null) {
            K0(17);
        }
        return uVar;
    }

    @Override // vr.e
    public boolean j0() {
        return false;
    }

    @Override // vr.e
    public vr.f k() {
        vr.f fVar = this.f228813k;
        if (fVar == null) {
            K0(15);
        }
        return fVar;
    }

    @Override // vr.e
    public boolean n() {
        return false;
    }

    @Override // vr.h
    public x1 o() {
        x1 x1Var = this.f228814l;
        if (x1Var == null) {
            K0(10);
        }
        return x1Var;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.e
    public Collection<vr.d> p() {
        Set<vr.d> set = this.f228816n;
        if (set == null) {
            K0(11);
        }
        return set;
    }

    @Override // vr.e
    public lt.k q0() {
        lt.k.b bVar = lt.k.b.f120132b;
        if (bVar == null) {
            K0(14);
        }
        return bVar;
    }

    @Override // vr.e
    public vr.e r0() {
        return null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        List<m1> list = Collections.EMPTY_LIST;
        if (list == null) {
            K0(18);
        }
        return list;
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        vr.f0 f0Var = this.f228812j;
        if (f0Var == null) {
            K0(16);
        }
        return f0Var;
    }

    @Override // vr.e
    public boolean x() {
        return false;
    }
}
