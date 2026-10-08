package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o40 {
    public static g40 a(g40 g40Var, List list) {
        zj.p.r(g40Var, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g40Var = new n40(g40Var, (m40) it.next(), null);
        }
        return g40Var;
    }
}
