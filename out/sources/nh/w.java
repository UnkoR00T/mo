package nh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        String strH = null;
        String strH2 = null;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        String strH3 = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        int iV = 0;
        int iV2 = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        float fR4 = 0.0f;
        float fR5 = 0.0f;
        float fR6 = 1.0f;
        float fR7 = 0.5f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    iBinderU = kg.b.u(parcel, iT);
                    break;
                case 6:
                    fR = kg.b.r(parcel, iT);
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
                    fR3 = kg.b.r(parcel, iT);
                    break;
                case 12:
                    fR7 = kg.b.r(parcel, iT);
                    break;
                case 13:
                    fR4 = kg.b.r(parcel, iT);
                    break;
                case 14:
                    fR6 = kg.b.r(parcel, iT);
                    break;
                case 15:
                    fR5 = kg.b.r(parcel, iT);
                    break;
                case 16:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 17:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 18:
                    iBinderU2 = kg.b.u(parcel, iT);
                    break;
                case 19:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 20:
                    strH3 = kg.b.h(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new i(latLng, strH, strH2, iBinderU, fR, fR2, zO, zO2, zO3, fR3, fR7, fR4, fR6, fR5, iV, iBinderU2, iV2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new i[i15];
    }
}
