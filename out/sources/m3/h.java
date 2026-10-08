package m3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0006\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm3/e;", "offset", "Lm3/k;", "size", "Lm3/g;", "c", "(JJ)Lm3/g;", "topLeft", "bottomRight", "a", "center", "", "radius", "b", "(JF)Lm3/g;", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final g a(long j15, long j16) {
        return new g(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)));
    }

    public static final g b(long j15, float f15) {
        int i15 = (int) (j15 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15) - f15;
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        return new g(fIntBitsToFloat, Float.intBitsToFloat(i16) - f15, Float.intBitsToFloat(i15) + f15, Float.intBitsToFloat(i16) + f15);
    }

    public static final g c(long j15, long j16) {
        int i15 = (int) (j15 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (j15 & BodyPartID.bodyIdMax);
        return new g(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (j16 >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)));
    }
}
