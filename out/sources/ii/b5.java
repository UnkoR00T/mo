package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
final class b5 implements Parcelable.Creator {
    b5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new c5((Duration) parcel.readSerializable(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new c5[i15];
    }
}
