package u2;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lu2/j;", "T", "", "Lu2/a;", "Lu2/h;", "builder", "", "index", "<init>", "(Lu2/h;I)V", "Loq/i0;", "k", "()V", "l", "h", "i", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "c", "Lu2/h;", "d", "I", "expectedModCount", "Lu2/m;", "e", "Lu2/m;", "trieIterator", "f", "lastIteratedIndex", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<T> extends a<T> implements ListIterator<T>, gr.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<T> builder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private m<? extends T> trieIterator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    public j(h<T> hVar, int i15) {
        super(i15, hVar.size());
        this.builder = hVar;
        this.expectedModCount = hVar.k();
        this.lastIteratedIndex = -1;
        l();
    }

    private final void h() {
        if (this.expectedModCount != this.builder.k()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void k() {
        g(this.builder.size());
        this.expectedModCount = this.builder.k();
        this.lastIteratedIndex = -1;
        l();
    }

    private final void l() {
        Object[] objArrN = this.builder.getRoot();
        if (objArrN == null) {
            this.trieIterator = null;
            return;
        }
        int iD = n.d(this.builder.size());
        int iJ = lr.m.j(getIndex(), iD);
        int iO = (this.builder.getRootShift() / 5) + 1;
        m<? extends T> mVar = this.trieIterator;
        if (mVar == null) {
            this.trieIterator = new m<>(objArrN, iJ, iD, iO);
        } else {
            mVar.l(objArrN, iJ, iD, iO);
        }
    }

    @Override // u2.a, java.util.ListIterator
    public void add(T element) {
        h();
        this.builder.add(getIndex(), element);
        f(getIndex() + 1);
        k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        a();
        this.lastIteratedIndex = getIndex();
        m<? extends T> mVar = this.trieIterator;
        if (mVar == null) {
            Object[] objArrS = this.builder.getTail();
            int index = getIndex();
            f(index + 1);
            return (T) objArrS[index];
        }
        if (mVar.hasNext()) {
            f(getIndex() + 1);
            return mVar.next();
        }
        Object[] objArrS2 = this.builder.getTail();
        int index2 = getIndex();
        f(index2 + 1);
        return (T) objArrS2[index2 - mVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        c();
        this.lastIteratedIndex = getIndex() - 1;
        m<? extends T> mVar = this.trieIterator;
        if (mVar == null) {
            Object[] objArrS = this.builder.getTail();
            f(getIndex() - 1);
            return (T) objArrS[getIndex()];
        }
        if (getIndex() <= mVar.getSize()) {
            f(getIndex() - 1);
            return mVar.previous();
        }
        Object[] objArrS2 = this.builder.getTail();
        f(getIndex() - 1);
        return (T) objArrS2[getIndex() - mVar.getSize()];
    }

    @Override // u2.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            f(this.lastIteratedIndex);
        }
        k();
    }

    @Override // u2.a, java.util.ListIterator
    public void set(T element) {
        h();
        i();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.k();
        l();
    }
}
