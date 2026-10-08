package mh;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 extends ah.l implements n0 {
    public m0() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // ah.l
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        ah.k kVarM3 = ah.j.m3(parcel.readStrongBinder());
        ah.m.b(parcel);
        L2(kVarM3);
        parcel2.writeNoException();
        return true;
    }
}
