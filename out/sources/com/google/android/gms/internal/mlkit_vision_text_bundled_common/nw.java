package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

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
/* JADX INFO: loaded from: classes3.dex */
public final class nw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nw f30529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nw f30530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nw f30531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nw f30532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nw f30533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nw f30534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nw f30535h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final nw f30536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final nw f30537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final nw f30538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ nw[] f30539m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f30540a;

    static {
        nw nwVar = new nw("VOID", 0, Void.class, Void.class, null);
        f30529b = nwVar;
        Class cls = Integer.TYPE;
        nw nwVar2 = new nw("INT", 1, cls, Integer.class, 0);
        f30530c = nwVar2;
        nw nwVar3 = new nw("LONG", 2, Long.TYPE, Long.class, 0L);
        f30531d = nwVar3;
        nw nwVar4 = new nw("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f30532e = nwVar4;
        nw nwVar5 = new nw("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f30533f = nwVar5;
        nw nwVar6 = new nw("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f30534g = nwVar6;
        nw nwVar7 = new nw("STRING", 6, String.class, String.class, "");
        f30535h = nwVar7;
        nw nwVar8 = new nw("BYTE_STRING", 7, yu.class, yu.class, yu.f30716b);
        f30536j = nwVar8;
        nw nwVar9 = new nw("ENUM", 8, cls, Integer.class, null);
        f30537k = nwVar9;
        nw nwVar10 = new nw("MESSAGE", 9, Object.class, Object.class, null);
        f30538l = nwVar10;
        f30539m = new nw[]{nwVar, nwVar2, nwVar3, nwVar4, nwVar5, nwVar6, nwVar7, nwVar8, nwVar9, nwVar10};
    }

    private nw(String str, int i15, Class cls, Class cls2, Object obj) {
        super(str, i15);
        this.f30540a = cls2;
    }

    public static nw[] values() {
        return (nw[]) f30539m.clone();
    }

    public final Class b() {
        return this.f30540a;
    }
}
