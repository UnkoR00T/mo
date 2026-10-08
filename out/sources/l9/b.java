package l9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public e a(long j15, byte[] bArr, int i15, int i16) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i15, i16);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(w7.f.a(new zj.g() { // from class: l9.a
            @Override // zj.g
            public final Object apply(Object obj) {
                return v7.a.b((Bundle) obj);
            }
        }, (ArrayList) zj.p.q(bundle.getParcelableArrayList("c"))), j15, bundle.getLong("d"));
    }
}
