package fh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class qk extends a implements sk {
    qk(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    @Override // fh.sk
    public final pk S1(rg.b bVar, cl clVar) {
        pk pkVar;
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, clVar);
        Parcel parcelM3 = m3(2, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            pkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            pkVar = iInterfaceQueryLocalInterface instanceof pk ? (pk) iInterfaceQueryLocalInterface : new pk(strongBinder);
        }
        parcelM3.recycle();
        return pkVar;
    }

    @Override // fh.sk
    public final pk z1(rg.b bVar) {
        pk pkVar;
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            pkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            pkVar = iInterfaceQueryLocalInterface instanceof pk ? (pk) iInterfaceQueryLocalInterface : new pk(strongBinder);
        }
        parcelM3.recycle();
        return pkVar;
    }
}
