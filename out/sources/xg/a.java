package xg;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f218444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f218445e;

    protected a(IBinder iBinder, String str) {
        this.f218444d = iBinder;
        this.f218445e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f218444d;
    }

    protected final Parcel l3(int i15, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f218444d.transact(i15, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e15) {
                parcelObtain.recycle();
                throw e15;
            }
        } catch (Throwable th4) {
            parcel.recycle();
            throw th4;
        }
    }

    protected final void m3(int i15, Parcel parcel) {
        try {
            this.f218444d.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel n3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f218445e);
        return parcelObtain;
    }
}
