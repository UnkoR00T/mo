package vp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends r {
    e(d dVar, bp.d dVar2, n nVar) {
        super(dVar, dVar2, nVar);
    }

    private String m(int i15) {
        List<tp.m> listK = k();
        return i15 < listK.size() ? n(listK.get(i15)) : "";
    }

    private String n(tp.m mVar) {
        tp.p pVarB;
        tp.o oVarB = mVar.b();
        if (oVarB == null || (pVarB = oVarB.b()) == null) {
            return "";
        }
        for (bp.i iVar : pVarB.b().keySet()) {
            if (bp.i.f20779j6.compareTo(iVar) != 0) {
                return iVar.A3();
            }
        }
        return "";
    }

    private void p(String str) {
        List<tp.m> listK = k();
        List<String> listL = l();
        if (listK.size() != listL.size()) {
            throw new IllegalArgumentException("The number of options doesn't match the number of widgets");
        }
        if (str.equals(bp.i.f20779j6.A3())) {
            q(str);
            return;
        }
        int iIndexOf = listL.indexOf(str);
        if (iIndexOf != -1) {
            q(m(iIndexOf));
        }
    }

    private void q(String str) {
        D1().d5(bp.i.f20863r9, str);
        for (tp.m mVar : k()) {
            if (mVar.b() != null) {
                if (((bp.d) mVar.b().b().D1()).N3(str)) {
                    mVar.j(str);
                } else {
                    mVar.j(bp.i.f20779j6.A3());
                }
            }
        }
    }

    @Override // vp.r
    void j() {
        List<String> listL = l();
        if (listL.size() <= 0) {
            q(o());
            return;
        }
        try {
            int i15 = Integer.parseInt(o());
            if (i15 < listL.size()) {
                p(listL.get(i15));
            }
        } catch (NumberFormatException unused) {
        }
    }

    public List<String> l() {
        bp.b bVarF = f(bp.i.f20849q6);
        if (!(bVarF instanceof bp.p)) {
            return bVarF instanceof bp.a ? hp.a.e((bp.a) bVarF) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((bp.p) bVarF).J3());
        return arrayList;
    }

    public String o() {
        bp.b bVarF = f(bp.i.f20863r9);
        if (!(bVarF instanceof bp.i)) {
            return "Off";
        }
        String strA3 = ((bp.i) bVarF).A3();
        List<String> listL = l();
        if (!listL.isEmpty()) {
            try {
                int i15 = Integer.parseInt(strA3, 10);
                if (i15 >= 0 && i15 < listL.size()) {
                    return listL.get(i15);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return strA3;
    }
}
