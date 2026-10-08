package r0;

import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u0012\u0004\b\u0019\u0010\u0004R$\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\n\u0010\u001c\u0012\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u00020\u001f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0004R\u001c\u0010'\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0004R\u001c\u0010)\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010\u0004R\u0011\u0010*\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0011\u0010+\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u0010\u000e\u0082\u0001\u0001,¨\u0006-"}, d2 = {"Lr0/w0;", "K", "", "<init>", "()V", "", "e", "()Z", "key", "", "b", "(Ljava/lang/Object;)F", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Object;)I", "", "[J", "getMetadata$annotations", "metadata", "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "", "c", "[F", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "size", "Lr0/o0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class w0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public long[] metadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Object[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int _capacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ w0(fr.k kVar) {
        this();
    }

    public final int a(K key) {
        int i15 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 & CertificateBody.profileType;
        int i18 = this._capacity;
        int i19 = i16 >>> 7;
        while (true) {
            int i25 = i19 & i18;
            long[] jArr = this.metadata;
            int i26 = i25 >> 3;
            int i27 = (i25 & 7) << 3;
            long j15 = ((jArr[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr[i26] >>> i27);
            long j16 = (((long) i17) * 72340172838076673L) ^ j15;
            for (long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i25) & i18;
                if (fr.t.c(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i19 = i25 + i15;
        }
    }

    public final float b(K key) {
        int iA = a(key);
        if (iA < 0) {
            s0.d.d("There is no key " + key + " in the map");
        }
        return this.values[iA];
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

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        boolean z15;
        boolean z16 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) other;
        if (w0Var.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = objArr[i18];
                        float f15 = fArr[i18];
                        int iA = w0Var.a(obj);
                        if (iA < 0 || f15 != w0Var.values[iA]) {
                            return false;
                        }
                    }
                    j15 >>= 8;
                    i17++;
                    z16 = z16;
                }
                z15 = z16;
                if (i16 != 8) {
                    return z15;
                }
            } else {
                z15 = z16;
            }
            if (i15 == length) {
                return z15;
            }
            i15++;
            z16 = z15;
        }
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        iHashCode += Float.hashCode(fArr[i18]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
      0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public String toString() {
        if (e()) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append('{');
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                            float f15 = fArr[i19];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb5.append(obj);
                            sb5.append("=");
                            sb5.append(f15);
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

    private w0() {
        this.metadata = g1.f169860a;
        this.keys = s0.a.f176998c;
        this.values = j.a();
    }
}
