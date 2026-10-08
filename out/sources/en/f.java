package en;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static boolean f52077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f52078b;

    static {
        f52077a = System.getProperty("surefire.test.class.path") != null;
        f52078b = new StackTraceElement[0];
    }

    f() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
