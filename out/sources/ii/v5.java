package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class v5 extends j2 {
    public static final Parcelable.Creator<v5> CREATOR = new u5();

    v5(String str, int i15, int i16, String str2, String str3, g gVar, Uri uri, Uri uri2) {
        super(str, i15, i16, str2, str3, gVar, uri, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(b());
        parcel.writeInt(f());
        parcel.writeInt(g());
        parcel.writeString(h());
        if (i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(i());
        }
        parcel.writeParcelable(c(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(e(), i15);
    }
}
