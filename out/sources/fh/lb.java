package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        int iV2 = 0;
        int iV3 = 0;
        rg[] rgVarArr = null;
        e4 e4Var = null;
        e4 e4Var2 = null;
        e4 e4Var3 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    rgVarArr = (rg[]) kg.b.k(parcel, iT, rg.CREATOR);
                    break;
                case 3:
                    e4Var = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 5:
                    e4Var3 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 6:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 7:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 8:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 10:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 11:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 12:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new ka(rgVarArr, e4Var, e4Var2, e4Var3, strH, fR, strH2, iV, zO, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new ka[i15];
    }
}
