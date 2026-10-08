package g1;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p143z0.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg1/d0;", "", "a", "(Lg1/d0;)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final int a(d0 d0Var) {
        boolean z15 = d0Var.a() == a2.Vertical;
        List<m> listJ = d0Var.j();
        if (listJ.isEmpty()) {
            return 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < listJ.size()) {
            int iB = b(z15, d0Var, i15);
            if (iB == -1) {
                i15++;
            } else {
                int iMax = 0;
                while (i15 < listJ.size() && b(z15, d0Var, i15) == iB) {
                    iMax = Math.max(iMax, (int) (z15 ? listJ.get(i15).b() & BodyPartID.bodyIdMax : listJ.get(i15).b() >> 32));
                    i15++;
                }
                i16 += iMax;
                i17++;
            }
        }
        return (i16 / i17) + d0Var.h();
    }

    private static final int b(boolean z15, d0 d0Var, int i15) {
        return z15 ? d0Var.j().get(i15).g() : d0Var.j().get(i15).i();
    }
}
