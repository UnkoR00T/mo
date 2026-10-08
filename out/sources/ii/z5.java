package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class z5 extends m2 {
    public static final Parcelable.Creator<z5> CREATOR = new y5();

    z5(l0 l0Var, double d15) {
        super(l0Var, d15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeDouble(a());
    }
}
