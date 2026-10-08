package fh;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class k extends i implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f63308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar) {
        super(lVar);
        this.f63308d = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f63308d.isEmpty();
        a();
        ((ListIterator) this.f63087a).add(obj);
        this.f63308d.f63356f.f63379d++;
        if (zIsEmpty) {
            this.f63308d.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f63087a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f63087a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f63087a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f63087a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f63087a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i15) {
        super(lVar, ((List) lVar.f63142b).listIterator(i15));
        this.f63308d = lVar;
    }
}
