package zg;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 extends b implements q1 {
    public p1() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // zg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        Status status = (Status) n.a(parcel, Status.CREATOR);
        Location location = (Location) n.a(parcel, Location.CREATOR);
        n.d(parcel);
        T(status, location);
        return true;
    }
}
