package he;

import be.v;
import ve.k;

/* JADX INFO: loaded from: classes3.dex */
public class b<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f83964a;

    public b(T t15) {
        this.f83964a = (T) k.d(t15);
    }

    @Override // be.v
    public void c() {
    }

    @Override // be.v
    public Class<T> d() {
        return (Class<T>) this.f83964a.getClass();
    }

    @Override // be.v
    public final T get() {
        return this.f83964a;
    }

    @Override // be.v
    public final int getSize() {
        return 1;
    }
}
