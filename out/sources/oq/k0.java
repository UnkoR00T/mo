package oq;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "v1", "v2", "a", "(II)I", "", "b", "(JJ)I", "value", "", "c", "(J)D", "base", "", "d", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class k0 {
    public static final int a(int i15, int i16) {
        return fr.t.d(i15 ^ PKIFailureInfo.systemUnavail, i16 ^ PKIFailureInfo.systemUnavail);
    }

    public static final int b(long j15, long j16) {
        return fr.t.e(j15 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE);
    }

    public static final double c(long j15) {
        return ((j15 >>> 11) * ((double) 2048)) + (j15 & 2047);
    }

    public static final String d(long j15, int i15) {
        if (j15 >= 0) {
            return Long.toString(j15, fu.a.a(i15));
        }
        long j16 = i15;
        long j17 = ((j15 >>> 1) / j16) << 1;
        long j18 = j15 - (j17 * j16);
        if (j18 >= j16) {
            j18 -= j16;
            j17++;
        }
        return Long.toString(j17, fu.a.a(i15)) + Long.toString(j18, fu.a.a(i15));
    }
}
