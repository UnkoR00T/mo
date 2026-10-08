package vp;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {
    h(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    @Override // vp.r
    void j() {
        a aVar = new a(this);
        List<String> listT = t();
        if (listT.isEmpty()) {
            aVar.u("");
        } else {
            aVar.u(listT.get(0));
        }
    }
}
