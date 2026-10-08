package fu;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Loq/z;", "", "radix", "", "a", "(BI)Ljava/lang/String;", "Loq/b0;", "b", "(II)Ljava/lang/String;", "Loq/d0;", "c", "(Ljava/lang/String;)Loq/d0;", "d", "(Ljava/lang/String;I)Loq/d0;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class k0 {
    public static final String a(byte b15, int i15) {
        return Integer.toString(b15 & 255, b.a(i15));
    }

    public static final String b(int i15, int i16) {
        return oq.k0.d(((long) i15) & BodyPartID.bodyIdMax, b.a(i16));
    }

    public static final oq.d0 c(String str) {
        return d(str, 10);
    }

    public static final oq.d0 d(String str, int i15) {
        b.a(i15);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i16 = 0;
        char cCharAt = str.charAt(0);
        if (fr.t.d(cCharAt, 48) < 0) {
            i16 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jE = oq.d0.e(i15);
        long j15 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i16 < length) {
            int iB = b.b(str.charAt(i16), i15);
            if (iB < 0) {
                return null;
            }
            if (Long.compareUnsigned(j15, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jE);
                    if (Long.compareUnsigned(j15, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jE2 = oq.d0.e(j15 * jE);
            long jE3 = oq.d0.e(oq.d0.e(((long) oq.b0.e(iB)) & BodyPartID.bodyIdMax) + jE2);
            if (Long.compareUnsigned(jE3, jE2) < 0) {
                return null;
            }
            i16++;
            j15 = jE3;
        }
        return oq.d0.b(j15);
    }
}
