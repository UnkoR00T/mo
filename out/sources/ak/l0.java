package ak;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f6901a = new Object[0];

    static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f6902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6904c;

        a(int i15) {
            y.b(i15, "initialCapacity");
            this.f6902a = new Object[i15];
            this.f6903b = 0;
        }

        private void g(int i15) {
            Object[] objArr = this.f6902a;
            int iC = b.c(objArr.length, this.f6903b + i15);
            if (iC > objArr.length || this.f6904c) {
                this.f6902a = Arrays.copyOf(this.f6902a, iC);
                this.f6904c = false;
            }
        }

        @Override // ak.l0.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof l0) {
                    this.f6903b = ((l0) collection).f(this.f6902a, this.f6903b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e15) {
            zj.p.q(e15);
            g(1);
            Object[] objArr = this.f6902a;
            int i15 = this.f6903b;
            this.f6903b = i15 + 1;
            objArr[i15] = e15;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        final void f(Object[] objArr, int i15) {
            l1.c(objArr, i15);
            g(i15);
            System.arraycopy(objArr, 0, this.f6902a, this.f6903b, i15);
            this.f6903b += i15;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int c(int i15, int i16) {
            if (i16 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i16 <= i15) {
                return i15;
            }
            int iHighestOneBit = i15 + (i15 >> 1) + 1;
            if (iHighestOneBit < i16) {
                iHighestOneBit = Integer.highestOneBit(i16 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract b<E> a(E e15);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    l0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public n0<E> e() {
        return isEmpty() ? n0.C() : n0.n(toArray());
    }

    int f(Object[] objArr, int i15) {
        h2<E> it = iterator();
        while (it.hasNext()) {
            objArr[i15] = it.next();
            i15++;
        }
        return i15;
    }

    Object[] g() {
        return null;
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k */
    public abstract h2<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f6901a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zj.p.q(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return (T[]) p1.a(objArrG, i(), h(), tArr);
            }
            tArr = (T[]) l1.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        f(tArr, 0);
        return tArr;
    }
}
