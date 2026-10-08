package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class p4 implements Parcelable.Creator {
    p4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new q4((o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (o) parcel.readParcelable(t.class.getClassLoader()), (Uri) parcel.readParcelable(t.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new q4[i15];
    }
}
