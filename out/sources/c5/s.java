package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\b\"\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"", "width", "height", "Lc5/r;", "a", "(II)J", "Lm3/k;", "e", "(J)J", "d", "c", "Lc5/n;", "b", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    public static final long a(int i15, int i16) {
        return r.c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
    }

    public static final long b(long j15) {
        return n.d((((j15 << 32) >> 33) & BodyPartID.bodyIdMax) | ((j15 >> 33) << 32));
    }

    public static final long c(long j15) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j15 >> 32)));
        return r.c((((long) Math.round(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iRound) << 32));
    }

    public static final long d(long j15) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j15 >> 32));
        return r.c((((long) ((int) Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) iIntBitsToFloat) << 32));
    }

    public static final long e(long j15) {
        float f15 = (int) (j15 >> 32);
        return m3.k.d((((long) Float.floatToRawIntBits((int) (j15 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }
}
