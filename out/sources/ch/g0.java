package ch;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class g0 extends e0 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ h0 f25883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(h0 h0Var) {
        super(h0Var);
        this.f25883d = h0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f25883d.isEmpty();
        a();
        ((ListIterator) this.f25843a).add(obj);
        this.f25883d.f25919f.f25945d++;
        if (zIsEmpty) {
            this.f25883d.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f25843a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f25843a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f25843a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f25843a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f25843a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, int i15) {
        super(h0Var, ((List) h0Var.f25864b).listIterator(i15));
        this.f25883d = h0Var;
    }
}
