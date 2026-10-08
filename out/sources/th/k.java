package th;

import android.os.Parcel;
import android.os.Parcelable;
import jg.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        l0 l0Var = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                l0Var = (l0) kg.b.g(parcel, iT, l0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new j(iV, l0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new j[i15];
    }
}
