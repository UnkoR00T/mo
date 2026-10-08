package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static hk f63140a;

    public static synchronized xj a(oj ojVar) {
        try {
            if (f63140a == null) {
                f63140a = new hk(null);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (xj) f63140a.b(ojVar);
    }

    public static synchronized xj b(String str) {
        return a(oj.d(str).c());
    }
}
