package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"La4/s;", "", "", "value", "n", "(I)I", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f2731b = n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2732c = n(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2733d = n(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2734e = n(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f2735f = n(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f2736g = n(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f2737h = n(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f2738i = n(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f2739j = n(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f2740k = n(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f2741l = n(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f2742m = n(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f2743n = n(12);

    /* JADX INFO: renamed from: a4.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"La4/s$a;", "", "<init>", "()V", "La4/s;", "Unknown", "I", "m", "()I", "Press", "g", "Release", "h", "Move", "c", "Enter", "a", "Exit", "b", "Scroll", "l", "ScaleStart", "k", "ScaleChange", "i", "ScaleEnd", "j", "PanStart", "f", "PanMove", "e", "PanEnd", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return s.f2735f;
        }

        public final int b() {
            return s.f2736g;
        }

        public final int c() {
            return s.f2734e;
        }

        public final int d() {
            return s.f2743n;
        }

        public final int e() {
            return s.f2742m;
        }

        public final int f() {
            return s.f2741l;
        }

        public final int g() {
            return s.f2732c;
        }

        public final int h() {
            return s.f2733d;
        }

        public final int i() {
            return s.f2739j;
        }

        public final int j() {
            return s.f2740k;
        }

        public final int k() {
            return s.f2738i;
        }

        public final int l() {
            return s.f2737h;
        }

        public final int m() {
            return s.f2731b;
        }

        private Companion() {
        }
    }

    private static int n(int i15) {
        return i15;
    }

    public static final boolean o(int i15, int i16) {
        return i15 == i16;
    }
}
