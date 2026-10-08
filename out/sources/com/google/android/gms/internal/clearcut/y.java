package com.google.android.gms.internal.clearcut;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class y extends Binder implements IInterface {
    protected y(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) throws RemoteException {
        boolean zOnTransact;
        if (i15 > 16777215) {
            zOnTransact = super.onTransact(i15, parcel, parcel2, i16);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return l3(i15, parcel, parcel2, i16);
    }
}
