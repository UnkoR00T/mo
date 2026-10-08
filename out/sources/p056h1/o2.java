package p056h1;

import c1.e;
import er.l;
import n2.c;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\tR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lh1/o2;", "T", "Lh1/n;", "<init>", "()V", "", "itemIndex", "Lh1/n$a;", "d", "(I)Lh1/n$a;", "index", "", "c", "(Lh1/n$a;I)Z", "size", "value", "Loq/i0;", "b", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "a", "(IILer/l;)V", "get", "Ln2/c;", "Ln2/c;", "intervals", "I", "getSize", "()I", "Lh1/n$a;", "lastInterval", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o2<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<n.a<T>> intervals = new c<>(new n.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n.a<? extends T> lastInterval;

    private final boolean c(n.a<? extends T> aVar, int i15) {
        return i15 < aVar.getStartIndex() + aVar.getSize() && aVar.getStartIndex() <= i15;
    }

    private final n.a<T> d(int itemIndex) {
        n.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && c(aVar, itemIndex)) {
            return aVar;
        }
        c<n.a<T>> cVar = this.intervals;
        n.a aVar2 = (n.a<? extends T>) cVar.content[o.b(cVar, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // p056h1.n
    public void a(int fromIndex, int toIndex, l<? super n.a<? extends T>, i0> block) {
        if (fromIndex < 0 || fromIndex >= getSize()) {
            e.e("Index " + fromIndex + ", size " + getSize());
        }
        if (toIndex < 0 || toIndex >= getSize()) {
            e.e("Index " + toIndex + ", size " + getSize());
        }
        if (!(toIndex >= fromIndex)) {
            e.a("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')');
        }
        int iB = o.b(this.intervals, fromIndex);
        int startIndex = this.intervals.content[iB].getStartIndex();
        while (startIndex <= toIndex) {
            n.a<T> aVar = this.intervals.content[iB];
            block.b(aVar);
            startIndex += aVar.getSize();
            iB++;
        }
    }

    public final void b(int size, T value) {
        if (!(size >= 0)) {
            e.a("size should be >=0");
        }
        if (size == 0) {
            return;
        }
        n.a<T> aVar = new n.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.d(aVar);
    }

    @Override // p056h1.n
    public n.a<T> get(int index) {
        if (index < 0 || index >= getSize()) {
            e.e("Index " + index + ", size " + getSize());
        }
        return d(index);
    }

    @Override // p056h1.n
    public int getSize() {
        return this.size;
    }
}
