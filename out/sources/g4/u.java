package g4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "distance", "", "isInLayer", "isInExpandedBounds", "Lg4/o;", "a", "(FZZ)J", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f15, boolean z15, boolean z16) {
        return o.b((((z15 ? 1L : 0L) | (z16 ? 2L : 0L)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f15)) << 32));
    }

    static /* synthetic */ long b(float f15, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return a(f15, z15, z16);
    }
}
