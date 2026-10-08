package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends ah.l implements e0 {
    public d0() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        boolean zZzb = zzb();
        parcel2.writeNoException();
        int i17 = ah.m.f6293b;
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
