package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {
    public b() {
    }

    public List<String> m() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<bp.i, bp.b>> it = D1().entrySet().iterator();
        while (it.hasNext()) {
            bp.i key = it.next().getKey();
            if (!bp.i.Y5.equals(key)) {
                arrayList.add(key.A3());
            }
        }
        return arrayList;
    }

    public bp.b n(String str) {
        return D1().r4(str);
    }

    protected bp.b o(String str, bp.b bVar) {
        bp.b bVarR4 = D1().r4(str);
        return bVarR4 == null ? bVar : bVarR4;
    }

    public void p(String str, bp.b bVar) {
        bp.b bVarN = n(str);
        D1().Y4(bp.i.J3(str), bVar);
        j(bVarN, bVar);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        sb5.append(", attributes={");
        Iterator<String> it = m().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb5.append(next);
            sb5.append('=');
            sb5.append(n(next));
            if (it.hasNext()) {
                sb5.append(", ");
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    public b(bp.d dVar) {
        super(dVar);
    }
}
