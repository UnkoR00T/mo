package eh;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class h1 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient r0 f50603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient p0 f50604d;

    h1(r0 r0Var, p0 p0Var) {
        this.f50603c = r0Var;
        this.f50604d = p0Var;
    }

    @Override // eh.k0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f50603c.get(obj) != null;
    }

    @Override // eh.k0
    final int e(Object[] objArr, int i15) {
        return this.f50604d.e(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f50604d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f50603c.size();
    }
}
