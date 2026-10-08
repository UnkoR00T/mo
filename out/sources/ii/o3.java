package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class o3 extends k6 {
    public static final Parcelable.Creator<o3> CREATOR = new n3();

    o3(List list, List list2) {
        super(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(c());
        parcel.writeList(b());
    }
}
