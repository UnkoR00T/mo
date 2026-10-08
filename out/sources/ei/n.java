package ei;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                jY = kg.b.y(parcel, iT);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                jY2 = kg.b.y(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new f(jY, jY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new f[i15];
    }
}
