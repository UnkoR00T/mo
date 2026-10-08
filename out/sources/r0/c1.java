package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJY\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010\u001e\u0012\u0004\b\u001f\u0010\u0004R$\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010(\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b&\u0010\u001e\u0012\u0004\b'\u0010\u0004R\u001c\u0010+\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0006\u0010)\u0012\u0004\b*\u0010\u0004R\u001c\u0010-\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010)\u0012\u0004\b,\u0010\u0004R\u0016\u0010/\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010)R\u0016\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u0010)R\u0011\u00102\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0011\u00103\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b&\u0010\u0018\u0082\u0001\u00014¨\u00065"}, d2 = {"Lr0/c1;", "E", "", "<init>", "()V", "", "d", "()Z", "element", "a", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", "metadata", "", "b", "[Ljava/lang/Object;", "getElements$annotations", "elements", "c", "getNodes$annotations", "nodes", "I", "getHead$annotations", "head", "getTail$annotations", "tail", "f", "_capacity", "g", "_size", "capacity", "size", "Lr0/r0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Object[] elements;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long[] nodes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int head;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int tail;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "c", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends fr.w implements er.l<E, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1<E> f169826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1<E> c1Var) {
            super(1);
            this.f169826b = c1Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(E e15) {
            return e15 == this.f169826b ? "(this)" : String.valueOf(e15);
        }
    }

    public /* synthetic */ c1(fr.k kVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String f(c1 c1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i16 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i16 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i16 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i16 & 8) != 0) {
            i15 = -1;
        }
        if ((i16 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i16 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        er.l lVar2 = lVar;
        return c1Var.e(charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public final boolean a(E element) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean d() {
        return this._size == 0;
    }

    public final String e(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, er.l<? super E, ? extends CharSequence> transform) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i15 = this.tail;
        int i16 = 0;
        while (i15 != Integer.MAX_VALUE) {
            int i17 = (int) ((jArr[i15] >> 31) & 2147483647L);
            Object obj = objArr[i15];
            if (i16 == limit) {
                sb5.append(truncated);
                return sb5.toString();
            }
            if (i16 != 0) {
                sb5.append(separator);
            }
            if (transform == null) {
                sb5.append(obj);
            } else {
                sb5.append(transform.b(obj));
            }
            i16++;
            i15 = i17;
        }
        sb5.append(postfix);
        return sb5.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) other;
        if (c1Var.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128 && !c1Var.a(objArr[(i15 << 3) + i17])) {
                            return false;
                        }
                        j15 >>= 8;
                    }
                    if (i16 == 8) {
                        if (i15 != length) {
                            i15++;
                        }
                    }
                } else if (i15 != length) {
                    i15++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            Object obj = objArr[(i15 << 3) + i17];
                            if (!fr.t.c(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        return iHashCode;
                    }
                }
                if (i15 != length) {
                    i15++;
                }
            }
        }
        return iHashCode;
    }

    public String toString() {
        return f(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    private c1() {
        this.metadata = g1.f169860a;
        this.elements = s0.a.f176998c;
        this.nodes = k1.a();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
    }
}
