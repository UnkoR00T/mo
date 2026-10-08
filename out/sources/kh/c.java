package kh;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    vh.l<Location> a(a aVar, vh.a aVar2);

    vh.l<Location> c(int i15, vh.a aVar);

    vh.l<Void> h(e eVar);

    vh.l<Void> j(LocationRequest locationRequest, e eVar, Looper looper);

    vh.l<LocationAvailability> k();
}
