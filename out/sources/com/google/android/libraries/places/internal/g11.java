package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g11 {
    g11() {
    }

    public static final ji.h a(f11 f11Var) throws hg.b {
        int iA = f31.a(f11Var.f32244a);
        if (ji.o.b(iA)) {
            throw new hg.b(new Status(iA, f31.b(f11Var.f32244a, f11Var.f32245b)));
        }
        ArrayList arrayList = new ArrayList();
        t01[] t01VarArr = f11Var.f32246c;
        if (t01VarArr != null) {
            for (t01 t01Var : t01VarArr) {
                if (t01Var == null || TextUtils.isEmpty(t01Var.c())) {
                    throw new hg.b(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                }
                ii.h.a aVarA = ii.h.a(t01Var.c());
                aVarA.b(t01Var.b());
                aVarA.f(q21.e(q21.c(t01Var.e())));
                aVarA.c(zj.v.e(t01Var.a()));
                aVarA.h(b(t01Var.f()));
                r01 r01VarD = t01Var.d();
                if (r01VarD != null) {
                    aVarA.d(zj.v.e(r01VarD.a()));
                    aVarA.i(b(r01VarD.c()));
                    aVarA.e(zj.v.e(r01VarD.b()));
                    aVarA.j(b(r01VarD.d()));
                }
                arrayList.add(aVarA.a());
            }
        }
        return ji.h.b(arrayList);
    }

    private static List b(List list) throws hg.b {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s01 s01Var = (s01) it.next();
            Status status = new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (s01Var == null) {
                throw new hg.b(status);
            }
            Integer num = s01Var.f33643a;
            Integer num2 = s01Var.f33644b;
            if (num == null || num2 == null) {
                throw new hg.b(status);
            }
            ii.t6 t6VarC = ii.u6.c();
            t6VarC.a(num.intValue());
            t6VarC.b(num2.intValue());
            arrayList.add(t6VarC.c());
        }
        return arrayList;
    }
}
