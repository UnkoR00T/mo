package p079n1;

import m3.e;
import m3.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm3/e;", "Lm3/g;", "rect", "b", "(JLm3/g;)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j15, g gVar) {
        float right;
        float bottom;
        int i15 = (int) (j15 >> 32);
        if (Float.intBitsToFloat(i15) < gVar.getLeft()) {
            right = gVar.getLeft();
        } else {
            right = Float.intBitsToFloat(i15) > gVar.getRight() ? gVar.getRight() : Float.intBitsToFloat(i15);
        }
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i16) < gVar.getTop()) {
            bottom = gVar.getTop();
        } else {
            bottom = Float.intBitsToFloat(i16) > gVar.getBottom() ? gVar.getBottom() : Float.intBitsToFloat(i16);
        }
        return e.e((((long) Float.floatToRawIntBits(right)) << 32) | (((long) Float.floatToRawIntBits(bottom)) & BodyPartID.bodyIdMax));
    }
}
