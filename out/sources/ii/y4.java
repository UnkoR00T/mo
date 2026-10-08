package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class y4 extends n1 {
    public static final Parcelable.Creator<y4> CREATOR = new x4();

    y4(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        super(uri, uri2, uri3, uri4, uri5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeParcelable(b(), i15);
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(f(), i15);
        parcel.writeParcelable(e(), i15);
        parcel.writeParcelable(c(), i15);
    }
}
