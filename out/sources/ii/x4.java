package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class x4 implements Parcelable.Creator {
    x4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new y4((Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()), (Uri) parcel.readParcelable(x.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new y4[i15];
    }
}
