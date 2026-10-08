package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yx0 {
    public static String a(List list, List list2) {
        return c(list, true, list2);
    }

    public static String b(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return c(arrayList, false, new ArrayList());
    }

    private static String c(List list, boolean z15, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strConcat = (String) it.next();
            if (z15) {
                strConcat = "places.".concat(String.valueOf(strConcat));
            }
            arrayList.add(strConcat);
        }
        if (!list.contains("attributions")) {
            arrayList.add(true == z15 ? "places.attributions" : "attributions");
        }
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList.add(((xx0) it4.next()).toString());
        }
        return zj.i.h(",").e(arrayList);
    }
}
