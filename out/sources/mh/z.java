package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends ah.l implements a0 {
    public z() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.e eVarM3 = ah.d.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        boolean zB = b(eVarM3);
        parcel2.writeNoException();
        parcel2.writeInt(zB ? 1 : 0);
        return true;
    }
}
