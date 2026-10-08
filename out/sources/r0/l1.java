package r0;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010<R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010A¨\u0006B"}, d2 = {"Lr0/l1;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Lr0/l1;)V", "Loq/i0;", "clear", "()V", "minimumCapacity", "b", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "value", "a", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "f", "(I)Ljava/lang/Object;", "k", "i", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "g", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "h", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "c", "(Ljava/lang/Object;I)I", "e", "", "[I", "hashes", "", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class l1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public l1() {
        this(0, 1, null);
    }

    private final int c(K key, int hash) {
        int i15 = this.size;
        if (i15 == 0) {
            return -1;
        }
        int iA = s0.a.a(this.hashes, i15, hash);
        if (iA < 0 || fr.t.c(key, this.array[iA << 1])) {
            return iA;
        }
        int i16 = iA + 1;
        while (i16 < i15 && this.hashes[i16] == hash) {
            if (fr.t.c(key, this.array[i16 << 1])) {
                return i16;
            }
            i16++;
        }
        for (int i17 = iA - 1; i17 >= 0 && this.hashes[i17] == hash; i17--) {
            if (fr.t.c(key, this.array[i17 << 1])) {
                return i17;
            }
        }
        return ~i16;
    }

    private final int e() {
        int i15 = this.size;
        if (i15 == 0) {
            return -1;
        }
        int iA = s0.a.a(this.hashes, i15, 0);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i16 = iA + 1;
        while (i16 < i15 && this.hashes[i16] == 0) {
            if (this.array[i16 << 1] == null) {
                return i16;
            }
            i16++;
        }
        for (int i17 = iA - 1; i17 >= 0 && this.hashes[i17] == 0; i17--) {
            if (this.array[i17 << 1] == null) {
                return i17;
            }
        }
        return ~i16;
    }

    public final int a(V value) {
        int i15 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i16 = 1; i16 < i15; i16 += 2) {
                if (objArr[i16] == null) {
                    return i16 >> 1;
                }
            }
            return -1;
        }
        for (int i17 = 1; i17 < i15; i17 += 2) {
            if (fr.t.c(value, objArr[i17])) {
                return i17 >> 1;
            }
        }
        return -1;
    }

    public void b(int minimumCapacity) {
        int i15 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            this.hashes = Arrays.copyOf(iArr, minimumCapacity);
            this.array = Arrays.copyOf(this.array, minimumCapacity * 2);
        }
        if (this.size != i15) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = s0.a.f176996a;
            this.array = s0.a.f176998c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return d(key) >= 0;
    }

    public boolean containsValue(V value) {
        return a(value) >= 0;
    }

    public int d(K key) {
        return key == null ? e() : c(key, key.hashCode());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof l1) {
                if (getSize() != ((l1) other).getSize()) {
                    return false;
                }
                l1 l1Var = (l1) other;
                int i15 = this.size;
                for (int i16 = 0; i16 < i15; i16++) {
                    K kF = f(i16);
                    V vK = k(i16);
                    Object obj = l1Var.get(kF);
                    if (vK == null) {
                        if (obj != null || !l1Var.containsKey(kF)) {
                            return false;
                        }
                    } else if (!fr.t.c(vK, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i17 = this.size;
            for (int i18 = 0; i18 < i17; i18++) {
                K kF2 = f(i18);
                V vK2 = k(i18);
                Object obj2 = ((Map) other).get(kF2);
                if (vK2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kF2)) {
                        return false;
                    }
                } else if (!fr.t.c(vK2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K f(int index) {
        boolean z15 = false;
        if (index >= 0 && index < this.size) {
            z15 = true;
        }
        if (!z15) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    public void g(l1<? extends K, ? extends V> map) {
        int i15 = map.size;
        b(this.size + i15);
        if (this.size != 0) {
            for (int i16 = 0; i16 < i15; i16++) {
                put(map.f(i16), map.k(i16));
            }
        } else if (i15 > 0) {
            pq.n.l(map.hashes, this.hashes, 0, 0, i15);
            pq.n.n(map.array, this.array, 0, 0, i15 << 1);
            this.size = i15;
        }
    }

    public V get(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.array[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object key, V defaultValue) {
        int iD = d(key);
        return iD >= 0 ? (V) this.array[(iD << 1) + 1] : defaultValue;
    }

    public V h(int index) {
        if (!(index >= 0 && index < this.size)) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i15 = index << 1;
        V v15 = (V) objArr[i15 + 1];
        int i16 = this.size;
        if (i16 <= 1) {
            clear();
            return v15;
        }
        int i17 = i16 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i16 >= iArr.length / 3) {
            if (index < i17) {
                int i18 = index + 1;
                pq.n.l(iArr, iArr, index, i18, i16);
                Object[] objArr2 = this.array;
                pq.n.n(objArr2, objArr2, i15, i18 << 1, i16 << 1);
            }
            Object[] objArr3 = this.array;
            int i19 = i17 << 1;
            objArr3[i19] = null;
            objArr3[i19 + 1] = null;
        } else {
            int i25 = i16 > 8 ? i16 + (i16 >> 1) : 8;
            this.hashes = Arrays.copyOf(iArr, i25);
            this.array = Arrays.copyOf(this.array, i25 << 1);
            if (i16 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                pq.n.l(iArr, this.hashes, 0, 0, index);
                pq.n.n(objArr, this.array, 0, 0, i15);
            }
            if (index < i17) {
                int i26 = index + 1;
                pq.n.l(iArr, this.hashes, index, i26, i16);
                pq.n.n(objArr, this.array, i15, i26 << 1, i16 << 1);
            }
        }
        if (i16 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i17;
        return v15;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i15 = this.size;
        int i16 = 1;
        int i17 = 0;
        int iHashCode = 0;
        while (i17 < i15) {
            Object obj = objArr[i16];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i17];
            i17++;
            i16 += 2;
        }
        return iHashCode;
    }

    public V i(int index, V value) {
        boolean z15 = false;
        if (index >= 0 && index < this.size) {
            z15 = true;
        }
        if (!z15) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        int i15 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v15 = (V) objArr[i15];
        objArr[i15] = value;
        return v15;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V k(int index) {
        boolean z15 = false;
        if (index >= 0 && index < this.size) {
            z15 = true;
        }
        if (!z15) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    public V put(K key, V value) {
        int i15 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iC = key != null ? c(key, iHashCode) : e();
        if (iC >= 0) {
            int i16 = (iC << 1) + 1;
            Object[] objArr = this.array;
            V v15 = (V) objArr[i16];
            objArr[i16] = value;
            return v15;
        }
        int i17 = ~iC;
        int[] iArr = this.hashes;
        if (i15 >= iArr.length) {
            int i18 = 8;
            if (i15 >= 8) {
                i18 = (i15 >> 1) + i15;
            } else if (i15 < 4) {
                i18 = 4;
            }
            this.hashes = Arrays.copyOf(iArr, i18);
            this.array = Arrays.copyOf(this.array, i18 << 1);
            if (i15 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i17 < i15) {
            int[] iArr2 = this.hashes;
            int i19 = i17 + 1;
            pq.n.l(iArr2, iArr2, i19, i17, i15);
            Object[] objArr2 = this.array;
            pq.n.n(objArr2, objArr2, i19 << 1, i17 << 1, this.size << 1);
        }
        int i25 = this.size;
        if (i15 == i25) {
            int[] iArr3 = this.hashes;
            if (i17 < iArr3.length) {
                iArr3[i17] = iHashCode;
                Object[] objArr3 = this.array;
                int i26 = i17 << 1;
                objArr3[i26] = key;
                objArr3[i26 + 1] = value;
                this.size = i25 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K key, V value) {
        V v15 = get(key);
        return v15 == null ? put(key, value) : v15;
    }

    public V remove(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public V replace(K key, V value) {
        int iD = d(key);
        if (iD >= 0) {
            return i(iD, value);
        }
        return null;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder(this.size * 28);
        sb5.append('{');
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 > 0) {
                sb5.append(", ");
            }
            K kF = f(i16);
            if (kF != sb5) {
                sb5.append(kF);
            } else {
                sb5.append("(this Map)");
            }
            sb5.append('=');
            V vK = k(i16);
            if (vK != sb5) {
                sb5.append(vK);
            } else {
                sb5.append("(this Map)");
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    public l1(int i15) {
        this.hashes = i15 == 0 ? s0.a.f176996a : new int[i15];
        this.array = i15 == 0 ? s0.a.f176998c : new Object[i15 << 1];
    }

    public boolean remove(K key, V value) {
        int iD = d(key);
        if (iD < 0 || !fr.t.c(value, k(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iD = d(key);
        if (iD < 0 || !fr.t.c(oldValue, k(iD))) {
            return false;
        }
        i(iD, newValue);
        return true;
    }

    public /* synthetic */ l1(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15);
    }

    public l1(l1<? extends K, ? extends V> l1Var) {
        this(0, 1, null);
        if (l1Var != null) {
            g(l1Var);
        }
    }
}
