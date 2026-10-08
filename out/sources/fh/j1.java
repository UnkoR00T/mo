package fh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class j1 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient o0 f63146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient m0 f63147d;

    j1(o0 o0Var, m0 m0Var) {
        this.f63146c = o0Var;
        this.f63147d = m0Var;
    }

    @Override // fh.h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f63146c.get(obj) != null;
    }

    @Override // fh.h0
    final int e(Object[] objArr, int i15) {
        return this.f63147d.e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f63147d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
