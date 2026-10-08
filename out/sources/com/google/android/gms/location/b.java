package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        WorkSource workSource = new WorkSource();
        f0 f0Var = null;
        boolean zO = false;
        int iV = 0;
        int iV2 = 0;
        boolean zO2 = false;
        long jY = -1;
        float fR = 0.0f;
        int iV3 = Integer.MAX_VALUE;
        long jY2 = Long.MAX_VALUE;
        long jY3 = Long.MAX_VALUE;
        long jY4 = 0;
        long jY5 = 600000;
        long jY6 = 3600000;
        int iV4 = 102;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 1:
                    iV4 = kg.b.v(parcel, iT);
                    break;
                case 2:
                    jY6 = kg.b.y(parcel, iT);
                    break;
                case 3:
                    jY5 = kg.b.y(parcel, iT);
                    break;
                case 4:
                case 14:
                default:
                    kg.b.B(parcel, iT);
                    break;
                case 5:
                    jY2 = kg.b.y(parcel, iT);
                    break;
                case 6:
                    iV3 = kg.b.v(parcel, iT);
                    break;
                case 7:
                    fR = kg.b.r(parcel, iT);
                    break;
                case 8:
                    jY4 = kg.b.y(parcel, iT);
                    break;
                case 9:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 10:
                    jY3 = kg.b.y(parcel, iT);
                    break;
                case 11:
                    jY = kg.b.y(parcel, iT);
                    break;
                case 12:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 13:
                    iV2 = kg.b.v(parcel, iT);
                    break;
                case 15:
                    zO2 = kg.b.o(parcel, iT);
                    break;
                case 16:
                    workSource = (WorkSource) kg.b.g(parcel, iT, WorkSource.CREATOR);
                    break;
                case 17:
                    f0Var = (f0) kg.b.g(parcel, iT, f0.CREATOR);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new LocationRequest(iV4, jY6, jY5, jY4, jY2, jY3, iV3, fR, zO, jY, iV, iV2, zO2, workSource, f0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new LocationRequest[i15];
    }
}
