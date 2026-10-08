package u4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lu4/w;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f195299b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f195300c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f195301d = d(2);

    /* JADX INFO: renamed from: u4.w$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lu4/w$a;", "", "<init>", "()V", "Lu4/w;", "Blocking", "I", "b", "()I", "OptionalLocal", "c", "Async", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return w.f195301d;
        }

        public final int b() {
            return w.f195299b;
        }

        public final int c() {
            return w.f195300c;
        }

        private Companion() {
        }
    }

    private static int d(int i15) {
        return i15;
    }

    public static final boolean e(int i15, int i16) {
        return i15 == i16;
    }

    public static int f(int i15) {
        return Integer.hashCode(i15);
    }

    public static String g(int i15) {
        if (e(i15, f195299b)) {
            return "Blocking";
        }
        if (e(i15, f195300c)) {
            return "Optional";
        }
        if (e(i15, f195301d)) {
            return "Async";
        }
        return "Invalid(value=" + i15 + ')';
    }
}
