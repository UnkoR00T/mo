package eh;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class o extends m implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f50866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar) {
        super(pVar);
        this.f50866d = pVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f50866d.isEmpty();
        a();
        ((ListIterator) this.f50784a).add(obj);
        q.i(this.f50866d.f50900f);
        if (zIsEmpty) {
            this.f50866d.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f50784a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f50784a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f50784a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f50784a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f50784a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, int i15) {
        super(pVar, ((List) pVar.f50826b).listIterator(i15));
        this.f50866d = pVar;
    }
}
