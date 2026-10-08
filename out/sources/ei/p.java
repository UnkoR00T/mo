package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        f fVar = null;
        g gVar = null;
        g gVar2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 3) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN == 4) {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            } else if (iN == 5) {
                gVar = (g) kg.b.g(parcel, iT, g.CREATOR);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                gVar2 = (g) kg.b.g(parcel, iT, g.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new h(strH, strH2, fVar, gVar, gVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}
