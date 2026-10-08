package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 extends ah.l implements e1 {
    public d1() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
