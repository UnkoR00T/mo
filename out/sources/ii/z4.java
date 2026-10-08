package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z4 implements Parcelable.Creator {
    z4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new a5(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(y.class.getClassLoader()), parcel.readInt() == 0 ? (y.b) Enum.valueOf(y.b.class, parcel.readString()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new a5[i15];
    }
}
