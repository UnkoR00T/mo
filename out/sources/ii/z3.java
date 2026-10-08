package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z3 extends o7 {
    public static final Parcelable.Creator<z3> CREATOR = new y3();

    z3(int i15, int i16) {
        super(i15, i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(a());
        parcel.writeInt(b());
    }
}
