package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class u01 extends c21 {
    u01(ji.a aVar, String str, u41 u41Var) {
        super(aVar, null, str, u41Var);
    }

    @Override // com.google.android.libraries.places.internal.c21
    public final Map e() {
        ji.a aVar = (ji.a) a();
        ii.k0 k0VarE = aVar.e();
        HashMap map = new HashMap();
        c21.g(map, "maxheight", aVar.c(), null);
        c21.g(map, "maxwidth", aVar.d(), null);
        map.put("photoreference", k0VarE.h());
        return map;
    }

    @Override // com.google.android.libraries.places.internal.c21
    protected final String f() {
        return "photo";
    }
}
