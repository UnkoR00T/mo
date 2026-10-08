package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        float fR = 0.0f;
        float fR2 = 0.0f;
        LatLng latLng = null;
        float fR3 = 0.0f;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 3) {
                fR = kg.b.r(parcel, iT);
            } else if (iN == 4) {
                fR3 = kg.b.r(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                fR2 = kg.b.r(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new CameraPosition(latLng, fR, fR3, fR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new CameraPosition[i15];
    }
}
