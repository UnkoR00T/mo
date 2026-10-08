package ii;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class l5 implements Parcelable.Creator {
    l5() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        g0.b bVar = (g0.b) parcel.readParcelable(g0.class.getClassLoader());
        ArrayList arrayList = parcel.readArrayList(g0.class.getClassLoader());
        ArrayList arrayList2 = parcel.readArrayList(g0.class.getClassLoader());
        ArrayList arrayList3 = parcel.readArrayList(g0.class.getClassLoader());
        if (parcel.readInt() == 0) {
            boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            boolValueOf = null;
        }
        return new m5(bVar, arrayList, arrayList2, arrayList3, boolValueOf, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null, parcel.readInt() == 0 ? (Instant) parcel.readSerializable() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m5[i15];
    }
}
