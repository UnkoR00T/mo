package sj;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f181955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f181956e = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected a(IBinder iBinder, String str) {
        this.f181955d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f181955d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f181956e);
        return parcelObtain;
    }

    protected final void m3(int i15, Parcel parcel) {
        try {
            this.f181955d.transact(i15, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
