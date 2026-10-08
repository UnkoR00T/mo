package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                fR = kg.b.r(parcel, iT);
            } else if (iN == 3) {
                fR2 = kg.b.r(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                iV2 = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new mc(iV, fR, fR2, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new mc[i15];
    }
}
