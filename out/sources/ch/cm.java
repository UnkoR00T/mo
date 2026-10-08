package ch;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cm extends a implements IInterface {
    cm(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final void d() {
        n3(1, l3());
    }

    public final void f() {
        n3(2, l3());
    }

    public final List o3(rg.b bVar, lm lmVar) {
        Parcel parcelL3 = l3();
        p0.b(parcelL3, bVar);
        p0.a(parcelL3, lmVar);
        Parcel parcelM3 = m3(3, parcelL3);
        ArrayList arrayListCreateTypedArrayList = parcelM3.createTypedArrayList(sl.CREATOR);
        parcelM3.recycle();
        return arrayListCreateTypedArrayList;
    }
}
