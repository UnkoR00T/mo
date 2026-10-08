package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\f\u0010\u0018\u0012\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001c\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u0018\u0012\u0004\b\u001b\u0010\u0004R$\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0004R\u001c\u0010%\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010'\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010\u0004R\u0011\u0010(\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010)\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010\u0082\u0001\u0001*¨\u0006+"}, d2 = {"Lr0/w;", "V", "", "<init>", "()V", "", "e", "()Z", "", "key", "b", "(J)Ljava/lang/Object;", "a", "(J)Z", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "[J", "getMetadata$annotations", "metadata", "getKeys$annotations", "keys", "", "c", "[Ljava/lang/Object;", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "size", "Lr0/m0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class w<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ w(fr.k kVar) {
        this();
    }

    public final boolean a(long key) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final V b(long key) {
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
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean e() {
        return this._size == 0;
    }

    public boolean equals(Object other) {
        boolean z15;
        long[] jArr;
        boolean z16;
        long[] jArr2;
        boolean z17 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        if (wVar.get_size() != get_size()) {
            return false;
        }
        long[] jArr3 = this.keys;
        Object[] objArr = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        loop0: while (true) {
            long j15 = jArr4[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        z16 = z17;
                        jArr2 = jArr3;
                        long j16 = jArr2[i18];
                        Object obj = objArr[i18];
                        if (obj == null) {
                            if (wVar.b(j16) != null || !wVar.a(j16)) {
                                break loop0;
                            }
                        } else if (!fr.t.c(obj, wVar.b(j16))) {
                            return false;
                        }
                    } else {
                        z16 = z17;
                        jArr2 = jArr3;
                    }
                    j15 >>= 8;
                    i17++;
                    z17 = z16;
                    jArr3 = jArr2;
                }
                z15 = z17;
                jArr = jArr3;
                if (i16 != 8) {
                    return z15;
                }
            } else {
                z15 = z17;
                jArr = jArr3;
            }
            if (i15 == length) {
                return z15;
            }
            i15++;
            z17 = z15;
            jArr3 = jArr;
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i15 = 0;
        int iHashCode = 0;
        while (true) {
            long j15 = jArr2[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        long j16 = jArr[i18];
                        Object obj = objArr[i18];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j16);
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

    public String toString() {
        int i15;
        int i16;
        if (e()) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('{');
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                long j15 = jArr2[i17];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i17 - length)) >>> 31);
                    int i25 = 0;
                    while (i25 < i19) {
                        if ((255 & j15) < 128) {
                            int i26 = (i17 << 3) + i25;
                            i16 = i17;
                            long j16 = jArr[i26];
                            Object obj = objArr[i26];
                            sb5.append(j16);
                            sb5.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb5.append(obj);
                            i18++;
                            if (i18 < this._size) {
                                sb5.append(',');
                                sb5.append(' ');
                            }
                        } else {
                            i16 = i17;
                        }
                        j15 >>= 8;
                        i25++;
                        i17 = i16;
                    }
                    int i27 = i17;
                    if (i19 != 8) {
                        break;
                    }
                    i15 = i27;
                } else {
                    i15 = i17;
                }
                if (i15 == length) {
                    break;
                }
                i17 = i15 + 1;
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    private w() {
        this.metadata = g1.f169860a;
        this.keys = z.a();
        this.values = s0.a.f176998c;
    }
}
