package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class f6 extends s2 {
    public static final Parcelable.Creator<f6> CREATOR = new e6();

    f6(e0 e0Var, e0 e0Var2) {
        super(e0Var, e0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(b(), i15);
    }
}
