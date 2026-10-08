package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayList = new ArrayList();
        float fR = 0.0f;
        ArrayList arrayListL = null;
        int iV = 0;
        int iV2 = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        int iV3 = 0;
        float fR2 = 0.0f;
        ArrayList arrayListL2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    arrayListL2 = kg.b.l(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    kg.b.x(parcel, iT, arrayList, z.class.getClassLoader());
                    break;
                case 4:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 5:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 6:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    fR2 = kg.b.r(parcel, iT);
                    break;
                case 8:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 9:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 10:
                    zO3 = kg.b.o(parcel, iT);
                    break;
                case 11:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 12:
                    arrayListL = kg.b.l(parcel, iT, j.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new m(arrayListL2, arrayList, fR, iV, iV2, fR2, zO, zO2, zO3, iV3, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new m[i15];
    }
}
