package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class e5 extends s1 {
    public static final Parcelable.Creator<e5> CREATOR = new d5();

    e5(int i15, int i16, int i17) {
        super(i15, i16, i17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(j());
        parcel.writeInt(g());
        parcel.writeInt(e());
    }
}
