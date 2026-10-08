package ak;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q0<K, V> extends j<K, V> implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient p0<K, ? extends l0<V>> f6936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient int f6937f;

    class a extends h2<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends l0<V>>> f6938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        K f6939b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Iterator<V> f6940c = y0.i();

        a() {
            this.f6938a = q0.this.f6936e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f6940c.hasNext()) {
                Map.Entry<K, ? extends l0<V>> next = this.f6938a.next();
                this.f6939b = next.getKey();
                this.f6940c = next.getValue().iterator();
            }
            K k15 = this.f6939b;
            Objects.requireNonNull(k15);
            return b1.h(k15, this.f6940c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6940c.hasNext() || this.f6938a.hasNext();
        }
    }

    class b extends h2<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator<? extends l0<V>> f6942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<V> f6943b = y0.i();

        b() {
            this.f6942a = q0.this.f6936e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6943b.hasNext() || this.f6942a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f6943b.hasNext()) {
                this.f6943b = this.f6942a.next().iterator();
            }
            return this.f6943b.next();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Map<K, l0.b<V>> f6945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator<? super K> f6946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator<? super V> f6947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6948d = 4;

        public q0<K, V> a() {
            Map<K, l0.b<V>> map = this.f6945a;
            if (map == null) {
                return o0.A();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.f6946b;
            if (comparator != null) {
                collectionEntrySet = n1.b(comparator).e().c(collectionEntrySet);
            }
            return o0.w(collectionEntrySet, this.f6947c);
        }

        Map<K, l0.b<V>> b() {
            Map<K, l0.b<V>> map = this.f6945a;
            if (map != null) {
                return map;
            }
            Map<K, l0.b<V>> mapD = p1.d();
            this.f6945a = mapD;
            return mapD;
        }

        l0.b<V> c(int i15) {
            return n0.t(i15);
        }

        public c<K, V> d(K k15, V v15) {
            y.a(k15, v15);
            l0.b<V> bVarC = b().get(k15);
            if (bVarC == null) {
                bVarC = c(this.f6948d);
                b().put(k15, bVarC);
            }
            bVarC.a(v15);
            return this;
        }
    }

    private static class d<K, V> extends l0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q0<K, V> f6949b;

        d(q0<K, V> q0Var) {
            this.f6949b = q0Var;
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f6949b.c(entry.getKey(), entry.getValue());
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public h2<Map.Entry<K, V>> iterator() {
            return this.f6949b.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f6949b.size();
        }
    }

    private static final class e<K, V> extends l0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient q0<K, V> f6950b;

        e(q0<K, V> q0Var) {
            this.f6950b = q0Var;
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6950b.d(obj);
        }

        @Override // ak.l0
        int f(Object[] objArr, int i15) {
            h2<? extends l0<V>> it = this.f6950b.f6936e.values().iterator();
            while (it.hasNext()) {
                i15 = it.next().f(objArr, i15);
            }
            return i15;
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public h2<V> iterator() {
            return this.f6950b.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f6950b.size();
        }
    }

    q0(p0<K, ? extends l0<V>> p0Var, int i15) {
        this.f6936e = p0Var;
        this.f6937f = i15;
    }

    @Override // ak.g, ak.d1
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // ak.d1
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // ak.g
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // ak.g
    Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // ak.g
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // ak.g
    Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // ak.g
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // ak.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // ak.g, ak.d1
    /* JADX INFO: renamed from: m */
    public p0<K, Collection<V>> b() {
        return this.f6936e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ak.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public l0<Map.Entry<K, V>> f() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ak.g
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l0<V> h() {
        return new e(this);
    }

    @Override // ak.g, ak.d1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public l0<Map.Entry<K, V>> a() {
        return (l0) super.a();
    }

    @Override // ak.d1
    @Deprecated
    public final boolean put(K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ak.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public h2<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // ak.g, ak.d1
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // ak.g, ak.d1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public u0<K> keySet() {
        return this.f6936e.keySet();
    }

    @Override // ak.d1
    public int size() {
        return this.f6937f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ak.g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public h2<V> k() {
        return new b();
    }

    @Override // ak.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // ak.g, ak.d1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public l0<V> values() {
        return (l0) super.values();
    }
}
