package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36983c = "UserProperties";

    public j() {
        k(f36983c);
    }

    public void m(k kVar) {
        ((bp.a) D1().p4(bp.i.A6)).J3(kVar);
        i();
    }

    public List<k> n() {
        bp.a aVar = (bp.a) D1().p4(bp.i.A6);
        ArrayList arrayList = new ArrayList(aVar.size());
        for (int i15 = 0; i15 < aVar.size(); i15++) {
            arrayList.add(new k((bp.d) aVar.k4(i15), this));
        }
        return arrayList;
    }

    public void o(k kVar) {
        if (kVar == null) {
            return;
        }
        ((bp.a) D1().p4(bp.i.A6)).n4(kVar.D1());
        i();
    }

    public void p(List<k> list) {
        bp.a aVar = new bp.a();
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            aVar.J3(it.next());
        }
        D1().Y4(bp.i.A6, aVar);
    }

    public void q(k kVar) {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        return super.toString() + ", userProperties=" + n();
    }

    public j(bp.d dVar) {
        super(dVar);
    }
}
