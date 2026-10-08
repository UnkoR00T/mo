package r0;

import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010\rJ\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u0007R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lr0/t0;", "K", "V", "Lr0/f1;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "q", "capacity", "p", "o", "()V", "hash1", "m", "(I)I", "key", "value", "x", "(Ljava/lang/Object;Ljava/lang/Object;)V", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "s", "(Ljava/util/Map;)V", "t", "(Lr0/f1;)V", "u", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "v", "(I)Ljava/lang/Object;", "k", "n", "(Ljava/lang/Object;)I", "j", "l", "newCapacity", "w", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t0<K, V> extends f1<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public t0() {
        this(0, 1, null);
    }

    private final int m(int hash1) {
        int i15 = this._capacity;
        int i16 = hash1 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j15 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j16 = j15 & ((~j15) << 7) & (-9187201950435737472L);
            if (j16 != 0) {
                return (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    private final void o() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void p(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = g1.f169860a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            pq.n.D(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i15 = capacity >> 3;
            long j15 = 255 << ((capacity & 7) << 3);
            jArr2[i15] = (jArr2[i15] & (~j15)) | j15;
            jArr = jArr2;
        }
        this.metadata = jArr;
        o();
    }

    private final void q(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        p(iMax);
        this.keys = iMax == 0 ? s0.a.f176998c : new Object[iMax];
        this.values = iMax == 0 ? s0.a.f176998c : new Object[iMax];
    }

    public final void j() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            w(g1.d(this._capacity));
        } else {
            l();
        }
    }

    public final void k() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != g1.f169860a) {
            pq.n.D(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i15 = this._capacity;
            int i16 = i15 >> 3;
            long j15 = 255 << ((i15 & 7) << 3);
            jArr2[i16] = (jArr2[i16] & (~j15)) | j15;
        }
        pq.n.z(this.values, null, 0, this._capacity);
        pq.n.z(this.keys, null, 0, this._capacity);
        o();
    }

    public final void l() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i16 = (i15 + 7) >> 3;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            long j15 = jArr[i18] & (-9187201950435737472L);
            jArr[i18] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
        }
        int iU0 = pq.n.u0(jArr);
        int i19 = iU0 - 1;
        jArr[i19] = (jArr[i19] & 72057594037927935L) | (-72057594037927936L);
        jArr[iU0] = jArr[0];
        int i25 = 0;
        while (i25 != i15) {
            int i26 = i25 >> 3;
            int i27 = (i25 & 7) << 3;
            long j16 = (jArr[i26] >> i27) & 255;
            if (j16 != 128 && j16 == 254) {
                Object obj = objArr[i25];
                int iHashCode = (obj != null ? obj.hashCode() : i17) * (-862048943);
                int i28 = iHashCode ^ (iHashCode << 16);
                int i29 = i28 >>> 7;
                int iM = m(i29);
                int i35 = i29 & i15;
                int i36 = i17;
                if (((iM - i35) & i15) / 8 == ((i25 - i35) & i15) / 8) {
                    jArr[i26] = (((long) (i28 & CertificateBody.profileType)) << i27) | ((~(255 << i27)) & jArr[i26]);
                    jArr[pq.n.u0(jArr)] = jArr[i36];
                } else {
                    int i37 = iM >> 3;
                    long j17 = jArr[i37];
                    int i38 = (iM & 7) << 3;
                    if (((j17 >> i38) & 255) == 128) {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j17 & (~(255 << i38)));
                        jArr[i26] = (jArr[i26] & (~(255 << i27))) | (128 << i27);
                        objArr[iM] = objArr[i25];
                        objArr[i25] = null;
                        objArr2[iM] = objArr2[i25];
                        objArr2[i25] = null;
                    } else {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j17 & (~(255 << i38)));
                        Object obj2 = objArr[iM];
                        objArr[iM] = objArr[i25];
                        objArr[i25] = obj2;
                        Object obj3 = objArr2[iM];
                        objArr2[iM] = objArr2[i25];
                        objArr2[i25] = obj3;
                        i25--;
                    }
                    jArr[pq.n.u0(jArr)] = jArr[i36];
                }
                i25++;
                i17 = i36;
            } else {
                i25++;
            }
        }
        o();
    }

    public final int n(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & CertificateBody.profileType;
        int i18 = this._capacity;
        int i19 = i16 & i18;
        int i25 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i26 = i19 >> 3;
            int i27 = (i19 & 7) << 3;
            long j15 = ((jArr[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr[i26] >>> i27);
            long j16 = i17;
            int i28 = i17;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j18) >> 3)) & i18;
                if (fr.t.c(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iM = m(i16);
                if (this.growthLimit == 0 && ((this.metadata[iM >> 3] >> ((iM & 7) << 3)) & 255) != 254) {
                    j();
                    iM = m(i16);
                }
                this._size++;
                int i29 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i35 = iM >> 3;
                long j19 = jArr2[i35];
                int i36 = (iM & 7) << 3;
                this.growthLimit = i29 - (((j19 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this._capacity;
                long j25 = ((~(255 << i36)) & j19) | (j16 << i36);
                jArr2[i35] = j25;
                jArr2[(((iM - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return ~iM;
            }
            i25 += 8;
            i19 = (i19 + i25) & i18;
            i17 = i28;
        }
    }

    public final V r(K key, V value) {
        int iN = n(key);
        if (iN < 0) {
            iN = ~iN;
        }
        Object[] objArr = this.values;
        V v15 = (V) objArr[iN];
        this.keys[iN] = key;
        objArr[iN] = value;
        return v15;
    }

    public final void s(Map<K, ? extends V> from) {
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            x(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(f1<K, V> from) {
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        x(objArr[i18], objArr2[i18]);
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final V u(K key) {
        int iNumberOfTrailingZeros;
        int i15 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 & CertificateBody.profileType;
        int i18 = this._capacity;
        int i19 = i16 >>> 7;
        loop0: while (true) {
            int i25 = i19 & i18;
            long[] jArr = this.metadata;
            int i26 = i25 >> 3;
            int i27 = (i25 & 7) << 3;
            long j15 = ((jArr[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr[i26] >>> i27);
            long j16 = (((long) i17) * 72340172838076673L) ^ j15;
            for (long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i25) & i18;
                if (fr.t.c(this.keys[iNumberOfTrailingZeros], key)) {
                    break loop0;
                }
            }
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i19 = i25 + i15;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return v(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V v(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v15 = (V) objArr[index];
        objArr[index] = null;
        return v15;
    }

    public final void w(int newCapacity) {
        int i15;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i16 = this._capacity;
        q(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i17 = this._capacity;
        int i18 = 0;
        while (i18 < i16) {
            if (((jArr[i18 >> 3] >> ((i18 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i18];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int iM = m(i19 >>> 7);
                i15 = i18;
                long j15 = i19 & CertificateBody.profileType;
                int i25 = iM >> 3;
                int i26 = (iM & 7) << 3;
                long j16 = (j15 << i26) | (jArr2[i25] & (~(255 << i26)));
                jArr2[i25] = j16;
                jArr2[(((iM - 7) & i17) + (i17 & 7)) >> 3] = j16;
                objArr3[iM] = obj;
                objArr4[iM] = objArr2[i15];
            } else {
                i15 = i18;
            }
            i18 = i15 + 1;
        }
    }

    public final void x(K key, V value) {
        int iN = n(key);
        if (iN < 0) {
            iN = ~iN;
        }
        this.keys[iN] = key;
        this.values[iN] = value;
    }

    public /* synthetic */ t0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }

    public t0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        q(g1.f(i15));
    }
}
