package b6;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    private static class C0408a {
        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }
    }

    static class b {
        static boolean a(Location location) {
            return location.isMock();
        }
    }

    public static float a(Location location) {
        return C0408a.a(location);
    }

    public static long b(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static float c(Location location) {
        return C0408a.b(location);
    }

    public static float d(Location location) {
        return C0408a.c(location);
    }

    public static boolean e(Location location) {
        return C0408a.d(location);
    }

    public static boolean f(Location location) {
        return C0408a.e(location);
    }

    public static boolean g(Location location) {
        return C0408a.f(location);
    }

    public static boolean h(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(location) : location.isFromMockProvider();
    }
}
