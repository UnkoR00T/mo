package eh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class a0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f50223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f50224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f50225c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f0 f50226d;

    /* synthetic */ a0(f0 f0Var, w wVar) {
        this.f50226d = f0Var;
        this.f50223a = f0Var.f50531e;
        this.f50224b = f0Var.g();
    }

    private final void c() {
        if (this.f50226d.f50531e != this.f50223a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i15);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50224b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f50224b;
        this.f50225c = i15;
        Object objA = a(i15);
        this.f50224b = this.f50226d.h(this.f50224b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        c.d(this.f50225c >= 0, "no calls to next() since the last call to remove()");
        this.f50223a += 32;
        f0 f0Var = this.f50226d;
        f0Var.remove(f0.i(f0Var, this.f50225c));
        this.f50224b--;
        this.f50225c = -1;
    }
}
