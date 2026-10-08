package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f11909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f11910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f11911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f11912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f11913h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f11914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b0 f11915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f11916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b0 f11917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b0 f11918n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ b0[] f11919p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f11920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f11921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f11922c;

    static {
        b0 b0Var = new b0("VOID", 0, Void.class, Void.class, null);
        f11909d = b0Var;
        Class cls = Integer.TYPE;
        b0 b0Var2 = new b0("INT", 1, cls, Integer.class, 0);
        f11910e = b0Var2;
        b0 b0Var3 = new b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f11911f = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f11912g = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f11913h = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f11914j = b0Var6;
        b0 b0Var7 = new b0("STRING", 6, String.class, String.class, "");
        f11915k = b0Var7;
        b0 b0Var8 = new b0("BYTE_STRING", 7, g.class, g.class, g.f11949b);
        f11916l = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8, cls, Integer.class, null);
        f11917m = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9, Object.class, Object.class, null);
        f11918n = b0Var10;
        f11919p = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    private b0(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f11920a = cls;
        this.f11921b = cls2;
        this.f11922c = obj;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f11919p.clone();
    }

    public Class<?> b() {
        return this.f11921b;
    }
}
