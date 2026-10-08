package p046f2;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lf2/iq;", "", "", "value", "d", "(I)I", "", "h", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class iq {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f56396c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f56397d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: f2.iq$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lf2/iq$a;", "", "<init>", "()V", "Lf2/iq;", "Hour", "I", "a", "()I", "Minute", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a() {
            return iq.f56396c;
        }

        public final int b() {
            return iq.f56397d;
        }

        private Companion() {
        }
    }

    private /* synthetic */ iq(int i15) {
        this.value = i15;
    }

    public static final /* synthetic */ iq c(int i15) {
        return new iq(i15);
    }

    private static int d(int i15) {
        return i15;
    }

    public static boolean e(int i15, Object obj) {
        return (obj instanceof iq) && i15 == ((iq) obj).getValue();
    }

    public static final boolean f(int i15, int i16) {
        return i15 == i16;
    }

    public static int g(int i15) {
        return Integer.hashCode(i15);
    }

    public static String h(int i15) {
        if (f(i15, f56396c)) {
            return "Hour";
        }
        return f(i15, f56397d) ? "Minute" : "";
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
