package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class t4 implements Parcelable.Creator {
    t4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new u4((v.b) parcel.readParcelable(v.class.getClassLoader()), (e0) parcel.readParcelable(v.class.getClassLoader()), (Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new u4[i15];
    }
}
