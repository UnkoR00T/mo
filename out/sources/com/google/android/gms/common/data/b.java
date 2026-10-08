package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String[] strArrI = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleA = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strArrI = kg.b.i(parcel, iT);
            } else if (iN == 2) {
                cursorWindowArr = (CursorWindow[]) kg.b.k(parcel, iT, CursorWindow.CREATOR);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                bundleA = kg.b.a(parcel, iT);
            } else if (iN != 1000) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        DataHolder dataHolder = new DataHolder(iV, strArrI, cursorWindowArr, iV2, bundleA);
        dataHolder.p();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new DataHolder[i15];
    }
}
