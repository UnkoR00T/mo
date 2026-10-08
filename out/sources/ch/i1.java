package ch;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i1 extends d1 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h2 f25946b = new g1(x1.f26467f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25947c = 0;

    i1() {
    }

    static i1 k(Object[] objArr, int i15) {
        return i15 == 0 ? x1.f26467f : new x1(objArr, i15);
    }

    public static i1 n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        w1.a(objArr, 2);
        return k(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i15, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i15, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // ch.d1
    int e(Object[] objArr, int i15) {
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            objArr[i15 + i16] = get(i16);
        }
        return i15 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i15 = 0; i15 < size; i15++) {
                if (!r.a(get(i15), list.get(i15))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it4 = list.iterator();
        while (it.hasNext()) {
            if (!it4.hasNext() || !r.a(it.next(), it4.next())) {
                return false;
            }
        }
        return !it4.hasNext();
    }

    @Override // ch.d1
    /* JADX INFO: renamed from: h */
    public final g2 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i15 = 0; i15 < size; i15++) {
            iHashCode = (iHashCode * 31) + get(i15).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i15 = 0; i15 < size; i15++) {
            if (obj.equals(get(i15))) {
                return i15;
            }
        }
        return -1;
    }

    @Override // ch.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public i1 subList(int i15, int i16) {
        t.d(i15, i16, size());
        int i17 = i16 - i15;
        if (i17 == size()) {
            return this;
        }
        return i17 == 0 ? x1.f26467f : new h1(this, i15, i17);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final h2 listIterator(int i15) {
        t.b(i15, size(), "index");
        return isEmpty() ? f25946b : new g1(this, i15);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i15, Object obj) {
        throw new UnsupportedOperationException();
    }
}
