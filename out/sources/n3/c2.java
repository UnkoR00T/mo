package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Ln3/c2;", "", "", "value", "g", "(I)I", "", "k", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130971c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130972d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130973e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130974f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130975g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: n3.c2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Ln3/c2$a;", "", "<init>", "()V", "Ln3/c2;", "Argb8888", "I", "b", "()I", "Alpha8", "a", "Rgb565", "e", "F16", "c", "Gpu", "d", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return c2.f130972d;
        }

        public final int b() {
            return c2.f130971c;
        }

        public final int c() {
            return c2.f130974f;
        }

        public final int d() {
            return c2.f130975g;
        }

        public final int e() {
            return c2.f130973e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ c2(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ c2 f(int i15) {
        return new c2(i15);
    }

    public static int g(int i15) {
        return i15;
    }

    public static boolean h(int i15, Object obj) {
        return (obj instanceof c2) && i15 == ((c2) obj).getValue();
    }

    public static final boolean i(int i15, int i16) {
        return i15 == i16;
    }

    public static int j(int i15) {
        return Integer.hashCode(i15);
    }

    public static String k(int i15) {
        if (i(i15, f130971c)) {
            return "Argb8888";
        }
        if (i(i15, f130972d)) {
            return "Alpha8";
        }
        if (i(i15, f130973e)) {
            return "Rgb565";
        }
        if (i(i15, f130974f)) {
            return "F16";
        }
        return i(i15, f130975g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object other) {
        return h(this.value, other);
    }

    public int hashCode() {
        return j(this.value);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return k(this.value);
    }
}
