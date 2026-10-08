package u4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0014\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lu4/z;", "", "", "value", "f", "(I)I", "", "l", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "k", "(I)Z", "isWeightOn", "j", "isStyleOn", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f195315c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f195316d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f195317e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f195318f = f(65535);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: u4.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lu4/z$a;", "", "<init>", "()V", "", "value", "Lu4/z;", "e", "(I)I", "None", "I", "b", "()I", "Weight", "d", "Style", "c", "All", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return z.f195318f;
        }

        public final int b() {
            return z.f195315c;
        }

        public final int c() {
            return z.f195317e;
        }

        public final int d() {
            return z.f195316d;
        }

        public final int e(int value) {
            boolean z15 = true;
            if (value != 0 && value != 1 && value != 2 && value != 65535) {
                z15 = false;
            }
            if (!z15) {
                w4.a.a("The given value=" + value + " is not recognized by FontSynthesis.");
            }
            return z.f(value);
        }

        private Companion() {
        }
    }

    private /* synthetic */ z(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ z e(int i15) {
        return new z(i15);
    }

    public static int f(int i15) {
        return i15;
    }

    public static boolean g(int i15, Object obj) {
        return (obj instanceof z) && i15 == ((z) obj).getValue();
    }

    public static final boolean h(int i15, int i16) {
        return i15 == i16;
    }

    public static int i(int i15) {
        return Integer.hashCode(i15);
    }

    public static final boolean j(int i15) {
        return (i15 & 2) != 0;
    }

    public static final boolean k(int i15) {
        return (i15 & 1) != 0;
    }

    public static String l(int i15) {
        if (h(i15, f195315c)) {
            return "None";
        }
        if (h(i15, f195316d)) {
            return "Weight";
        }
        if (h(i15, f195317e)) {
            return "Style";
        }
        return h(i15, f195318f) ? "All" : "Invalid";
    }

    public boolean equals(Object other) {
        return g(this.value, other);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }
}
