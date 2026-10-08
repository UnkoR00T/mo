package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

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
public final class vy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vy f30657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vy f30658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vy f30659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vy f30660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vy f30661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vy f30662h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vy f30663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final vy f30664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vy f30665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final vy f30666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vy f30667n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final vy f30668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final vy f30669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final vy f30670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vy f30671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final vy f30672t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final vy f30673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final vy f30674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ vy[] f30675x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wy f30676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30677b;

    static {
        vy vyVar = new vy("DOUBLE", 0, wy.DOUBLE, 1);
        f30657c = vyVar;
        vy vyVar2 = new vy("FLOAT", 1, wy.FLOAT, 5);
        f30658d = vyVar2;
        wy wyVar = wy.LONG;
        vy vyVar3 = new vy("INT64", 2, wyVar, 0);
        f30659e = vyVar3;
        vy vyVar4 = new vy("UINT64", 3, wyVar, 0);
        f30660f = vyVar4;
        wy wyVar2 = wy.INT;
        vy vyVar5 = new vy("INT32", 4, wyVar2, 0);
        f30661g = vyVar5;
        vy vyVar6 = new vy("FIXED64", 5, wyVar, 1);
        f30662h = vyVar6;
        vy vyVar7 = new vy("FIXED32", 6, wyVar2, 5);
        f30663j = vyVar7;
        vy vyVar8 = new vy("BOOL", 7, wy.BOOLEAN, 0);
        f30664k = vyVar8;
        vy vyVar9 = new vy("STRING", 8, wy.STRING, 2);
        f30665l = vyVar9;
        wy wyVar3 = wy.MESSAGE;
        vy vyVar10 = new vy("GROUP", 9, wyVar3, 3);
        f30666m = vyVar10;
        vy vyVar11 = new vy("MESSAGE", 10, wyVar3, 2);
        f30667n = vyVar11;
        vy vyVar12 = new vy("BYTES", 11, wy.BYTE_STRING, 2);
        f30668p = vyVar12;
        vy vyVar13 = new vy("UINT32", 12, wyVar2, 0);
        f30669q = vyVar13;
        vy vyVar14 = new vy("ENUM", 13, wy.ENUM, 0);
        f30670r = vyVar14;
        vy vyVar15 = new vy("SFIXED32", 14, wyVar2, 5);
        f30671s = vyVar15;
        vy vyVar16 = new vy("SFIXED64", 15, wyVar, 1);
        f30672t = vyVar16;
        vy vyVar17 = new vy("SINT32", 16, wyVar2, 0);
        f30673v = vyVar17;
        vy vyVar18 = new vy("SINT64", 17, wyVar, 0);
        f30674w = vyVar18;
        f30675x = new vy[]{vyVar, vyVar2, vyVar3, vyVar4, vyVar5, vyVar6, vyVar7, vyVar8, vyVar9, vyVar10, vyVar11, vyVar12, vyVar13, vyVar14, vyVar15, vyVar16, vyVar17, vyVar18};
    }

    private vy(String str, int i15, wy wyVar, int i16) {
        super(str, i15);
        this.f30676a = wyVar;
        this.f30677b = i16;
    }

    public static vy[] values() {
        return (vy[]) f30675x.clone();
    }

    public final wy b() {
        return this.f30676a;
    }

    public final int m() {
        return this.f30677b;
    }
}
