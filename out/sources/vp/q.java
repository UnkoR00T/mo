package vp;

import io.sentry.android.core.c2;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class q extends r {
    public q(d dVar) {
        super(dVar);
        D1().Y4(bp.i.V3, bp.i.U7);
        tp.m mVar = k().get(0);
        mVar.k(true);
        mVar.m(true);
        h(l());
    }

    private String l() {
        HashSet hashSet = new HashSet();
        Iterator<j> it = b().e().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        int i15 = 1;
        while (true) {
            if (!hashSet.contains("Signature" + i15)) {
                return "Signature" + i15;
            }
            i15++;
        }
    }

    @Override // vp.r
    void j() {
        tp.m mVar = k().get(0);
        if (mVar == null || mVar.f() == null) {
            return;
        }
        if ((mVar.f().c() == 0.0f && mVar.f().h() == 0.0f) || mVar.h() || mVar.g()) {
            return;
        }
        c2.g("PdfBox-Android", "Appearance generation for signature fields not implemented here. You need to generate/update that manually, see the CreateVisibleSignature*.java files in the examples subproject of the source code download");
    }

    public up.c m() {
        return n();
    }

    public up.c n() {
        bp.b bVarP4 = D1().p4(bp.i.f20863r9);
        if (bVarP4 instanceof bp.d) {
            return new up.c((bp.d) bVarP4);
        }
        return null;
    }

    public void o(up.c cVar) {
        D1().Z4(bp.i.f20863r9, cVar);
        i();
    }

    q(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }
}
