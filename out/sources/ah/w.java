package ah;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends a implements b {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // ah.b
    public final int f() {
        Parcel parcelL3 = l3(6, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    @Override // ah.b
    public final boolean h2(b bVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, bVar);
        Parcel parcelL3 = l3(5, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }
}
