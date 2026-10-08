package ak;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class g<K, V> implements d1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<K> f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection<V> f6889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f6890d;

    class a extends f1.b<K, V> {
        a() {
        }

        @Override // ak.f1.b
        d1<K, V> e() {
            return g.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return g.this.i();
        }
    }

    class b extends AbstractCollection<V> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return g.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return g.this.size();
        }
    }

    g() {
    }

    @Override // ak.d1
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f6887a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionF = f();
        this.f6887a = collectionF;
        return collectionF;
    }

    @Override // ak.d1
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f6890d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = e();
        this.f6890d = mapE;
        return mapE;
    }

    @Override // ak.d1
    public boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> e();

    public boolean equals(Object obj) {
        return f1.a(this, obj);
    }

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    abstract Iterator<Map.Entry<K, V>> i();

    public boolean j() {
        return size() == 0;
    }

    Iterator<V> k() {
        return b1.u(a().iterator());
    }

    @Override // ak.d1
    public Set<K> keySet() {
        Set<K> set = this.f6888b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f6888b = setG;
        return setG;
    }

    @Override // ak.d1
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // ak.d1
    public Collection<V> values() {
        Collection<V> collection = this.f6889c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f6889c = collectionH;
        return collectionH;
    }
}
