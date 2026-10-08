package di;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import yh.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends jh.a implements a {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    @Override // di.a
    public final void X2(yh.e eVar, Bundle bundle, b bVar) {
        Parcel parcelL3 = l3();
        jh.c.c(parcelL3, eVar);
        jh.c.c(parcelL3, bundle);
        jh.c.d(parcelL3, bVar);
        m3(14, parcelL3);
    }

    @Override // di.a
    public final void Y0(j jVar, Bundle bundle, b bVar) {
        Parcel parcelL3 = l3();
        jh.c.c(parcelL3, jVar);
        jh.c.c(parcelL3, bundle);
        jh.c.d(parcelL3, bVar);
        m3(19, parcelL3);
    }
}
