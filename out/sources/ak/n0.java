package ak;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n0<E> extends l0<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i2<Object> f6918b = new b(t1.f6969e, 0);

    public static final class a<E> extends l0.a<E> {
        public a() {
            this(4);
        }

        @Override // ak.l0.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e15) {
            super.d(e15);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public n0<E> k() {
            this.f6904c = true;
            return n0.o(this.f6902a, this.f6903b);
        }

        n0<E> l(Comparator<? super E> comparator) {
            this.f6904c = true;
            Arrays.sort(this.f6902a, 0, this.f6903b, comparator);
            return n0.o(this.f6902a, this.f6903b);
        }

        a<E> m(a<E> aVar) {
            f(aVar.f6902a, aVar.f6903b);
            return this;
        }

        a(int i15) {
            super(i15);
        }
    }

    static class b<E> extends ak.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n0<E> f6919c;

        b(n0<E> n0Var, int i15) {
            super(n0Var.size(), i15);
            this.f6919c = n0Var;
        }

        @Override // ak.a
        protected E a(int i15) {
            return this.f6919c.get(i15);
        }
    }

    private static class c<E> extends n0<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient n0<E> f6920c;

        c(n0<E> n0Var) {
            this.f6920c = n0Var;
        }

        private int X(int i15) {
            return (size() - 1) - i15;
        }

        private int Y(int i15) {
            return size() - i15;
        }

        @Override // ak.n0
        public n0<E> R() {
            return this.f6920c;
        }

        @Override // ak.n0, java.util.List
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public n0<E> subList(int i15, int i16) {
            zj.p.v(i15, i16, size());
            return this.f6920c.subList(Y(i16), Y(i15)).R();
        }

        @Override // ak.n0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6920c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i15) {
            zj.p.o(i15, size());
            return this.f6920c.get(X(i15));
        }

        @Override // ak.n0, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f6920c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return X(iLastIndexOf);
            }
            return -1;
        }

        @Override // ak.n0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // ak.l0
        boolean j() {
            return this.f6920c.j();
        }

        @Override // ak.n0, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f6920c.indexOf(obj);
            if (iIndexOf >= 0) {
                return X(iIndexOf);
            }
            return -1;
        }

        @Override // ak.n0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6920c.size();
        }

        @Override // ak.n0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i15) {
            return super.listIterator(i15);
        }
    }

    class d extends n0<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f6921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f6922d;

        d(int i15, int i16) {
            this.f6921c = i15;
            this.f6922d = i16;
        }

        @Override // ak.n0, java.util.List
        /* JADX INFO: renamed from: U */
        public n0<E> subList(int i15, int i16) {
            zj.p.v(i15, i16, this.f6922d);
            n0 n0Var = n0.this;
            int i17 = this.f6921c;
            return n0Var.subList(i15 + i17, i16 + i17);
        }

        @Override // ak.l0
        Object[] g() {
            return n0.this.g();
        }

        @Override // java.util.List
        public E get(int i15) {
            zj.p.o(i15, this.f6922d);
            return n0.this.get(i15 + this.f6921c);
        }

        @Override // ak.l0
        int h() {
            return n0.this.i() + this.f6921c + this.f6922d;
        }

        @Override // ak.l0
        int i() {
            return n0.this.i() + this.f6921c;
        }

        @Override // ak.n0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // ak.l0
        boolean j() {
            return true;
        }

        @Override // ak.n0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6922d;
        }

        @Override // ak.n0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i15) {
            return super.listIterator(i15);
        }
    }

    n0() {
    }

    public static <E> n0<E> C() {
        return (n0<E>) t1.f6969e;
    }

    public static <E> n0<E> E(E e15) {
        return u(e15);
    }

    public static <E> n0<E> F(E e15, E e16) {
        return u(e15, e16);
    }

    public static <E> n0<E> G(E e15, E e16, E e17) {
        return u(e15, e16, e17);
    }

    public static <E> n0<E> L(E e15, E e16, E e17, E e18, E e19) {
        return u(e15, e16, e17, e18, e19);
    }

    public static <E> n0<E> M(E e15, E e16, E e17, E e18, E e19, E e25) {
        return u(e15, e16, e17, e18, e19, e25);
    }

    @SafeVarargs
    public static <E> n0<E> Q(E e15, E e16, E e17, E e18, E e19, E e25, E e26, E e27, E e28, E e29, E e35, E e36, E... eArr) {
        zj.p.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e15;
        objArr[1] = e16;
        objArr[2] = e17;
        objArr[3] = e18;
        objArr[4] = e19;
        objArr[5] = e25;
        objArr[6] = e26;
        objArr[7] = e27;
        objArr[8] = e28;
        objArr[9] = e29;
        objArr[10] = e35;
        objArr[11] = e36;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return u(objArr);
    }

    public static <E> n0<E> T(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        zj.p.q(comparator);
        Object[] objArrN = x0.n(iterable);
        l1.b(objArrN);
        Arrays.sort(objArrN, comparator);
        return n(objArrN);
    }

    public static <E> Collector<E, ?, n0<E>> W() {
        return x.a();
    }

    static <E> n0<E> n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static <E> n0<E> o(Object[] objArr, int i15) {
        return i15 == 0 ? C() : new t1(objArr, i15);
    }

    public static <E> a<E> s() {
        return new a<>();
    }

    public static <E> a<E> t(int i15) {
        y.b(i15, "expectedSize");
        return new a<>(i15);
    }

    private static <E> n0<E> u(Object... objArr) {
        return n(l1.b(objArr));
    }

    public static <E> n0<E> v(Collection<? extends E> collection) {
        if (!(collection instanceof l0)) {
            return u(collection.toArray());
        }
        n0<E> n0VarE = ((l0) collection).e();
        return n0VarE.j() ? n(n0VarE.toArray()) : n0VarE;
    }

    public static <E> n0<E> w(E[] eArr) {
        return eArr.length == 0 ? C() : u((Object[]) eArr.clone());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i2<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i2<E> listIterator(int i15) {
        zj.p.t(i15, size());
        return isEmpty() ? (i2<E>) f6918b : new b(this, i15);
    }

    public n0<E> R() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: U */
    public n0<E> subList(int i15, int i16) {
        zj.p.v(i15, i16, size());
        int i17 = i16 - i15;
        if (i17 == size()) {
            return this;
        }
        return i17 == 0 ? C() : V(i15, i16);
    }

    n0<E> V(int i15, int i16) {
        return new d(i15, i16 - i15);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i15, E e15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i15, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // ak.l0
    @Deprecated
    public final n0<E> e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return a1.b(this, obj);
    }

    @Override // ak.l0
    int f(Object[] objArr, int i15) {
        int size = size();
        for (int i16 = 0; i16 < size; i16++) {
            objArr[i15 + i16] = get(i16);
        }
        return i15 + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i15 = 1;
        for (int i16 = 0; i16 < size; i16++) {
            i15 = ~(~((i15 * 31) + get(i16).hashCode()));
        }
        return i15;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return a1.c(this, obj);
    }

    @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public h2<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return a1.e(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i15, E e15) {
        throw new UnsupportedOperationException();
    }
}
