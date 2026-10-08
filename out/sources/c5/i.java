package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc5/h;", "start", "stop", "", "fraction", "b", "(FFF)F", "Lc5/j;", "c", "(JJF)J", "width", "height", "Lc5/k;", "a", "(FF)J", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final long a(float f15, float f16) {
        return k.d((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32));
    }

    public static final float b(float f15, float f16, float f17) {
        return h.n(e5.c.b(f15, f16, f17));
    }

    public static final long c(long j15, long j16, float f15) {
        float fB = e5.c.b(j.f(j15), j.f(j16), f15);
        float fB2 = e5.c.b(j.g(j15), j.g(j16), f15);
        return j.c((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & BodyPartID.bodyIdMax));
    }
}
