package yn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f228072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f228073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ u[] f228074c;

    final enum a extends u {
        a(String str, int i15) {
            super(str, i15, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f228072a = aVar;
        u uVar = new u("STRING", 1) { // from class: yn.u.b
            {
                a aVar2 = null;
            }
        };
        f228073b = uVar;
        f228074c = new u[]{aVar, uVar};
    }

    private u(String str, int i15) {
        super(str, i15);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f228074c.clone();
    }

    /* synthetic */ u(String str, int i15, a aVar) {
        this(str, i15);
    }
}
