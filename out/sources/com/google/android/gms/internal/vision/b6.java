package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements Parcelable.Creator<a6> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a6 createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        long jY = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                iV3 = kg.b.v(parcel, iT);
            } else if (iN == 5) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                iV4 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a6(iV, iV2, iV3, jY, iV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a6[] newArray(int i15) {
        return new a6[i15];
    }
}
