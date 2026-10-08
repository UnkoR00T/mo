package zg;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 extends b implements k1 {
    public j1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // zg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            g1 g1Var = (g1) n.a(parcel, g1.CREATOR);
            n.d(parcel);
            d0(g1Var);
        } else {
            if (i15 != 2) {
                return false;
            }
            d();
        }
        return true;
    }
}
