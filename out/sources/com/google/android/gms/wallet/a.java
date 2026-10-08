package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        Bundle bundleA = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                bundleA = kg.b.a(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new WebPaymentData(strH, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new WebPaymentData[i15];
    }
}
