package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class u4 extends j1 {
    public static final Parcelable.Creator<u4> CREATOR = new t4();

    u4(v.b bVar, e0 e0Var, Instant instant) {
        super(bVar, e0Var, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(a(), i15);
        parcel.writeSerializable(c());
    }
}
