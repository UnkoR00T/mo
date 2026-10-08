package mt;

import st.t0;

/* JADX INFO: loaded from: classes4.dex */
public class j extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(t0 t0Var) {
        this(t0Var, null);
        if (t0Var == null) {
            c(0);
        }
    }

    private static /* synthetic */ void c(int i15) {
        Object[] objArr = new Object[3];
        if (i15 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i15 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private j(t0 t0Var, g gVar) {
        super(t0Var, gVar);
        if (t0Var == null) {
            c(1);
        }
    }
}
