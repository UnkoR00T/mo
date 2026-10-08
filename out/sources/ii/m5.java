package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m5 extends b2 {
    public static final Parcelable.Creator<m5> CREATOR = new l5();

    m5(g0.b bVar, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        super(bVar, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeList(c());
        parcel.writeList(d());
        parcel.writeList(e());
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(f().booleanValue() ? 1 : 0);
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(g());
        }
        if (h() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(h());
        }
    }
}
