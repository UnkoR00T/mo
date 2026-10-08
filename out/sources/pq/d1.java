package pq;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R$\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lpq/d1;", "T", "Lpq/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "", "buffer", "", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "index", "get", "(I)Ljava/lang/Object;", "", "s", "()Z", "", "iterator", "()Ljava/util/Iterator;", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "maxCapacity", "o", "(I)Lpq/d1;", "element", "Loq/i0;", "n", "(Ljava/lang/Object;)V", "t", "b", "[Ljava/lang/Object;", "c", "I", "d", "startIndex", "value", "e", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class d1<T> extends d<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int startIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"pq/d1$a", "Lpq/c;", "Loq/i0;", "a", "()V", "", "c", "I", "count", "d", "index", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int count;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d1<T> f161698e;

        a(d1<T> d1Var) {
            this.f161698e = d1Var;
            this.count = d1Var.size();
            this.index = ((d1) d1Var).startIndex;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pq.c
        protected void a() {
            if (this.count == 0) {
                c();
                return;
            }
            d(((d1) this.f161698e).buffer[this.index]);
            this.index = (this.index + 1) % ((d1) this.f161698e).capacity;
            this.count--;
        }
    }

    public d1(Object[] objArr, int i15) {
        this.buffer = objArr;
        if (i15 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i15).toString());
        }
        if (i15 <= objArr.length) {
            this.capacity = objArr.length;
            this.size = i15;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i15 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // pq.d, java.util.List
    public T get(int index) {
        d.INSTANCE.b(index, size());
        return (T) this.buffer[(this.startIndex + index) % this.capacity];
    }

    @Override // pq.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void n(T element) {
        if (s()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = element;
        this.size = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d1<T> o(int maxCapacity) {
        int i15 = this.capacity;
        int iJ = lr.m.j(i15 + (i15 >> 1) + 1, maxCapacity);
        return new d1<>(this.startIndex == 0 ? Arrays.copyOf(this.buffer, iJ) : toArray(new Object[iJ]), size());
    }

    public final boolean s() {
        return size() == this.capacity;
    }

    public final void t(int n15) {
        if (n15 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + n15).toString());
        }
        if (n15 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + n15 + ", size = " + size()).toString());
        }
        if (n15 > 0) {
            int i15 = this.startIndex;
            int i16 = (i15 + n15) % this.capacity;
            if (i15 > i16) {
                q.z(this.buffer, null, i15, this.capacity);
                q.z(this.buffer, null, 0, i16);
            } else {
                q.z(this.buffer, null, i15, i16);
            }
            this.startIndex = i16;
            this.size = size() - n15;
        }
    }

    @Override // pq.b, java.util.Collection
    public <T> T[] toArray(T[] array) {
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            objArr = (T[]) Arrays.copyOf(array, size());
        }
        int size = size();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = this.startIndex; i16 < size && i17 < this.capacity; i17++) {
            objArr[i16] = this.buffer[i17];
            i16++;
        }
        while (i16 < size) {
            objArr[i16] = this.buffer[i15];
            i16++;
            i15++;
        }
        return (T[]) w.f(size, objArr);
    }

    public d1(int i15) {
        this(new Object[i15], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pq.b, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
