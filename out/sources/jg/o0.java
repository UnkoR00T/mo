package jg;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        int iV = 0;
        boolean zO = false;
        boolean zO2 = false;
        IBinder iBinderU = null;
        gg.a aVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                iV = kg.b.v(parcel, iT);
            } else if (iN == 2) {
                iBinderU = kg.b.u(parcel, iT);
            } else if (iN == 3) {
                aVar = (gg.a) kg.b.g(parcel, iT, gg.a.CREATOR);
            } else if (iN == 4) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                zO2 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new n0(iV, iBinderU, aVar, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new n0[i15];
    }
}
