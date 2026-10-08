package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"", "width", "height", "Lm3/k;", "a", "(FF)J", "Lm3/g;", "c", "(J)Lm3/g;", "Lm3/e;", "b", "(J)J", "getCenter-uvyYCjk$annotations", "(J)V", "center", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final long a(float f15, float f16) {
        return k.d((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public static final long b(long j15) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) / 2.0f;
        return e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) / 2.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final g c(long j15) {
        return h.c(e.INSTANCE.c(), j15);
    }
}
