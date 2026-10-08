package v4;

import p071kotlin.Metadata;
import q4.a4;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq4/z3;", "target", "deleted", "a", "(JJ)J", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final long a(long j15, long j16) {
        int iJ;
        int iL = z3.l(j15);
        int iK = z3.k(j15);
        if (z3.p(j16, j15)) {
            if (z3.d(j16, j15)) {
                iL = z3.l(j16);
                iK = iL;
            } else {
                if (z3.d(j15, j16)) {
                    iJ = z3.j(j16);
                } else if (z3.e(j16, iL)) {
                    iL = z3.l(j16);
                    iJ = z3.j(j16);
                } else {
                    iK = z3.l(j16);
                }
                iK -= iJ;
            }
        } else if (iK > z3.l(j16)) {
            iL -= z3.j(j16);
            iJ = z3.j(j16);
            iK -= iJ;
        }
        return a4.b(iL, iK);
    }
}
