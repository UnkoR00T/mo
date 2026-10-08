package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class q5 implements Parcelable.Creator {
    q5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new r5((l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()), (l0.a) parcel.readParcelable(i0.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new r5[i15];
    }
}
