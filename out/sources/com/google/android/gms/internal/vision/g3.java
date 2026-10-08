package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class g3 extends e3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class<?> f31052c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private g3() {
        super();
    }

    private static <L> List<L> e(Object obj, long j15, int i15) {
        List<L> listB;
        List<L> listF = f(obj, j15);
        if (listF.isEmpty()) {
            if (listF instanceof f3) {
                listB = new c3(i15);
            } else {
                listB = ((listF instanceof f4) && (listF instanceof v2)) ? ((v2) listF).b(i15) : new ArrayList<>(i15);
            }
            i5.j(obj, j15, listB);
            return listB;
        }
        if (f31052c.isAssignableFrom(listF.getClass())) {
            ArrayList arrayList = new ArrayList(listF.size() + i15);
            arrayList.addAll(listF);
            i5.j(obj, j15, arrayList);
            return arrayList;
        }
        if (listF instanceof h5) {
            c3 c3Var = new c3(listF.size() + i15);
            c3Var.addAll((h5) listF);
            i5.j(obj, j15, c3Var);
            return c3Var;
        }
        if ((listF instanceof f4) && (listF instanceof v2)) {
            v2 v2Var = (v2) listF;
            if (!v2Var.zza()) {
                v2 v2VarB = v2Var.b(listF.size() + i15);
                i5.j(obj, j15, v2VarB);
                return v2VarB;
            }
        }
        return listF;
    }

    private static <E> List<E> f(Object obj, long j15) {
        return (List) i5.F(obj, j15);
    }

    @Override // com.google.android.gms.internal.vision.e3
    final <E> void b(Object obj, Object obj2, long j15) {
        List listF = f(obj2, j15);
        List listE = e(obj, j15, listF.size());
        int size = listE.size();
        int size2 = listF.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listF);
        }
        if (size > 0) {
            listF = listE;
        }
        i5.j(obj, j15, listF);
    }

    @Override // com.google.android.gms.internal.vision.e3
    final void d(Object obj, long j15) {
        Object objUnmodifiableList;
        List list = (List) i5.F(obj, j15);
        if (list instanceof f3) {
            objUnmodifiableList = ((f3) list).d();
        } else {
            if (f31052c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof f4) && (list instanceof v2)) {
                v2 v2Var = (v2) list;
                if (v2Var.zza()) {
                    v2Var.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        i5.j(obj, j15, objUnmodifiableList);
    }
}
