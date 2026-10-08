package ci;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        String[] strArrI = null;
        int[] iArrE = null;
        RemoteViews remoteViews = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                strArrI = kg.b.i(parcel, iT);
            } else if (iN == 2) {
                iArrE = kg.b.e(parcel, iT);
            } else if (iN == 3) {
                remoteViews = (RemoteViews) kg.b.g(parcel, iT, RemoteViews.CREATOR);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                bArrB = kg.b.b(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new a(strArrI, iArrE, remoteViews, bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a[i15];
    }
}
