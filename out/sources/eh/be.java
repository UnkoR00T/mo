package eh;

/* JADX INFO: loaded from: classes3.dex */
public final class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ae f50291a;

    public static synchronized qd a(gd gdVar) {
        try {
            if (f50291a == null) {
                f50291a = new ae(null);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (qd) f50291a.b(gdVar);
    }

    public static synchronized qd b(String str) {
        return a(gd.d(str).c());
    }
}
