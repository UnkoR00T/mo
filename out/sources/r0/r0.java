package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u001cJ\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010\u001eJ\u001b\u0010'\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b'\u0010\"J\u001e\u0010(\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b(\u0010$J\u001b\u0010*\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0003H\u0001¢\u0006\u0004\b-\u0010\u0006J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\fJ\u000f\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0004\b/\u0010\fJ\u000f\u00100\u001a\u00020\u0007H\u0000¢\u0006\u0004\b0\u0010\fJ\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0004\b2\u0010\u0006J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003¢\u0006\u0004\b4\u00105R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106¨\u00068"}, d2 = {"Lr0/r0;", "E", "Lr0/c1;", "", "initialCapacity", "<init>", "(I)V", "Loq/i0;", "s", "capacity", "r", "q", "()V", "element", "m", "(Ljava/lang/Object;)I", "hash1", "n", "(I)I", "", "mapping", "p", "([J)V", "", "o", "([I)V", "", "g", "(Ljava/lang/Object;)Z", "w", "(Ljava/lang/Object;)V", "", "elements", "h", "(Ljava/lang/Iterable;)Z", "v", "(Ljava/lang/Iterable;)V", "x", "u", "y", "t", "", "B", "(Ljava/util/Collection;)Z", "index", "z", "k", "i", "l", "newCapacity", "A", "", "j", "()Ljava/util/Set;", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r0<E> extends c1<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ r0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 6 : i15);
    }

    private final int m(E element) {
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
                int iN = n(i16);
                if (this.growthLimit == 0 && ((this.metadata[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    i();
                    iN = n(i16);
                }
                this._size++;
                int i29 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i35 = iN >> 3;
                long j19 = jArr2[i35];
                int i36 = (iN & 7) << 3;
                this.growthLimit = i29 - (((j19 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this._capacity;
                long j25 = ((~(255 << i36)) & j19) | (j16 << i36);
                jArr2[i35] = j25;
                jArr2[(((iN - 7) & i37) + (i37 & 7)) >> 3] = j25;
                return iN;
            }
            i25 += 8;
            i19 = (i19 + i25) & i18;
            i17 = i28;
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

    private final void o(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i15 = 0;
        while (true) {
            int i16 = Integer.MAX_VALUE;
            if (i15 >= length) {
                break;
            }
            long j15 = jArr[i15];
            int i17 = (int) ((j15 >> 31) & 2147483647L);
            int i18 = (int) (j15 & 2147483647L);
            long j16 = ((j15 & (-4611686018427387904L)) | ((long) (i17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i17]))) << 31;
            if (i18 != Integer.MAX_VALUE) {
                i16 = mapping[i18];
            }
            jArr[i15] = j16 | ((long) i16);
            i15++;
        }
        int i19 = this.head;
        if (i19 != Integer.MAX_VALUE) {
            this.head = mapping[i19];
        }
        int i25 = this.tail;
        if (i25 != Integer.MAX_VALUE) {
            this.tail = mapping[i25];
        }
    }

    private final void p(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i15 = 0;
        while (true) {
            int i16 = Integer.MAX_VALUE;
            if (i15 >= length) {
                break;
            }
            long j15 = jArr[i15];
            int i17 = (int) ((j15 >> 31) & 2147483647L);
            int i18 = (int) (j15 & 2147483647L);
            long j16 = ((j15 & (-4611686018427387904L)) | ((long) (i17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i17] & BodyPartID.bodyIdMax)))) << 31;
            if (i18 != Integer.MAX_VALUE) {
                i16 = (int) (BodyPartID.bodyIdMax & mapping[i18]);
            }
            jArr[i15] = ((long) i16) | j16;
            i15++;
        }
        int i19 = this.head;
        if (i19 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i19] & BodyPartID.bodyIdMax);
        }
        int i25 = this.tail;
        if (i25 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i25] & BodyPartID.bodyIdMax);
        }
    }

    private final void q() {
        this.growthLimit = g1.b(get_capacity()) - this._size;
    }

    private final void r(int capacity) {
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
        q();
    }

    private final void s(int initialCapacity) {
        long[] jArrA;
        int iMax = initialCapacity > 0 ? Math.max(7, g1.e(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = iMax == 0 ? s0.a.f176998c : new Object[iMax];
        if (iMax == 0) {
            jArrA = k1.a();
        } else {
            long[] jArr = new long[iMax];
            pq.n.D(jArr, 4611686018427387903L, 0, 0, 6, null);
            jArrA = jArr;
        }
        this.nodes = jArrA;
    }

    public final void A(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        int i15 = this._capacity;
        int[] iArr = new int[i15];
        s(newCapacity);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr4 = this.nodes;
        int i16 = this._capacity;
        int i17 = 0;
        while (i17 < i15) {
            if (((jArr[i17 >> 3] >> ((i17 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i17];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int iN = n(i18 >>> 7);
                long j15 = i18 & CertificateBody.profileType;
                int i19 = iN >> 3;
                int i25 = (iN & 7) << 3;
                long j16 = (jArr3[i19] & (~(255 << i25))) | (j15 << i25);
                jArr3[i19] = j16;
                jArr3[(((iN - 7) & i16) + (i16 & 7)) >> 3] = j16;
                objArr2[iN] = obj;
                jArr4[iN] = jArr2[i17];
                iArr[i17] = iN;
            }
            i17++;
            jArr = jArr;
            objArr = objArr;
        }
        o(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000f->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051 A[EDGE_INSN: B:24:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000f->B:17:0x004e], SYNTHETIC] */
    public final boolean B(Collection<? extends E> elements) {
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
                                z(i19);
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

    public final boolean g(E element) {
        int i15 = get_size();
        int iM = m(element);
        this.elements[iM] = element;
        long[] jArr = this.nodes;
        int i16 = this.head;
        jArr[iM] = (((long) i16) & 2147483647L) | 4611686016279904256L;
        if (i16 != Integer.MAX_VALUE) {
            jArr[i16] = ((((long) iM) & 2147483647L) << 31) | (jArr[i16] & (-4611686016279904257L));
        }
        this.head = iM;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iM;
        }
        return get_size() != i15;
    }

    public final boolean h(Iterable<? extends E> elements) {
        int i15 = get_size();
        v(elements);
        return i15 != get_size();
    }

    public final void i() {
        if (this._capacity <= 8 || Long.compareUnsigned(oq.d0.e(oq.d0.e(this._size) * 32), oq.d0.e(oq.d0.e(this._capacity) * 25)) > 0) {
            A(g1.d(this._capacity));
        } else {
            l();
        }
    }

    public final Set<E> j() {
        return new s0(this);
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
        pq.n.z(this.elements, null, 0, this._capacity);
        pq.n.D(this.nodes, 4611686018427387903L, 0, 0, 6, null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        q();
    }

    public final void l() {
        int i15;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i16 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i16];
        long j15 = 9223372034707292159L;
        int i17 = 0;
        pq.n.y(jArr3, 9223372034707292159L, 0, i16);
        int i18 = (i16 + 7) >> 3;
        for (int i19 = 0; i19 < i18; i19++) {
            long j16 = jArr[i19] & (-9187201950435737472L);
            jArr[i19] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
        }
        int iU0 = pq.n.u0(jArr);
        int i25 = iU0 - 1;
        jArr[i25] = (jArr[i25] & 72057594037927935L) | (-72057594037927936L);
        jArr[iU0] = jArr[0];
        int i26 = 0;
        while (i26 != i16) {
            int i27 = i26 >> 3;
            int i28 = (i26 & 7) << 3;
            long j17 = (jArr[i27] >> i28) & 255;
            if (j17 != 128 && j17 == 254) {
                Object obj = objArr[i26];
                int iHashCode = (obj != null ? obj.hashCode() : i17) * (-862048943);
                int i29 = iHashCode ^ (iHashCode << 16);
                int i35 = i29 >>> 7;
                long j18 = j15;
                int iN = n(i35);
                int i36 = i35 & i16;
                if (((iN - i36) & i16) / 8 == ((i26 - i36) & i16) / 8) {
                    jArr[i27] = (((long) (i29 & CertificateBody.profileType)) << i28) | (jArr[i27] & (~(255 << i28)));
                    if (jArr3[i26] == j18) {
                        long j19 = i26;
                        jArr3[i26] = j19 | (j19 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i17];
                    i26++;
                    j15 = j18;
                } else {
                    int i37 = iN >> 3;
                    long j25 = jArr[i37];
                    int i38 = (iN & 7) << 3;
                    int i39 = i17;
                    if (((j25 >> i38) & 255) == 128) {
                        int i45 = i26;
                        jArr[i37] = (j25 & (~(255 << i38))) | (((long) (i29 & CertificateBody.profileType)) << i38);
                        jArr[i27] = (jArr[i27] & (~(255 << i28))) | (128 << i28);
                        objArr[iN] = objArr[i45];
                        objArr[i45] = null;
                        jArr2[iN] = jArr2[i45];
                        jArr2[i45] = 4611686018427387903L;
                        int i46 = (int) ((jArr3[i45] >> 32) & BodyPartID.bodyIdMax);
                        if (i46 != Integer.MAX_VALUE) {
                            jArr3[i46] = (jArr3[i46] & (-4294967296L)) | ((long) iN);
                            jArr3[i45] = (jArr3[i45] & BodyPartID.bodyIdMax) | (-4294967296L);
                        } else {
                            jArr3[i45] = (((long) Integer.MAX_VALUE) << 32) | ((long) iN);
                        }
                        i15 = i45;
                        jArr3[iN] = ((long) Integer.MAX_VALUE) | (((long) i15) << 32);
                    } else {
                        jArr[i37] = (((long) (i29 & CertificateBody.profileType)) << i38) | (j25 & (~(255 << i38)));
                        Object obj2 = objArr[iN];
                        objArr[iN] = objArr[i26];
                        objArr[i26] = obj2;
                        long j26 = jArr2[iN];
                        jArr2[iN] = jArr2[i26];
                        jArr2[i26] = j26;
                        int i47 = (int) ((jArr3[i26] >> 32) & BodyPartID.bodyIdMax);
                        if (i47 != Integer.MAX_VALUE) {
                            long j27 = iN;
                            jArr3[i47] = (jArr3[i47] & (-4294967296L)) | j27;
                            jArr3[i26] = (jArr3[i26] & BodyPartID.bodyIdMax) | (j27 << 32);
                        } else {
                            long j28 = iN;
                            jArr3[i26] = j28 | (j28 << 32);
                            i47 = i26;
                        }
                        jArr3[iN] = (((long) i47) << 32) | ((long) i26);
                        i15 = i26 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i39];
                    i26 = i15 + 1;
                    j15 = j18;
                    i17 = i39;
                }
            } else {
                i26++;
            }
        }
        q();
        p(jArr3);
    }

    public final void t(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    public final void u(E element) {
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
            z(iNumberOfTrailingZeros);
        }
    }

    public final void v(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(E element) {
        int iM = m(element);
        this.elements[iM] = element;
        long[] jArr = this.nodes;
        int i15 = this.head;
        jArr[iM] = (((long) i15) & 2147483647L) | 4611686016279904256L;
        if (i15 != Integer.MAX_VALUE) {
            jArr[i15] = ((((long) iM) & 2147483647L) << 31) | (jArr[i15] & (-4611686016279904257L));
        }
        this.head = iM;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iM;
        }
    }

    public final boolean x(E element) {
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
            z(iNumberOfTrailingZeros);
        }
        return z15;
    }

    public final boolean y(Iterable<? extends E> elements) {
        int i15 = get_size();
        t(elements);
        return i15 != get_size();
    }

    public final void z(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i15 = this._capacity;
        int i16 = index >> 3;
        int i17 = (index & 7) << 3;
        long j15 = (jArr[i16] & (~(255 << i17))) | (254 << i17);
        jArr[i16] = j15;
        jArr[(((index - 7) & i15) + (i15 & 7)) >> 3] = j15;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j16 = jArr2[index];
        int i18 = (int) ((j16 >> 31) & 2147483647L);
        int i19 = (int) (j16 & 2147483647L);
        if (i18 != Integer.MAX_VALUE) {
            jArr2[i18] = (jArr2[i18] & (-2147483648L)) | (((long) i19) & 2147483647L);
        } else {
            this.head = i19;
        }
        if (i19 != Integer.MAX_VALUE) {
            jArr2[i19] = ((((long) i18) & 2147483647L) << 31) | (jArr2[i19] & (-4611686016279904257L));
        } else {
            this.tail = i18;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public r0(int i15) {
        super(null);
        if (!(i15 >= 0)) {
            s0.d.a("Capacity must be a positive value.");
        }
        s(g1.f(i15));
    }
}
