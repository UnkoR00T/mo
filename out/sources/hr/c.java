package hr;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "", "c", "(D)I", "", "e", "(D)J", "", "d", "(F)I", "f", "(F)J", "a", "(I)I", "getSign$annotations", "(I)V", "sign", "b", "(J)I", "(J)V", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/math/MathKt")
public class c extends b {
    public static int a(int i15) {
        return Integer.signum(i15);
    }

    public static int b(long j15) {
        return Long.signum(j15);
    }

    public static int c(double d15) {
        if (Double.isNaN(d15)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d15 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d15 < -2.147483648E9d ? PKIFailureInfo.systemUnavail : (int) Math.round(d15);
    }

    public static int d(float f15) {
        if (Float.isNaN(f15)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f15);
    }

    public static long e(double d15) {
        if (Double.isNaN(d15)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d15);
    }

    public static long f(float f15) {
        return e(f15);
    }
}
