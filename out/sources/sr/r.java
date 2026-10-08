package sr;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f183682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f183683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f183684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f183685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ r[] f183686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f183687h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.b f183688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zs.f f183689b;

    static {
        zs.b.a aVar = zs.b.f236634d;
        f183682c = new r("UBYTEARRAY", 0, zs.b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f183683d = new r("USHORTARRAY", 1, zs.b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f183684e = new r("UINTARRAY", 2, zs.b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f183685f = new r("ULONGARRAY", 3, zs.b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        r[] rVarArrB = b();
        f183686g = rVarArrB;
        f183687h = wq.b.a(rVarArrB);
    }

    private r(String str, int i15, zs.b bVar) {
        super(str, i15);
        this.f183688a = bVar;
        this.f183689b = bVar.h();
    }

    private static final /* synthetic */ r[] b() {
        return new r[]{f183682c, f183683d, f183684e, f183685f};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f183686g.clone();
    }

    public final zs.f e() {
        return this.f183689b;
    }
}
