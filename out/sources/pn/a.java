package pn;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 pn.a, still in use, count: 1, list:
  (r0v0 pn.a) from 0x002e: FILLED_NEW_ARRAY (r1v1 pn.a), (r0v0 pn.a), (r3v2 pn.a), (r2v1 pn.a) A[WRAPPED] elemType: pn.a
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a[] f161109f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f161111a;

    static {
        f161109f = new a[]{aVar, new a(1), aVar, new a(3)};
    }

    private a(int i15) {
        super(str, i);
        this.f161111a = i15;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f161110g.clone();
    }

    public int e() {
        return this.f161111a;
    }
}
