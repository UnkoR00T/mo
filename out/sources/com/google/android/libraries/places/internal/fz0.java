package com.google.android.libraries.places.internal;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class fz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32353a;

    public fz0(Context context) {
        this.f32353a = context;
    }

    private final void c(a80 a80Var) {
        Context context = this.f32353a;
        String strA = d41.a(context.getPackageManager(), context.getPackageName());
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        v70 v70Var = a80.f31574d;
        a80Var.c(w70.c("X-Android-Package", v70Var), context.getPackageName());
        a80Var.c(w70.c("X-Places-Android-Sdk", v70Var), "5.2.0");
        a80Var.c(w70.c("X-Android-Cert", v70Var), strA);
    }

    private static final void d(a80 a80Var, String str) {
        if (str.isEmpty()) {
            return;
        }
        a80Var.c(w70.c("X-Goog-FieldMask", a80.f31574d), str);
    }

    public final a80 a(String str, String str2) {
        a80 a80Var = new a80();
        a80Var.c(w70.c("X-Goog-Api-Key", a80.f31574d), str);
        c(a80Var);
        d(a80Var, str2);
        return a80Var;
    }

    public final a80 b(String str, String str2) {
        a80 a80Var = new a80();
        a80Var.c(w70.c("Authorization", a80.f31574d), "Bearer ".concat(String.valueOf(str)));
        d(a80Var, str2);
        c(a80Var);
        return a80Var;
    }
}
