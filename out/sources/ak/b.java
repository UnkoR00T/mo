package ak;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> extends h2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f6804a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f6805b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f6804a = a.FAILED;
        this.f6805b = a();
        if (this.f6804a == a.DONE) {
            return false;
        }
        this.f6804a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T c() {
        this.f6804a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zj.p.w(this.f6804a != a.FAILED);
        int iOrdinal = this.f6804a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return d();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6804a = a.NOT_READY;
        T t15 = (T) k1.a(this.f6805b);
        this.f6805b = null;
        return t15;
    }
}
