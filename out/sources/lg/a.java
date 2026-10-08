package lg;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import jg.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vg.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void o3(w wVar) {
        Parcel parcelL3 = l3();
        vg.c.b(parcelL3, wVar);
        n3(1, parcelL3);
    }
}
