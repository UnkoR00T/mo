package com.google.android.gms.internal.clearcut;

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
public final class n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1 f29455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f29456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1 f29457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1 f29458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n1 f29459h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1 f29460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1 f29461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n1 f29462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n1 f29463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n1 f29464n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ n1[] f29465p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f29466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f29467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f29468c;

    static {
        n1 n1Var = new n1("VOID", 0, Void.class, Void.class, null);
        f29455d = n1Var;
        Class cls = Integer.TYPE;
        n1 n1Var2 = new n1("INT", 1, cls, Integer.class, 0);
        f29456e = n1Var2;
        n1 n1Var3 = new n1("LONG", 2, Long.TYPE, Long.class, 0L);
        f29457f = n1Var3;
        n1 n1Var4 = new n1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f29458g = n1Var4;
        n1 n1Var5 = new n1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f29459h = n1Var5;
        n1 n1Var6 = new n1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f29460j = n1Var6;
        n1 n1Var7 = new n1("STRING", 6, String.class, String.class, "");
        f29461k = n1Var7;
        n1 n1Var8 = new n1("BYTE_STRING", 7, a0.class, a0.class, a0.f29117b);
        f29462l = n1Var8;
        n1 n1Var9 = new n1("ENUM", 8, cls, Integer.class, null);
        f29463m = n1Var9;
        n1 n1Var10 = new n1("MESSAGE", 9, Object.class, Object.class, null);
        f29464n = n1Var10;
        f29465p = new n1[]{n1Var, n1Var2, n1Var3, n1Var4, n1Var5, n1Var6, n1Var7, n1Var8, n1Var9, n1Var10};
    }

    private n1(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f29466a = cls;
        this.f29467b = cls2;
        this.f29468c = obj;
    }

    public static n1[] values() {
        return (n1[]) f29465p.clone();
    }

    public final Class<?> b() {
        return this.f29467b;
    }
}
