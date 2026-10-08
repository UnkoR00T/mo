package mh;

import android.location.Location;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 extends ah.l implements h0 {
    public g0() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        Location location = (Location) ah.m.a(parcel, Location.CREATOR);
        ah.m.b(parcel);
        q0(location);
        parcel2.writeNoException();
        return true;
    }
}
