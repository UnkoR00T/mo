package ws;

import java.util.ArrayList;
import java.util.List;
import pq.v;
import us.r;
import us.u;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<r> f214756a;

    public h(u uVar) {
        List<r> listE = uVar.E();
        if (uVar.F()) {
            int iB = uVar.B();
            List<r> listE2 = uVar.E();
            ArrayList arrayList = new ArrayList(v.y(listE2, 10));
            int i15 = 0;
            for (Object obj : listE2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                r rVarZ = (r) obj;
                if (i15 >= iB) {
                    rVarZ = rVarZ.b().U(true).build();
                }
                arrayList.add(rVarZ);
                i15 = i16;
            }
            listE = arrayList;
        }
        this.f214756a = listE;
    }

    public final r a(int i15) {
        return this.f214756a.get(i15);
    }
}
