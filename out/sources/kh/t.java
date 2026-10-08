package kh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends zg.b implements u {
    public t() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static u m3(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof u ? (u) iInterfaceQueryLocalInterface : new s(iBinder);
    }

    @Override // zg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            LocationResult locationResult = (LocationResult) zg.n.a(parcel, LocationResult.CREATOR);
            zg.n.d(parcel);
            O1(locationResult);
        } else if (i15 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) zg.n.a(parcel, LocationAvailability.CREATOR);
            zg.n.d(parcel);
            o0(locationAvailability);
        } else {
            if (i15 != 3) {
                return false;
            }
            f();
        }
        return true;
    }
}
