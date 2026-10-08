package ao;

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
public final class b0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator<Comparable> f13884j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f13885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e<K, V> f13887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f13889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e<K, V> f13890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b0<K, V>.b f13891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0<K, V>.c f13892h;

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

        class a extends b0<K, V>.d<Map.Entry<K, V>> {
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
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && b0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = b0.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            b0.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f13888d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends b0<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f13906f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b0.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f13888d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f13897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f13898b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13899c;

        d() {
            this.f13897a = b0.this.f13890f.f13904d;
            this.f13899c = b0.this.f13889e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f13897a;
            b0 b0Var = b0.this;
            if (eVar == b0Var.f13890f) {
                throw new NoSuchElementException();
            }
            if (b0Var.f13889e != this.f13899c) {
                throw new ConcurrentModificationException();
            }
            this.f13897a = eVar.f13904d;
            this.f13898b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f13897a != b0.this.f13890f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f13898b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            b0.this.f(eVar, true);
            this.f13898b = null;
            this.f13899c = b0.this.f13889e;
        }
    }

    public b0() {
        this(f13884j, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e<K, V> eVar, boolean z15) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f13902b;
            e<K, V> eVar3 = eVar.f13903c;
            int i15 = eVar2 != null ? eVar2.f13909j : 0;
            int i16 = eVar3 != null ? eVar3.f13909j : 0;
            int i17 = i15 - i16;
            if (i17 == -2) {
                e<K, V> eVar4 = eVar3.f13902b;
                e<K, V> eVar5 = eVar3.f13903c;
                int i18 = (eVar4 != null ? eVar4.f13909j : 0) - (eVar5 != null ? eVar5.f13909j : 0);
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
                e<K, V> eVar6 = eVar2.f13902b;
                e<K, V> eVar7 = eVar2.f13903c;
                int i19 = (eVar6 != null ? eVar6.f13909j : 0) - (eVar7 != null ? eVar7.f13909j : 0);
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
                eVar.f13909j = i15 + 1;
                if (z15) {
                    return;
                }
            } else {
                eVar.f13909j = Math.max(i15, i16) + 1;
                if (!z15) {
                    return;
                }
            }
            eVar = eVar.f13901a;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f13901a;
        eVar.f13901a = null;
        if (eVar2 != null) {
            eVar2.f13901a = eVar3;
        }
        if (eVar3 == null) {
            this.f13887c = eVar2;
        } else if (eVar3.f13902b == eVar) {
            eVar3.f13902b = eVar2;
        } else {
            eVar3.f13903c = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f13902b;
        e<K, V> eVar3 = eVar.f13903c;
        e<K, V> eVar4 = eVar3.f13902b;
        e<K, V> eVar5 = eVar3.f13903c;
        eVar.f13903c = eVar4;
        if (eVar4 != null) {
            eVar4.f13901a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f13902b = eVar;
        eVar.f13901a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f13909j : 0, eVar4 != null ? eVar4.f13909j : 0) + 1;
        eVar.f13909j = iMax;
        eVar3.f13909j = Math.max(iMax, eVar5 != null ? eVar5.f13909j : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f13902b;
        e<K, V> eVar3 = eVar.f13903c;
        e<K, V> eVar4 = eVar2.f13902b;
        e<K, V> eVar5 = eVar2.f13903c;
        eVar.f13902b = eVar5;
        if (eVar5 != null) {
            eVar5.f13901a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f13903c = eVar;
        eVar.f13901a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f13909j : 0, eVar5 != null ? eVar5.f13909j : 0) + 1;
        eVar.f13909j = iMax;
        eVar2.f13909j = Math.max(iMax, eVar4 != null ? eVar4.f13909j : 0) + 1;
    }

    e<K, V> b(K k15, boolean z15) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f13885a;
        e<K, V> eVar2 = this.f13887c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f13884j ? (Comparable) k15 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f13906f) : comparator.compare(k15, eVar2.f13906f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f13902b : eVar2.f13903c;
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
        e<K, V> eVar5 = this.f13890f;
        if (eVar4 != null) {
            eVar = new e<>(this.f13886b, eVar4, k15, eVar5, eVar5.f13905e);
            if (iCompareTo < 0) {
                eVar4.f13902b = eVar;
            } else {
                eVar4.f13903c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f13884j && !(k15 instanceof Comparable)) {
                throw new ClassCastException(k15.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f13886b, eVar4, k15, eVar5, eVar5.f13905e);
            this.f13887c = eVar;
        }
        this.f13888d++;
        this.f13889e++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f13908h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f13887c = null;
        this.f13888d = 0;
        this.f13889e++;
        e<K, V> eVar = this.f13890f;
        eVar.f13905e = eVar;
        eVar.f13904d = eVar;
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
        b0<K, V>.b bVar = this.f13891g;
        if (bVar != null) {
            return bVar;
        }
        b0<K, V>.b bVar2 = new b();
        this.f13891g = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z15) {
        int i15;
        if (z15) {
            e<K, V> eVar2 = eVar.f13905e;
            eVar2.f13904d = eVar.f13904d;
            eVar.f13904d.f13905e = eVar2;
        }
        e<K, V> eVar3 = eVar.f13902b;
        e<K, V> eVar4 = eVar.f13903c;
        e<K, V> eVar5 = eVar.f13901a;
        int i16 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f13902b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f13903c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f13888d--;
            this.f13889e++;
            return;
        }
        e<K, V> eVarB = eVar3.f13909j > eVar4.f13909j ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.f13902b;
        if (eVar6 != null) {
            i15 = eVar6.f13909j;
            eVarB.f13902b = eVar6;
            eVar6.f13901a = eVarB;
            eVar.f13902b = null;
        } else {
            i15 = 0;
        }
        e<K, V> eVar7 = eVar.f13903c;
        if (eVar7 != null) {
            i16 = eVar7.f13909j;
            eVarB.f13903c = eVar7;
            eVar7.f13901a = eVarB;
            eVar.f13903c = null;
        }
        eVarB.f13909j = Math.max(i15, i16) + 1;
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
            return eVarD.f13908h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        b0<K, V>.c cVar = this.f13892h;
        if (cVar != null) {
            return cVar;
        }
        b0<K, V>.c cVar2 = new c();
        this.f13892h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k15, V v15) {
        if (k15 == null) {
            throw new NullPointerException("key == null");
        }
        if (v15 == null && !this.f13886b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k15, true);
        V v16 = eVarB.f13908h;
        eVarB.f13908h = v15;
        return v16;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f13908h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13888d;
    }

    public b0(boolean z15) {
        this(f13884j, z15);
    }

    public b0(Comparator<? super K> comparator, boolean z15) {
        this.f13888d = 0;
        this.f13889e = 0;
        this.f13885a = comparator == null ? f13884j : comparator;
        this.f13886b = z15;
        this.f13890f = new e<>(z15);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e<K, V> f13901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f13902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f13903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e<K, V> f13904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e<K, V> f13905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f13906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f13907g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        V f13908h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f13909j;

        e(boolean z15) {
            this.f13906f = null;
            this.f13907g = z15;
            this.f13905e = this;
            this.f13904d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f13902b; eVar2 != null; eVar2 = eVar2.f13902b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f13903c; eVar2 != null; eVar2 = eVar2.f13903c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k15 = this.f13906f;
                if (k15 != null ? k15.equals(entry.getKey()) : entry.getKey() == null) {
                    V v15 = this.f13908h;
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
            return this.f13906f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f13908h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k15 = this.f13906f;
            int iHashCode = k15 == null ? 0 : k15.hashCode();
            V v15 = this.f13908h;
            return iHashCode ^ (v15 != null ? v15.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v15) {
            if (v15 == null && !this.f13907g) {
                throw new NullPointerException("value == null");
            }
            V v16 = this.f13908h;
            this.f13908h = v15;
            return v16;
        }

        public String toString() {
            return this.f13906f + "=" + this.f13908h;
        }

        e(boolean z15, e<K, V> eVar, K k15, e<K, V> eVar2, e<K, V> eVar3) {
            this.f13901a = eVar;
            this.f13906f = k15;
            this.f13907g = z15;
            this.f13909j = 1;
            this.f13904d = eVar2;
            this.f13905e = eVar3;
            eVar3.f13904d = this;
            eVar2.f13905e = this;
        }
    }
}
