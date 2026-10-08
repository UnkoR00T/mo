package fh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class g6 extends a implements IInterface {
    g6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    public final void c() {
        n3(2, l3());
    }

    public final ka[] o3(rg.b bVar, c2 c2Var) {
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, c2Var);
        Parcel parcelM3 = m3(1, parcelL3);
        ka[] kaVarArr = (ka[]) parcelM3.createTypedArray(ka.CREATOR);
        parcelM3.recycle();
        return kaVarArr;
    }
}
