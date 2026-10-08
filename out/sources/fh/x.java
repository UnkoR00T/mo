package fh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f63700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f63701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f63702c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c0 f63703d;

    /* synthetic */ x(c0 c0Var, w wVar) {
        this.f63703d = c0Var;
        this.f63700a = c0Var.f62963e;
        this.f63701b = c0Var.h();
    }

    private final void c() {
        if (this.f63703d.f62963e != this.f63700a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i15);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63701b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f63701b;
        this.f63702c = i15;
        Object objA = a(i15);
        this.f63701b = this.f63703d.i(this.f63701b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        hl.d(this.f63702c >= 0, "no calls to next() since the last call to remove()");
        this.f63700a += 32;
        int i15 = this.f63702c;
        c0 c0Var = this.f63703d;
        c0Var.remove(c0.k(c0Var, i15));
        this.f63701b--;
        this.f63702c = -1;
    }
}
