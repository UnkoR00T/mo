package te;

/* JADX INFO: loaded from: classes3.dex */
public class a<R> implements b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a<?> f189779a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<?> f189780b = new C4937a();

    /* JADX INFO: renamed from: te.a$a, reason: collision with other inner class name */
    public static class C4937a<R> implements c<R> {
        @Override // te.c
        public b<R> a(zd.a aVar, boolean z15) {
            return a.f189779a;
        }
    }

    public static <R> c<R> b() {
        return (c<R>) f189780b;
    }

    @Override // te.b
    public boolean a(Object obj, b.a aVar) {
        return false;
    }
}
