package r2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0003\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001c\u0010\u000b\u001a\u00020\u0000*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001c\u0010\u0004\u001a\u00020\u0000*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n*\f\b\u0000\u0010\r\"\u00020\u00052\u00020\u0005¨\u0006\u000e"}, d2 = {"", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "parent", "predecessor", "group", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "c", "(III)J", "a", "(J)I", "context", "b", "GroupHandle", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final int a(long j15) {
        return (int) (j15 >>> 32);
    }

    public static final int b(long j15) {
        return (int) j15;
    }

    public static final long c(int i15, int i16, int i17) {
        long j15;
        int iE;
        if (i17 >= 0) {
            j15 = ((long) i16) << 32;
            iE = oq.b0.e(i17);
        } else {
            j15 = ((long) i15) << 32;
            iE = oq.b0.e(-1);
        }
        return j15 | (BodyPartID.bodyIdMax & ((long) iE));
    }
}
