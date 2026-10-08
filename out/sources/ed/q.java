package ed;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u000e"}, d2 = {"Led/q;", "", "", "first", "second", "a", "(II)J", "", "value", "b", "(J)J", "c", "(J)I", "d", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static long a(int i15, int i16) {
        return b((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
    }

    private static long b(long j15) {
        return j15;
    }

    public static final int c(long j15) {
        return (int) (j15 >> 32);
    }

    public static final int d(long j15) {
        return (int) (j15 & BodyPartID.bodyIdMax);
    }
}
