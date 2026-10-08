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
public class j4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j4 f29369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j4 f29370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j4 f29371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j4 f29372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j4 f29373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j4 f29374h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j4 f29375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j4 f29376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j4 f29377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j4 f29378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j4 f29379n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j4 f29380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j4 f29381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j4 f29382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j4 f29383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j4 f29384t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j4 f29385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j4 f29386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ j4[] f29387x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4 f29388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29389b;

    static {
        j4 j4Var = new j4("DOUBLE", 0, o4.DOUBLE, 1);
        f29369c = j4Var;
        j4 j4Var2 = new j4("FLOAT", 1, o4.FLOAT, 5);
        f29370d = j4Var2;
        o4 o4Var = o4.LONG;
        final int i15 = 2;
        j4 j4Var3 = new j4("INT64", 2, o4Var, 0);
        f29371e = j4Var3;
        final int i16 = 3;
        j4 j4Var4 = new j4("UINT64", 3, o4Var, 0);
        f29372f = j4Var4;
        o4 o4Var2 = o4.INT;
        j4 j4Var5 = new j4("INT32", 4, o4Var2, 0);
        f29373g = j4Var5;
        j4 j4Var6 = new j4("FIXED64", 5, o4Var, 1);
        f29374h = j4Var6;
        j4 j4Var7 = new j4("FIXED32", 6, o4Var2, 5);
        f29375j = j4Var7;
        j4 j4Var8 = new j4("BOOL", 7, o4.BOOLEAN, 0);
        f29376k = j4Var8;
        final o4 o4Var3 = o4.STRING;
        final String str = "STRING";
        final int i17 = 8;
        j4 j4Var9 = new j4(str, i17, o4Var3, i15) { // from class: com.google.android.gms.internal.clearcut.k4
            {
                int i18 = 2;
                int i19 = 8;
            }
        };
        f29377l = j4Var9;
        final o4 o4Var4 = o4.MESSAGE;
        final String str2 = "GROUP";
        final int i18 = 9;
        j4 j4Var10 = new j4(str2, i18, o4Var4, i16) { // from class: com.google.android.gms.internal.clearcut.l4
            {
                int i19 = 3;
                int i25 = 9;
            }
        };
        f29378m = j4Var10;
        final String str3 = "MESSAGE";
        final int i19 = 10;
        final int i25 = 2;
        j4 j4Var11 = new j4(str3, i19, o4Var4, i25) { // from class: com.google.android.gms.internal.clearcut.m4
            {
                int i26 = 2;
                int i27 = 10;
            }
        };
        f29379n = j4Var11;
        final o4 o4Var5 = o4.BYTE_STRING;
        final String str4 = "BYTES";
        final int i26 = 11;
        j4 j4Var12 = new j4(str4, i26, o4Var5, i25) { // from class: com.google.android.gms.internal.clearcut.n4
            {
                int i27 = 2;
                int i28 = 11;
            }
        };
        f29380p = j4Var12;
        j4 j4Var13 = new j4("UINT32", 12, o4Var2, 0);
        f29381q = j4Var13;
        j4 j4Var14 = new j4("ENUM", 13, o4.ENUM, 0);
        f29382r = j4Var14;
        j4 j4Var15 = new j4("SFIXED32", 14, o4Var2, 5);
        f29383s = j4Var15;
        j4 j4Var16 = new j4("SFIXED64", 15, o4Var, 1);
        f29384t = j4Var16;
        j4 j4Var17 = new j4("SINT32", 16, o4Var2, 0);
        f29385v = j4Var17;
        j4 j4Var18 = new j4("SINT64", 17, o4Var, 0);
        f29386w = j4Var18;
        f29387x = new j4[]{j4Var, j4Var2, j4Var3, j4Var4, j4Var5, j4Var6, j4Var7, j4Var8, j4Var9, j4Var10, j4Var11, j4Var12, j4Var13, j4Var14, j4Var15, j4Var16, j4Var17, j4Var18};
    }

    private j4(String str, int i15, o4 o4Var, int i16) {
        super(str, i15);
        this.f29388a = o4Var;
        this.f29389b = i16;
    }

    public static j4[] values() {
        return (j4[]) f29387x.clone();
    }

    public final o4 b() {
        return this.f29388a;
    }
}
