package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class o6 extends b3 {
    public static final Parcelable.Creator<o6> CREATOR = new n6();

    o6(a0 a0Var, boolean z15) {
        super(a0Var, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeInt(c() ? 1 : 0);
    }
}
