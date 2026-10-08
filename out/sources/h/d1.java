package h;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lh/d1;", "", "", "value", "g", "(I)I", "", "j", "(I)Ljava/lang/String;", "i", "other", "", "h", "(ILjava/lang/Object;)Z", "a", "I", "getValue", "()I", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f78848c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f78849d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f78850e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f78851f = g(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f78852g = g(11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f78853h = g(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f78854i = g(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: h.d1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lh/d1$a;", "", "<init>", "()V", "Lh/d1;", "AVAILABLE", "I", "a", "()I", "UNAVAILABLE", "e", "ERROR_OUTPUT_FAILED", "c", "ERROR_OUTPUT_ABORTED", "b", "ERROR_OUTPUT_MISSING", "d", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return d1.f78849d;
        }

        public final int b() {
            return d1.f78852g;
        }

        public final int c() {
            return d1.f78851f;
        }

        public final int d() {
            return d1.f78853h;
        }

        public final int e() {
            return d1.f78850e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ d1(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ d1 f(int i15) {
        return new d1(i15);
    }

    public static int g(int i15) {
        return i15;
    }

    public static boolean h(int i15, Object obj) {
        return (obj instanceof d1) && i15 == ((d1) obj).getValue();
    }

    public static int i(int i15) {
        return Integer.hashCode(i15);
    }

    public static String j(int i15) {
        if (i15 == 0) {
            return "PENDING";
        }
        if (i15 == 1) {
            return "AVAILABLE";
        }
        if (i15 == 2) {
            return "UNAVAILABLE";
        }
        switch (i15) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return "OutputStatus(value=" + i15 + ')';
        }
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return j(this.value);
    }
}
