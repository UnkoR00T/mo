package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class ow0 {
    public static hg.b a(vd.u uVar) {
        int i15;
        if (uVar instanceof vd.j) {
            i15 = 7;
        } else if (uVar instanceof vd.t) {
            i15 = 15;
        } else if ((uVar instanceof vd.s) || (uVar instanceof vd.m)) {
            i15 = 8;
        } else {
            i15 = uVar instanceof vd.a ? 9011 : 13;
        }
        vd.k kVar = uVar.f206221a;
        return new hg.b(new Status(i15, String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", kVar == null ? "N/A" : String.valueOf(kVar.f206176a), uVar)));
    }

    static hg.b b(p90 p90Var) {
        l90 l90VarB = l90.b(p90Var);
        i90 i90Var = i90.OK;
        int iOrdinal = l90VarB.g().ordinal();
        if (iOrdinal == 3) {
            return new hg.b(new Status(9012, l90VarB.h()));
        }
        if (iOrdinal == 4) {
            return new hg.b(new Status(15, l90VarB.h()));
        }
        if (iOrdinal == 5) {
            return new hg.b(new Status(9013, l90VarB.h()));
        }
        if (iOrdinal == 7) {
            return new hg.b(new Status(9011, l90VarB.h()));
        }
        if (iOrdinal != 13) {
            return iOrdinal != 14 ? new hg.b(new Status(13, l90VarB.h())) : new hg.b(new Status(7, l90VarB.h()));
        }
        return new hg.b(new Status(8, l90VarB.h()));
    }
}
