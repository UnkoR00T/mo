package ve;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f206285a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j15) {
        return (b() - j15) * f206285a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
