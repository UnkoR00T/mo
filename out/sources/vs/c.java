package vs;

import bt.g;
import java.io.InputStream;
import oq.r;
import oq.y;
import us.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final r<n, a> a(InputStream inputStream) {
        n nVarD0;
        try {
            a aVarA = a.f208222g.a(inputStream);
            if (aVarA.h()) {
                g gVarD = g.d();
                b.a(gVarD);
                nVarD0 = n.d0(inputStream, gVarD);
            } else {
                nVarD0 = null;
            }
            r<n, a> rVarA = y.a(nVarD0, aVarA);
            ar.b.a(inputStream, null);
            return rVarA;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(inputStream, th4);
                throw th5;
            }
        }
    }
}
