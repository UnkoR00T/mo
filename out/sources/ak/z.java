package ak;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    static class a<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<E> f7036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final zj.q<? super E> f7037b;

        a(Collection<E> collection, zj.q<? super E> qVar) {
            this.f7036a = collection;
            this.f7037b = qVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e15) {
            zj.p.d(this.f7037b.apply(e15));
            return this.f7036a.add(e15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                zj.p.d(this.f7037b.apply(it.next()));
            }
            return this.f7036a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            x0.j(this.f7036a, this.f7037b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (z.c(this.f7036a, obj)) {
                return this.f7037b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return z.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !x0.a(this.f7036a, this.f7037b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return y0.l(this.f7036a.iterator(), this.f7037b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f7036a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f7036a.iterator();
            boolean z15 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f7037b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z15 = true;
                }
            }
            return z15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f7036a.iterator();
            boolean z15 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f7037b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z15 = true;
                }
            }
            return z15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f7036a.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                if (this.f7037b.apply(it.next())) {
                    i15++;
                }
            }
            return i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return a1.h(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a1.h(iterator()).toArray(tArr);
        }
    }

    static class b<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Collection<F> f7038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final zj.g<? super F, ? extends T> f7039b;

        b(Collection<F> collection, zj.g<? super F, ? extends T> gVar) {
            this.f7038a = (Collection) zj.p.q(collection);
            this.f7039b = (zj.g) zj.p.q(gVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f7038a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f7038a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return y0.z(this.f7038a.iterator(), this.f7039b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7038a.size();
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i15) {
        y.b(i15, "size");
        return new StringBuilder((int) Math.min(((long) i15) * 8, 1073741824L));
    }

    static boolean c(Collection<?> collection, Object obj) {
        zj.p.q(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <F, T> Collection<T> d(Collection<F> collection, zj.g<? super F, T> gVar) {
        return new b(collection, gVar);
    }
}
