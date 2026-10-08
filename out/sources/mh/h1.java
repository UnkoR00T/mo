package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h1 extends ah.l implements i1 {
    public h1() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        int i17 = parcel.readInt();
        ah.m.b(parcel);
        p(i17);
        parcel2.writeNoException();
        return true;
    }
}
