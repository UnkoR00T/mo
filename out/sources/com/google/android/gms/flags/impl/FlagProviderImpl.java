package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.DynamiteApi;
import io.sentry.android.core.c2;
import tg.g;
import ug.b;
import ug.d;
import ug.f;
import ug.h;
import ug.j;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class FlagProviderImpl extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29098d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f29099e;

    @Override // tg.f
    public boolean getBooleanFlagValue(String str, boolean z15, int i15) {
        return !this.f29098d ? z15 : b.a(this.f29099e, str, Boolean.valueOf(z15)).booleanValue();
    }

    @Override // tg.f
    public int getIntFlagValue(String str, int i15, int i16) {
        return !this.f29098d ? i15 : d.a(this.f29099e, str, Integer.valueOf(i15)).intValue();
    }

    @Override // tg.f
    public long getLongFlagValue(String str, long j15, int i15) {
        return !this.f29098d ? j15 : f.a(this.f29099e, str, Long.valueOf(j15)).longValue();
    }

    @Override // tg.f
    public String getStringFlagValue(String str, String str2, int i15) {
        return !this.f29098d ? str2 : h.a(this.f29099e, str, str2);
    }

    @Override // tg.f
    public void init(rg.b bVar) {
        Context context = (Context) rg.d.n3(bVar);
        if (this.f29098d) {
            return;
        }
        try {
            this.f29099e = j.a(context.createPackageContext("com.google.android.gms", 0));
            this.f29098d = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e15) {
            String strValueOf = String.valueOf(e15.getMessage());
            c2.g("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
