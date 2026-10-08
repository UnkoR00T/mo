package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class t5 extends h2 {
    public static final Parcelable.Creator<t5> CREATOR = new s5();

    t5(y0 y0Var, y0 y0Var2) {
        super(y0Var, y0Var2);
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
