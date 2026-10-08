package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class m extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f29408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f29409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f29410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ o f29411p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, String str, Object obj, o oVar) {
        super(pVar, str, obj, null);
        this.f29411p = oVar;
        this.f29408m = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.f
    protected final Object f(SharedPreferences sharedPreferences) {
        try {
            return m(sharedPreferences.getString(this.f29306b, ""));
        } catch (ClassCastException e15) {
            String strValueOf = String.valueOf(this.f29306b);
            io.sentry.android.core.c2.f("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(strValueOf) : new String("Invalid byte[] value in SharedPreferences for "), e15);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.f
    protected final Object m(String str) {
        Object obj;
        try {
            synchronized (this.f29408m) {
                try {
                    if (!str.equals(this.f29409n)) {
                        Object objA = this.f29411p.a(Base64.decode(str, 3));
                        this.f29409n = str;
                        this.f29410o = objA;
                    }
                    obj = this.f29410o;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f29306b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb5.append("Invalid byte[] value for ");
            sb5.append(str2);
            sb5.append(": ");
            sb5.append(str);
            io.sentry.android.core.c2.e("PhenotypeFlag", sb5.toString());
            return null;
        }
    }
}
