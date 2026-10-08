package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends ah.l implements y0 {
    public x0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            ah.e eVarM3 = ah.d.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            rg.b bVarU = u(eVarM3);
            parcel2.writeNoException();
            ah.m.d(parcel2, bVarU);
        } else {
            if (i15 != 2) {
                return false;
            }
            ah.e eVarM4 = ah.d.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            rg.b bVarB = b(eVarM4);
            parcel2.writeNoException();
            ah.m.d(parcel2, bVarB);
        }
        return true;
    }
}
