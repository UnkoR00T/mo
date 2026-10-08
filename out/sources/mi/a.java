package mi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.dg;
import com.google.android.libraries.places.internal.hg;
import com.google.android.libraries.places.internal.qh;
import com.google.android.libraries.places.internal.yh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        hg hgVar = (hg) Enum.valueOf(hg.class, parcel.readString());
        yh yhVar = (yh) Enum.valueOf(yh.class, parcel.readString());
        int i15 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = 0; i16 != i15; i16++) {
            arrayList.add((dg) Enum.valueOf(dg.class, parcel.readString()));
        }
        return new b(hgVar, yhVar, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (qh) parcel.readValue(b.class.getClassLoader()), (qh) parcel.readValue(b.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b[i15];
    }
}
