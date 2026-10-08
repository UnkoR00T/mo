package ak;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes4.dex */
final class u1<K, V> extends p0<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final p0<Object, Object> f6975h = new u1(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f6976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f6977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f6978g;

    static class a<K, V> extends u0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient p0<K, V> f6979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f6980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f6981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f6982f;

        /* JADX INFO: renamed from: ak.u1$a$a, reason: collision with other inner class name */
        class C0149a extends n0<Map.Entry<K, V>> {
            C0149a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i15) {
                zj.p.o(i15, a.this.f6982f);
                int i16 = i15 * 2;
                Object obj = a.this.f6980d[a.this.f6981e + i16];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f6980d[i16 + (a.this.f6981e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // ak.l0
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f6982f;
            }
        }

        a(p0<K, V> p0Var, Object[] objArr, int i15, int i16) {
            this.f6979c = p0Var;
            this.f6980d = objArr;
            this.f6981e = i15;
            this.f6982f = i16;
        }

        @Override // ak.u0
        n0<Map.Entry<K, V>> A() {
            return new C0149a();
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f6979c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // ak.l0
        int f(Object[] objArr, int i15) {
            return e().f(objArr, i15);
        }

        @Override // ak.l0
        boolean j() {
            return true;
        }

        @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public h2<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6982f;
        }
    }

    static final class b<K> extends u0<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient p0<K, ?> f6984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient n0<K> f6985d;

        b(p0<K, ?> p0Var, n0<K> n0Var) {
            this.f6984c = p0Var;
            this.f6985d = n0Var;
        }

        @Override // ak.l0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f6984c.get(obj) != null;
        }

        @Override // ak.u0, ak.l0
        public n0<K> e() {
            return this.f6985d;
        }

        @Override // ak.l0
        int f(Object[] objArr, int i15) {
            return e().f(objArr, i15);
        }

        @Override // ak.l0
        boolean j() {
            return true;
        }

        @Override // ak.u0, ak.l0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k */
        public h2<K> iterator() {
            return e().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f6984c.size();
        }
    }

    static final class c extends n0<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f6986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f6987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f6988e;

        c(Object[] objArr, int i15, int i16) {
            this.f6986c = objArr;
            this.f6987d = i15;
            this.f6988e = i16;
        }

        @Override // java.util.List
        public Object get(int i15) {
            zj.p.o(i15, this.f6988e);
            Object obj = this.f6986c[(i15 * 2) + this.f6987d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // ak.l0
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6988e;
        }
    }

    private u1(Object obj, Object[] objArr, int i15) {
        this.f6976e = obj;
        this.f6977f = objArr;
        this.f6978g = i15;
    }

    static <K, V> u1<K, V> r(int i15, Object[] objArr) {
        return s(i15, objArr, null);
    }

    static <K, V> u1<K, V> s(int i15, Object[] objArr, p0.a<K, V> aVar) {
        if (i15 == 0) {
            return (u1) f6975h;
        }
        if (i15 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            y.a(obj, obj2);
            return new u1<>(null, objArr, 1);
        }
        zj.p.t(i15, objArr.length >> 1);
        Object objT = t(objArr, i15, u0.t(i15), 0);
        if (objT instanceof Object[]) {
            Object[] objArr2 = (Object[]) objT;
            p0.a.C0148a c0148a = (p0.a.C0148a) objArr2[2];
            if (aVar == null) {
                throw c0148a.a();
            }
            aVar.f6932e = c0148a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objT = obj3;
            i15 = iIntValue;
        }
        return new u1<>(objT, objArr, i15);
    }

    private static Object t(Object[] objArr, int i15, int i16, int i17) {
        int i18;
        p0.a.C0148a c0148a = null;
        int i19 = 1;
        if (i15 == 1) {
            Object obj = objArr[i17];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i17 ^ 1];
            Objects.requireNonNull(obj2);
            y.a(obj, obj2);
            return null;
        }
        int i25 = i16 - 1;
        if (i16 <= 128) {
            byte[] bArr = new byte[i16];
            Arrays.fill(bArr, (byte) -1);
            int i26 = 0;
            for (int i27 = 0; i27 < i15; i27++) {
                int i28 = (i27 * 2) + i17;
                int i29 = (i26 * 2) + i17;
                Object obj3 = objArr[i28];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i28 ^ 1];
                Objects.requireNonNull(obj4);
                y.a(obj3, obj4);
                int iB = k0.b(obj3.hashCode());
                while (true) {
                    int i35 = iB & i25;
                    int i36 = bArr[i35] & 255;
                    if (i36 == 255) {
                        bArr[i35] = (byte) i29;
                        if (i26 < i27) {
                            objArr[i29] = obj3;
                            objArr[i29 ^ 1] = obj4;
                        }
                        i26++;
                        break;
                    }
                    if (obj3.equals(objArr[i36])) {
                        int i37 = i36 ^ 1;
                        Object obj5 = objArr[i37];
                        Objects.requireNonNull(obj5);
                        c0148a = new p0.a.C0148a(obj3, obj4, obj5);
                        objArr[i37] = obj4;
                        break;
                    }
                    iB = i35 + 1;
                }
            }
            return i26 == i15 ? bArr : new Object[]{bArr, Integer.valueOf(i26), c0148a};
        }
        if (i16 <= 32768) {
            short[] sArr = new short[i16];
            Arrays.fill(sArr, (short) -1);
            int i38 = 0;
            for (int i39 = 0; i39 < i15; i39++) {
                int i45 = (i39 * 2) + i17;
                int i46 = (i38 * 2) + i17;
                Object obj6 = objArr[i45];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i45 ^ 1];
                Objects.requireNonNull(obj7);
                y.a(obj6, obj7);
                int iB2 = k0.b(obj6.hashCode());
                while (true) {
                    int i47 = iB2 & i25;
                    int i48 = sArr[i47] & HPKE.aead_EXPORT_ONLY;
                    if (i48 == 65535) {
                        sArr[i47] = (short) i46;
                        if (i38 < i39) {
                            objArr[i46] = obj6;
                            objArr[i46 ^ 1] = obj7;
                        }
                        i38++;
                        break;
                    }
                    if (obj6.equals(objArr[i48])) {
                        int i49 = i48 ^ 1;
                        Object obj8 = objArr[i49];
                        Objects.requireNonNull(obj8);
                        c0148a = new p0.a.C0148a(obj6, obj7, obj8);
                        objArr[i49] = obj7;
                        break;
                    }
                    iB2 = i47 + 1;
                }
            }
            return i38 == i15 ? sArr : new Object[]{sArr, Integer.valueOf(i38), c0148a};
        }
        int[] iArr = new int[i16];
        Arrays.fill(iArr, -1);
        int i55 = 0;
        int i56 = 0;
        while (i55 < i15) {
            int i57 = (i55 * 2) + i17;
            int i58 = (i56 * 2) + i17;
            Object obj9 = objArr[i57];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i57 ^ i19];
            Objects.requireNonNull(obj10);
            y.a(obj9, obj10);
            int iB3 = k0.b(obj9.hashCode());
            while (true) {
                int i59 = iB3 & i25;
                int i65 = iArr[i59];
                if (i65 == -1) {
                    iArr[i59] = i58;
                    if (i56 < i55) {
                        objArr[i58] = obj9;
                        objArr[i58 ^ 1] = obj10;
                    }
                    i56++;
                    i18 = i19;
                    break;
                }
                i18 = i19;
                if (obj9.equals(objArr[i65])) {
                    int i66 = i65 ^ 1;
                    Object obj11 = objArr[i66];
                    Objects.requireNonNull(obj11);
                    c0148a = new p0.a.C0148a(obj9, obj10, obj11);
                    objArr[i66] = obj10;
                    break;
                }
                iB3 = i59 + 1;
                i19 = i18;
            }
            i55++;
            i19 = i18;
        }
        int i67 = i19;
        if (i56 == i15) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i67] = Integer.valueOf(i56);
        objArr2[2] = c0148a;
        return objArr2;
    }

    static Object u(Object obj, Object[] objArr, int i15, int i16, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i15 == 1) {
            Object obj3 = objArr[i16];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i16 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = k0.b(obj2.hashCode());
            while (true) {
                int i17 = iB & length;
                int i18 = bArr[i17] & 255;
                if (i18 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                iB = i17 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = k0.b(obj2.hashCode());
            while (true) {
                int i19 = iB2 & length2;
                int i25 = sArr[i19] & HPKE.aead_EXPORT_ONLY;
                if (i25 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i25])) {
                    return objArr[i25 ^ 1];
                }
                iB2 = i19 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = k0.b(obj2.hashCode());
            while (true) {
                int i26 = iB3 & length3;
                int i27 = iArr[i26];
                if (i27 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i27])) {
                    return objArr[i27 ^ 1];
                }
                iB3 = i26 + 1;
            }
        }
    }

    @Override // ak.p0
    u0<Map.Entry<K, V>> e() {
        return new a(this, this.f6977f, 0, this.f6978g);
    }

    @Override // ak.p0
    u0<K> f() {
        return new b(this, new c(this.f6977f, 0, this.f6978g));
    }

    @Override // ak.p0
    l0<V> g() {
        return new c(this.f6977f, 1, this.f6978g);
    }

    @Override // ak.p0, java.util.Map
    public V get(Object obj) {
        V v15 = (V) u(this.f6976e, this.f6977f, this.f6978g, 0, obj);
        if (v15 == null) {
            return null;
        }
        return v15;
    }

    @Override // ak.p0
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f6978g;
    }
}
