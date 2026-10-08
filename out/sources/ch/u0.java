package ch;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class u0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f26389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26391c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ y0 f26392d;

    /* synthetic */ u0(y0 y0Var, t0 t0Var) {
        this.f26392d = y0Var;
        this.f26389a = y0Var.f26533e;
        this.f26390b = y0Var.h();
    }

    private final void c() {
        if (this.f26392d.f26533e != this.f26389a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i15);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26390b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i15 = this.f26390b;
        this.f26391c = i15;
        Object objA = a(i15);
        this.f26390b = this.f26392d.i(this.f26390b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        t.e(this.f26391c >= 0, "no calls to next() since the last call to remove()");
        this.f26389a += 32;
        int i15 = this.f26391c;
        y0 y0Var = this.f26392d;
        y0Var.remove(y0.k(y0Var, i15));
        this.f26390b--;
        this.f26391c = -1;
    }
}
