package ch;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends a implements n {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // ch.n
    public final k P(rg.b bVar, i iVar) {
        k kVar;
        Parcel parcelL3 = l3();
        p0.b(parcelL3, bVar);
        p0.a(parcelL3, iVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            kVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(strongBinder);
        }
        parcelM3.recycle();
        return kVar;
    }
}
