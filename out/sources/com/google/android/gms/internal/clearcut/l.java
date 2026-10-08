package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
final class l extends f<String> {
    l(p pVar, String str, String str2) {
        super(pVar, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f29306b, null);
        } catch (ClassCastException e15) {
            String strValueOf = String.valueOf(this.f29306b);
            io.sentry.android.core.c2.f("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(strValueOf) : new String("Invalid string value in SharedPreferences for "), e15);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.f
    protected final /* synthetic */ String m(String str) {
        return str;
    }
}
