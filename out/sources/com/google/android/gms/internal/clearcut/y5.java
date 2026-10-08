package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 implements Parcelable.Creator<x5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x5 createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        int iV = 0;
        int iV2 = 0;
        boolean zO = false;
        int iV3 = 0;
        boolean zO2 = true;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 4:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 8:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 10:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new x5(strH, iV, iV2, strH2, strH3, zO2, strH4, zO, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x5[] newArray(int i15) {
        return new x5[i15];
    }
}
