package l9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public byte[] a(List<v7.a> list, long j15) {
        ArrayList<Bundle> arrayListB = w7.f.b(list, new zj.g() { // from class: l9.c
            @Override // zj.g
            public final Object apply(Object obj) {
                return ((v7.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayListB);
        bundle.putLong("d", j15);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
