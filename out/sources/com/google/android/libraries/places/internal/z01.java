package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class z01 extends c21 {
    z01(ji.c cVar, Locale locale, String str, u41 u41Var) {
        super(cVar, locale, str, u41Var);
    }

    @Override // com.google.android.libraries.places.internal.c21
    public final Map e() {
        ji.c cVar = (ji.c) a();
        HashMap map = new HashMap();
        c21.g(map, "placeid", cVar.d(), null);
        c21.g(map, "sessiontoken", cVar.f(), null);
        c21.g(map, "fields", h31.b(cVar.c()), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.c21
    protected final String f() {
        return "details/json";
    }
}
