package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        gg.a aVar = null;
        int iV = 0;
        n0 n0Var = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                aVar = (gg.a) kg.b.g(parcel, iT, gg.a.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                n0Var = (n0) kg.b.g(parcel, iT, n0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new l(iV, aVar, n0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new l[i15];
    }
}
