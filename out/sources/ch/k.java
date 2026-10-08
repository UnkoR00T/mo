package ch;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends a implements IInterface {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void c() {
        n3(3, l3());
    }

    public final zh[] o3(rg.b bVar, o oVar) {
        Parcel parcelL3 = l3();
        p0.b(parcelL3, bVar);
        p0.a(parcelL3, oVar);
        Parcel parcelM3 = m3(1, parcelL3);
        zh[] zhVarArr = (zh[]) parcelM3.createTypedArray(zh.CREATOR);
        parcelM3.recycle();
        return zhVarArr;
    }

    public final zh[] p3(rg.b bVar, o oVar) {
        Parcel parcelL3 = l3();
        p0.b(parcelL3, bVar);
        p0.a(parcelL3, oVar);
        Parcel parcelM3 = m3(2, parcelL3);
        zh[] zhVarArr = (zh[]) parcelM3.createTypedArray(zh.CREATOR);
        parcelM3.recycle();
        return zhVarArr;
    }
}
