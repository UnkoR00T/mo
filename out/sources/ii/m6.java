package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class m6 extends z2 {
    public static final Parcelable.Creator<m6> CREATOR = new l6();

    m6(List list, Uri uri) {
        super(list, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeList(c());
        parcel.writeParcelable(b(), i15);
    }
}
