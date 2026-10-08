package dh;

/* JADX INFO: loaded from: classes3.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ec f41818a;

    public static synchronized wb a(rb rbVar) {
        try {
            if (f41818a == null) {
                f41818a = new ec(null);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (wb) f41818a.b(rbVar);
    }

    public static synchronized wb b(String str) {
        return a(rb.d("vision-common").c());
    }
}
