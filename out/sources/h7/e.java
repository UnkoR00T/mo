package h7;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lh7/e;", "Lh7/b;", "<init>", "()V", "Lh7/g;", "f", "", "ix", "Loq/i0;", "r", "(Lh7/g;I)V", "q", "(Lh7/g;)V", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends b {
    public e() {
        super(null, 1, null);
    }

    private final void r(g f15, int ix4) {
        int i15 = ix4 + 1;
        long jA = f15.a(getPoints()[ix4], getPoints()[i15]);
        getPoints()[ix4] = Float.intBitsToFloat((int) (jA >> 32));
        getPoints()[i15] = Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax));
    }

    public final void q(g f15) {
        r(f15, 0);
        r(f15, 2);
        r(f15, 4);
        r(f15, 6);
    }
}
