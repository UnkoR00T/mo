package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p5 extends d2 {
    public static final Parcelable.Creator<p5> CREATOR = new n5();

    p5(l0.a aVar, l0.a aVar2, l0.a aVar3, l0.a aVar4, l0.a aVar5, l0.a aVar6, l0.a aVar7) {
        super(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(g(), i15);
        parcel.writeParcelable(h(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(e(), i15);
    }
}
