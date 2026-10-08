package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class sh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        mc[] mcVarArr = null;
        e4 e4Var = null;
        e4 e4Var2 = null;
        String strH = null;
        String strH2 = null;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    mcVarArr = (mc[]) kg.b.k(parcel, iT, mc.CREATOR);
                    break;
                case 3:
                    e4Var = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 4:
                    e4Var2 = (e4) kg.b.g(parcel, iT, e4.CREATOR);
                    break;
                case 5:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 7:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new rg(mcVarArr, e4Var, e4Var2, strH, fR, strH2, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new rg[i15];
    }
}
