package zg;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 extends b implements o1 {
    public n1() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // zg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        Status status = (Status) n.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) n.a(parcel, LocationAvailability.CREATOR);
        n.d(parcel);
        Y(status, locationAvailability);
        return true;
    }
}
