package ah;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // ah.k
    public final boolean L1(k kVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, kVar);
        Parcel parcelL3 = l3(15, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // ah.k
    public final int j() {
        Parcel parcelL3 = l3(16, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }
}
