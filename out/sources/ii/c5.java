package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
final class c5 extends q1 {
    public static final Parcelable.Creator<c5> CREATOR = new b5();

    c5(Duration duration, int i15) {
        super(duration, i15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeSerializable(b());
        parcel.writeInt(a());
    }
}
