package fh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class c0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f62958k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f62959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f62960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f62961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f62962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f62963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f62964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f62965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f62966h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Collection f62967j;

    c0(int i15) {
        v(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D() {
        return (1 << (this.f62963e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E(Object obj) {
        if (y()) {
            return -1;
        }
        int iA = e0.a(obj);
        int iD = D();
        Object obj2 = this.f62959a;
        Objects.requireNonNull(obj2);
        int iC = d0.c(obj2, iA & iD);
        if (iC != 0) {
            int i15 = ~iD;
            int i16 = iA & i15;
            do {
                int i17 = iC - 1;
                int i18 = a()[i17];
                if ((i18 & i15) == i16 && gl.a(obj, b()[i17])) {
                    return i17;
                }
                iC = i18 & iD;
            } while (iC != 0);
        }
        return -1;
    }

    private final int G(int i15, int i16, int i17, int i18) {
        int i19 = i16 - 1;
        Object objD = d0.d(i16);
        if (i18 != 0) {
            d0.e(objD, i17 & i19, i18 + 1);
        }
        Object obj = this.f62959a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i25 = 0; i25 <= i15; i25++) {
            int iC = d0.c(obj, i25);
            while (iC != 0) {
                int i26 = iC - 1;
                int i27 = iArrA[i26];
                int i28 = ((~i15) & i27) | i25;
                int i29 = i28 & i19;
                int iC2 = d0.c(objD, i29);
                d0.e(objD, i29, iC);
                iArrA[i26] = ((~i19) & i28) | (iC2 & i19);
                iC = i27 & i15;
            }
        }
        this.f62959a = objD;
        I(i19);
        return i19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(Object obj) {
        if (!y()) {
            int iD = D();
            Object obj2 = this.f62959a;
            Objects.requireNonNull(obj2);
            int iB = d0.b(obj, null, iD, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                w(iB, iD);
                this.f62964f--;
                u();
                return obj3;
            }
        }
        return f62958k;
    }

    private final void I(int i15) {
        this.f62963e = ((32 - Integer.numberOfLeadingZeros(i15)) & 31) | (this.f62963e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f62960b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f62961c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f62962d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object k(c0 c0Var, int i15) {
        return c0Var.b()[i15];
    }

    static /* synthetic */ Object n(c0 c0Var) {
        Object obj = c0Var.f62959a;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object o(c0 c0Var, int i15) {
        return c0Var.c()[i15];
    }

    static /* synthetic */ void t(c0 c0Var, int i15, Object obj) {
        c0Var.c()[i15] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (y()) {
            return;
        }
        u();
        Map mapR = r();
        if (mapR != null) {
            this.f62963e = s1.a(size(), 3, 1073741823);
            mapR.clear();
            this.f62959a = null;
            this.f62964f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f62964f, (Object) null);
        Arrays.fill(c(), 0, this.f62964f, (Object) null);
        Object obj = this.f62959a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f62964f, 0);
        this.f62964f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapR = r();
        if (mapR != null) {
            return mapR.containsKey(obj);
        }
        return E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapR = r();
        if (mapR != null) {
            return mapR.containsValue(obj);
        }
        for (int i15 = 0; i15 < this.f62964f; i15++) {
            if (gl.a(obj, c()[i15])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f62966h;
        if (set != null) {
            return set;
        }
        v vVar = new v(this);
        this.f62966h = vVar;
        return vVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapR = r();
        if (mapR != null) {
            return mapR.get(obj);
        }
        int iE = E(obj);
        if (iE == -1) {
            return null;
        }
        return c()[iE];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    final int i(int i15) {
        int i16 = i15 + 1;
        if (i16 < this.f62964f) {
            return i16;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f62965g;
        if (set != null) {
            return set;
        }
        y yVar = new y(this);
        this.f62965g = yVar;
        return yVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i15;
        if (y()) {
            hl.d(y(), "Arrays already allocated");
            int i16 = this.f62963e;
            int iMax = Math.max(i16 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f62959a = d0.d(iMax2);
            I(iMax2 - 1);
            this.f62960b = new int[i16];
            this.f62961c = new Object[i16];
            this.f62962d = new Object[i16];
        }
        Map mapR = r();
        if (mapR != null) {
            return mapR.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i17 = this.f62964f;
        int i18 = i17 + 1;
        int iA = e0.a(obj);
        int iD = D();
        int i19 = iA & iD;
        Object obj3 = this.f62959a;
        Objects.requireNonNull(obj3);
        int iC = d0.c(obj3, i19);
        if (iC == 0) {
            if (i18 > iD) {
                iD = G(iD, d0.a(iD), iA, i17);
            } else {
                Object obj4 = this.f62959a;
                Objects.requireNonNull(obj4);
                d0.e(obj4, i19, i18);
            }
            i15 = 1;
        } else {
            int i25 = ~iD;
            int i26 = iA & i25;
            int i27 = 0;
            while (true) {
                int i28 = iC - 1;
                int i29 = iArrA[i28];
                i15 = 1;
                int i35 = i29 & i25;
                if (i35 == i26 && gl.a(obj, objArrB[i28])) {
                    Object obj5 = objArrC[i28];
                    objArrC[i28] = obj2;
                    return obj5;
                }
                int i36 = i29 & iD;
                i27++;
                if (i36 == 0) {
                    if (i27 < 9) {
                        if (i18 <= iD) {
                            iArrA[i28] = (i18 & iD) | i35;
                            break;
                        }
                        iD = G(iD, d0.a(iD), iA, i17);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(D() + 1, 1.0f);
                    int iH = h();
                    while (iH >= 0) {
                        linkedHashMap.put(b()[iH], c()[iH]);
                        iH = i(iH);
                    }
                    this.f62959a = linkedHashMap;
                    this.f62960b = null;
                    this.f62961c = null;
                    this.f62962d = null;
                    u();
                    return linkedHashMap.put(obj, obj2);
                }
                iC = i36;
            }
        }
        int length = a().length;
        if (i18 > length) {
            int i37 = i15;
            int iMin = Math.min(1073741823, (Math.max(i37, length >>> 1) + length) | i37);
            if (iMin != length) {
                this.f62960b = Arrays.copyOf(a(), iMin);
                this.f62961c = Arrays.copyOf(b(), iMin);
                this.f62962d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i17] = (~iD) & iA;
        b()[i17] = obj;
        c()[i17] = obj2;
        this.f62964f = i18;
        u();
        return null;
    }

    final Map r() {
        Object obj = this.f62959a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapR = r();
        if (mapR != null) {
            return mapR.remove(obj);
        }
        Object objH = H(obj);
        if (objH == f62958k) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapR = r();
        return mapR != null ? mapR.size() : this.f62964f;
    }

    final void u() {
        this.f62963e += 32;
    }

    final void v(int i15) {
        this.f62963e = s1.a(i15, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f62967j;
        if (collection != null) {
            return collection;
        }
        a0 a0Var = new a0(this);
        this.f62967j = a0Var;
        return a0Var;
    }

    final void w(int i15, int i16) {
        Object obj = this.f62959a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i17 = size - 1;
        if (i15 >= i17) {
            objArrB[i15] = null;
            objArrC[i15] = null;
            iArrA[i15] = 0;
            return;
        }
        int i18 = i15 + 1;
        Object obj2 = objArrB[i17];
        objArrB[i15] = obj2;
        objArrC[i15] = objArrC[i17];
        objArrB[i17] = null;
        objArrC[i17] = null;
        iArrA[i15] = iArrA[i17];
        iArrA[i17] = 0;
        int iA = e0.a(obj2) & i16;
        int iC = d0.c(obj, iA);
        if (iC == size) {
            d0.e(obj, iA, i18);
            return;
        }
        while (true) {
            int i19 = iC - 1;
            int i25 = iArrA[i19];
            int i26 = i25 & i16;
            if (i26 == size) {
                iArrA[i19] = (i25 & (~i16)) | (i16 & i18);
                return;
            }
            iC = i26;
        }
    }

    final boolean y() {
        return this.f62959a == null;
    }
}
