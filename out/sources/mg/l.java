package mg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        Long lZ = null;
        Long lZ2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iV2 = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                lZ = kg.b.z(parcel, iT);
            } else if (iN == 4) {
                lZ2 = kg.b.z(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                iV3 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new h(iV, iV2, lZ, lZ2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}
