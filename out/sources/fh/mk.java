package fh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class mk extends a implements ok {
    mk(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override // fh.ok
    public final pk U0(rg.b bVar, rg.b bVar2, cl clVar) {
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        pk pkVar = null;
        b1.b(parcelL3, null);
        b1.a(parcelL3, clVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            pkVar = iInterfaceQueryLocalInterface instanceof pk ? (pk) iInterfaceQueryLocalInterface : new pk(strongBinder);
        }
        parcelM3.recycle();
        return pkVar;
    }
}
