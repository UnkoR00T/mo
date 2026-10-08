package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lq4/h0;", "", "", "value", "h", "(I)I", "", "k", "(I)Ljava/lang/String;", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f164503b = h(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f164504c = h(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f164505d = h(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f164506e = h(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f164507f = h(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f164508g = h(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f164509h = h(7);

    /* JADX INFO: renamed from: q4.h0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lq4/h0$a;", "", "<init>", "()V", "Lq4/h0;", "AboveBaseline", "I", "a", "()I", "Top", "g", "Bottom", "b", "Center", "c", "TextTop", "f", "TextBottom", "d", "TextCenter", "e", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return h0.f164503b;
        }

        public final int b() {
            return h0.f164505d;
        }

        public final int c() {
            return h0.f164506e;
        }

        public final int d() {
            return h0.f164508g;
        }

        public final int e() {
            return h0.f164509h;
        }

        public final int f() {
            return h0.f164507f;
        }

        public final int g() {
            return h0.f164504c;
        }

        private Companion() {
        }
    }

    public static int h(int i15) {
        return i15;
    }

    public static final boolean i(int i15, int i16) {
        return i15 == i16;
    }

    public static int j(int i15) {
        return Integer.hashCode(i15);
    }

    public static String k(int i15) {
        if (i(i15, f164503b)) {
            return "AboveBaseline";
        }
        if (i(i15, f164504c)) {
            return "Top";
        }
        if (i(i15, f164505d)) {
            return "Bottom";
        }
        if (i(i15, f164506e)) {
            return "Center";
        }
        if (i(i15, f164507f)) {
            return "TextTop";
        }
        if (i(i15, f164508g)) {
            return "TextBottom";
        }
        return i(i15, f164509h) ? "TextCenter" : "Invalid";
    }
}
