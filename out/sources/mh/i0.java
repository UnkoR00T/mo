package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends ah.l implements j0 {
    public i0() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        nh.k kVar = (nh.k) ah.m.a(parcel, nh.k.CREATOR);
        ah.m.b(parcel);
        H0(kVar);
        parcel2.writeNoException();
        return true;
    }
}
