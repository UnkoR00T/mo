package ak;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f6924d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient u0<Map.Entry<K, V>> f6925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient u0<K> f6926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient l0<V> f6927c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator<? super V> f6928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f6929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f6931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0148a f6932e;

        /* JADX INFO: renamed from: ak.p0$a$a, reason: collision with other inner class name */
        static final class C0148a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f6933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f6934b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f6935c;

            C0148a(Object obj, Object obj2, Object obj3) {
                this.f6933a = obj;
                this.f6934b = obj2;
                this.f6935c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f6933a + "=" + this.f6934b + " and " + this.f6933a + "=" + this.f6935c);
            }
        }

        public a() {
            this(4);
        }

        private p0<K, V> b(boolean z15) {
            Object[] objArrF;
            C0148a c0148a;
            C0148a c0148a2;
            if (z15 && (c0148a2 = this.f6932e) != null) {
                throw c0148a2.a();
            }
            int length = this.f6930c;
            if (this.f6928a == null) {
                objArrF = this.f6929b;
            } else {
                if (this.f6931d) {
                    this.f6929b = Arrays.copyOf(this.f6929b, length * 2);
                }
                objArrF = this.f6929b;
                if (!z15) {
                    objArrF = f(objArrF, this.f6930c);
                    if (objArrF.length < this.f6929b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f6928a);
            }
            this.f6931d = true;
            u1 u1VarS = u1.s(length, objArrF, this);
            if (!z15 || (c0148a = this.f6932e) == null) {
                return u1VarS;
            }
            throw c0148a.a();
        }

        private void e(int i15) {
            int i16 = i15 * 2;
            Object[] objArr = this.f6929b;
            if (i16 > objArr.length) {
                this.f6929b = Arrays.copyOf(objArr, l0.b.c(objArr.length, i16));
                this.f6931d = false;
            }
        }

        private Object[] f(Object[] objArr, int i15) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i16 = i15 - 1; i16 >= 0; i16--) {
                Object obj = objArr[i16 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i16);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i15 - bitSet.cardinality()) * 2];
            int i17 = 0;
            int i18 = 0;
            while (i17 < i15 * 2) {
                if (bitSet.get(i17 >>> 1)) {
                    i17 += 2;
                } else {
                    int i19 = i18 + 1;
                    int i25 = i17 + 1;
                    Object obj2 = objArr[i17];
                    Objects.requireNonNull(obj2);
                    objArr2[i18] = obj2;
                    i18 += 2;
                    i17 += 2;
                    Object obj3 = objArr[i25];
                    Objects.requireNonNull(obj3);
                    objArr2[i19] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void k(Object[] objArr, int i15, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = i16 * 2;
                Object obj = objArr[i17];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i17 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i16] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i15, n1.b(comparator).f(b1.t()));
            for (int i18 = 0; i18 < i15; i18++) {
                int i19 = i18 * 2;
                objArr[i19] = entryArr[i18].getKey();
                objArr[i19 + 1] = entryArr[i18].getValue();
            }
        }

        public p0<K, V> a() {
            return d();
        }

        public p0<K, V> c() {
            return b(false);
        }

        public p0<K, V> d() {
            return b(true);
        }

        public a<K, V> g(K k15, V v15) {
            e(this.f6930c + 1);
            y.a(k15, v15);
            Object[] objArr = this.f6929b;
            int i15 = this.f6930c;
            objArr[i15 * 2] = k15;
            objArr[(i15 * 2) + 1] = v15;
            this.f6930c = i15 + 1;
            return this;
        }

        public a<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                e(this.f6930c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            return this;
        }

        public a<K, V> j(Map<? extends K, ? extends V> map) {
            return i(map.entrySet());
        }

        a(int i15) {
            this.f6929b = new Object[i15 * 2];
            this.f6930c = 0;
            this.f6931d = false;
        }
    }

    p0() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> a<K, V> b(int i15) {
        y.b(i15, "expectedSize");
        return new a<>(i15);
    }

    public static <K, V> p0<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static <K, V> p0<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof p0) && !(map instanceof SortedMap)) {
            p0<K, V> p0Var = (p0) map;
            if (!p0Var.i()) {
                return p0Var;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> p0<K, V> m() {
        return (p0<K, V>) u1.f6975h;
    }

    public static <K, V> p0<K, V> n(K k15, V v15, K k16, V v16) {
        y.a(k15, v15);
        y.a(k16, v16);
        return u1.r(2, new Object[]{k15, v15, k16, v16});
    }

    public static <K, V> p0<K, V> o(K k15, V v15, K k16, V v16, K k17, V v17) {
        y.a(k15, v15);
        y.a(k16, v16);
        y.a(k17, v17);
        return u1.r(3, new Object[]{k15, v15, k16, v16, k17, v17});
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract u0<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return b1.g(this, obj);
    }

    abstract u0<K> f();

    abstract l0<V> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v15) {
        V v16 = get(obj);
        return v16 != null ? v16 : v15;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public u0<Map.Entry<K, V>> entrySet() {
        u0<Map.Entry<K, V>> u0Var = this.f6925a;
        if (u0Var != null) {
            return u0Var;
        }
        u0<Map.Entry<K, V>> u0VarE = e();
        this.f6925a = u0VarE;
        return u0VarE;
    }

    @Override // java.util.Map
    public int hashCode() {
        return b2.d(entrySet());
    }

    abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public u0<K> keySet() {
        u0<K> u0Var = this.f6926b;
        if (u0Var != null) {
            return u0Var;
        }
        u0<K> u0VarF = f();
        this.f6926b = u0VarF;
        return u0VarF;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public l0<V> values() {
        l0<V> l0Var = this.f6927c;
        if (l0Var != null) {
            return l0Var;
        }
        l0<V> l0VarG = g();
        this.f6927c = l0VarG;
        return l0VarG;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return b1.p(this);
    }
}
