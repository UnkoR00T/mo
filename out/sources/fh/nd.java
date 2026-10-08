package fh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class nd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            kg.b.n(iT);
            kg.b.B(parcel, iT);
        }
        kg.b.m(parcel, iC);
        return new mc();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new mc[i15];
    }
}
