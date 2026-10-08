package pl;

/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f158078a;

    private b() {
    }

    public static b b() {
        if (f158078a == null) {
            f158078a = new b();
        }
        return f158078a;
    }

    @Override // pl.a
    public long a() {
        return System.currentTimeMillis();
    }
}
