package ak;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class d<K, V> extends ak.g<K, V> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f6834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f6835f;

    class a extends d<K, V>.AbstractC0146d<V> {
        a() {
            super();
        }

        @Override // ak.d.AbstractC0146d
        V a(K k15, V v15) {
            return v15;
        }
    }

    class b extends d<K, V>.AbstractC0146d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.d.AbstractC0146d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k15, V v15) {
            return b1.h(k15, v15);
        }
    }

    private class c extends b1.n<K, Collection<V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f6838c;

        class a extends b1.h<K, Collection<V>> {
            a() {
            }

            @Override // ak.b1.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return z.c(c.this.f6838c.entrySet(), obj);
            }

            @Override // ak.b1.h
            Map<K, Collection<V>> e() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // ak.b1.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.B(entry.getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f6841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Collection<V> f6842b;

            b() {
                this.f6841a = c.this.f6838c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f6841a.next();
                this.f6842b = next.getValue();
                return c.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6841a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                zj.p.x(this.f6842b != null, "no calls to next() since the last call to remove()");
                this.f6841a.remove();
                d.s(d.this, this.f6842b.size());
                this.f6842b.clear();
                this.f6842b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f6838c = map;
        }

        @Override // ak.b1.n
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) b1.n(this.f6838c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.D(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f6838c == d.this.f6834e) {
                d.this.clear();
            } else {
                y0.e(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return b1.m(this.f6838c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f6838c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionU = d.this.u();
            collectionU.addAll(collectionRemove);
            d.s(d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionU;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return b1.h(key, d.this.D(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f6838c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f6838c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> g() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f6838c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f6838c.toString();
        }
    }

    /* JADX INFO: renamed from: ak.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0146d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f6844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        K f6845b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection<V> f6846c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator<V> f6847d = y0.k();

        AbstractC0146d() {
            this.f6844a = d.this.f6834e.entrySet().iterator();
        }

        abstract T a(K k15, V v15);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6844a.hasNext() || this.f6847d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f6847d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f6844a.next();
                this.f6845b = next.getKey();
                Collection<V> value = next.getValue();
                this.f6846c = value;
                this.f6847d = value.iterator();
            }
            return a(k1.a(this.f6845b), this.f6847d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6847d.remove();
            Collection<V> collection = this.f6846c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f6844a.remove();
            }
            d.p(d.this);
        }
    }

    private class e extends b1.k<K, Collection<V>> {

        class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f6850a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f6851b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f6852c;

            a(e eVar, Iterator it) {
                this.f6851b = it;
                this.f6852c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f6851b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f6851b.next();
                this.f6850a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                zj.p.x(this.f6850a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f6850a.getValue();
                this.f6851b.remove();
                d.s(d.this, value.size());
                value.clear();
                this.f6850a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y0.e(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || e().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return e().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = e().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.s(d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    private final class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k15) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = h().ceilingEntry(k15);
            if (entryCeilingEntry == null) {
                return null;
            }
            return e(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k15) {
            return h().ceilingKey(k15);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = h().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return e(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k15) {
            Map.Entry<K, Collection<V>> entryFloorEntry = h().floorEntry(k15);
            if (entryFloorEntry == null) {
                return null;
            }
            return e(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k15) {
            return h().floorKey(k15);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k15) {
            Map.Entry<K, Collection<V>> entryHigherEntry = h().higherEntry(k15);
            if (entryHigherEntry == null) {
                return null;
            }
            return e(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k15) {
            return h().higherKey(k15);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.d.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> f() {
            return new g(h());
        }

        @Override // ak.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k15) {
            return headMap(k15, false);
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionU = d.this.u();
            collectionU.addAll(next.getValue());
            it.remove();
            return b1.h(next.getKey(), d.this.C(collectionU));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = h().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return e(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k15) {
            Map.Entry<K, Collection<V>> entryLowerEntry = h().lowerEntry(k15);
            if (entryLowerEntry == null) {
                return null;
            }
            return e(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k15) {
            return h().lowerKey(k15);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.d.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // ak.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k15, K k16) {
            return subMap(k15, true, k16, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g();
        }

        @Override // ak.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k15) {
            return tailMap(k15, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k15, boolean z15) {
            return new f(h().headMap(k15, z15));
        }

        @Override // ak.d.i, ak.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k15, boolean z15, K k16, boolean z16) {
            return new f(h().subMap(k15, z15, k16, z16));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k15, boolean z15) {
            return new f(h().tailMap(k15, z15));
        }
    }

    private final class g extends d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k15) {
            return f().ceilingKey(k15);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k15) {
            return f().floorKey(k15);
        }

        @Override // ak.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k15) {
            return headSet(k15, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.d.j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public K higher(K k15) {
            return f().higherKey(k15);
        }

        @Override // ak.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k15, K k16) {
            return subSet(k15, true, k16, false);
        }

        @Override // ak.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k15) {
            return tailSet(k15, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k15) {
            return f().lowerKey(k15);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) y0.u(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) y0.u(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k15, boolean z15) {
            return new g(f().headMap(k15, z15));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k15, boolean z15, K k16, boolean z16) {
            return new g(f().subMap(k15, z15, k16, z16));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k15, boolean z15) {
            return new g(f().tailMap(k15, z15));
        }
    }

    private class h extends d<K, V>.l implements RandomAccess {
        h(K k15, List<V> list, d<K, V>.k kVar) {
            super(k15, list, kVar);
        }
    }

    private class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        SortedSet<K> f6856e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        SortedSet<K> f() {
            return new j(h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return h().firstKey();
        }

        @Override // ak.d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> g() {
            SortedSet<K> sortedSet = this.f6856e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetF = f();
            this.f6856e = sortedSetF;
            return sortedSetF;
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f6838c;
        }

        public SortedMap<K, Collection<V>> headMap(K k15) {
            return new i(h().headMap(k15));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k15, K k16) {
            return new i(h().subMap(k15, k16));
        }

        public SortedMap<K, Collection<V>> tailMap(K k15) {
            return new i(h().tailMap(k15));
        }
    }

    private class j extends d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.e();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k15) {
            return new j(f().headMap(k15));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k15, K k16) {
            return new j(f().subMap(k15, k16));
        }

        public SortedSet<K> tailSet(K k15) {
            return new j(f().tailMap(k15));
        }
    }

    protected d(Map<K, Collection<V>> map) {
        zj.p.d(map.isEmpty());
        this.f6834e = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> A(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(Object obj) {
        Collection collection = (Collection) b1.o(this.f6834e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f6835f -= size;
        }
    }

    static /* synthetic */ int o(d dVar) {
        int i15 = dVar.f6835f;
        dVar.f6835f = i15 + 1;
        return i15;
    }

    static /* synthetic */ int p(d dVar) {
        int i15 = dVar.f6835f;
        dVar.f6835f = i15 - 1;
        return i15;
    }

    static /* synthetic */ int r(d dVar, int i15) {
        int i16 = dVar.f6835f + i15;
        dVar.f6835f = i16;
        return i16;
    }

    static /* synthetic */ int s(d dVar, int i15) {
        int i16 = dVar.f6835f - i15;
        dVar.f6835f = i16;
        return i16;
    }

    abstract <E> Collection<E> C(Collection<E> collection);

    abstract Collection<V> D(K k15, Collection<V> collection);

    final List<V> E(K k15, List<V> list, d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k15, list, kVar) : new l(k15, list, kVar);
    }

    @Override // ak.g, ak.d1
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // ak.d1
    public void clear() {
        Iterator<Collection<V>> it = this.f6834e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f6834e.clear();
        this.f6835f = 0;
    }

    @Override // ak.g
    Collection<Map.Entry<K, V>> f() {
        return new ak.g.a();
    }

    @Override // ak.d1
    public Collection<V> get(K k15) {
        Collection<V> collectionV = this.f6834e.get(k15);
        if (collectionV == null) {
            collectionV = v(k15);
        }
        return D(k15, collectionV);
    }

    @Override // ak.g
    Collection<V> h() {
        return new ak.g.b();
    }

    @Override // ak.g
    Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // ak.g
    Iterator<V> k() {
        return new a();
    }

    @Override // ak.d1
    public boolean put(K k15, V v15) {
        Collection<V> collection = this.f6834e.get(k15);
        if (collection != null) {
            if (!collection.add(v15)) {
                return false;
            }
            this.f6835f++;
            return true;
        }
        Collection<V> collectionV = v(k15);
        if (!collectionV.add(v15)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f6835f++;
        this.f6834e.put(k15, collectionV);
        return true;
    }

    @Override // ak.d1
    public int size() {
        return this.f6835f;
    }

    abstract Collection<V> u();

    Collection<V> v(K k15) {
        return u();
    }

    @Override // ak.g, ak.d1
    public Collection<V> values() {
        return super.values();
    }

    final Map<K, Collection<V>> w() {
        Map<K, Collection<V>> map = this.f6834e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f6834e);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f6834e) : new c(this.f6834e);
    }

    final Set<K> y() {
        Map<K, Collection<V>> map = this.f6834e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f6834e);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f6834e) : new e(this.f6834e);
    }

    class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f6859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection<V> f6860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final d<K, V>.k f6861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection<V> f6862d;

        k(K k15, Collection<V> collection, d<K, V>.k kVar) {
            this.f6859a = k15;
            this.f6860b = collection;
            this.f6861c = kVar;
            this.f6862d = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v15) {
            i();
            boolean zIsEmpty = this.f6860b.isEmpty();
            boolean zAdd = this.f6860b.add(v15);
            if (zAdd) {
                d.o(d.this);
                if (zIsEmpty) {
                    e();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f6860b.addAll(collection);
            if (zAddAll) {
                d.r(d.this, this.f6860b.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f6860b.clear();
            d.s(d.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            i();
            return this.f6860b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.f6860b.containsAll(collection);
        }

        void e() {
            d<K, V>.k kVar = this.f6861c;
            if (kVar != null) {
                kVar.e();
            } else {
                d.this.f6834e.put(this.f6859a, this.f6860b);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f6860b.equals(obj);
        }

        d<K, V>.k f() {
            return this.f6861c;
        }

        Collection<V> g() {
            return this.f6860b;
        }

        K h() {
            return this.f6859a;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f6860b.hashCode();
        }

        void i() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f6861c;
            if (kVar != null) {
                kVar.i();
                if (this.f6861c.g() != this.f6862d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f6860b.isEmpty() || (collection = (Collection) d.this.f6834e.get(this.f6859a)) == null) {
                    return;
                }
                this.f6860b = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        void j() {
            d<K, V>.k kVar = this.f6861c;
            if (kVar != null) {
                kVar.j();
            } else if (this.f6860b.isEmpty()) {
                d.this.f6834e.remove(this.f6859a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            i();
            boolean zRemove = this.f6860b.remove(obj);
            if (zRemove) {
                d.p(d.this);
                j();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f6860b.removeAll(collection);
            if (zRemoveAll) {
                d.r(d.this, this.f6860b.size() - size);
                j();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            zj.p.q(collection);
            int size = size();
            boolean zRetainAll = this.f6860b.retainAll(collection);
            if (zRetainAll) {
                d.r(d.this, this.f6860b.size() - size);
                j();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f6860b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f6860b.toString();
        }

        class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Iterator<V> f6864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Collection<V> f6865b;

            a() {
                Collection<V> collection = k.this.f6860b;
                this.f6865b = collection;
                this.f6864a = d.A(collection);
            }

            Iterator<V> a() {
                c();
                return this.f6864a;
            }

            void c() {
                k.this.i();
                if (k.this.f6860b != this.f6865b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f6864a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f6864a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f6864a.remove();
                d.p(d.this);
                k.this.j();
            }

            a(Iterator<V> it) {
                this.f6865b = k.this.f6860b;
                this.f6864a = it;
            }
        }
    }

    class l extends d<K, V>.k implements List<V> {

        private class a extends d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> d() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v15) {
                boolean zIsEmpty = l.this.isEmpty();
                d().add(v15);
                d.o(d.this);
                if (zIsEmpty) {
                    l.this.e();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v15) {
                d().set(v15);
            }

            public a(int i15) {
                super(l.this.k().listIterator(i15));
            }
        }

        l(K k15, List<V> list, d<K, V>.k kVar) {
            super(k15, list, kVar);
        }

        @Override // java.util.List
        public void add(int i15, V v15) {
            i();
            boolean zIsEmpty = g().isEmpty();
            k().add(i15, v15);
            d.o(d.this);
            if (zIsEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i15, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = k().addAll(i15, collection);
            if (zAddAll) {
                d.r(d.this, g().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i15) {
            i();
            return k().get(i15);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            i();
            return k().indexOf(obj);
        }

        List<V> k() {
            return (List) g();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            i();
            return k().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i15) {
            i();
            V vRemove = k().remove(i15);
            d.p(d.this);
            j();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i15, V v15) {
            i();
            return k().set(i15, v15);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i15, int i16) {
            i();
            return d.this.E(h(), k().subList(i15, i16), f() == null ? this : f());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i15) {
            i();
            return new a(i15);
        }
    }
}
