package com.google.android.libraries.places.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33852a;

    public u41(Context context) {
        zj.p.r(context, "Context must not be null.");
        this.f33852a = context;
    }

    public final ak.p0 a() {
        Context context = this.f33852a;
        String packageName = context.getPackageName();
        String strA = d41.a(context.getPackageManager(), packageName);
        ak.p0.a aVarA = ak.p0.a();
        if (packageName != null) {
            aVarA.g("X-Android-Package", packageName);
        }
        if (strA != null) {
            aVarA.g("X-Android-Cert", strA);
        }
        return aVarA.d();
    }
}
