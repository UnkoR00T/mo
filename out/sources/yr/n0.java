package yr;

/* JADX INFO: loaded from: classes4.dex */
public class n0 extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.m f228855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mt.g f228856d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(vr.m mVar, mt.g gVar, wr.h hVar) {
        this(mVar, gVar, hVar, zs.h.f236663i);
        if (mVar == null) {
            m0(0);
        }
        if (gVar == null) {
            m0(1);
        }
        if (hVar == null) {
            m0(2);
        }
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 7 || i15 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 7 || i15 == 8) ? 2 : 3];
        switch (i15) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i15 == 7) {
            objArr[1] = "getValue";
        } else if (i15 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i15) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 7 && i15 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // vr.m
    public vr.m b() {
        vr.m mVar = this.f228855c;
        if (mVar == null) {
            m0(8);
        }
        return mVar;
    }

    @Override // vr.c1
    public mt.g getValue() {
        mt.g gVar = this.f228856d;
        if (gVar == null) {
            m0(7);
        }
        return gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(vr.m mVar, mt.g gVar, wr.h hVar, zs.f fVar) {
        super(hVar, fVar);
        if (mVar == null) {
            m0(3);
        }
        if (gVar == null) {
            m0(4);
        }
        if (hVar == null) {
            m0(5);
        }
        if (fVar == null) {
            m0(6);
        }
        this.f228855c = mVar;
        this.f228856d = gVar;
    }
}
