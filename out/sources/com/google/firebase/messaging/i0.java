package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import io.sentry.android.core.c2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36554e = 0;

    i0(Context context) {
        this.f36550a = context;
    }

    static String c(vk.e eVar) {
        String strD = eVar.m().d();
        if (strD != null) {
            return strD;
        }
        String strC = eVar.m().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f36550a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e15) {
            c2.g("FirebaseMessaging", "Failed to find package " + e15);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f36550a.getPackageName());
        if (packageInfoF != null) {
            this.f36551b = Integer.toString(packageInfoF.versionCode);
            this.f36552c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        try {
            if (this.f36551b == null) {
                h();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f36551b;
    }

    synchronized String b() {
        try {
            if (this.f36552c == null) {
                h();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f36552c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f36553d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f36553d = packageInfoF.versionCode;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f36553d;
    }

    synchronized int e() {
        int i15 = this.f36554e;
        if (i15 != 0) {
            return i15;
        }
        PackageManager packageManager = this.f36550a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            c2.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!com.google.android.gms.common.util.j.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f36554e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f36554e = 2;
            return 2;
        }
        c2.g("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (com.google.android.gms.common.util.j.d()) {
            this.f36554e = 2;
        } else {
            this.f36554e = 1;
        }
        return this.f36554e;
    }

    boolean g() {
        return e() != 0;
    }
}
