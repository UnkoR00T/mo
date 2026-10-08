package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends ah.l implements i {
    public h() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            zzb();
        } else {
            if (i15 != 2) {
                return false;
            }
            ah.b bVarM3 = ah.x.m3(parcel.readStrongBinder());
            ah.m.b(parcel);
            U2(bVarM3);
        }
        parcel2.writeNoException();
        return true;
    }
}
