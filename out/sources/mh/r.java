package mh;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends ah.l implements s {
    public r() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) ah.m.a(parcel, LatLng.CREATOR);
        ah.m.b(parcel);
        l(latLng);
        parcel2.writeNoException();
        return true;
    }
}
