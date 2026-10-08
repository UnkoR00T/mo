package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        List listL = LocationResult.f31396b;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                listL = kg.b.l(parcel, iT, Location.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new LocationResult(listL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LocationResult[i15];
    }
}
