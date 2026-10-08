package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class x1 extends v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f29591c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private x1() {
        super();
    }

    private static <E> List<E> e(Object obj, long j15) {
        return (List) b4.M(obj, j15);
    }

    @Override // com.google.android.gms.internal.clearcut.v1
    final void a(Object obj, long j15) {
        Object objUnmodifiableList;
        List list = (List) b4.M(obj, j15);
        if (list instanceof u1) {
            objUnmodifiableList = ((u1) list).Q3();
        } else if (f29591c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        b4.i(obj, j15, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.clearcut.v1
    final <E> void b(Object obj, Object obj2, long j15) {
        List list;
        List list2;
        List listE = e(obj2, j15);
        int size = listE.size();
        List listE2 = e(obj, j15);
        if (listE2.isEmpty()) {
            List t1Var = listE2 instanceof u1 ? new t1(size) : new ArrayList(size);
            b4.i(obj, j15, t1Var);
            list2 = t1Var;
        } else {
            if (f29591c.isAssignableFrom(listE2.getClass())) {
                ArrayList arrayList = new ArrayList(listE2.size() + size);
                arrayList.addAll(listE2);
                list = arrayList;
            } else if (listE2 instanceof y3) {
                list2 = listE2;
                t1 t1Var2 = new t1(listE2.size() + size);
                t1Var2.addAll((y3) listE2);
                list = t1Var2;
            }
            b4.i(obj, j15, list);
            list2 = list;
        }
        list2 = listE2;
        int size2 = list2.size();
        int size3 = listE.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listE);
        }
        if (size2 > 0) {
            listE = list2;
        }
        b4.i(obj, j15, listE);
    }
}
