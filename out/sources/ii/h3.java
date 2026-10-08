package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h3 implements Parcelable.Creator {
    h3() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i3((l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()), (l0.a) parcel.readParcelable(a.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i3[i15];
    }
}
