package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        gg.a aVar = null;
        int iV = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                pendingIntent = (PendingIntent) kg.b.g(parcel, iT, PendingIntent.CREATOR);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                aVar = (gg.a) kg.b.g(parcel, iT, gg.a.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new Status(iV, strH, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new Status[i15];
    }
}
