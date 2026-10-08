package ni;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i15 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            arrayList.add(c.CREATOR.createFromParcel(parcel));
        }
        return new n(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n[i15];
    }
}
