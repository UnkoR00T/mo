package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends ah.l implements m {
    public l() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
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
