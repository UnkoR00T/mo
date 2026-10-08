package r0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010&\"\u0004\bD\u0010\u0007R\u0014\u0010G\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010&¨\u0006H"}, d2 = {"Lr0/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "Loq/i0;", "clear", "()V", "minimumCapacity", "e", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "q", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "k", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "a", "[I", "g", "()[I", "n", "([I)V", "hashes", "b", "[Ljava/lang/Object;", "f", "l", "([Ljava/lang/Object;)V", "c", "I", "i", "o", "_size", "h", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b<E> implements Collection<E>, Set<E>, gr.b, gr.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr0/b$a;", "Lr0/k;", "<init>", "(Lr0/b;)V", "", "index", "a", "(I)Ljava/lang/Object;", "Loq/i0;", "c", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a extends k<E> {
        public a() {
            super(b.this.i());
        }

        @Override // r0.k
        protected E a(int index) {
            return b.this.q(index);
        }

        @Override // r0.k
        protected void c(int index) {
            b.this.k(index);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i15;
        int iC;
        int i16 = i();
        if (element == null) {
            iC = d.d(this);
            i15 = 0;
        } else {
            int iHashCode = element.hashCode();
            i15 = iHashCode;
            iC = d.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i17 = ~iC;
        if (i16 >= getHashes().length) {
            int i18 = 8;
            if (i16 >= 8) {
                i18 = (i16 >> 1) + i16;
            } else if (i16 < 4) {
                i18 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, i18);
            if (i16 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                pq.n.q(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                pq.n.s(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i17 < i16) {
            int i19 = i17 + 1;
            pq.n.l(getHashes(), getHashes(), i19, i17, i16);
            pq.n.n(getArray(), getArray(), i19, i17, i16);
        }
        if (i16 != i() || i17 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i17] = i15;
        getArray()[i17] = element;
        o(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        e(i() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            n(s0.a.f176996a);
            l(s0.a.f176998c);
            o(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int minimumCapacity) {
        int i15 = i();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, minimumCapacity);
            if (i() > 0) {
                pq.n.q(hashes, getHashes(), 0, 0, i(), 6, null);
                pq.n.s(array, getArray(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i15) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i15 = i();
            for (int i16 = 0; i16 < i15; i16++) {
                if (!((Set) other).contains(q(i16))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i15 = i();
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 += hashes[i17];
        }
        return i16;
    }

    public final int i() {
        return this._size;
    }

    public final int indexOf(Object key) {
        return key == null ? d.d(this) : d.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public final E k(int index) {
        int i15;
        Object[] objArr;
        int i16 = i();
        E e15 = (E) getArray()[index];
        if (i16 <= 1) {
            clear();
            return e15;
        }
        int i17 = i16 - 1;
        if (getHashes().length <= 8 || i() >= getHashes().length / 3) {
            if (index < i17) {
                int i18 = index + 1;
                pq.n.l(getHashes(), getHashes(), index, i18, i16);
                pq.n.n(getArray(), getArray(), index, i18, i16);
            }
            getArray()[i17] = null;
        } else {
            int i19 = i() > 8 ? i() + (i() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, i19);
            if (index > 0) {
                pq.n.q(hashes, getHashes(), 0, 0, index, 6, null);
                objArr = array;
                pq.n.s(objArr, getArray(), 0, 0, index, 6, null);
                i15 = index;
            } else {
                i15 = index;
                objArr = array;
            }
            if (i15 < i17) {
                int i25 = i15 + 1;
                pq.n.l(hashes, getHashes(), i15, i25, i16);
                pq.n.n(objArr, getArray(), i15, i25, i16);
            }
        }
        if (i16 != i()) {
            throw new ConcurrentModificationException();
        }
        o(i17);
        return e15;
    }

    public final void l(Object[] objArr) {
        this.array = objArr;
    }

    public final void n(int[] iArr) {
        this.hashes = iArr;
    }

    public final void o(int i15) {
        this._size = i15;
    }

    public final E q(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        k(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        boolean z15 = false;
        for (int i15 = i() - 1; -1 < i15; i15--) {
            if (!pq.v.c0(elements, getArray()[i15])) {
                k(i15);
                z15 = true;
            }
        }
        return z15;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return pq.n.v(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder(i() * 14);
        sb5.append('{');
        int i15 = i();
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 > 0) {
                sb5.append(", ");
            }
            E eQ = q(i16);
            if (eQ != this) {
                sb5.append(eQ);
            } else {
                sb5.append("(this Set)");
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    public b(int i15) {
        this.hashes = s0.a.f176996a;
        this.array = s0.a.f176998c;
        if (i15 > 0) {
            d.a(this, i15);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        T[] tArr = (T[]) c.a(array, this._size);
        pq.n.n(this.array, tArr, 0, 0, this._size);
        return tArr;
    }

    public /* synthetic */ b(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15);
    }
}
