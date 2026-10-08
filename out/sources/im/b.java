package im;

import com.google.android.gms.maps.model.LatLng;
import hm.Point;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f93288a;

    public b(double d15) {
        this.f93288a = d15;
    }

    public LatLng a(Point point) {
        double d15 = point.x;
        double d16 = this.f93288a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.y / d16))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d15 / d16) - 0.5d) * 360.0d);
    }

    public a b(LatLng latLng) {
        double d15 = (latLng.f31424b / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.f31423a));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d16 = this.f93288a;
        return new a(d15 * d16, dLog * d16);
    }
}
