package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public class ac extends Binder implements IInterface {
    protected ac(String str) {
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
    public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i15, parcel, parcel2, i16)) {
            return true;
        }
        return l3(i15, parcel, parcel2, i16);
    }
}
