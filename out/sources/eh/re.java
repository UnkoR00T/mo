package eh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class re implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        PointF pointF = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                pointF = (PointF) kg.b.g(parcel, iT, PointF.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new qe(iV, pointF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new qe[i15];
    }
}
