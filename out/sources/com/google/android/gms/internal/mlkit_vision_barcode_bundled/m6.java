package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class m6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6 f29766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m6 f29767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m6 f29768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m6 f29769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m6 f29770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m6 f29771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m6 f29772h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m6 f29773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m6 f29774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m6 f29775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m6 f29776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m6 f29777n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m6 f29778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m6 f29779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m6 f29780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m6 f29781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m6 f29782t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m6 f29783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ m6[] f29784w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n6 f29785a;

    static {
        m6 m6Var = new m6("DOUBLE", 0, n6.DOUBLE, 1);
        f29766b = m6Var;
        m6 m6Var2 = new m6("FLOAT", 1, n6.FLOAT, 5);
        f29767c = m6Var2;
        n6 n6Var = n6.LONG;
        m6 m6Var3 = new m6("INT64", 2, n6Var, 0);
        f29768d = m6Var3;
        m6 m6Var4 = new m6("UINT64", 3, n6Var, 0);
        f29769e = m6Var4;
        n6 n6Var2 = n6.INT;
        m6 m6Var5 = new m6("INT32", 4, n6Var2, 0);
        f29770f = m6Var5;
        m6 m6Var6 = new m6("FIXED64", 5, n6Var, 1);
        f29771g = m6Var6;
        m6 m6Var7 = new m6("FIXED32", 6, n6Var2, 5);
        f29772h = m6Var7;
        m6 m6Var8 = new m6("BOOL", 7, n6.BOOLEAN, 0);
        f29773j = m6Var8;
        m6 m6Var9 = new m6("STRING", 8, n6.STRING, 2);
        f29774k = m6Var9;
        n6 n6Var3 = n6.MESSAGE;
        m6 m6Var10 = new m6("GROUP", 9, n6Var3, 3);
        f29775l = m6Var10;
        m6 m6Var11 = new m6("MESSAGE", 10, n6Var3, 2);
        f29776m = m6Var11;
        m6 m6Var12 = new m6("BYTES", 11, n6.BYTE_STRING, 2);
        f29777n = m6Var12;
        m6 m6Var13 = new m6("UINT32", 12, n6Var2, 0);
        f29778p = m6Var13;
        m6 m6Var14 = new m6("ENUM", 13, n6.ENUM, 0);
        f29779q = m6Var14;
        m6 m6Var15 = new m6("SFIXED32", 14, n6Var2, 5);
        f29780r = m6Var15;
        m6 m6Var16 = new m6("SFIXED64", 15, n6Var, 1);
        f29781s = m6Var16;
        m6 m6Var17 = new m6("SINT32", 16, n6Var2, 0);
        f29782t = m6Var17;
        m6 m6Var18 = new m6("SINT64", 17, n6Var, 0);
        f29783v = m6Var18;
        f29784w = new m6[]{m6Var, m6Var2, m6Var3, m6Var4, m6Var5, m6Var6, m6Var7, m6Var8, m6Var9, m6Var10, m6Var11, m6Var12, m6Var13, m6Var14, m6Var15, m6Var16, m6Var17, m6Var18};
    }

    private m6(String str, int i15, n6 n6Var, int i16) {
        super(str, i15);
        this.f29785a = n6Var;
    }

    public static m6[] values() {
        return (m6[]) f29784w.clone();
    }

    public final n6 b() {
        return this.f29785a;
    }
}
