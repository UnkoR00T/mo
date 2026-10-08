package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList<Integer> arrayListF = null;
        String strH = null;
        String strH2 = null;
        ArrayList<Integer> arrayListF2 = null;
        String strH3 = null;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    arrayListF = kg.b.f(parcel, iT);
                    break;
                case 3:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 4:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    arrayListF2 = kg.b.f(parcel, iT);
                    break;
                case 7:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 8:
                    strH3 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new e(arrayListF, strH, strH2, arrayListF2, zO, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e[i15];
    }
}
