package jg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 extends xg.n implements n {
    public p1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // xg.n
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            int i17 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) xg.o.a(parcel, Bundle.CREATOR);
            xg.o.c(parcel);
            K0(i17, strongBinder, bundle);
        } else if (i15 == 2) {
            int i18 = parcel.readInt();
            Bundle bundle2 = (Bundle) xg.o.a(parcel, Bundle.CREATOR);
            xg.o.c(parcel);
            f2(i18, bundle2);
        } else {
            if (i15 != 3) {
                return false;
            }
            int i19 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            b1 b1Var = (b1) xg.o.a(parcel, b1.CREATOR);
            xg.o.c(parcel);
            i0(i19, strongBinder2, b1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
