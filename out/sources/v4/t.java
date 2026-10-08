package v4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lv4/t;", "", "", "value", "k", "(I)I", "", "o", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f203702c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f203703d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f203704e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f203705f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f203706g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f203707h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f203708i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f203709j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f203710k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: v4.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Lv4/t$a;", "", "<init>", "()V", "Lv4/t;", "Unspecified", "I", "i", "()I", "getUnspecified-eUduSuo$annotations", "Default", "a", "getDefault-eUduSuo$annotations", "None", "e", "getNone-eUduSuo$annotations", "Go", "c", "getGo-eUduSuo$annotations", "Search", "g", "getSearch-eUduSuo$annotations", "Send", "h", "getSend-eUduSuo$annotations", "Previous", "f", "getPrevious-eUduSuo$annotations", "Next", "d", "getNext-eUduSuo$annotations", "Done", "b", "getDone-eUduSuo$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return t.f203703d;
        }

        public final int b() {
            return t.f203710k;
        }

        public final int c() {
            return t.f203705f;
        }

        public final int d() {
            return t.f203709j;
        }

        public final int e() {
            return t.f203704e;
        }

        public final int f() {
            return t.f203708i;
        }

        public final int g() {
            return t.f203706g;
        }

        public final int h() {
            return t.f203707h;
        }

        public final int i() {
            return t.f203702c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ t(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ t j(int i15) {
        return new t(i15);
    }

    private static int k(int i15) {
        return i15;
    }

    public static boolean l(int i15, Object obj) {
        return (obj instanceof t) && i15 == ((t) obj).getValue();
    }

    public static final boolean m(int i15, int i16) {
        return i15 == i16;
    }

    public static int n(int i15) {
        return Integer.hashCode(i15);
    }

    public static String o(int i15) {
        if (m(i15, f203702c)) {
            return "Unspecified";
        }
        if (m(i15, f203704e)) {
            return "None";
        }
        if (m(i15, f203703d)) {
            return "Default";
        }
        if (m(i15, f203705f)) {
            return "Go";
        }
        if (m(i15, f203706g)) {
            return "Search";
        }
        if (m(i15, f203707h)) {
            return "Send";
        }
        if (m(i15, f203708i)) {
            return "Previous";
        }
        if (m(i15, f203709j)) {
            return "Next";
        }
        return m(i15, f203710k) ? "Done" : "Invalid";
    }

    public boolean equals(Object other) {
        return l(this.value, other);
    }

    public int hashCode() {
        return n(this.value);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return o(this.value);
    }
}
