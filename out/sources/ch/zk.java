package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static xk f26768a;

    public static synchronized nk a(fk fkVar) {
        try {
            if (f26768a == null) {
                f26768a = new xk(null);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (nk) f26768a.b(fkVar);
    }

    public static synchronized nk b(String str) {
        return a(fk.d(str).c());
    }
}
