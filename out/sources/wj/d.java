package wj;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wj.f
    public final void Q2(String str, Bundle bundle, h hVar) {
        Parcel parcelL3 = l3();
        parcelL3.writeString(str);
        int i15 = c.f213722a;
        parcelL3.writeInt(1);
        bundle.writeToParcel(parcelL3, 0);
        parcelL3.writeStrongBinder(hVar);
        m3(2, parcelL3);
    }
}
