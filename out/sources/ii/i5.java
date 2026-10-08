package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i5 extends w1 {
    public static final Parcelable.Creator<i5> CREATOR = new h5();

    i5(String str, Long l15, Integer num) {
        super(str, l15, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(a());
        parcel.writeLong(c().longValue());
        parcel.writeInt(b().intValue());
    }
}
