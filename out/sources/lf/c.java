package lf;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cf.b<lf.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f118172a = new c();
    }

    public static c a() {
        return a.f118172a;
    }

    public static lf.a b() {
        return (lf.a) cf.d.d(b.a());
    }

    @Override // nq.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public lf.a get() {
        return b();
    }
}
