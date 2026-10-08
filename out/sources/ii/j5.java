package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class j5 implements Parcelable.Creator {
    j5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new k5((o) parcel.readParcelable(f0.class.getClassLoader()), (o) parcel.readParcelable(f0.class.getClassLoader()), (Uri) parcel.readParcelable(f0.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new k5[i15];
    }
}
