package lh;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mh.a f118199a;

    public static a a(CameraPosition cameraPosition) {
        jg.s.m(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(d().a1(cameraPosition));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public static a b(LatLng latLng, float f15) {
        jg.s.m(latLng, "latLng must not be null");
        try {
            return new a(d().x1(latLng, f15));
        } catch (RemoteException e15) {
            throw new nh.o(e15);
        }
    }

    public static void c(mh.a aVar) {
        f118199a = (mh.a) jg.s.l(aVar);
    }

    private static mh.a d() {
        return (mh.a) jg.s.m(f118199a, "CameraUpdateFactory is not initialized");
    }
}
