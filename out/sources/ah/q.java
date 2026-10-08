package ah;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends a implements s {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // ah.s
    public final boolean Y1(s sVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, sVar);
        Parcel parcelL3 = l3(17, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // ah.s
    public final int o() {
        Parcel parcelL3 = l3(18, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }
}
