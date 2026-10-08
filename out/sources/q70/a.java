package q70;

import mx.Label;
import p071kotlin.Metadata;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u000ej\u0002\b\u0012j\u0002\b\nj\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lq70/a;", "", "", "iconResId", "Lmx/a;", "contentDescription", "<init>", "(Ljava/lang/String;IILmx/a;)V", "a", "I", "g", "()I", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "d", "f", "h", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f165178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f165179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f165180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f165181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f165182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f165183h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ a[] f165184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ wq.a f165185k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    static {
        int i15 = jz.a.Y;
        c70.a aVar = c70.a.f23835a;
        f165178c = new a("CLOSE", 0, i15, aVar.a().r0());
        f165179d = new a("INFO", 1, a30.a.f2275e, aVar.a().t());
        f165180e = new a("HELP", 2, jz.a.f106752d0, aVar.a().M());
        f165181f = new a("SETTINGS", 3, jz.a.T, aVar.a().C0());
        f165182g = new a("DELETE", 4, jz.a.f106727a, aVar.a().i0());
        f165183h = new a("EDIT", 5, jz.a.f106768f0, aVar.a().I0());
        a[] aVarArrB = b();
        f165184j = aVarArrB;
        f165185k = wq.b.a(aVarArrB);
    }

    private a(String str, int i15, int i16, Label label) {
        super(str, i15);
        this.iconResId = i16;
        this.contentDescription = label;
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{f165178c, f165179d, f165180e, f165181f, f165182g, f165183h};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f165184j.clone();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }
}
