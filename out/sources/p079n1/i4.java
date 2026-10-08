package p079n1;

import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import q1.e;
import wq.a;
import wq.b;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014j\u0002\b\u0017j\u0002\b\u0016j\u0002\b\u0018j\u0002\b\u000fj\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Ln1/i4;", "", "", "key", "Ln1/i1;", "stringId", "Ln1/h1;", "drawableId", "<init>", "(Ljava/lang/String;ILjava/lang/Object;II)V", "", "k", "(Lm2/r;I)Ljava/lang/String;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "I", "j", "()I", "c", "e", "d", "f", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i4 f130089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i4 f130090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i4 f130091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i4 f130092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i4 f130093h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ i4[] f130094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ a f130095k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int stringId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int drawableId;

    static {
        e eVar = e.f163557a;
        Object objC = eVar.c();
        i1.Companion companion = i1.INSTANCE;
        int iC = companion.c();
        h1.Companion companion2 = h1.INSTANCE;
        f130089d = new i4("Cut", 0, objC, iC, companion2.b());
        f130090e = new i4("Copy", 1, eVar.b(), companion.b(), companion2.a());
        f130091f = new i4("Paste", 2, eVar.d(), companion.d(), companion2.c());
        f130092g = new i4("SelectAll", 3, eVar.e(), companion.e(), companion2.d());
        f130093h = new i4("Autofill", 4, eVar.a(), companion.a(), companion2.e());
        i4[] i4VarArrB = b();
        f130094j = i4VarArrB;
        f130095k = b.a(i4VarArrB);
    }

    private i4(String str, int i15, Object obj, int i16, int i17) {
        super(str, i15);
        this.key = obj;
        this.stringId = i16;
        this.drawableId = i17;
    }

    private static final /* synthetic */ i4[] b() {
        return new i4[]{f130089d, f130090e, f130091f, f130092g, f130093h};
    }

    public static i4 valueOf(String str) {
        return (i4) Enum.valueOf(i4.class, str);
    }

    public static i4[] values() {
        return (i4[]) f130094j.clone();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getStringId() {
        return this.stringId;
    }

    public final String k(r rVar, int i15) {
        if (t.k()) {
            t.o(479426150, i15, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        String strA = j1.a(this.stringId, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return strA;
    }
}
