package qg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f166355a;

    public c(Context context) {
        this.f166355a = context;
    }

    public int a(String str) {
        return this.f166355a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f166355a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i15) {
        return this.f166355a.getPackageManager().getApplicationInfo(str, i15);
    }

    public CharSequence d(String str) {
        Context context = this.f166355a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i15) {
        return this.f166355a.getPackageManager().getPackageInfo(str, i15);
    }
}
