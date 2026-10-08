package ak;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
class a0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f6771k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f6772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f6773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f6774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f6775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f6776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f6777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set<K> f6778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f6779h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Collection<V> f6780j;

    class a extends a0<K, V>.e<K> {
        a() {
            super(a0.this, null);
        }

        @Override // ak.a0.e
        K c(int i15) {
            return (K) a0.this.N(i15);
        }
    }

    class b extends a0<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(a0.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ak.a0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int i15) {
            return new g(i15);
        }
    }

    class c extends a0<K, V>.e<V> {
        c() {
            super(a0.this, null);
        }

        @Override // ak.a0.e
        V c(int i15) {
            return (V) a0.this.f0(i15);
        }
    }

    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapC = a0.this.C();
            if (mapC != null) {
                return mapC.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iK = a0.this.K(entry.getKey());
                if (iK != -1 && zj.l.a(a0.this.f0(iK), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return a0.this.E();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int I;
            int iF;
            Map<K, V> mapC = a0.this.C();
            if (mapC != null) {
                return mapC.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (a0.this.R() || (iF = b0.f(entry.getKey(), entry.getValue(), (I = a0.this.I()), a0.this.W(), a0.this.U(), a0.this.V(), a0.this.X())) == -1) {
                return false;
            }
            a0.this.Q(iF, I);
            a0.e(a0.this);
            a0.this.J();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.size();
        }
    }

    class f extends AbstractSet<K> {
        f() {
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
            return a0.this.O();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapC = a0.this.C();
            if (mapC != null) {
                return mapC.keySet().remove(obj);
            }
            return a0.this.T(obj) != a0.f6771k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.size();
        }
    }

    final class g extends ak.f<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f6790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6791b;

        g(int i15) {
            this.f6790a = (K) a0.this.N(i15);
            this.f6791b = i15;
        }

        private void a() {
            int i15 = this.f6791b;
            if (i15 == -1 || i15 >= a0.this.size() || !zj.l.a(this.f6790a, a0.this.N(this.f6791b))) {
                this.f6791b = a0.this.K(this.f6790a);
            }
        }

        @Override // ak.f, java.util.Map.Entry
        public K getKey() {
            return this.f6790a;
        }

        @Override // ak.f, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapC = a0.this.C();
            if (mapC != null) {
                return (V) k1.a(mapC.get(this.f6790a));
            }
            a();
            int i15 = this.f6791b;
            return i15 == -1 ? (V) k1.b() : (V) a0.this.f0(i15);
        }

        @Override // ak.f, java.util.Map.Entry
        public V setValue(V v15) {
            Map<K, V> mapC = a0.this.C();
            if (mapC != null) {
                return (V) k1.a(mapC.put(this.f6790a, v15));
            }
            a();
            int i15 = this.f6791b;
            if (i15 == -1) {
                a0.this.put(this.f6790a, v15);
                return (V) k1.b();
            }
            V v16 = (V) a0.this.f0(i15);
            a0.this.e0(this.f6791b, v15);
            return v16;
        }
    }

    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return a0.this.g0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a0.this.size();
        }
    }

    a0() {
        L(3);
    }

    public static <K, V> a0<K, V> B(int i15) {
        return new a0<>(i15);
    }

    private int D(int i15) {
        return U()[i15];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I() {
        return (1 << (this.f6776e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K(Object obj) {
        if (R()) {
            return -1;
        }
        int iC = k0.c(obj);
        int I = I();
        int iH = b0.h(W(), iC & I);
        if (iH == 0) {
            return -1;
        }
        int iB = b0.b(iC, I);
        do {
            int i15 = iH - 1;
            int iD = D(i15);
            if (b0.b(iD, I) == iB && zj.l.a(obj, N(i15))) {
                return i15;
            }
            iH = b0.c(iD, I);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K N(int i15) {
        return (K) V()[i15];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object T(Object obj) {
        int I;
        int iF;
        if (!R() && (iF = b0.f(obj, null, (I = I()), W(), U(), V(), null)) != -1) {
            V vF0 = f0(iF);
            Q(iF, I);
            this.f6777f--;
            J();
            return vF0;
        }
        return f6771k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] U() {
        int[] iArr = this.f6773b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] V() {
        Object[] objArr = this.f6774c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object W() {
        Object obj = this.f6772a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] X() {
        Object[] objArr = this.f6775d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void Z(int i15) {
        int iMin;
        int length = U().length;
        if (i15 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Y(iMin);
    }

    private int a0(int i15, int i16, int i17, int i18) {
        Object objA = b0.a(i16);
        int i19 = i16 - 1;
        if (i18 != 0) {
            b0.i(objA, i17 & i19, i18 + 1);
        }
        Object objW = W();
        int[] iArrU = U();
        for (int i25 = 0; i25 <= i15; i25++) {
            int iH = b0.h(objW, i25);
            while (iH != 0) {
                int i26 = iH - 1;
                int i27 = iArrU[i26];
                int iB = b0.b(i27, i15) | i25;
                int i28 = iB & i19;
                int iH2 = b0.h(objA, i28);
                b0.i(objA, i28, iH);
                iArrU[i26] = b0.d(iB, iH2, i19);
                iH = b0.c(i27, i15);
            }
        }
        this.f6772a = objA;
        c0(i19);
        return i19;
    }

    private void b0(int i15, int i16) {
        U()[i15] = i16;
    }

    private void c0(int i15) {
        this.f6776e = b0.d(this.f6776e, 32 - Integer.numberOfLeadingZeros(i15), 31);
    }

    private void d0(int i15, K k15) {
        V()[i15] = k15;
    }

    static /* synthetic */ int e(a0 a0Var) {
        int i15 = a0Var.f6777f;
        a0Var.f6777f = i15 - 1;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i15, V v15) {
        X()[i15] = v15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V f0(int i15) {
        return (V) X()[i15];
    }

    public static <K, V> a0<K, V> u() {
        return new a0<>();
    }

    Collection<V> A() {
        return new h();
    }

    Map<K, V> C() {
        Object obj = this.f6772a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> E() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.entrySet().iterator() : new b();
    }

    int G() {
        return isEmpty() ? -1 : 0;
    }

    int H(int i15) {
        int i16 = i15 + 1;
        if (i16 < this.f6777f) {
            return i16;
        }
        return -1;
    }

    void J() {
        this.f6776e += 32;
    }

    void L(int i15) {
        zj.p.e(i15 >= 0, "Expected size must be >= 0");
        this.f6776e = ek.g.g(i15, 1, 1073741823);
    }

    void M(int i15, K k15, V v15, int i16, int i17) {
        b0(i15, b0.d(i16, 0, i17));
        d0(i15, k15);
        e0(i15, v15);
    }

    Iterator<K> O() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.keySet().iterator() : new a();
    }

    void Q(int i15, int i16) {
        Object objW = W();
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int size = size();
        int i17 = size - 1;
        if (i15 >= i17) {
            objArrV[i15] = null;
            objArrX[i15] = null;
            iArrU[i15] = 0;
            return;
        }
        Object obj = objArrV[i17];
        objArrV[i15] = obj;
        objArrX[i15] = objArrX[i17];
        objArrV[i17] = null;
        objArrX[i17] = null;
        iArrU[i15] = iArrU[i17];
        iArrU[i17] = 0;
        int iC = k0.c(obj) & i16;
        int iH = b0.h(objW, iC);
        if (iH == size) {
            b0.i(objW, iC, i15 + 1);
            return;
        }
        while (true) {
            int i18 = iH - 1;
            int i19 = iArrU[i18];
            int iC2 = b0.c(i19, i16);
            if (iC2 == size) {
                iArrU[i18] = b0.d(i19, i15 + 1, i16);
                return;
            }
            iH = iC2;
        }
    }

    boolean R() {
        return this.f6772a == null;
    }

    void Y(int i15) {
        this.f6773b = Arrays.copyOf(U(), i15);
        this.f6774c = Arrays.copyOf(V(), i15);
        this.f6775d = Arrays.copyOf(X(), i15);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (R()) {
            return;
        }
        J();
        Map<K, V> mapC = C();
        if (mapC != null) {
            this.f6776e = ek.g.g(size(), 3, 1073741823);
            mapC.clear();
            this.f6772a = null;
            this.f6777f = 0;
            return;
        }
        Arrays.fill(V(), 0, this.f6777f, (Object) null);
        Arrays.fill(X(), 0, this.f6777f, (Object) null);
        b0.g(W());
        Arrays.fill(U(), 0, this.f6777f, 0);
        this.f6777f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return K(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i15 = 0; i15 < this.f6777f; i15++) {
            if (zj.l.a(obj, f0(i15))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f6779h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setV = v();
        this.f6779h = setV;
        return setV;
    }

    Iterator<V> g0() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iK = K(obj);
        if (iK == -1) {
            return null;
        }
        p(iK);
        return f0(iK);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f6778g;
        if (set != null) {
            return set;
        }
        Set<K> setY = y();
        this.f6778g = setY;
        return setY;
    }

    void p(int i15) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k15, V v15) {
        if (R()) {
            s();
        }
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.put(k15, v15);
        }
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int i15 = this.f6777f;
        int i16 = i15 + 1;
        int iC = k0.c(k15);
        int I = I();
        int i17 = iC & I;
        int iH = b0.h(W(), i17);
        if (iH != 0) {
            int iB = b0.b(iC, I);
            int i18 = 0;
            while (true) {
                int i19 = iH - 1;
                int i25 = iArrU[i19];
                if (b0.b(i25, I) == iB && zj.l.a(k15, objArrV[i19])) {
                    V v16 = (V) objArrX[i19];
                    objArrX[i19] = v15;
                    p(i19);
                    return v16;
                }
                int iC2 = b0.c(i25, I);
                i18++;
                if (iC2 == 0) {
                    if (i18 < 9) {
                        if (i16 <= I) {
                            iArrU[i19] = b0.d(i25, i16, I);
                            break;
                        }
                        I = a0(I, b0.e(I), iC, i15);
                        break;
                    }
                    return t().put(k15, v15);
                }
                k15 = k15;
                v15 = v15;
                iH = iC2;
            }
        } else if (i16 > I) {
            I = a0(I, b0.e(I), iC, i15);
        } else {
            b0.i(W(), i17, i16);
        }
        int i26 = I;
        Z(i16);
        M(i15, k15, v15, iC, i26);
        this.f6777f = i16;
        J();
        return null;
    }

    int r(int i15, int i16) {
        return i15 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapC = C();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        V v15 = (V) T(obj);
        if (v15 == f6771k) {
            return null;
        }
        return v15;
    }

    int s() {
        zj.p.x(R(), "Arrays already allocated");
        int i15 = this.f6776e;
        int iJ = b0.j(i15);
        this.f6772a = b0.a(iJ);
        c0(iJ - 1);
        this.f6773b = new int[i15];
        this.f6774c = new Object[i15];
        this.f6775d = new Object[i15];
        return i15;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapC = C();
        return mapC != null ? mapC.size() : this.f6777f;
    }

    Map<K, V> t() {
        Map<K, V> mapW = w(I() + 1);
        int iG = G();
        while (iG >= 0) {
            mapW.put(N(iG), f0(iG));
            iG = H(iG);
        }
        this.f6772a = mapW;
        this.f6773b = null;
        this.f6774c = null;
        this.f6775d = null;
        J();
        return mapW;
    }

    Set<Map.Entry<K, V>> v() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f6780j;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionA = A();
        this.f6780j = collectionA;
        return collectionA;
    }

    Map<K, V> w(int i15) {
        return new LinkedHashMap(i15, 1.0f);
    }

    Set<K> y() {
        return new f();
    }

    a0(int i15) {
        L(i15);
    }

    private abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6787c;

        private e() {
            this.f6785a = a0.this.f6776e;
            this.f6786b = a0.this.G();
            this.f6787c = -1;
        }

        private void a() {
            if (a0.this.f6776e != this.f6785a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T c(int i15);

        void d() {
            this.f6785a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6786b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i15 = this.f6786b;
            this.f6787c = i15;
            T tC = c(i15);
            this.f6786b = a0.this.H(this.f6786b);
            return tC;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            y.d(this.f6787c >= 0);
            d();
            a0 a0Var = a0.this;
            a0Var.remove(a0Var.N(this.f6787c));
            this.f6786b = a0.this.r(this.f6786b, this.f6787c);
            this.f6787c = -1;
        }

        /* synthetic */ e(a0 a0Var, a aVar) {
            this();
        }
    }
}
