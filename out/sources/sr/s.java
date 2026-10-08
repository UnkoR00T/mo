package sr;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f183690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f183691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f183692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f183693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ s[] f183694h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f183695j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.b f183696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.f f183697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zs.b f183698c;

    static {
        zs.b.a aVar = zs.b.f236634d;
        f183690d = new s("UBYTE", 0, zs.b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f183691e = new s("USHORT", 1, zs.b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f183692f = new s("UINT", 2, zs.b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f183693g = new s("ULONG", 3, zs.b.a.b(aVar, "kotlin/ULong", false, 2, null));
        s[] sVarArrB = b();
        f183694h = sVarArrB;
        f183695j = wq.b.a(sVarArrB);
    }

    private s(String str, int i15, zs.b bVar) {
        super(str, i15);
        this.f183696a = bVar;
        zs.f fVarH = bVar.h();
        this.f183697b = fVarH;
        this.f183698c = new zs.b(bVar.f(), zs.f.l(fVarH.e() + "Array"));
    }

    private static final /* synthetic */ s[] b() {
        return new s[]{f183690d, f183691e, f183692f, f183693g};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f183694h.clone();
    }

    public final zs.b e() {
        return this.f183698c;
    }

    public final zs.b g() {
        return this.f183696a;
    }

    public final zs.f j() {
        return this.f183697b;
    }
}
