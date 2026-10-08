package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static al f25770a;

    private al() {
    }

    public static synchronized al a() {
        try {
            if (f25770a == null) {
                f25770a = new al();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f25770a;
    }
}
