package mh;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends ah.a implements a {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // mh.a
    public final rg.b a1(CameraPosition cameraPosition) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, cameraPosition);
        Parcel parcelL3 = l3(7, parcelM3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    @Override // mh.a
    public final rg.b x1(LatLng latLng, float f15) {
        Parcel parcelM3 = m3();
        ah.m.c(parcelM3, latLng);
        parcelM3.writeFloat(f15);
        Parcel parcelL3 = l3(9, parcelM3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }
}
