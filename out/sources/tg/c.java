package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f190059c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f190060a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f190061b = new e();

    static {
        c cVar = new c();
        synchronized (c.class) {
            f190059c = cVar;
        }
    }

    private c() {
    }

    public static b a() {
        return b().f190060a;
    }

    private static c b() {
        c cVar;
        synchronized (c.class) {
            cVar = f190059c;
        }
        return cVar;
    }
}
