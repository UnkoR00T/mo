package jh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f102629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f102630e;

    protected a(IBinder iBinder, String str) {
        this.f102629d = iBinder;
        this.f102630e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f102629d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f102630e);
        return parcelObtain;
    }

    protected final void m3(int i15, Parcel parcel) {
        try {
            this.f102629d.transact(i15, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
