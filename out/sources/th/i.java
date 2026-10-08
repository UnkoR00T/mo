package th;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList<String> arrayListJ = null;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                arrayListJ = kg.b.j(parcel, iT);
            } else if (iN != 2) {
                kg.b.B(parcel, iT);
            } else {
                strH = kg.b.h(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new h(arrayListJ, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new h[i15];
    }
}
