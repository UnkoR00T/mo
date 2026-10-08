package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class yk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        n6 n6Var = null;
        n6 n6Var2 = null;
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
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    n6Var = (n6) kg.b.g(parcel, iT, n6.CREATOR);
                    break;
                case 8:
                    n6Var2 = (n6) kg.b.g(parcel, iT, n6.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new o7(strH, strH2, strH3, strH4, strH5, n6Var, n6Var2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new o7[i15];
    }
}
