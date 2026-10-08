package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 4) {
                iV3 = kg.b.v(parcel, iT);
            } else if (iN == 5) {
                iV4 = kg.b.v(parcel, iT);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                fR = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new e4(iV, iV2, iV3, iV4, fR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e4[i15];
    }
}
