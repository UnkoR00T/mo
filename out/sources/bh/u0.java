package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static t0 f19471a;

    public static synchronized m0 a(i0 i0Var) {
        try {
            if (f19471a == null) {
                f19471a = new t0(null);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (m0) f19471a.b(i0Var);
    }

    public static synchronized m0 b(String str) {
        return a(i0.d("common").c());
    }
}
