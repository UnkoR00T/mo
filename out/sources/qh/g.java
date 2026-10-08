package qh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        byte[] bArrB = null;
        byte[][] bArrC = null;
        byte[][] bArrC2 = null;
        byte[][] bArrC3 = null;
        byte[][] bArrC4 = null;
        int[] iArrE = null;
        byte[][] bArrC5 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    bArrB = kg.b.b(parcel, iT);
                    break;
                case 4:
                    bArrC = kg.b.c(parcel, iT);
                    break;
                case 5:
                    bArrC2 = kg.b.c(parcel, iT);
                    break;
                case 6:
                    bArrC3 = kg.b.c(parcel, iT);
                    break;
                case 7:
                    bArrC4 = kg.b.c(parcel, iT);
                    break;
                case 8:
                    iArrE = kg.b.e(parcel, iT);
                    break;
                case 9:
                    bArrC5 = kg.b.c(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new a(strH, bArrB, bArrC, bArrC2, bArrC3, bArrC4, iArrE, bArrC5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i15) {
        return new a[i15];
    }
}
