package com.google.crypto.tink.shaded.protobuf;

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
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f36012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f36013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f36014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f36015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f36016h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c0 f36017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c0 f36018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c0 f36019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c0 f36020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c0 f36021n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ c0[] f36022p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f36023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f36024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f36025c;

    static {
        c0 c0Var = new c0("VOID", 0, Void.class, Void.class, null);
        f36012d = c0Var;
        Class cls = Integer.TYPE;
        c0 c0Var2 = new c0("INT", 1, cls, Integer.class, 0);
        f36013e = c0Var2;
        c0 c0Var3 = new c0("LONG", 2, Long.TYPE, Long.class, 0L);
        f36014f = c0Var3;
        c0 c0Var4 = new c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f36015g = c0Var4;
        c0 c0Var5 = new c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f36016h = c0Var5;
        c0 c0Var6 = new c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f36017j = c0Var6;
        c0 c0Var7 = new c0("STRING", 6, String.class, String.class, "");
        f36018k = c0Var7;
        c0 c0Var8 = new c0("BYTE_STRING", 7, h.class, h.class, h.f36058b);
        f36019l = c0Var8;
        c0 c0Var9 = new c0("ENUM", 8, cls, Integer.class, null);
        f36020m = c0Var9;
        c0 c0Var10 = new c0("MESSAGE", 9, Object.class, Object.class, null);
        f36021n = c0Var10;
        f36022p = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
    }

    private c0(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f36023a = cls;
        this.f36024b = cls2;
        this.f36025c = obj;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f36022p.clone();
    }

    public Class<?> b() {
        return this.f36024b;
    }
}
