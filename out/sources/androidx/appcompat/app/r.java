package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f8271d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f8273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8274c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f8276b;

        a() {
        }
    }

    r(Context context, LocationManager locationManager) {
        this.f8272a = context;
        this.f8273b = locationManager;
    }

    static r a(Context context) {
        if (f8271d == null) {
            Context applicationContext = context.getApplicationContext();
            f8271d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f8271d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = u5.d.c(this.f8272a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = u5.d.c(this.f8272a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f8273b.isProviderEnabled(str)) {
                return this.f8273b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.f8274c.f8276b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j15;
        a aVar = this.f8274c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarB = q.b();
        qVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z15 = qVarB.f8270c == 1;
        long j16 = qVarB.f8269b;
        long j17 = qVarB.f8268a;
        qVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j18 = qVarB.f8269b;
        if (j16 == -1 || j17 == -1) {
            j15 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j17) {
                j16 = j18;
            } else if (jCurrentTimeMillis > j16) {
                j16 = j17;
            }
            j15 = j16 + 60000;
        }
        aVar.f8275a = z15;
        aVar.f8276b = j15;
    }

    boolean d() {
        a aVar = this.f8274c;
        if (e()) {
            return aVar.f8275a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f8275a;
        }
        int i15 = Calendar.getInstance().get(11);
        return i15 < 6 || i15 >= 22;
    }
}
