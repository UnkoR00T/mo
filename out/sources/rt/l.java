package rt;

/* JADX INFO: loaded from: classes4.dex */
class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f175982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f175983b = Thread.currentThread();

    l(T t15) {
        this.f175982a = t15;
    }

    public T a() {
        if (b()) {
            return this.f175982a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f175983b == Thread.currentThread();
    }
}
