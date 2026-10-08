package eh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class j9 extends a implements lb {
    j9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // eh.lb
    public final i8 l2(rg.b bVar, g6 g6Var) {
        i8 i8Var;
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, g6Var);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            i8Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            i8Var = iInterfaceQueryLocalInterface instanceof i8 ? (i8) iInterfaceQueryLocalInterface : new i8(strongBinder);
        }
        parcelM3.recycle();
        return i8Var;
    }
}
