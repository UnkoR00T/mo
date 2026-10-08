package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strH = kg.b.h(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH2 = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new pl(strH, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new pl[i15];
    }
}
