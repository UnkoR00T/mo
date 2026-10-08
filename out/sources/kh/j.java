package kh;

import android.os.Parcel;
import android.os.Parcelable;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        f0 f0Var = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                f0Var = (f0) kg.b.g(parcel, iT, f0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new i(zO, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}
