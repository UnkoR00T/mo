package r0;

import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u0012\u0004\b\u001f\u0010\u0005R$\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u0010\"\u0012\u0004\b#\u0010\u0005R$\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010\"\u0012\u0004\b%\u0010\u0005R\u0016\u0010(\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010)\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0011\u0010+\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014R\u0011\u0010-\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b,\u0010\u0014\u0082\u0001\u0001.¨\u0006/"}, d2 = {"Lr0/f1;", "K", "V", "", "<init>", "()V", "", "h", "()Z", "i", "key", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Z", "c", "value", "d", "", "hashCode", "()I", "other", "equals", "", "toString", "()Ljava/lang/String;", "", "a", "()Ljava/util/Map;", "", "[J", "getMetadata$annotations", "metadata", "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "getValues$annotations", "values", "I", "_capacity", "_size", "f", "capacity", "g", "size", "Lr0/t0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class f1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Object[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ f1(fr.k kVar) {
        this();
    }

    public final Map<K, V> a() {
        return new e0(this);
    }

    public final boolean b(K key) {
        int iNumberOfTrailingZeros;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (fr.t.c(this.keys[iNumberOfTrailingZeros], key)) {
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

    public final boolean c(K key) {
        int iNumberOfTrailingZeros;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
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
                if (fr.t.c(this.keys[iNumberOfTrailingZeros], key)) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean d(V value) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128 && fr.t.c(value, objArr[(i15 << 3) + i17])) {
                            return true;
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
        return false;
    }

    public final V e(K key) {
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
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) other;
        if (f1Var.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            Object obj2 = objArr2[i18];
                            if (obj2 == null) {
                                if (f1Var.e(obj) != null || !f1Var.c(obj)) {
                                    return false;
                                }
                            } else if (!fr.t.c(obj2, f1Var.e(obj))) {
                                return false;
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean h() {
        return this._size == 0;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i15 = 0;
        int iHashCode = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = objArr[i18];
                        Object obj2 = objArr2[i18];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return iHashCode;
                }
            }
            if (i15 == length) {
                return iHashCode;
            }
            i15++;
        }
    }

    public final boolean i() {
        return this._size != 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[DONT_INVERT, PHI: r8
      0x007a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:9:0x0023->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[EDGE_INSN: B:31:0x007f->B:28:0x007f BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007c], SYNTHETIC] */
    public String toString() {
        if (h()) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('{');
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            int i16 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j15) < 128) {
                            int i19 = (i15 << 3) + i18;
                            Object obj = objArr[i19];
                            Object obj2 = objArr2[i19];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb5.append(obj);
                            sb5.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb5.append(obj2);
                            i16++;
                            if (i16 < this._size) {
                                sb5.append(',');
                                sb5.append(' ');
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    private f1() {
        this.metadata = g1.f169860a;
        Object[] objArr = s0.a.f176998c;
        this.keys = objArr;
        this.values = objArr;
    }
}
