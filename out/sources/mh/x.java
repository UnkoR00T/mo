package mh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends ah.l implements y {
    public x() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        b w0Var;
        if (i15 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            w0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            w0Var = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new w0(strongBinder);
        }
        ah.m.b(parcel);
        n1(w0Var);
        parcel2.writeNoException();
        return true;
    }
}
