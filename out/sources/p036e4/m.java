package p036e4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lm3/k;", "srcSize", "dstSize", "", "c", "(JJ)F", "d", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(long j15, long j16) {
        return Math.max(Float.intBitsToFloat((int) (j16 >> 32)) / Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(long j15, long j16) {
        return Math.min(Float.intBitsToFloat((int) (j16 >> 32)) / Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)));
    }
}
