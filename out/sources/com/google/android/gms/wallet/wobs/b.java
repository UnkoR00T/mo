package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import ei.e;
import ei.f;
import ei.g;
import ei.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        ArrayList arrayListC = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC2 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC3 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListL = arrayListC;
        ArrayList arrayListL2 = arrayListC2;
        ArrayList arrayListL3 = arrayListC3;
        ArrayList arrayListC4 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC5 = com.google.android.gms.common.util.b.c();
        ArrayList arrayListC6 = com.google.android.gms.common.util.b.c();
        int iV = 0;
        boolean zO = false;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        String strH8 = null;
        f fVar = null;
        String strH9 = null;
        String strH10 = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            switch (kg.b.n(iT)) {
                case 2:
                    strH = kg.b.h(parcel, iT);
                    break;
                case 3:
                    strH2 = kg.b.h(parcel, iT);
                    break;
                case 4:
                    strH3 = kg.b.h(parcel, iT);
                    break;
                case 5:
                    strH4 = kg.b.h(parcel, iT);
                    break;
                case 6:
                    strH5 = kg.b.h(parcel, iT);
                    break;
                case 7:
                    strH6 = kg.b.h(parcel, iT);
                    break;
                case 8:
                    strH7 = kg.b.h(parcel, iT);
                    break;
                case 9:
                    strH8 = kg.b.h(parcel, iT);
                    break;
                case 10:
                    iV = kg.b.v(parcel, iT);
                    break;
                case 11:
                    arrayListL = kg.b.l(parcel, iT, h.CREATOR);
                    break;
                case 12:
                    fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
                    break;
                case 13:
                    arrayListL2 = kg.b.l(parcel, iT, LatLng.CREATOR);
                    break;
                case 14:
                    strH9 = kg.b.h(parcel, iT);
                    break;
                case 15:
                    strH10 = kg.b.h(parcel, iT);
                    break;
                case 16:
                    arrayListL3 = kg.b.l(parcel, iT, ei.b.CREATOR);
                    break;
                case 17:
                    zO = kg.b.o(parcel, iT);
                    break;
                case 18:
                    arrayListC4 = kg.b.l(parcel, iT, g.CREATOR);
                    break;
                case 19:
                    arrayListC5 = kg.b.l(parcel, iT, e.CREATOR);
                    break;
                case 20:
                    arrayListC6 = kg.b.l(parcel, iT, g.CREATOR);
                    break;
                default:
                    kg.b.B(parcel, iT);
                    break;
            }
        }
        kg.b.m(parcel, iC);
        return new CommonWalletObject(strH, strH2, strH3, strH4, strH5, strH6, strH7, strH8, iV, arrayListL, fVar, arrayListL2, strH9, strH10, arrayListL3, zO, arrayListC4, arrayListC5, arrayListC6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new CommonWalletObject[i15];
    }
}
