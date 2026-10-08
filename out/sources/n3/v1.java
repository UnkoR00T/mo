package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Ln3/v1;", "", "", "value", "c", "(I)I", "", "f", "(I)Ljava/lang/String;", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f131071b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f131072c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f131073d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f131074e = c(3);

    /* JADX INFO: renamed from: n3.v1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ln3/v1$a;", "", "<init>", "()V", "Ln3/v1;", "None", "I", "b", "()I", "Low", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return v1.f131072c;
        }

        public final int b() {
            return v1.f131071b;
        }

        private Companion() {
        }
    }

    public static int c(int i15) {
        return i15;
    }

    public static final boolean d(int i15, int i16) {
        return i15 == i16;
    }

    public static int e(int i15) {
        return Integer.hashCode(i15);
    }

    public static String f(int i15) {
        if (d(i15, f131071b)) {
            return "None";
        }
        if (d(i15, f131072c)) {
            return "Low";
        }
        if (d(i15, f131073d)) {
            return "Medium";
        }
        return d(i15, f131074e) ? "High" : "Unknown";
    }
}
