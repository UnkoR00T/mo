package qg;

import android.content.Context;
import com.google.android.gms.common.util.j;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f166353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f166354b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f166353a;
        if (context2 != null && (bool = f166354b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f166354b = null;
        if (j.d()) {
            f166354b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f166354b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f166354b = Boolean.FALSE;
            }
        }
        f166353a = applicationContext;
        return f166354b.booleanValue();
    }
}
