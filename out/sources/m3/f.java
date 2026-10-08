package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "x", "y", "Lm3/e;", "a", "(FF)J", "start", "stop", "fraction", "b", "(JJF)J", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final long a(float f15, float f16) {
        return e.e((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public static final long b(long j15, long j16, float f15) {
        float fB = e5.c.b(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j16 >> 32)), f15);
        float fB2 = e5.c.b(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)), f15);
        return e.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & BodyPartID.bodyIdMax));
    }
}
