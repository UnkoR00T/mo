package fh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class pk extends a implements IInterface {
    pk(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final void d() {
        n3(1, l3());
    }

    public final void f() {
        n3(2, l3());
    }

    public final al o3(rg.b bVar, kk kkVar) {
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, kkVar);
        Parcel parcelM3 = m3(3, parcelL3);
        al alVarCreateFromParcel = parcelM3.readInt() == 0 ? null : al.CREATOR.createFromParcel(parcelM3);
        parcelM3.recycle();
        return alVarCreateFromParcel;
    }
}
