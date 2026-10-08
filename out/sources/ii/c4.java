package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class c4 implements Parcelable.Creator {
    c4() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new d4((r) parcel.readParcelable(k.class.getClassLoader()), Double.valueOf(parcel.readDouble()), Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new d4[i15];
    }
}
