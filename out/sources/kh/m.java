package kh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = -1;
        long jY2 = -1;
        int iV = 1;
        int iV2 = 1;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                jY2 = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new l(iV, iV2, jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l[i15];
    }
}
