package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends ah.l implements t0 {
    public p0() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            a();
        } else {
            if (i15 != 2) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
