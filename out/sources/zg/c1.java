package zg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        ArrayList arrayListL = null;
        f0 f0Var = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 3) {
                strH = kg.b.h(parcel, iT);
            } else if (iN == 4) {
                strH2 = kg.b.h(parcel, iT);
            } else if (iN == 6) {
                strH3 = kg.b.h(parcel, iT);
            } else if (iN == 7) {
                f0Var = (f0) kg.b.g(parcel, iT, f0.CREATOR);
            } else if (iN != 8) {
                kg.b.B(parcel, iT);
            } else {
                arrayListL = kg.b.l(parcel, iT, gg.c.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new f0(iV, strH, strH2, strH3, arrayListL, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f0[i15];
    }
}
