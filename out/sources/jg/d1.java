package jg;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        u uVar = null;
        int[] iArrE = null;
        int[] iArrE2 = null;
        boolean zO = false;
        boolean zO2 = false;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    uVar = (u) kg.b.g(parcel, iT, u.CREATOR);
                    break;
                case 2:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 3:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 4:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iArrE2 = kg.b.e(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new f(uVar, zO, zO2, iArrE, iV, iArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}
