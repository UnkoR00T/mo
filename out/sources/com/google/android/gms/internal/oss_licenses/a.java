package com.google.android.gms.internal.oss_licenses;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f30726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30727e = "com.google.android.gms.oss.licenses.IOSSLicenseService";

    protected a(IBinder iBinder, String str) {
        this.f30726d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30726d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f30727e);
        return parcelObtain;
    }

    protected final Parcel m3(int i15, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f30726d.transact(i15, parcel, parcelObtain, 0);
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
}
