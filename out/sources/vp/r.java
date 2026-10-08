package vp;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends j {
    protected r(d dVar) {
        super(dVar);
    }

    protected final void i() {
        if (b().g()) {
            return;
        }
        j();
    }

    abstract void j();

    public List<tp.m> k() {
        ArrayList arrayList = new ArrayList();
        bp.a aVar = (bp.a) D1().p4(bp.i.Q4);
        if (aVar == null) {
            arrayList.add(new tp.m(D1()));
            return arrayList;
        }
        if (aVar.size() > 0) {
            for (int i15 = 0; i15 < aVar.size(); i15++) {
                bp.b bVarK4 = aVar.k4(i15);
                if (bVarK4 instanceof bp.d) {
                    arrayList.add(new tp.m((bp.d) bVarK4));
                }
            }
        }
        return arrayList;
    }

    r(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }
}
