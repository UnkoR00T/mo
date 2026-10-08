package vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends t {
    g(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    private List<String> u(bp.i iVar) {
        bp.b bVarP4 = D1().p4(iVar);
        if (!(bVarP4 instanceof bp.p)) {
            return bVarP4 instanceof bp.a ? hp.a.e((bp.a) bVarP4) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((bp.p) bVarP4).J3());
        return arrayList;
    }

    public List<String> p() {
        return c.a(D1().p4(bp.i.f20849q6), 0);
    }

    public List<String> q() {
        return c.a(D1().p4(bp.i.f20849q6), 1);
    }

    public List<String> r() {
        return p();
    }

    public List<Integer> s() {
        bp.b bVarP4 = D1().p4(bp.i.f20797l4);
        return bVarP4 != null ? hp.a.g((bp.a) bVarP4) : Collections.EMPTY_LIST;
    }

    public List<String> t() {
        return u(bp.i.f20863r9);
    }
}
