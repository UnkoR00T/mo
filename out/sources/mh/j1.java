package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 extends ah.l implements k1 {
    public j1() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.s sVarM3 = ah.r.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        A0(sVarM3);
        parcel2.writeNoException();
        return true;
    }
}
