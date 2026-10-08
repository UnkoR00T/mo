package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import kg.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator<UserAddress> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserAddress createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        String strH9 = null;
        String strH10 = null;
        String strH11 = null;
        String strH12 = null;
        String strH13 = null;
        String strH14 = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = b.t(parcel);
            switch (b.n(iT)) {
                case 2:
                    strH = b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = b.h(parcel, iT);
                    break;
                case 7:
                    strH6 = b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = b.h(parcel, iT);
                    break;
                case 10:
                    strH9 = b.h(parcel, iT);
                    break;
                case 11:
                    strH10 = b.h(parcel, iT);
                    break;
                case 12:
                    strH11 = b.h(parcel, iT);
                    break;
                case 13:
                    strH12 = b.h(parcel, iT);
                    break;
                case 14:
                    zO = b.o(parcel, iT);
                    break;
                case 15:
                    strH13 = b.h(parcel, iT);
                    break;
                case 16:
                    strH14 = b.h(parcel, iT);
                    break;
                default:
                    b.B(parcel, iT);
                    break;
            }
        }
        b.m(parcel, iC);
        return new UserAddress(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, zO, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserAddress[] newArray(int i15) {
        return new UserAddress[i15];
    }
}
