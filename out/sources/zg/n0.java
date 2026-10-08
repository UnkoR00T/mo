package zg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        long jY = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListL = null;
        String strH = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                locationRequest = (LocationRequest) kg.b.g(parcel, iT, LocationRequest.CREATOR);
            } else if (iN == 5) {
                arrayListL = kg.b.l(parcel, iT, jg.d.CREATOR);
            } else if (iN == 8) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 9) {
                switch (iN) {
                    case 11:
                        zO3 = kg.b.o(parcel, iT);
                        break;
                    case 12:
                        zO4 = kg.b.o(parcel, iT);
                        break;
                    case 13:
                        strH = kg.b.h(parcel, iT);
                        break;
                    case 14:
                        jY = kg.b.y(parcel, iT);
                        break;
                    default:
                        kg.b.B(parcel, iT);
                        break;
                }
            } else {
                zO2 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new m0(locationRequest, arrayListL, zO, zO2, zO3, zO4, strH, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m0[i15];
    }
}
