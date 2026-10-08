package mh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends ah.l implements c {
    public z0() {
        super("com.google.android.gms.maps.internal.ILocationSourceDelegate");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        q pVar;
        if (i15 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                pVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
                pVar = iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new p(strongBinder);
            }
            ah.m.b(parcel);
            j2(pVar);
        } else {
            if (i15 != 2) {
                return false;
            }
            deactivate();
        }
        parcel2.writeNoException();
        return true;
    }
}
