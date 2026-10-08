package wl;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f214000j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f214001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f214002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e<K, V> f214003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f214004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f214005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e<K, V> f214006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a0<K, V>.b f214007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a0<K, V>.c f214008h;

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends a0<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && a0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = a0.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            a0.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.f214004d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends a0<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f214022f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a0.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.f214004d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f214013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f214014b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f214015c;

        d() {
            this.f214013a = a0.this.f214006f.f214020d;
            this.f214015c = a0.this.f214005e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f214013a;
            a0 a0Var = a0.this;
            if (eVar == a0Var.f214006f) {
                throw new NoSuchElementException();
            }
            if (a0Var.f214005e != this.f214015c) {
                throw new ConcurrentModificationException();
            }
            this.f214013a = eVar.f214020d;
            this.f214014b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f214013a != a0.this.f214006f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f214014b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            a0.this.f(eVar, true);
            this.f214014b = null;
            this.f214015c = a0.this.f214005e;
        }
    }

    public a0() {
        this(f214000j, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e<K, V> eVar, boolean z15) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f214018b;
            e<K, V> eVar3 = eVar.f214019c;
            int i15 = eVar2 != null ? eVar2.f214025j : 0;
            int i16 = eVar3 != null ? eVar3.f214025j : 0;
            int i17 = i15 - i16;
            if (i17 == -2) {
                e<K, V> eVar4 = eVar3.f214018b;
                e<K, V> eVar5 = eVar3.f214019c;
                int i18 = (eVar4 != null ? eVar4.f214025j : 0) - (eVar5 != null ? eVar5.f214025j : 0);
                if (i18 == -1 || (i18 == 0 && !z15)) {
                    i(eVar);
                } else {
                    k(eVar3);
                    i(eVar);
                }
                if (z15) {
                    return;
                }
            } else if (i17 == 2) {
                e<K, V> eVar6 = eVar2.f214018b;
                e<K, V> eVar7 = eVar2.f214019c;
                int i19 = (eVar6 != null ? eVar6.f214025j : 0) - (eVar7 != null ? eVar7.f214025j : 0);
                if (i19 == 1 || (i19 == 0 && !z15)) {
                    k(eVar);
                } else {
                    i(eVar2);
                    k(eVar);
                }
                if (z15) {
                    return;
                }
            } else if (i17 == 0) {
                eVar.f214025j = i15 + 1;
                if (z15) {
                    return;
                }
            } else {
                eVar.f214025j = Math.max(i15, i16) + 1;
                if (!z15) {
                    return;
                }
            }
            eVar = eVar.f214017a;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f214017a;
        eVar.f214017a = null;
        if (eVar2 != null) {
            eVar2.f214017a = eVar3;
        }
        if (eVar3 == null) {
            this.f214003c = eVar2;
        } else if (eVar3.f214018b == eVar) {
            eVar3.f214018b = eVar2;
        } else {
            eVar3.f214019c = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f214018b;
        e<K, V> eVar3 = eVar.f214019c;
        e<K, V> eVar4 = eVar3.f214018b;
        e<K, V> eVar5 = eVar3.f214019c;
        eVar.f214019c = eVar4;
        if (eVar4 != null) {
            eVar4.f214017a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f214018b = eVar;
        eVar.f214017a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f214025j : 0, eVar4 != null ? eVar4.f214025j : 0) + 1;
        eVar.f214025j = iMax;
        eVar3.f214025j = Math.max(iMax, eVar5 != null ? eVar5.f214025j : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f214018b;
        e<K, V> eVar3 = eVar.f214019c;
        e<K, V> eVar4 = eVar2.f214018b;
        e<K, V> eVar5 = eVar2.f214019c;
        eVar.f214018b = eVar5;
        if (eVar5 != null) {
            eVar5.f214017a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f214019c = eVar;
        eVar.f214017a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f214025j : 0, eVar5 != null ? eVar5.f214025j : 0) + 1;
        eVar.f214025j = iMax;
        eVar2.f214025j = Math.max(iMax, eVar4 != null ? eVar4.f214025j : 0) + 1;
    }

    e<K, V> b(K k15, boolean z15) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f214001a;
        e<K, V> eVar2 = this.f214003c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f214000j ? (Comparable) k15 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f214022f) : comparator.compare(k15, eVar2.f214022f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f214018b : eVar2.f214019c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z15) {
            return null;
        }
        e<K, V> eVar5 = this.f214006f;
        if (eVar4 != null) {
            eVar = new e<>(this.f214002b, eVar4, k15, eVar5, eVar5.f214021e);
            if (iCompareTo < 0) {
                eVar4.f214018b = eVar;
            } else {
                eVar4.f214019c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f214000j && !(k15 instanceof Comparable)) {
                throw new ClassCastException(k15.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f214002b, eVar4, k15, eVar5, eVar5.f214021e);
            this.f214003c = eVar;
        }
        this.f214004d++;
        this.f214005e++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f214024h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f214003c = null;
        this.f214004d = 0;
        this.f214005e++;
        e<K, V> eVar = this.f214006f;
        eVar.f214021e = eVar;
        eVar.f214020d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        a0<K, V>.b bVar = this.f214007g;
        if (bVar != null) {
            return bVar;
        }
        a0<K, V>.b bVar2 = new b();
        this.f214007g = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z15) {
        int i15;
        if (z15) {
            e<K, V> eVar2 = eVar.f214021e;
            eVar2.f214020d = eVar.f214020d;
            eVar.f214020d.f214021e = eVar2;
        }
        e<K, V> eVar3 = eVar.f214018b;
        e<K, V> eVar4 = eVar.f214019c;
        e<K, V> eVar5 = eVar.f214017a;
        int i16 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f214018b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f214019c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f214004d--;
            this.f214005e++;
            return;
        }
        e<K, V> eVarB = eVar3.f214025j > eVar4.f214025j ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.f214018b;
        if (eVar6 != null) {
            i15 = eVar6.f214025j;
            eVarB.f214018b = eVar6;
            eVar6.f214017a = eVarB;
            eVar.f214018b = null;
        } else {
            i15 = 0;
        }
        e<K, V> eVar7 = eVar.f214019c;
        if (eVar7 != null) {
            i16 = eVar7.f214025j;
            eVarB.f214019c = eVar7;
            eVar7.f214017a = eVarB;
            eVar.f214019c = null;
        }
        eVarB.f214025j = Math.max(i15, i16) + 1;
        h(eVar, eVarB);
    }

    e<K, V> g(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f214024h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        a0<K, V>.c cVar = this.f214008h;
        if (cVar != null) {
            return cVar;
        }
        a0<K, V>.c cVar2 = new c();
        this.f214008h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k15, V v15) {
        if (k15 == null) {
            throw new NullPointerException("key == null");
        }
        if (v15 == null && !this.f214002b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k15, true);
        V v16 = eVarB.f214024h;
        eVarB.f214024h = v15;
        return v16;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f214024h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f214004d;
    }

    public a0(boolean z15) {
        this(f214000j, z15);
    }

    public a0(Comparator<? super K> comparator, boolean z15) {
        this.f214004d = 0;
        this.f214005e = 0;
        this.f214001a = comparator == null ? f214000j : comparator;
        this.f214002b = z15;
        this.f214006f = new e<>(z15);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f214017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f214018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f214019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e<K, V> f214020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e<K, V> f214021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f214022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f214023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f214024h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f214025j;

        e(boolean z15) {
            this.f214022f = null;
            this.f214023g = z15;
            this.f214021e = this;
            this.f214020d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f214018b; eVar2 != null; eVar2 = eVar2.f214018b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f214019c; eVar2 != null; eVar2 = eVar2.f214019c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k15 = this.f214022f;
                if (k15 != null ? k15.equals(entry.getKey()) : entry.getKey() == null) {
                    V v15 = this.f214024h;
                    if (v15 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v15.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f214022f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f214024h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k15 = this.f214022f;
            int iHashCode = k15 == null ? 0 : k15.hashCode();
            V v15 = this.f214024h;
            return iHashCode ^ (v15 != null ? v15.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            if (v15 == null && !this.f214023g) {
                throw new NullPointerException("value == null");
            }
            V v16 = this.f214024h;
            this.f214024h = v15;
            return v16;
        }

        public String toString() {
            return this.f214022f + "=" + this.f214024h;
        }

        e(boolean z15, e<K, V> eVar, K k15, e<K, V> eVar2, e<K, V> eVar3) {
            this.f214017a = eVar;
            this.f214022f = k15;
            this.f214023g = z15;
            this.f214025j = 1;
            this.f214020d = eVar2;
            this.f214021e = eVar3;
            eVar3.f214020d = this;
            eVar2.f214021e = this;
        }
    }
}
