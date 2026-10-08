package vg;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f206692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f206693e;

    protected a(IBinder iBinder, String str) {
        this.f206692d = iBinder;
        this.f206693e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f206692d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f206693e);
        return parcelObtain;
    }

    protected final void m3(int i15, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f206692d.transact(i15, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void n3(int i15, Parcel parcel) {
        try {
            this.f206692d.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
