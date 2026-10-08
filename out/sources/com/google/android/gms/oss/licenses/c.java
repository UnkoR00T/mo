package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.oss_licenses.h4;
import com.google.android.gms.internal.oss_licenses.j4;
import io.sentry.android.core.c2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f31434c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f31435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f31436b;

    private c(Context context) {
        this.f31436b = context.getApplicationContext();
    }

    public static c a(Context context) {
        if (f31434c == null) {
            c cVar = new c(context);
            f31434c = cVar;
            cVar.f31435a = new i(cVar.f31436b);
        }
        return f31434c;
    }

    public static b b(Context context, String str) {
        try {
            return new b(context.getPackageManager().getResourcesForApplication(str), str, null);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 52);
            sb5.append("Unable to get resources for ");
            sb5.append(str);
            sb5.append(", using local resources.");
            c2.g("OssLicenses", sb5.toString());
            return new b(context.getResources(), context.getPackageName(), null);
        }
    }

    public static final int f(b bVar) {
        return bVar.f31432a.getIdentifier("license_fragment_container", "id", bVar.f31433b);
    }

    public static final int g(b bVar) {
        return bVar.f31432a.getIdentifier("libraries_social_licenses_license", "layout", bVar.f31433b);
    }

    public static final int h(b bVar) {
        return bVar.f31432a.getIdentifier("license", "id", bVar.f31433b);
    }

    public final i c() {
        return this.f31435a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String d(String str) {
        try {
            i iVar = this.f31435a;
            return (String) h4.a(iVar.p(new f(iVar, str)), null).get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e15) {
            c2.h("OssLicenses", "Failed to get package name from OssLicensesClient", e15);
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String e(j4 j4Var) {
        try {
            i iVar = this.f31435a;
            return (String) h4.a(iVar.p(new g(iVar, j4Var)), null).get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e15) {
            c2.h("OssLicenses", "Failed to get license detail from OssLicensesClient", e15);
            return "";
        }
    }
}
