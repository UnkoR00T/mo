package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lr0/h0;", "Lr0/l;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "p", "capacity", "o", "n", "()V", "key", "m", "(I)I", "hash1", "l", "value", "u", "(II)V", "q", "r", "index", "s", "j", "i", "k", "newCapacity", "t", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public h0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        p(g1.f(i15));
    }

    private final int l(int hash1) {
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

    private final int m(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
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
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i28 = i35;
            }
            int i36 = i28;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iL = l(i16);
                if (this.growthLimit == 0 && ((this.metadata[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    i();
                    iL = l(i16);
                }
                this._size++;
                int i37 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i38 = iL >> 3;
                long j19 = jArr2[i38];
                int i39 = (iL & 7) << 3;
                this.growthLimit = i37 - (((j19 >> i39) & 255) == 128 ? i36 : 0);
                int i45 = this._capacity;
                long j25 = ((~(255 << i39)) & j19) | (j16 << i39);
                jArr2[i38] = j25;
                jArr2[(((iL - 7) & i45) + (i45 & 7)) >> 3] = j25;
                return ~iL;
            }
            i25 = i29 + 8;
            i19 = (i19 + i25) & i18;
        }
    }

    private final void n() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void o(int capacity) {
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
        n();
    }

    private final void p(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        o(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    public final void i() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            t(g1.d(this._capacity));
        } else {
            k();
        }
    }

    public final void j() {
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
        n();
    }

    public final void k() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                int iL = l(i29);
                int i35 = i29 & i15;
                int i36 = i17;
                if (((iL - i35) & i15) / 8 == ((i25 - i35) & i15) / 8) {
                    jArr[i26] = ((i28 & CertificateBody.profileType) << i27) | ((~(255 << i27)) & jArr[i26]);
                    jArr[pq.n.u0(jArr)] = (jArr[i36] & j16) | Long.MIN_VALUE;
                    i25++;
                    i17 = i36;
                } else {
                    int i37 = iL >> 3;
                    long j18 = jArr[i37];
                    int i38 = (iL & 7) << 3;
                    if (((j18 >> i38) & 255) == 128) {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        jArr[i26] = (jArr[i26] & (~(255 << i27))) | (128 << i27);
                        iArr[iL] = iArr[i25];
                        iArr[i25] = i36;
                        iArr2[iL] = iArr2[i25];
                        iArr2[i25] = i36;
                    } else {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        int i39 = iArr[iL];
                        iArr[iL] = iArr[i25];
                        iArr[i25] = i39;
                        int i45 = iArr2[iL];
                        iArr2[iL] = iArr2[i25];
                        iArr2[i25] = i45;
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
        n();
    }

    public final void q(int key, int value) {
        u(key, value);
    }

    public final void r(int key) {
        int iB = b(key);
        if (iB >= 0) {
            s(iB);
        }
    }

    public final void s(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
    }

    public final void t(int newCapacity) {
        h0 h0Var = this;
        long[] jArr = h0Var.metadata;
        int[] iArr = h0Var.keys;
        int[] iArr2 = h0Var.values;
        int i15 = h0Var._capacity;
        p(newCapacity);
        long[] jArr2 = h0Var.metadata;
        int[] iArr3 = h0Var.keys;
        int[] iArr4 = h0Var.values;
        int i16 = h0Var._capacity;
        int i17 = 0;
        while (i17 < i15) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                int i18 = iArr[i17];
                int iHashCode = Integer.hashCode(i18) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int iL = h0Var.l(i19 >>> 7);
                long j15 = i19 & CertificateBody.profileType;
                int i25 = iL >> 3;
                int i26 = (iL & 7) << 3;
                long j16 = (jArr2[i25] & (~(255 << i26))) | (j15 << i26);
                jArr2[i25] = j16;
                jArr2[(((iL - 7) & i16) + (i16 & 7)) >> 3] = j16;
                iArr3[iL] = i18;
                iArr4[iL] = iArr2[i17];
            }
            i17++;
            h0Var = this;
            jArr = jArr;
        }
    }

    public final void u(int key, int value) {
        int iM = m(key);
        if (iM < 0) {
            iM = ~iM;
        }
        this.keys[iM] = key;
        this.values[iM] = value;
    }

    public /* synthetic */ h0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }
}
