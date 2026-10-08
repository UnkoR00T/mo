package oq;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001!\u0092\u0001\u00020\u001c¨\u0006%"}, d2 = {"Loq/c0;", "", "Loq/b0;", "", "index", "i", "([II)I", "", "q", "([I)Ljava/util/Iterator;", "element", "", "f", "([II)Z", "elements", "g", "([ILjava/util/Collection;)Z", "o", "([I)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "a", "[I", "getStorage$annotations", "()V", "storage", "l", "([I)I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements Collection<b0>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Loq/c0$a;", "", "Loq/b0;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "a", "()I", "[I", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class a implements Iterator<b0>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int[] array;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(int[] iArr) {
            this.array = iArr;
        }

        public int a() {
            int i15 = this.index;
            int[] iArr = this.array;
            if (i15 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i15 + 1;
            return b0.e(iArr[i15]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ b0 next() {
            return b0.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static boolean f(int[] iArr, int i15) {
        return pq.n.d0(iArr, i15);
    }

    public static boolean g(int[] iArr, Collection<b0> collection) {
        Collection<b0> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof b0) || !pq.n.d0(iArr, ((b0) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(int[] iArr, Object obj) {
        return (obj instanceof c0) && fr.t.c(iArr, ((c0) obj).getStorage());
    }

    public static final int i(int[] iArr, int i15) {
        return b0.e(iArr[i15]);
    }

    public static int l(int[] iArr) {
        return iArr.length;
    }

    public static int n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean o(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator<b0> q(int[] iArr) {
        return new a(iArr);
    }

    public static String s(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(b0 b0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends b0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b0) {
            return e(((b0) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return g(this.storage, collection);
    }

    public boolean e(int i15) {
        return f(this.storage, i15);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return h(this.storage, other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return n(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return o(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<b0> iterator() {
        return q(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int size() {
        return l(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ int[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return fr.j.a(this);
    }

    public String toString() {
        return s(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) fr.j.b(this, tArr);
    }
}
