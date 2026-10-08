package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class d4 extends r7 {
    public static final Parcelable.Creator<d4> CREATOR = new c4();

    d4(r rVar, Double d15, Integer num, Integer num2, Integer num3, Instant instant) {
        super(rVar, d15, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(g(), i15);
        parcel.writeDouble(e().doubleValue());
        parcel.writeInt(d().intValue());
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(c().intValue());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(f().intValue());
        }
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(b());
        }
    }
}
