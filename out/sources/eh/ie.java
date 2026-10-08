package eh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ie implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        boolean zO = false;
        float fR = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 3:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 4:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 5:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new he(iV, iV2, iV3, iV4, zO, fR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new he[i15];
    }
}
