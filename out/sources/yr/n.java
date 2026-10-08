package yr;

import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends m implements vr.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.m f228853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h1 f228854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n(vr.m mVar, wr.h hVar, zs.f fVar, h1 h1Var) {
        super(hVar, fVar);
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
        this.f228853c = mVar;
        this.f228854d = h1Var;
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 4 || i15 == 5 || i15 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 4 || i15 == 5 || i15 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i15 == 4) {
            objArr[1] = "getOriginal";
        } else if (i15 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i15 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i15 != 4 && i15 != 5 && i15 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 5 && i15 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yr.m, vr.m
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public vr.p a() {
        vr.p pVar = (vr.p) super.a();
        if (pVar == null) {
            m0(4);
        }
        return pVar;
    }

    public vr.m b() {
        vr.m mVar = this.f228853c;
        if (mVar == null) {
            m0(5);
        }
        return mVar;
    }

    public h1 m() {
        h1 h1Var = this.f228854d;
        if (h1Var == null) {
            m0(6);
        }
        return h1Var;
    }
}
