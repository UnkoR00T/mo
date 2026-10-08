package r0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends l1<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a<K, V>.C4297a f169784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a<K, V>.c f169785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a<K, V>.e f169786f;

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    final class C4297a extends AbstractSet<Map.Entry<K, V>> {
        C4297a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.getSize();
        }
    }

    final class b extends k<K> {
        b() {
            super(a.this.getSize());
        }

        @Override // r0.k
        protected K a(int i15) {
            return a.this.f(i15);
        }

        @Override // r0.k
        protected void c(int i15) {
            a.this.h(i15);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f169790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f169791b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f169792c;

        d() {
            this.f169790a = a.this.getSize() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f169791b++;
            this.f169792c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f169792c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return s0.a.c(entry.getKey(), a.this.f(this.f169791b)) && s0.a.c(entry.getValue(), a.this.k(this.f169791b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f169792c) {
                return a.this.f(this.f169791b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f169792c) {
                return a.this.k(this.f169791b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f169791b < this.f169790a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f169792c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kF = a.this.f(this.f169791b);
            V vK = a.this.k(this.f169791b);
            return (kF == null ? 0 : kF.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f169792c) {
                throw new IllegalStateException();
            }
            a.this.h(this.f169791b);
            this.f169791b--;
            this.f169790a--;
            this.f169792c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            if (this.f169792c) {
                return a.this.i(this.f169791b, v15);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class f extends k<V> {
        f() {
            super(a.this.getSize());
        }

        @Override // r0.k
        protected V a(int i15) {
            return a.this.k(i15);
        }

        @Override // r0.k
        protected void c(int i15) {
            a.this.h(i15);
        }
    }

    public a() {
    }

    static <T> boolean m(Set<T> set, Object obj) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.l1, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.l1, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C4297a c4297a = this.f169784d;
        if (c4297a != null) {
            return c4297a;
        }
        a<K, V>.C4297a c4297a2 = new C4297a();
        this.f169784d = c4297a2;
        return c4297a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.l1, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        a<K, V>.c cVar = this.f169785e;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.f169785e = cVar2;
        return cVar2;
    }

    public boolean l(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean n(Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean o(Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(f(size2))) {
                h(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.l1, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        a<K, V>.e eVar = this.f169786f;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.f169786f = eVar2;
        return eVar2;
    }

    public a(int i15) {
        super(i15);
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k15) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return a.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = a.this.getSize() - 1; size >= 0; size--) {
                K kF = a.this.f(size);
                iHashCode += kF == null ? 0 : kF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iD = a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            a.this.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i15 = 0; i15 < size; i15++) {
                objArr[i15] = a.this.f(i15);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i15 = 0; i15 < size; i15++) {
                tArr[i15] = a.this.f(i15);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v15) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            a.this.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int size = a.this.getSize();
            int i15 = 0;
            boolean z15 = false;
            while (i15 < size) {
                if (collection.contains(a.this.k(i15))) {
                    a.this.h(i15);
                    i15--;
                    size--;
                    z15 = true;
                }
                i15++;
            }
            return z15;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int size = a.this.getSize();
            int i15 = 0;
            boolean z15 = false;
            while (i15 < size) {
                if (!collection.contains(a.this.k(i15))) {
                    a.this.h(i15);
                    i15--;
                    size--;
                    z15 = true;
                }
                i15++;
            }
            return z15;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i15 = 0; i15 < size; i15++) {
                objArr[i15] = a.this.k(i15);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i15 = 0; i15 < size; i15++) {
                tArr[i15] = a.this.k(i15);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public a(l1 l1Var) {
        super(l1Var);
    }
}
