package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010\u0006R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!¨\u0006#"}, d2 = {"Lr0/m0;", "V", "Lr0/w;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "m", "capacity", "l", "k", "()V", "", "key", "i", "(J)I", "hash1", "j", "(I)I", "value", "q", "(JLjava/lang/Object;)V", "n", "(J)Ljava/lang/Object;", "index", "o", "(I)Ljava/lang/Object;", "g", "f", "h", "newCapacity", "p", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m0<V> extends w<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ m0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }

    private final int i(long key) {
        int iHashCode = Long.hashCode(key) * (-862048943);
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
            int i28 = i25;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            for (long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L); j18 != 0; j18 &= j18 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j18) >> 3) + i19) & i18;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iJ = j(i16);
                if (this.growthLimit == 0 && ((this.metadata[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i16);
                }
                this._size++;
                int i29 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i35 = iJ >> 3;
                long j19 = jArr2[i35];
                int i36 = (iJ & 7) << 3;
                this.growthLimit = i29 - (((j19 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this._capacity;
                long j25 = ((~(255 << i36)) & j19) | (j16 << i36);
                jArr2[i35] = j25;
                jArr2[(((iJ - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return iJ;
            }
            i25 = i28 + 8;
            i19 = (i19 + i25) & i18;
        }
    }

    private final int j(int hash1) {
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

    private final void k() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void l(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = g1.f169860a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            pq.n.D(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i15 = capacity >> 3;
        long j15 = 255 << ((capacity & 7) << 3);
        jArr[i15] = (jArr[i15] & (~j15)) | j15;
        k();
    }

    private final void m(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        l(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    public final void f() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            p(g1.d(this._capacity));
        } else {
            h();
        }
    }

    public final void g() {
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
        k();
    }

    public final void h() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        int i16 = (i15 + 7) >> 3;
        char c15 = 0;
        for (int i17 = 0; i17 < i16; i17++) {
            long j15 = jArr[i17] & (-9187201950435737472L);
            jArr[i17] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
        }
        int iU0 = pq.n.u0(jArr);
        int i18 = iU0 - 1;
        long j16 = 72057594037927935L;
        jArr[i18] = (jArr[i18] & 72057594037927935L) | (-72057594037927936L);
        jArr[iU0] = jArr[0];
        int i19 = 0;
        while (i19 != i15) {
            int i25 = i19 >> 3;
            int i26 = (i19 & 7) << 3;
            long j17 = (jArr[i25] >> i26) & 255;
            if (j17 != 128 && j17 == 254) {
                int iHashCode = Long.hashCode(jArr2[i19]) * (-862048943);
                int i27 = iHashCode ^ (iHashCode << 16);
                int i28 = i27 >>> 7;
                int iJ = j(i28);
                int i29 = i28 & i15;
                char c16 = c15;
                if (((iJ - i29) & i15) / 8 == ((i19 - i29) & i15) / 8) {
                    jArr[i25] = ((i27 & CertificateBody.profileType) << i26) | ((~(255 << i26)) & jArr[i25]);
                    jArr[pq.n.u0(jArr)] = (jArr[c16] & j16) | Long.MIN_VALUE;
                    i19++;
                    c15 = c16;
                } else {
                    int i35 = iJ >> 3;
                    long j18 = jArr[i35];
                    int i36 = (iJ & 7) << 3;
                    if (((j18 >> i36) & 255) == 128) {
                        jArr[i35] = (((long) (i27 & CertificateBody.profileType)) << i36) | (j18 & (~(255 << i36)));
                        jArr[i25] = (jArr[i25] & (~(255 << i26))) | (128 << i26);
                        jArr2[iJ] = jArr2[i19];
                        jArr2[i19] = 0;
                        objArr[iJ] = objArr[i19];
                        objArr[i19] = null;
                    } else {
                        jArr[i35] = (((long) (i27 & CertificateBody.profileType)) << i36) | (j18 & (~(255 << i36)));
                        long j19 = jArr2[iJ];
                        jArr2[iJ] = jArr2[i19];
                        jArr2[i19] = j19;
                        Object obj = objArr[iJ];
                        objArr[iJ] = objArr[i19];
                        objArr[i19] = obj;
                        i19--;
                    }
                    jArr[pq.n.u0(jArr)] = (jArr[c16] & j16) | Long.MIN_VALUE;
                    i19++;
                    c15 = c16;
                    j16 = j16;
                }
            } else {
                i19++;
            }
        }
        k();
    }

    public final V n(long key) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(key) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 & CertificateBody.profileType;
        int i17 = this._capacity;
        int i18 = (i15 >>> 7) & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i25 = i18 >> 3;
            int i26 = (i18 & 7) << 3;
            long j15 = ((jArr[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr[i25] >>> i26);
            long j16 = (((long) i16) * 72340172838076673L) ^ j15;
            for (long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i18) & i17;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return o(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V o(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
        Object[] objArr = this.values;
        V v15 = (V) objArr[index];
        objArr[index] = null;
        return v15;
    }

    public final void p(int newCapacity) {
        m0<V> m0Var = this;
        long[] jArr = m0Var.metadata;
        long[] jArr2 = m0Var.keys;
        Object[] objArr = m0Var.values;
        int i15 = m0Var._capacity;
        m(newCapacity);
        long[] jArr3 = m0Var.metadata;
        long[] jArr4 = m0Var.keys;
        Object[] objArr2 = m0Var.values;
        int i16 = m0Var._capacity;
        int i17 = 0;
        while (i17 < i15) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                long j15 = jArr2[i17];
                int iHashCode = Long.hashCode(j15) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iJ = m0Var.j(i18 >>> 7);
                long j16 = i18 & CertificateBody.profileType;
                int i19 = iJ >> 3;
                int i25 = (iJ & 7) << 3;
                long j17 = (jArr3[i19] & (~(255 << i25))) | (j16 << i25);
                jArr3[i19] = j17;
                jArr3[(((iJ - 7) & i16) + (i16 & 7)) >> 3] = j17;
                jArr4[iJ] = j15;
                objArr2[iJ] = objArr[i17];
            }
            i17++;
            m0Var = this;
            jArr = jArr;
        }
    }

    public final void q(long key, V value) {
        int i15 = i(key);
        this.keys[i15] = key;
        this.values[i15] = value;
    }

    public m0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        m(g1.f(i15));
    }
}
