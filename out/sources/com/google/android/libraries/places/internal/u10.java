package com.google.android.libraries.places.internal;

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
public final class u10 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u10 f33827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u10 f33828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u10 f33829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u10 f33830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u10 f33831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u10 f33832h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u10 f33833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u10 f33834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u10 f33835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u10 f33836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u10 f33837n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u10 f33838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u10 f33839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u10 f33840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u10 f33841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u10 f33842t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u10 f33843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u10 f33844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ u10[] f33845x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f33846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33847b;

    static {
        u10 u10Var = new u10("DOUBLE", 0, v10.DOUBLE, 1);
        f33827c = u10Var;
        u10 u10Var2 = new u10("FLOAT", 1, v10.FLOAT, 5);
        f33828d = u10Var2;
        v10 v10Var = v10.LONG;
        u10 u10Var3 = new u10("INT64", 2, v10Var, 0);
        f33829e = u10Var3;
        u10 u10Var4 = new u10("UINT64", 3, v10Var, 0);
        f33830f = u10Var4;
        v10 v10Var2 = v10.INT;
        u10 u10Var5 = new u10("INT32", 4, v10Var2, 0);
        f33831g = u10Var5;
        u10 u10Var6 = new u10("FIXED64", 5, v10Var, 1);
        f33832h = u10Var6;
        u10 u10Var7 = new u10("FIXED32", 6, v10Var2, 5);
        f33833j = u10Var7;
        u10 u10Var8 = new u10("BOOL", 7, v10.BOOLEAN, 0);
        f33834k = u10Var8;
        u10 u10Var9 = new u10("STRING", 8, v10.STRING, 2);
        f33835l = u10Var9;
        v10 v10Var3 = v10.MESSAGE;
        u10 u10Var10 = new u10("GROUP", 9, v10Var3, 3);
        f33836m = u10Var10;
        u10 u10Var11 = new u10("MESSAGE", 10, v10Var3, 2);
        f33837n = u10Var11;
        u10 u10Var12 = new u10("BYTES", 11, v10.BYTE_STRING, 2);
        f33838p = u10Var12;
        u10 u10Var13 = new u10("UINT32", 12, v10Var2, 0);
        f33839q = u10Var13;
        u10 u10Var14 = new u10("ENUM", 13, v10.ENUM, 0);
        f33840r = u10Var14;
        u10 u10Var15 = new u10("SFIXED32", 14, v10Var2, 5);
        f33841s = u10Var15;
        u10 u10Var16 = new u10("SFIXED64", 15, v10Var, 1);
        f33842t = u10Var16;
        u10 u10Var17 = new u10("SINT32", 16, v10Var2, 0);
        f33843v = u10Var17;
        u10 u10Var18 = new u10("SINT64", 17, v10Var, 0);
        f33844w = u10Var18;
        f33845x = new u10[]{u10Var, u10Var2, u10Var3, u10Var4, u10Var5, u10Var6, u10Var7, u10Var8, u10Var9, u10Var10, u10Var11, u10Var12, u10Var13, u10Var14, u10Var15, u10Var16, u10Var17, u10Var18};
    }

    private u10(String str, int i15, v10 v10Var, int i16) {
        super(str, i15);
        this.f33846a = v10Var;
        this.f33847b = i16;
    }

    public static u10[] values() {
        return (u10[]) f33845x.clone();
    }

    public final v10 b() {
        return this.f33846a;
    }

    public final int e() {
        return this.f33847b;
    }
}
