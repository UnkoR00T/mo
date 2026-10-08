package eh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class me extends a implements pe {
    me(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // eh.pe
    public final le I0(rg.b bVar, he heVar) {
        le leVar;
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, heVar);
        Parcel parcelM3 = m3(1, parcelL3);
        IBinder strongBinder = parcelM3.readStrongBinder();
        if (strongBinder == null) {
            leVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            leVar = iInterfaceQueryLocalInterface instanceof le ? (le) iInterfaceQueryLocalInterface : new le(strongBinder);
        }
        parcelM3.recycle();
        return leVar;
    }
}
