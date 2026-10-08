package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = -1;
        long jY = 0;
        String strH = null;
        String strH2 = null;
        double dQ = 0.0d;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    dQ = kg.b.q(parcel, iT);
                    break;
                case 5:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 7:
                    iV = kg.b.v(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new d(iV2, strH, dQ, strH2, jY, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d[i15];
    }
}
