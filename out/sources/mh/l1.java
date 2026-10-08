package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l1 extends ah.l implements m1 {
    public l1() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.v vVarM3 = ah.u.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        k1(vVarM3);
        parcel2.writeNoException();
        return true;
    }
}
