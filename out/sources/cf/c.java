package cf;

/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<Object> f25576b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f25577a;

    private c(T t15) {
        this.f25577a = t15;
    }

    public static <T> b<T> a(T t15) {
        return new c(d.c(t15, "instance cannot be null"));
    }

    @Override // nq.a
    public T get() {
        return this.f25577a;
    }
}
