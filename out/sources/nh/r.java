package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 3) {
                latLng2 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 4) {
                latLng3 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN == 5) {
                latLng4 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN != 6) {
                kg.b.B(parcel, iT);
            } else {
                latLngBounds = (LatLngBounds) kg.b.g(parcel, iT, LatLngBounds.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new p(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new p[i15];
    }
}
