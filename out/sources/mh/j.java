package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends ah.l implements k {
    public j() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.e eVarM3 = ah.d.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        b(eVarM3);
        parcel2.writeNoException();
        return true;
    }
}
