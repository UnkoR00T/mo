package ii;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class r6 implements Parcelable.Creator {
    r6() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new s6((a0) parcel.readParcelable(y0.class.getClassLoader()), (p) parcel.readParcelable(y0.class.getClassLoader()), (b0) parcel.readParcelable(y0.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new s6[i15];
    }
}
