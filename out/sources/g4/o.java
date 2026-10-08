package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lg4/o;", "", "", "packedValue", "b", "(J)J", "other", "", "a", "(JJ)I", "", "c", "(J)F", "distance", "", "e", "(J)Z", "isInLayer", "d", "isInExpandedBounds", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final int a(long j15, long j16) {
        boolean zE = e(j15);
        if (zE != e(j16)) {
            return zE ? -1 : 1;
        }
        int iSignum = (int) Math.signum(c(j15) - c(j16));
        if (Math.min(c(j15), c(j16)) >= 0.0f && d(j15) != d(j16)) {
            return d(j15) ? -1 : 1;
        }
        return iSignum;
    }

    public static long b(long j15) {
        return j15;
    }

    public static final float c(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static final boolean d(long j15) {
        return (j15 & 2) != 0;
    }

    public static final boolean e(long j15) {
        return (j15 & 1) != 0;
    }
}
