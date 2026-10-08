package mt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final t0 f128136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f128137b;

    public a(t0 t0Var, g gVar) {
        if (t0Var == null) {
            c(0);
        }
        this.f128136a = t0Var;
        this.f128137b = gVar == null ? this : gVar;
    }

    private static /* synthetic */ void c(int i15) {
        String str = (i15 == 1 || i15 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 1 || i15 == 2) ? 2 : 3];
        if (i15 == 1 || i15 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i15 == 1) {
            objArr[1] = "getType";
        } else if (i15 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i15 != 1 && i15 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // mt.g
    public t0 getType() {
        t0 t0Var = this.f128136a;
        if (t0Var == null) {
            c(1);
        }
        return t0Var;
    }
}
