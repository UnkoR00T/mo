package bh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class o extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient i f19457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient f f19458d;

    o(i iVar, f fVar) {
        this.f19457c = iVar;
        this.f19458d = fVar;
    }

    @Override // bh.c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19457c.get(obj) != null;
    }

    @Override // bh.c
    final int e(Object[] objArr, int i15) {
        return this.f19458d.e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f19458d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19457c.size();
    }
}
