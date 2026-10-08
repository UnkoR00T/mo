package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import st.e1;
import st.x1;
import vr.h1;
import vr.m1;
import vr.r1;

/* JADX INFO: loaded from: classes4.dex */
public class g0 extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vr.f f228773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f228774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private vr.f0 f228775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private vr.u f228776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private x1 f228777n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<m1> f228778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Collection<st.t0> f228779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final rt.n f228780r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(vr.m mVar, vr.f fVar, boolean z15, boolean z16, zs.f fVar2, h1 h1Var, rt.n nVar) {
        super(nVar, mVar, fVar2, h1Var, z16);
        if (mVar == null) {
            K0(0);
        }
        if (fVar == null) {
            K0(1);
        }
        if (fVar2 == null) {
            K0(2);
        }
        if (h1Var == null) {
            K0(3);
        }
        if (nVar == null) {
            K0(4);
        }
        this.f228779q = new ArrayList();
        this.f228780r = nVar;
        this.f228773j = fVar;
        this.f228774k = z15;
    }

    private static /* synthetic */ void K0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i16 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i15) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i15) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // vr.i
    public boolean E() {
        return this.f228774k;
    }

    @Override // vr.e
    public vr.d H() {
        return null;
    }

    @Override // yr.z
    public lt.k I0(tt.g gVar) {
        if (gVar == null) {
            K0(16);
        }
        lt.k.b bVar = lt.k.b.f120132b;
        if (bVar == null) {
            K0(17);
        }
        return bVar;
    }

    @Override // vr.e
    public boolean O0() {
        return false;
    }

    public void Q0() {
        this.f228777n = new st.v(this, this.f228778p, this.f228779q, this.f228780r);
        Iterator<vr.d> it = p().iterator();
        while (it.hasNext()) {
            ((i) it.next()).m1(t());
        }
    }

    @Override // vr.e
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Set<vr.d> p() {
        Set<vr.d> set = Collections.EMPTY_SET;
        if (set == null) {
            K0(13);
        }
        return set;
    }

    public void S0(vr.f0 f0Var) {
        if (f0Var == null) {
            K0(6);
        }
        this.f228775l = f0Var;
    }

    public void T0(List<m1> list) {
        if (list == null) {
            K0(14);
        }
        if (this.f228778p == null) {
            this.f228778p = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void U0(vr.u uVar) {
        if (uVar == null) {
            K0(9);
        }
        this.f228776m = uVar;
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
            K0(5);
        }
        return hVarB;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        vr.u uVar = this.f228776m;
        if (uVar == null) {
            K0(10);
        }
        return uVar;
    }

    @Override // vr.e
    public boolean j0() {
        return false;
    }

    @Override // vr.e
    public vr.f k() {
        vr.f fVar = this.f228773j;
        if (fVar == null) {
            K0(8);
        }
        return fVar;
    }

    @Override // vr.e
    public boolean n() {
        return false;
    }

    @Override // vr.h
    public x1 o() {
        x1 x1Var = this.f228777n;
        if (x1Var == null) {
            K0(11);
        }
        return x1Var;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.e
    public lt.k q0() {
        lt.k.b bVar = lt.k.b.f120132b;
        if (bVar == null) {
            K0(18);
        }
        return bVar;
    }

    @Override // vr.e
    public vr.e r0() {
        return null;
    }

    public String toString() {
        return m.I0(this);
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        List<m1> list = this.f228778p;
        if (list == null) {
            K0(15);
        }
        return list;
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        vr.f0 f0Var = this.f228775l;
        if (f0Var == null) {
            K0(7);
        }
        return f0Var;
    }

    @Override // vr.e
    public boolean x() {
        return false;
    }
}
