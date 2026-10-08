package y3;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0001\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "nativeKeyCode", "Ly3/a;", "a", "(I)J", "b", "(J)I", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final long a(int i15) {
        return a.P((((long) i15) << 32) | (((long) 0) & BodyPartID.bodyIdMax));
    }

    public static final int b(long j15) {
        return (int) (j15 >> 32);
    }
}
