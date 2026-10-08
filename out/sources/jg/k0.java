package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = -1;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        String strH = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 5:
                    jY2 = kg.b.y(parcel, iT);
                    break;
                case 6:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    iV5 = kg.b.v(parcel, iT);
                    break;
                case 9:
                    iV = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new q(iV2, iV3, iV4, jY, jY2, strH, strH2, iV5, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q[i15];
    }
}
