package zg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends w0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1 f235128b = new x0(a1.f235054e, 0);

    z0() {
    }

    public static z0 n() {
        return a1.f235054e;
    }

    public static z0 o(Collection collection) {
        if (collection instanceof w0) {
            z0 z0VarH = ((w0) collection).h();
            if (!z0VarH.i()) {
                return z0VarH;
            }
            Object[] array = z0VarH.toArray();
            return s(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (array2[i15] == null) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 9);
                sb5.append("at index ");
                sb5.append(i15);
                throw new NullPointerException(sb5.toString());
            }
        }
        return s(array2, length);
    }

    static z0 s(Object[] objArr, int i15) {
        return i15 == 0 ? a1.f235054e : new a1(objArr, i15);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
                if (!s0.a(get(i15), list.get(i15))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it4 = list.iterator();
        while (it.hasNext()) {
            if (!it4.hasNext() || !s0.a(it.next(), it4.next())) {
                return false;
            }
        }
        return !it4.hasNext();
    }

    @Override // zg.w0
    @Deprecated
    public final z0 h() {
        return this;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // zg.w0
    int j(Object[] objArr, int i15) {
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            objArr[i16] = get(i16);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public z0 subList(int i15, int i16) {
        t0.c(i15, i16, size());
        int i17 = i16 - i15;
        if (i17 == size()) {
            return this;
        }
        return i17 == 0 ? a1.f235054e : new y0(this, i15, i17);
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
    @Deprecated
    public final Object remove(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i15, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final d1 listIterator(int i15) {
        t0.b(i15, size(), "index");
        return isEmpty() ? f235128b : new x0(this, i15);
    }
}
