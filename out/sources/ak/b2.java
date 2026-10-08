package ak;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends e<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f6828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f6829b;

        /* JADX INFO: renamed from: ak.b2$a$a, reason: collision with other inner class name */
        class C0145a extends ak.b<E> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Iterator<E> f6830c;

            C0145a() {
                this.f6830c = a.this.f6828a.iterator();
            }

            @Override // ak.b
            protected E a() {
                while (this.f6830c.hasNext()) {
                    E next = this.f6830c.next();
                    if (a.this.f6829b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f6828a = set;
            this.f6829b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6828a.contains(obj) && this.f6829b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f6828a.containsAll(collection) && this.f6829b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public h2<E> iterator() {
            return new C0145a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f6829b, this.f6828a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f6828a.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                if (this.f6829b.contains(it.next())) {
                    i15++;
                }
            }
            return i15;
        }
    }

    private static class b<E> extends z.a<E> implements Set<E> {
        b(Set<E> set, zj.q<? super E> qVar) {
            super(set, qVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return b2.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return b2.d(this);
        }
    }

    private static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, zj.q<? super E> qVar) {
            super(sortedSet, qVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f7036a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) y0.m(this.f7036a.iterator(), this.f7037b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e15) {
            return new c(((SortedSet) this.f7036a).headSet(e15), this.f7037b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f7036a;
            while (true) {
                E e15 = (Object) sortedSetHeadSet.last();
                if (this.f7037b.apply(e15)) {
                    return e15;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e15);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e15, E e16) {
            return new c(((SortedSet) this.f7036a).subSet(e15, e16), this.f7037b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e15) {
            return new c(((SortedSet) this.f7036a).tailSet(e15), this.f7037b);
        }
    }

    static abstract class d<E> extends AbstractSet<E> {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return b2.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) zj.p.q(collection));
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(a2 a2Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e15) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, zj.q<? super E> qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) zj.p.q(set), (zj.q) zj.p.q(qVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f7036a, zj.r.c(bVar.f7037b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, zj.q<? super E> qVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) zj.p.q(sortedSet), (zj.q) zj.p.q(qVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f7036a, zj.r.c(bVar.f7037b, qVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i15 = ~(~(i15 + (next != null ? next.hashCode() : 0)));
        }
        return i15;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        zj.p.r(set, "set1");
        zj.p.r(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i15) {
        return new HashSet<>(b1.e(i15));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(b1.k());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        zj.p.q(collection);
        if (collection instanceof h1) {
            collection = ((h1) collection).y2();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : y0.v(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
