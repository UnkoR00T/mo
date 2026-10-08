package v4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lv4/a0;", "", "", "value", "l", "(I)I", "", "p", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f203614c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f203615d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f203616e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f203617f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f203618g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f203619h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f203620i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f203621j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f203622k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f203623l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: v4.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006%"}, d2 = {"Lv4/a0$a;", "", "<init>", "()V", "Lv4/a0;", "Unspecified", "I", "i", "()I", "getUnspecified-PjHm6EE$annotations", "Text", "h", "getText-PjHm6EE$annotations", "Ascii", "a", "getAscii-PjHm6EE$annotations", "Number", "d", "getNumber-PjHm6EE$annotations", "Phone", "g", "getPhone-PjHm6EE$annotations", "Uri", "j", "getUri-PjHm6EE$annotations", "Email", "c", "getEmail-PjHm6EE$annotations", "Password", "f", "getPassword-PjHm6EE$annotations", "NumberPassword", "e", "getNumberPassword-PjHm6EE$annotations", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37045g, "b", "getDecimal-PjHm6EE$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return a0.f203616e;
        }

        public final int b() {
            return a0.f203623l;
        }

        public final int c() {
            return a0.f203620i;
        }

        public final int d() {
            return a0.f203617f;
        }

        public final int e() {
            return a0.f203622k;
        }

        public final int f() {
            return a0.f203621j;
        }

        public final int g() {
            return a0.f203618g;
        }

        public final int h() {
            return a0.f203615d;
        }

        public final int i() {
            return a0.f203614c;
        }

        public final int j() {
            return a0.f203619h;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a0(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ a0 k(int i15) {
        return new a0(i15);
    }

    private static int l(int i15) {
        return i15;
    }

    public static boolean m(int i15, Object obj) {
        return (obj instanceof a0) && i15 == ((a0) obj).getValue();
    }

    public static final boolean n(int i15, int i16) {
        return i15 == i16;
    }

    public static int o(int i15) {
        return Integer.hashCode(i15);
    }

    public static String p(int i15) {
        if (n(i15, f203614c)) {
            return "Unspecified";
        }
        if (n(i15, f203615d)) {
            return "Text";
        }
        if (n(i15, f203616e)) {
            return "Ascii";
        }
        if (n(i15, f203617f)) {
            return "Number";
        }
        if (n(i15, f203618g)) {
            return "Phone";
        }
        if (n(i15, f203619h)) {
            return "Uri";
        }
        if (n(i15, f203620i)) {
            return "Email";
        }
        if (n(i15, f203621j)) {
            return "Password";
        }
        if (n(i15, f203622k)) {
            return "NumberPassword";
        }
        return n(i15, f203623l) ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37045g : "Invalid";
    }

    public boolean equals(Object other) {
        return m(this.value, other);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return p(this.value);
    }
}
