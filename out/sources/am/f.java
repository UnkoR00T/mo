package am;

import com.google.android.gms.maps.model.LatLng;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lam/f;", "", "<init>", "()V", "", "lat1", "lng1", "lat2", "lng2", "c", "(DDDD)D", "Lcom/google/android/gms/maps/model/LatLng;", "from", "to", "a", "(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D", "b", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7767a = new f();

    private f() {
    }

    public static final double a(LatLng from, LatLng to4) {
        return f7767a.c(Math.toRadians(from.f31423a), Math.toRadians(from.f31424b), Math.toRadians(to4.f31423a), Math.toRadians(to4.f31424b));
    }

    public static final double b(LatLng from, LatLng to4) {
        return a(from, to4) * 6371009.0d;
    }

    private final double c(double lat1, double lng1, double lat2, double lng2) {
        return a.a(a.c(lat1, lat2, lng1 - lng2));
    }
}
