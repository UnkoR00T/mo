package nh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 2) {
                latLng = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            } else if (iN != 3) {
                kg.b.B(parcel, iT);
            } else {
                latLng2 = (LatLng) kg.b.g(parcel, iT, LatLng.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LatLngBounds[i15];
    }
}
