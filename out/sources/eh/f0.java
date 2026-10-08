package eh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f50526k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f50527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f50528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f50529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f50530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f50531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f50532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f50533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f50534h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient Collection f50535j;

    f0(int i15) {
        t(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B() {
        return (1 << (this.f50531e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int C(Object obj) {
        if (v()) {
            return -1;
        }
        int iA = h0.a(obj);
        int iB = B();
        Object obj2 = this.f50527a;
        obj2.getClass();
        int iC = g0.c(obj2, iA & iB);
        if (iC != 0) {
            int i15 = ~iB;
            int i16 = iA & i15;
            do {
                int i17 = iC - 1;
                int i18 = H()[i17];
                if ((i18 & i15) == i16 && ze.a(obj, a()[i17])) {
                    return i17;
                }
                iC = i18 & iB;
            } while (iC != 0);
        }
        return -1;
    }

    private final int D(int i15, int i16, int i17, int i18) {
        Object objD = g0.d(i16);
        int i19 = i16 - 1;
        if (i18 != 0) {
            g0.e(objD, i17 & i19, i18 + 1);
        }
        Object obj = this.f50527a;
        obj.getClass();
        int[] iArrH = H();
        for (int i25 = 0; i25 <= i15; i25++) {
            int iC = g0.c(obj, i25);
            while (iC != 0) {
                int i26 = iC - 1;
                int i27 = iArrH[i26];
                int i28 = ((~i15) & i27) | i25;
                int i29 = i28 & i19;
                int iC2 = g0.c(objD, i29);
                g0.e(objD, i29, iC);
                iArrH[i26] = ((~i19) & i28) | (iC2 & i19);
                iC = i27 & i15;
            }
        }
        this.f50527a = objD;
        G(i19);
        return i19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(Object obj) {
        if (v()) {
            return f50526k;
        }
        int iB = B();
        Object obj2 = this.f50527a;
        obj2.getClass();
        int iB2 = g0.b(obj, null, iB, obj2, H(), a(), null);
        if (iB2 == -1) {
            return f50526k;
        }
        Object obj3 = b()[iB2];
        u(iB2, iB);
        this.f50532f--;
        s();
        return obj3;
    }

    private final void G(int i15) {
        this.f50531e = ((32 - Integer.numberOfLeadingZeros(i15)) & 31) | (this.f50531e & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] H() {
        int[] iArr = this.f50528b;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] a() {
        Object[] objArr = this.f50529c;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f50530d;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int d(f0 f0Var) {
        int i15 = f0Var.f50532f;
        f0Var.f50532f = i15 - 1;
        return i15;
    }

    static /* synthetic */ Object i(f0 f0Var, int i15) {
        return f0Var.a()[i15];
    }

    static /* synthetic */ Object n(f0 f0Var, int i15) {
        return f0Var.b()[i15];
    }

    static /* synthetic */ Object o(f0 f0Var) {
        Object obj = f0Var.f50527a;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void r(f0 f0Var, int i15, Object obj) {
        f0Var.b()[i15] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (v()) {
            return;
        }
        s();
        Map mapP = p();
        if (mapP != null) {
            this.f50531e = p1.a(size(), 3, 1073741823);
            mapP.clear();
            this.f50527a = null;
            this.f50532f = 0;
            return;
        }
        Arrays.fill(a(), 0, this.f50532f, (Object) null);
        Arrays.fill(b(), 0, this.f50532f, (Object) null);
        Object obj = this.f50527a;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(H(), 0, this.f50532f, 0);
        this.f50532f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.containsKey(obj);
        }
        return C(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.containsValue(obj);
        }
        for (int i15 = 0; i15 < this.f50532f; i15++) {
            if (ze.a(obj, b()[i15])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f50534h;
        if (set != null) {
            return set;
        }
        z zVar = new z(this);
        this.f50534h = zVar;
        return zVar;
    }

    final int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.get(obj);
        }
        int iC = C(obj);
        if (iC == -1) {
            return null;
        }
        return b()[iC];
    }

    final int h(int i15) {
        int i16 = i15 + 1;
        if (i16 < this.f50532f) {
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
        Set set = this.f50533g;
        if (set != null) {
            return set;
        }
        c0 c0Var = new c0(this);
        this.f50533g = c0Var;
        return c0Var;
    }

    final Map p() {
        Object obj = this.f50527a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i15;
        if (v()) {
            c.d(v(), "Arrays already allocated");
            int i16 = this.f50531e;
            int iMax = Math.max(i16 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f50527a = g0.d(iMax2);
            G(iMax2 - 1);
            this.f50528b = new int[i16];
            this.f50529c = new Object[i16];
            this.f50530d = new Object[i16];
        }
        Map mapP = p();
        if (mapP != null) {
            return mapP.put(obj, obj2);
        }
        int[] iArrH = H();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int i17 = this.f50532f;
        int i18 = i17 + 1;
        int iA = h0.a(obj);
        int iB = B();
        int i19 = iA & iB;
        Object obj3 = this.f50527a;
        obj3.getClass();
        int iC = g0.c(obj3, i19);
        if (iC == 0) {
            if (i18 > iB) {
                iB = D(iB, g0.a(iB), iA, i17);
            } else {
                Object obj4 = this.f50527a;
                obj4.getClass();
                g0.e(obj4, i19, i18);
            }
            i15 = 1;
        } else {
            int i25 = ~iB;
            int i26 = iA & i25;
            int i27 = 0;
            while (true) {
                int i28 = iC - 1;
                int i29 = iArrH[i28];
                i15 = 1;
                int i35 = i29 & i25;
                if (i35 == i26 && ze.a(obj, objArrA[i28])) {
                    Object obj5 = objArrB[i28];
                    objArrB[i28] = obj2;
                    return obj5;
                }
                int i36 = i29 & iB;
                i27++;
                if (i36 == 0) {
                    if (i27 < 9) {
                        if (i18 <= iB) {
                            iArrH[i28] = (i18 & iB) | i35;
                            break;
                        }
                        iB = D(iB, g0.a(iB), iA, i17);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(B() + 1, 1.0f);
                    int iG = g();
                    while (iG >= 0) {
                        linkedHashMap.put(a()[iG], b()[iG]);
                        iG = h(iG);
                    }
                    this.f50527a = linkedHashMap;
                    this.f50528b = null;
                    this.f50529c = null;
                    this.f50530d = null;
                    s();
                    return linkedHashMap.put(obj, obj2);
                }
                iC = i36;
            }
        }
        int length = H().length;
        if (i18 > length) {
            int i37 = i15;
            int iMin = Math.min(1073741823, (Math.max(i37, length >>> 1) + length) | i37);
            if (iMin != length) {
                this.f50528b = Arrays.copyOf(H(), iMin);
                this.f50529c = Arrays.copyOf(a(), iMin);
                this.f50530d = Arrays.copyOf(b(), iMin);
            }
        }
        H()[i17] = (~iB) & iA;
        a()[i17] = obj;
        b()[i17] = obj2;
        this.f50532f = i18;
        s();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapP = p();
        if (mapP != null) {
            return mapP.remove(obj);
        }
        Object objE = E(obj);
        if (objE == f50526k) {
            return null;
        }
        return objE;
    }

    final void s() {
        this.f50531e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapP = p();
        return mapP != null ? mapP.size() : this.f50532f;
    }

    final void t(int i15) {
        this.f50531e = p1.a(12, 1, 1073741823);
    }

    final void u(int i15, int i16) {
        Object obj = this.f50527a;
        obj.getClass();
        int[] iArrH = H();
        Object[] objArrA = a();
        Object[] objArrB = b();
        int size = size();
        int i17 = size - 1;
        if (i15 >= i17) {
            objArrA[i15] = null;
            objArrB[i15] = null;
            iArrH[i15] = 0;
            return;
        }
        Object obj2 = objArrA[i17];
        objArrA[i15] = obj2;
        objArrB[i15] = objArrB[i17];
        objArrA[i17] = null;
        objArrB[i17] = null;
        iArrH[i15] = iArrH[i17];
        iArrH[i17] = 0;
        int iA = h0.a(obj2) & i16;
        int iC = g0.c(obj, iA);
        if (iC == size) {
            g0.e(obj, iA, i15 + 1);
            return;
        }
        while (true) {
            int i18 = iC - 1;
            int i19 = iArrH[i18];
            int i25 = i19 & i16;
            if (i25 == size) {
                iArrH[i18] = ((i15 + 1) & i16) | (i19 & (~i16));
                return;
            }
            iC = i25;
        }
    }

    final boolean v() {
        return this.f50527a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f50535j;
        if (collection != null) {
            return collection;
        }
        e0 e0Var = new e0(this);
        this.f50535j = e0Var;
        return e0Var;
    }
}
