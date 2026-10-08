package jg;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
final class q0 implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f102545d;

    q0(IBinder iBinder) {
        this.f102545d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f102545d;
    }

    @Override // jg.o
    public final void g2(n nVar, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
            if (gVar != null) {
                parcelObtain.writeInt(1);
                e1.a(gVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f102545d.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
