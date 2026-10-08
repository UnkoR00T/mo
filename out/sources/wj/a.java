package wj;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f213720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f213721e = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f213720d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f213720d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f213721e);
        return parcelObtain;
    }

    protected final void m3(int i15, Parcel parcel) {
        try {
            this.f213720d.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
