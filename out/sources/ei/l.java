package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        d dVar = null;
        f fVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                dVar = (d) kg.b.g(parcel, iT, d.CREATOR);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new c(strH, dVar, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}
