package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends xg.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int o() {
        Parcel parcelL3 = l3(6, n3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    public final rg.b o3(rg.b bVar, String str, int i15) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(i15);
        Parcel parcelL3 = l3(2, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    public final int p3(rg.b bVar, String str, boolean z15) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(z15 ? 1 : 0);
        Parcel parcelL3 = l3(3, parcelN3);
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    public final rg.b q3(rg.b bVar, String str, int i15) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(i15);
        Parcel parcelL3 = l3(4, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    public final int r3(rg.b bVar, String str, boolean z15) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(z15 ? 1 : 0);
        Parcel parcelL3 = l3(5, parcelN3);
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    public final rg.b s3(rg.b bVar, String str, boolean z15, long j15) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(z15 ? 1 : 0);
        parcelN3.writeLong(j15);
        Parcel parcelL3 = l3(7, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }

    public final rg.b t3(rg.b bVar, String str, int i15, rg.b bVar2) {
        Parcel parcelN3 = n3();
        xg.o.b(parcelN3, bVar);
        parcelN3.writeString(str);
        parcelN3.writeInt(i15);
        xg.o.b(parcelN3, bVar2);
        Parcel parcelL3 = l3(8, parcelN3);
        rg.b bVarM3 = rg.b.a.m3(parcelL3.readStrongBinder());
        parcelL3.recycle();
        return bVarM3;
    }
}
