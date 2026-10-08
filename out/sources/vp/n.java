package vp;

import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n extends j {
    n(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    public List<j> i() {
        ArrayList arrayList = new ArrayList();
        bp.a aVarJ4 = D1().j4(bp.i.Q4);
        if (aVarJ4 != null) {
            for (int i15 = 0; i15 < aVarJ4.size(); i15++) {
                bp.b bVarK4 = aVarJ4.k4(i15);
                if (bVarK4 instanceof bp.d) {
                    if (bVarK4.D1() == D1()) {
                        c2.g("PdfBox-Android", "Child field is same object as parent");
                    } else {
                        j jVarA = j.a(b(), (bp.d) bVarK4, this);
                        if (jVarA != null) {
                            arrayList.add(jVarA);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
