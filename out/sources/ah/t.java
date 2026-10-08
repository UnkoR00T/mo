package ah;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // ah.v
    public final int o() {
        Parcel parcelL3 = l3(20, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    @Override // ah.v
    public final boolean y0(v vVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, vVar);
        Parcel parcelL3 = l3(19, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }
}
