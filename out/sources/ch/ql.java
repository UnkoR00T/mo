package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ql implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        tc tcVar = null;
        String strH = null;
        String strH2 = null;
        ud[] udVarArr = null;
        ra[] raVarArr = null;
        String[] strArrI = null;
        m5[] m5VarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    tcVar = (tc) kg.b.g(parcel, iT, tc.CREATOR);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    udVarArr = (ud[]) kg.b.k(parcel, iT, ud.CREATOR);
                    break;
                case 6:
                    raVarArr = (ra[]) kg.b.k(parcel, iT, ra.CREATOR);
                    break;
                case 7:
                    strArrI = kg.b.i(parcel, iT);
                    break;
                case 8:
                    m5VarArr = (m5[]) kg.b.k(parcel, iT, m5.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new p8(tcVar, strH, strH2, udVarArr, raVarArr, strArrI, m5VarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p8[i15];
    }
}
