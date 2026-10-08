package dh;

/* JADX INFO: loaded from: classes3.dex */
public final class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jc f41961a;

    private jc() {
    }

    public static synchronized jc a() {
        try {
            if (f41961a == null) {
                f41961a = new jc();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f41961a;
    }

    public static final boolean b() {
        return ic.a("mlkit-dev-profiling");
    }
}
