package j3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj3/c;", "Lm3/e;", "a", "(Lj3/c;)J", "positionInRoot", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final long a(c cVar) {
        float x15 = cVar.getDragEvent().getX();
        float y15 = cVar.getDragEvent().getY();
        return m3.e.e((((long) Float.floatToRawIntBits(x15)) << 32) | (((long) Float.floatToRawIntBits(y15)) & BodyPartID.bodyIdMax));
    }
}
