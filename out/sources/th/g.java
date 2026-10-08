package th;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vg.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void o3(j jVar, f fVar) {
        Parcel parcelL3 = l3();
        vg.c.b(parcelL3, jVar);
        vg.c.c(parcelL3, fVar);
        m3(12, parcelL3);
    }
}
