package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends xg.a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final rg.b o3(rg.b bVar, String str, int i15, rg.b bVar2) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(i15);
        xg.o.b(parcelN3, bVar2);
        Parcel parcelL3 = l3(2, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    public final rg.b p3(rg.b bVar, String str, int i15, rg.b bVar2) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(i15);
        xg.o.b(parcelN3, bVar2);
        Parcel parcelL3 = l3(3, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }
}
