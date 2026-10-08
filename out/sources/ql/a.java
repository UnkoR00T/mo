package ql;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import hl.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f167156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f167157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f167158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f167159d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f167156a = contextA;
        this.f167157b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f167158c = cVar;
        this.f167159d = c();
    }

    private static Context a(Context context) {
        return u5.a.b(context);
    }

    private boolean c() {
        return this.f167157b.contains("firebase_data_collection_default_enabled") ? this.f167157b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f167156a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f167156a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f167159d;
    }
}
