package jf;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cf.b<String> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f102325a = new g();
    }

    public static g a() {
        return a.f102325a;
    }

    public static String b() {
        return (String) cf.d.d(f.a());
    }

    @Override // nq.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
