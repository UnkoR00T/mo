package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class mz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mz f33004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mz f33005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mz f33006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mz f33007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mz f33008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mz f33009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mz f33010h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mz f33011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mz f33012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mz f33013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ mz[] f33014m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f33015a;

    static {
        mz mzVar = new mz("VOID", 0, Void.class, Void.class, null);
        f33004b = mzVar;
        Class cls = Integer.TYPE;
        mz mzVar2 = new mz("INT", 1, cls, Integer.class, 0);
        f33005c = mzVar2;
        mz mzVar3 = new mz("LONG", 2, Long.TYPE, Long.class, 0L);
        f33006d = mzVar3;
        mz mzVar4 = new mz("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f33007e = mzVar4;
        mz mzVar5 = new mz("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f33008f = mzVar5;
        mz mzVar6 = new mz("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f33009g = mzVar6;
        mz mzVar7 = new mz("STRING", 6, String.class, String.class, "");
        f33010h = mzVar7;
        mz mzVar8 = new mz("BYTE_STRING", 7, tx.class, tx.class, tx.f33820b);
        f33011j = mzVar8;
        mz mzVar9 = new mz("ENUM", 8, cls, Integer.class, null);
        f33012k = mzVar9;
        mz mzVar10 = new mz("MESSAGE", 9, Object.class, Object.class, null);
        f33013l = mzVar10;
        f33014m = new mz[]{mzVar, mzVar2, mzVar3, mzVar4, mzVar5, mzVar6, mzVar7, mzVar8, mzVar9, mzVar10};
    }

    private mz(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f33015a = cls2;
    }

    public static mz[] values() {
        return (mz[]) f33014m.clone();
    }

    public final Class b() {
        return this.f33015a;
    }
}
