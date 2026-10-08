package zj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f235376a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f235377b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f235376a = a.FAILED;
        this.f235377b = a();
        if (this.f235376a == a.DONE) {
            return false;
        }
        this.f235376a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T c() {
        this.f235376a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.w(this.f235376a != a.FAILED);
        int iOrdinal = this.f235376a.ordinal();
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
        this.f235376a = a.NOT_READY;
        T t15 = (T) k.a(this.f235377b);
        this.f235377b = null;
        return t15;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
