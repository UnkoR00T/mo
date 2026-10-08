package ah;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f6290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6291e;

    protected a(IBinder iBinder, String str) {
        this.f6290d = iBinder;
        this.f6291e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6290d;
    }

    protected final Parcel l3(int i15, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6290d.transact(i15, parcel, parcelObtain, 0);
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

    protected final Parcel m3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6291e);
        return parcelObtain;
    }

    protected final void n3(int i15, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f6290d.transact(i15, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
