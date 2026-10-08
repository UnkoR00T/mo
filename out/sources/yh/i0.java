package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new d(strH, strH2, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}
