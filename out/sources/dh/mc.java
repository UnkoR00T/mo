package dh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mc extends la implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f42067b = new kc(rc.f42203e, 0);

    mc() {
    }

    static mc j(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    static mc k(Object[] objArr, int i15) {
        return i15 == 0 ? rc.f42203e : new rc(objArr, i15);
    }

    public static mc n(Object obj) {
        Object[] objArr = {obj};
        qc.a(objArr, 1);
        return k(objArr, 1);
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

    @Override // dh.la, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // dh.la
    int e(Object[] objArr, int i15) {
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            objArr[i16] = get(i16);
        }
        return size;
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
                if (!b0.a(get(i15), list.get(i15))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it4 = list.iterator();
        while (it.hasNext()) {
            if (!it4.hasNext() || !b0.a(it.next(), it4.next())) {
                return false;
            }
        }
        return !it4.hasNext();
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
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public mc subList(int i15, int i16) {
        f4.c(i15, i16, size());
        int i17 = i16 - i15;
        if (i17 == size()) {
            return this;
        }
        return i17 == 0 ? rc.f42203e : new lc(this, i15, i17);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
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
    public final d listIterator(int i15) {
        f4.b(i15, size(), "index");
        return isEmpty() ? f42067b : new kc(this, i15);
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
