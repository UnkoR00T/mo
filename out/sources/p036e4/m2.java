package p036e4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, d2 = {"Le4/m2;", "", "", "packedValue", "a", "(J)J", "", "b", "(J)F", "getScaleX$annotations", "()V", "scaleX", "c", "getScaleY$annotations", "scaleY", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f47322b = a((((long) Float.floatToRawIntBits(Float.NaN)) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & BodyPartID.bodyIdMax));

    public static long a(long j15) {
        return j15;
    }

    public static final float b(long j15) {
        return Float.intBitsToFloat((int) (j15 >> 32));
    }

    public static final float c(long j15) {
        return Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
    }
}
