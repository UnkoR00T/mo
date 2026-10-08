package ng;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends vg.a implements IInterface {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void o3(h hVar, a aVar) {
        Parcel parcelL3 = l3();
        vg.c.c(parcelL3, hVar);
        vg.c.b(parcelL3, aVar);
        m3(1, parcelL3);
    }

    public final void p3(h hVar, a aVar, k kVar) {
        Parcel parcelL3 = l3();
        vg.c.c(parcelL3, hVar);
        vg.c.b(parcelL3, aVar);
        vg.c.c(parcelL3, kVar);
        m3(2, parcelL3);
    }

    public final void q3(ig.f fVar, a aVar) {
        Parcel parcelL3 = l3();
        vg.c.c(parcelL3, fVar);
        vg.c.b(parcelL3, aVar);
        m3(4, parcelL3);
    }

    public final void r3(ig.f fVar, k kVar) {
        Parcel parcelL3 = l3();
        vg.c.c(parcelL3, fVar);
        vg.c.c(parcelL3, kVar);
        m3(6, parcelL3);
    }
}
