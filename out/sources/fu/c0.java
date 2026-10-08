package fu;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "", "u", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "v", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "w", "(Ljava/lang/String;)Ljava/lang/Long;", "x", "(Ljava/lang/String;I)Ljava/lang/Long;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class c0 extends b0 {
    public static Integer u(String str) {
        return v(str, 10);
    }

    public static final Integer v(String str, int i15) {
        boolean z15;
        int i16;
        int i17;
        b.a(i15);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        char cCharAt = str.charAt(0);
        int i19 = -2147483647;
        if (fr.t.d(cCharAt, 48) < 0) {
            i16 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z15 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i19 = PKIFailureInfo.systemUnavail;
                z15 = true;
            }
        } else {
            z15 = false;
            i16 = 0;
        }
        int i25 = -59652323;
        while (i16 < length) {
            int iB = b.b(str.charAt(i16), i15);
            if (iB < 0) {
                return null;
            }
            if ((i18 < i25 && (i25 != -59652323 || i18 < (i25 = i19 / i15))) || (i17 = i18 * i15) < i19 + iB) {
                return null;
            }
            i18 = i17 - iB;
            i16++;
        }
        return z15 ? Integer.valueOf(i18) : Integer.valueOf(-i18);
    }

    public static Long w(String str) {
        return x(str, 10);
    }

    public static final Long x(String str, int i15) {
        boolean z15;
        b.a(i15);
        int length = str.length();
        Long l15 = null;
        if (length == 0) {
            return null;
        }
        int i16 = 0;
        char cCharAt = str.charAt(0);
        long j15 = -9223372036854775807L;
        if (fr.t.d(cCharAt, 48) < 0) {
            z15 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z15 = false;
                i16 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j15 = Long.MIN_VALUE;
                i16 = 1;
            }
        } else {
            z15 = false;
        }
        long j16 = 0;
        long j17 = -256204778801521550L;
        while (i16 < length) {
            int iB = b.b(str.charAt(i16), i15);
            if (iB < 0) {
                return l15;
            }
            if (j16 < j17) {
                if (j17 != -256204778801521550L) {
                    return l15;
                }
                j17 = j15 / ((long) i15);
                if (j16 < j17) {
                    return l15;
                }
            }
            Long l16 = l15;
            int i17 = i16;
            long j18 = j16 * ((long) i15);
            long j19 = iB;
            if (j18 < j15 + j19) {
                return l16;
            }
            j16 = j18 - j19;
            i16 = i17 + 1;
            l15 = l16;
        }
        return z15 ? Long.valueOf(j16) : Long.valueOf(-j16);
    }
}
