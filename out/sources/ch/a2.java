package ch;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class a2 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient k1 f25749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient i1 f25750d;

    a2(k1 k1Var, i1 i1Var) {
        this.f25749c = k1Var;
        this.f25750d = i1Var;
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f25749c.get(obj) != null;
    }

    @Override // ch.d1
    final int e(Object[] objArr, int i15) {
        return this.f25750d.e(objArr, i15);
    }

    @Override // ch.d1
    /* JADX INFO: renamed from: h */
    public final g2 iterator() {
        return this.f25750d.listIterator(0);
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f25750d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
