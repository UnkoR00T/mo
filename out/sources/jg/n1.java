package jg;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 extends xg.n implements o1 {
    public n1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // xg.n
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            rg.b bVarC = c();
            parcel2.writeNoException();
            xg.o.b(parcel2, bVarC);
        } else {
            if (i15 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
