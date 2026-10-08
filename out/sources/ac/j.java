package ac;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p071kotlin.Metadata;
import ub.w;
import yb.NetworkState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Lec/b;", "taskExecutor", "Lac/h;", "Lyb/h;", "a", "(Landroid/content/Context;Lec/b;)Lac/h;", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "isBlocked", "c", "(Landroid/net/ConnectivityManager;Z)Lyb/h;", "", "Ljava/lang/String;", "TAG", "d", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5333a = w.i("NetworkStateTracker");

    public static final h<NetworkState> a(Context context, ec.b bVar) {
        return new k(context, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    public static final NetworkState c(ConnectivityManager connectivityManager, boolean z15) {
        boolean z16;
        SecurityException securityException;
        boolean z17;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z18 = false;
            if (activeNetworkInfo == null) {
                z17 = true;
                boolean zD = d(connectivityManager);
                boolean zA = d6.a.a(connectivityManager);
                if (activeNetworkInfo != null) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                z16 = z15;
                return new NetworkState(z18, zD, zA, z17, z16);
            }
            try {
                if (activeNetworkInfo.isConnected()) {
                    z18 = true;
                    z17 = true;
                } else {
                    z17 = true;
                }
                boolean zD2 = d(connectivityManager);
                boolean zA2 = d6.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z17 = false;
                }
                z16 = z15;
                try {
                    return new NetworkState(z18, zD2, zA2, z17, z16);
                } catch (SecurityException e15) {
                    e = e15;
                    securityException = e;
                    w.e().d(f5333a, "Unable to get active network state", securityException);
                    return new NetworkState(false, false, false, true, z16);
                }
            } catch (SecurityException e16) {
                securityException = e16;
                z16 = z15;
            }
        } catch (SecurityException e17) {
            e = e17;
            z16 = z15;
        }
        w.e().d(f5333a, "Unable to get active network state", securityException);
        return new NetworkState(false, false, false, true, z16);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e15) {
            w.e().d(f5333a, "Unable to validate active network", e15);
            return false;
        }
    }
}
