package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jk f63305a;

    private jk() {
    }

    public static synchronized jk a() {
        try {
            if (f63305a == null) {
                f63305a = new jk();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f63305a;
    }
}
