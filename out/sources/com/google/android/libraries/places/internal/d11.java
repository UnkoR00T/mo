package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class d11 extends c21 {
    d11(ji.g gVar, Locale locale, String str, u41 u41Var) {
        super(gVar, locale, str, u41Var);
    }

    @Override // com.google.android.libraries.places.internal.c21
    public final Map e() {
        String strTrim;
        HashMap map = new HashMap();
        ji.g gVar = (ji.g) a();
        List<String> listK = gVar.k();
        String strH = gVar.h();
        if (strH == null) {
            strTrim = null;
        } else {
            strTrim = strH.trim();
            if (!strTrim.isEmpty() && Character.isWhitespace(strH.charAt(strH.length() - 1))) {
                strTrim = strTrim.concat(" ");
            }
        }
        c21.g(map, "input", strTrim, null);
        if (!listK.isEmpty()) {
            c21.g(map, "types", TextUtils.join("|", listK), null);
        }
        c21.g(map, "sessiontoken", gVar.j(), null);
        c21.g(map, "origin", g31.c(gVar.g()), null);
        c21.g(map, "locationbias", g31.d(gVar.e()), null);
        c21.g(map, "locationrestriction", g31.e(gVar.f()), null);
        List<String> listC = gVar.c();
        StringBuilder sb5 = new StringBuilder();
        for (String str : listC) {
            String strConcat = TextUtils.isEmpty(str) ? null : "country:".concat(String.valueOf(str.toLowerCase(Locale.US)));
            if (strConcat != null) {
                if (sb5.length() != 0) {
                    sb5.append('|');
                }
                sb5.append(strConcat);
            }
        }
        c21.g(map, "components", sb5.length() == 0 ? null : sb5.toString(), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.c21
    protected final String f() {
        return "autocomplete/json";
    }
}
