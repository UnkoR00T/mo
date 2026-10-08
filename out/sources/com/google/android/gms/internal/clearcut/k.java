package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
final class k extends f<Boolean> {
    k(p pVar, String str, Boolean bool) {
        super(pVar, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f29306b, false));
        } catch (ClassCastException e15) {
            String strValueOf = String.valueOf(this.f29306b);
            io.sentry.android.core.c2.f("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(strValueOf) : new String("Invalid boolean value in SharedPreferences for "), e15);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.f
    protected final /* synthetic */ Boolean m(String str) {
        if (z5.f29627c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (z5.f29628d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f29306b;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb5.append("Invalid boolean value for ");
        sb5.append(str2);
        sb5.append(": ");
        sb5.append(str);
        io.sentry.android.core.c2.e("PhenotypeFlag", sb5.toString());
        return null;
    }
}
