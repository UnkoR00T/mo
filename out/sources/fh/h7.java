package fh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 extends a implements j9 {
    h7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override // fh.j9
    public final g6 T2(rg.b bVar, oe oeVar) {
        g6 g6Var;
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, oeVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            g6Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            g6Var = iInterfaceQueryLocalInterface instanceof g6 ? (g6) iInterfaceQueryLocalInterface : new g6(strongBinder);
        }
        parcelM3.recycle();
        return g6Var;
    }
}
