package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import kh.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        l[] lVarArr = null;
        long jY = 0;
        int iV = 1;
        int iV2 = 1;
        int iV3 = 1000;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 4:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 5:
                    lVarArr = (l[]) kg.b.k(parcel, iT, l.CREATOR);
                    break;
                case 6:
                    zO = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new LocationAvailability(iV3, iV, iV2, jY, lVarArr, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LocationAvailability[i15];
    }
}
