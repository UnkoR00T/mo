package ii;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class b4 extends p7 {
    public static final Parcelable.Creator<b4> CREATOR = new a4();

    b4(ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
    }
}
