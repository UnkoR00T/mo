package s2;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls2/h;", "", "Landroidx/compose/runtime/composer/linkbuffer/changelist/IntParameter;", "highBitsParam", "lowBitsParam", "", "a", "(Ls2/h;II)J", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final long a(h hVar, int i15, int i16) {
        return (((long) hVar.getInt(i15)) << 32) | (((long) hVar.getInt(i16)) & BodyPartID.bodyIdMax);
    }
}
