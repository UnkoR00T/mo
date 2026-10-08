package zh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        int iV = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 2:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 3:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new a(strH, iV, zO, strH2, strH3, strH4, strH5, strH6, strH7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}
