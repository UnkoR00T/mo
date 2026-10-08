package pi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
        String string = parcel.readString();
        d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
        Integer numValueOf = null;
        String string2 = parcel.readString();
        if (parcel.readInt() != 0) {
            numValueOf = Integer.valueOf(parcel.readInt());
        }
        return new c(bVarCreateFromParcel, string, dVarCreateFromParcel, string2, numValueOf, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c[i15];
    }
}
