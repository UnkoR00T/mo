package ak;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 {

    private static class a<T> extends b<T> implements RandomAccess {
        a(List<T> list) {
            super(list);
        }
    }

    private static class b<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<T> f6794a;

        class a implements ListIterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f6795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ListIterator f6796b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f6797c;

            a(b bVar, ListIterator listIterator) {
                this.f6796b = listIterator;
                this.f6797c = bVar;
            }

            @Override // java.util.ListIterator
            public void add(T t15) {
                this.f6796b.add(t15);
                this.f6796b.previous();
                this.f6795a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f6796b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f6796b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f6795a = true;
                return (T) this.f6796b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f6797c.h(this.f6796b.nextIndex());
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f6795a = true;
                return (T) this.f6796b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                y.d(this.f6795a);
                this.f6796b.remove();
                this.f6795a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t15) {
                zj.p.w(this.f6795a);
                this.f6796b.set(t15);
            }
        }

        b(List<T> list) {
            this.f6794a = (List) zj.p.q(list);
        }

        private int g(int i15) {
            int size = size();
            zj.p.o(i15, size);
            return (size - 1) - i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i15) {
            int size = size();
            zj.p.t(i15, size);
            return size - i15;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i15, T t15) {
            this.f6794a.add(h(i15), t15);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f6794a.clear();
        }

        List<T> f() {
            return this.f6794a;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i15) {
            return this.f6794a.get(g(i15));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i15) {
            return new a(this, this.f6794a.listIterator(h(i15)));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i15) {
            return this.f6794a.remove(g(i15));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i15, int i16) {
            subList(i15, i16).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i15, T t15) {
            return this.f6794a.set(g(i15), t15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6794a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i15, int i16) {
            zj.p.v(i15, i16, size());
            return a1.j(this.f6794a.subList(h(i16), h(i15)));
        }
    }

    private static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f6798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final zj.g<? super F, ? extends T> f6799b;

        class a extends g2<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // ak.f2
            T a(F f15) {
                return c.this.f6799b.apply(f15);
            }
        }

        c(List<F> list, zj.g<? super F, ? extends T> gVar) {
            this.f6798a = (List) zj.p.q(list);
            this.f6799b = (zj.g) zj.p.q(gVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i15) {
            return this.f6799b.apply(this.f6798a.get(i15));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f6798a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i15) {
            return new a(this.f6798a.listIterator(i15));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i15) {
            return this.f6799b.apply(this.f6798a.remove(i15));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i15, int i16) {
            this.f6798a.subList(i15, i16).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6798a.size();
        }
    }

    private static class d<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<F> f6801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final zj.g<? super F, ? extends T> f6802b;

        class a extends g2<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // ak.f2
            T a(F f15) {
                return d.this.f6802b.apply(f15);
            }
        }

        d(List<F> list, zj.g<? super F, ? extends T> gVar) {
            this.f6801a = (List) zj.p.q(list);
            this.f6802b = (zj.g) zj.p.q(gVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f6801a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i15) {
            return new a(this.f6801a.listIterator(i15));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i15, int i16) {
            this.f6801a.subList(i15, i16).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6801a.size();
        }
    }

    static int a(int i15) {
        y.b(i15, "arraySize");
        return ek.g.m(((long) i15) + 5 + ((long) (i15 / 10)));
    }

    static boolean b(List<?> list, Object obj) {
        if (obj == zj.p.q(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return y0.h(list.iterator(), list2.iterator());
        }
        for (int i15 = 0; i15 < size; i15++) {
            if (!zj.l.a(list.get(i15), list2.get(i15))) {
                return false;
            }
        }
        return true;
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (zj.l.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i15 = 0;
        if (obj == null) {
            while (i15 < size) {
                if (list.get(i15) == null) {
                    return i15;
                }
                i15++;
            }
            return -1;
        }
        while (i15 < size) {
            if (obj.equals(list.get(i15))) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (zj.l.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> h(Iterator<? extends E> it) {
        ArrayList<E> arrayListG = g();
        y0.a(arrayListG, it);
        return arrayListG;
    }

    @SafeVarargs
    public static <E> ArrayList<E> i(E... eArr) {
        zj.p.q(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> j(List<T> list) {
        if (list instanceof n0) {
            return ((n0) list).R();
        }
        if (list instanceof b) {
            return ((b) list).f();
        }
        return list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static <F, T> List<T> k(List<F> list, zj.g<? super F, ? extends T> gVar) {
        return list instanceof RandomAccess ? new c(list, gVar) : new d(list, gVar);
    }
}
