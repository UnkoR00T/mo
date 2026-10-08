package ye;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<T> {
    public static <T> d<T> e(T t15) {
        return new a(null, t15, e.DEFAULT, null);
    }

    public static <T> d<T> f(T t15, f fVar) {
        return new a(null, t15, e.DEFAULT, fVar);
    }

    public static <T> d<T> g(T t15) {
        return new a(null, t15, e.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract e c();

    public abstract f d();
}
