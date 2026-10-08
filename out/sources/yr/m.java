package yr;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends wr.b implements vr.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.f f228850b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wr.h hVar, zs.f fVar) {
        super(hVar);
        if (hVar == null) {
            m0(0);
        }
        if (fVar == null) {
            m0(1);
        }
        this.f228850b = fVar;
    }

    public static String I0(vr.m mVar) {
        if (mVar == null) {
            m0(4);
        }
        try {
            String str = ct.n.f37669k.M(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                m0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                m0(6);
            }
            return str2;
        }
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6) ? 2 : 3];
        switch (i15) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i15 == 2) {
            objArr[1] = "getName";
        } else if (i15 == 3) {
            objArr[1] = "getOriginal";
        } else if (i15 == 5 || i15 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i15 != 2 && i15 != 3) {
            if (i15 == 4) {
                objArr[2] = "toString";
            } else if (i15 != 5 && i15 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 != 2 && i15 != 3 && i15 != 5 && i15 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public vr.m a() {
        return this;
    }

    @Override // vr.k0
    public zs.f getName() {
        zs.f fVar = this.f228850b;
        if (fVar == null) {
            m0(2);
        }
        return fVar;
    }

    public String toString() {
        return I0(this);
    }
}
