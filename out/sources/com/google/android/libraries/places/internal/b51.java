package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b51 {
    public static y41 a(Intent intent) {
        return (y41) zj.p.q((y41) intent.getParcelableExtra("places/AutocompleteOptions"));
    }

    public static String b(Context context, int i15) {
        Object objC = e6.e.a(context.getResources().getConfiguration()).c(0);
        if (objC == null) {
            objC = Locale.getDefault();
        }
        Locale localeD = gi.a.b() ? gi.a.e().d() : objC;
        if (localeD.equals(objC)) {
            return context.getString(i15);
        }
        e6.h hVarB = e6.h.b(localeD.toLanguageTag());
        Configuration configuration = context.getResources().getConfiguration();
        e6.e.b(configuration, hVarB);
        return context.createConfigurationContext(configuration).getString(i15);
    }
}
