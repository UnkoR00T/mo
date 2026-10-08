package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u0005R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lr0/n0;", "Lr0/y;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "k", "capacity", "j", "i", "()V", "index", "n", "", "element", "g", "(J)I", "hash1", "h", "(I)I", "l", "(J)V", "", "m", "(J)Z", "e", "f", "newCapacity", "o", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n0 extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public n0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        k(g1.f(i15));
    }

    private final int g(long element) {
        int iHashCode = Long.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iH = h(i16);
                if (this.growthLimit == 0 && ((this.metadata[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    e();
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
                return iH;
            }
            i25 = i28 + 8;
            i19 = (i19 + i25) & i18;
        }
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

    private final void i() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void j(int capacity) {
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
        i();
    }

    private final void k(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        j(iMax);
        this.elements = new long[iMax];
    }

    private final void n(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
    }

    public final void e() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            o(g1.d(this._capacity));
        } else {
            f();
        }
    }

    public final void f() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        long[] jArr2 = this.elements;
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
                int iH = h(i28);
                int i29 = i28 & i15;
                char c16 = c15;
                if (((iH - i29) & i15) / 8 == ((i19 - i29) & i15) / 8) {
                    jArr[i25] = ((i27 & CertificateBody.profileType) << i26) | ((~(255 << i26)) & jArr[i25]);
                    jArr[pq.n.u0(jArr)] = (jArr[c16] & j16) | Long.MIN_VALUE;
                    i19++;
                    c15 = c16;
                } else {
                    int i35 = iH >> 3;
                    long j18 = jArr[i35];
                    int i36 = (iH & 7) << 3;
                    if (((j18 >> i36) & 255) == 128) {
                        jArr[i35] = (((long) (i27 & CertificateBody.profileType)) << i36) | (j18 & (~(255 << i36)));
                        jArr[i25] = (jArr[i25] & (~(255 << i26))) | (128 << i26);
                        jArr2[iH] = jArr2[i19];
                        jArr2[i19] = 0;
                    } else {
                        jArr[i35] = (((long) (i27 & CertificateBody.profileType)) << i36) | (j18 & (~(255 << i36)));
                        long j19 = jArr2[iH];
                        jArr2[iH] = jArr2[i19];
                        jArr2[i19] = j19;
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
        i();
    }

    public final void l(long element) {
        this.elements[g(element)] = element;
    }

    public final boolean m(long element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(element) * (-862048943);
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
                if (this.elements[iNumberOfTrailingZeros] == element) {
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
        boolean z15 = iNumberOfTrailingZeros >= 0;
        if (z15) {
            n(iNumberOfTrailingZeros);
        }
        return z15;
    }

    public final void o(int newCapacity) {
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i15 = this._capacity;
        k(newCapacity);
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i16 = this._capacity;
        for (int i17 = 0; i17 < i15; i17++) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                long j15 = jArr2[i17];
                int iHashCode = Long.hashCode(j15) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iH = h(i18 >>> 7);
                long j16 = i18 & CertificateBody.profileType;
                int i19 = iH >> 3;
                int i25 = (iH & 7) << 3;
                long j17 = (jArr3[i19] & (~(255 << i25))) | (j16 << i25);
                jArr3[i19] = j17;
                jArr3[(((iH - 7) & i16) + (i16 & 7)) >> 3] = j17;
                jArr4[iH] = j15;
            }
        }
    }
}
