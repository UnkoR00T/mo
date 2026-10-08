package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class x3 extends m7 {
    public static final Parcelable.Creator<x3> CREATOR = new w3();

    x3(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        super(str, num, list, str2, str3, str4, list2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(c());
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(b().intValue());
        }
        parcel.writeList(f());
        parcel.writeString(g());
        parcel.writeString(h());
        parcel.writeString(i());
        parcel.writeList(j());
        parcel.writeList(k());
        parcel.writeList(l());
    }
}
