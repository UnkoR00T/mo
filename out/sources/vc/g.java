package vc;

import android.content.Context;
import android.net.ConnectivityManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lvc/e;", "a", "(Landroid/content/Context;)Lvc/e;", "coil-network-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final e a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) u5.a.k(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !wc.f.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return e.f205968b;
        }
        try {
            return new f(connectivityManager);
        } catch (Exception unused) {
            return e.f205968b;
        }
    }
}
