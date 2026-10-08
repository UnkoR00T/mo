package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static List<io.sentry.e0> a(List<io.sentry.internal.eventprocessor.a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<io.sentry.internal.eventprocessor.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().e());
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
