package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import yh.d;
import yh.f;
import yh.g;
import yh.s;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String[] strArrI = null;
        String strH3 = null;
        s sVar = null;
        s sVar2 = null;
        f[] fVarArr = null;
        g[] gVarArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        d[] dVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 5:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    sVar = (s) kg.b.g(parcel, iT, s.CREATOR);
                    break;
                case 7:
                    sVar2 = (s) kg.b.g(parcel, iT, s.CREATOR);
                    break;
                case 8:
                    fVarArr = (f[]) kg.b.k(parcel, iT, f.CREATOR);
                    break;
                case 9:
                    gVarArr = (g[]) kg.b.k(parcel, iT, g.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 12:
                    dVarArr = (d[]) kg.b.k(parcel, iT, d.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new MaskedWallet(strH, strH2, strArrI, strH3, sVar, sVar2, fVarArr, gVarArr, userAddress, userAddress2, dVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new MaskedWallet[i15];
    }
}
