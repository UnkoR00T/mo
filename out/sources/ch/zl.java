package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
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
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 11:
                    strH11 = kg.b.h(parcel, iT);
                    break;
                case 12:
                    strH12 = kg.b.h(parcel, iT);
                    break;
                case 13:
                    strH13 = kg.b.h(parcel, iT);
                    break;
                case 14:
                    strH14 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new jl(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, strH9, strH10, strH11, strH12, strH13, strH14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new jl[i15];
    }
}
