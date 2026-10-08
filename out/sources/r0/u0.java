package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0015J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b#\u0010\u0017J\u001b\u0010$\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b$\u0010\u001bJ\u001e\u0010%\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b%\u0010\u001fJ\u001b\u0010'\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0003H\u0000¢\u0006\u0004\b/\u0010\u0006J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lr0/u0;", "E", "Lr0/h1;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "t", "capacity", "s", "r", "()V", "element", "p", "(Ljava/lang/Object;)I", "hash1", "q", "(I)I", "", "i", "(Ljava/lang/Object;)Z", "x", "(Ljava/lang/Object;)V", "", "elements", "j", "(Ljava/lang/Iterable;)Z", "k", "(Lr0/h1;)Z", "w", "(Ljava/lang/Iterable;)V", "y", "(Lr0/h1;)V", "z", "v", "A", "u", "", ip.a.f96138c, "(Ljava/util/Collection;)Z", "index", "B", "n", "l", "o", "newCapacity", "C", "", "m", "()Ljava/util/Set;", "e", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u0<E> extends h1<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public u0() {
        this(0, 1, null);
    }

    private final int p(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
                if (fr.t.c(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iQ = q(i16);
                if (this.growthLimit == 0 && ((this.metadata[iQ >> 3] >> ((iQ & 7) << 3)) & 255) != 254) {
                    l();
                    iQ = q(i16);
                }
                this._size++;
                int i29 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i35 = iQ >> 3;
                long j19 = jArr2[i35];
                int i36 = (iQ & 7) << 3;
                this.growthLimit = i29 - (((j19 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this._capacity;
                long j25 = ((~(255 << i36)) & j19) | (j16 << i36);
                jArr2[i35] = j25;
                jArr2[(((iQ - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return iQ;
            }
            i25 += 8;
            i19 = (i19 + i25) & i18;
            i17 = i28;
        }
    }

    private final int q(int hash1) {
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

    private final void r() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void s(int capacity) {
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
        r();
    }

    private final void t(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        s(iMax);
        this.elements = iMax == 0 ? s0.a.f176998c : new Object[iMax];
    }

    public final boolean A(Iterable<? extends E> elements) {
        int i15 = get_size();
        u(elements);
        return i15 != get_size();
    }

    public final void B(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
        this.elements[index] = null;
    }

    public final void C(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i15 = this._capacity;
        t(newCapacity);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i16 = this._capacity;
        for (int i17 = 0; i17 < i15; i17++) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i17];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iQ = q(i18 >>> 7);
                long j15 = i18 & CertificateBody.profileType;
                int i19 = iQ >> 3;
                int i25 = (iQ & 7) << 3;
                long j16 = (jArr2[i19] & (~(255 << i25))) | (j15 << i25);
                jArr2[i19] = j16;
                jArr2[(((iQ - 7) & i16) + (i16 & 7)) >> 3] = j16;
                objArr2[iQ] = obj;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000f->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000f->B:17:0x004e], SYNTHETIC] */
    public final boolean D(Collection<? extends E> elements) {
        Object[] objArr = this.elements;
        int i15 = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j15 = jArr[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i16 != length) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j15) < 128) {
                            int i19 = (i16 << 3) + i18;
                            if (!pq.v.c0(elements, objArr[i19])) {
                                B(i19);
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                    if (i16 != length) {
                        break;
                    }
                    i16++;
                }
            }
        }
        return i15 != this._size;
    }

    public final boolean i(E element) {
        int i15 = get_size();
        this.elements[p(element)] = element;
        return get_size() != i15;
    }

    public final boolean j(Iterable<? extends E> elements) {
        int i15 = get_size();
        w(elements);
        return i15 != get_size();
    }

    public final boolean k(h1<E> elements) {
        int i15 = get_size();
        y(elements);
        return i15 != get_size();
    }

    public final void l() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            C(g1.d(this._capacity));
        } else {
            o();
        }
    }

    public final Set<E> m() {
        return new v0(this);
    }

    public final void n() {
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
        pq.n.z(this.elements, null, 0, this._capacity);
        r();
    }

    public final void o() {
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        Object[] objArr = this.elements;
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
                int iQ = q(i29);
                int i35 = i29 & i15;
                int i36 = i17;
                if (((iQ - i35) & i15) / 8 == ((i25 - i35) & i15) / 8) {
                    jArr[i26] = (((long) (i28 & CertificateBody.profileType)) << i27) | ((~(255 << i27)) & jArr[i26]);
                    jArr[pq.n.u0(jArr)] = (jArr[i36] & j16) | Long.MIN_VALUE;
                    i25++;
                    i17 = i36;
                } else {
                    int i37 = iQ >> 3;
                    long j18 = jArr[i37];
                    int i38 = (iQ & 7) << 3;
                    if (((j18 >> i38) & 255) == 128) {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        jArr[i26] = (jArr[i26] & (~(255 << i27))) | (128 << i27);
                        objArr[iQ] = objArr[i25];
                        objArr[i25] = null;
                    } else {
                        jArr[i37] = (((long) (i28 & CertificateBody.profileType)) << i38) | (j18 & (~(255 << i38)));
                        Object obj2 = objArr[iQ];
                        objArr[iQ] = objArr[i25];
                        objArr[i25] = obj2;
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
        r();
    }

    public final void u(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(E element) {
        int iNumberOfTrailingZeros;
        int i15 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
                if (fr.t.c(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i15 += 8;
                i19 = i25 + i15;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            B(iNumberOfTrailingZeros);
        }
    }

    public final void w(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            x(it.next());
        }
    }

    public final void x(E element) {
        this.elements[p(element)] = element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(h1<E> elements) {
        Object[] objArr = elements.elements;
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
                        x(objArr[(i15 << 3) + i17]);
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

    public final boolean z(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
                if (fr.t.c(this.elements[iNumberOfTrailingZeros], element)) {
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
            B(iNumberOfTrailingZeros);
        }
        return z15;
    }

    public u0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        t(g1.f(i15));
    }

    public /* synthetic */ u0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }
}
