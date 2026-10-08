package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 extends ah.l implements l0 {
    public k0() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.h hVarM3 = ah.g.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        N(hVarM3);
        parcel2.writeNoException();
        return true;
    }
}
