package mh;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends ah.a implements e {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // mh.e
    public final nh.p w0() {
        Parcel parcelL3 = l3(3, m3());
        nh.p pVar = (nh.p) ah.m.a(parcelL3, nh.p.CREATOR);
        parcelL3.recycle();
        return pVar;
    }
}
