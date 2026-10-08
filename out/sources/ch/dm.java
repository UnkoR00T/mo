package ch;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class dm extends a implements fm {
    dm(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // ch.fm
    public final cm i2(rg.b bVar, ul ulVar) {
        cm cmVar;
        Parcel parcelL3 = l3();
        p0.b(parcelL3, bVar);
        p0.a(parcelL3, ulVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            cmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            cmVar = iInterfaceQueryLocalInterface instanceof cm ? (cm) iInterfaceQueryLocalInterface : new cm(strongBinder);
        }
        parcelM3.recycle();
        return cmVar;
    }
}
