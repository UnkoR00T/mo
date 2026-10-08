package ah;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends a implements p {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // ah.p
    public final rg.b g0(Bitmap bitmap) {
        Parcel parcelM3 = m3();
        m.c(parcelM3, bitmap);
        Parcel parcelL3 = l3(6, parcelM3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }
}
