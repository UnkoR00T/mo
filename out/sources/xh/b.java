package xh;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        PointF[] pointFArr = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                pointFArr = (PointF[]) kg.b.k(parcel, iT, PointF.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                iV = kg.b.v(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(pointFArr, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i15) {
        return new a[i15];
    }
}
