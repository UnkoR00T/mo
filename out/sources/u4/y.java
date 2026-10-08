package u4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lu4/y;", "", "", "value", "d", "(I)I", "", "h", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f195309c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f195310d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: u4.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lu4/y$a;", "", "<init>", "()V", "Lu4/y;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0, "I", "b", "()I", "getNormal-_-LCdwA$annotations", "Italic", "a", "getItalic-_-LCdwA$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return y.f195310d;
        }

        public final int b() {
            return y.f195309c;
        }

        private Companion() {
        }
    }

    @oq.a
    private /* synthetic */ y(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ y c(int i15) {
        return new y(i15);
    }

    @oq.a
    public static int d(int i15) {
        return i15;
    }

    public static boolean e(int i15, Object obj) {
        return (obj instanceof y) && i15 == ((y) obj).getValue();
    }

    public static final boolean f(int i15, int i16) {
        return i15 == i16;
    }

    public static int g(int i15) {
        return Integer.hashCode(i15);
    }

    public static String h(int i15) {
        if (f(i15, f195309c)) {
            return com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0;
        }
        return f(i15, f195310d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object other) {
        return e(this.value, other);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return h(this.value);
    }
}
