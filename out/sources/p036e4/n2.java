package p036e4;

import m3.k;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm3/k;", "Le4/m2;", "scaleFactor", "a", "(JJ)J", "size", "b", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n2 {
    public static final long a(long j15, long j16) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) * Float.intBitsToFloat((int) (j16 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) * Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax));
        return k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    public static final long b(long j15, long j16) {
        return a(j16, j15);
    }
}
