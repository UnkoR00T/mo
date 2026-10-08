package yr;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vr.m f228801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h1 f228802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f228803h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected j(rt.n nVar, vr.m mVar, zs.f fVar, h1 h1Var, boolean z15) {
        super(nVar, fVar);
        if (nVar == null) {
            K0(0);
        }
        if (mVar == null) {
            K0(1);
        }
        if (fVar == null) {
            K0(2);
        }
        if (h1Var == null) {
            K0(3);
        }
        this.f228801f = mVar;
        this.f228802g = h1Var;
        this.f228803h = z15;
    }

    private static /* synthetic */ void K0(int i15) {
        String str = (i15 == 4 || i15 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 4 || i15 == 5) ? 2 : 3];
        if (i15 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i15 == 2) {
            objArr[0] = "name";
        } else if (i15 == 3) {
            objArr[0] = "source";
        } else if (i15 == 4 || i15 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i15 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i15 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i15 != 4 && i15 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // vr.e, vr.n, vr.m
    public vr.m b() {
        vr.m mVar = this.f228801f;
        if (mVar == null) {
            K0(4);
        }
        return mVar;
    }

    public boolean d0() {
        return this.f228803h;
    }

    @Override // vr.p
    public h1 m() {
        h1 h1Var = this.f228802g;
        if (h1Var == null) {
            K0(5);
        }
        return h1Var;
    }
}
