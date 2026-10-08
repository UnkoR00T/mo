package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f29115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f29116e;

    protected a(IBinder iBinder, String str) {
        this.f29115d = iBinder;
        this.f29116e = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f29115d;
    }

    protected final Parcel l3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f29116e);
        return parcelObtain;
    }

    protected final void m3(int i15, Parcel parcel) {
        try {
            this.f29115d.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
