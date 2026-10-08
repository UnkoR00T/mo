package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class k5 extends z1 {
    public static final Parcelable.Creator<k5> CREATOR = new j5();

    k5(o oVar, o oVar2, Uri uri, String str, String str2) {
        super(oVar, oVar2, uri, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(e(), i15);
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        if (d() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(d());
        }
    }
}
