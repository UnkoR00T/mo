package eh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends a implements IInterface {
    i8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void c() {
        n3(3, l3());
    }

    public final e4[] o3(rg.b bVar, ne neVar) {
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.a(parcelL3, neVar);
        Parcel parcelM3 = m3(1, parcelL3);
        e4[] e4VarArr = (e4[]) parcelM3.createTypedArray(e4.CREATOR);
        parcelM3.recycle();
        return e4VarArr;
    }

    public final e4[] p3(rg.b bVar, rg.b bVar2, rg.b bVar3, int i15, int i16, int i17, int i18, int i19, int i25, ne neVar) {
        Parcel parcelL3 = l3();
        b1.b(parcelL3, bVar);
        b1.b(parcelL3, bVar2);
        b1.b(parcelL3, bVar3);
        parcelL3.writeInt(i15);
        parcelL3.writeInt(i16);
        parcelL3.writeInt(i17);
        parcelL3.writeInt(i18);
        parcelL3.writeInt(i19);
        parcelL3.writeInt(i25);
        b1.a(parcelL3, neVar);
        Parcel parcelM3 = m3(4, parcelL3);
        e4[] e4VarArr = (e4[]) parcelM3.createTypedArray(e4.CREATOR);
        parcelM3.recycle();
        return e4VarArr;
    }
}
