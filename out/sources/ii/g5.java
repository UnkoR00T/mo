package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class g5 extends u1 {
    public static final Parcelable.Creator<g5> CREATOR = new f5();

    g5(int i15, int i16) {
        super(i15, i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeInt(e());
        parcel.writeInt(g());
    }
}
