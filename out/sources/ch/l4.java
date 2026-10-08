package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String[] strArrI = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                strArrI = kg.b.i(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new m5(iV, strArrI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m5[i15];
    }
}
