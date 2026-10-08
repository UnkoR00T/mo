package st;

/* JADX INFO: loaded from: classes4.dex */
public class f2 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p2 f184031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f184032b;

    public f2(p2 p2Var, t0 t0Var) {
        if (p2Var == null) {
            d(0);
        }
        if (t0Var == null) {
            d(1);
        }
        this.f184031a = p2Var;
        this.f184032b = t0Var;
    }

    private static /* synthetic */ void d(int i15) {
        String str = (i15 == 4 || i15 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 4 || i15 == 5) ? 2 : 3];
        switch (i15) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i15 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i15 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i15 == 3) {
            objArr[2] = "replaceType";
        } else if (i15 != 4 && i15 != 5) {
            if (i15 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // st.d2
    public d2 a(tt.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new f2(this.f184031a, gVar.a(this.f184032b));
    }

    @Override // st.d2
    public boolean b() {
        return false;
    }

    @Override // st.d2
    public p2 c() {
        p2 p2Var = this.f184031a;
        if (p2Var == null) {
            d(4);
        }
        return p2Var;
    }

    @Override // st.d2
    public t0 getType() {
        t0 t0Var = this.f184032b;
        if (t0Var == null) {
            d(5);
        }
        return t0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(t0 t0Var) {
        this(p2.INVARIANT, t0Var);
        if (t0Var == null) {
            d(2);
        }
    }
}
