package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w0 f19476a;

    private w0() {
    }

    public static synchronized w0 a() {
        try {
            if (f19476a == null) {
                f19476a = new w0();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f19476a;
    }

    public static void b() {
        v0.a();
    }
}
