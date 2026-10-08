package y;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Handler f222504a;

    private n() {
    }

    public static Handler a() {
        if (f222504a != null) {
            return f222504a;
        }
        synchronized (n.class) {
            try {
                if (f222504a == null) {
                    f222504a = e6.g.a(Looper.getMainLooper());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f222504a;
    }
}
