package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ml mlVar = null;
        String strH = null;
        String strH2 = null;
        nl[] nlVarArr = null;
        kl[] klVarArr = null;
        String[] strArrI = null;
        fl[] flVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    mlVar = (ml) kg.b.g(parcel, iT, ml.CREATOR);
                    break;
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    nlVarArr = (nl[]) kg.b.k(parcel, iT, nl.CREATOR);
                    break;
                case 5:
                    klVarArr = (kl[]) kg.b.k(parcel, iT, kl.CREATOR);
                    break;
                case 6:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 7:
                    flVarArr = (fl[]) kg.b.k(parcel, iT, fl.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new il(mlVar, strH, strH2, nlVarArr, klVarArr, strArrI, flVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new il[i15];
    }
}
