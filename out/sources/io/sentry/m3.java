package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class m3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f95186a;

    private m3(Class<T> cls) {
        this.f95186a = cls;
    }

    public static <T> m3<T> a(Class<T> cls) {
        return new m3<>(cls);
    }

    public T b() {
        return this.f95186a.getDeclaredConstructor(null).newInstance(null);
    }
}
