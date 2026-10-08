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
public final class xe0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xe0 f34268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xe0 f34269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xe0 f34270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xe0 f34271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xe0 f34272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xe0 f34273h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xe0 f34274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final xe0 f34275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final xe0 f34276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final xe0 f34277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final xe0 f34278n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final xe0 f34279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final xe0 f34280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final xe0 f34281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final xe0[] f34282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ xe0[] f34283t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f34284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l90 f34285b;

    static {
        l90 l90Var = l90.f32815m;
        xe0 xe0Var = new xe0("NO_ERROR", 0, 0, l90Var);
        f34268c = xe0Var;
        l90 l90Var2 = l90.f32814l;
        xe0 xe0Var2 = new xe0("PROTOCOL_ERROR", 1, 1, l90Var2);
        f34269d = xe0Var2;
        xe0 xe0Var3 = new xe0("INTERNAL_ERROR", 2, 2, l90Var2);
        f34270e = xe0Var3;
        xe0 xe0Var4 = new xe0("FLOW_CONTROL_ERROR", 3, 3, l90Var2);
        f34271f = xe0Var4;
        xe0 xe0Var5 = new xe0("SETTINGS_TIMEOUT", 4, 4, l90Var2);
        f34272g = xe0Var5;
        xe0 xe0Var6 = new xe0("STREAM_CLOSED", 5, 5, l90Var2);
        f34273h = xe0Var6;
        xe0 xe0Var7 = new xe0("FRAME_SIZE_ERROR", 6, 6, l90Var2);
        f34274j = xe0Var7;
        xe0 xe0Var8 = new xe0("REFUSED_STREAM", 7, 7, l90Var);
        f34275k = xe0Var8;
        xe0 xe0Var9 = new xe0("CANCEL", 8, 8, l90.f32808f);
        f34276l = xe0Var9;
        xe0 xe0Var10 = new xe0("COMPRESSION_ERROR", 9, 9, l90Var2);
        f34277m = xe0Var10;
        xe0 xe0Var11 = new xe0("CONNECT_ERROR", 10, 10, l90Var2);
        f34278n = xe0Var11;
        xe0 xe0Var12 = new xe0("ENHANCE_YOUR_CALM", 11, 11, l90.f32812j.e("Bandwidth exhausted"));
        f34279p = xe0Var12;
        xe0 xe0Var13 = new xe0("INADEQUATE_SECURITY", 12, 12, l90.f32811i.e("Permission denied as protocol is not secure enough to call"));
        f34280q = xe0Var13;
        xe0 xe0Var14 = new xe0("HTTP_1_1_REQUIRED", 13, 13, l90.f32809g);
        f34281r = xe0Var14;
        f34283t = new xe0[]{xe0Var, xe0Var2, xe0Var3, xe0Var4, xe0Var5, xe0Var6, xe0Var7, xe0Var8, xe0Var9, xe0Var10, xe0Var11, xe0Var12, xe0Var13, xe0Var14};
        xe0[] xe0VarArrValues = values();
        xe0[] xe0VarArr = new xe0[xe0VarArrValues[xe0VarArrValues.length - 1].f34284a + 1];
        for (xe0 xe0Var15 : xe0VarArrValues) {
            xe0VarArr[xe0Var15.f34284a] = xe0Var15;
        }
        f34282s = xe0VarArr;
    }

    private xe0(String str, int i15, int i16, l90 l90Var) {
        super(str, i15);
        this.f34284a = i16;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (l90Var.h() != null) {
            String strH = l90Var.h();
            StringBuilder sb5 = new StringBuilder(strConcat.length() + 2 + String.valueOf(strH).length() + 1);
            sb5.append(strConcat);
            sb5.append(" (");
            sb5.append(strH);
            sb5.append(")");
            strConcat = sb5.toString();
        }
        this.f34285b = l90Var.e(strConcat);
    }

    public static xe0 b(long j15) {
        xe0[] xe0VarArr = f34282s;
        if (j15 >= xe0VarArr.length || j15 < 0) {
            return null;
        }
        return xe0VarArr[(int) j15];
    }

    public static l90 e(long j15) {
        xe0 xe0VarB = b(j15);
        if (xe0VarB != null) {
            return xe0VarB.f34285b;
        }
        l90 l90VarA = l90.a(f34270e.f34285b.g().zza());
        StringBuilder sb5 = new StringBuilder(String.valueOf(j15).length() + 32);
        sb5.append("Unrecognized HTTP/2 error code: ");
        sb5.append(j15);
        return l90VarA.e(sb5.toString());
    }

    public static xe0[] values() {
        return (xe0[]) f34283t.clone();
    }
}
