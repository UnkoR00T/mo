package yr;

/* JADX INFO: loaded from: classes4.dex */
public class t extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.e f228924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mt.e f228925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vr.e eVar) {
        super(wr.h.f214542p0.b());
        if (eVar == null) {
            m0(0);
        }
        this.f228924c = eVar;
        this.f228925d = new mt.e(eVar, null);
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 1 || i15 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 1 || i15 == 2) ? 2 : 3];
        if (i15 == 1 || i15 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i15 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i15 == 1) {
            objArr[1] = "getValue";
        } else if (i15 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // vr.m
    public vr.m b() {
        vr.e eVar = this.f228924c;
        if (eVar == null) {
            m0(2);
        }
        return eVar;
    }

    @Override // vr.c1
    public mt.g getValue() {
        mt.e eVar = this.f228925d;
        if (eVar == null) {
            m0(1);
        }
        return eVar;
    }

    @Override // yr.m
    public String toString() {
        return "class " + this.f228924c.getName() + "::this";
    }
}
