package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import kg.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iV = 0;
        int iV2 = 0;
        CameraPosition cameraPosition = null;
        Float fS = null;
        Float fS2 = null;
        LatLngBounds latLngBounds = null;
        Integer numW = null;
        String strH = null;
        byte bP = -1;
        byte bP2 = -1;
        byte bP3 = -1;
        byte bP4 = -1;
        byte bP5 = -1;
        byte bP6 = -1;
        byte bP7 = -1;
        byte bP8 = -1;
        byte bP9 = -1;
        byte bP10 = -1;
        byte bP11 = -1;
        byte bP12 = -1;
        while (parcel.dataPosition() < iC) {
            int iT = b.t(parcel);
            switch (b.n(iT)) {
                case 2:
                    bP = b.p(parcel, iT);
                    break;
                case 3:
                    bP2 = b.p(parcel, iT);
                    break;
                case 4:
                    iV = b.v(parcel, iT);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) b.g(parcel, iT, CameraPosition.CREATOR);
                    break;
                case 6:
                    bP3 = b.p(parcel, iT);
                    break;
                case 7:
                    bP4 = b.p(parcel, iT);
                    break;
                case 8:
                    bP5 = b.p(parcel, iT);
                    break;
                case 9:
                    bP6 = b.p(parcel, iT);
                    break;
                case 10:
                    bP7 = b.p(parcel, iT);
                    break;
                case 11:
                    bP8 = b.p(parcel, iT);
                    break;
                case 12:
                    bP9 = b.p(parcel, iT);
                    break;
                case 13:
                case 22:
                default:
                    b.B(parcel, iT);
                    break;
                case 14:
                    bP10 = b.p(parcel, iT);
                    break;
                case 15:
                    bP11 = b.p(parcel, iT);
                    break;
                case 16:
                    fS = b.s(parcel, iT);
                    break;
                case 17:
                    fS2 = b.s(parcel, iT);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) b.g(parcel, iT, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bP12 = b.p(parcel, iT);
                    break;
                case 20:
                    numW = b.w(parcel, iT);
                    break;
                case 21:
                    strH = b.h(parcel, iT);
                    break;
                case 23:
                    iV2 = b.v(parcel, iT);
                    break;
            }
        }
        b.m(parcel, iC);
        return new GoogleMapOptions(bP, bP2, iV, cameraPosition, bP3, bP4, bP5, bP6, bP7, bP8, bP9, bP10, bP11, fS, fS2, latLngBounds, bP12, numW, strH, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new GoogleMapOptions[i15];
    }
}
