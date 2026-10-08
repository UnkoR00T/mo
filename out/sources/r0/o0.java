package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001c\u0010\u0006R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d¨\u0006\u001f"}, d2 = {"Lr0/o0;", "K", "Lr0/w0;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "l", "capacity", "k", "j", "()V", "key", "i", "(Ljava/lang/Object;)I", "hash1", "h", "(I)I", "", "value", "o", "(Ljava/lang/Object;F)V", "index", "m", "f", "g", "newCapacity", "n", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o0<K> extends w0<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public o0() {
        this(0, 1, null);
    }

    private final int h(int hash1) {
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

    private final int i(K key) {
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
                int iH = h(i16);
                if (this.growthLimit == 0 && ((this.metadata[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    f();
                    iH = h(i16);
                }
                this._size++;
                int i29 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i35 = iH >> 3;
                long j19 = jArr2[i35];
                int i36 = (iH & 7) << 3;
                this.growthLimit = i29 - (((j19 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this._capacity;
                long j25 = ((~(255 << i36)) & j19) | (j16 << i36);
                jArr2[i35] = j25;
                jArr2[(((iH - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return ~iH;
            }
            i25 += 8;
            i19 = (i19 + i25) & i18;
            i17 = i28;
        }
    }

    private final void j() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void k(int capacity) {
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
        j();
    }

    private final void l(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        k(iMax);
        this.keys = new Object[iMax];
        this.values = new float[iMax];
    }

    public final void f() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            n(g1.d(this._capacity));
        } else {
            g();
        }
    }

    public final void g() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i16 = (i15 + 7) >> 3;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            long j15 = jArr[i18] & (-9187201950435737472L);
            jArr[i18] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
        }
        int iU0 = pq.n.u0(jArr);
        int i19 = iU0 - 1;
        long j16 = 72057594037927935L;
        jArr[i19] = (jArr[i19] & 72057594037927935L) | (-72057594037927936L);
        jArr[iU0] = jArr[0];
        int i25 = 0;
        while (i25 != i15) {
            int i26 = i25 >> 3;
            int i27 = (i25 & 7) << 3;
            long j17 = (jArr[i26] >> i27) & 255;
            if (j17 != 128 && j17 == 254) {
                Object obj = objArr[i25];
                int iHashCode = (obj != null ? obj.hashCode() : i17) * (-862048943);
                int i28 = iHashCode ^ (iHashCode << 16);
                int i29 = i28 >>> 7;
                int iH = h(i29);
                int i35 = i29 & i15;
                int i36 = i17;
                if (((iH - i35) & i15) / 8 == ((i25 - i35) & i15) / 8) {
                    jArr[i26] = (((long) (i28 & CertificateBody.profileType)) << i27) | ((~(255 << i27)) & jArr[i26]);
                    jArr[pq.n.u0(jArr)] = (jArr[i36] & j16) | Long.MIN_VALUE;
                    i25++;
                    i17 = i36;
                } else {
                    int i37 = iH >> 3;
                    long j18 = jArr[i37];
                    int i38 = (iH & 7) << 3;
                    if (((j18 >> i38) & 255) == 128) {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        jArr[i26] = (jArr[i26] & (~(255 << i27))) | (128 << i27);
                        objArr[iH] = objArr[i25];
                        objArr[i25] = null;
                        fArr[iH] = fArr[i25];
                        fArr[i25] = 0.0f;
                    } else {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        Object obj2 = objArr[iH];
                        objArr[iH] = objArr[i25];
                        objArr[i25] = obj2;
                        float f15 = fArr[iH];
                        fArr[iH] = fArr[i25];
                        fArr[i25] = f15;
                        i25--;
                    }
                    jArr[pq.n.u0(jArr)] = (jArr[i36] & j16) | Long.MIN_VALUE;
                    i25++;
                    i17 = i36;
                    j16 = j16;
                }
            } else {
                i25++;
            }
        }
        j();
    }

    public final void m(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
        this.keys[index] = null;
    }

    public final void n(int newCapacity) {
        int i15;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        int i16 = this._capacity;
        l(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
        int i17 = this._capacity;
        int i18 = 0;
        while (i18 < i16) {
            if (((jArr[i18 >> 3] >> ((i18 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i18];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int iH = h(i19 >>> 7);
                i15 = i18;
                long j15 = i19 & CertificateBody.profileType;
                int i25 = iH >> 3;
                int i26 = (iH & 7) << 3;
                long j16 = (j15 << i26) | (jArr2[i25] & (~(255 << i26)));
                jArr2[i25] = j16;
                jArr2[(((iH - 7) & i17) + (i17 & 7)) >> 3] = j16;
                objArr2[iH] = obj;
                fArr2[iH] = fArr[i15];
            } else {
                i15 = i18;
            }
            i18 = i15 + 1;
        }
    }

    public final void o(K key, float value) {
        int i15 = i(key);
        if (i15 < 0) {
            i15 = ~i15;
        }
        this.keys[i15] = key;
        this.values[i15] = value;
    }

    public /* synthetic */ o0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }

    public o0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        l(g1.f(i15));
    }
}
