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
public class t5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t5 f31268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t5 f31269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t5 f31270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t5 f31271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t5 f31272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t5 f31273h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t5 f31274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t5 f31275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t5 f31276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t5 f31277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t5 f31278n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t5 f31279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t5 f31280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t5 f31281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t5 f31282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t5 f31283t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t5 f31284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t5 f31285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ t5[] f31286x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f31287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31288b;

    static {
        t5 t5Var = new t5("DOUBLE", 0, w5.DOUBLE, 1);
        f31268c = t5Var;
        t5 t5Var2 = new t5("FLOAT", 1, w5.FLOAT, 5);
        f31269d = t5Var2;
        w5 w5Var = w5.LONG;
        final int i15 = 2;
        t5 t5Var3 = new t5("INT64", 2, w5Var, 0);
        f31270e = t5Var3;
        final int i16 = 3;
        t5 t5Var4 = new t5("UINT64", 3, w5Var, 0);
        f31271f = t5Var4;
        w5 w5Var2 = w5.INT;
        t5 t5Var5 = new t5("INT32", 4, w5Var2, 0);
        f31272g = t5Var5;
        t5 t5Var6 = new t5("FIXED64", 5, w5Var, 1);
        f31273h = t5Var6;
        t5 t5Var7 = new t5("FIXED32", 6, w5Var2, 5);
        f31274j = t5Var7;
        t5 t5Var8 = new t5("BOOL", 7, w5.BOOLEAN, 0);
        f31275k = t5Var8;
        final w5 w5Var3 = w5.STRING;
        final String str = "STRING";
        final int i17 = 8;
        t5 t5Var9 = new t5(str, i17, w5Var3, i15) { // from class: com.google.android.gms.internal.vision.s5
            {
                int i18 = 2;
                int i19 = 8;
            }
        };
        f31276l = t5Var9;
        final w5 w5Var4 = w5.MESSAGE;
        final String str2 = "GROUP";
        final int i18 = 9;
        t5 t5Var10 = new t5(str2, i18, w5Var4, i16) { // from class: com.google.android.gms.internal.vision.v5
            {
                int i19 = 3;
                int i25 = 9;
            }
        };
        f31277m = t5Var10;
        final String str3 = "MESSAGE";
        final int i19 = 10;
        final int i25 = 2;
        t5 t5Var11 = new t5(str3, i19, w5Var4, i25) { // from class: com.google.android.gms.internal.vision.u5
            {
                int i26 = 2;
                int i27 = 10;
            }
        };
        f31278n = t5Var11;
        final w5 w5Var5 = w5.BYTE_STRING;
        final String str4 = "BYTES";
        final int i26 = 11;
        t5 t5Var12 = new t5(str4, i26, w5Var5, i25) { // from class: com.google.android.gms.internal.vision.x5
            {
                int i27 = 2;
                int i28 = 11;
            }
        };
        f31279p = t5Var12;
        t5 t5Var13 = new t5("UINT32", 12, w5Var2, 0);
        f31280q = t5Var13;
        t5 t5Var14 = new t5("ENUM", 13, w5.ENUM, 0);
        f31281r = t5Var14;
        t5 t5Var15 = new t5("SFIXED32", 14, w5Var2, 5);
        f31282s = t5Var15;
        t5 t5Var16 = new t5("SFIXED64", 15, w5Var, 1);
        f31283t = t5Var16;
        t5 t5Var17 = new t5("SINT32", 16, w5Var2, 0);
        f31284v = t5Var17;
        t5 t5Var18 = new t5("SINT64", 17, w5Var, 0);
        f31285w = t5Var18;
        f31286x = new t5[]{t5Var, t5Var2, t5Var3, t5Var4, t5Var5, t5Var6, t5Var7, t5Var8, t5Var9, t5Var10, t5Var11, t5Var12, t5Var13, t5Var14, t5Var15, t5Var16, t5Var17, t5Var18};
    }

    private t5(String str, int i15, w5 w5Var, int i16) {
        super(str, i15);
        this.f31287a = w5Var;
        this.f31288b = i16;
    }

    public static t5[] values() {
        return (t5[]) f31286x.clone();
    }

    public final w5 b() {
        return this.f31287a;
    }
}
