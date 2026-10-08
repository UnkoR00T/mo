package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "x", "y", "Lc5/n;", "a", "(II)J", "Lm3/e;", "offset", "c", "(JJ)J", "b", "d", "(J)J", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final long a(int i15, int i16) {
        return n.d((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
    }

    public static final long b(long j15, long j16) {
        return m3.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 >> 32)) - n.i(j16))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - n.j(j16))) & BodyPartID.bodyIdMax));
    }

    public static final long c(long j15, long j16) {
        return m3.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 >> 32)) + n.i(j16))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) + n.j(j16))) & BodyPartID.bodyIdMax));
    }

    public static final long d(long j15) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j15 >> 32)));
        return n.d((((long) Math.round(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iRound) << 32));
    }
}
