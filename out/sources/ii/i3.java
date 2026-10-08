package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class i3 extends x1 {
    public static final Parcelable.Creator<i3> CREATOR = new h3();

    i3(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4) {
        super(aVar, aVar2, aVar3, aVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(e(), i15);
    }
}
