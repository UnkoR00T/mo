package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class s6 extends f3 {
    public static final Parcelable.Creator<s6> CREATOR = new r6();

    s6(a0 a0Var, p pVar, b0 b0Var, boolean z15) {
        super(a0Var, pVar, b0Var, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeInt(e() ? 1 : 0);
    }
}
