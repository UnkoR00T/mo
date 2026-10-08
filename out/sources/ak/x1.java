package ak;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class x1<E> extends v0<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final x1<Comparable> f7014f = new x1<>(n0.C(), n1.d());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient n0<E> f7015e;

    x1(n0<E> n0Var, Comparator<? super E> comparator) {
        super(comparator);
        this.f7015e = n0Var;
    }

    private int p0(Object obj) {
        return Collections.binarySearch(this.f7015e, obj, q0());
    }

    @Override // ak.v0
    v0<E> T() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f6989c);
        return isEmpty() ? v0.V(comparatorReverseOrder) : new x1(this.f7015e.R(), comparatorReverseOrder);
    }

    @Override // ak.v0
    v0<E> Y(E e15, boolean z15) {
        return l0(0, m0(e15, z15));
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e15) {
        int iO0 = o0(e15, true);
        if (iO0 == size()) {
            return null;
        }
        return this.f7015e.get(iO0);
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (p0(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof h1) {
            collection = ((h1) collection).y2();
        }
        if (!e2.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        h2<E> it = iterator();
        Iterator<?> it4 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it4.next();
        E next2 = it.next();
        while (true) {
            try {
                int iI0 = i0(next2, next);
                if (iI0 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iI0 == 0) {
                    if (!it4.hasNext()) {
                        return true;
                    }
                    next = it4.next();
                } else if (iI0 > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // ak.u0, ak.l0
    public n0<E> e() {
        return this.f7015e;
    }

    @Override // ak.v0
    v0<E> e0(E e15, boolean z15, E e16, boolean z16) {
        return h0(e15, z15).Y(e16, z16);
    }

    @Override // ak.u0, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!e2.b(this.f6989c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            h2<E> it4 = iterator();
            while (it4.hasNext()) {
                E next = it4.next();
                E next2 = it.next();
                if (next2 == null || i0(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        return this.f7015e.f(objArr, i15);
    }

    @Override // java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7015e.get(0);
    }

    @Override // java.util.NavigableSet
    public E floor(E e15) {
        int iM0 = m0(e15, true) - 1;
        if (iM0 == -1) {
            return null;
        }
        return this.f7015e.get(iM0);
    }

    @Override // ak.l0
    Object[] g() {
        return this.f7015e.g();
    }

    @Override // ak.l0
    int h() {
        return this.f7015e.h();
    }

    @Override // ak.v0
    v0<E> h0(E e15, boolean z15) {
        return l0(o0(e15, z15), size());
    }

    @Override // java.util.NavigableSet
    public E higher(E e15) {
        int iO0 = o0(e15, false);
        if (iO0 == size()) {
            return null;
        }
        return this.f7015e.get(iO0);
    }

    @Override // ak.l0
    int i() {
        return this.f7015e.i();
    }

    @Override // ak.l0
    boolean j() {
        return this.f7015e.j();
    }

    @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public h2<E> iterator() {
        return this.f7015e.iterator();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public h2<E> descendingIterator() {
        return this.f7015e.R().iterator();
    }

    x1<E> l0(int i15, int i16) {
        if (i15 == 0 && i16 == size()) {
            return this;
        }
        return i15 < i16 ? new x1<>(this.f7015e.subList(i15, i16), this.f6989c) : v0.V(this.f6989c);
    }

    @Override // java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f7015e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public E lower(E e15) {
        int iM0 = m0(e15, false) - 1;
        if (iM0 == -1) {
            return null;
        }
        return this.f7015e.get(iM0);
    }

    int m0(E e15, boolean z15) {
        int iBinarySearch = Collections.binarySearch(this.f7015e, zj.p.q(e15), comparator());
        if (iBinarySearch >= 0) {
            return z15 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    int o0(E e15, boolean z15) {
        int iBinarySearch = Collections.binarySearch(this.f7015e, zj.p.q(e15), comparator());
        if (iBinarySearch >= 0) {
            return z15 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    Comparator<Object> q0() {
        return this.f6989c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f7015e.size();
    }
}
