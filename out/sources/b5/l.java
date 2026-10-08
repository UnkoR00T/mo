package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lb5/l;", "", "", "value", "h", "(I)I", "", "l", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16636c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16637d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16638e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16639f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f16640g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f16641h = h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b5.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lb5/l$a;", "", "<init>", "()V", "", "value", "Lb5/l;", "g", "(I)I", "Ltr", "I", "d", "()I", "Rtl", "e", "Content", "a", "ContentOrLtr", "b", "ContentOrRtl", "c", "Unspecified", "f", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return l.f16638e;
        }

        public final int b() {
            return l.f16639f;
        }

        public final int c() {
            return l.f16640g;
        }

        public final int d() {
            return l.f16636c;
        }

        public final int e() {
            return l.f16637d;
        }

        public final int f() {
            return l.f16641h;
        }

        public final int g(int value) {
            boolean z15 = false;
            if (value >= 0 && value < 6) {
                z15 = true;
            }
            if (!z15) {
                w4.a.a("The given value=" + value + " is not recognized by TextDirection.");
            }
            return l.h(value);
        }

        private Companion() {
        }
    }

    private /* synthetic */ l(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ l g(int i15) {
        return new l(i15);
    }

    public static int h(int i15) {
        return i15;
    }

    public static boolean i(int i15, Object obj) {
        return (obj instanceof l) && i15 == ((l) obj).getValue();
    }

    public static final boolean j(int i15, int i16) {
        return i15 == i16;
    }

    public static int k(int i15) {
        return Integer.hashCode(i15);
    }

    public static String l(int i15) {
        if (j(i15, f16636c)) {
            return "Ltr";
        }
        if (j(i15, f16637d)) {
            return "Rtl";
        }
        if (j(i15, f16638e)) {
            return "Content";
        }
        if (j(i15, f16639f)) {
            return "ContentOrLtr";
        }
        if (j(i15, f16640g)) {
            return "ContentOrRtl";
        }
        return j(i15, f16641h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object other) {
        return i(this.value, other);
    }

    public int hashCode() {
        return k(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }
}
