package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ce f50350a;

    private ce() {
    }

    public static synchronized ce a() {
        try {
            if (f50350a == null) {
                f50350a = new ce();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f50350a;
    }
}
