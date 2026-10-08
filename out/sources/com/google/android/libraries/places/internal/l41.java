package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l41 {
    public static j41 d(Context context) {
        String packageName = context.getPackageName();
        int i15 = 0;
        try {
            i15 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        h41 h41Var = new h41();
        h41Var.e(packageName);
        h41Var.a(i15);
        h41Var.b(k41.PROGRAMMATIC_API);
        return h41Var;
    }

    public abstract String a();

    public abstract int b();

    public abstract k41 c();
}
