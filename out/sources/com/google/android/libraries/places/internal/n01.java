package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class n01 {
    n01() {
    }

    static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rr rrVar = (rr) it.next();
            int I = rrVar.I();
            int iJ = rrVar.J() - rrVar.I();
            ii.t6 t6VarC = ii.u6.c();
            t6VarC.a(I);
            t6VarC.b(iJ);
            arrayList.add(t6VarC.c());
        }
        return arrayList;
    }
}
