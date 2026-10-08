package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends ah.l implements c0 {
    public b0() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            ah.e eVarM3 = ah.d.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            r1(eVarM3);
        } else if (i15 == 2) {
            ah.e eVarM4 = ah.d.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            b(eVarM4);
        } else {
            if (i15 != 3) {
                return false;
            }
            ah.e eVarM5 = ah.d.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            u(eVarM5);
        }
        parcel2.writeNoException();
        return true;
    }
}
