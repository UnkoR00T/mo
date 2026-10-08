package z;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f230992a;

    private f() {
    }

    static ScheduledExecutorService a() {
        if (f230992a != null) {
            return f230992a;
        }
        synchronized (f.class) {
            try {
                if (f230992a == null) {
                    f230992a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return f230992a;
    }
}
