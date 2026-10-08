package mt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public class d extends a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vr.a f128142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vr.a aVar, t0 t0Var, g gVar) {
        super(t0Var, gVar);
        if (aVar == null) {
            c(0);
        }
        if (t0Var == null) {
            c(1);
        }
        this.f128142c = aVar;
    }

    private static /* synthetic */ void c(int i15) {
        String str = i15 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i15 != 2 ? 3 : 2];
        if (i15 == 1) {
            objArr[0] = "receiverType";
        } else if (i15 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i15 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i15 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i15 != 2) {
            if (i15 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f128142c + "}";
    }
}
