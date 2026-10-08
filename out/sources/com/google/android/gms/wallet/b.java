package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import yh.d;
import yh.l;
import yh.o;
import yh.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        o oVar = null;
        String strH3 = null;
        s sVar = null;
        s sVar2 = null;
        String[] strArrI = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        d[] dVarArr = null;
        l lVar = null;
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
                    oVar = (o) kg.b.g(parcel, iT, o.CREATOR);
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
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 9:
                    userAddress = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) kg.b.g(parcel, iT, UserAddress.CREATOR);
                    break;
                case 11:
                    dVarArr = (d[]) kg.b.k(parcel, iT, d.CREATOR);
                    break;
                case 12:
                    lVar = (l) kg.b.g(parcel, iT, l.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new FullWallet(strH, strH2, oVar, strH3, sVar, sVar2, strArrI, userAddress, userAddress2, dVarArr, lVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new FullWallet[i15];
    }
}
