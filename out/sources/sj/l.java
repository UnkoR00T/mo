package sj;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends g implements m {
    public l() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // sj.g
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 2) {
            Bundle bundle = (Bundle) h.a(parcel, Bundle.CREATOR);
            h.b(parcel);
            F2(bundle);
            return true;
        }
        if (i15 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) h.a(parcel, Bundle.CREATOR);
        h.b(parcel);
        x(bundle2);
        return true;
    }
}
