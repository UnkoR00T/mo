package com.google.android.gms.internal.vision;

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
public final class w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w2 f31297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w2 f31298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w2 f31299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w2 f31300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w2 f31301h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w2 f31302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w2 f31303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w2 f31304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w2 f31305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w2 f31306n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ w2[] f31307p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f31309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f31310c;

    static {
        w2 w2Var = new w2("VOID", 0, Void.class, Void.class, null);
        f31297d = w2Var;
        Class cls = Integer.TYPE;
        w2 w2Var2 = new w2("INT", 1, cls, Integer.class, 0);
        f31298e = w2Var2;
        w2 w2Var3 = new w2("LONG", 2, Long.TYPE, Long.class, 0L);
        f31299f = w2Var3;
        w2 w2Var4 = new w2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f31300g = w2Var4;
        w2 w2Var5 = new w2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f31301h = w2Var5;
        w2 w2Var6 = new w2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f31302j = w2Var6;
        w2 w2Var7 = new w2("STRING", 6, String.class, String.class, "");
        f31303k = w2Var7;
        w2 w2Var8 = new w2("BYTE_STRING", 7, e1.class, e1.class, e1.f30998b);
        f31304l = w2Var8;
        w2 w2Var9 = new w2("ENUM", 8, cls, Integer.class, null);
        f31305m = w2Var9;
        w2 w2Var10 = new w2("MESSAGE", 9, Object.class, Object.class, null);
        f31306n = w2Var10;
        f31307p = new w2[]{w2Var, w2Var2, w2Var3, w2Var4, w2Var5, w2Var6, w2Var7, w2Var8, w2Var9, w2Var10};
    }

    private w2(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f31308a = cls;
        this.f31309b = cls2;
        this.f31310c = obj;
    }

    public static w2[] values() {
        return (w2[]) f31307p.clone();
    }

    public final Class<?> b() {
        return this.f31309b;
    }
}
