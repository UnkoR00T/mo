package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010\u0005R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lr0/k0;", "Lr0/s;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "q", "capacity", "p", "o", "()V", "index", "x", "element", "m", "(I)I", "hash1", "n", "", "h", "(I)Z", "t", "elements", "i", "(Lr0/s;)Z", "u", "(Lr0/s;)V", "v", "r", "w", "s", "k", "j", "l", "newCapacity", "y", "e", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k0 extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public k0() {
        this(0, 1, null);
    }

    private final int m(int element) {
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
            int i28 = 1;
            long j15 = ((jArr[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr[i26] >>> i27);
            long j16 = i17;
            int i29 = i25;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j18) >> 3) + i19) & i18;
                int i35 = i28;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i28 = i35;
            }
            int i36 = i28;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iN = n(i16);
                if (this.growthLimit == 0 && ((this.metadata[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    j();
                    iN = n(i16);
                }
                this._size++;
                int i37 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i38 = iN >> 3;
                long j19 = jArr2[i38];
                int i39 = (iN & 7) << 3;
                this.growthLimit = i37 - (((j19 >> i39) & 255) == 128 ? i36 : 0);
                int i45 = this._capacity;
                long j25 = ((~(255 << i39)) & j19) | (j16 << i39);
                jArr2[i38] = j25;
                jArr2[(((iN - 7) & i45) + (i45 & 7)) >> 3] = j25;
                return iN;
            }
            i25 = i29 + 8;
            i19 = (i19 + i25) & i18;
        }
    }

    private final int n(int hash1) {
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
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i15 = capacity >> 3;
        long j15 = 255 << ((capacity & 7) << 3);
        jArr[i15] = (jArr[i15] & (~j15)) | j15;
        o();
    }

    private final void q(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        p(iMax);
        this.elements = new int[iMax];
    }

    private final void x(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
    }

    public final boolean h(int element) {
        int i15 = this._size;
        this.elements[m(element)] = element;
        return this._size != i15;
    }

    public final boolean i(s elements) {
        int i15 = this._size;
        u(elements);
        return i15 != this._size;
    }

    public final void j() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            y(g1.d(this._capacity));
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
        o();
    }

    public final void l() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int[] iArr = this.elements;
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
                int iHashCode = Integer.hashCode(iArr[i25]) * (-862048943);
                int i28 = iHashCode ^ (iHashCode << 16);
                int i29 = i28 >>> 7;
                int iN = n(i29);
                int i35 = i29 & i15;
                int i36 = i17;
                if (((iN - i35) & i15) / 8 == ((i25 - i35) & i15) / 8) {
                    jArr[i26] = ((i28 & CertificateBody.profileType) << i27) | ((~(255 << i27)) & jArr[i26]);
                    jArr[pq.n.u0(jArr)] = (jArr[i36] & j16) | Long.MIN_VALUE;
                    i25++;
                    i17 = i36;
                } else {
                    int i37 = iN >> 3;
                    long j18 = jArr[i37];
                    int i38 = (iN & 7) << 3;
                    if (((j18 >> i38) & 255) == 128) {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        jArr[i26] = (jArr[i26] & (~(255 << i27))) | (128 << i27);
                        iArr[iN] = iArr[i25];
                        iArr[i25] = i36;
                    } else {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        int i39 = iArr[iN];
                        iArr[iN] = iArr[i25];
                        iArr[i25] = i39;
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
        o();
    }

    public final void r(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
            } else {
                i19 += 8;
                i18 = (i18 + i19) & i17;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            x(iNumberOfTrailingZeros);
        }
    }

    public final void s(s elements) {
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        r(iArr[(i15 << 3) + i17]);
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

    public final void t(int element) {
        this.elements[m(element)] = element;
    }

    public final void u(s elements) {
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        t(iArr[(i15 << 3) + i17]);
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

    public final boolean v(int element) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(element) * (-862048943);
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
            x(iNumberOfTrailingZeros);
        }
        return z15;
    }

    public final boolean w(s elements) {
        int i15 = this._size;
        s(elements);
        return i15 != this._size;
    }

    public final void y(int newCapacity) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i15 = this._capacity;
        q(newCapacity);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.elements;
        int i16 = this._capacity;
        for (int i17 = 0; i17 < i15; i17++) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                int i18 = iArr[i17];
                int iHashCode = Integer.hashCode(i18) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int iN = n(i19 >>> 7);
                long j15 = i19 & CertificateBody.profileType;
                int i25 = iN >> 3;
                int i26 = (iN & 7) << 3;
                long j16 = (jArr2[i25] & (~(255 << i26))) | (j15 << i26);
                jArr2[i25] = j16;
                jArr2[(((iN - 7) & i16) + (i16 & 7)) >> 3] = j16;
                iArr2[iN] = i18;
            }
        }
    }

    public k0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        q(g1.f(i15));
    }

    public /* synthetic */ k0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }
}
