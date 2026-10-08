package sj;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sj.k
    public final void y(String str, Bundle bundle, m mVar) {
        Parcel parcelL3 = l3();
        parcelL3.writeString(str);
        h.c(parcelL3, bundle);
        parcelL3.writeStrongBinder(mVar);
        m3(2, parcelL3);
    }
}
